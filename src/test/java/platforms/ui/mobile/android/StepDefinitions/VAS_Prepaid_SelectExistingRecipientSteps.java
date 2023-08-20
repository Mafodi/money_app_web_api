package platforms.ui.mobile.android.StepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.log4j.Logger;
import platforms.ui.mobile.android.AndroidFlowModel.Prepaid_Flow;
import platforms.ui.mobile.android.AndroidPageObjects.VAS_Prepaid_AndroidObjects;
import utils.DriverFactory;

import java.util.concurrent.TimeUnit;

public class VAS_Prepaid_SelectExistingRecipientSteps extends DriverFactory {
    private static Logger log = Logger.getLogger(VAS_Prepaid_SelectExistingRecipientSteps.class);
    public Prepaid_Flow prepaid_flow = new Prepaid_Flow();

    @When("^Android user want to buy for Existing Recipients$")
    public void androidUserWantToBuyForExistingRecipients() {
        prepaid_flow.Buy_For_Existing_Recipient();
    }

    @Then("^Android user navigates to Recipient Search screen$")
    public void androidUserNavigatesToRecipientSearchScreen() {
        driver.findElementByXPath(VAS_Prepaid_AndroidObjects.SearchScreen).isDisplayed();
    }

    @And("^Android user should select \"([^\"]*)\"$")
    public void androidUserShouldSelect(String Recipient) {
        driver.findElementById(VAS_Prepaid_AndroidObjects.EditField).sendKeys(Recipient);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElementsById(VAS_Prepaid_AndroidObjects.FirstRecipient).get(0).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @And("^Android user should navigate to Purchase details screen$")
    public void androidUserShouldNavigateToPurchaseDetailsScreen() {
        driver.findElementByXPath(VAS_Prepaid_AndroidObjects.PurchaseDetScreen).isDisplayed();

    }

    @And("^Android user want to click on finish$")
    public void androidUserWantToClickOnFinish() {
        driver.findElementByXPath(VAS_Prepaid_AndroidObjects.FinishButton).click();
    }

}
