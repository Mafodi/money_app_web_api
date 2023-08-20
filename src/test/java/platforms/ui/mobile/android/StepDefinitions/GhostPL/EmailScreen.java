package platforms.ui.mobile.android.StepDefinitions.GhostPL;

import cucumber.api.java.en.Then;
import platforms.ui.mobile.android.AndroidFlowModel.GhostPL.GhostProduct_Email_Flow;
import utils.DriverFactory;

/**
 * 
 * @author Agrim Markan
 *
 */
public class EmailScreen extends DriverFactory {
	@Then("^User checks title on EmailScreen \"([^\"]*)\"$")
	public void user_checks_title_on_EmailScreen(String arg1) throws Throwable {
		GhostProduct_Email_Flow.checkTitle(arg1);
	}

	@Then("^User checks heading on EmailScreen \"([^\"]*)\"$")
	public void user_checks_heading_on_EmailScreen(String arg1) throws Throwable {
		GhostProduct_Email_Flow.checkHeading(arg1);
	}

	@Then("^User checks text on EmailScreen \"([^\"]*)\"\"([^\"]*)\"$")
	public void user_checks_text_on_EmailScreen(String arg1, String arg2) throws Throwable {
		GhostProduct_Email_Flow.checkText(arg1, arg2);
	}

	@Then("^User enters emailid \"([^\"]*)\"$")
	public void user_enters_emailid(String arg1) throws Throwable {
		GhostProduct_Email_Flow.enterEmailID(arg1);
	}

	@Then("^User enter incorrect emailid \"([^\"]*)\"$")
	public void user_enter_incorrect_emailid(String arg1) throws Throwable {
		GhostProduct_Email_Flow.enterEmailID(arg1);
	}

	@Then("^User clicks on confirm button on EmailSCreens$")
	public void user_clicks_on_confirm_button_on_EmailSCreens() throws Throwable {
		GhostProduct_Email_Flow.clickConfirm();
	}

	@Then("^User checks the InvalidEmailIDErrorMessage \"([^\"]*)\"$")
	public void user_checks_the_InvalidEmailIDErrorMessage(String arg1) throws Throwable {
		GhostProduct_Email_Flow.invalidEmailIDErrorMessage(arg1);
	}

}
