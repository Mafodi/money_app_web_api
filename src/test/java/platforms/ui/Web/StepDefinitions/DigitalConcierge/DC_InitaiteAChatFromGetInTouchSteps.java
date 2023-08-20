package platforms.ui.Web.StepDefinitions.DigitalConcierge;

import cucumber.api.java.en.And;
import platforms.ui.Web.FlowModel.DC_LiveChat_Flow;

public class DC_InitaiteAChatFromGetInTouchSteps {

    DC_LiveChat_Flow chatFlow = new DC_LiveChat_Flow();

    @And("^I click Chat to us$")
    public void iClickChatToUs() {
        chatFlow.CHAT_TO_US();
    }
}
