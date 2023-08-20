package platforms.ui.mobile.ios.StepDefinitions.DigitalConcierge.HeyJude;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import io.appium.java_client.MobileElement;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.ui.WebDriverWait;
import platforms.ui.mobile.ios.PageFactoryObject;
import platforms.ui.mobile.ios.StepDefinitions.DC_CommonFunctions;
import utils.CommonFunctions;
import utils.DriverFactory;
import java.util.*;

public class DC_HeyNedSearchTask extends DriverFactory {
    String textbeingSearched = null;

    private static Logger log = Logger.getLogger(DC_HeyNedSearchTask.class);
    PageFactoryObject pageFactoryObj = new PageFactoryObject(driver);
    WebDriverWait wait = new WebDriverWait(driver, 60);
    private CommonFunctions common = new CommonFunctions();

    @And("^I should be able to click on search icon$")
    public void iShouldBeAbleToClickOnSearchIcon(){
        pageFactoryObj.getTaskCreationScreen().searchIcon.click();
    }

    @And("^I enter text to search for a task \"([^\"]*)\"$")
    public void iEnterTextToSearchForATask(String arg0){
        textbeingSearched = arg0;
        pageFactoryObj.getTaskCreationScreen().searchTextBox.sendKeys(arg0);
    }

    @And("^I should be able to see the list of the task having searched text from Open and closed tab$")
    public void iShouldBeAbleToSeeTheListOfTheTaskHavingSearchedTextFromOpenAndClosedTab() {
        try {
            Map<MobileElement, Integer> Task = DC_CommonFunctions.GetSelectedTask(textbeingSearched, false);
            Set<MobileElement> element = Task.keySet();
            if (element.size() > 0)
                log.info("User gets the list of tasks having the searched test from Open and closed task");
        }catch (Exception ex) {
            log.warn(ex.getMessage());
        }
    }

    @Then("^I should get error message if no relevant tasks are present in task list$")
    public void iShouldGetErrorMessageIfNoRelevantTasksArePresentInTaskList() {
       DC_CommonFunctions.NoTaskFound();
    }

    @Then("^I should not get any error message if no tasks are present in task list$")
    public void iShouldNotGetAnyErrorMessageIfNoTasksArePresentInTaskList() {
        DC_CommonFunctions.NoTaskFound();
    }
}
