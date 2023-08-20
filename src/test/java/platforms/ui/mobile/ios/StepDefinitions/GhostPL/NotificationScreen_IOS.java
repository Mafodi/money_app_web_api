package platforms.ui.mobile.ios.StepDefinitions.GhostPL;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import platforms.ui.mobile.ios.iOSFlowModel.GhostPL.GhostProduct_Notification_IOS_Flow;
import utils.DriverFactory;

public class NotificationScreen_IOS extends DriverFactory {

	@Then("^User_IOS clicks on foryou tab$")
	public void user_ios_clicks_on_foryou_tab() throws Throwable {
		GhostProduct_Notification_IOS_Flow.clickForYouTab();
	}

	@Then("^User_IOS clicks on PLOffer$")
	public void user_ios_clicks_on_PLOffer(DataTable arg1) throws Throwable {
		GhostProduct_Notification_IOS_Flow.clickSpecificPLOffer(arg1);
	}

	@Then("^User_IOS clicks on CLOffer$")
	public void user_ios_clicks_on_CLOffer(DataTable arg1) throws Throwable {
		GhostProduct_Notification_IOS_Flow.clickSpecificCLOffer(arg1);
	}

	@Then("^User scrolls the foryou screen$")
	public void user_scrolls_the_foryou_screen() throws Throwable {
		GhostProduct_Notification_IOS_Flow.scrollNotificationScreen();
	}
}
