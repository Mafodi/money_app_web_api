package platforms.ui.Web.StepDefinitions.Small_Business_Enablement.businessAccount;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.log4j.Logger;
import platforms.ui.Web.FlowModel.SBE.Business_Account;


public class Card_Delivery_Preference_In_Branch {

    private static Logger log = Logger.getLogger(Card_Delivery_Preference_In_Branch.class);

    //==============================================================
    @When("^User selects No for option of using personal name as business trading name$")
    public void user_selects_No_for_option_of_using_personal_name_as_business_trading_name(){

        Business_Account.userSelectYesOrNoForAddingATradeName("No");
    }
    @When("^User clicks on Yes button for Business trading address$")
    public void userClicksOnYesButtonForBusinessTradingAddress(){

        Business_Account.selectSameBusinessTradingAddress();
    }
    @And("^User clicks on Yes button for Business postal address$")
    public void userClicksOnYesButtonForBusinessPostalAddress(){

        Business_Account.selectSameBusinessAddressAsPostal();
    }

    @Given("^User is on Setting up your business account screen$")
    public void userIsOnSettingUpYourBusinessAccountScreen(){

        Business_Account.setUpBusinessAccount();
    }
    @When("^User sets card limit$")
    public void userSetsCardLimit(){

        Business_Account.setCardLimits();
    }
    @When("^User selects a card option \"([^\"]*)\" for a business credit card$")
    public void user_selects_a_card_option_for_a_business_credit_card(String arg1){

        Business_Account.selectOptionForBusinessCreditCard(arg1);
    }
    @Given("^User is on Card Delivery screen$")
    public void userIsOnCardDeliveryScreen(){

        Business_Account.verifyCardDeliverySection();
    }
    @When("^User selects Collection option$")
    public void userSelectsCollectionOption()
    {

        Business_Account.selectCollectionOption();
    }
    @And("^User captures \"([^\"]*)\" location of collection$")
    public void userCapturesAsLocationOfCollection(String branch)
    {

        Business_Account.selectLocationOfCollection(branch);
    }
    @And("^User selects the option (.*) for the personal banker and only sets the branch (.*) if option is No$")
    public void userSelectsTheOptionOptionForThePersonalBankerAndOnlySetsTheBranchBranchIfOptionIsNo(String option, String branch)
    {

        Business_Account.selectOptionForPersonalBanker(option,branch);
    }
    @Then("^User clicks on Next button for Card Delivery$")
    public void userClicksOnNextButtonForCardDelivery()
    {

        Business_Account.clickNextOnCardDelivery();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Business_Account.closeDriver();
    }

}
