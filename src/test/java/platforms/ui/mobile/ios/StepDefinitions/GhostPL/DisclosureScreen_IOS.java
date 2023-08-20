package platforms.ui.mobile.ios.StepDefinitions.GhostPL;

import cucumber.api.java.en.Then;
import platforms.ui.mobile.ios.iOSFlowModel.GhostPL.GhostProduct_Disclosure_IOS_Flow;
import utils.DriverFactory;

public class DisclosureScreen_IOS extends DriverFactory {

	@Then("^User_IOS clicks on radioButton$")
	public void user_ios_clicks_on_radioButton() throws Throwable {
		GhostProduct_Disclosure_IOS_Flow.clickRadioButton();
		;
	}

	@Then("^User_IOS scrolls disclosure screen to bottom$")
	public void user_ios_scrolls_disclosure_screen_to_bottom() throws Throwable {
		GhostProduct_Disclosure_IOS_Flow.scrollDisclosureScreenToBottom();
	}

	@Then("^User_IOS clicks on LoanReasonsOptions tabs$")
	public void user_ios_clicks_on_LoanReasonsOptions_tabs() throws Throwable {
		GhostProduct_Disclosure_IOS_Flow.clickReasonsTab();
	}

	@Then("^User_IOS selects ReasonForLaon Option \"([^\"]*)\"$")
	public void user_ios_selects_ReasonForLaon_Option(String arg1) throws Throwable {
		GhostProduct_Disclosure_IOS_Flow.clickDifferentReason(arg1);
	}

	@Then("^User_IOS clicks on confirm button on disclosure screen$")
	public void user_ios_clicks_on_confirm_button_on_disclosure_screen() throws Throwable {
		GhostProduct_Disclosure_IOS_Flow.clickConfirm();
	}
}
