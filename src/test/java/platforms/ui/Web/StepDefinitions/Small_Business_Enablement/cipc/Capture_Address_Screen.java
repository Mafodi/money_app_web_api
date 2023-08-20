package platforms.ui.Web.StepDefinitions.Small_Business_Enablement.cipc;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.log4j.Logger;
import platforms.ui.Web.FlowModel.SBE.Business_Account;
import platforms.ui.Web.FlowModel.SBE.Business_Registration;
import platforms.ui.Web.StepDefinitions.Small_Business_Enablement.reusable.SBE_DataFactory;


public class Capture_Address_Screen {

    Business_Account myMethods = new Business_Account();
    private static Logger log = Logger.getLogger(Capture_Address_Screen.class);

    @Given("^I have logged in successfully and I am on the business address section$")
    public void iHaveLoggedInSuccessfullyAndIAmOnTheBusinessAddressSection() {

        Business_Account.driverInitializer(SBE_DataFactory.cipcURL);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Business_Registration.clickOnRegisterOnTheLandingPage();
        Business_Registration.selectDirectorOrShareholder();
        Business_Account.selectAgreeTermsAndConditions();
        Business_Account.clickNextBusinessBundle();
        Business_Account.clickYesOnNedbankClientQuestion();
        Business_Account.enterUsername(SBE_DataFactory.username);
        Business_Account.enterPassword(SBE_DataFactory.pwd);
        Business_Account.clickLogin();
        Business_Registration.verifyDirectorDetailsPage();
        Business_Registration.clickNextOnCompanyDirectorship();
        Business_Registration.clickRegisterWithName();
        Business_Registration.enterCompanyName(SBE_DataFactory.companyNames);
        Business_Registration.clickSubmitOnNames();
        Business_Account.setBusinessTelephone(SBE_DataFactory.businessTelNumber);
        Business_Account.selectFinancialYearEnd(SBE_DataFactory.financialyear);
        Business_Account.selectEconomicSector(SBE_DataFactory.economicSector);
        Business_Account.selectExpectedRevenue(SBE_DataFactory.expectedRevenue);
        Business_Account.setIncomeSource(SBE_DataFactory.incomeSource);
        Business_Account.selectForTaxOblications("No");
        Business_Account.clickNextOnBusinessDetailsSection();

    }

    @When("^I select yes to indicate that the business address is the same as the home address$")
    public void iSelectYesToIndicateThatTheBusinessAddressIsTheSameAsTheHomeAddress() {

        Business_Account.selectSameBusinessTradingAddress();
    }

    @And("^I also select yes to indicate that the postal address is the same as the business address$")
    public void iAlsoSelectYesToIndicateThatThePostalAddressIsTheSameAsTheBusinessAddress() {

        Business_Account.selectSameBusinessAddressAsPostal();
    }

    @And("^I click next on business address section$")
    public void iClickNextOnBusinessAddressSection() {

        Business_Registration.clickNext();
    }

    @Then("^I am now moved to obtain a B-BBEE certificate Section$")
    public void iAmNowMovedToCardAuthorizationSection() {

        Business_Registration.verifyBBEE_Section();

        try {
            Thread.sleep(3500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Business_Account.closeDriver();
    }

    @When("^I select no to indicate that the business address is not the same as the home address$")
    public void iSelectNoToIndicateThatTheBusinessAddressIsNotTheSameAsTheHomeAddress() {

        Business_Registration.selectNoSameBusinessAddress();
    }

    @And("^I enter the business address in the field (.*) and select a suggested address returned from my search$")
    public void iEnterTheBusinessAddressInTheFieldBusiness_addressAndSelectASuggestedAddressReturnedFromMySearch(String businessAddress) {

        Business_Registration.enterBusinessAddress(businessAddress);
    }

    @And("^I also select no to indicate that the postal address is not the same as the business address$")
    public void iAlsoSelectNoToIndicateThatThePostalAddressIsNotTheSameAsTheBusinessAddress() {

        Business_Registration.selectNoNotSamePostalAddress();
    }

    @And("^I enter postal address in the field (.*) and select a suggested address returned from my search$")
    public void iEnterPostalAddressInTheFieldPostal_addressAndSelectASuggestedAddressReturnedFromMySearch(String postalAddress) {

        Business_Registration.enterPostalAddress(postalAddress);
    }

}
