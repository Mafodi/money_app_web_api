package platforms.ui.mobile.ios.StepDefinitions.DigitalConcierge.LiveChat;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import io.appium.java_client.MobileElement;
import org.apache.log4j.Logger;
import platforms.ui.mobile.ios.PageFactoryObject;
import platforms.ui.mobile.ios.StepDefinitions.DC_CommonSteps;
import utils.DriverFactory;

import java.util.List;

public class DC_UserEndChat extends DriverFactory {

    PageFactoryObject pageFactoryObj = new PageFactoryObject(driver);
    private static Logger log = Logger.getLogger(DC_CommonSteps.class);

    @And("^user click on close chat icon$")
    public void userClickOnCloseChatIcon() throws Throwable {
        pageFactoryObj.getLiveChatScreenLocators().endChatButton.click();
        log.info("clicked on end chat");
    }

    @And("^user click on End button$")
    public void userClickOnEndButton() throws Throwable {
        pageFactoryObj.getLiveChatScreenLocators().endOption.click();
    }

    @Then("^End chat popup window should displayed with End and Cancel button$")
    public void endChatPopupWindowShouldDisplayedWithEndAndCancelButton() throws Throwable {
        pageFactoryObj.getLiveChatScreenLocators().endOption.isDisplayed();
    }
}
