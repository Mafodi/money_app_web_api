package platforms.ui.Web.StepDefinitions.Small_Business_Enablement.cipc;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.log4j.Logger;
import platforms.ui.Web.FlowModel.SBE.Business_Account;
import platforms.ui.Web.FlowModel.SBE.Business_Registration;
import platforms.ui.Web.StepDefinitions.Small_Business_Enablement.reusable.SBE_DataFactory;


public class End_To_End {

    private static Logger log = Logger.getLogger(End_To_End.class);

    @When("^I confirm my personal details and click next to proceed$")
    public void iConfirmMyPersonalDetailsAndClickNextToProceed()
    {

        Business_Registration.clickNextOnCompanyDirectorship();
    }
    @And("^I then select to register my business with a name$")
    public void iThenSelectToRegisterMyBusinessWithAName()
    {

        Business_Registration.clickRegisterWithName();
    }
    @And("^I then provide at least four names for the name reservation process with the CIPC$")
    public void iThenProvideAtLeastFourNamesForTheNameReservationProcessWithTheCIPC()
    {

        Business_Registration.enterCompanyName(SBE_DataFactory.companyNames);
        Business_Registration.clickSubmitOnNames();
    }
    @And("^I now provide the details of my business as requested from the CIPC$")
    public void iNowProvideTheDetailsOfMyBusinessAsRequestedFromTheCIPC()
    {

        Business_Account.setBusinessTelephone(SBE_DataFactory.businessTelNumber);
        Business_Account.selectFinancialYearEnd(SBE_DataFactory.financialyear);
        Business_Account.selectEconomicSector(SBE_DataFactory.economicSector);
        Business_Account.selectExpectedRevenue(SBE_DataFactory.expectedRevenue);
        Business_Account.setIncomeSource(SBE_DataFactory.incomeSource);
        Business_Account.selectForTaxOblications("No");
        Business_Account.clickNextOnBusinessDetailsSection();
    }
    @And("^I now provide the business address$")
    public void iNowProvideTheBusinessAddress()
    {

        Business_Account.selectSameBusinessTradingAddress();
        Business_Account.selectSameBusinessAddressAsPostal();
        Business_Account.clickNextOnBusinessAddressSection();
    }
    @And("^I now provide shareholder information to enable me obtain a B-BBEE certificate$")
    public void iNowProvideShareholderInformationToEnableMeObtainABBBEECertificate()
    {

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
    @And("^I now compare the different business bank accounts or choose to skip this process$")
    public void iNowCompareTheDifferentBusinessBankAccountsOrChooseToSkipThisProcess()
    {

        Business_Registration.clickSkipOnOpeningOfBusinessAccounts();
    }
    @And("^I then accept the declarations and the terms and conditions as outlined$")
    public void iThenAcceptTheDeclarationsAndTheTermsAndConditionsAsOutlined()
    {

        Business_Account.verifyDeclarationTermsOfCondition();
        Business_Account.selectDeclarationOptions();
        Business_Account.clickNextOnDeclaration();
    }
    @And("^I click next on payment screen$")
    public void iClickNextOnPaymentScreen()
    {

        Business_Registration.clickNextOnPaymentScreen();
    }
    @And("^I select on how I would like to be contacted$")
    public void iSelectOnHowIWouldLikeToBeContacted()
    {

        Business_Account.clickNextOnGetInTouch();
    }
    @Then("^I am shown the success screen indicating that the application was successful$")
    public void iAmShownTheSuccessScreenIndicatingThatTheApplicationWasSuccessful()
    {

        Business_Registration.complete_Application();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Business_Account.closeDriver();
    }
}
