package platforms.ui.mobile.android.StepDefinitions.GhostPL;

import cucumber.api.java.en.Then;
import platforms.ui.mobile.android.AndroidFlowModel.GhostPL.GhostProduct_Dashboard_Flow;
import utils.DriverFactory;

/**
 * 
 * @author Agrim Markan
 *
 */
public class DashBoardScreen extends DriverFactory {

	@Then("^User declines pin creation$")
	public void user_declines_pin_creation() throws Throwable {
		GhostProduct_Dashboard_Flow.declinePinCreation();
	}

	@Then("^User clicks on ok snackbar$")
	public void user_clicks_on_ok_snackbar() throws Throwable {
		GhostProduct_Dashboard_Flow.clickOkSnackBar();
	}

	@Then("^User clicks on more option$")
	public void user_clicks_on_more_option() throws Throwable {
		GhostProduct_Dashboard_Flow.clickMoreOption();
	}

	@Then("^User clicks on notification tab$")
	public void user_clicks_on_notification_tab() throws Throwable {
		GhostProduct_Dashboard_Flow.clickNotificationTab();
	}

	@Then("^User clicks on pulsating icon$")
	public void user_clicks_on_pulsating_icon() throws Throwable {
		GhostProduct_Dashboard_Flow.clickPulsatingIcon();
	}
}
