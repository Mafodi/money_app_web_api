package platforms.ui.mobile.ios.StepDefinitions.GhostPL;

import cucumber.api.java.en.Then;
import platforms.ui.mobile.ios.iOSFlowModel.GhostPL.GhostProduct_Email_IOS_Flow;
import utils.DriverFactory;

public class EmailScreen_IOS extends DriverFactory {

	@Then("^User_IOS enters emailid \"([^\"]*)\"$")
	public void user_ios_enters_emailid(String arg1) throws Throwable {
		GhostProduct_Email_IOS_Flow.enterEmailID(arg1);
	}
}
