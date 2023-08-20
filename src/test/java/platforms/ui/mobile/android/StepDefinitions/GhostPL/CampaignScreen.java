package platforms.ui.mobile.android.StepDefinitions.GhostPL;

import cucumber.api.java.en.Then;
import platforms.ui.mobile.android.AndroidFlowModel.GhostPL.GhostProduct_Campaign_Flow;
import utils.DriverFactory;

public class CampaignScreen extends DriverFactory {

	@Then("^User clicks on iminterested button on campaign screen$")
	public void user_clicks_on_iminterested_button_on_campaign_screen() throws Throwable {
		GhostProduct_Campaign_Flow.clickIminterestedButton();
	}
}
