package platforms.ui.mobile.android.StepDefinitions.GhostPL;

import cucumber.api.java.en.Then;
import platforms.ui.mobile.android.AndroidFlowModel.GhostPL.GhostProduct_CardDelivery_Flow;

public class CardDeliveryScreen {

	@Then("^User clicks on confirm button for card delivery$")
	public void user_clicks_on_confirm_button_for_card_delivery() throws Throwable {
		GhostProduct_CardDelivery_Flow.clickCardDeliveryConfirmButton();
	}
}
