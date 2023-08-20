package platforms.ui.mobile.android.AndroidFlowModel.GhostPL;

import java.util.logging.Logger;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import platforms.ui.mobile.android.AndroidPageObjects.GhostPL.PL_Page_YourInformationScreen;
import utils.CommonFunctions;
import utils.DriverFactory;

public class GhostProduct_YourInfo_Flow extends DriverFactory {

	static CommonFunctions objCommonFunctions = new CommonFunctions(driver);
	static PL_Page_YourInformationScreen objPL_Page_YourInformationScreen = new PL_Page_YourInformationScreen(driver);

	public static AndroidDriver<MobileElement> andriver;
	// Log4J
	private static Logger log = Logger.getLogger(GhostProduct_YourInfo_Flow.class.getName());

	// Methods -------------------------------------------------------->
	public static void checkYourInformationScreenTitle(String getTitle) throws InterruptedException {
		WebDriverWait aWait = new WebDriverWait(driver, 30);
		aWait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(PL_Page_YourInformationScreen.androidPLYourInformationTitleV2)));
		Thread.sleep(3000);
		String title = driver.findElementByXPath(PL_Page_YourInformationScreen.androidPLYourInformationTitleV2)
				.getText();
		Assert.assertEquals(getTitle, title);
		log.info(
				"*****************************************Title Checked For YourInformationScreen***********************************************");
	}

	public static void checkYourInformationScreenHeading(String getHeading) {
		String heading = driver.findElementById(PL_Page_YourInformationScreen.androidPLYourInformationHeadingV2)
				.getText();
		Assert.assertEquals(getHeading, heading);
		log.info(
				"*****************************************Heading Checked For YourInformationScreen***********************************************");

	}

	public static void checkYourInformationScreenText(String getText1, String getText2, String getText3,
			String getText4) {
		driver.findElementByXPath("//android.widget.TextView[@text='" + getText1 + "']");
		driver.findElementByXPath("//android.widget.TextView[@text='" + getText2 + "']");
		driver.findElementByXPath("//android.widget.TextView[@text='" + getText3 + "']");
		driver.findElementByXPath("//android.widget.TextView[@text='" + getText4 + "']");
		log.info(
				"*****************************************Text Checked For PL YourInformationScreen***********************************************");
	}

	public static void clickYourInformationScreenConfirm() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElementById(PL_Page_YourInformationScreen.androidPLYourInformationConfirmButtonV2).click();
		log.info(
				"*****************************************Confirm Button CLicked For YourInformationScreen***********************************************");
	}

	public static void clickYourInformationScreenBackButton() {
		driver.findElementById(PL_Page_YourInformationScreen.androidPLYourInformationBackButtonV2).click();
		log.info(
				"*****************************************Back Button CLicked For YourInformationScreen***********************************************");
	}

	public static void clickYesToggle() {
		driver.findElementById(PL_Page_YourInformationScreen.androidPLYourInformationInformationIncorrectYesToggleV2)
				.click();
		log.info(
				"****************************************Clicked Yes Toggle On Your Information Screen***********************************************");
	}

	public static void clickNoToggle() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElementById(PL_Page_YourInformationScreen.androidPLYourInformationInformationIncorrectNoToggleV2)
				.click();
		log.info(
				"****************************************Clicked No Toggle On Your Information Screen***********************************************");
	}

	public static void checkYourInformationScreenIncomeExpensesObligations(String income, String expenses,
			String obligations) throws InterruptedException {
		WebDriverWait aWait = new WebDriverWait(driver, 30);
		aWait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(PL_Page_YourInformationScreen.androidPLYourInformationTitleV2)));
		Thread.sleep(5000);
		driver.findElementByXPath(
				"//*[contains(@class,'android.widget.TextView') and contains(@text,'" + income + "')]");
		driver.findElementByXPath(
				"//*[contains(@class,'android.widget.TextView') and contains(@text,'" + expenses + "')]");
		driver.findElementByXPath(
				"//*[contains(@class,'android.widget.TextView') and contains(@text,'" + obligations + "')]");
		log.info(
				"****************************************Checked Income,Expenses,Obligations On Your Information Screen***********************************************");
	}

	public static void checkYourInformationScreenTootlTip1(String tooltip1Text) throws InterruptedException {
		driver.findElementByXPath(PL_Page_YourInformationScreen.androidPLYourInformationToolTip1Iconv2).click();
		String infoText1 = driver.findElementById(PL_Page_YourInformationScreen.androidPLYourInformationToolTip1TextV2)
				.getText();
		Assert.assertEquals(tooltip1Text, infoText1);
		driver.findElementById(PL_Page_YourInformationScreen.androidPLYourInformationToolTip1TextV2).click();
		log.info(
				"****************************************ToolTip1 Clicked On Your Information Screen***********************************************");

	}

	public static void checkYourInformationScreenTootlTip2(String tooltip2Text) throws InterruptedException {
		Thread.sleep(2000);
		driver.findElementByXPath(PL_Page_YourInformationScreen.androidPLYourInformationToolTip2Iconv2).click();
		String infoText2 = driver
				.findElementByXPath(
						"//*[contains(@class,'android.widget.TextView') and contains(@text,'" + tooltip2Text + "')]")
				.getText();
		Assert.assertEquals(tooltip2Text, infoText2);
		driver.findElementByXPath(
				"//*[contains(@class,'android.widget.TextView') and contains(@text,'" + tooltip2Text + "')]").click();
		log.info(
				"****************************************ToolTip2 Clicked On Your Information Screen***********************************************");
	}

	public static void checkYourInformationScreenTootlTip3(String tooltip3Text) throws InterruptedException {
		Thread.sleep(2000);
		driver.findElementByXPath(PL_Page_YourInformationScreen.androidPLYourInformationToolTip3Iconv2).click();
		String infoText3 = driver
				.findElementByXPath(
						"//*[contains(@class,'android.widget.TextView') and contains(@text,'" + tooltip3Text + "')]")
				.getText();
		Assert.assertEquals(tooltip3Text, infoText3);
		driver.findElementByXPath(
				"//*[contains(@class,'android.widget.TextView') and contains(@text,'" + tooltip3Text + "')]").click();
		log.info(
				"****************************************ToolTip3 Clicked On Your Information Screen***********************************************");
	}

	public static void checkYourInformationScreenInformationIncorrectToolTipText(String wrongInfoToolTipText)
			throws InterruptedException {
		clickNoToggle();
		String infoToolTipText = driver
				.findElementById(
						PL_Page_YourInformationScreen.androidPLYourInformationInformationIncorrectToolTipTextV2)
				.getText();
		Assert.assertEquals(wrongInfoToolTipText, infoToolTipText);
		log.info(
				"****************************************InformationIncorrect Checked On Your Information Screen***********************************************");
	}

	public static void clickYourInformationScreenXButton() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElementById(PL_Page_YourInformationScreen.androidPLYourInformationXButton).click();
		log.info(
				"****************************************X Button Clicked On Your Information Screen***********************************************");
	}

	public static void checkYourInformationScreenToggleDefaultState() {
	}

	public static void scrollYourInformationScreenToBottom() throws InterruptedException {
		Thread.sleep(15000);

		andriver = (AndroidDriver<MobileElement>) driver;
		andriver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""
						+ "Confirm" + "\").instance(0))");
		log.info(
				"****************************************Scrolled Your Information Screen***********************************************");

	}

	public static void checkConsolidationYourInformationScreenText(String getText1, String getText2, String getText3) {
		driver.findElementByXPath("//android.widget.TextView[@text='" + getText1 + "']");
		driver.findElementByXPath("//android.widget.TextView[@text='" + getText2 + "']");
		driver.findElementByXPath("//android.widget.TextView[@text='" + getText3 + "']");
		log.info(
				"*****************************************Text Checked For Consolidation YourInformationScreen***********************************************");
	}

	public static void checkConsolidationYourInformationScreenExtendedText(String getText4, String getText5,
			String getText6, String getText7, String getText8, String getText9) throws InterruptedException {

		driver.findElementByXPath("//android.widget.TextView[@text='" + getText4 + "']");
		driver.findElementByXPath("//android.widget.TextView[@text='" + getText5 + "']");
		driver.findElementByXPath("//android.widget.TextView[@text='" + getText6 + "']");
		driver.findElementByXPath("//android.widget.TextView[@text='" + getText7 + "']");
		driver.findElementByXPath("//android.widget.TextView[@text='" + getText8 + "']");
		driver.findElementByXPath("//android.widget.TextView[@text='" + getText9 + "']");
		log.info(
				"*****************************************ExtendedText Checked For Consoldiation YourInformationScreen***********************************************");
	}

	public static void checkConsolidationToolTip(String getToolTipText) throws InterruptedException {
		driver.findElementByClassName(PL_Page_YourInformationScreen.androidConsolidationToolTip).click();
		String infoText1 = driver
				.findElementByXPath(
						"//*[contains(@class,'android.widget.TextView') and contains(@text,'" + getToolTipText + "')]")
				.getText();
		Assert.assertEquals(getToolTipText, infoText1);
		driver.findElementByXPath(
				"//*[contains(@class,'android.widget.TextView') and contains(@text,'" + getToolTipText + "')]").click();
		log.info(
				"****************************************Consoldiation ToolTipChecked for Your Information Screen***********************************************");
	}

	public static void checkConsolidationAccountNumberAmountInstallments(String accountNumber, String outstandingAmount,
			String instalmentsPayable) throws InterruptedException {
		Thread.sleep(2000);
		driver.findElementByXPath(
				"//*[contains(@class,'android.widget.TextView') and contains(@text,'" + accountNumber + "')]");
		driver.findElementByXPath(
				"//*[contains(@class,'android.widget.TextView') and contains(@text,'" + outstandingAmount + "')]");
		driver.findElementByXPath(
				"//*[contains(@class,'android.widget.TextView') and contains(@text,'" + instalmentsPayable + "')]");
		log.info(
				"****************************************Checked accountNumber,outstandingAmount,instalmentsPayable On Your Information Screen***********************************************");

	}


}
