package platforms.ui.Web.StepDefinitions.Small_Business_Enablement.businessAccount;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.apache.log4j.Logger;
import platforms.ui.Web.FlowModel.SBE.Business_Account;
import utils.Utils;


public class Business_Details_Capture_Business_Information extends Utils {

    private static Logger log = Logger.getLogger(Business_Details_Capture_Business_Information.class);



    //------------------------------------------------

    @Then("^User captures \"([^\"]*)\" Business telephone number$")
    public void user_captures_Business_telephone_number(String arg1){

        //TODO - Add code
    }

    @Then("^User selects \"([^\"]*)\" Financial year end$")
    public void user_selects_Financial_year_end(String arg1){

        //TODO - Add code
    }

    //------------------------3rd ---------------------------
    @And("^User enter desired trading name$")
    public void userEnterDesiredTradingName(){

        Business_Account.enterTradingName("ABC Sphatlo Palace");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
    //-------------------------------------------------------

    //------------------------4th ----------------------------
    @And("^Company Pty LTD date of incorporation is returned$")
    public void companyPtyLTDDateOfIncorporationIsReturned(){

        Business_Account.verifyCompanyYEFromCIPC();
    }
    //--------------------------------------------------------

    //-------------------------5th ----------------------------
    @And("^Close Corporation date of incorporation is returned$")
    public void closeCorporationDateOfIncorporationIsReturned(){

        Business_Account.verifyCloseCorpYEFromCIPC();
    }
    //---------------------------------------------------------
}
