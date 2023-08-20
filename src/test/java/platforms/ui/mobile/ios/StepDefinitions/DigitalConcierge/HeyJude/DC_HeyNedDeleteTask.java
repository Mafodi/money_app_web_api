package platforms.ui.mobile.ios.StepDefinitions.DigitalConcierge.HeyJude;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import io.appium.java_client.MobileElement;
import org.apache.log4j.Logger;
import platforms.ui.mobile.ios.PageFactoryObject;
import platforms.ui.mobile.ios.StepDefinitions.DC_CommonFunctions;
import utils.CommonFunctions;
import utils.DriverFactory;

import java.util.Map;
import java.util.Set;

public class DC_HeyNedDeleteTask extends DriverFactory {

    MobileElement selectedTask = null;
    private static Logger log = Logger.getLogger(DC_HeyNedDeleteTask.class);
    PageFactoryObject pageFactoryObj = new PageFactoryObject(driver);
    private CommonFunctions common = new CommonFunctions();


    @And("^Select a \"([^\"]*)\" to delete by searching a task$")
    public void selectAToDeleteBySearchingATask(String arg0) throws Throwable {
        try {
            Map<MobileElement, Integer> task = DC_CommonFunctions.GetSelectedTask(arg0, false);
            Set<MobileElement> element = task.keySet();
            for (MobileElement key : task.keySet()) {

                if (key != null) {
                    selectedTask = key;
                    log.info("Got the selected task");
                } else
                    log.error("No task found for bubble");
            }
        }
        catch (Exception ex)
        {
            log.warn(ex.getMessage());
        }
    }

    @And("^user select the task and swipe to delete$")
    public void userSelectTheTaskAndSwipeToDelete() throws Throwable {
        try {
            DC_CommonFunctions.swipeLeftOnElement(selectedTask);
        }catch (Exception ex)
        {
            log.warn(ex.getMessage());
        }
    }

    @And("^user clicks on Delete task button$")
    public void userClicksOnDeleteTaskButton() {
        pageFactoryObj.getTaskCreationScreen().deleteBtn.click();
        //common.secondsDelay(2);
    }

    @And("^Delete task popup should gets displayed$")
    public void deleteTaskPopupShouldGetsDisplayed() {
        if (pageFactoryObj.getTaskCreationScreen().deleteTaskPopUp.isDisplayed())
            log.info("Delete Task Popup is displayed");
        else
            log.error("Delete task Popup is not displayed");
    }

    @And("^user clicks on No button$")
    public void userClicksOnNoButton() {
        pageFactoryObj.getTaskCreationScreen().noPopUpBtn.click();
        log.info("User clicks on No button");
    }

    @Then("^Delete popup will gets disappear and Task list screen should be active$")
    public void deletePopupWillGetsDisappearAndTaskListScreenShouldBeActive() {
        if (pageFactoryObj.getTaskCreationScreen().taskListTitle.isDisplayed())
            log.info("Task list gets displayed");
        else
            log.error("Task list is still deactive");
    }

    @And("^user clicks on Yes button$")
    public void userClicksOnYesButton() {
            pageFactoryObj.getTaskCreationScreen().yesPopUpBtn.click();
            log.info("User clicks on Yes button");
        common.secondsDelay(2);

    }
}
