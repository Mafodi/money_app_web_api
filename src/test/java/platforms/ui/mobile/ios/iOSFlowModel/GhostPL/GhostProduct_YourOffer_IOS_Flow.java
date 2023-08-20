package platforms.ui.mobile.ios.iOSFlowModel.GhostPL;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import platforms.ui.mobile.ios.iOSPageObjects.GhostPL.PL_Page_YourOfferScreen_IOS;
import utils.DriverFactory;

public class GhostProduct_YourOffer_IOS_Flow extends DriverFactory {

	static PL_Page_YourOfferScreen_IOS objPL_Page_YourOfferScreen_IOS = new PL_Page_YourOfferScreen_IOS(driver);
	// Log4J
	private static Logger log = Logger.getLogger(GhostProduct_YourOffer_IOS_Flow.class.getName());

	// Methods -------------------------------------------------------->
	public static void checkTitle(String getTitle) throws InterruptedException {
		Thread.sleep(5000);
		WebDriverWait aWait = new WebDriverWait(driver, 30);
		aWait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(PL_Page_YourOfferScreen_IOS.iosPLYourOfferTitleV2)));
		driver.findElementByXPath(PL_Page_YourOfferScreen_IOS.iosPLYourOfferTitleV2);
		log.info(
				"*****************************************Title Checked For YourOfferScreen***********************************************");
	}

	public static void checkHeading(String terms, String interestRate) throws InterruptedException {
		Thread.sleep(3000);
		String iMessage = "This is how much we could potentially offer you over " + terms
				+ " months at an interest rate of " + interestRate + ".";
		driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"" + iMessage + "\"]");
		log.info(
				"*****************************************Heading Checked For YourOfferScreen***********************************************");
	}

	public static void clickConfirmButton() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElementByAccessibilityId(PL_Page_YourOfferScreen_IOS.iosPLConfirmButtonV2).click();

		log.info(
				"*****************************************ConfirmButton Clicked For YourOfferScreen***********************************************");
	}

	public static void enterLoanAmountManually(String getLoanAmount) throws InterruptedException {
		log.info(
				"*****************************************Loan Amount Entered For YourOfferScreen***********************************************");

	}

	public static void clickRecalculateButton() throws InterruptedException {
		Thread.sleep(3000);
//		boolean bool = isElementPresent(By.xpath(iosPLRecalculateButtonV2));
//		if (bool == true) {
//			driver.findElementByXPath(iosPLRecalculateButtonV2).click();
//			;
//		}
		log.info(
				"*****************************************RecalculateButton Clicked For YourOfferScreen***********************************************");
	}

	public static void checkDefaultValues(String loan, String sliderValue, String termsValue) {
		driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"" + sliderValue + "\"]");
		driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"" + termsValue + "\"]");
		log.info(
				"*****************************************Default Values checked For YourOfferScreen***********************************************");
	}

	public static void clickTermDropDown() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"72\"]").click();
		log.info(
				"*****************************************TermsDropDown Clicked For YourOfferScreen***********************************************");
	}

	public static void clickXButton() {
		driver.findElementByXPath(PL_Page_YourOfferScreen_IOS.iosYourOfferXButtonV2).click();
		log.info(
				"*****************************************XButton Clicked For YourOfferScreen***********************************************");

	}

	public static void checkMinMax(String max, String min) throws InterruptedException {
		Thread.sleep(3000);
		driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"" + min + "\"]");
		driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"" + max + "\"]");
		log.info(
				"*****************************************Min Max Checked For YourOfferScreen***********************************************");
	}

	public static void selectDifferentTerm(String term) throws InterruptedException {
		Thread.sleep(3000);
		driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"" + term + "\"]").click();
		log.info(
				"*****************************************DifferentTerm Clicked***********************************************");
	}

	public static void checkAllTerms(String getTerms) {
		String[] alltermsarray = getTerms.split(",");
		for (int i = 0; i < alltermsarray.length; i++) {
			driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"" + alltermsarray[i] + "\"]");
		}
		log.info(
				"*****************************************All Terms Checked***********************************************");
	}

	public static void selectBackOnTermScreen() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElementByXPath(PL_Page_YourOfferScreen_IOS.iosTermsScreenBackButton).click();
		log.info(
				"*****************************************Back Button Clicked for Terms Screen***********************************************");
	}

	public static void checkMonthlyRepayment(String getRepaymentAmount) {
		String repaymentAmount = driver.findElementByXPath(PL_Page_YourOfferScreen_IOS.iosPLMonthlyRepaymentV2)
				.getText();
		assertEquals(getRepaymentAmount, repaymentAmount);
		log.info(
				"*****************************************Repayment Amount Checked***********************************************");
	}

	public static void checkNewMonthlyRepayment(String getRepaymentAmount) throws InterruptedException {
		String newrepaymentAmount = driver.findElementByXPath(PL_Page_YourOfferScreen_IOS.iosPLMonthlyRepaymentV2)
				.getText();
		assertEquals(getRepaymentAmount, newrepaymentAmount);
		log.info(
				"*****************************************NewRepayment Amount Checked***********************************************");
	}

	public static void scrollYourOfferToBotton() throws InterruptedException {
		Thread.sleep(10000);
		RemoteWebElement element = (RemoteWebElement) driver.findElement(By.className("XCUIElementTypeOther"));
		String elementID = element.getId();
		HashMap<String, String> scrollObject = new HashMap<String, String>();
		scrollObject.put("direction", "down");
		driver.executeScript("mobile:scroll", scrollObject);
		log.info(
				"*****************************************Your Offer Scrolled to Bottom***********************************************");
	}

	public static void checkConsolidatedLoanAmount(String getConsolidatedLoanAmount) {
		driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"" + getConsolidatedLoanAmount + "\"]");
		log.info(
				"*****************************************Consolidated Loan Amount Checked***********************************************");
	}

	public static void checkTotalAmountIncludingConsolidation(String getTotalAmountIncludingConsolidation) {
		driver.findElementByXPath(
				"//XCUIElementTypeStaticText[@name=\"" + getTotalAmountIncludingConsolidation + "\"]");
		log.info(
				"*****************************************Total Amount including consolidation Checked***********************************************");

	}

	public static void checkStaffText(String text1, String text2, String text3) {
		driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"YOUR MONTHLY REPAYMENT WILL BE\"]");
		driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"Staff discount\"]");
		driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"Standard amount\"]");
		log.info(
				"*****************************************Your offer staff text***********************************************");
	}

	public static void checkStaffCalculation(String StaffDiscount, String StandardAmount, String DiscountedInterestRate,
			String StandardInterestRate) {
		driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"" + StaffDiscount + "\"]");
		driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"" + StandardAmount + "\"]");
		driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"" + DiscountedInterestRate + "\"]");
		driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"" + StandardInterestRate + "\"]");
		log.info(
				"*****************************************Your offer staff text***********************************************");
	}

	// Methods -------------------------------------------------------->

	public static void clickDebitOrderDate(String getDebitOrderSelection) throws InterruptedException {
		Thread.sleep(3000);
		if (getDebitOrderSelection.equalsIgnoreCase("SD")) {
			driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"Salary date\"]").click();
		} else {
			driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"30 days after taking this loan\"]").click();
		}
		log.info(

				"*****************************************Debit Order Date Selected***********************************************");

	}
	
	public static void clickYesOnReviewMyCreditLimit() throws Throwable {
		Thread.sleep(3000);
		driver.findElementByXPath("//XCUIElementTypeApplication[@name=\"Money\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[8]/XCUIElementTypeButton[1]\n" + 
				"").click();
		log.info(

				"*****************************************Yes selected for credit limit review***********************************************");

	}
}
