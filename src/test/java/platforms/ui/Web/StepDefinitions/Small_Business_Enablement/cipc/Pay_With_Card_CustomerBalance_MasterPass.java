package platforms.ui.Web.StepDefinitions.Small_Business_Enablement.cipc;
import cucumber.api.java.en.And;
import org.apache.log4j.Logger;
import platforms.ui.Web.FlowModel.SBE.Business_Registration;


public class Pay_With_Card_CustomerBalance_MasterPass {

    private static Logger log = Logger.getLogger(Pay_With_Card_CustomerBalance_MasterPass.class);

    @And("^I select the Pay Now option$")
    public void iSelectThePayNowOption() {

        Business_Registration.selectPayNowOption();
    }

    @And("^I click next on payment page$")
    public void iClickNextOnPaymentPage() {

        Business_Registration.clickNextOnPaymentScreen();
    }
}
