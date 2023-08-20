package platforms.ui.mobile.ios.StepDefinitions;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.MobileElement;
import org.apache.log4j.Logger;
import platforms.ui.mobile.ios.IOSCommonMethods;
import platforms.ui.mobile.ios.VASIOSDataFactory;
import platforms.ui.mobile.ios.VASIOSObjects;
import platforms.ui.mobile.ios.iOSPageObjects.iOSOverviewScreen;
import utils.CommonFunctions;
import utils.DriverFactory;

import java.util.concurrent.TimeUnit;

public class VAS_IOS_BundleSelectionSteps extends DriverFactory {
    private static Logger log = Logger.getLogger(VAS_IOS_BundleSelectionSteps.class);
    IOSCommonMethods basePage = new IOSCommonMethods();
    CommonFunctions common = new CommonFunctions();
    String value;
    IOSLoginSteps login = new IOSLoginSteps();
    public iOSOverviewScreen iOSOverviewScreen = new iOSOverviewScreen(driver);

    @Given("^Existing customer is logged on to the IOS banking App$")
    public void Existing_customer_is_logged_on_to_the_banking_App(){
        login.userLaunchesIOSMoneyApp();
        login.userEntersAUsernameAndPassword(VASIOSDataFactory.PROFILE_USERNAME, VASIOSDataFactory.PROFILE_PASSWORD);
        login.userShouldBeOnIosWelcomePage();
    }

    @And("^User selects IOS Transact icon$")
    public void user_selects_transact_icon(){
        //Exten.getTest().log(Status.INFO, "User selects IOS Transact icon");
       // MobileElement myPocketBubbleclosebutton = driver.findElementByAccessibilityId(iOSOverviewScreen.My_Pocket_Close);
        iOSOverviewScreen.My_Pocket_Close.click();//myPocketBubbleclosebutton.click();
        //MobileElement welcomeOk = driver.findElementByAccessibilityId(iOSOverviewScreen.Welcome_OKButton_AccessbilityID);
        //welcomeOk.click();
        iOSOverviewScreen.Welcome_OK.click();
        MobileElement transact =  driver.findElementByAccessibilityId(VASIOSObjects.ENROLE_TRANSACT);
        transact.click();


    }
    @And("^User selects IOS Buy button$")
    public void user_selects_buy_button(){
        //extentTestManager.getTest().log(Status.INFO, "User selects IOS Buy button");
        MobileElement buy = driver.findElementByAccessibilityId(VASIOSObjects.BUY_BUTTON);
        common.secondsDelay(1);
        buy.click();
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);

    }

    @And("^IosUser want to purchase a pre-paid product$")
    public void user_want_to_purchase_a_pre_paid_product() {
        //ExtentTestManager.getTest().log(Status.INFO, "IosUser want to purchase a pre-paid product");
        MobileElement buyBundles = driver.findElementByAccessibilityId(VASIOSObjects.BUY_BUNDLES);
        if(buyBundles.isDisplayed()){
            buyBundles.click();
        }

    }

    @And("^IosUser must be navigated to By Airtime and Bundles screen$")
    public void user_must_be_navigated_to_By_Airtime_and_Bundles_screens(){
        //ExtentTestManager.getTest().log(Status.INFO, "IosUser must be navigated to By Airtime and Bundles screen");
        MobileElement buyNew = driver.findElementByAccessibilityId(VASIOSObjects.BUY_NEW_BUTTON);
        if(buyNew.isDisplayed()){
            System.out.println("user successfully navigated to Airtime and Bundles screen");
        }

    }
    @And("^IosUser clicks on the Buy New button$")
    public void user_clicks_on_the_Buy_New_button(){
        // ExtentTestManager.getTest().log(Status.INFO, "IosUser clicks on the Buy New button");
        MobileElement buyNew = driver.findElementById(VASIOSObjects.BUY_NEW_BUTTON);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        buyNew.click();
        MobileElement allowbutton = driver.findElementByAccessibilityId(VASIOSObjects.ALLOW_BUTTON);
        allowbutton.click();
        try {
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            // driver.findElementByAccessibilityId(IOSObjects.ALLOW_BUTTON).click();
            driver.findElementByAccessibilityId("OK").click();
        }catch (Exception e){
            System.out.println("Successfully clicked Allow button");
        }

    }
    @And("^IosUser should be able select \"([^\"]*)\"$")
    public void userShouldBeAbleSelect(String arg0){
        // ExtentTestManager.getTest().log(Status.INFO, "IosUser should be able select Recipient");
        MobileElement recipientSearch = driver.findElementByAccessibilityId(VASIOSObjects.RECIPIENT_SEARCH_TEXT);
        recipientSearch.sendKeys(VASIOSDataFactory.RECIPIENT);
        common.secondsDelay(1);
        MobileElement recipientSelect = driver.findElementByXPath(VASIOSObjects.RECIPIENT_SELECT);
        recipientSelect.click();

    }
    @And("^IosUser must be navigated to choose operators screen$")
    public void userMustBeNavigatedToChooseOperatorsScreens() {
        //ExtentTestManager.getTest().log(Status.INFO, "IosUser must be navigated to choose operators screen");
        MobileElement operatorScreen = driver.findElementByAccessibilityId(VASIOSObjects.PROVIDER_SCREEN);
        if(operatorScreen.isDisplayed()){
            System.out.println("user successfully navigated to operators screen");
        }

    }
    @And("^IosUser selects \"([^\"]*)\" type$")
    public void userSelectsTypes(String arg0){
        //ExtentTestManager.getTest().log(Status.INFO, "IosUser selects Provider");
        // String PROVIDER = "0";
        common.secondsDelay(1);
        MobileElement provider = driver.findElementByAccessibilityId(VASIOSObjects.SELECT_PROVIDER);
        provider.click();

    }

    @And("^IosUser should navigate to Airtime which is default bundle screen$")
    public void user_should_navigate_to_Airtime_which_is_default_bundle_screen(){
        //ExtentTestManager.getTest().log(Status.INFO, "IosUser should navigate to Airtime which is default bundle screen");
        MobileElement rechargeScreen = driver.findElementByAccessibilityId(VASIOSObjects.AIRTIME_SCREEN);
        if(rechargeScreen.isDisplayed()){
            System.out.println("Successfully navigate to Airtime which is default bundle screen");
        }

    }

    @When("^IosUser selects recharge \"([^\"]*)\"$")
    public void user_selects_recharge(String arg0){
        // ExtentTestManager.getTest().log(Status.INFO, "IosUser selects recharge type");
        MobileElement rechargeType = driver.findElementByAccessibilityId(VASIOSObjects.SELECT_AIRTIME_TYPE);
        value = rechargeType.getText();
        System.out.println("Printing " + rechargeType);
        rechargeType.click();

    }

    @Then("^IosUser must be navigated to relevant product offerings are active$")
    public void user_must_be_navigated_to_relevant_product_offerings_are_active(){
        // ExtentTestManager.getTest().log(Status.INFO, "IosUser must be navigated to relevant product offerings are active");
        if (value.equals(VASIOSObjects.SELECT_AIRTIME_TYPE)){
            System.out.println("User successfully navigated to relevant product offerings");
        }
    }


}