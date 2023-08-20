package platforms.ui.Web.StepDefinitions.Small_Business_Enablement.cipc;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.log4j.Logger;
import platforms.ui.Web.FlowModel.SBE.Business_Account;
import platforms.ui.Web.FlowModel.SBE.Business_Registration;
import platforms.ui.Web.StepDefinitions.Small_Business_Enablement.reusable.SBE_DataFactory;


public class Registration_Reserve_Names {

    private static Logger log = Logger.getLogger(Registration_Reserve_Names.class);

    @When("^I enter the four business names for reservation$")
    public void i_enter_the_four_business_names_for_reservation(){

        Business_Registration.enterCompanyName(SBE_DataFactory.companyNames);
    }

    @Then("^I see all the reserved names are valid and a message is displayed below every field$")
    public void iSeeAllTheReservedNamesAreValidAndAMessageIsDisplayedBelowEveryField() {

        Business_Registration.validateEnteredNames(SBE_DataFactory.companyNames,SBE_DataFactory.displayedMessage);
        Business_Account.closeDriver();
    }

    @Then("^I see all the reserved names are invalid with a red color and a message is displayed below every field$")
    public void iSeeAllTheReservedNamesAreInvalidWithARedColorAndAMessageIsDisplayedBelowEveryField() {

        Business_Registration.validateEnteredNames(SBE_DataFactory.comNames,SBE_DataFactory.errorMessage);
        Business_Account.closeDriver();
    }
}
