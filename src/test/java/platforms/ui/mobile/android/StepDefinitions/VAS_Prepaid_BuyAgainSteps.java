package platforms.ui.mobile.android.StepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import platforms.ui.mobile.android.AndroidFlowModel.Prepaid_Flow;
import platforms.ui.mobile.android.AndroidPageObjects.VAS_Prepaid_AndroidObjects;
import utils.DriverFactory;

import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

public class VAS_Prepaid_BuyAgainSteps extends DriverFactory {
    WebDriverWait wait = new WebDriverWait(getAndroidDriver(),30);
    private static Logger log = Logger.getLogger(VAS_Prepaid_BuyAgainSteps.class);
    public Prepaid_Flow prepaid_flow = new Prepaid_Flow();


    @And("^Android user want to Buy Again from History$")
    public void androidUserWantToBuyAgainFromHistory() {

        driver.findElementsById(VAS_Prepaid_AndroidObjects.BuyAgainFromHistory).get(0).click();
    }

    @Then("^Android user want to see history$")
    public void androidUserWantToSeeHistory() {
        prepaid_flow.See_History();
    }

    @And("^Android user want to click on ShowAll$")
    public void androidUserWantToClickOnShowAll() {
        driver.findElementById(VAS_Prepaid_AndroidObjects.ShowAll).click();
    }

    @Then("^Android user should navigate to History listing screen$")
    public void androidUserShouldNavigateToHistoryListingScreen() {
        wait.until(presenceOfElementLocated(By.xpath(VAS_Prepaid_AndroidObjects.HistoryListingScreen)));
        driver.findElementByXPath(VAS_Prepaid_AndroidObjects.HistoryListingScreen).isDisplayed();
    }

}
