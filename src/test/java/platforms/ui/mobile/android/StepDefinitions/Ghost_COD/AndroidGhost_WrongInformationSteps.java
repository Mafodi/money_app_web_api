package platforms.ui.mobile.android.StepDefinitions.Ghost_COD;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.ui.WebDriverWait;
import platforms.ui.mobile.android.AndroidCommonMethods;
import platforms.ui.mobile.android.AndroidFlowModel.*;
import platforms.ui.mobile.android.AndroidPageObjects.Android_Ghost_OverdraftLimitIncreaseObjects;
import platforms.ui.mobile.ios.PageFactoryObject;
import utils.CommonFunctions;
import utils.DriverFactory;

public class AndroidGhost_WrongInformationSteps extends DriverFactory {

    private static Logger log = Logger.getLogger(Ghost_OverdraftLimitIncrease_AcceptDisclaimers_Flow.class);
    PageFactoryObject pageFactoryObj = new PageFactoryObject(driver);
    WebDriverWait wait = new WebDriverWait(driver, 60);
    DC_HeyNedSubscription_Flow subscriptionFlow = new DC_HeyNedSubscription_Flow();
    Android_Ghost_OverdraftLimitIncreaseObjects androidODLIPages = new Android_Ghost_OverdraftLimitIncreaseObjects(driver);
    Ghost_OverdraftLimitIncrease_FinancialInformation_Flow financialInfo_Flow = new Ghost_OverdraftLimitIncrease_FinancialInformation_Flow();
    Ghost_OverdraftLimitIncrease_AcceptDisclaimers_Flow acceptDisclaimersFlow = new Ghost_OverdraftLimitIncrease_AcceptDisclaimers_Flow();
    Ghost_OverdraftLimitIncrease_WrongInformationScreen_Flow wronginfo_Flow = new Ghost_OverdraftLimitIncrease_WrongInformationScreen_Flow();
    Ghost_OverdraftLimitIncrease_CampaignScreen_Flow campaignValidationFlow = new Ghost_OverdraftLimitIncrease_CampaignScreen_Flow();
    private AndroidCommonMethods basePage = new AndroidCommonMethods();
    private CommonFunctions common = new CommonFunctions();

    @Then("^user validates text on wrong information screen \"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"$")
    public void userValidatesTextOnWrongInformationScreen(String wrongInfoHeader, String wrongInformationSubHeader, String wrongInTotalIncomeLabel, String wrongInfoTotalLivingExpensesLabel, String wrongInfoTotalDebtObligationLabel, String weWillBeInTouchText) {

        wronginfo_Flow.WrongInfoHeader(wrongInfoHeader);
        wronginfo_Flow.WrongInformationSubHeader(wrongInformationSubHeader);
        wronginfo_Flow.WrongInTotalIncomeLabel(wrongInTotalIncomeLabel);
        wronginfo_Flow.WrongInfoTotalLivingExpensesLabel(wrongInfoTotalLivingExpensesLabel);
        wronginfo_Flow.WrongInfoTotalDebtObligationLabel(wrongInfoTotalDebtObligationLabel);
        wronginfo_Flow.WeWillBeInTouchText(weWillBeInTouchText);

    }


    @And("^user select all checkboxes 'Total_Monthly_Income_Checkbox' 'Total_Monthly_Living_Expenses_Checkbox' 'Total_Monthly_Debt_Obligation_Checkbox'$")
    public void userSelectAllCheckboxesTotal_Monthly_Income_CheckboxTotal_Monthly_Living_Expenses_CheckboxTotal_Monthly_Debt_Obligation_Checkbox() {
        //WrongInformation
        wronginfo_Flow.wrongInfoCheckBoxOne();
        wronginfo_Flow.wrongInfoCheckboxTwo();
        wronginfo_Flow.wrongInfoCheckBoxThree();
    }

    @Then("^Done button should be enabled$")
    public void doneButtonShouldBeEnabled() {
        wronginfo_Flow.ValidateDoneButtonIsEnabled();
    }

    @Then("^Done Button should be disabled$")
    public void doneButtonShouldBeDisabled() {
        wronginfo_Flow.ValidateDoneButtonIsDisabled();

    }

    @And("^user select Done Button$")
    public void userSelectDoneButton() {
        wronginfo_Flow.ClickDoneButton();
    }


    @Then("^Nedbank money web dashboard should be displayed$")
    public void nedbankMoneyWebDashboardShouldBeDisplayed() {
        wronginfo_Flow.DashboardWelcomeScreen();

    }

    @And("^user validate ToggleMessage$")
    public void userValidateToggleMessage() {
        financialInfo_Flow.IncorrectSwitcheMessage();

    }

}
