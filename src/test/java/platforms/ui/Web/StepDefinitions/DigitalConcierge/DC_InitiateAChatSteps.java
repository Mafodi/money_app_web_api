package platforms.ui.Web.StepDefinitions.DigitalConcierge;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import platforms.ui.Web.FlowModel.DC_LiveChat_Flow;

public class DC_InitiateAChatSteps {

    DC_LiveChat_Flow chatFlow = new DC_LiveChat_Flow();

    @Given("^As a client I am logged-in with Username \"([^\"]*)\" and Password \"([^\"]*)\"$")
    public void asAClientIAmLoggedInWithUsernameAndPassword(String username, String password) throws Exception {
        chatFlow.LOGGED_INTO_ONLINEBANKING_WITH_USERNAME_AND_PASSWORD(username, password);
    }

    @When("^I navigate to chat$")
    public void iNavigateToChat() {
        chatFlow.NAVIGATE_TO_CHAT();
    }

    @Then("^I initiate chat \"([^\"]*)\"$")
    public void iInitiateChat(String message) throws Exception {
        chatFlow.INITIATE_A_CHAT(message);
    }

    @Given("^As a client I am on Online Banking$")
    public void asAClientIAmOnOnlineBanking() {
        chatFlow.NAVIGATE_TO_ONLINEBANKING();
    }

    @When("^I capture Name \"([^\"]*)\" and Email address \"([^\"]*)\" unauthenticated$")
    public void iCaptureNameAndEmailAddressUnauthenticated(String name, String email) throws Exception {
        chatFlow.CAPTURE_NAME_AND_EMAIL(name, email);
    }

    @Then("^I am queued to chat$")
    public void iAmQueuedToChat() {
        chatFlow.CHAT_QUEUED_MESSAGE();
    }
}
