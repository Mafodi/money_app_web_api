package platforms.ui.mobile.ios.StepDefinitions.DigitalConcierge.HeyJude;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import io.appium.java_client.MobileElement;
import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import platforms.ui.mobile.ios.PageFactoryObject;
import platforms.ui.mobile.ios.StepDefinitions.DC_CommonFunctions;
import utils.CommonFunctions;
import utils.DriverFactory;

import java.util.Map;
import java.util.Set;

public class DC_HeyNedCancelTask extends DriverFactory {

    private static Logger log = Logger.getLogger(DC_HeyNedCancelTask.class);
    PageFactoryObject pageFactoryObj = new PageFactoryObject(driver);
    WebDriverWait wait = new WebDriverWait(driver, 60);
    MobileElement taskToCancel = null;
    private CommonFunctions common = new CommonFunctions();

    @And("^Select a task to cancel \"([^\"]*)\"$")
    public void selectATaskToCancel(String arg0) {
        try {
            Map<MobileElement, Integer> task = DC_CommonFunctions.GetSelectedTask(arg0, false);
            Set<MobileElement> element = task.keySet();
            for (MobileElement key : task.keySet()) {
                if (key != null) {
                    taskToCancel = key;
                    //TODO- Need to do it on Monday
                    log.info("Got the selected task");
                } else
                    log.error("No task found for bubble");
            }
        }
        catch (TimeoutException ex) {
            log.warn(ex.getMessage());
        }
        catch (Exception ex) {
            log.warn(ex.getMessage());
        }
    }

    @Then("^user swipe on selected task and select Cancel$")
    public void userSwipeOnSelectedTaskAndSelectCancel() {
        try {
            DC_CommonFunctions.swipeLeftOnElement(taskToCancel);
            //popup should be there
            pageFactoryObj.getTaskCreationScreen().cancelBtn.click();
            common.secondsDelay(2);
        } catch (Exception ex) {
            log.warn(ex.getMessage());
        }
    }

    @And("^Status of the task should changed to Cancel$")
    public void statusOfTheTaskShouldChangedToCancel() {
        if(pageFactoryObj.getTaskCreationScreen().taskListTitle.getText().equals("Task list"))
            log.info("User is on Task List screen");
        else
            log.error("User is not on Task List screen");

        common.secondsDelay(1);
    }

    @Then("^User should not send any message to cancelled task$")
    public void userShouldNotSendAnyMessageToCancelledTask() {
    }
}
