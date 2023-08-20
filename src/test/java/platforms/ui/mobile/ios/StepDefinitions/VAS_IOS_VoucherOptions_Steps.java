package platforms.ui.mobile.ios.StepDefinitions;

import cucumber.api.java.en.And;
import io.appium.java_client.MobileElement;
import platforms.ui.mobile.ios.iOSPageObjects.iOSVoucherDetailsScreen;
import utils.DriverFactory;

public class VAS_IOS_VoucherOptions_Steps extends DriverFactory {

    @And("^User clicks on Buy voucher button$")
    public void userClicksOnBuyVoucherButton() {

        MobileElement BuyVoucherButton = driver.findElementByAccessibilityId(iOSVoucherDetailsScreen.Buy_Voucher_Accessibility_ID);
        BuyVoucherButton.click();

    }
}
