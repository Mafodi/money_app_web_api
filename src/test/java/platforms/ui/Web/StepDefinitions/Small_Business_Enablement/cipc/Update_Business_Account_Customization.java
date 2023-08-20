package platforms.ui.Web.StepDefinitions.Small_Business_Enablement.cipc;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.log4j.Logger;
import platforms.ui.Web.FlowModel.SBE.Business_Account;
import platforms.ui.Web.FlowModel.SBE.Business_Registration;
import platforms.ui.Web.StepDefinitions.Small_Business_Enablement.reusable.SBE_DataFactory;


public class Update_Business_Account_Customization {

    private static Logger log = Logger.getLogger(Update_Business_Account_Customization.class);

    @And("^I am now on the Setting Up Your Business Account section$")
    public void iAmNowOnTheSettingUpYourBusinessAccountSection() {

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
        Business_Registration.enterPercentageHeldByBlackShareholders(SBE_DataFactory.percentageOfBlackFemaleShareholders);
        Business_Registration.enterPercentageOfBlackFemaleShareholders(SBE_DataFactory.percentageOfBlackFemaleShareholders);
        Business_Registration.enterNumberOfBlackUnemployedShareholders(SBE_DataFactory.numberOfBlackUnemployedShareholders);
        Business_Registration.enterNumberOfBlackYouthShareholders(SBE_DataFactory.numberOfBlackYouthShareholders);
        Business_Registration.enterNumberOfBlackShareholdersWithDisabilities(SBE_DataFactory.numberOfBlackShareholdersWithDisabilities);
        Business_Registration.enterNumberOfBlackShareholdersLivingRuralAreas(SBE_DataFactory.numberOfBlackShareholdersLivingRuralAreas);
        Business_Registration.enterNumberOfBlackShareholdersWhoMilitaryVeterans(SBE_DataFactory.numberOfBlackShareholdersWhoMilitaryVeterans);
        Business_Registration.clickNextOnBusinessAccounts();

        Business_Account.selectBusinessPayAsYouUse();
    }

    @When("^I set the card limits$")
    public void iSetTheCardLimits() {

        Business_Account.setCardLimits();
    }

    @And("^I select some or all of the optional extras$")
    public void iSelectSomeOrAllOfTheOptionalExtras() {

        Business_Account.selectOptionalExtras();
    }

    @And("^I select a (.*) for a business credit card$")
    public void iSelectACard_optionForABusinessCreditCard(String cardOption) {

        Business_Account.selectOptionForBusinessCreditCard(cardOption);
    }

    @And("^I click next on this page$")
    public void iClickNextOnThisPage() {

        Business_Account.clickCustomizeNext();
    }

    @Then("^I am now moved to Card Delivery Options Section$")
    public void iAmNowMovedToCardDeliveryOptionsSection() {

        Business_Account.verifyCardDeliverySection();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Business_Account.closeDriver();
    }

}
