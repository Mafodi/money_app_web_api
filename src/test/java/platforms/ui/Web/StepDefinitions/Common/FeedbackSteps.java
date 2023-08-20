package platforms.ui.Web.StepDefinitions.Common;

import cucumber.api.java.en.And;
import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import platforms.ui.Web.Pages.Common.FeedbackPage;
import utils.Utils;

public class FeedbackSteps  extends Utils {

    public FeedbackPage feedbackPage = PageFactory.initElements(driver, FeedbackPage.class);
    private static Logger log = Logger.getLogger(DashboardSteps.class);
    WebDriverWait wait = new WebDriverWait(driver,10);


    @And("^user options to be back later$")
    public void userOptionsToBeBackLater() {

        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",feedbackPage.IllBeBack);

        feedbackPage.SendFeedback.click();
    }
}
