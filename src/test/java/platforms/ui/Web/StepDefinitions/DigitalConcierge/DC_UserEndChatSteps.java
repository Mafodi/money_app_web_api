package platforms.ui.Web.StepDefinitions.DigitalConcierge;

import cucumber.api.java.en.Then;
import platforms.ui.Web.FlowModel.DC_LiveChat_Flow;

public class DC_UserEndChatSteps {

    DC_LiveChat_Flow chatFlow = new DC_LiveChat_Flow();

    @Then("^I should end the web chat$")
    public void iShouldEndTheWebChat() {
        chatFlow.USER_END_CHAT();
    }
}
