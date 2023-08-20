package platforms.ui.mobile.android.StepDefinitions;



import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.ui.WebDriverWait;
import platforms.ui.mobile.android.AndroidFlowModel.Prepaid_Flow;
import platforms.ui.mobile.android.AndroidPageObjects.VAS_Prepaid_AndroidObjects;
import utils.DriverFactory;



public class VAS_Prepaid_ErrorValidationsSteps extends DriverFactory {
    private static Logger log = Logger.getLogger(VAS_Prepaid_ErrorValidationsSteps.class);
    WebDriverWait wait = new WebDriverWait(getAndroidDriver(),60);
    Prepaid_Flow prepaid_flow = new Prepaid_Flow();

    @And("^Android user want to add Recipient to see error message$")
    public void androidUserWantToAddRecipientToSeeErrorMessage() {
        prepaid_flow.AddRecipient_ToSee_ErrorMessage();
    }

    @And("^Android user do not want to add beneficiary$")
    public void androidUserDoNotWantToAddBeneficiary() {
        driver.findElementById(VAS_Prepaid_AndroidObjects.SaveBeneficiarySwitch).click();
    }

    @And("^Android user want to enter incorrect number$")
    public void androidUserWantToEnterIncorrectNumber() {
        driver.findElementsById(VAS_Prepaid_AndroidObjects.EditField).get(0).sendKeys("9383932222");
    }

    @When("^Android user want to change Recipient$")
    public void androidUserWantToChangeRecipient() {
        driver.findElementById(VAS_Prepaid_AndroidObjects.ChangeRecipientBtn).click();
    }

    @Then("^Android user should navigate back to Recipient screen$")
    public void androidUserShouldNavigateBackToRecipientScreen() {
        driver.findElementById(VAS_Prepaid_AndroidObjects.SelectPhoneContacts).isDisplayed();
    }

    @When("^Android user click on back button$")
    public void androidUserClickOnBackButton() {
        driver.findElementByAccessibilityId(VAS_Prepaid_AndroidObjects.BackBtn).click();
    }
}
