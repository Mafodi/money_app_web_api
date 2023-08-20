package platforms.ui.mobile.ios.StepDefinitions;

import com.github.javafaker.Faker;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.MobileElement;
import org.junit.Assert;
import org.openqa.selenium.By;
import platforms.ui.mobile.ios.IOSCommonMethods;
import platforms.ui.mobile.ios.VASIOSDataFactory;
import platforms.ui.mobile.ios.VASIOSObjects;
import platforms.ui.mobile.ios.VASIOSValidationMessages;
import utils.DriverFactory;

import java.util.concurrent.TimeUnit;

public class VAS_IOS_AddRecipientSteps extends DriverFactory {

    IOSCommonMethods commonMethods = new IOSCommonMethods();
    Faker faker = new Faker();

    public String recipient = faker.name().fullName();


    @And("^IosUser searches for new Recipient")
    public void iosuserSearchesForNew() {

        MobileElement recipientSearch = driver.findElementByXPath(VASIOSObjects.RECIPIENT_SEARCH_TEXT);
        recipientSearch.click();
        //recipientSearch.sendKeys(IOSDataFactory.RECIPIENT_NAME);
        recipientSearch.sendKeys(recipient);
        //iosBasePage.sa(recipient, "src/prepaidLoginSteps/features/mobile/iOS/IOSDataStore/GenericData.txt");

    }

    @And("^Ios User clicks on Add new Recipient button$")
    public void iosUserClicksOnAddNewRecipientButton() {

        MobileElement addRecipientButton = driver.findElementByAccessibilityId(VASIOSObjects.ADD_NEW_RECIPIENT);
        addRecipientButton.click();
    }

    @And("^Ios User captures Mobile Number")
    public void iosUserCapturesMobileNumber() {
        int num = commonMethods.phoneNumberGenerator();
        String mobileNumber = "0" + num;
        MobileElement mobileNum = driver.findElementByAccessibilityId(VASIOSObjects.NEW_RECIPIENT_MOBILE_NO);
        mobileNum.sendKeys(mobileNumber);

    }


    @When("^Ios User selects Next button to purchase pre-paid product$")
    public void iosUserSelectsNextButtonToPurchasePrePaidProduct() {

        MobileElement nextButton = driver.findElementByAccessibilityId(VASIOSObjects.NEXT_BUTTON_NEW_RECIPIENT);
        nextButton.click();


    }

    @Then("^Ios User should see successful message$")
    public void iosUserShouldSeeSuccessfulMessage() {

    }

    @Then("^new Recipient name appears in Recipient Name field$")
    public void RecipientNameAppearsInRecipientNameField() {

        MobileElement recipientName = driver.findElementByAccessibilityId(VASIOSObjects.RECIPIENT_NAME_TEXT);
        String expectedValue = recipient;
        String actualValue = recipientName.getText();
        if (expectedValue.equals(actualValue)) {

            System.out.println("Recipient name is correct");

        }
        else

            System.out.println("Recipient Text Values are not the same");
    }


    @When("^IosUser edits Recipient and add new Recipient$")
    public void iosuserEditsRecipientAndAddNewRecipient() {

        MobileElement recipientName = driver.findElementByAccessibilityId(VASIOSObjects.RECIPIENT_NAME_TEXT);
        recipientName.clear();
        recipientName.sendKeys(VASIOSDataFactory.RECIPIENT_NAME);

    }

    @Then("^Recipient name is updated$")
    public void recipientNameIsUpdated() {

        MobileElement recipientName = driver.findElementByAccessibilityId(VASIOSObjects.RECIPIENT_NAME_TEXT);
        String actualValue = recipientName.getText();
        String expectedValue = VASIOSDataFactory.RECIPIENT_NAME;

        Assert.assertEquals(actualValue,expectedValue);

    }

    @When("^user enters \"([^\"]*)\" for phone number$")
    public void EntersForPhoneNumberForRecipient(String phoneNumber)  {

        MobileElement mobileNum = driver.findElementByAccessibilityId(VASIOSObjects.NEW_RECIPIENT_MOBILE_NO);
        mobileNum.sendKeys(phoneNumber);

    }

    @Then("^next button to Add Recipient is disabled$")
    public void ButtonToAddRecipientIsDisabled() {

        MobileElement recipientNextButton = driver.findElementByAccessibilityId(VASIOSObjects.NEXT_BUTTON_NEW_RECIPIENT);
        Assert.assertFalse(recipientNextButton.isEnabled());
    }

    @When("^IosUser leaves phone number blank$")
    public void LeavesPhoneNumberBlank() {

        MobileElement mobileNum = driver.findElementByAccessibilityId(VASIOSObjects.NEW_RECIPIENT_MOBILE_NO);
        mobileNum.click();
        MobileElement recipientName = driver.findElementByAccessibilityId(VASIOSObjects.RECIPIENT_NAME_TEXT);
        recipientName.click();

    }

    @Then("^enter phone number validation occurs$")
    public void enterPhoneNumberValidationOccurs() {

        assert driver.findElementsByClassName("UIAccessibilityTextFieldElement").contains(VASIOSValidationMessages.EnterPhoneNumber);


    }

    @When("^IosUser removes Recipient name and moves off field$")
    public void iosuserRemovesRecipientNameAndMovesOffField() {

        MobileElement recipientName = driver.findElementByAccessibilityId(VASIOSObjects.RECIPIENT_NAME_TEXT);
        recipientName.clear();
        MobileElement mobileNum = driver.findElementByAccessibilityId(VASIOSObjects.NEW_RECIPIENT_MOBILE_NO);
        mobileNum.click();

    }

    @Then("^enter recipient validation occurs$")
    public void enterRecipientValidationOccurs() {


        assert driver.findElementsByClassName("UIAccessibilityTextFieldElement").contains(VASIOSValidationMessages.EnterRecipient);


    }

    @Then("^Ios User is on Provider Selection Screen$")
    public void iosUserIsOnProviderSelectionScreen() {

        assert driver.findElement(By.name("Buy airtime and bundles")).isDisplayed();
    }

    @And("^IOS user taps on Buy New button$")
    public void iosUserTapsOnBuyNewButton() {

        MobileElement buyButton = driver.findElementByXPath(VASIOSObjects.BUY_NEW_BUTTON);
        //WebDriverWait wait = new WebDriverWait(driver,30);
        //wait.until(ExpectedConditions.visibilityOf(By.xpath(IOSObjects.BUY_NEW_BUTTON)
        // wait.until(ExpectedConditions.elementToBeClickable(buyButton));
        driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
        buyButton.click();

    }


}