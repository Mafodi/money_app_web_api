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

public class FND_Transfer_From_Current_To_Homeloan_Account extends DriverFactory {

    private AndroidCommonMethods basepage = new AndroidCommonMethods();
    public DE_AndroidDataFactory dataFactory = new DE_AndroidDataFactory();
    private static Logger log = Logger.getLogger(FND_Transfer_From_Current_To_Savings_Account.class);
    AndroidTransferScreen transferScreen=new AndroidTransferScreen(driver);
    Transfer_Flow transferFlow=new Transfer_Flow();

    public FND_Transfer_From_Current_To_Homeloan_Account(){}

    @Given("^TCuHl_User is on the Transfer screen$")
    public void tcuhl_userIsOnTheTransferScreen() throws Throwable {
        transferFlow.Navigate_To_Transfer_Screen();
    }

    @When("^TCuHl_User enters amount to transfer$")
    public void tcuhl_userEntersAmountToTransfer() throws InterruptedException {
        Thread.sleep(2000);
        transferScreen.Transfer_amount.sendKeys("1555");
    }

    @And("^TCuHl_User selects from account$")
    public void tcuhl_userSelectsFromAccount() {
        //TO DO
    }

    @And("^TCuHl_User selects to account$")
    public void tcuhl_userSelectsToAccount() {
        //TO DO
    }

    @Then("^TCuHl_User Clicking on next should take user to review transfer screen$")
    public void tcuhl_userClickingOnNextShouldTakeUserToReviewTransferScreen() {
        transferScreen.Transfer_button.click();
    }

    @And("^TCuHl_User should be able to make transfer successfully$")
    public void tcuhl_userShouldBeAbleToMakeTransferSuccessfully() {
        transferScreen.Transfer_Finish.click();
    }
}
