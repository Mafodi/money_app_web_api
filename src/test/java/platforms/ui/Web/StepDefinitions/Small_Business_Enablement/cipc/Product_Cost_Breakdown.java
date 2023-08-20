package platforms.ui.Web.StepDefinitions.Small_Business_Enablement.cipc;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.log4j.Logger;
import platforms.ui.Web.FlowModel.SBE.Business_Account;
import platforms.ui.Web.FlowModel.SBE.Business_Registration;


public class Product_Cost_Breakdown {

    private static Logger log = Logger.getLogger(Product_Cost_Breakdown.class);

    @When("^I click next on the declaration page$")
    public void iClickNextOnTheDeclarationPage() {

        Business_Registration.clickNextOnDeclaration();
    }

    @Then("^I am now moved to the Payment section and I can see the product cost breakdown$")
    public void iAmNowMovedToThePaymentSectionAndICanSeeTheProductCostBreakdown() {

        Business_Registration.verifyPaymentSection();
    }

    @Then("^I validate products$")
    public void i_validate_products(){

        Business_Registration.verifyProducts();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Business_Account.closeDriver();
    }
}
