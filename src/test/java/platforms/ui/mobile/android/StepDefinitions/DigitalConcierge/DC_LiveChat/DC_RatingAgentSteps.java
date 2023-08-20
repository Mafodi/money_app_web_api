package platforms.ui.mobile.android.StepDefinitions.DigitalConcierge.DC_LiveChat;

import cucumber.api.java.en.Then;
import org.openqa.selenium.support.ui.WebDriverWait;
import platforms.ui.mobile.android.AndroidFlowModel.DC_LiveChat_Flow;
import utils.DriverFactory;

public class DC_RatingAgentSteps extends DriverFactory {

    WebDriverWait wait = new WebDriverWait(getAndroidDriver(), 60);
    DC_LiveChat_Flow chatFlow = new DC_LiveChat_Flow();

    @Then("^I should rate agent$")
    public void iShouldRateAgent() {
        chatFlow.RATE_AGENT();
    }
}
