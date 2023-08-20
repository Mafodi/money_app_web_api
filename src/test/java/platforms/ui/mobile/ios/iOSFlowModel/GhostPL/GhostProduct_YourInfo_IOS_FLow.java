package platforms.ui.mobile.ios.iOSFlowModel.GhostPL;

import java.util.HashMap;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import platforms.ui.mobile.ios.iOSPageObjects.GhostPL.PL_Page_YourInformationScreen_IOS;
import utils.DriverFactory;

public class GhostProduct_YourInfo_IOS_FLow extends DriverFactory {
	static PL_Page_YourInformationScreen_IOS objPL_Page_YourInformationScreen_IOS = new PL_Page_YourInformationScreen_IOS(
			driver);

	// Log4J
	private static Logger log = Logger.getLogger(GhostProduct_YourInfo_IOS_FLow.class.getName());

	// Methods -------------------------------------------------------->
	public static void checkYourInformationScreenTitle(String getTitle) throws InterruptedException {
		WebDriverWait aWait = new WebDriverWait(driver, 30);
		aWait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(PL_Page_YourInformationScreen_IOS.iosPLYourInformationTitleV2)));
		Thread.sleep(3000);
		driver.findElementByXPath(PL_Page_YourInformationScreen_IOS.iosPLYourInformationTitleV2);
		log.info(
				"*****************************************Title Checked For YourInformationScreen***********************************************");
	}

	public static void checkYourInformationScreenHeading(String getHeading) {
		WebDriverWait aWait = new WebDriverWait(driver, 30);
		aWait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(PL_Page_YourInformationScreen_IOS.iosPLYourInformationHeadingV2)));
		driver.findElementByXPath(PL_Page_YourInformationScreen_IOS.iosPLYourInformationHeadingV2);
		log.info(
				"*****************************************Heading Checked For YourInformationScreen***********************************************");

	}

	public static void checkYourInformationScreenText(String getText1, String getText2, String getText3,
			String getText4) {
		driver.findElementByAccessibilityId(getText1);
		driver.findElementByAccessibilityId(getText2);
		driver.findElementByAccessibilityId(getText3);
		driver.findElementByAccessibilityId(getText4);

		log.info(
				"*****************************************Text Checked For PL YourInformationScreen***********************************************");
	}

	public static void clickYourInformationScreenConfirm() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElementByAccessibilityId(PL_Page_YourInformationScreen_IOS.iosPLYourInformationConfirmButtonV2)
				.click();
		log.info(
				"*****************************************Confirm Button CLicked For YourInformationScreen***********************************************");
	}

	public static void clickYourInformationScreenBackButton() {
		driver.findElementByAccessibilityId(PL_Page_YourInformationScreen_IOS.iosPLYourInformationBackButtonV2).click();
		log.info(
				"*****************************************Back Button CLicked For YourInformationScreen***********************************************");
	}

	public static void clickYesToggle() {
		driver.findElementByAccessibilityId(
				PL_Page_YourInformationScreen_IOS.iosPLYourInformationInformationIncorrectYesToggleV2).click();
		log.info(
				"****************************************Clicked Yes Toggle On Your Information Screen***********************************************");
	}

	public static void clickNoToggle() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElementByAccessibilityId(
				PL_Page_YourInformationScreen_IOS.iosPLYourInformationInformationIncorrectNoToggleV2).click();
		log.info(
				"****************************************Clicked No Toggle On Your Information Screen***********************************************");
	}

	public static void checkYourInformationScreenIncomeExpensesObligations(String income, String expenses,
			String obligations) throws InterruptedException {
		WebDriverWait aWait = new WebDriverWait(driver, 30);
		aWait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(PL_Page_YourInformationScreen_IOS.iosPLYourInformationTitleV2)));
		Thread.sleep(3000);
		driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"" + income + "\"]");
		driver.findElementByAccessibilityId(expenses);
		driver.findElementByAccessibilityId(obligations);
		log.info(
				"****************************************Checked Income,Expenses,Obligations On Your Information Screen***********************************************");
	}

	public static void checkYourInformationScreenTootlTip1(String tooltip1Text) throws InterruptedException {
		driver.findElementByXPath(PL_Page_YourInformationScreen_IOS.iosPLYourInformationToolTip1V2).click();
		Thread.sleep(2000);
		driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"" + tooltip1Text + "\"]").click();
		log.info(
				"****************************************ToolTip1 Clicked On Your Information Screen***********************************************");
	}

	public static void checkYourInformationScreenTootlTip2(String tooltip2Text) throws InterruptedException {
		driver.findElementByXPath(PL_Page_YourInformationScreen_IOS.iosPLYourInformationToolTip2V2).click();
		driver.findElementByAccessibilityId(tooltip2Text).click();
		log.info(
				"****************************************ToolTip2 Clicked On Your Information Screen***********************************************");
	}

	public static void checkYourInformationScreenTootlTip3(String tooltip3Text) throws InterruptedException {
		driver.findElementByXPath(PL_Page_YourInformationScreen_IOS.iosPLYourInformationToolTip3V2).click();
		driver.findElementByAccessibilityId(tooltip3Text).click();
		log.info(
				"****************************************ToolTip3 Clicked On Your Information Screen***********************************************");
	}

	public static void checkYourInformationScreenInformationIncorrectToolTipText(String wrongInfoToolTipText)
			throws InterruptedException {
		Thread.sleep(2000);
		driver.findElementByXPath(
				"//XCUIElementTypeStaticText[@name=\"If your information is incorrect, we’ll need to end this application. We'll give you the option to tell us which information is incorrect and we'll contact you to help.\"]");

		log.info(
				"****************************************InformationIncorrect Checked On Your Information Screen***********************************************");
	}

	public static void clickYourInformationScreenXButton() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElementByAccessibilityId(PL_Page_YourInformationScreen_IOS.iosPLYourInformationXButton).click();
		log.info(
				"****************************************X Button Clicked On Your Information Screen***********************************************");
	}

	public static void checkYourInformationScreenToggleDefaultState() {

	}

	public static void scrollYourInformationScreenToBottom() throws InterruptedException {
		RemoteWebElement element = (RemoteWebElement) driver.findElement(By.className("XCUIElementTypeTable"));
		String elementID = element.getId();
		HashMap<String, String> scrollObject = new HashMap<String, String>();
		scrollObject.put("direction", "down");
		driver.executeScript("mobile:scroll", scrollObject);
		log.info(
				"****************************************Scrolled Your Information Screen***********************************************");

	}

	public static void checkConsolidationYourInformationScreenText(String getText1, String getText2, String getText3) {
		driver.findElementByAccessibilityId(getText1);
		driver.findElementByAccessibilityId(getText2);
		driver.findElementByAccessibilityId(getText3);
		log.info(
				"*****************************************Text Checked For Consolidation YourInformationScreen***********************************************");
	}

	public static void checkConsolidationYourInformationScreenExtendedText(String getText4, String getText5,
			String getText6, String getText7, String getText8, String getText9) throws InterruptedException {
		WebDriverWait aWait = new WebDriverWait(driver, 30);
		aWait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//XCUIElementTypeStaticText[@name=\"" + getText4 + "\"]")));
		driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"" + getText4 + "\"]");
		driver.findElementByAccessibilityId(getText5);
		driver.findElementByAccessibilityId(getText6);
		driver.findElementByAccessibilityId(getText7);
		driver.findElementByAccessibilityId(getText8);
		driver.findElementByAccessibilityId(getText9);
		log.info(
				"*****************************************ExtendedText Checked For Consoldiation YourInformationScreen***********************************************");
	}

	public static void checkConsolidationToolTip(String getToolTipText) throws InterruptedException {
		driver.findElementByXPath(PL_Page_YourInformationScreen_IOS.iosConsolidationToolTip).click();
		Thread.sleep(2000);
		driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"" + getToolTipText + "\"]").click();
		log.info(
				"****************************************Consoldiation ToolTipChecked for Your Information Screen***********************************************");
	}

	public static void checkConsolidationAccountNumberAmountInstallments(String accountNumber, String outstandingAmount,
			String instalmentsPayable) throws InterruptedException {
		driver.findElementByAccessibilityId(accountNumber);
		driver.findElementByAccessibilityId(outstandingAmount);
		driver.findElementByAccessibilityId(instalmentsPayable);

		log.info(
				"****************************************Checked accountNumber,outstandingAmount,instalmentsPayable On Your Information Screen***********************************************");

	}
}
