package platforms.ui.mobile.android.StepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import io.appium.java_client.android.AndroidElement;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import platforms.ui.Web.FlowModel.Vouchers_Flow;
import platforms.ui.mobile.android.AndroidCommonMethods;
import platforms.ui.mobile.android.AndroidFlowModel.Voucher_Flow;
import utils.DriverFactory;

public class VAS_Voucher_GreenbacksPurchaseSteps extends DriverFactory {
    private static Logger log = Logger.getLogger(VAS_Voucher_GreenbacksPurchaseSteps.class);
    WebDriverWait wait = new WebDriverWait(getAndroidDriver(),40);
    Voucher_Flow voucher_flow = new Voucher_Flow();


    @Then("^Android user want to buy with another account$")
    public void android_user_want_to_buy_with_another_account(){
        AndroidElement ele1 = (AndroidElement) driver.findElementById("clnrContainer");
        voucher_flow.swipeElementWithDirection(ele1, Voucher_Flow.DIRECTION.LEFT,1.5);
    }

    @And("^Android user want to buy with sufficient funds account$")
    public void androidUserWantToBuyWithSufficientFundsAccount() {
        AndroidElement ele1 = (AndroidElement) driver.findElementById("clnrContainer");
        voucher_flow.swipeElementWithDirection(ele1, Voucher_Flow.DIRECTION.RIGHT,1.5);
    }
}
