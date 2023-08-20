package platforms.ui.mobile.ios.StepDefinitions.GhostPL;

import cucumber.api.java.en.Then;
import platforms.ui.mobile.ios.iOSFlowModel.GhostPL.GhostProduct_Campaign_IOS_Flow;
import utils.DriverFactory;

public class CampaignScreen_IOS extends DriverFactory {

	@Then("^User_IOS clicks on iminterested button on campaign screen$")
	public void user_ios_clicks_on_iminterested_button_on_campaign_screen() throws Throwable {
		GhostProduct_Campaign_IOS_Flow.clickIminterestedButton();
	}

}
