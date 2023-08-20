package platforms.ui.Web.StepDefinitions.DigitalConcierge;

import cucumber.api.java.en.Then;
import platforms.ui.Web.FlowModel.DC_LiveChat_Flow;

public class DC_AgentConnectivitySteps {

    DC_LiveChat_Flow chatFlow = new DC_LiveChat_Flow();

    @Then("^The agent is connected to web chat$")
    public void theAgentIsConnectedToWebChat() {
        chatFlow.AGENT_CONNECTED_TO_CHAT();
    }
}
