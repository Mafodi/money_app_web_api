package platforms.ui.Web.StepDefinitions.Small_Business_Enablement.businessAccount;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import platforms.ui.Web.FlowModel.SBE.Business_Account;

public class Call_Me_Back_Trigger_Points {

    @When("^User clicks \"([^\"]*)\" Yes or No for directorship details confirmation$")
    public void user_clicks_Yes_or_No_for_directorship_details_confirmation(String arg1){

        Business_Account.selectYesDirectorshipDetails(arg1);
    }

    @Then("^User captures all required business details with \"([^\"]*)\" high risk economic sector$")
    public void user_captures_all_required_business_details_with_high_risk_economic_sector(String arg1){

        Business_Account.selectEconomicSector(arg1);
    }

    @Then("^User captures all required business details with \"([^\"]*)\" administration type$")
    public void user_captures_all_required_business_details_with_administration_type(String arg1){

        Business_Account.administrationType(arg1);
    }

    @Then("^User captures all required business details with \"([^\"]*)\" high risk country of operation$")
    public void user_captures_all_required_business_details_with_high_risk_country_of_operation(String arg1){

    }
}
