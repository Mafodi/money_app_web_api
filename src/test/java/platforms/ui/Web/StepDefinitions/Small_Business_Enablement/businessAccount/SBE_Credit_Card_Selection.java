package platforms.ui.Web.StepDefinitions.Small_Business_Enablement.businessAccount;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.log4j.Logger;
import platforms.ui.Web.FlowModel.SBE.Business_Account;


public class SBE_Credit_Card_Selection {

    private static Logger log = Logger.getLogger(SBE_Credit_Card_Selection.class);

    @And("^I am now on the Credit Card Details Screen$")
    public void iAmNowOnTheCreditCardDetailsScreen(){

        Business_Account.selectYesDirectorshipDetails("Yes");
        Business_Account.clickNextOnPersonalDetails();
        Business_Account.selectCompanyOption("Company(Pty(LTD))");
        Business_Account.setBusinessRegistrationNumber("200721365423");
        Business_Account.clickNextCompanyDetails();
        Business_Account.setDateOfIncorporation("05 November 2018");
        Business_Account.setBusinessTelephone("117893466");
        Business_Account.selectFinancialYearEnd("March");
        Business_Account.selectEconomicSector("Agencies");
        Business_Account.selectExpectedRevenue("R10 Mil - R20 Mil");
        Business_Account.setIncomeSource("Dividends");
        Business_Account.selectForTaxOblications("No");
        Business_Account.clickNextOnBusinessDetailsSection();
        Business_Account.selectSameBusinessTradingAddress();
        Business_Account.selectSameBusinessAddressAsPostal();
        Business_Account.clickNextOnBusinessAddressSection();
        Business_Account.clickNextOnPersonInChargeOfBusiness();
        Business_Account.setCardLimits();
        Business_Account.selectOptionalExtras();
        Business_Account.selectOptionForBusinessCreditCard("Yes");
        Business_Account.clickCustomizeNext();
    }
    @When("^I select the Nedbank Small Business Credit Card on the Credit card options page$")
    public void iSelectTheNedbankSmallBusinessCreditCardOnTheCreditCardOptionsPage()
    {

        Business_Account.clickNedbankSmallBusinessCreditCard();
    }
    @When("^I select to give consent to nedbank for a credit check$")
    public void iSelectToGiveConsentToNedbankForACreditCheck()
    {

        Business_Account.selectGiveConsent();
    }
    @And("^I click next on the consent page$")
    public void iClickNextOnTheConsentPage()
    {

        Business_Account.clickNextOnCreditCheckConsent();
    }
    @And("^I enter the monthly gross income (.*) and the monthly net income (.*)$")
    public void iEnterTheMonthlyGrossIncomeGrossAndTheMonthlyNetIncomeNet(String gross, String netIncome)
    {

        Business_Account.enterMonthlyGrossNetIncome(gross,netIncome);
    }
    @And("^I enter the monthly living expenses (.*) and the monthly debt payments (.*)$")
    public void iEnterTheMonthlyLivingExpensesExpensesAndTheMonthlyDebtPaymentsDebt(String expenses, String debtPayments)
    {

        Business_Account.enterMonthlyExpensesDebt(expenses,debtPayments);
    }
    @And("^I click next on the credit card qualification page$")
    public void iClickNextOnTheCreditCardQualificationPage()
    {

        Business_Account.clickNextOnCreditQualification();
    }
    @Then("^I am shown the result of the check$")
    public void iAmShownTheResultOfTheCheck()
    {

        Business_Account.closeDriver();
    }

}
