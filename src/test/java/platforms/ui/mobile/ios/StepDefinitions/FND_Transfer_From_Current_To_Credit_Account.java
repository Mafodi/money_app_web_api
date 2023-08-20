package platforms.ui.mobile.ios.StepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.ui.WebDriverWait;
import platforms.ui.mobile.ios.IOSCommonMethods;
import platforms.ui.mobile.ios.iOSFlowModel.iOSTransfer_Flow;
import platforms.ui.mobile.ios.iOSPageObjects.iOSTransferScreen;
import utils.DriverFactory;

public class FND_Transfer_From_Current_To_Credit_Account extends DriverFactory {

    WebDriverWait wait=new WebDriverWait(getIOSDriver(),30);
    private IOSCommonMethods basepage = new IOSCommonMethods();
    private static Logger log = Logger.getLogger(FND_Transfer_From_Current_To_Savings_Account.class);
    iOSTransferScreen transferScreen=new iOSTransferScreen(driver);
    iOSTransfer_Flow transferFlow=new iOSTransfer_Flow();
    TouchAction touchAction=new TouchAction(driver);

    public FND_Transfer_From_Current_To_Credit_Account(){}

    @Given("^TCuCr_User is on the Transfer screen ios app$")
    public void tcucr_userIsOnTheTransferScreenIosApp() throws Throwable {
        transferFlow.Navigate_To_Transfer_Screen();
    }

    @When("^TCuCr_User enters amount to transfer ios app$")
    public void tcucr_userEntersAmountToTransferIosApp() throws InterruptedException {
        Thread.sleep(2000);
        transferScreen.Transfer_amount.sendKeys("155");
        touchAction.tap(PointOption.point(41,311)).perform();
    }

    @And("^TCuCr_User selects from account ios app$")
    public void tcucr_userSelectsFromAccountIosApp() throws InterruptedException {
        //Current account selected by default
        basepage.scrollPage("down");
        Thread.sleep(1000);
    }

    @And("^TCuCr_User selects to account ios app$")
    public void tcucr_userSelectsToAccountIosApp() {
        basepage.horizontalSwipeByPercentage(0.6,0.1,0.3);
        basepage.horizontalSwipeByPercentage(0.6,0.1,0.3);
        basepage.horizontalSwipeByPercentage(0.6,0.1,0.3);
        basepage.horizontalSwipeByPercentage(0.6,0.1,0.3);
        basepage.horizontalSwipeByPercentage(0.6,0.1,0.3);
    }

    @Then("^TCuCr_User Clicking on next should take user to review transfer screen ios app$")
    public void tcucr_userClickingOnNextShouldTakeUserToReviewTransferScreenIosApp() throws InterruptedException {
        Thread.sleep(1000);
        transferScreen.Transfer_next.click();
        transferScreen.Transfer_button.click();
    }

    @And("^TCuCr_User should be able to make transfer successfully ios app$")
    public void tcucr_userShouldBeAbleToMakeTransferSuccessfullyIosApp() throws InterruptedException {
        Thread.sleep(2000);
        transferScreen.Transfer_Finish.click();
    }
}
