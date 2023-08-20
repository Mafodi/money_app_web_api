package platforms.ui.mobile.android.StepDefinitions.GhostPL;

import cucumber.api.java.en.Then;
import platforms.ui.mobile.android.AndroidFlowModel.GhostPL.GhostProduct_LetsGetStarted_Flow;
import utils.DriverFactory;

/**
 * 
 * @author Agrim Markan
 *
 */
public class LetsGetStartedScreen extends DriverFactory {

	@Then("^User checks the title\"([^\"]*)\"$")
	public void user_checks_the_title(String getTitle) throws InterruptedException {
		GhostProduct_LetsGetStarted_Flow.checkTitle(getTitle);
	}

	@Then("^User checks the heading \"([^\"]*)\"$")
	public void user_checks_the_heading(String getHeading) throws InterruptedException {
		GhostProduct_LetsGetStarted_Flow.checkHeading(getHeading);
	}

	@Then("^User checks the text on Letsgetstarted screen for PL \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void user_checks_the_text_on_Letsgetstarted_screen_for_PL(String arg1, String arg2, String arg3)
			throws Throwable {
		GhostProduct_LetsGetStarted_Flow.checkText(arg1, arg2, arg3);
	}

	@Then("^User scrolls letsgetstarted screen to bottom$")
	public void user_scrolls_letsgetstarted_screen_to_bottom() throws Throwable {
		GhostProduct_LetsGetStarted_Flow.scrollLetsGetStartedSCreenToBottom();
	}

	@Then("^User clicks on all checkbox$")
	public void user_clicks_on_all_checkbox() throws Throwable {
		GhostProduct_LetsGetStarted_Flow.clickCheckbox();
	}

	@Then("^User clicks on confirm button$")
	public void user_clicks_on_confirm_button() throws Throwable {
		GhostProduct_LetsGetStarted_Flow.clickConfirm();
	}

	@Then("^User checks the text on Letsgetstarted screen for Consolidation\"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void user_checks_the_text_on_Letsgetstarted_screen_for_Consolidation(String arg1, String arg2, String arg3,
			String arg4, String arg5, String arg6, String arg7) throws Throwable {
		GhostProduct_LetsGetStarted_Flow.checkText(arg1, arg2, arg3, arg4, arg5, arg6, arg7);
	}
}
