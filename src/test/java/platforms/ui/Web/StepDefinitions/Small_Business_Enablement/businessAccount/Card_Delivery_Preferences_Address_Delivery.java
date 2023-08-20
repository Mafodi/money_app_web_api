package platforms.ui.Web.StepDefinitions.Small_Business_Enablement.businessAccount;
import cucumber.api.java.en.And;
import org.apache.log4j.Logger;
import platforms.ui.Web.FlowModel.SBE.Business_Account;


public class Card_Delivery_Preferences_Address_Delivery {

    private static Logger log = Logger.getLogger(Card_Delivery_Preferences_Address_Delivery.class);

    //===================================================================
    @And("^User selects Delivery option$")
    public void userSelectsDeliveryOption(){

        Business_Account.verifyCardDeliverySection();
    }
    @And("^User selects Yes for delivery to business address$")
    public void userSelectsYesForDeliveryToBusinessAddress(){

        Business_Account.selectDeliveryOption();
    }
    @And("^User selects the preferred (.*) for the private banker$")
    public void userSelectsThePreferredForThePrivateBanker(String bankerLocation) {

        Business_Account.productDelivery("Business");
        Business_Account.selectLocationOfPrivateBanker(bankerLocation);
    }
    //=====================================================================

}
