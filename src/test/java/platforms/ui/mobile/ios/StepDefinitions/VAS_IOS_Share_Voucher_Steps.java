package platforms.ui.mobile.ios.StepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.MobileElement;
import platforms.ui.mobile.ios.iOSPageObjects.iOSVoucherHistoryScreen;
import platforms.ui.mobile.ios.iOSPageObjects.iOSVoucherPaymentSuccessScreen;
import utils.DriverFactory;

public class VAS_IOS_Share_Voucher_Steps extends DriverFactory {

    @When("^User clicks on \"([^\"]*)\" button$")
    public void SendNowOrLaterClick(String buttonName){

        MobileElement successcreen = driver.findElementByAccessibilityId(iOSVoucherPaymentSuccessScreen.successMessage_AccessibilityID);

        if (successcreen.isDisplayed() && buttonName.equalsIgnoreCase("Send voucher")) {

            MobileElement sendNowButton = driver.findElementByAccessibilityId(iOSVoucherPaymentSuccessScreen.Send_Now_Voucher);
            sendNowButton.click();
        }

           else if (successcreen.isDisplayed() && buttonName.equalsIgnoreCase("Send later")) {

               MobileElement sendLaterButton = driver.findElementByAccessibilityId(iOSVoucherPaymentSuccessScreen.SendLater_AccessibilityID);
               sendLaterButton.click();

            }

        }

    @Then("^User is taken to IOS voucher Dashboard$")
    public void IOSVoucherDashboardIsDisplayed() {

        assert driver.findElementByAccessibilityId(iOSVoucherHistoryScreen.Buy_New_Gift_Voucher_AccessibilityID).isDisplayed();

    }

    @Then("^User can choose a way to share voucher$")
    public void userCanChooseAWayToShareVoucher() {

        assert driver.findElementByAccessibilityId(iOSVoucherPaymentSuccessScreen.Messages_AccessibilityID).isDisplayed();
    }

    @When("^User selects \"([^\"]*)\" on Purchase Successful Screen$")
    public void userSelectsOnPurchaseSuccessfulScreen(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^User clicks on Send voucher button for Vouchers$")
    public void userClicksOnSendVoucherButtonForVouchers() {

        MobileElement sendVoucher = driver.findElementByXPath(iOSVoucherPaymentSuccessScreen.SendVoucher_Xpath);
        sendVoucher.click();
    }
}



