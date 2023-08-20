package platforms.ui.Web.StepDefinitions.Small_Business_Enablement.cipc;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import org.apache.log4j.Logger;
import platforms.ui.Web.FlowModel.SBE.Business_Account;
import platforms.ui.Web.FlowModel.SBE.Business_Registration;
import platforms.ui.Web.StepDefinitions.Small_Business_Enablement.reusable.SBE_DataFactory;


public class Terms_And_Conditions {

    private static Logger log = Logger.getLogger(Terms_And_Conditions.class);

    @And("^I fill in all required information to get to the declaration page$")
    public void iFillInAllRequiredInformationToGetToTheDeclarationPage() {

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
        Business_Account.selectEconomicSector(SBE_DataFactory.economicSector);
        Business_Account.selectFinancialYearEnd(SBE_DataFactory.financialyear);
        Business_Account.selectExpectedRevenue(SBE_DataFactory.expectedRevenue);
        Business_Account.setIncomeSource(SBE_DataFactory.incomeSource);
        Business_Account.selectForTaxOblications("No");
        Business_Account.clickNextOnBusinessDetailsSection();

        Business_Account.selectSameBusinessTradingAddress();
        Business_Account.selectSameBusinessTradingAddress();
        Business_Account.clickNextOnBusinessAddressSection();
        Business_Registration.verifyBBEE_Section();

        Business_Registration.enterNumberOfShareholders(SBE_DataFactory.numberOfShareHolders);
        Business_Registration.enterNumberOfBlackShareholders(SBE_DataFactory.numberOfBlackShareHolders);
        Business_Registration.enterPercentageHeldByBlackShareholders(SBE_DataFactory.percentageHeldByBlackShareholders);
        Business_Registration.enterPercentageOfBlackFemaleShareholders(SBE_DataFactory.percentageOfBlackFemaleShareholders);
        Business_Registration.enterNumberOfBlackUnemployedShareholders(SBE_DataFactory.numberOfBlackUnemployedShareholders);
        Business_Registration.enterNumberOfBlackYouthShareholders(SBE_DataFactory.numberOfBlackYouthShareholders);
        Business_Registration.enterNumberOfBlackShareholdersWithDisabilities(SBE_DataFactory.numberOfBlackShareholdersWithDisabilities);
        Business_Registration.enterNumberOfBlackShareholdersLivingRuralAreas(SBE_DataFactory.numberOfBlackShareholdersLivingRuralAreas);
        Business_Registration.enterNumberOfBlackShareholdersWhoMilitaryVeterans(SBE_DataFactory.numberOfBlackShareholdersWhoMilitaryVeterans);
        Business_Registration.clickNextOnBusinessAccounts();

        Business_Registration.clickSkipOnOpeningOfBusinessAccounts();
    }

    @When("^I select '100%' shareholding, sole business representative, shared address, and accurate information declarations$")
    public void iSelectShareholdingSoleBusinessRepresentativeSharedAddressAndAccurateInformationDeclarations() {

        Business_Registration.selectDeclarationOptions();
    }
}
