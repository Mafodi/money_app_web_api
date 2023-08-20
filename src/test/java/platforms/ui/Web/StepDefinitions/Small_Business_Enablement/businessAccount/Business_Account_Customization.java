package platforms.ui.Web.StepDefinitions.Small_Business_Enablement.businessAccount;
import cucumber.api.java.en.And;
import org.apache.log4j.Logger;
import platforms.ui.Web.FlowModel.SBE.Business_Account;


public class Business_Account_Customization {

    private static Logger log = Logger.getLogger(Business_Account_Compare_Different_Product_Options.class);

    @And("^User selects Yes for option of using personal name as business trading name$")
    public void userSelectsYesForOptionOfUsingPersonalNameAsBusinessTradingName(){

        Business_Account.userSelectYesOrNoForAddingATradeName("Yes");
    }

}
