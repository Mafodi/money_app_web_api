package platforms.ui.mobile.ios.StepDefinitions.GhostPL;

import cucumber.api.java.en.Then;
import platforms.ui.mobile.ios.iOSFlowModel.GhostPL.GhostProduct_CardDelivery_IOS_Flow;

public class CardDeliveryScreen {

	@Then("^User_IOS clicks on confirm button for card delivery Option$")
	public void user_ios_clicks_on_confirm_button_for_card_delivery_Option() throws Throwable {
		GhostProduct_CardDelivery_IOS_Flow.clickConfirmOnCardDeliver();
	}
}
