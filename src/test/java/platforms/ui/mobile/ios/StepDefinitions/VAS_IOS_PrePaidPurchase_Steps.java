package platforms.ui.mobile.ios.StepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.Keys;
import platforms.ui.mobile.ios.iOSPageObjects.iOSVASPrePaidPurchaseDetailsScreen;
import utils.DriverFactory;

public class VAS_IOS_PrePaidPurchase_Steps extends DriverFactory {
    @And("^User enters number \"([^\"]*)\" for phone number$")
    public void EnterPrepaidNumberRecipient(String phoneNumber) {

        MobileElement phoneNumberTextField = driver.findElementByAccessibilityId(iOSVASPrePaidPurchaseDetailsScreen.PhoneNumberAccessibilityID);
        phoneNumberTextField.clear();
        phoneNumberTextField.sendKeys(phoneNumber);
        phoneNumberTextField.sendKeys(Keys.ENTER);

    }


    @Then("^Validation message to enter a valid phone number should appear$")
    public void validationMessageToEnterAValidPhoneNumberShouldAppear() {

        assert driver.findElementByXPath(iOSVASPrePaidPurchaseDetailsScreen.ValidPhoneNumberValidation_Xpath).isDisplayed();

        //assert validPhoneNumberValidation.isDisplayed();
    }

    @When("^User leaves Recipient name empty$")
    public void userLeavesRecipientNameEmpty() {

        MobileElement recipientNamefield = driver.findElementByXPath(iOSVASPrePaidPurchaseDetailsScreen.RecipientName_Xpath);
        recipientNamefield.click();
        recipientNamefield.sendKeys(Keys.ENTER);

    }
}
