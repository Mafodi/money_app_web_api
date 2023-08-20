package platforms.ui.mobile.ios.StepDefinitions.DigitalConcierge.HeyJude;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.MobileElement;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.ui.WebDriverWait;
import platforms.ui.mobile.ios.PageFactoryObject;
import platforms.ui.mobile.ios.StepDefinitions.DC_CommonFunctions;
import utils.DriverFactory;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class DC_HeyNedRatingToAgent extends DriverFactory {

    private static Logger log = Logger.getLogger(DC_HeyNedRatingToAgent.class);
    PageFactoryObject pageFactoryObj = new PageFactoryObject(driver);
    WebDriverWait wait = new WebDriverWait(driver, 60);
    MobileElement selectedTask;


    @And("^Hey Jude agent closed the task and status of task is Rating \"([^\"]*)\"$")
    public void heyJudeAgentClosedTheTaskAndStatusOfTaskIsRating(String arg0) {
        try {
            Map<MobileElement, Integer> Task = DC_CommonFunctions.GetSelectedTask(arg0, false);
            Set<MobileElement> element = Task.keySet();
            for (MobileElement key : Task.keySet()) {
                if (key != null) {
                    selectedTask = key;
                    selectedTask.click();
                    log.info("Got the selected task");
                } else
                    log.error("No task found for bubble");
            }
        }catch (Exception ex)
        {
            log.warn(ex.getMessage());
        }
    }

    @And("^Rating form is displayed on task chat screen$")
    public void ratingFormIsDisplayedOnTaskChatScreen() {
        //Make sure user is in selected task
        MobileElement rating = pageFactoryObj.getTaskCreationScreen().npsBox;
        if (rating.isDisplayed())
            log.info("Rating is displayed");
    }

    @When("^user rates the service with four or five stars$")
    public void userRatesTheServiceWithFourOrFiveStars() {
        List<MobileElement> stars = driver.findElementsByName("lifestyleEmptyStar");
        for(int i = 1; i<stars.size(); i++) {
            stars.get(i).click();
        }
    }

    @And("^click on Submit button$")
    public void clickOnSubmitButton() {
        pageFactoryObj.getTaskCreationScreen().submitButton.click();
        log.info("clicked on Submit button");
    }

    @Then("^status of task should be Closed on task list$")
    public void statusOfTaskShouldBeClosedOnTaskList() {
        if(pageFactoryObj.getTaskCreationScreen().chatTextBoxinsideTask.size() ==0)
        {
            log.info("Task closed successfully");
        }
    }

    @When("^user rates the service with less than four stars$")
    public void userRatesTheServiceWithLessThanFourStars() {
        List<MobileElement> stars = driver.findElementsByName("lifestyleEmptyStar");
        for(int i = 1; i<3; i++) {
            stars.get(i).click();
        }
    }

    @Then("^Feedback text box should be displayed and editable$")
    public void feedbackTextBoxShouldBeDisplayedAndEditable() {
        pageFactoryObj.getTaskCreationScreen().commentTextBox.click();
    }

    @And("^I can write feedback and Submit it to Hey Jude \"([^\"]*)\"$")
    public void iCanWriteFeedbackAndSubmitItToHeyJude(String arg0) {
        pageFactoryObj.getTaskCreationScreen().commentTextBox.sendKeys(arg0);
    }
}
