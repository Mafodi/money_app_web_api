package platforms.ui.mobile.android.StepDefinitions.Ghost_COD;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.ui.WebDriverWait;
import platforms.ui.mobile.android.AndroidCommonMethods;
import platforms.ui.mobile.android.AndroidFlowModel.DC_HeyNedSubscription_Flow;
import platforms.ui.mobile.android.AndroidFlowModel.Ghost_OverdraftLimitIncrease_AcceptDisclaimers_Flow;
import platforms.ui.mobile.android.AndroidFlowModel.Ghost_OverdraftLimitIncrease_FinancialInformation_Flow;
import platforms.ui.mobile.android.AndroidPageObjects.Android_Ghost_OverdraftLimitIncreaseObjects;
import platforms.ui.mobile.android.Ghost_Cod_AndroidDataFactory;
import platforms.ui.mobile.ios.PageFactoryObject;
import utils.CommonFunctions;
import utils.DriverFactory;

public class AndroidGhost_FinancialInformationSteps extends DriverFactory {

    private static Logger log = Logger.getLogger(Ghost_OverdraftLimitIncrease_AcceptDisclaimers_Flow.class);
    PageFactoryObject pageFactoryObj = new PageFactoryObject(driver);
    WebDriverWait wait = new WebDriverWait(driver, 60);
    DC_HeyNedSubscription_Flow subscriptionFlow = new DC_HeyNedSubscription_Flow();
    Android_Ghost_OverdraftLimitIncreaseObjects androidODLIPages = new Android_Ghost_OverdraftLimitIncreaseObjects(driver);
    Ghost_OverdraftLimitIncrease_FinancialInformation_Flow financialInfo_Flow = new Ghost_OverdraftLimitIncrease_FinancialInformation_Flow();
    Ghost_OverdraftLimitIncrease_AcceptDisclaimers_Flow acceptDisclaimersFlow = new Ghost_OverdraftLimitIncrease_AcceptDisclaimers_Flow();
    Ghost_Cod_AndroidDataFactory ghostCodAndroidDataFactory = new Ghost_Cod_AndroidDataFactory();
    private AndroidCommonMethods basePage = new AndroidCommonMethods();
    private CommonFunctions common = new CommonFunctions();

    @Then("^user validate your Information screen text \"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"$")
    public void userValidateYourInformationScreenText(String financialInfoStepper, String financialHeader, String FinancialSubHeader, String totalMonthlyIncome, String TotalMonthlyLivingExpenses, String TotalMonthlyDebtObligations, String CorrectInformationText)  {
       //Financial
        financialInfo_Flow.FinancialScreenSteeper(financialInfoStepper);
        financialInfo_Flow.FinancialHeader(financialHeader);
        financialInfo_Flow.FinancialSubHeader(FinancialSubHeader);
        financialInfo_Flow.totalMonthlyIncome(totalMonthlyIncome);
        financialInfo_Flow.TotalMonthlyLivingExpenses(TotalMonthlyLivingExpenses);
        financialInfo_Flow.TotalMonthlyDebtObligations(TotalMonthlyDebtObligations);
        financialInfo_Flow.CorrectInformationText(CorrectInformationText);

    }

    @Then("^user validate monthly income and expenses \"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"$")
    public void userValidateMonthlyIncomeAndExpenses(String totalMonthlyIncomeValue, String totalMonthlyLivingExpensesValue, String totalMonthlyDebtObligationsValue) {

       financialInfo_Flow.totalMonthlyIncomeValue(totalMonthlyIncomeValue);
       financialInfo_Flow.TotalMonthlyLivingExpensesValue(totalMonthlyLivingExpensesValue);
       financialInfo_Flow.TotalMonthlyDebtObligationsValue(totalMonthlyDebtObligationsValue);

    }

    @Then("^user validate tooltips on your information screen \"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"$")
    public void userValidateTooltipsOnYourInformationScreen(String totalMonthlyIncomeToolTip, String totalMonthlyLivingExpensesToolTip, String totalMonthlyDebtObligationsToolTip)  {
        financialInfo_Flow.TotalMonthlyIncomeToolTip(totalMonthlyIncomeToolTip);
        financialInfo_Flow.TotalMonthlyLivingExpensesToolTip(totalMonthlyLivingExpensesToolTip);
        financialInfo_Flow.TotalMonthlyDebtObligationsToolTip(totalMonthlyDebtObligationsToolTip);
    }


    @Then("^user should be navigated to Your Offer screen \"([^\"]*)\"$")
    public void yourOfferScreenIsDisplayed(String offerHeader) {
        financialInfo_Flow.OfferHeader(offerHeader);

    }


    @And("^user clicks on the 'Back_Arrow'$")
    public void userClicksOnTheBack_Arrow() {
        acceptDisclaimersFlow.ClickBackArrow();
    }



    @And("^user clicks on the 'X_Button'$")
    public void userClicksOnTheX_Button() {
        financialInfo_Flow.Click_X_Button();
    }


    @Then("^user should be navigated to the leaving so soon screen \"([^\"]*)\"$")
    public void userShouldBeNavigatedToTheLeavingSoSoonScreen(String leavingSoSoonHeader) {

       financialInfo_Flow.LeavingSoSoonHeader(leavingSoSoonHeader);

    }

    @Then("^user should be navigated to the Your Offer screen \"([^\"]*)\"$")
    public void userShouldBeNavigatedToTheYourOfferScreen(String yourOfferHeader)  {
       financialInfo_Flow.OfferHeader(yourOfferHeader);
    }


    @And("^user select toggle 'Toogle_No'$")
    public void userSelectToggleToogle_No() {
       financialInfo_Flow.ClickIncorrectInNoToogle();

    }

    @And("^user validate ToggleMessage$")
    public void userValidateToggleMessage() {
       financialInfo_Flow.IncorrectSwitcheMessage();
    }

    @Then("^wrong information screen is displayed \"([^\"]*)\"$")
    public void wrongInformationScreenIsDisplayed(String wrongInfoHeader)  {
       financialInfo_Flow.WrongInfoHeader(wrongInfoHeader);
    }


}
