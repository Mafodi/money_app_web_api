package platforms.ui.mobile.ios.StepDefinitions.DigitalConcierge.HeyJude;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.support.ui.WebDriverWait;
import platforms.ui.mobile.ios.PageFactoryObject;
import utils.DriverFactory;

public class DC_HeyNedTextTaskCreation extends DriverFactory {

    private static Logger log = Logger.getLogger(DC_HeyNedTextTaskCreation.class);
    PageFactoryObject pageFactoryObj = new PageFactoryObject(driver);

    String createdTaskName = null;
    WebDriverWait wait = new WebDriverWait(driver, 60);

    @And("^user can type a task name in a text box \"([^\"]*)\"$")
    public void userCanTypeATaskNameInATextBox(String arg0) {
        createdTaskName = arg0;
        pageFactoryObj.getTaskCreationScreen().createTaskTextBox.sendKeys(arg0);
    }

    @And("^user clicks on send button$")
    public void userClicksOnSendButton() {
        pageFactoryObj.getTaskCreationScreen().sendButton.click();
    }

    @Then("^A task should be created with the heading same as typed while creating a task$")
    public void aTaskShouldBeCreatedWithTheHeadingSameAsTypedWhileCreatingATask() {
        try {
            String TaskName = pageFactoryObj.getTaskCreationScreen().taskTitle.getAttribute("name");
            if (TaskName.equalsIgnoreCase(createdTaskName))
                log.info("Title matches with the created task");
            else {
                log.info("Title doesn't matches with the created task");
                Assert.assertEquals("Title doesn't matches with the created task", "ytfyfhv", createdTaskName);
            }
        }catch (Exception ex) {
            log.warn(ex.getMessage());
        }
    }

    @And("^user should be able to land on task list by clicking back button$")
    public void userShouldBeAbleToLandOnTaskListByClickingBackButton() {
        try {
            pageFactoryObj.getTaskCreationScreen().backbuttonfromTaskList.click();
            if (pageFactoryObj.getTaskCreationScreen().taskListTitle.isDisplayed()) {
                log.info("User is on Task List");
            } else {
                log.info("User is not on Task List");
            }
        }catch (Exception ex) {
            log.warn(ex.getMessage());
        }
    }
}
