package platforms.ui.mobile.android.StepDefinitions.GhostPL;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import platforms.ui.mobile.android.AndroidFlowModel.GhostPL.GhostProduct_Notification_Flow;
import platforms.ui.mobile.android.AndroidPageObjects.GhostPL.Page_NotificationsScreen;
import utils.DriverFactory;

/**
 * 
 * @author Agrim Markan
 *
 */

public class NotificationScreen extends DriverFactory {

	@Then("^User clicks on foryou tab$")
	public void user_clicks_on_foryou_tab() {
		GhostProduct_Notification_Flow.clickForYouTab();
	}

	@Then("^User clicks on PLOffer$")
	public void user_clicks_on_PLOffer(DataTable arg1) throws InterruptedException {
		GhostProduct_Notification_Flow.clickSpecificPLOffer(arg1);
	}
	
	@Then("^User clicks on CLOffer$")
	public void user_clicks_on_CLOffer(DataTable arg1) throws Throwable {
		GhostProduct_Notification_Flow.clickSpecificCLOffer(arg1);
	}
	@Then("^User checks if OfferClickedEarlier is available\"([^\"]*)\"$")
	public void user_checks_if_OfferClickedEarlier_is_available(String arg1) throws Throwable {
		GhostProduct_Notification_Flow.checkSpecificOfferExists(arg1);
	}
	
	@Then("^User checks if OfferClickedEarlier is not available\"([^\"]*)\"$")
	public void user_checks_if_OfferClickedEarlier_is_not_available(String arg1) throws Throwable {
		GhostProduct_Notification_Flow.checkSpecificOfferDoesNotExist(arg1); 
	}
	@Then("^User should not see any notification\"([^\"]*)\"$")
	public void user_should_not_see_any_notification(String arg1) throws Throwable {
		GhostProduct_Notification_Flow.noOfferMessage(arg1);
	}

}
