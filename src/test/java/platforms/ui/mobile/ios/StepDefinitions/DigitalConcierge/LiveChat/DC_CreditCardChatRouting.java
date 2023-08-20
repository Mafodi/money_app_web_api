package platforms.ui.mobile.ios.StepDefinitions.DigitalConcierge.LiveChat;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.apache.log4j.Logger;
import platforms.ui.mobile.ios.PageFactoryObject;
import platforms.ui.mobile.ios.StepDefinitions.DC_CommonFunctions;
import platforms.ui.mobile.ios.StepDefinitions.DC_CommonSteps;
import platforms.ui.mobile.ios.iOSPageObjects.iOSOverviewScreen;
import utils.CommonFunctions;
import utils.DriverFactory;

public class DC_CreditCardChatRouting extends DriverFactory {

    private static Logger log = Logger.getLogger(DC_CommonSteps.class);
    PageFactoryObject pageFactoryObj = new PageFactoryObject(driver);
    private CommonFunctions common = new CommonFunctions();

    @Then("^user will be Get the perfect solution for your needs page should display$")
    public void userWillBeGetThePerfectSolutionForYourNeedsPageShouldDisplay() throws Throwable {
       if(pageFactoryObj.getLiveChatScreenLocators().getPerfctSolutionForYourNeed.isDisplayed())
       {
           log.info(" Get the perfect solution for your needs is displayed");
       }
    }

    @And("^user click on Apply$")
    public void userClickOnApply() throws Throwable {
       pageFactoryObj.getLiveChatScreenLocators().apply.click();
        Thread.sleep(2);
    }

    @And("^user clicks on Credit cards$")
    public void userClicksOnCreditCards() throws Throwable {
        pageFactoryObj.getLiveChatScreenLocators().creditCardsOption.click();
    }

    @Then("^user clicks on Chat with a Nedbank agent button$")
    public void userClicksOnChatWithANedbankAgentButton() {

        DC_CommonFunctions.swipedowniOS();
        pageFactoryObj.getLiveChatScreenLocators().chatToNedbankAgent.click();
        DC_CommonFunctions.dataUsage();
        common.secondsDelay(2);
    }

    @And("^user click on Open a bank account or bundle$")
    public void userClickOnOpenABankAccountOrBundle() throws Throwable {
        pageFactoryObj.getLiveChatScreenLocators().openBankAccountBundle.click();
    }

    @Then("^Chat page gets opened$")
    public void chatPageGetsOpened() throws Throwable {
        if(pageFactoryObj.getUnauthChatScreenLocatos().chatTitle.isDisplayed())
            log.info("User is on Chat screen");

    }

    @And("^user needs to come back to overview screen$")
    public void userNeedsToComeBackToOverviewScreen() throws Throwable {

        common.secondsDelay(2);
        pageFactoryObj.getLiveChatScreenLocators().backButtonFromChat.click();
        common.secondsDelay(3);
        pageFactoryObj.getLiveChatScreenLocators().backButton.click();

        if (pageFactoryObj.getOverviewScreenLocator().Overview_MyAccount.isDisplayed()) {
            log.info("Successfully logged in");
        }
    }
}
