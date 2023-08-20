package platforms.ui.mobile.android.StepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import platforms.ui.mobile.android.AndroidCommonMethods;
import platforms.ui.mobile.android.AndroidFlowModel.Voucher_Flow;
import platforms.ui.mobile.android.AndroidPageObjects.VAS_Voucher_AndroidObjects;
import utils.DriverFactory;


public class VAS_Voucher_TermsCondSteps extends DriverFactory {
    private static Logger log = Logger.getLogger(VAS_Voucher_TermsCondSteps.class);
    WebDriverWait wait = new WebDriverWait(getAndroidDriver(),40);
    Voucher_Flow voucher_flow = new Voucher_Flow();
    public String TermsCond;


    @When("^Android User clicks on Cancel Transaction$")
    public void androidUserClicksOnCancelTransaction() {
       voucher_flow.Clicks_CancelTransaction();
    }

    @Then("^User should navigate to Voucher category screen$")
    public void userShouldNavigateToVoucherCategoryScreen() {
       voucher_flow.Navigate_VoucherCategoryScreen();
    }

    @And("^Android User should see VAS T's and C's$")
    public void androidUserShouldSeeVASTSAndCS() {
       voucher_flow.Should_SeeVASTSAndCS();
    }

    @When("^Android user clicks on T's and C's$")
    public void androidUserClicksOnTSAndCS() {
//        Actions action = new Actions(driver);
//        action.moveToElement(driver.findElementByXPath("//android.widget.TextView[@text='"+ TermsCond +"']"));
//        action.perform();


//        driver.findElementByXPath("//android.widget.TextView[@text='"+ TermsCond +"']").click();
    }

    @Then("^Android user should navigate to Terms screen$")
    public void androidUserShouldNavigateToTermsScreen() {
        MobileElement TermsScreen = driver.findElementByXPath(VAS_Voucher_AndroidObjects.TermsScreen);
        TermsScreen.isDisplayed();
    }

    @And("^User clicks on back button$")
    public void userClicksOnBackButton() {
        driver.findElementById(VAS_Voucher_AndroidObjects.BackBtn).click();
    }

    @Then("^user should navigate to VAS landing screen$")
    public void userShouldNavigateToVASLandingScreen() {
        MobileElement buyVoucher = driver.findElement(By.xpath(VAS_Voucher_AndroidObjects.SelectVouchers));
        buyVoucher.isDisplayed();
    }

    @And("^Android user want to Navigate back$")
    public void androidUserWantToNavigateBack() {
        driver.findElementByAccessibilityId("Navigate up").click();
    }
}
