package platforms.ui.mobile.ios.StepDefinitions.GhostPL;

import cucumber.api.java.en.Then;
import platforms.ui.mobile.ios.iOSFlowModel.GhostPL.GhostProduct_LetsGetStarted_IOS_Flow;
import utils.DriverFactory;

public class LetsGetStartedScreen_IOS extends DriverFactory {

	@Then("^User_IOS scrolls letsgetstarted screen to bottom$")
	public void user_ios_scrolls_letsgetstarted_screen_to_bottom() throws Throwable {
		GhostProduct_LetsGetStarted_IOS_Flow.scrollLetsGetStartedSCreenToBottom();
	}

	@Then("^User_IOS clicks on all checkbox$")
	public void user_ios_clicks_on_all_checkbox() throws Throwable {
		GhostProduct_LetsGetStarted_IOS_Flow.clickCheckbox();
	}

	@Then("^User_IOS clicks on confirm button$")
	public void user_ios_clicks_on_confirm_button() throws Throwable {
		GhostProduct_LetsGetStarted_IOS_Flow.clickConfirm();
	}
}
