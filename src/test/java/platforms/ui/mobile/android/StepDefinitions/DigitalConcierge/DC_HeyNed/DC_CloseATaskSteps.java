package platforms.ui.mobile.android.StepDefinitions.DigitalConcierge.DC_HeyNed;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.openqa.selenium.support.ui.WebDriverWait;
import platforms.ui.mobile.android.AndroidFlowModel.DC_HeyNedTask_Flow;
import utils.DriverFactory;

public class DC_CloseATaskSteps extends DriverFactory {

    WebDriverWait wait = new WebDriverWait(getAndroidDriver(), 20);
    DC_HeyNedTask_Flow taskFlow = new DC_HeyNedTask_Flow();

    @And("^I navigate back to Task List$")
    public void iNavigateBackToTaskList() {
        taskFlow.NAVIGATE_BACK_TO_TASK_LIST();
    }

    @Then("^I close the task successfully$")
    public void iCloseTheTaskSuccessfully() {
        taskFlow.CLOSE_A_TASK();
    }

    @Then("^I reopen the task successfully$")
    public void iReopenTheTaskSuccessfully() {
        taskFlow.REOPEN_A_TASK();
    }
}
