package platforms.ui.mobile.ios.StepDefinitions.DigitalConcierge.LiveChat;

import cucumber.api.PendingException;
import cucumber.api.java.en.When;
import io.appium.java_client.MobileElement;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.ui.WebDriverWait;
import platforms.ui.mobile.ios.PageFactoryObject;
import utils.CommonFunctions;
import utils.DriverFactory;

public class DC_UnAuthLiveChat extends DriverFactory {

    private static Logger log = Logger.getLogger(DC_UnAuthLiveChat.class);
    PageFactoryObject pageFactoryObj = new PageFactoryObject(driver);
    WebDriverWait wait = new WebDriverWait(driver, 60);
    MobileElement taskToCancel = null;
    private CommonFunctions common = new CommonFunctions();

    @When("^user sends message \"([^\"]*)\" to unauth user$")
    public void userSendsMessageToUnauthUser(String textTobeSend) throws Throwable {

        common.secondsDelay(3);
        pageFactoryObj.getUnauthChatScreenLocatos().chatTextBox.click();
        pageFactoryObj.getUnauthChatScreenLocatos().chatTextBox.sendKeys(textTobeSend);


    }
}
