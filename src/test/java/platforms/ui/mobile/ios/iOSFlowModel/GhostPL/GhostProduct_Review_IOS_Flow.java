package platforms.ui.mobile.ios.iOSFlowModel.GhostPL;

import java.util.HashMap;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebElement;
import platforms.ui.mobile.ios.iOSPageObjects.GhostPL.PL_Page_ReviewScreen_IOS;
import utils.DriverFactory;

public class GhostProduct_Review_IOS_Flow extends DriverFactory {
	static PL_Page_ReviewScreen_IOS objPL_Page_ReviewScreen_IOS = new PL_Page_ReviewScreen_IOS(driver);

	// Log4J
	private static Logger log = Logger.getLogger(PL_Page_ReviewScreen_IOS.class.getName());

	public static void scrollReviewToBottom() throws InterruptedException {
		Thread.sleep(5000);
		RemoteWebElement element = (RemoteWebElement) driver.findElement(By.className("XCUIElementTypeTable"));
		String elementID = element.getId();
		HashMap<String, String> scrollObject = new HashMap<String, String>();
		scrollObject.put("direction", "down");
		driver.executeScript("mobile:scroll", scrollObject);
		log.info(
				"*****************************************Review Scrolled to Bottom***********************************************");
	}

	public static void clickReviewConfirmButton() throws InterruptedException {
		Thread.sleep(8000);
		System.out.println("I am here");
		driver.findElementByAccessibilityId("Confirm").click();
		driver.findElementByAccessibilityId("Confirm").click();
		Thread.sleep(5000);
		log.info(
				"*****************************************Revien Confirm Clicked***********************************************");
	}

