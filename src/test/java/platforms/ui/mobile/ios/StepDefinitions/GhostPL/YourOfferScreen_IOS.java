package platforms.ui.mobile.ios.StepDefinitions.GhostPL;

import cucumber.api.java.en.Then;
import platforms.ui.mobile.ios.iOSFlowModel.GhostPL.GhostProduct_YourOffer_IOS_Flow;
import utils.DriverFactory;

public class YourOfferScreen_IOS extends DriverFactory {

	@Then("^User_IOS scrolls your offer screen to bottom$")
	public void user_ios_scrolls_your_offer_screen_to_bottom() throws Throwable {
		GhostProduct_YourOffer_IOS_Flow.scrollYourOfferToBotton();
	}

	@Then("^User_IOS clicks confirm button on YourOffer screen$")
	public void user_ios_clicks_confirm_button_on_YourOffer_screen() throws Throwable {
		GhostProduct_YourOffer_IOS_Flow.clickConfirmButton();
	}

	@Then("^User_IOS selects debit order date \"([^\"]*)\"$")
	public void user_ios_selects_debit_order_date(String arg1) throws Throwable {
		GhostProduct_YourOffer_IOS_Flow.clickDebitOrderDate(arg1);
	}

	@Then("^User_IOS clicks yes on review my credit limit$")
	public void user_ios_clicks_yes_on_review_my_credit_limit() throws Throwable {
		GhostProduct_YourOffer_IOS_Flow.clickYesOnReviewMyCreditLimit();
	}

}
