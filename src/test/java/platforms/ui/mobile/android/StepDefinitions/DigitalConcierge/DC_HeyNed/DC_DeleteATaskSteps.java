package platforms.ui.mobile.android.StepDefinitions.DigitalConcierge.DC_HeyNed;

import cucumber.api.java.en.Then;
import org.openqa.selenium.support.ui.WebDriverWait;
import platforms.ui.mobile.android.AndroidFlowModel.DC_HeyNedTask_Flow;
import utils.DriverFactory;

public class DC_DeleteATaskSteps extends DriverFactory {

    WebDriverWait wait = new WebDriverWait(getAndroidDriver(), 60);
    DC_HeyNedTask_Flow taskFlow = new DC_HeyNedTask_Flow();

    @Then("^I delete the task successfully$")
    public void iDeleteTheTaskSuccessfully() {
        taskFlow.DELETE_A_TASK();
    }

    @Then("^I attempt to delete the task$")
    public void iAttemptToDeleteTheTask() {
        taskFlow.CANCEL_DELETE_A_TASK();
    }
}