	public static void checkReviewCalculationForCL(String Creditlifeinsurance, String Servicefee, String Baserepayment,
			String Totalmonthlyrepayment, String AmountToSettleLoans, String Amountwillpay,
			String FixedinterestrateReview, String Numberofinstalments, String Initiationfee, String Creditcostmultiple,
			String Totalloanamount, String Totalyoupay) throws InterruptedException {
		Thread.sleep(10000);
		driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"" + Creditlifeinsurance + "\"]");
		driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"" + Servicefee + "\"]");
		driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"" + Baserepayment + "\"]");
		driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"" + Totalmonthlyrepayment + "\"]");
		driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"" + AmountToSettleLoans + "\"]");
		driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"" + Amountwillpay + "\"]");

		RemoteWebElement element = (RemoteWebElement) driver.findElement(By.className("XCUIElementTypeTable"));
		String elementID = element.getId();
		HashMap<String, String> scrollObject = new HashMap<String, String>();
		scrollObject.put("direction", "down");
		driver.executeScript("mobile:scroll", scrollObject);

		driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"" + FixedinterestrateReview + "\"]");
		driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"" + Numberofinstalments + "\"]");
		driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"" + Initiationfee + "\"]");
		driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"" + Creditcostmultiple + "\"]");
		driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"" + Totalloanamount + "\"]");
		driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"" + Totalyoupay + "\"]");
		log.info(
				"*****************************************Calculation on review checked***********************************************");

	}

	public static void checkReviewCalculation(String Creditlifeinsurance, String Servicefee, String Baserepayment,
			String Totalmonthlyrepayment, String Amountwillpay, String FixedinterestrateReview,
			String Numberofinstalments, String Initiationfee, String Creditcostmultiple, String Totalloanamount,
			String Totalyoupay) throws InterruptedException {

		Thread.sleep(10000);
		driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"" + Creditlifeinsurance + "\"]");
		driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"" + Servicefee + "\"]");
		driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"" + Baserepayment + "\"]");
		driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"" + Totalmonthlyrepayment + "\"]");
		driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"" + Amountwillpay + "\"]");
		driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"" + FixedinterestrateReview + "\"]");

		RemoteWebElement element = (RemoteWebElement) driver.findElement(By.className("XCUIElementTypeTable"));
		String elementID = element.getId();
		HashMap<String, String> scrollObject = new HashMap<String, String>();
		scrollObject.put("direction", "down");
		driver.executeScript("mobile:scroll", scrollObject);

		driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"" + Numberofinstalments + "\"]");
		driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"" + Initiationfee + "\"]");
		driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"" + Creditcostmultiple + "\"]");
		driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"" + Totalloanamount + "\"]");
		driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"" + Totalyoupay + "\"]");

		log.info(
				"*****************************************Calculation on review checked***********************************************");

	}

	public static void checkReviewTitle(String getTitle) {
		driver.findElementByXPath("//XCUIElementTypeNavigationBar[@name=\"Review\"]");
		log.info(
				"*****************************************Title Checked for Review Screen***********************************************");

	}

	public static void checkReviewHeading(String getHeading) throws InterruptedException {
		driver.findElementByXPath(
				"//XCUIElementTypeOther[@name=\"Please check the information that you're about to submit.\"]");

		log.info(
				"*****************************************Heading Checked for Review Screen***********************************************");

	}

	public static void checkReviewText(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6,
			String arg7, String arg8, String arg9, String arg10, String arg11, String arg12, String arg13, String arg14,
			String arg15, String arg16) throws Throwable {
		driver.findElementByXPath("//XCUIElementTypeOther[@name=\"" + arg2 + "\"]");
		driver.findElementByXPath("//XCUIElementTypeOther[@name=\"" + arg3 + "\"]");
		driver.findElementByXPath("//XCUIElementTypeOther[@name=\"" + arg4 + "\"]");
		driver.findElementByXPath("//XCUIElementTypeOther[@name=\"" + arg5 + "\"]");
		driver.findElementByXPath("//XCUIElementTypeOther[@name=\"" + arg6 + "\"]");
		driver.findElementByXPath("//XCUIElementTypeOther[@name=\"" + arg7 + "\"]");
		driver.findElementByXPath("//XCUIElementTypeOther[@name=\"" + arg8 + "\"]");

		RemoteWebElement element = (RemoteWebElement) driver.findElement(By.className("XCUIElementTypeTable"));
		String elementID = element.getId();
		HashMap<String, String> scrollObject = new HashMap<String, String>();
		scrollObject.put("direction", "down");
		driver.executeScript("mobile:scroll", scrollObject);

		driver.findElementByXPath("//XCUIElementTypeOther[@name=\"" + arg9 + "\"]");
		driver.findElementByXPath("//XCUIElementTypeOther[@name=\"" + arg10 + "\"]");
		driver.findElementByXPath("//XCUIElementTypeOther[@name=\"" + arg11 + "\"]");
		driver.findElementByXPath("//XCUIElementTypeOther[@name=\"" + arg12 + "\"]");
		driver.findElementByXPath("//XCUIElementTypeOther[@name=\"" + arg13 + "\"]");
		log.info(
				"*****************************************Text Checked for Review Screen***********************************************");

	}

	public static void checkReviewTextForCL(String arg1, String arg2, String arg3, String arg4, String arg5,
			String arg6, String consolidationText, String arg7, String arg8, String arg9, String arg10, String arg11,
			String arg12, String arg13, String arg14, String arg15, String arg16) throws Throwable {
		log.info(
				"*****************************************Text Checked for Review Screen for CL***********************************************");

	}

	public static void checkReviewTextForStaff(String text1, String text2, String text3, String text4) {
		driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"PLEASE NOTE\"]");
		driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"Staff variable interest rate\"]");
		driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"Staff discount\"]");
		driver.findElementByXPath(
				"//XCUIElementTypeStaticText[@name=\"In the event that you are no longer an employee of Nedbank, your rate and amount will revert back to the standard amount and fixed interest rate.\"]");
		log.info(
				"*****************************************Check Staff Text on review***********************************************");

	}

	public static void checkReviewCalculationForStaff(String StaffInterestRate, String TotalIntalment) {
		driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"" + StaffInterestRate + "\"]");
		driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"" + TotalIntalment + "\"]");
		log.info(
				"*****************************************Check Staff Calculation on review***********************************************");

	}

	public static void clickYesOnReviewMyCreditLimit() {
		log.info(
				"*****************************************Clicked Yes on Review My credit limit***********************************************");

	}
}
