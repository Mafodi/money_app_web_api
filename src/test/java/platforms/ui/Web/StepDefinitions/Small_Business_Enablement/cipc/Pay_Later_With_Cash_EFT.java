package platforms.ui.Web.StepDefinitions.Small_Business_Enablement.cipc;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.apache.log4j.Logger;
import platforms.ui.Web.FlowModel.SBE.Business_Account;
import platforms.ui.Web.FlowModel.SBE.Business_Registration;
import platforms.ui.Web.StepDefinitions.Small_Business_Enablement.reusable.SBE_DataFactory;


public class Pay_Later_With_Cash_EFT {

    private static Logger log = Logger.getLogger(Pay_Later_With_Cash_EFT.class);

    @And("^I am now on the Declaration Page$")
    public void iAmNowOnTheDeclarationPage() {

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
        Business_Registration.clickNextOnBusinessAccounts();
        Business_Registration.clickSkipOnOpeningOfBusinessAccounts();
        Business_Registration.selectDeclarationOptions();
    }

    @And("^I select the next button to indicate Pay Later option$")
    public void iSelectTheNextButtonToIndicatePayLaterOption() {

        Business_Registration.clickNextToPayLaterOption();
    }

    @And("^I click pay$")
    public void iClickPay() {

        Business_Registration.clickPayNow();
    }

    @Then("^I am now moved to the Keep In touch With Us section$")
    public void iAmNowMovedToTheGetIntouchWithUsSection() {

        Business_Registration.verifyGetInTouchSection();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Business_Account.closeDriver();
    }
}
