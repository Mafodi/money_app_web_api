package platforms.ui.mobile.android.StepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import platforms.ui.mobile.android.AndroidCommonMethods;
import platforms.ui.mobile.android.AndroidFlowModel.Voucher_Flow;
import platforms.ui.mobile.android.AndroidPageObjects.VAS_Prepaid_AndroidObjects;
import utils.DriverFactory;


import java.time.Duration;

import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.PointOption.point;
import static java.time.Duration.ofMillis;

public class VAS_Voucher_AccountsSteps extends DriverFactory {
    private static Logger log = Logger.getLogger(VAS_Voucher_AccountsSteps.class);
    Voucher_Flow voucher_flow = new Voucher_Flow();


    @When("^Android user want to select other Account with funds$")
    public void androidUserWantToSelectOtherAccountWithFunds(){
        voucher_flow.Select_SufficientFunds_account();

    }


    @And("^Android user should check buy button is disabled$")
    public void androidUserShouldCheckBuyButtonIsDisabled(){
        voucher_flow.CheckBuyButton_Disabled();
    }

    @When("^Android user want to select other Account with Insufficient Funds$")
    public void androidUserWantToSelectOtherAccountWithInsufficientFunds() throws InterruptedException {
       voucher_flow.Select_AccountWith_InsufficientFunds();
    }

    @And("^Android user should check buy button is enabled$")
    public void androidUserShouldCheckBuyButtonIsEnabled(){
        voucher_flow.CheckBuyButton_IsEnabled();
    }

    @When("^Android user want to select other Sufficient funds Account$")
    public void androidUserWantToSelectOtherSufficientFundsAccount() {
      voucher_flow.Select_SufficientFundsAccount();
    }

}
