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
import platforms.ui.mobile.android.AndroidFlowModel.Ghost_OverdraftLimitIncrease_YourOfferScreen_Flow;
import platforms.ui.mobile.android.AndroidPageObjects.Android_Ghost_OverdraftLimitIncreaseObjects;
import platforms.ui.mobile.android.Ghost_Cod_AndroidDataFactory;
import platforms.ui.mobile.ios.PageFactoryObject;
import utils.CommonFunctions;
import utils.DriverFactory;

public class AndroidGhost_YourOfferSteps extends DriverFactory {


    private static Logger log = Logger.getLogger(Ghost_OverdraftLimitIncrease_AcceptDisclaimers_Flow.class);
    PageFactoryObject pageFactoryObj = new PageFactoryObject(driver);
    WebDriverWait wait = new WebDriverWait(driver, 60);
    DC_HeyNedSubscription_Flow subscriptionFlow = new DC_HeyNedSubscription_Flow();
    Android_Ghost_OverdraftLimitIncreaseObjects androidODLIPages = new Android_Ghost_OverdraftLimitIncreaseObjects(driver);
    Ghost_OverdraftLimitIncrease_FinancialInformation_Flow financialInfo_Flow = new Ghost_OverdraftLimitIncrease_FinancialInformation_Flow();
    Ghost_OverdraftLimitIncrease_AcceptDisclaimers_Flow acceptDisclaimersFlow = new Ghost_OverdraftLimitIncrease_AcceptDisclaimers_Flow();
    Ghost_Cod_AndroidDataFactory ghostCodAndroidDataFactory = new Ghost_Cod_AndroidDataFactory();
    Ghost_OverdraftLimitIncrease_YourOfferScreen_Flow yourOfferScreenFlow = new Ghost_OverdraftLimitIncrease_YourOfferScreen_Flow();
    private AndroidCommonMethods basePage = new AndroidCommonMethods();
    private CommonFunctions common = new CommonFunctions();
    //YourOffer

    @And("^user validate Offer Slider$")
    public void userValidateOfferSlider() {

        yourOfferScreenFlow.UpdateLoanAmountViaSlider();

    }

    @And("^user validate current repayment amount$")
    public void userValidateCurrentRepaymentAmount() {

        yourOfferScreenFlow.getCurrentRepaymentAmount();

    }


    @And("^user clicks recalculate button$")
    public void userClicksRecalculateButton() {

        yourOfferScreenFlow.ClickRecalculateButton();

    }

    @Then("^repayment amount should be updated$")
    public void recalculateButtonShouldBeUpdated() {

        yourOfferScreenFlow.validateNewRepaymentAmount();

    }

    @And("^user captures invalid amount$")
    public void userCapturesInvalidAmount() {

        yourOfferScreenFlow.CaptureInvalidLoanAmount();

    }

    @Then("^error message should be displayed$")
    public void errorMessageShouldBeDisplayed() {

        yourOfferScreenFlow.InvalidAmountErrorMessage();

    }



    @And("^user validate current loan amount$")
    public void userValidateCurrentLoanAmount() {

        yourOfferScreenFlow.getCurrentLoanAmount();

    }


    @Then("^the Overdraft amount input box should be updated to the same amount on slider$")
    public void theOverdraftAmountInputBoxShouldBeUpdatedToTheSameAmountOnSlider() {
      yourOfferScreenFlow.newLoanAmount();

    }

    @And("^user clicks on the Yes toggle$")
    public void userClicksOnTheYesToggle() {
        yourOfferScreenFlow.ClickYesToggle();

    }

    @Then("^user validate annual increase tooltip text \"([^\"]*)\"$")
    public void userShouldBeNavigatedToTheYourOfferScreen(String AnnualIncreaseToggleMessage)  {
        yourOfferScreenFlow.getAnnualIncreaseToggleMessage(AnnualIncreaseToggleMessage);
    }



}