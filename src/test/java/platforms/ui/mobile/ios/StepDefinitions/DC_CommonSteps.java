package platforms.ui.mobile.ios.StepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import platforms.ui.mobile.ios.PageFactoryObject;
import platforms.ui.mobile.ios.iOSFlowModel.iOSHeyNed_Flow;
import platforms.ui.mobile.ios.iOSFlowModel.iOSLiveChat_Flow;
import utils.CommonFunctions;
import utils.DriverFactory;

import java.util.concurrent.TimeUnit;

public class DC_CommonSteps extends DriverFactory {

    private static Logger log = Logger.getLogger(DC_CommonSteps.class);
    PageFactoryObject pageFactoryObj = new PageFactoryObject(driver);
    WebDriverWait wait = new WebDriverWait(driver, 60);
    private CommonFunctions common = new CommonFunctions();
    iOSHeyNed_Flow heyJudeFlowModel=new iOSHeyNed_Flow();
    iOSLiveChat_Flow liveChatFlowModel =  new iOSLiveChat_Flow();

    @And("^user clicks on Chat button on Overview screen$")
    public void userClicksOnChatButtonOnOverviewScreen() {
        try {
            wait.until(ExpectedConditions.visibilityOf(pageFactoryObj.getOverviewScreenLocator().chatButton));
            DC_CommonFunctions.chat_icon_on_overview_page();
            DC_CommonFunctions.dataUsage();
        } catch (Exception ex) {
            log.info(ex.getMessage());
        }
    }

    @And("^user clicks on Lifestyle option$")
    public void userClicksOnLifestyleOption() throws InterruptedException {
        Thread.sleep(1000);
        try {
            pageFactoryObj.getChatScreenLocator().heyNedOption.click();
            log.info("Click on Lifestyle button");
        }
        catch (Exception ex)
        {
            log.info(ex.getMessage());
        }
    }

    @Then("^user should see the education screens$")
    public void userShouldSeeTheEducationScreens() {
        DC_CommonFunctions.EducationalScreenflow();
    }

    @And("^user select the Get started button$")
    public void userSelectTheGetStartedButton() {
        DC_CommonFunctions.ClickOnGetStartedButton();
    }


    @When("^user is on task list screen$")
    public void userIsOnTaskListScreen() {
        wait.until(ExpectedConditions.visibilityOfAllElements(pageFactoryObj.getTaskCreationScreen().createTaskTextBox));
        DC_CommonFunctions.OnTaskCreationScreen();
    }

    //More button functionality
    @And("^user clicks on More button$")
    public void userClicksOnMoreButton() {
        if (pageFactoryObj.getOverviewScreenLocator().moreButton.size()>0)
            pageFactoryObj.getOverviewScreenLocator().moreButton.get(0).click();
    }

    @And("^user clicks on Settings option$")
    public void userClicksOnSettingsOption() {
        try {
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            pageFactoryObj.getProfileScreenLocatorscreen().settingOption.click();
        } catch (Exception ex) {
            log.error(ex.getMessage());
        }
    }

    @And("^user clicks on HeyNed Settings option screen$")
    public void userClicksOnHeyNedSettingsOptionScreen() {
        try {
            if(pageFactoryObj.getProfileScreenLocatorscreen().heyNedSettingOption.isDisplayed())
                pageFactoryObj.getProfileScreenLocatorscreen().heyNedSettingOption.click();
        } catch (Exception ex) {
            log.error(ex.getMessage());
        }
    }

    @And("^Click on Profile$")
    public void clickOnProfile() {
        try
        {
            pageFactoryObj.getProfileUpdateScreenLocator().profileMenu.click();
        } catch (Exception ex) {
            log.error(ex.getMessage());
        }
    }

    //Card common steps
    @And("^user will be redirected to Payment method screen$")
    public void userWillBeRedirectedToPaymentMethodScreen() {
        if(pageFactoryObj.getPaymentScreen().paymentMethodScreenTitle.isDisplayed())
        {
            log.info("On Payment screen");
        }
    }

    @And("^user can select Add another card option$")
    public void userCanSelectAddanothercardOption() {
        common.secondsDelay(2);
        pageFactoryObj.getPaymentCardScreen().addAnotherCardButton.click();
        log.info("select Add another card");

    }

    @And("^user can see two options to add card$")
    public void userCanSeeTwoOptionsToAddCard() {
        try {
            if (pageFactoryObj.getPaymentCardScreen().selectNedbankCard.isDisplayed() && pageFactoryObj.getPaymentCardScreen().enterCardDetails.isDisplayed())
                log.info("can see two options to add card");
        }
        catch (Exception ex)
        {
            log.error(ex.getMessage());
        }
    }


    @And("^user click on Nedbank Card Option and select a card$")
    public void userClickOnNedbankCardOptionAndSelectACard() {
        pageFactoryObj.getPaymentCardScreen().selectNedbankCard.click();
        //wait(5);
        log.info("click on Nedbank Card Option and select a card");
    }

    @And("^user can select Enter Card details$")
    public void userCanSelectEnterCardDetails() throws Throwable {
        pageFactoryObj.getPaymentCardScreen().enterCardDetails.click();
    }

    @And("^Add Other bank card details \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"and \"([^\"]*)\"$")
    public void addOtherBankCardDetailsAnd(String arg0, String arg1, String arg2, String arg3) throws Throwable {
        common.secondsDelay(1);
        DC_CommonFunctions.AddCardDetails(arg0, arg1, arg2, arg3);
        common.secondsDelay(2);
    }


    @And("^click on Add Payment method button$")
    public void clickOnAddPaymentMethodButton() {
        pageFactoryObj.getPaymentCardScreen().addCardButton.click();
        common.secondsDelay(2);
    }

    @Given("^user is on HeyNed Task screen on login with username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void userIsOnHeyNedTaskScreenOnLoginWithUsernameAndPassword(String userName, String password) throws Throwable {
        heyJudeFlowModel.Navigate_To_HeyNed_TaskScreen(userName, password);
    }

    @Given("^user is on HeyNed setting screen on login with username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void userIsOnHeyNedSettingScreenOnLoginWithUsernameAndPassword(String userName, String password) throws Throwable {
        heyJudeFlowModel.Navigate_To_HeyNed_SettingsScreen(userName, password);

    }

    @Given("^user is on Chatting screen on login with username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void userIsOnChattingScreenOnLoginWithUsernameAndPassword(String userName, String password) throws Throwable {
        liveChatFlowModel.Navigate_To_AuthenticatedLiveChat_Screen(userName, password);
    }

    @Given("^user starts Unauthenticated chat screen with name \"([^\"]*)\" and email \"([^\"]*)\"$")
    public void userStartsUnauthenticatedChatScreenWithNameAndEmail(String name, String emailAddress) throws Throwable {
        liveChatFlowModel.Navigate_To_UnauthenticatedLiveChat_Screen(name, emailAddress);

    }
}
