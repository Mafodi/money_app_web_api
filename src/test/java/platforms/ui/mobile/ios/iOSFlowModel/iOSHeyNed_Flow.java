package platforms.ui.mobile.ios.iOSFlowModel;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import platforms.ui.mobile.ios.PageFactoryObject;
import platforms.ui.mobile.ios.StepDefinitions.DC_CommonFunctions;
import platforms.ui.mobile.ios.StepDefinitions.DigitalConcierge.HeyJude.DC_HeyNedDeleteTask;
import platforms.ui.mobile.ios.StepDefinitions.iOSLogin2;
import utils.DriverFactory;

import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class iOSHeyNed_Flow extends DriverFactory {
    private static Logger log = Logger.getLogger(DC_HeyNedDeleteTask.class);
    iOSLogin2 login = new iOSLogin2();
    PageFactoryObject pageFactoryObj = new PageFactoryObject(driver);
    WebDriverWait wait = new WebDriverWait(driver, 60);

    //Flow model functions


    public void Navigate_To_HeyNed_Subscription(String userName, String password) throws Throwable {
        try {
            NavigateToHeyNed(userName, password);
            wait.until(visibilityOf(pageFactoryObj.getSubscriptionScreenLocator().subscriptionHeading));
            if (pageFactoryObj.getSubscriptionScreenLocator().subscriptionHeading.getText().contains("Join the HeyNed lifestyle service for")) {
                System.out.println("On subscription screen");
            }
        } catch (Exception ex) {
            log.error(ex.getMessage());
        }
    }


    public void Navigate_To_HeyNed_SettingsScreen(String userName, String password) throws Throwable {
        try {
            LogintoApp(userName, password);

            if (pageFactoryObj.getOverviewScreenLocator().moreButton.size() > 0) {
                pageFactoryObj.getOverviewScreenLocator().moreButton.get(0).click();
            }
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            pageFactoryObj.getProfileScreenLocatorscreen().settingOption.click();

            if (pageFactoryObj.getProfileScreenLocatorscreen().heyNedSettingOption.isDisplayed()) {
                pageFactoryObj.getProfileScreenLocatorscreen().heyNedSettingOption.click();
            }

        } catch (Exception ex) {
            log.error(ex.getMessage());
        }
    }

    public void Navigate_To_HeyNed_TaskScreen(String userName, String password) throws Throwable {
        try {
            NavigateToHeyNed(userName, password);
            wait.until(ExpectedConditions.visibilityOfAllElements(pageFactoryObj.getTaskCreationScreen().createTaskTextBox));
            DC_CommonFunctions.OnTaskCreationScreen();
        }catch (Exception ex) {
            log.error(Thread.currentThread().getStackTrace()[1].getMethodName() + ex.getMessage());
        }
    }

    public void Navigate_To_HeyNed_TermsNConditions(String userName, String password) throws Throwable {
        try {
            LogintoApp(userName, password);

            if (pageFactoryObj.getOverviewScreenLocator().moreButton.size() > 0) {
                pageFactoryObj.getOverviewScreenLocator().moreButton.get(0).click();
            }
            DC_CommonFunctions.swipedowniOS();
            pageFactoryObj.getProfileScreenLocatorscreen().termsAndConditions.isDisplayed();

        } catch (Exception ex) {
            log.error(ex.getMessage());
        }
    }

    //Supportive funcions for flow model
    private void LogintoApp(String userName, String password) throws Throwable {
        System.out.println("Logged in ");
        login.userLaunchTheMoneyAppNewIosApp();
        login.userEntersAUsernameAndPasswordForFirstLoginIosApp(userName, password);
        login.userShouldBeOnTheWelcomePageIosApp();
        Thread.sleep(10);
        System.out.println("Logged in ");

    }

    private void NavigateToHeyNed(String userName, String password) throws Throwable {
        LogintoApp(userName, password);
        DC_CommonFunctions.chat_icon_on_overview_page();
        DC_CommonFunctions.dataUsage();
        pageFactoryObj.getChatScreenLocator().heyNedOption.click();
        DC_CommonFunctions.EducationalScreenflow();
        DC_CommonFunctions.ClickOnGetStartedButton();
    }

}
