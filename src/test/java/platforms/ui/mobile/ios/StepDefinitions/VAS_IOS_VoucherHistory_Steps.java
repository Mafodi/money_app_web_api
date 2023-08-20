package platforms.ui.mobile.ios.StepDefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.MobileElement;
import platforms.ui.mobile.ios.iOSPageObjects.iOSVoucherHistoryScreen;
import utils.DriverFactory;

public class VAS_IOS_VoucherHistory_Steps extends DriverFactory {

    @Then("^Voucher History displays on Voucher DashBoard$")
    public void voucherHistoryDisplaysOnVoucherDashBoard() {




    }

    @When("^User selects Show all from Voucher History$")
    public void userSelectsShowAllFromVoucherHistory() {

        MobileElement showAllArrow = driver.findElementByAccessibilityId(iOSVoucherHistoryScreen.Show_AllArrow_AccessibilityID);
        showAllArrow.click();
    }

    @Then("^My voucher history screen displays$")
    public void myVoucherHistoryScreenDisplays() {

        assert driver.findElementByXPath(iOSVoucherHistoryScreen.All_vouchers_Xpath).isDisplayed();
    }
}
