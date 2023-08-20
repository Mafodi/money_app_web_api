package platforms.ui.mobile.android.StepDefinitions.DigitalConcierge.DC_LiveChat;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.ui.WebDriverWait;
import platforms.ui.mobile.android.AndroidFlowModel.DC_LiveChat_Flow;
import utils.DriverFactory;

public class DC_CreditCardChatRoutingSteps extends DriverFactory {

    WebDriverWait wait = new WebDriverWait(getAndroidDriver(), 30);
    DC_LiveChat_Flow chatFlow = new DC_LiveChat_Flow();

    @When("^I navigate to What do you need$")
    public void iNavigateToWhatDoYouNeed() {
        chatFlow.NAVIGATE_TO_WHAT_DO_YOU_NEED();
    }

    @Then("^Chat is opened$")
    public void chatIsOpened() {
        chatFlow.OPEN_CHAT();
    }

}
