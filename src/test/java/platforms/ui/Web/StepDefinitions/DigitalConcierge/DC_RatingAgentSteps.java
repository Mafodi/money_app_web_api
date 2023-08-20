package platforms.ui.Web.StepDefinitions.DigitalConcierge;

import cucumber.api.java.en.Then;
import platforms.ui.Web.FlowModel.DC_LiveChat_Flow;

public class DC_RatingAgentSteps {

    DC_LiveChat_Flow chatFlow = new DC_LiveChat_Flow();

    @Then("^I should rate the web chat$")
    public void iShouldRateTheWebChat() {
        chatFlow.RATE_AGENT();
    }

    @Then("^I should comment \"([^\"]*)\"$")
    public void iShouldComment(String comment) throws Exception {
        chatFlow.COMMENT_RATE_AGENT(comment);
    }

    @Then("^I click No thanks button$")
    public void iClickNoThanksButton() {
        chatFlow.NO_THANKS_BUTTON_CLICKED();
    }

    @Then("^I should Five star rate the web chat$")
    public void iShouldFiveStarRateTheWebChat() {
        chatFlow.RATE_FIVE_STAR_AGENT();
    }
}
