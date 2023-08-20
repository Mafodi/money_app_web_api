package platforms.ui.mobile.android.StepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import platforms.ui.mobile.android.AndroidFlowModel.Voucher_Flow;
import platforms.ui.mobile.android.AndroidPageObjects.VAS_Voucher_AndroidObjects;
import platforms.ui.mobile.android.VAS_AndroidDataFactory;
import utils.DriverFactory;

public class VAS_Voucher_ValidationSteps extends DriverFactory {
    private static Logger log = Logger.getLogger(VAS_Voucher_ValidationSteps.class);
    WebDriverWait wait = new WebDriverWait(getAndroidDriver(),40);
    Voucher_Flow voucher_flow = new Voucher_Flow();

    @And("^Android User want to enter their own amount$")
    public void androidUserWantToEnterTheirOwnAmount() {
        driver.findElementById(VAS_Voucher_AndroidObjects.OwnAmountEdit).sendKeys("5");
    }

    @And("^Android user should see error message$")
    public void androidUserShouldSeeErrorMessage() {
        driver.findElementById(VAS_Voucher_AndroidObjects.OwnAmountError).isDisplayed();
    }

    @And("^Android buy voucher button should be disabled$")
    public void androidBuyVoucherButtonShouldBeDisabled() {
       voucher_flow.BuyVoucherButton_Disabled();
    }

    @And("^Android user want to reEnter Own Amount$")
    public void androidUserWantToReEnterOwnAmount() {
        driver.findElementById(VAS_Voucher_AndroidObjects.OwnAmountEdit).clear();
        driver.findElementById(VAS_Voucher_AndroidObjects.OwnAmountEdit).sendKeys(VAS_AndroidDataFactory.OwnAmount);
    }

    @And("^Android user should see buy button is Enabled$")
    public void androidUserShouldSeeBuyButtonIsEnabled() {
       voucher_flow.BuyButton_Enabled();
    }

    @And("^Android User want to enter own amount$")
    public void androidUserWantToEnterOwnAmount() {
        driver.findElementById(VAS_Voucher_AndroidObjects.OwnAmountEdit).sendKeys("1000");
    }

    @And("^Android User want to check Own Amount voucher details$")
    public void androidUserWantToCheckOwnAmountVoucherDetails() {
       voucher_flow.CheckOwnAmount_VoucherDetails();
    }


}
