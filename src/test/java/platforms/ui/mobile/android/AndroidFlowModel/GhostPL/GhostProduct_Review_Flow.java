package platforms.ui.mobile.android.AndroidFlowModel.GhostPL;

import static org.junit.Assert.assertEquals;

import java.util.logging.Logger;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import platforms.ui.mobile.android.AndroidPageObjects.GhostPL.PL_Page_ReviewScreen;
import utils.CommonFunctions;
import utils.DriverFactory;

public class GhostProduct_Review_Flow extends DriverFactory {

	static CommonFunctions objCommonFunctions = new CommonFunctions(driver);
	static PL_Page_ReviewScreen objPL_Page_ReviewScreen = new PL_Page_ReviewScreen(driver);

	public static AndroidDriver<MobileElement> andriver;
	// Log4J
	private static Logger log = Logger.getLogger(GhostProduct_Review_Flow.class.getName());

	public static void scrollReviewToBottom() throws InterruptedException {
		Thread.sleep(10000);
		andriver = (AndroidDriver<MobileElement>) driver;
		andriver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""
						+ "Confirm" + "\").instance(0))");

		log.info(
				"*****************************************Review Scrolled to Bottom***********************************************");
	}

	public static void clickReviewConfirmButton() throws InterruptedException {
		driver.findElementById("btnAction").click();
		log.info(
				"*****************************************Review Confirm Clicked***********************************************");
	}

	public static void checkReviewCalculationForCL(String Creditlifeinsurance, String Servicefee, String Baserepayment,
			String Totalmonthlyrepayment, String AmountToSettleLoans, String Amountwillpay,
			String FixedinterestrateReview, String Numberofinstalments, String Initiationfee, String Creditcostmultiple,
			String Totalloanamount, String Totalyoupay) throws InterruptedException {

		Thread.sleep(5000);
		driver.findElementByXPath(
				"//*[contains(@class,'android.widget.TextView') and contains(@text,'" + Creditlifeinsurance + "')]");
		driver.findElementByXPath(
				"//*[contains(@class,'android.widget.TextView') and contains(@text,'" + Servicefee + "')]");
		driver.findElementByXPath(
				"//*[contains(@class,'android.widget.TextView') and contains(@text,'" + Baserepayment + "')]");
		driver.findElementByXPath(
				"//*[contains(@class,'android.widget.TextView') and contains(@text,'" + Totalmonthlyrepayment + "')]");
		driver.findElementByXPath(
				"//*[contains(@class,'android.widget.TextView') and contains(@text,'" + AmountToSettleLoans + "')]");

		andriver = (AndroidDriver<MobileElement>) driver;
		andriver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Fixed interest rate\").instance(0))");

		driver.findElementByXPath(
				"//*[contains(@class,'android.widget.TextView') and contains(@text,'" + Amountwillpay + "')]");
		driver.findElementByXPath("//*[contains(@class,'android.widget.TextView') and contains(@text,'"
				+ FixedinterestrateReview + "')]");

		andriver = (AndroidDriver<MobileElement>) driver;
		andriver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Total you'll pay back\").instance(0))");

		driver.findElementByXPath(
				"//*[contains(@class,'android.widget.TextView') and contains(@text,'" + Numberofinstalments + "')]");
		driver.findElementByXPath(
				"//*[contains(@class,'android.widget.TextView') and contains(@text,'" + Initiationfee + "')]");
		driver.findElementByXPath(
				"//*[contains(@class,'android.widget.TextView') and contains(@text,'" + Creditcostmultiple + "')]");
		driver.findElementByXPath(
				"//*[contains(@class,'android.widget.TextView') and contains(@text,'" + Totalloanamount + "')]");
		driver.findElementByXPath(
				"//*[contains(@class,'android.widget.TextView') and contains(@text,'" + Totalyoupay + "')]");
		log.info(
				"*****************************************Calculation on review checked***********************************************");

	}

	public static void checkReviewCalculation(String Creditlifeinsurance, String Servicefee, String Baserepayment,
			String Totalmonthlyrepayment, String Amountwillpay, String FixedinterestrateReview,
			String Numberofinstalments, String Initiationfee, String Creditcostmultiple, String Totalloanamount,
			String Totalyoupay) throws InterruptedException {
		Thread.sleep(5000);
		driver.findElementByXPath(
				"//*[contains(@class,'android.widget.TextView') and contains(@text,'" + Amountwillpay + "')]");
		driver.findElementByXPath(
				"//*[contains(@class,'android.widget.TextView') and contains(@text,'" + Totalloanamount + "')]");
		driver.findElementByXPath(
				"//*[contains(@class,'android.widget.TextView') and contains(@text,'" + Totalyoupay + "')]");
		driver.findElementByXPath("//*[contains(@class,'android.widget.TextView') and contains(@text,'"
				+ FixedinterestrateReview + "')]");
		driver.findElementByXPath(
				"//*[contains(@class,'android.widget.TextView') and contains(@text,'" + Numberofinstalments + "')]");

		andriver = (AndroidDriver<MobileElement>) driver;
		andriver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"TOTAL MONTHLY REPAYMENT\").instance(0))");

		driver.findElementByXPath(
				"//*[contains(@class,'android.widget.TextView') and contains(@text,'" + Initiationfee + "')]");
		driver.findElementByXPath(
				"//*[contains(@class,'android.widget.TextView') and contains(@text,'" + Creditcostmultiple + "')]");

		andriver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"CREDIT LIFE INSURANCE\").instance(0))");

		driver.findElementByXPath(
				"//*[contains(@class,'android.widget.TextView') and contains(@text,'" + Creditlifeinsurance + "')]");
		driver.findElementByXPath(
				"//*[contains(@class,'android.widget.TextView') and contains(@text,'" + Servicefee + "')]");
		driver.findElementByXPath(
				"//*[contains(@class,'android.widget.TextView') and contains(@text,'" + Baserepayment + "')]");
		driver.findElementByXPath(
				"//*[contains(@class,'android.widget.TextView') and contains(@text,'" + Totalmonthlyrepayment + "')]");
		log.info(
				"*****************************************Calculation on review checked***********************************************");

	}

	public static void checkReviewTitle(String getTitle) {
		driver.findElementByXPath(
				"//*[contains(@class,'android.widget.TextView') and contains(@text,'" + getTitle + "')]");
		log.info(
				"*****************************************Title Checked for Review Screen***********************************************");

	}

	public static void checkReviewHeading(String getHeading) throws InterruptedException {
		Thread.sleep(3000);
		driver.findElementByXPath(
				"//*[contains(@class,'android.widget.TextView') and contains(@text,\"" + getHeading + "\")]");
		log.info(
				"*****************************************Heading Checked for Review Screen***********************************************");

	}

	public static void checkReviewText(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6,
			String arg7, String arg8, String arg9, String arg10, String arg11, String arg12, String arg13, String arg14,
			String arg15, String arg16) throws Throwable {

		driver.findElementByXPath(
				"//*[contains(@class,'android.widget.TextView') and contains(@text,\"" + arg1 + "\")]");
		driver.findElementByXPath(
				"//*[contains(@class,'android.widget.TextView') and contains(@text,\"" + arg2 + "\")]");
		driver.findElementByXPath(
				"//*[contains(@class,'android.widget.TextView') and contains(@text,\"" + arg3 + "\")]");
		driver.findElementByXPath(
				"//*[contains(@class,'android.widget.TextView') and contains(@text,\"" + arg4 + "\")]");
		driver.findElementByXPath(
				"//*[contains(@class,'android.widget.TextView') and contains(@text,\"" + arg5 + "\")]");
		driver.findElementByXPath(
				"//*[contains(@class,'android.widget.TextView') and contains(@text,\"" + arg6 + "\")]");
		driver.findElementByXPath(
				"//*[contains(@class,'android.widget.TextView') and contains(@text,\"" + arg7 + "\")]");

		andriver = (AndroidDriver<MobileElement>) driver;
		andriver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Fixed interest rate\").instance(0))");

		driver.findElementByXPath(
				"//*[contains(@class,'android.widget.TextView') and contains(@text,\"" + arg8 + "\")]");

		andriver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Total you'll pay back\").instance(0))");

		driver.findElementByXPath(
				"//*[contains(@class,'android.widget.TextView') and contains(@text,\"" + arg9 + "\")]");
		driver.findElementByXPath(
				"//*[contains(@class,'android.widget.TextView') and contains(@text,\"" + arg10 + "\")]");
		driver.findElementByXPath(
				"//*[contains(@class,'android.widget.TextView') and contains(@text,\"" + arg11 + "\")]");
		driver.findElementByXPath(
				"//*[contains(@class,'android.widget.TextView') and contains(@text,\"" + arg12 + "\")]");
		driver.findElementByXPath(
				"//*[contains(@class,'android.widget.TextView') and contains(@text,\"" + arg13 + "\")]");

		andriver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""
						+ "Confirm" + "\").instance(0))");

		driver.findElementByXPath(
				"//*[contains(@class,'android.widget.TextView') and contains(@text,\"" + arg14 + "\")]");
		driver.findElementByXPath(
				"//*[contains(@class,'android.widget.TextView') and contains(@text,\"If you take out a personal loan, you need credit life insurance to ensure that your loan is covered in the event of your death, disablement or retrenchment. Please call 0860 263 543 for more information.\n"
						+ "\n"
						+ "We’ve included Nedbank credit insurance in our offer. The cover is subject to exclusions, which we’ll email to you.\")]");
		driver.findElementByXPath(
				"//*[contains(@class,'android.widget.TextView') and contains(@text,\"" + arg16 + "\")]");
		log.info(
				"*****************************************Text Checked for Review Screen***********************************************");

	}

	public static void checkReviewTextForCL(String arg1, String arg2, String arg3, String arg4, String arg5,
			String arg6, String consolidationText, String arg7, String arg8, String arg9, String arg10, String arg11,
			String arg12, String arg13, String arg14, String arg15, String arg16) throws Throwable {
		driver.findElementByXPath(
				"//*[contains(@class,'android.widget.TextView') and contains(@text,\"" + arg1 + "\")]");
		driver.findElementByXPath(
				"//*[contains(@class,'android.widget.TextView') and contains(@text,\"" + arg2 + "\")]");
		driver.findElementByXPath(
				"//*[contains(@class,'android.widget.TextView') and contains(@text,\"" + arg3 + "\")]");
		driver.findElementByXPath(
				"//*[contains(@class,'android.widget.TextView') and contains(@text,\"" + arg4 + "\")]");
		driver.findElementByXPath(
				"//*[contains(@class,'android.widget.TextView') and contains(@text,\"" + arg5 + "\")]");
		driver.findElementByXPath(
				"//*[contains(@class,'android.widget.TextView') and contains(@text,\"" + arg6 + "\")]");
		driver.findElementByXPath(
				"//*[contains(@class,'android.widget.TextView') and contains(@text,\"" + consolidationText + "\")]");

		andriver = (AndroidDriver<MobileElement>) driver;
		andriver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Fixed interest rate\").instance(0))");

		driver.findElementByXPath(
				"//*[contains(@class,'android.widget.TextView') and contains(@text,\"" + arg7 + "\")]");
		driver.findElementByXPath(
				"//*[contains(@class,'android.widget.TextView') and contains(@text,\"" + arg8 + "\")]");

		andriver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Total you'll pay back\").instance(0))");

		driver.findElementByXPath(
				"//*[contains(@class,'android.widget.TextView') and contains(@text,\"" + arg9 + "\")]");
		driver.findElementByXPath(
				"//*[contains(@class,'android.widget.TextView') and contains(@text,\"" + arg10 + "\")]");
		driver.findElementByXPath(
				"//*[contains(@class,'android.widget.TextView') and contains(@text,\"" + arg11 + "\")]");
		driver.findElementByXPath(
				"//*[contains(@class,'android.widget.TextView') and contains(@text,\"" + arg12 + "\")]");
		driver.findElementByXPath(
				"//*[contains(@class,'android.widget.TextView') and contains(@text,\"" + arg13 + "\")]");

		andriver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""
						+ "Confirm" + "\").instance(0))");

		driver.findElementByXPath(
				"//*[contains(@class,'android.widget.TextView') and contains(@text,\"" + arg14 + "\")]");
		driver.findElementByXPath(
				"//*[contains(@class,'android.widget.TextView') and contains(@text,\"If you take out a personal loan, you need credit life insurance to ensure that your loan is covered in the event of your death, disablement or retrenchment. Please call 0860 263 543 for more information.\n"
						+ "\n"
						+ "We’ve included Nedbank credit insurance in our offer. The cover is subject to exclusions, which we’ll email to you.\")]");
		driver.findElementByXPath(
				"//*[contains(@class,'android.widget.TextView') and contains(@text,\"" + arg16 + "\")]");

		log.info(
				"*****************************************Text Checked for Review Screen for CL***********************************************");

	}

	public static void checkReviewTextForStaff(String text1, String text2, String text3, String text4) {

		String gettext1 = driver.findElementById("preapproved_offers_view_divider_tv").getText();
		String gettext2 = driver.findElementById("nbsliding_tooltip_label").getText();
		String gettext3 = driver.findElementById("preapproved_offer_review_screen_staff_discount").getText();
		String gettext4 = driver.findElementById("preapproved_offer_review_screen_staff_note").getText();

		assertEquals(text1, gettext1);
		assertEquals(text3, gettext3);
		assertEquals(text4, gettext4);

		log.info(
				"*****************************************Check Staff Text on review***********************************************");

	}

	public static void checkReviewCalculationForStaff(String StaffInterestRate, String TotalIntalment) {
		String gettext1 = driver.findElementById("nbsliding_tooltip_value").getText();
		String gettext2 = driver.findElementById("preapproved_offer_review_screen_staff_discount_value").getText();
		assertEquals(gettext2, TotalIntalment);
		log.info(
				"*****************************************Check Staff Calculation on review***********************************************");

	}

	public static void clickYesOnReviewMyCreditLimit() {
		driver.findElementById("pre_approved_offer_cards_positive_button").click();
		log.info(
				"*****************************************Clicked Yes on Review My credit limit***********************************************");

	}
}
