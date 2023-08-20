package platforms.ui.mobile.ios.StepDefinitions.GhostPL;

import cucumber.api.java.en.Then;
import platforms.ui.mobile.ios.iOSFlowModel.GhostPL.GhostProduct_YourInfo_IOS_FLow;
import utils.DriverFactory;

public class YourInformationScreen_IOS extends DriverFactory {

	@Then("^User_IOS scrolls Your information screen to bottom$")
	public void user_ios_scrolls_Your_information_screen_to_bottom() throws Throwable {
		GhostProduct_YourInfo_IOS_FLow.scrollYourInformationScreenToBottom();
	}

	@Then("^User_IOS clicks confirm button on YourInformation screen$")
	public void user_ios_clicks_confirm_button_on_YourInformation_screen() throws Throwable {
		GhostProduct_YourInfo_IOS_FLow.clickYourInformationScreenConfirm();
	}
}
