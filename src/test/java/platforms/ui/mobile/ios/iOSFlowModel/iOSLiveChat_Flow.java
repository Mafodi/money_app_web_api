package platforms.ui.mobile.ios.iOSFlowModel;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.ui.WebDriverWait;
import platforms.ui.mobile.ios.PageFactoryObject;
import platforms.ui.mobile.ios.StepDefinitions.DC_CommonFunctions;
import platforms.ui.mobile.ios.StepDefinitions.DigitalConcierge.HeyJude.DC_HeyNedDeleteTask;
import platforms.ui.mobile.ios.StepDefinitions.iOSLogin2;
import utils.DriverFactory;

public class iOSLiveChat_Flow extends DriverFactory {
    private static Logger log = Logger.getLogger(DC_HeyNedDeleteTask.class);
    PageFactoryObject pageFactoryObj = new PageFactoryObject(driver);
    WebDriverWait wait = new WebDriverWait(driver, 60);
    iOSLogin2 login = new iOSLogin2();

    public void Navigate_To_AuthenticatedLiveChat_Screen(String userName, String password) throws Throwable {
        LogintoApp(userName,password);
        //click on chat button
        DC_CommonFunctions.chat_icon_on_overview_page();
        //data usage screen
        DC_CommonFunctions.dataUsage();
        //click on chat option
        pageFactoryObj.getChatScreenLocator().liveChatOption.click();
    }

    public void Navigate_To_UnauthenticatedLiveChat_Screen(String name, String emailAddress) throws Throwable {
        try {
        login.userLaunchTheMoneyAppNewIosApp();
            if (pageFactoryObj.getLoginScreenLocatos().chatIcon.isDisplayed()) {
                pageFactoryObj.getLoginScreenLocatos().chatIcon.click();
                log.info("Chat icon clicked successfully");
                DC_CommonFunctions.dataUsage();
                pageFactoryObj.getUnauthChatScreenLocatos().userName.sendKeys(name);
                pageFactoryObj.getUnauthChatScreenLocatos().emailAddress.sendKeys(emailAddress);
                pageFactoryObj.getUnauthChatScreenLocatos().submitBtn.click();
            }
        }catch (Exception ex)
        {
            log.warn(ex.getMessage());
        }

    }

    private void LogintoApp(String userName, String password) throws Throwable {
        System.out.println("Logged in ");
        login.userLaunchTheMoneyAppNewIosApp();
        login.userEntersAUsernameAndPasswordForFirstLoginIosApp(userName, password);
        login.userShouldBeOnTheWelcomePageIosApp();
        Thread.sleep(10);
    }

}
