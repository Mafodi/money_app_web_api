package platforms.ui.mobile.android.StepDefinitions.DigitalConcierge.DC_LiveChat;

import cucumber.api.java.en.Then;
import org.openqa.selenium.support.ui.WebDriverWait;
import platforms.ui.mobile.android.AndroidFlowModel.DC_LiveChat_Flow;
import utils.DriverFactory;

public class DC_AgentConnectivitySteps extends DriverFactory {

    WebDriverWait wait = new WebDriverWait(getAndroidDriver(), 120);
    DC_LiveChat_Flow chatFlow = new DC_LiveChat_Flow();

    @Then("^The agent is connected to chat$")
    public void theAgentIsConnectedToChat() {
        chatFlow.AGENT_CONNECTED_TO_CHAT();
    }
}
