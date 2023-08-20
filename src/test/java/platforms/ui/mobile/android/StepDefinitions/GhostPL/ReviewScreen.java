package platforms.ui.mobile.android.StepDefinitions.GhostPL;

import cucumber.api.java.en.Then;
import platforms.ui.mobile.android.AndroidFlowModel.GhostPL.GhostProduct_Review_Flow;

public class ReviewScreen {

	@Then("^User scrolls review screen to bottom$")
	public void user_scrolls_review_screen_to_bottom() throws Throwable {
		GhostProduct_Review_Flow.scrollReviewToBottom();
	}

	@Then("^User clicks confirm button on Review screen$")
	public void user_clicks_confirm_button_on_Review_screen() throws Throwable {
		GhostProduct_Review_Flow.clickReviewConfirmButton();
	}

	@Then("^User checks the calculations on review screen\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"$")
	public void user_checks_the_calculations_on_review_screen(String arg1, String arg2, String arg3, String arg4,
			String arg5, String arg6, String arg7, String arg8, String arg9, String arg10, String arg11)
			throws Throwable {
		GhostProduct_Review_Flow.checkReviewCalculation(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10,
				arg11);
	}

	@Then("^User checks the calculations on review screen FOR CL\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"$")
	public void user_checks_the_calculations_on_review_screen_FOR_CL(String arg1, String arg2, String arg3, String arg4,
			String arg5, String arg6, String arg7, String arg8, String arg9, String arg10, String arg11, String arg12)
			throws Throwable {
		GhostProduct_Review_Flow.checkReviewCalculationForCL(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9,
				arg10, arg11, arg12);
	}

	@Then("^User checks the title of ReviewScreen \"([^\"]*)\"$")
	public void user_checks_the_title_of_ReviewScreen(String arg1) throws Throwable {
		GhostProduct_Review_Flow.checkReviewTitle(arg1);
	}

	@Then("^User checks the heading of ReviewScreen \"([^\"]*)\"$")
	public void user_checks_the_heading_of_ReviewScreen(String arg1) throws Throwable {
		GhostProduct_Review_Flow.checkReviewHeading(arg1);
	}

	@Then("^User checks the text on reviewscreen \"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"$")
	public void user_checks_the_text_on_reviewscreen(String arg1, String arg2, String arg3, String arg4, String arg5,
			String arg6, String arg7, String arg8, String arg9, String arg10, String arg11, String arg12, String arg13,
			String arg14, String arg15, String arg16) throws Throwable {
		GhostProduct_Review_Flow.checkReviewText(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11,
				arg12, arg13, arg14, arg15, arg16);
	}

	@Then("^User checks the text on reviewscreen for CL\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"$")
	public void user_checks_the_text_on_reviewscreen_for_CL(String arg1, String arg2, String arg3, String arg4,
			String arg5, String arg6, String arg7, String arg8, String arg9, String arg10, String arg11, String arg12,
			String arg13, String arg14, String arg15, String arg16, String arg17) throws Throwable {
		GhostProduct_Review_Flow.checkReviewTextForCL(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10,
				arg11, arg12, arg13, arg14, arg15, arg16, arg17);
	}

	@Then("^User check the text on review screen for Staff user \"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"$")
	public void user_check_the_text_on_review_screen_for_Staff_user(String arg1, String arg2, String arg3, String arg4)
			throws Throwable {
		GhostProduct_Review_Flow.checkReviewTextForStaff(arg1, arg2, arg3, arg4);
	}

	@Then("^User check the calculation on review screen for staff \"([^\"]*)\"\"([^\"]*)\"$")
	public void user_check_the_calculation_on_review_screen_for_staff(String arg1, String arg2) throws Throwable {
		GhostProduct_Review_Flow.checkReviewCalculationForStaff(arg1, arg2);
	}

	@Then("^User clicks yes on review my credit limit$")
	public void user_clicks_yes_on_review_my_credit_limit() throws Throwable {
		GhostProduct_Review_Flow.clickYesOnReviewMyCreditLimit();
	}
}
