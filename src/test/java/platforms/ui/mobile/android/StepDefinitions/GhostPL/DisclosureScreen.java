package platforms.ui.mobile.android.StepDefinitions.GhostPL;

import cucumber.api.java.en.Then;
import platforms.ui.mobile.android.AndroidFlowModel.GhostPL.GhostProduct_Disclosure_Flow;
import utils.DriverFactory;

/**
 * 
 * @author Agrim Markan
 *
 */
public class DisclosureScreen extends DriverFactory {

	@Then("^User checks the title for disclosure screen \"([^\"]*)\"$")
	public void user_checks_the_title_for_disclosure_screen(String arg1) throws Throwable {
		GhostProduct_Disclosure_Flow.checkTitle(arg1);
	}

	@Then("^User checks the text for disclosure screen \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void user_checks_the_text_for_disclosure_screen(String arg1, String arg2, String arg3, String arg4,
			String arg5, String arg6, String arg7, String arg8, String arg9, String arg10, String arg11)
			throws Throwable {
		GhostProduct_Disclosure_Flow.checkText(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11,
				arg11);
	}

	@Then("^User checks the text for disclosure screen for Consoldiation\"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"$")
	public void user_checks_the_text_for_disclosure_screen_for_Consoldiation(String arg1, String arg2, String arg3,
			String arg4, String arg5, String arg6, String arg7, String arg8, String arg9, String arg10, String arg11,
			String arg12) throws Throwable {
		GhostProduct_Disclosure_Flow.checkTextForConsolidation(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9,
				arg10, arg11, arg12);
	}

	@Then("^User scrolls disclosure screen to bottom$")
	public void user_scrolls_disclosure_screen_to_bottom() throws Throwable {
		GhostProduct_Disclosure_Flow.scrollDisclosureScreenToBottom();
	}

	@Then("^User clicks on LoanReasonsOptions tabs$")
	public void user_clicks_on_LoanReasonsOptions_tabs() throws Throwable {
		GhostProduct_Disclosure_Flow.clickReasonsTab();
	}

	@Then("^User checks the ReasonForLoanTitle \"([^\"]*)\"$")
	public void user_checks_the_ReasonForLoanTitle(String arg1) throws Throwable {
		GhostProduct_Disclosure_Flow.checkReasonsScreenTitle(arg1);
	}

	@Then("^User checks different options available \"([^\"]*)\"$")
	public void user_checks_different_options_available(String arg1) throws Throwable {
		GhostProduct_Disclosure_Flow.checkReasonsOptionsText(arg1);
	}

	@Then("^User checks the ErrorMessage \"([^\"]*)\"$")
	public void user_checks_the_ErrorMessage(String arg1) throws Throwable {
		GhostProduct_Disclosure_Flow.checkTnCDisagreeError(arg1);
	}

	@Then("^User clicks on TnC button$")
	public void user_clicks_on_TnC_button() throws Throwable {
		GhostProduct_Disclosure_Flow.clickTnCConfirmButton();
	}

	@Then("^User selects ReasonForLaon Option \"([^\"]*)\"$")
	public void user_selects_ReasonForLaon_Option(String arg1) throws Throwable {
		GhostProduct_Disclosure_Flow.clickDifferentReason(arg1);
	}

	@Then("^User clicks on confirm button on disclosure screen$")
	public void user_clicks_on_confirm_button_on_disclosure_screen() throws Throwable {
		GhostProduct_Disclosure_Flow.clickConfirm();
	}

	@Then("^User clicks on radioButton$")
	public void user_clicks_on_radioButton() throws Throwable {
		GhostProduct_Disclosure_Flow.clickRadioButton();
	}

}
