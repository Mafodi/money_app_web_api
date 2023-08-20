package platforms.ui.mobile.android.StepDefinitions.Ghost_COD;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.ui.WebDriverWait;
import platforms.ui.mobile.android.AndroidCommonMethods;
import platforms.ui.mobile.android.AndroidFlowModel.DC_HeyNedSubscription_Flow;
import platforms.ui.mobile.android.AndroidFlowModel.Ghost_OverdraftLimitIncrease_AcceptDisclaimers_Flow;
import platforms.ui.mobile.android.AndroidFlowModel.Ghost_OverdraftLimitIncrease_CampaignScreen_Flow;
import platforms.ui.mobile.android.AndroidPageObjects.Android_Ghost_OverdraftLimitIncreaseObjects;
import platforms.ui.mobile.ios.PageFactoryObject;
import utils.CommonFunctions;
import utils.DriverFactory;

public class AndroidGhost_AcceptDisclaimersSteps extends DriverFactory {

    private static Logger log = Logger.getLogger(Ghost_OverdraftLimitIncrease_AcceptDisclaimers_Flow.class);
    PageFactoryObject pageFactoryObj = new PageFactoryObject(driver);
    WebDriverWait wait = new WebDriverWait(driver, 60);
    Android_Ghost_OverdraftLimitIncreaseObjects androidODLIPages = new Android_Ghost_OverdraftLimitIncreaseObjects(driver);
    DC_HeyNedSubscription_Flow subscriptionFlow = new DC_HeyNedSubscription_Flow();
    Ghost_OverdraftLimitIncrease_AcceptDisclaimers_Flow acceptDisclaimersFlow = new Ghost_OverdraftLimitIncrease_AcceptDisclaimers_Flow();
    Ghost_OverdraftLimitIncrease_CampaignScreen_Flow campaignValidationFlow = new Ghost_OverdraftLimitIncrease_CampaignScreen_Flow();
    private AndroidCommonMethods basePage = new AndroidCommonMethods();
    private CommonFunctions common = new CommonFunctions();

    @And("^user validate text on disclaimers screen \"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"$")
    public void userValidateTextOnDisclaimersScreen(String disclaimersHeading, String disclaimersSubHeading, String permanentlyEmployedLabel, String insolventLabel, String spousalConsent)  {
        //Disclaimers
        acceptDisclaimersFlow.ValidateSubHeading(disclaimersHeading);
        acceptDisclaimersFlow.ValidateDisclaimersHeader(disclaimersSubHeading);
        acceptDisclaimersFlow.PermanantlyEmployedLabel(permanentlyEmployedLabel);
        acceptDisclaimersFlow.InsolventLabel(insolventLabel);
        acceptDisclaimersFlow.SpousalConsent(spousalConsent);

    }


    @And("^user ticks one checkboxes 'Permanently_Employed_Checkbox'$")
    public void userTicksOneCheckboxesPermanently_Employed_Checkbox() {

        acceptDisclaimersFlow.disclaimersCheckBoxOne();


    }

    @Then("^confirm button should be disabled$")
    public void confirmButtonShouldBeDisabled() {
       acceptDisclaimersFlow.ValidateConfirmButtonIsDisabled();
    }

    @And("^user ticks two checkboxes 'Permanently_Employed_Checkbox' 'Spouse_Is_Insolvent_Checkbox'$")
    public void userTicksTwoCheckboxesPermanently_Employed_Checkbox() {

        acceptDisclaimersFlow.disclaimersCheckboxTwo();


    }

    @And("^client ticks all three checkboxes 'Permanently_Employed_Checkbox' 'Spouse_Is_Insolvent_Checkbox' 'Spousal_Consent_Checkbox'$")
    public void clientTicksAllThreeCheckboxesPermanently_Employed_CheckboxSpouse_Is_Insolvent_CheckboxSpousal_Consent_Checkbox() {
        acceptDisclaimersFlow.disclaimersCheckBoxOne();
        acceptDisclaimersFlow.disclaimersCheckboxTwo();
        acceptDisclaimersFlow.disclaimersCheckBoxThree();

    }

    @And("^user clicks on the 'Back_Button'$")
    public void userClicksOnTheBack_Button() {
       acceptDisclaimersFlow.ClickBackButton();
    }


    @And("^user clicks 'confirm button'$")
    public void userClicksConfirmButton() {
        acceptDisclaimersFlow.ClickConfirmButton();
    }

    @Then("^confirm button should be enabled$")
    public void confirmButtonShouldBeEnabled() {
        acceptDisclaimersFlow.ValidateConfirmButtonIsEnabled();
    }

    @Then("^user should be navigated to the Campaign screen$")
    public void userShouldBeNavigatedToTheCampaignScreen(String campaignHeader) {
        campaignValidationFlow.ValidateCampaignHeader(campaignHeader);

    }

    @Then("^user should be navigated to the Financial screen \"([^\"]*)\"$")
    public void userShouldBeNavigatedToTheFinancialScreen(String financialHeader) {
        acceptDisclaimersFlow.FinancialHeader(financialHeader);
    }


}
