package platforms.ui.mobile.ios.StepDefinitions.DigitalConcierge.LiveChat;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.MobileElement;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.ui.WebDriverWait;
import platforms.ui.mobile.ios.PageFactoryObject;
import platforms.ui.mobile.ios.StepDefinitions.DC_CommonFunctions;
import utils.CommonFunctions;
import utils.DriverFactory;

public class DC_ChatAgentConnectivity extends DriverFactory {

    private static Logger log = Logger.getLogger(DC_ChatAgentConnectivity.class);
    PageFactoryObject pageFactoryObj = new PageFactoryObject(driver);
    WebDriverWait wait = new WebDriverWait(driver, 60);
    MobileElement taskToCancel = null;
    private CommonFunctions common = new CommonFunctions();

    @Then("^user clicks on Chat option$")
    public void userClicksOnChatOption() throws Throwable {
        pageFactoryObj.getChatScreenLocator().liveChatOption.click();
    }

    @When("^user sends message \"([^\"]*)\"$")
    public void userSendsMessage(String chatMessage) throws Throwable {
        try {
            common.secondsDelay(2);
            pageFactoryObj.getLiveChatScreenLocators().chatTextBox.click();
            pageFactoryObj.getLiveChatScreenLocators().chatTextBox.click();
            pageFactoryObj.getLiveChatScreenLocators().chatTextBox.sendKeys(chatMessage);

            pageFactoryObj.getUnauthChatScreenLocatos().chatSendBtn.click();
            common.secondsDelay(1);
        }catch (Exception ex)
        {
            log.error("Got exception in userSendsMessage method :- "+ ex.getMessage());
        }
    }

    @When("^user clicks on the chat icon$")
    public void userClicksOnTheChatIcon() {
        try {
            if (pageFactoryObj.getLoginScreenLocatos().chatIcon.isDisplayed()) {
                pageFactoryObj.getLoginScreenLocatos().chatIcon.click();
                log.info("Chat icon clicked successfully");
                DC_CommonFunctions.dataUsage();
            }
        } catch (Exception ex) {
            log.warn(ex.getMessage());
        }
    }

    @And("^user enters Name \"([^\"]*)\"$")
    public void userEntersName(String arg0) {
        try {
            pageFactoryObj.getUnauthChatScreenLocatos().userName.sendKeys(arg0);
        } catch (Exception ex) {
            log.warn(ex.getMessage());
        }
    }

    @And("^user enters Email Address \"([^\"]*)\"$")
    public void userEntersEmailAddress(String arg0) {
        try {
            pageFactoryObj.getUnauthChatScreenLocatos().emailAddress.sendKeys(arg0);
        } catch (Exception ex) {
            log.warn(ex.getMessage());
        }
    }

    @And("^user will get a queue message$")
    public void userWillGetAQueueMessage() throws Throwable {
        try {
            common.secondsDelay(2);
            if (pageFactoryObj.getUnauthChatScreenLocatos().chatTitle.getText().contains("Chatting to")) {
                log.info("User is " + pageFactoryObj.getUnauthChatScreenLocatos().chatTitle.getText() + "Agent");
            } else {
                log.error("User is not yet connected to Agent, will wait for some time to connect to agent");
                common.secondsDelay(5);
                //Will wait for some time to connect with agent
                if (pageFactoryObj.getUnauthChatScreenLocatos().chatTitle.getText().contains("Chatting to"))
                    log.info("User is " + pageFactoryObj.getUnauthChatScreenLocatos().chatTitle.getText() + "Agent");
                else
                    log.error("User is not yet connected to Agent, will wait for some time to connect to agent");
            }
        } catch (Exception ex) {
            log.warn(ex.getMessage());
        }
    }

    @And("^user clicks on Submit button$")
    public void userClicksOnSubmitButton() {
        pageFactoryObj.getUnauthChatScreenLocatos().submitBtn.click();
    }

    @Then("^agent gets connected$")
    public void agentGetsConnected() {
        try {
            //common.secondsDelay(2);
            if(pageFactoryObj.getUnauthChatScreenLocatos().chatTitleChat.size()>0)
            {
                log.info("Agent is not connected");
            }
            else
                log.info("Agent is connected");


        } catch (Exception ex) {
            log.warn("Exception in agentGetsConnected function:- "+ex.getMessage());
        }
    }

        @Then("^The agent gets connected$")
        public void theAgentGetsConnected () throws Throwable {
            try {
                common.secondsDelay(2);
                if (pageFactoryObj.getUnauthChatScreenLocatos().chatTitle.getText().contains("Chatting to"))
                {
                    log.info("User is " + pageFactoryObj.getUnauthChatScreenLocatos().chatTitle.getText() + "Agent");
                }
                else {
                    log.error("User is not yet connected to Agent, will wait for some time to connect to agent");
                    common.secondsDelay(5);
                    //Will wait for some time to connect with agent
                    if (pageFactoryObj.getUnauthChatScreenLocatos().chatTitle.getText().contains("Chatting to"))
                        log.info("User is " + pageFactoryObj.getUnauthChatScreenLocatos().chatTitle.getText() + "Agent");
                    else
                        log.error("User is not yet connected to Agent, will wait for some time to connect to agent");
                }
            } catch (Exception ex) {
                log.warn(ex.getMessage());
            }
        }

    @And("^user starts chatting with Agent$")
    public void userStartsChattingWithAgent() throws Throwable {
        if(pageFactoryObj.getLiveChatScreenLocators().welcomeMsg.isDisplayed())
        {
            log.info("User can start chatting to agent");
        }
    }


    @Then("^agent gets connected to Unauth user$")
    public void agentGetsConnectedToUnauthUser() throws Throwable {
        common.secondsDelay(2);
       if(pageFactoryObj.getUnauthChatScreenLocatos().unAuthchatTitle.getText().contains("Chatting to"))
       {
           log.info("Agent is connected, user can start chat");
           pageFactoryObj.getUnauthChatScreenLocatos().chatSendBtn.click();
       }
       else
       {
           common.secondsDelay(2);
           if(pageFactoryObj.getUnauthChatScreenLocatos().unAuthchatTitle.getText().contains("Chatting to"))
           {
               log.info("Agent is connected, user can start chat");
               pageFactoryObj.getUnauthChatScreenLocatos().chatSendBtn.click();
           }
           else {
               log.info("Agent is not connected, user can start chat");
           }
       }

    }
}