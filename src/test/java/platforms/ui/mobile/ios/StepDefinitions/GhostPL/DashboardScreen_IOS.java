package platforms.ui.mobile.ios.StepDefinitions.GhostPL;

import cucumber.api.java.en.Then;
import platforms.ui.mobile.ios.iOSFlowModel.GhostPL.GhostProduct_Dashboard_IOS_Flow;
import utils.DriverFactory;

public class DashboardScreen_IOS extends DriverFactory {

	@Then("^User_IOS declines pin creation$")
	public void user_ios_declines_pin_creation() throws Throwable {
		GhostProduct_Dashboard_IOS_Flow.declinePinCreation();
	}

	@Then("^User_IOS clicks on ok snackbar$")
	public void user_ios_clicks_on_ok_snackbar() throws Throwable {
		GhostProduct_Dashboard_IOS_Flow.clickOkSnackBar();
	}

	@Then("^User_IOS clicks on more option$")
	public void user_ios_clicks_on_more_option() throws Throwable {
		GhostProduct_Dashboard_IOS_Flow.clickMoreOption();
	}

	@Then("^User_IOS clicks on notification tab$")
	public void user_ios_clicks_on_notification_tab() throws Throwable {
		GhostProduct_Dashboard_IOS_Flow.clickNotificationTab();
	}
}
