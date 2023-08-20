package platforms.ui.mobile.android.StepDefinitions;
import com.cucumber.listener.Reporter;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.appium.java_client.android.AndroidDriver;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import platforms.Report.TestExecutionReportWriter;
import utils.DriverFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class AndroidMasterHooks extends DriverFactory {
	private static Logger log = Logger.getLogger(AndroidMasterHooks.class);

	@Before("@FND_Payments")
	public void setup() {
		try {
			Reporter.assignAuthor("Foundation - AndroidMoneyApp");
			driver = getAndroidDriver();
			System.out.println("Before features  run " + driver);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@After("@FND_Payments")
	public void afterScenario(Scenario scenario) throws IOException {
		if (scenario.isFailed()) {
			String screenshotName = scenario.getName().replaceAll(" ", "_");
			String timestamp = new SimpleDateFormat("yyyy:MM:dd_HH:mm:ss").format(Calendar.getInstance().getTime()).replaceAll(":", "-");
			String encodedBase64 = null;
			FileInputStream fileInputStream = null;
			TakesScreenshot screenshot = driver;
			File source = screenshot.getScreenshotAs(OutputType.FILE);
			String destination =System.getProperty("user.dir") +"/target/cucumber-reports/MobileReports/Screenshots/" + screenshotName + timestamp + ".png";
			File finalDestination = new File(destination);
			FileUtils.copyFile(source, finalDestination);

			fileInputStream =new FileInputStream(finalDestination);
			byte[] bytes =new byte[(int)finalDestination.length()];
			fileInputStream.read(bytes);
			encodedBase64 = new String(Base64.encodeBase64(bytes));
			String img = "data:image/png;base64,"+encodedBase64;

			Reporter.addScreenCaptureFromPath(img.toString());
		}
		getAndroidDriver().quit();
		driver = null;
	}

	@After(order = 2)
	public void afterScen(Scenario pScenario) throws Exception
	{
		String[] args = new String[5];
		args[0] = pScenario.getName();
		args[1] = pScenario.getStatus();
		args[2] = "APPIUM";
		args[3] = pScenario.getSourceTagNames().toString();
		try {
			args[4] = pScenario.getId().split(";")[0].toString();
		}
		catch(Exception e)
		{}
		args[5] = "ANDROID";

		try {
			TestExecutionReportWriter.ElasticSend(args);
		}
		catch(Exception e)
		{}
	}

}
