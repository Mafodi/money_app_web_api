package platforms.ui.mobile.ios.StepDefinitions.GhostPL;

import cucumber.api.java.en.Then;
import platforms.ui.mobile.ios.iOSFlowModel.GhostPL.GhostProduct_Review_IOS_Flow;
import utils.DriverFactory;

public class ReviewScreen_IOS extends DriverFactory {

	@Then("^User_IOS scrolls review screen to bottom$")
	public void user_ios_scrolls_review_screen_to_bottom() throws Throwable {
		GhostProduct_Review_IOS_Flow.scrollReviewToBottom();
	}

	@Then("^User_IOS clicks confirm button on Review screen$")
	public void user_ios_clicks_confirm_button_on_Review_screen() throws Throwable {
		GhostProduct_Review_IOS_Flow.clickReviewConfirmButton();
	}

}
