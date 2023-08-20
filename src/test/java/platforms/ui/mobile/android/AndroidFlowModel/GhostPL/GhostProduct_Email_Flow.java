package platforms.ui.mobile.android.AndroidFlowModel.GhostPL;

import java.util.logging.Logger;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import platforms.ui.mobile.android.AndroidCommonMethods;
import platforms.ui.mobile.android.AndroidPageObjects.GhostPL.PL_Page_EmailScreen;
import utils.CommonFunctions;
import utils.DriverFactory;

public class GhostProduct_Email_Flow extends DriverFactory {

	static CommonFunctions objCommonFunctions = new CommonFunctions(driver);
	public static AndroidCommonMethods objAndroidCommonMethods = new AndroidCommonMethods();
	static PL_Page_EmailScreen objPL_Page_EmailScreen = new PL_Page_EmailScreen(driver);

	public static AndroidDriver<MobileElement> andriver;
	// Log4J
	private static Logger log = Logger.getLogger(GhostProduct_Email_Flow.class.getName());

	// Methods -------------------------------------------------------->
	public static void checkTitle(String getTitle) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@text=\"" + getTitle + "\"]")));
		String title = driver.findElementByXPath("//android.widget.TextView[@text=\"" + getTitle + "\"]").getText();
		Assert.assertEquals(getTitle, title);
		log.info(
				"*****************************************Title Checked for Email Screen***********************************************");
	}

	public static void checkHeading(String getHeading) {
		objCommonFunctions.waitForElement(PL_Page_EmailScreen.androidEmailScreenHeading, 30);
		String heading = PL_Page_EmailScreen.androidEmailScreenHeading.getText();
		Assert.assertEquals(getHeading, heading);
		log.info(
				"*****************************************Heading Checked for Email Screen***********************************************");

	}

	public static void checkText(String getText1, String getText2) {
		String text1 = PL_Page_EmailScreen.androidEmailScreenText1.getText();
		Assert.assertEquals(getText1, text1);
		String text2 = PL_Page_EmailScreen.androidEmailScreenText2.getText();
		Assert.assertEquals(getText2, text2);
		log.info(
				"*****************************************Text Checked for Email Screen***********************************************");
	}

	public static void enterEmailID(String getEmailID) throws InterruptedException {

		Thread.sleep(10000);
		PL_Page_EmailScreen.andoidEmailScreenEmailID.clear();
		PL_Page_EmailScreen.andoidEmailScreenEmailID.sendKeys(getEmailID);
		try {
			driver.hideKeyboard();
		} catch (Exception e) {
			log.info(e.getMessage());
		}
		Thread.sleep(2000);
		log.info(
				"*****************************************Email ID Entered on Email Screen***********************************************");
	}

	public static void invalidEmailIDErrorMessage(String getErrorMessage) {
		String errorMessage = PL_Page_EmailScreen.androidInvalidEmailErrorMessageV2.getText();
		Assert.assertEquals(getErrorMessage, errorMessage);
		log.info(
				"*****************************************Invalid Email ID Message Checked***********************************************");
	}

	public static void clickConfirm() {
		PL_Page_EmailScreen.androidEmailScreenConfirmButton.click();
		log.info(
				"*****************************************Confirm Button Clicked on Email Screen***********************************************");
	}

	public static void clickXButton() {
		PL_Page_EmailScreen.androidEmailScreenXButton.click();
		log.info(
				"*****************************************X button clicked on Email Screen***********************************************");
	}

	public static void clickBackButton() {
		PL_Page_EmailScreen.androidEmailScreenBackButton.click();
		log.info(
				"*****************************************Back Button Clicked on Email Screen***********************************************");
	}

}
