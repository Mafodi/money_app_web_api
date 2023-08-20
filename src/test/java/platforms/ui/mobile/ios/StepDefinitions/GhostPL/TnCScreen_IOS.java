package platforms.ui.mobile.ios.StepDefinitions.GhostPL;

import cucumber.api.java.en.Then;
import platforms.ui.mobile.ios.iOSFlowModel.GhostPL.GhostProduct_TnC_IOS_Flow;
import utils.DriverFactory;

public class TnCScreen_IOS extends DriverFactory {

	@Then("^User_IOS clicks on Agree Button$")
	public void user_ios_clicks_on_Agree_Button() throws Throwable {
		GhostProduct_TnC_IOS_Flow.clickAgreeButton();
	}

}
