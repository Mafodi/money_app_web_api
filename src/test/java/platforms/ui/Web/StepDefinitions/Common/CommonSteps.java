package platforms.ui.Web.StepDefinitions.Common;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import platforms.ui.Web.Pages.Common.DashboardPage;
import utils.CommonFunctions;
import utils.Utils;

import java.util.concurrent.TimeUnit;


public class CommonSteps extends Utils {

     public DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
     private static Logger log = Logger.getLogger(CommonSteps.class);
     WebDriverWait wait = new WebDriverWait(driver,10);
     CommonFunctions commonFunctions = new CommonFunctions();


    @When("^user clicks notification icon$")
    public void user_clicks_notification_icon() {

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("notify-icon")));
        dashboardPage.NotificationIcon.click();

    }

    @Then("^user should see notifications$")
    public void user_should_see_notifications() throws Throwable {

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        if(dashboardPage.NotificationText.isDisplayed()) {

            String actualTitle = dashboardPage.NotificationText.getText();
            String expectedTitle = "Notifications";
            Assert.assertEquals(actualTitle,expectedTitle);

        }
    }

    @When("^user clicks on for you$")
    public void user_clicks_on_for_you() throws Throwable {
        dashboardPage.ForYouButton.click();
    }

    @When("^user selects offer from list \"([^\"]*)\"$")
    public void user_selects_offer_from_list(String offerDescription) throws Throwable {

            commonFunctions.selectOffer(offerDescription );

    }

    @Then("^user cancels application$")
    public void userCancelsApplication() {

        dashboardPage.Exit.click();
    }
}
