package platforms.ui.Web.StepDefinitions.Small_Business_Enablement.businessAccount;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.log4j.Logger;
import platforms.ui.Web.FlowModel.SBE.Business_Account;
import platforms.ui.Web.StepDefinitions.Small_Business_Enablement.reusable.SBE_DataFactory;
import utils.Utils;


public class Business_Account_ETE extends Utils {

    private static Logger log = Logger.getLogger(Business_Account_ETE.class);
    Business_Account myMethods = new Business_Account();

    @Given("^I have logged in successfully on business accounts$")
    public void i_have_logged_in_successfully_on_business_accounts(){

        String baseURL = getConfigPropertyValue("./SBE.properties", "url");
        Business_Account.driverInitializer(baseURL);

        Business_Account.selectBusinessPayAsYouUse();
        Business_Account.selectDirectorOrShareholder();
        Business_Account.selectAgreeTermsAndConditions();
        Business_Account.clickNextBusinessBundle();
        Business_Account.clickYesOnNedbankClientQuestion();
        Business_Account.enterUsername(SBE_DataFactory.username);
        Business_Account.enterPassword(SBE_DataFactory.pwd);
        Business_Account.clickLogin();
    }

    @When("^I verify that all my personal details are correct and click next$")
    public void i_verify_that_all_my_personal_details_are_correct_and_click_next(){

        Business_Account.selectYesDirectorshipDetails("Yes");
        Business_Account.clickNextOnPersonalDetails();
    }

    @When("^I select my business type$")
    public void i_select_my_business_type(){

        Business_Account.selectCompanyOption("Company(Pty(LTD))");
        Business_Account.setBusinessRegistrationNumber("200721365423");
        Business_Account.clickNextCompanyDetails();
    }

    @When("^I fill in all my business details$")
    public void i_fill_in_all_my_business_details(){

        Business_Account.setDateOfIncorporation("05 November 2018");
        Business_Account.setBusinessTelephone("670520582");
        Business_Account.selectFinancialYearEnd("March");
        Business_Account.selectEconomicSector("Agencies");
        Business_Account.selectExpectedRevenue("R10 Mil - R20 Mil");
        Business_Account.setIncomeSource("Dividends");
        Business_Account.selectForTaxOblications("No");
        Business_Account.clickNextOnBusinessDetailsSection();
    }

    @When("^I select and indicate my business trading address and business postal address are the same$")
    public void i_select_and_indicate_my_business_trading_address_and_business_postal_address_are_the_same(){

        Business_Account.selectSameBusinessTradingAddress();
        Business_Account.selectSameBusinessAddressAsPostal();
        Business_Account.clickNextOnBusinessAddressSection();
    }

    @When("^I verify and select next on the person in charge of banking relationships$")
    public void i_verify_and_select_next_on_the_person_in_charge_of_banking_relationships(){

        Business_Account.clickNextOnPersonInChargeOfBusiness();
    }

    @When("^I set my card withdrawal limit and select optional extras on my business accounts$")
    public void i_set_my_card_withdrawal_limit_and_select_optional_extras_on_my_business_accounts(){

        Business_Account.setCardLimits();
        Business_Account.selectOptionalExtras();
        Business_Account.selectOptionForBusinessCreditCard("No");
        Business_Account.clickCustomizeNext();
    }

    @When("^I select how to receive my card and the location of my dedicated banker$")
    public void i_select_how_to_receive_my_card_and_the_location_of_my_dedicated_banker(){

        //Business_Account.verifyCardDeliverySection();
        Business_Account.selectCollectionOption();
        Business_Account.selectLocationOfCollection("Nedbank Tembisa Plaza");
        Business_Account.selectOptionForPersonalBanker("yes", "Nedbank Tembisa Plaza");
        Business_Account.clickNextOnCardDelivery();
    }

    @When("^I select options on the declaration and terms and conditions$")
    public void i_select_options_on_the_declaration_and_terms_and_conditions(){

        Business_Account.verifyDeclarationTermsOfCondition();
        Business_Account.selectDeclarationOptions();
        Business_Account.clickNextOnDeclaration();
    }

    @When("^I select how the bank should get in touch with me$")
    public void i_select_how_the_bank_should_get_in_touch_with_me(){

        Business_Account.clickNextOnGetInTouch();
    }
    @When("^I click No Thanks on pop-up window$")
    public void i_click_No_Thanks_on_pop_up_window(){

        Business_Account.feedbackPopup();
    }
    @Then("^I am now shown a message that the application is done$")
    public void i_am_now_shown_a_message_that_the_application_is_done(){

        Business_Account.verifySuccessPageBusinessAccounts();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Business_Account.closeDriver();
    }
}
