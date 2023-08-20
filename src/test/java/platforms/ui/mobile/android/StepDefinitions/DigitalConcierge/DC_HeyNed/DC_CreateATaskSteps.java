package platforms.ui.mobile.android.StepDefinitions.DigitalConcierge.DC_HeyNed;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.openqa.selenium.support.ui.WebDriverWait;
import platforms.ui.mobile.android.AndroidFlowModel.DC_HeyNedTask_Flow;
import utils.DriverFactory;

public class DC_CreateATaskSteps extends DriverFactory {

    WebDriverWait wait = new WebDriverWait(getAndroidDriver(), 20);
    DC_HeyNedTask_Flow taskFlow = new DC_HeyNedTask_Flow();

    @And("^I capture a task name \"([^\"]*)\"$")
    public void iCaptureATaskName(String name) throws Exception {
        taskFlow.CAPTURE_TASK_NAME(name);
    }

    @Then("^The task is created$")
    public void theTaskIsCreated() {
        taskFlow.TASK_CREATED();
    }
}
