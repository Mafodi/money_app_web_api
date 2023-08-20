package platforms.ui.Web.StepDefinitions.Small_Business_Enablement.cipc;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.log4j.Logger;
import platforms.ui.Web.FlowModel.SBE.Business_Account;
import platforms.ui.Web.FlowModel.SBE.Business_Registration;
import platforms.ui.Web.StepDefinitions.Small_Business_Enablement.reusable.SBE_DataFactory;


public class Not_Ready_To_Open_Business_Account {

    private static Logger log = Logger.getLogger(Not_Ready_To_Open_Business_Account.class);

    @And("^I am now on the business accounts page$")
    public void iAmNowOnTheBusinessAccountsPage() {

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

        Business_Account.selectSameBusinessTradingAddress();
        Business_Account.selectSameBusinessAddressAsPostal();
        Business_Account.clickNextOnBusinessAddressSection();
        Business_Registration.verifyBBEE_Section();
        Business_Registration.selectYesOnBEECertificate("Yes");

        Business_Registration.enterNumberOfShareholders(SBE_DataFactory.numberOfShareHolders);
        Business_Registration.enterNumberOfBlackShareholders(SBE_DataFactory.numberOfBlackShareHolders);
        Business_Registration.enterPercentageHeldByBlackShareholders(SBE_DataFactory.percentageHeldByBlackShareholders);
        Business_Registration.enterPercentageOfBlackFemaleShareholders(SBE_DataFactory.percentageOfBlackFemaleShareholders);
        Business_Registration.enterNumberOfBlackUnemployedShareholders(SBE_DataFactory.numberOfBlackUnemployedShareholders);
        Business_Registration.enterNumberOfBlackYouthShareholders(SBE_DataFactory.numberOfBlackYouthShareholders);
        Business_Registration.enterNumberOfBlackShareholdersWithDisabilities(SBE_DataFactory.numberOfBlackShareholdersWithDisabilities);
        Business_Registration.enterNumberOfBlackShareholdersLivingRuralAreas(SBE_DataFactory.numberOfBlackShareholdersLivingRuralAreas);
        Business_Registration.enterNumberOfBlackShareholdersWhoMilitaryVeterans(SBE_DataFactory.numberOfBlackShareholdersWhoMilitaryVeterans);
        Business_Registration.clickNextOnBEEE();
    }

    @When("^I select a (.*) when i would like to open an account$")
    public void iSelectADateWhenIWouldLikeToOpenAnAccount(String date) {

        Business_Registration.selectDateToOpenAccount(date);
    }

    @And("^I click next on business accounts section on CIPC$")
    public void iClickNextOnBusinessAccountsSectionOnCIPC() {

        Business_Registration.clickNextOnBusinessAccounts();
    }

    @And("^I click skip on business accounts section on CIPC$")
    public void iClickSkipOnBusinessAccountsSectionOnCIPC() {

        Business_Registration.clickSkipOnOpeningOfBusinessAccounts();
    }

    @Then("^I will be taken to the terms and conditions section$")
    public void iWillBeTakenToTheTermsAndConditionsSection() {

        Business_Registration.verifyDeclarationTermsOfCondition();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Business_Account.closeDriver();
    }
}
