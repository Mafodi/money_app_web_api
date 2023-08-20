package platforms.ui.mobile.android.StepDefinitions.GhostPL;

import cucumber.api.java.en.Then;
import platforms.ui.mobile.android.AndroidFlowModel.GhostPL.GhostProduct_TnC_Flow;
import utils.DriverFactory;

/**
 * 
 * @author Agrim Markan
 *
 */
public class TnCScreen extends DriverFactory {

	@Then("^User checks title for TnC \"([^\"]*)\"$")
	public void user_checks_title_for_TnC(String arg1) throws Throwable {
		GhostProduct_TnC_Flow.checkTitle(arg1);
	}

	@Then("^User clicks on Disagree Button$")
	public void user_clicks_on_Disagree_Button() throws Throwable {
		GhostProduct_TnC_Flow.clickDisagreeButton();
	}

	@Then("^User clicks on Agree Button$")
	public void user_clicks_on_Agree_Button() throws Throwable {
		GhostProduct_TnC_Flow.clickAgreeButton();
	}
}
