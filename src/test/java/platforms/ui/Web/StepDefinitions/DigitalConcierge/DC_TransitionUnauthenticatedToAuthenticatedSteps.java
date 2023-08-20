package platforms.ui.Web.StepDefinitions.DigitalConcierge;

import cucumber.api.java.en.Then;
import platforms.ui.Web.FlowModel.DC_LiveChat_Flow;

public class DC_TransitionUnauthenticatedToAuthenticatedSteps {

    DC_LiveChat_Flow chatFlow = new DC_LiveChat_Flow();

    @Then("^I login with Username \"([^\"]*)\" and Password \"([^\"]*)\" to continue web chat$")
    public void iLoginWithUsernameAndPasswordToContinueWebChat(String username, String password) throws Exception {
        chatFlow.LOGIN_AND_RESUME_CHAT(username, password);
    }
}
