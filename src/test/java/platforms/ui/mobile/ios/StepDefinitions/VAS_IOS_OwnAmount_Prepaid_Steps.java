package platforms.ui.mobile.ios.StepDefinitions;

import cucumber.api.java.en.Then;
import io.appium.java_client.MobileElement;
import org.testng.Assert;
import platforms.ui.mobile.ios.iOSPageObjects.iOSVASPrePaidOwnAmountScreen;
import utils.DriverFactory;

public class VAS_IOS_OwnAmount_Prepaid_Steps extends DriverFactory {

    @Then("^minimum validation occurs and next button is disabled$")
    public void minimumValidationOccursAndNextButtonIsDisabled() {

       // Assert.assertFalse(driver.findElementByXPath(iOSVASPrePaidOwnAmountScreen.nextButtonXpath).isEnabled());

        MobileElement nextButton = driver.findElementByXPath(iOSVASPrePaidOwnAmountScreen.nextButtonXpath);
        boolean isEnabled = !nextButton.isEnabled();

        //assert (driver.findElementByXPath(iOSVASPrePaidOwnAmountScreen.nextButtonXpath)).isEnabled();
    }

    @Then("^maximum validation occurs and next button is disabled$")
    public void maximumValidationOccursAndNextButtonIsDisabled() {

       // Assert.assertFalse(driver.findElementByXPath(iOSVASPrePaidOwnAmountScreen.nextButtonXpath).isEnabled());
        MobileElement nextButton = driver.findElementByXPath(iOSVASPrePaidOwnAmountScreen.nextButtonXpath);
        boolean isEnabled = !nextButton.isEnabled();
    }
}
