package platforms.ui.mobile.android.AndroidFlowModel.GhostPL;

import static org.junit.Assert.assertEquals;

import java.util.logging.Logger;

import org.junit.Assert;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.PressesKey;
import platforms.ui.mobile.android.AndroidPageObjects.GhostPL.PL_Page_YourInformationScreen;
import platforms.ui.mobile.android.AndroidPageObjects.GhostPL.PL_Page_YourOfferScreen;
import utils.CommonFunctions;
import utils.DriverFactory;

public class GhostProduct_YourOffer_Flow extends DriverFactory {

	static CommonFunctions objCommonFunctions = new CommonFunctions(driver);
	static PL_Page_YourOfferScreen objPL_Page_YourOfferScreen = new PL_Page_YourOfferScreen(driver);

	public static AndroidDriver<MobileElement> andriver;
	// Log4J
	private static Logger log = Logger.getLogger(GhostProduct_YourOffer_Flow.class.getName());

	// Methods -------------------------------------------------------->
	public static void checkTitle(String getTitle) throws InterruptedException {

		Thread.sleep(5000);
		String title = driver.findElementById(PL_Page_YourOfferScreen.androidPLYourOfferTitleV2).getText();
		Assert.assertEquals(title, getTitle);
		log.info(
				"*****************************************Title Checked For YourOfferScreen***********************************************");
	}

	public static void checkHeading(String terms, String interestRate) throws InterruptedException {

		String heading = driver.findElementById(PL_Page_YourOfferScreen.androidPLYourOfferHeadingV2).getText();
		String tMessage = "This is how much we could potentially offer you over " + terms
				+ " months at an interest rate of " + interestRate + ".";
		Assert.assertEquals(tMessage, heading);
		log.info(
				"*****************************************Heading Checked For YourOfferScreen***********************************************");
	}

	public static void clickConfirmButton() throws InterruptedException {

		driver.findElementById(PL_Page_YourOfferScreen.androidPLConfirmButtonV2).click();
		log.info(
				"*****************************************ConfirmButton Clicked For YourOfferScreen***********************************************");
	}

	public static void enterLoanAmountManually(String getLoanAmount) throws InterruptedException {

		driver.findElementById(PL_Page_YourOfferScreen.androidPLEditAmountV2).clear();
		driver.findElementById(PL_Page_YourOfferScreen.androidPLEditAmountV2).sendKeys(getLoanAmount);
		((PressesKey) driver).pressKeyCode(66);
		try {
			driver.hideKeyboard();
		} catch (Exception e) {
		}

		log.info(
				"*****************************************Loan Amount Entered For YourOfferScreen***********************************************");

	}

	public static void clickRecalculateButton() throws InterruptedException {

		driver.findElementById(PL_Page_YourOfferScreen.androidPLRecalculateButtonV2).click();
		log.info(
				"*****************************************RecalculateButton Clicked For YourOfferScreen***********************************************");
	}

	public static void checkDefaultValues(String loan, String sliderValue, String termsValue) {

		String aSliderAmount = driver.findElementById(PL_Page_YourOfferScreen.androidPLPlaceHolderValueV2).getText();
		assertEquals(sliderValue, aSliderAmount);
		String aTerms = driver.findElementById(PL_Page_YourOfferScreen.androidPLTermsClickV2).getText();
		assertEquals(termsValue, aTerms);
		log.info(
				"*****************************************Default Values checked For YourOfferScreen***********************************************");
	}

	public static void clickTermDropDown() throws InterruptedException {

		Thread.sleep(10000);
		System.out.println("kr ab edit");
		driver.findElementById(PL_Page_YourOfferScreen.androidPLTermsClickV2).click();
		log.info(
				"*****************************************TermsDropDown Clicked For YourOfferScreen***********************************************");
	}

	public static void clickXButton() {

		driver.findElementById(PL_Page_YourOfferScreen.androidYourOfferXButtonV2).click();
		log.info(
				"*****************************************XButton Clicked For YourOfferScreen***********************************************");

	}

	public static void checkMinMax(String max, String min) throws InterruptedException {

		Thread.sleep(10000);
		String minValue = driver.findElementById(PL_Page_YourOfferScreen.androidPLMinValueV2).getText();
		String maxValue = driver.findElementById(PL_Page_YourOfferScreen.androidPLMaxValueV2).getText();
		Assert.assertEquals(min, minValue);
		Assert.assertEquals(max, maxValue);
		log.info(
				"*****************************************Min Max Checked For YourOfferScreen***********************************************");
	}

	public static void selectDifferentTerm(String term) throws InterruptedException {

		Thread.sleep(3000);
		driver.findElementByXPath("//android.widget.TextView[@text='" + term + "']").click();
		log.info(
				"*****************************************DifferentTerm Clicked***********************************************");
	}

