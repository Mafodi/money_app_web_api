package platforms.ui.mobile.android.StepDefinitions.DigitalConcierge.DC_HeyNed;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.openqa.selenium.support.ui.WebDriverWait;
import platforms.ui.mobile.android.AndroidFlowModel.DC_HeyNedTask_Flow;
import utils.DriverFactory;

public class DC_SearchForATaskSteps extends DriverFactory {

    WebDriverWait wait = new WebDriverWait(getAndroidDriver(), 20);
    DC_HeyNedTask_Flow taskFlow = new DC_HeyNedTask_Flow();

    @And("^I search a task name \"([^\"]*)\"$")
    public void iSearchATaskName(String name) throws Exception {
        taskFlow.SEARCH_TASK_NAME(name);
    }

    @And("^I search a task \"([^\"]*)\"$")
    public void iSearchATask(String taskName) throws Exception {
        taskFlow.SEARCH_TASK(taskName);
    }

    @Then("^The task is searched successfully$")
    public void theTaskIsSearchSuccessfully() {
        taskFlow.SEARCHED_TASK_DISPLAYED();
    }

    @Then("^Then task list has no tasks present$")
    public void thenTaskListHasNoTasksPresent() {
        taskFlow.SEARCH_WHEN_NO_TASKS_PRESENT();
    }
}
