package platforms.ui.mobile.android;

import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import utils.CommonFunctions;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/feature/ui/mobile/android",
        plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/MobileReports/android.html"},
        //tags = {"@FND"},
        tags = {"@RecurringWeeklyPaymentCurrentAcc"},
        glue = {"platforms.ui.mobile.android.StepDefinitions"},
        		
        dryRun = false,
        format = {"pretty"},
         monochrome = true)

public class AndroidTestRunner{

    static AppiumDriverLocalService service;
    static String service_url;


    @BeforeClass
    public static void appiumServer(){
       service = AppiumDriverLocalService.buildDefaultService();
       service.start();
    }



    @AfterClass
    public static void writeExtentReport() throws IOException {
        service.stop();
        Reporter.loadXMLConfig(new File(System.getProperty("user.dir")+ "/extent-android-config.xml"));
        copyLatestExtentReport();
        Reporter.loadXMLConfig("extent-android-config.xml");
    }

    /***EXTENT REPORT****************************************************************/

    private static void copyFileUsingStream(File source, File dest) throws IOException {
        InputStream is = null;
        OutputStream os = null;

        try {
            is = new FileInputStream(source);
            os = new FileOutputStream(dest);
            byte[] buffer = new byte[1024];
            int length;

            while((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
            }
        } finally {
            is.close();
            os.close();
        }
    }

    public static void copyLatestExtentReport() throws IOException {
        String timestamp = new SimpleDateFormat("yyyy:MM:dd_HH:mm:ss").format(Calendar.getInstance().getTime()).replaceAll(":", "-");
        File source = new File(System.getProperty("user.dir") + "/target/cucumber-reports/MobileReports/android.html");
        File dest = new File(System.getProperty("user.dir") + "/target/cucumber-reports/MobileReports/android_"+ timestamp + ".html");
        copyFileUsingStream(source, dest);
    }

}
