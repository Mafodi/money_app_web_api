package platforms.ui.mobile.android.StepDefinitions.DigitalConcierge.DC_LiveChat;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.ui.WebDriverWait;
import platforms.ui.mobile.android.AndroidFlowModel.DC_LiveChat_Flow;
import utils.DriverFactory;

public class DC_InitiateAChatSteps extends DriverFactory {

    WebDriverWait wait = new WebDriverWait(getAndroidDriver(), 30);
    DC_LiveChat_Flow chatFlow = new DC_LiveChat_Flow();

    @When("^I navigate to Nedbank service agent$")
    public void iNavigateToNedbankServiceAgent() {
        chatFlow.NAVIGATE_TO_NEDBANK_SERVICE_AGENT();
    }

    @Then("^The chat message \"([^\"]*)\" initiated$")
    public void theChatMessageInitiated(String message) throws Exception {
        chatFlow.CAPTURE_CHAT_MESSAGE(message);
    }

    @When("^I navigate to unauthenticated chat$")
    public void iNavigateToUnauthenticatedChat() {
        chatFlow.NAVIGATE_TO_UNAUTHENTICATED_CHAT();
    }

    @And("^I capture Name \"([^\"]*)\" and Email address \"([^\"]*)\"$")
    public void iCaptureNameAndEmailAddress(String name, String email) throws Exception {
        chatFlow.CAPTURE_USER_DETAILS(name, email);
    }

    @Then("^The chat initiated$")
    public void theChatInitiated() {
        chatFlow.CHAT_QUEUED_MESSAGE();
    }
}
