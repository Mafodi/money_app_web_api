package platforms.ui.mobile.android.StepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.log4j.Logger;
import platforms.ui.mobile.android.AndroidCommonMethods;
import platforms.ui.mobile.android.AndroidFlowModel.Transfer_Flow;
import platforms.ui.mobile.android.AndroidPageObjects.AndroidTransferScreen;
import platforms.ui.mobile.android.DE_AndroidDataFactory;
import utils.DriverFactory;

public class FND_Transfer_From_Credit_To_Credit_Account extends DriverFactory {

    private AndroidCommonMethods basepage = new AndroidCommonMethods();
    public DE_AndroidDataFactory dataFactory = new DE_AndroidDataFactory();
    private static Logger log = Logger.getLogger(FND_Transfer_From_Current_To_Savings_Account.class);
    AndroidTransferScreen transferScreen=new AndroidTransferScreen(driver);
    Transfer_Flow transferFlow=new Transfer_Flow();

    public FND_Transfer_From_Credit_To_Credit_Account(){}

    @Given("^TCrCr_User is on the Transfer screen$")
    public void tcrcr_userIsOnTheTransferScreen() throws Throwable {
        transferFlow.Navigate_To_Transfer_Screen();
    }

    @When("^TCrCr_User enters amount to transfer$")
    public void tcrcr_userEntersAmountToTransfer() throws InterruptedException {
        Thread.sleep(2000);
        transferScreen.Transfer_amount.sendKeys("15555");
    }

    @And("^TCrCr_User selects from account$")
    public void tcrcr_userSelectsFromAccount() throws InterruptedException {

        try{
            AndroidCommonMethods.directionSwipe(AndroidCommonMethods.DIRECTION.RIGHT);
            AndroidCommonMethods.directionSwipe(AndroidCommonMethods.DIRECTION.RIGHT);
            AndroidCommonMethods.directionSwipe(AndroidCommonMethods.DIRECTION.RIGHT);
            AndroidCommonMethods.directionSwipe(AndroidCommonMethods.DIRECTION.RIGHT);
            AndroidCommonMethods.directionSwipe(AndroidCommonMethods.DIRECTION.RIGHT);
            AndroidCommonMethods.directionSwipe(AndroidCommonMethods.DIRECTION.RIGHT);
        }catch(Exception e){
            log.info("Unable to swipe",e);
        }
        Thread.sleep(2000);
        basepage.android_scroll_down(1);
    }

    @And("^TCrCr_User selects to account$")
    public void tcrcr_userSelectsToAccount() throws InterruptedException {
        try{
            AndroidCommonMethods.directionSwipe(AndroidCommonMethods.DIRECTION.RIGHT);
            AndroidCommonMethods.directionSwipe(AndroidCommonMethods.DIRECTION.RIGHT);
            AndroidCommonMethods.directionSwipe(AndroidCommonMethods.DIRECTION.RIGHT);
            AndroidCommonMethods.directionSwipe(AndroidCommonMethods.DIRECTION.RIGHT);
            AndroidCommonMethods.directionSwipe(AndroidCommonMethods.DIRECTION.RIGHT);
            AndroidCommonMethods.directionSwipe(AndroidCommonMethods.DIRECTION.RIGHT);
            AndroidCommonMethods.directionSwipe(AndroidCommonMethods.DIRECTION.RIGHT);
            AndroidCommonMethods.directionSwipe(AndroidCommonMethods.DIRECTION.RIGHT);
        }catch(Exception e){
            log.info("Unable to swipe",e);
        }
        Thread.sleep(2000);
        basepage.android_scroll_down(1);
        transferScreen.Transfer_button.click();
    }

    @Then("^TCrCr_User Clicking on next should take user to review transfer screen$")
    public void tcrcr_userClickingOnNextShouldTakeUserToReviewTransferScreen() throws InterruptedException {
        Thread.sleep(2000);
        transferScreen.Transfer_button.click();
    }

    @And("^TCrCr_User should be able to make transfer successfully$")
    public void tcrcr_userShouldBeAbleToMakeTransferSuccessfully() {
        transferScreen.Transfer_Finish.click();
    }
}
