package platforms.ui.mobile.android.StepDefinitions.GhostPL;

import cucumber.api.java.en.Then;
import platforms.ui.mobile.android.AndroidFlowModel.GhostPL.GhostProduct_YourOffer_Flow;

/**
 * 
 * @author Agrim Markan
 *
 */
public class YourOfferScreen {

	@Then("^User clicks confirm button on YourOffer screen$")
	public void user_clicks_confirm_button_on_YourOffer_screen() throws Throwable {
		GhostProduct_YourOffer_Flow.clickConfirmButton();
	}

	// Below This Point are Steps for Calculations
	@Then("^User checks the \"([^\"]*)\" and \"([^\"]*)\" limit$")
	public void user_checks_the_and_limit(String arg1, String arg2) throws Throwable {
		GhostProduct_YourOffer_Flow.checkMinMax(arg1, arg2);
	}

	@Then("^User checks the heading\"([^\"]*)\"\"([^\"]*)\"$")
	public void user_checks_the_heading(String arg1, String arg2) throws Throwable {
		GhostProduct_YourOffer_Flow.checkHeading(arg1, arg2);
	}

	@Then("^User checks default amount value,default slider value,default terms value\"([^\"]*)\" \"([^\"]*)\"\"([^\"]*)\"$")
	public void user_checks_default_amount_value_default_slider_value_default_terms_value(String arg1, String arg2,
			String arg3) throws Throwable {
		GhostProduct_YourOffer_Flow.checkDefaultValues(arg1, arg2, arg3);
	}

	@Then("^User checks defaultmonthlyrepayment \"([^\"]*)\"$")
	public void user_checks_defaultmonthlyrepayment(String arg1) throws Throwable {
		GhostProduct_YourOffer_Flow.checkMonthlyRepayment(arg1);
	}

	@Then("^User enters amount manually \"([^\"]*)\"$")
	public void user_enters_amount_manually(String arg1) throws Throwable {
		GhostProduct_YourOffer_Flow.enterLoanAmountManually(arg1);
	}

	@Then("^User clicks on the terms tab$")
	public void user_clicks_on_the_terms_tab() throws Throwable {
		GhostProduct_YourOffer_Flow.clickTermDropDown();
	}

	@Then("^User clicks on back button on terms screen$")
	public void user_clicks_on_back_button_on_terms_screen() throws Throwable {
		GhostProduct_YourOffer_Flow.selectBackOnTermScreen();
	}

	@Then("^User checks all the terms are displayed\"([^\"]*)\"$")
	public void user_checks_all_the_terms_are_displayed(String arg1) throws Throwable {
		GhostProduct_YourOffer_Flow.checkAllTerms(arg1);
	}

	@Then("^User selects a different \"([^\"]*)\"$")
	public void user_selects_a_different(String arg1) throws Throwable {
		GhostProduct_YourOffer_Flow.selectDifferentTerm(arg1);
	}

	@Then("^User clicks on recaculate monthly payment button$")
	public void user_clicks_on_recaculate_monthly_payment_button() throws Throwable {
		GhostProduct_YourOffer_Flow.clickRecalculateButton();
	}

	@Then("^User checks NewMonthlyRepayment\"([^\"]*)\"$")
	public void user_checks_NewMonthlyRepayment(String arg1) throws Throwable {
		GhostProduct_YourOffer_Flow.checkNewMonthlyRepayment(arg1);
	}

	@Then("^User scrolls your offer screen$")
	public void user_scrolls_your_offer_screen() throws Throwable {
		GhostProduct_YourOffer_Flow.scrollYourOfferToBotton();
	}

	@Then("^User scrolls your offer screen to bottom$")
	public void user_scrolls_your_offer_screen_to_bottom() throws Throwable {
		GhostProduct_YourOffer_Flow.scrollYourOfferToBotton();
	}

	@Then("^User checks ConsolidatedLoanAmount\"([^\"]*)\"$")
	public void user_checks_ConsolidatedLoanAmount(String arg1) throws Throwable {
		GhostProduct_YourOffer_Flow.checkConsolidatedLoanAmount(arg1);
	}

	@Then("^User checks the TotalAmoutnIncludingConsoldiation\"([^\"]*)\"$")
	public void user_checks_the_TotalAmoutnIncludingConsoldiation(String arg1) throws Throwable {
		GhostProduct_YourOffer_Flow.checkTotalAmountIncludingConsolidation(arg1);
	}

	@Then("^User checks the fields for staff user \"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"$")
	public void user_checks_the_fields_for_staff_user(String arg1, String arg2, String arg3, String arg4, String arg5,
			String arg6, String arg7) throws Throwable {
		GhostProduct_YourOffer_Flow.checkStaffText(arg1, arg2, arg3);
		GhostProduct_YourOffer_Flow.checkStaffCalculation(arg4, arg5, arg6, arg7);
	}

//	@Then("^User checks weekly text on YourOffer screen \"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"$")
//	public void user_checks_weekly_text_on_YourOffer_screen(String arg1, String arg2, String arg3, String arg4) throws Throwable {
//		Weekly_Page_YourOfferScreen.checkYourOfferWeeklyText(arg1,arg2,arg3,arg4);
//	}
//	
	@Then("^User selects debit order date \"([^\"]*)\"$")
	public void user_selects_debit_order_date(String arg1) throws Throwable {
		GhostProduct_YourOffer_Flow.clickDebitOrderDate(arg1);
	}

}
