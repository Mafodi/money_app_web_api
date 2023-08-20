package platforms.ui.Web.StepDefinitions.Small_Business_Enablement.businessAccount;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.log4j.Logger;
import platforms.ui.Web.FlowModel.SBE.Business_Account;
import platforms.ui.Web.StepDefinitions.Small_Business_Enablement.reusable.SBE_DataFactory;
import utils.Utils;


public class Apply_For_Business_Account_Set_Withdrawal_Limit extends Utils {



    private static Logger log = Logger.getLogger(Apply_For_Business_Account_Set_Withdrawal_Limit.class);
    Business_Account myMethods = new Business_Account();


    @When("^User selects BUSINESS PAY AS YOU USE option$")
    public void user_selects_BUSINESS_PAY_AS_YOU_USE_option(){

        String baseURL = getConfigPropertyValue("./SBE.properties", "url");
        Business_Account.driverInitializer(baseURL);

        log.info("Driver Loaded Successfully.");

        Business_Account.selectBusinessPayAsYouUse();
        log.info("User Selected 'Pay As You Use'.");
    }

    @When("^User selects BUSINESS BUNDLE One option$")
    public void userSelectsBUSINESSBUNDLEOneOption(){

        String baseURL = getConfigPropertyValue("./SBE.properties", "url");
        Business_Account.driverInitializer(baseURL);
        Business_Account.selectBusinessBundle35();
    }
    @When("^User selects Single director/shareholder or one member$")
    public void user_selects_Single_director_shareholder_or_one_member(){

        Business_Account.selectDirectorOrShareholder();
        log.info("Single Director Selected");
    }

    @When("^User agrees to Business Bundle One terms and conditions$")
    public void user_agrees_to_Business_Bundle_One_terms_and_conditions(){

        Business_Account.selectAgreeTermsAndConditions();
        log.info("T's and C's accepted");
    }

    @When("^User clicks on Business Bundle Next button$")
    public void user_clicks_on_Business_Bundle_Next_button(){

        Business_Account.clickNextBusinessBundle();
        log.info("Clicked Next After Accepting T's and C's");

    }

    @When("^User enters \"([^\"]*)\" ID number to check if user have nedbank ID$")
    public void user_enters_ID_number_to_check_if_user_have_nedbank_ID( String arg1){

        Business_Account.enterIDNumber(arg1);
    }
    @When("^User click Next after providing ID number$")
    public void user_click_Next_after_providing_ID_number(){

        Business_Account.clickNextAfterIDNumber();
    }
    @When("^User clicks on Yes button for Are you a Nedbank client question$")
    public void user_clicks_on_Yes_button_for_Are_you_a_Nedbank_client_question(){

        Business_Account.clickYesOnNedbankClientQuestion();
        log.info("Clicked 'Yes' For Having Nedbank ID");
    }

    @When("^User captures Nedbank ID \"([^\"]*)\" username and \"([^\"]*)\" password on application fast track screen$")
    public void user_Captures_Nedbank_ID_Username_And_Password_On_Application_Fast_Track_Screen(String arg1, String arg2){

        Business_Account.enterUsername(SBE_DataFactory.username);
        log.info("Provided Username Successfully");

        Business_Account.enterPassword(SBE_DataFactory.pwd);
        log.info("Provided Password Successfully");
    }

    @Then("^User clicks on Application fast track Login button$")
    public void user_clicks_on_Application_fast_track_Login_button(){

        Business_Account.clickLogin();
        log.info("User Login Successful.");
    }

    @When("^User selects \"([^\"]*)\" Yes or No on tax obligations outside South Africa$")
    public void user_Selects_Yes_Or_No_On_Tax_Obligations_Outside_South_Africa(String arg1){

        Business_Account.selectForTaxOblications(arg1);
    }

    @When("^User clicks on Director's personal details screen Next button$")
    public void user_clicks_on_Director_s_personal_details_screen_Next_button(){

        Business_Account.clickNextOnPersonalDetails();
    }

    @When("^User captures all required business details$")
    public void user_Captures_All_Required_Business_Details(){

        Business_Account.setBusinessTelephone(SBE_DataFactory.businessTelNumber);

        Business_Account.selectFinancialYearEnd(SBE_DataFactory.financialyear);

        Business_Account.selectEconomicSector(SBE_DataFactory.economicSector);

        Business_Account.selectExpectedRevenue(SBE_DataFactory.expectedRevenue);

        Business_Account.setIncomeSource(SBE_DataFactory.incomeSource);

        Business_Account.businessDescription(SBE_DataFactory.telUsAboutYourBusiness);

        Business_Account.administrationType(SBE_DataFactory.businessAdminType);

        Business_Account.selectCountriesOfOperation(SBE_DataFactory.countriesOfOperation);
    }

    @When("^User selects \"([^\"]*)\" company option$")
    public void user_selects_company_option(String businessType){

        Business_Account.selectCompanyOption(businessType);
    }

    @When("^User captures \"([^\"]*)\" Business Registration Number$")
    public void user_captures_Business_Registration_Number(String regNumber){

        Business_Account.setBusinessRegistrationNumber(regNumber);
    }

    @Then("^User clicks on Company details Next button$")
    public void user_clicks_on_Company_details_Next_button(){

        Business_Account.clickNextCompanyDetails();

    }

    @Then("^User clicks Next button for Business Details screen$")
    public void user_clicks_Next_button_for_Business_Details_screen(){

        Business_Account.clickNextOnBusinessDetailsSection();
    }

    @When("^User clicks on Yes button for Business physical address$")
    public void user_clicks_on_Yes_button_for_Business_physical_address(){

        Business_Account.selectSameBusinessTradingAddress();
    }

    @When("^User clicks on Yes button for Postal address$")
    public void user_clicks_on_Yes_button_for_Postal_address(){

        Business_Account.selectSameBusinessAddressAsPostal();
    }

    @Then("^User clicks on Next button for Business Address screen$")
    public void user_clicks_on_Next_button_for_Business_Address_screen(){

        Business_Account.clickNextOnBusinessAddressSection();
    }

    @Given("^User is on Configure screen$")
    public void user_is_on_Configure_screen(){

        Business_Account.configureScreen();

    }

    //=============================== For Setting Minimum Withdrawal Limit    ===============================
    @When("^User sets minimum card limit$")
    public void userSetsMinimumCardLimit(){

        Business_Account.setMinimumCardLimit("R1500");
    }

    //=======================================================================================================

    @When("^User selects optional extras$")
    public void user_selects_optional_extras(){

        Business_Account.selectOptionalExtras();
        Business_Account.selectOptionForBusinessCreditCard("No");
    }

    //================================ For Set Maximum Withdrawal Limit Scenario =============================
    @When("^User sets maximum card limit$")
    public void user_sets_maximum_card_limit() {

        Business_Account.setMaximumCardLimits();
    }
    //========================================================================================================

    @Then("^User clicks on Customize Next button$")
    public void user_clicks_on_Customize_Next_button(){

        Business_Account.clickCustomizeNext();
    }

}
