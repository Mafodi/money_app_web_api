package platforms.ui.mobile.ios.StepDefinitions.DigitalConcierge.HeyJude;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import io.appium.java_client.MobileElement;
import org.apache.log4j.Logger;
import platforms.ui.mobile.ios.PageFactoryObject;
import platforms.ui.mobile.ios.StepDefinitions.DC_CommonFunctions;
import utils.DriverFactory;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class DC_HeyNedReopenTask extends DriverFactory {

    String TaskName=null;
    String ClosedTab = "//XCUIElementTypeButton[@name=\"Closed\"]";
    MobileElement selectedTask = null;
    private static Logger log = Logger.getLogger(DC_HeyNedReopenTask.class);
    PageFactoryObject pageFactoryObj = new PageFactoryObject(driver);
    Integer index;

    @And("^Select a task to reopen \"([^\"]*)\"$")
    public void selectATaskToReopen(String arg0) {
        TaskName = arg0;
        try {
            Map<MobileElement, Integer> task = DC_CommonFunctions.GetSelectedTask(arg0, true);
            Set<MobileElement> element = task.keySet();
            for (MobileElement key : task.keySet()) {
                if (key != null) {
                    selectedTask = key;
                    TaskName = arg0;
                    index = task.get(key);
                    log.info("Got the selected task");
                } else
                    log.error("No task found for bubble");
            }
        }catch (Exception ex)
        {
            log.warn(ex.getMessage());
        }
    }

    @Then("^user swipe on selected task and select reopen$")
    public void userSwipeOnSelectedTaskAndSelectReopen() {
        try {
            DC_CommonFunctions.swipeLeftOnElement(selectedTask);
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            pageFactoryObj.getTaskCreationScreen().reopenBtn.click();
        } catch (Exception ex) {
            log.warn(ex.getMessage());
        }
    }

    @And("^Status of the task should changed to Reopened$")
    public void statusOfTheTaskShouldChangedToReopened() {
        log.info("Status of the task should changed to Reopened");
    }

    @And("^I can resume my task activities$")
    public void iCanResumeMyTaskActivities() {
        log.info("Status of the task should changed to Reopened");

    }
}
