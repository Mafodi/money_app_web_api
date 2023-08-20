package platforms.ui.mobile.android.StepDefinitions.DigitalConcierge.DC_HeyNed;

import cucumber.api.java.en.Then;
import org.openqa.selenium.support.ui.WebDriverWait;
import platforms.ui.mobile.android.AndroidFlowModel.DC_HeyNedTask_Flow;
import utils.DriverFactory;

public class DC_RatingAHeyNedAgentSteps extends DriverFactory {

    WebDriverWait wait = new WebDriverWait(getAndroidDriver(), 60);
    DC_HeyNedTask_Flow taskFlow = new DC_HeyNedTask_Flow();

    @Then("^I should star rate the agent$")
    public void iShouldRateTheAgent() {
        taskFlow.RATE_AN_AGENT();
    }

    @Then("^I should comment \"([^\"]*)\" rate the agent$")
    public void iShouldCommentRateTheAgent(String comment) throws Exception {
        taskFlow.COMMENT_RATE_AN_AGENT(comment);
    }

}
