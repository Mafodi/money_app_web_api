package platforms.ui.Web.StepDefinitions.Small_Business_Enablement.businessAccount;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.log4j.Logger;
import platforms.ui.Web.FlowModel.SBE.Business_Account;


public class Business_Account_Selection {

    private static Logger log = Logger.getLogger(Business_Account_Selection.class);

    //===================================== Business Pay-As-You-Use ===============================================

    @When("^User selects BUSINESS PAY AS YOU USE option on Business Account screen$")
    public void userSelectsBUSINESSPAYASYOUUSEOptionOnBusinessAccountScreen() {
        // Write code here that turns the phrase above into concrete actions

        Business_Account.selectBusinessPayAsYouUse();
    }

    //===================================== BUSINESSBUNDLE2Selection =======================================

    @When("^User selects BUSINESS BUNDLE 35 option$")
    public void userSelectsBUSINESSBUNDLE35Option()
    {

        Business_Account.selectBusinessBundle35();
    }

    //===================================== BUSINESSCURRENTACCOUNTSelection ================================

    @When("^User selects BUSINESS BUNDLE 60 option$")
    public void userSelectsBUSINESSBUNDLE60Option()
    {

        Business_Account.selectBusinessBundle60();
    }

    @Then("^User close the browser$")
    public void user_close_the_browser(){

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        Business_Account.closeDriver();
    }


}
