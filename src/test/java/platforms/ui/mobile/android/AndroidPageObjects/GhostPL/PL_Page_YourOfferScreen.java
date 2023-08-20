package platforms.ui.mobile.android.AndroidPageObjects.GhostPL;

import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import utils.DriverFactory;

/**
 * 
 * @author Agrim Markan
 *
 */
public class PL_Page_YourOfferScreen extends DriverFactory {
	public PL_Page_YourOfferScreen(AppiumDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	// Android Locators --------------------------------------------->
	public static String androidPLYourOfferTitleV2 = "//android.widget.TextView[@index='1']";
	public static String androidPLYourOfferHeadingV2 = "pre_approved_offer_title_description";
	public static String androidPLEditAmountV2 = "pre_approved_offer_loan_amount_value_tv";
	public static String androidCLLoanAmountV2 = "pre_approved_offer_consolidation_amount_tv";
	public static String androidCLTotalAmountIncludingConsolidation = "pre_approved_offer_total_amount_tv";
	public static String androidPLMinValueV2 = "pre_approved_offer_minimum_amount_tv";
	public static String androidPLMaxValueV2 = "pre_approved_offer_maximum_amount_tv";
	public static String androidPLPlaceHolderValueV2 = "pre_approved_offer_loan_amount_current_placeholder_tv";
	public static String androidPLPlaceHolderValueChangedV2 = "pre_approved_offer_loan_amount_current_tv";
	public static String androidPLTermsClickV2 = "txvPickerText";
	public static String androidPLRecalculateButtonV2 = "btnAction";
	public static String androidPLConfirmButtonV2 = "btnAction";
	public static String androidPLMonthlyRepaymentV2 = "pre_approved_offer_monthly_repayments_value_tv";
	public static String androidPLOutOfLimitErrorV2 = "loan_offer_loan_amount_invalid_tv";
	public static String androidPLYourOfferBackButtonV2 = "android.widget.ImageButton";
	public static String androidYourOfferXButtonV2 = "menu_item_close";
	public static String androidYourOfferText1 = "loan_offer_loan_amount_tv";
	public static String androidYourOfferText2 = "loan_offer_adjust_loan_tv";
	public static String androidYourOfferText3 = "txvLabel";
	public static String androidYourOfferText4 = "loan_offer_monthly_repayments_tv";
	public static String androidTermScreenTitle = "//android.widget.TextView[@index='1']";
	public static String androidTermsScreenBackButton = "android.widget.ImageButton";

}
