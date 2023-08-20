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

public class FND_Transfer_From_Current_To_Investment_Account extends DriverFactory {

    private AndroidCommonMethods basepage = new AndroidCommonMethods();
    public DE_AndroidDataFactory dataFactory = new DE_AndroidDataFactory();
    private static Logger log = Logger.getLogger(FND_Transfer_From_Current_To_Savings_Account.class);
    AndroidTransferScreen transferScreen=new AndroidTransferScreen(driver);
    Transfer_Flow transferFlow=new Transfer_Flow();

    @Given("^TCuInv_User is on the Transfer screen$")
    public void tcuinv_userIsOnTheTransferScreen() throws Throwable {
        transferFlow.Navigate_To_Transfer_Screen();
    }

    @When("^TCuInv_User enters amount to transfer$")
    public void tcuinv_userEntersAmountToTransfer() throws InterruptedException {
        Thread.sleep(2000);
        transferScreen.Transfer_amount.sendKeys("1555");
    }

    @And("^TCuInv_User selects from account$")
    public void tcuinv_userSelectsFromAccount() {
        //TO DO
    }

    @And("^TCuInv_User selects to account$")
    public void tcuinv_userSelectsToAccount() {
        //TO DO
    }

    @Then("^TCuInv_User Clicking on next should take user to review transfer screen$")
    public void tcuinv_userClickingOnNextShouldTakeUserToReviewTransferScreen() {
        transferScreen.Transfer_button.click();
    }

    @And("^TCuInv_User should be able to make transfer successfully$")
    public void tcuinv_userShouldBeAbleToMakeTransferSuccessfully() {
        transferScreen.Transfer_Finish.click();
    }
}
