package platforms.ui.mobile.ios.StepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import io.appium.java_client.MobileElement;
import platforms.ui.mobile.ios.iOSPageObjects.iOSVoucherDetailsScreen;
import utils.DriverFactory;

public class VAS_IOS_VoucherDetails_Steps extends DriverFactory {

    @Then("^Voucher details are correct$")
    public void voucherDetailsAreCorrect() {

        assert driver.findElementByAccessibilityId(iOSVoucherDetailsScreen.DeezerLabel_AccessibilityID).isDisplayed();
    }

    @And("^User selects Next on Voucher details screen$")
    public void userSelectsNextOnVoucherDetailsScreen() {

        MobileElement nextButton = driver.findElementByXPath(iOSVoucherDetailsScreen.Next_Button_Xpath);
        nextButton.click();
    }


}