	public static void checkAllTerms(String getTerms) {

		String[] alltermsarray = getTerms.split(",");
		for (int i = 0; i < alltermsarray.length; i++) {
			driver.findElementByXPath(
					"//*[contains(@class,'android.widget.TextView') and contains(@text,'" + alltermsarray[i] + "')]");
		}
		log.info(
				"*****************************************All Terms Checked***********************************************");
	}

	public static void selectBackOnTermScreen() throws InterruptedException {

		Thread.sleep(3000);
		driver.findElementByClassName(PL_Page_YourOfferScreen.androidTermsScreenBackButton).click();
		log.info(
				"*****************************************Back Button Clicked for Terms Screen***********************************************");
	}

	public static void checkMonthlyRepayment(String getRepaymentAmount) {

		String repaymentAmount = driver.findElementById(PL_Page_YourOfferScreen.androidPLMonthlyRepaymentV2).getText();
		assertEquals(getRepaymentAmount, repaymentAmount);

		log.info(
				"*****************************************Repayment Amount Checked***********************************************");
	}

	public static void checkNewMonthlyRepayment(String getRepaymentAmount) throws InterruptedException {

		Thread.sleep(5000);
		String newrepaymentAmount = driver.findElementById(PL_Page_YourOfferScreen.androidPLMonthlyRepaymentV2)
				.getText();
		assertEquals(getRepaymentAmount, newrepaymentAmount);

		log.info(
				"*****************************************NewRepayment Amount Checked***********************************************");
	}

	public static void scrollYourOfferToBotton() throws InterruptedException {
		Thread.sleep(10000);
//				String buttonaction = strCapAppPackage +":id/btnAction";
//				driver.findElementByAndroidUIAutomator(
//						"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().resourceId(\""+buttonaction+"\").instance(0))");
		andriver = (AndroidDriver<MobileElement>) driver;
		andriver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""
						+ "Confirm" + "\").instance(0))");
		log.info(
				"*****************************************Your Offer Scrolled to Bottom***********************************************");
	}

	public static void checkConsolidatedLoanAmount(String getConsolidatedLoanAmount) {

		String CLloanAmount = driver.findElementById(PL_Page_YourOfferScreen.androidCLLoanAmountV2).getText();
		assertEquals(getConsolidatedLoanAmount, CLloanAmount);
		log.info(
				"*****************************************Consolidated Loan Amount Checked***********************************************");
	}

	public static void checkTotalAmountIncludingConsolidation(String getTotalAmountIncludingConsolidation) {

		String CLloanAmount = driver.findElementById(PL_Page_YourOfferScreen.androidCLTotalAmountIncludingConsolidation)
				.getText();
		assertEquals(getTotalAmountIncludingConsolidation, CLloanAmount);
		log.info(
				"*****************************************Total Amount including consolidation Checked***********************************************");

	}

	public static void checkStaffText(String text1, String text2, String text3) {

		String getText1 = driver.findElementById("pre_approved_offer_monthly_repayments_staff_member_tv").getText();
		String getText2 = driver.findElementById("pre_approved_offer_staff_member").getText();
		String getText3 = driver.findElementById("pre_approved_offer_non_staff_member").getText();

		assertEquals(text1, getText1);
		assertEquals(text2, getText2);
		assertEquals(text3, getText3);
		log.info(
				"*****************************************Your offer staff text***********************************************");

	}

	public static void checkStaffCalculation(String StaffDiscount, String StandardAmount, String DiscountedInterestRate,
			String StandardInterestRate) {

		String getText1 = driver.findElementById("pre_approved_offer_staff_member_value").getText();
		String getText2 = driver.findElementById("pre_approved_offer_non_staff_member_value").getText();
		String getText3 = driver.findElementById("pre_approved_offer_staff_member_intrest_rate_value").getText();
		String getText4 = driver.findElementById("pre_approved_offer_non_staff_member_intrest_rate_value").getText();

		assertEquals(StaffDiscount, getText1);
		assertEquals(StandardAmount, getText2);
		assertEquals(DiscountedInterestRate, getText3);
		assertEquals(StandardInterestRate, getText4);

		log.info(
				"*****************************************Your offer staff text***********************************************");
	}

	public static void clickDebitOrderDate(String getDebitOrderSelection) throws InterruptedException {
		Thread.sleep(3000);
		if (getDebitOrderSelection.equalsIgnoreCase("Salary date")) {
			driver.findElementByXPath("//android.widget.RadioButton[@text=\"" + getDebitOrderSelection + "\"]").click();
		} else {
			driver.findElementByXPath("//android.widget.RadioButton[@text=\"" + getDebitOrderSelection + "\"]").click();
		}
		log.info(
				"*****************************************Debit Order Date Selected***********************************************");
	}
}
