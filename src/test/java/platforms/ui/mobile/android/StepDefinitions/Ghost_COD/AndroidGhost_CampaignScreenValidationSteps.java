package platforms.ui.mobile.android.StepDefinitions.Ghost_COD;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.ui.WebDriverWait;
import platforms.ui.mobile.android.AndroidCommonMethods;
import platforms.ui.mobile.android.AndroidFlowModel.Ghost_OverdraftLimitIncrease_CampaignScreen_Flow;
import platforms.ui.mobile.android.AndroidPageObjects.Android_Ghost_OverdraftLimitIncreaseObjects;
import platforms.ui.mobile.ios.PageFactoryObject;
import utils.CommonFunctions;
import utils.DriverFactory;

public class AndroidGhost_CampaignScreenValidationSteps extends DriverFactory {

    private static Logger log = Logger.getLogger(Ghost_OverdraftLimitIncrease_CampaignScreen_Flow.class);
    PageFactoryObject pageFactoryObj = new PageFactoryObject(driver);
    WebDriverWait wait = new WebDriverWait(driver, 60);
    Android_Ghost_OverdraftLimitIncreaseObjects androidODLIPages = new Android_Ghost_OverdraftLimitIncreaseObjects(driver);
    Ghost_OverdraftLimitIncrease_CampaignScreen_Flow campaignValidationFlow = new Ghost_OverdraftLimitIncrease_CampaignScreen_Flow();
    private AndroidCommonMethods basePage = new AndroidCommonMethods();
    private CommonFunctions common = new CommonFunctions();

    @And("^Validate Text on the Campaign screen \"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"$")
    public void ValidatesTextOnCampaign(String campaignHeading, String campaignSubHeading, String featuresAndBenefitsLabel, String firstBenefit, String secondBenefit, String ThirdBenefit)  {
        //CampaignScreen
        campaignValidationFlow.ValidateCampaignHeader(campaignHeading);
        campaignValidationFlow.ValidateSubHeading(campaignSubHeading);
        campaignValidationFlow.ValidateFeaturesAndBenefitsLabel(featuresAndBenefitsLabel);
        campaignValidationFlow.ValidateFirstBenefit(firstBenefit);
        campaignValidationFlow.ValidateSecondBenefit(secondBenefit);
        campaignValidationFlow.VAliadteThirdBenefit(ThirdBenefit);

    }

    @And("^client clicks 'No Thanks' Button$")
    public void clientClicksNoThanksButton() {
        campaignValidationFlow.ClickNoThanksButton();
    }

    @Then("^client should be navigated back to the Offers screen$")
    public void clientShouldBeNavigatedBackToTheOffersScreen() {
        campaignValidationFlow.forYourOfferScreen();
    }

    @And("^client clicks on 'Im interested' button$")
    public void clientClicksOnImInterestedButton() {
        campaignValidationFlow.ClickInterestedButton();
    }

    @Then("^user should be navigated to the Disclaimers screen \"([^\"]*)\"$")
    public void clientShouldBeDirectedToTheNextScreenDisclaimersScreen(String disclaimersHeading) {
        campaignValidationFlow.DisclaimersHeader(disclaimersHeading);
    }









}
