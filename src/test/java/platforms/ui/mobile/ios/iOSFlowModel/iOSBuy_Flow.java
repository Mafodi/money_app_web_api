package platforms.ui.mobile.ios.iOSFlowModel;

import io.appium.java_client.TouchAction;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.ui.WebDriverWait;
import platforms.ui.mobile.ios.FND_IOSDataFactory;
import platforms.ui.mobile.ios.IOSCommonMethods;
import platforms.ui.mobile.ios.StepDefinitions.iOSLogin2;
import platforms.ui.mobile.ios.iOSPageObjects.iOSBuyScreen;
import platforms.ui.mobile.ios.iOSPageObjects.iOSOverviewScreen;
import utils.DriverFactory;

public class iOSBuy_Flow extends DriverFactory {
    WebDriverWait wait= new WebDriverWait(getIOSDriver(),60);
    private IOSCommonMethods basepage = new IOSCommonMethods();
    private static Logger log = Logger.getLogger(iOSPayment_Flow.class);
    iOSLogin2 login = new iOSLogin2();
    iOSOverviewScreen overviewScreen = new iOSOverviewScreen(driver);
    TouchAction touchAction = new TouchAction(driver);
    iOSBuyScreen buyScreen = new iOSBuyScreen(driver);


    public void Navigate_To_Buy_Lotto_Powerball_Screen() throws Throwable {
        //Login
        login.userLaunchTheMoneyAppNewIosApp();
        login.userEntersAUsernameAndPasswordForFirstLoginIosApp(FND_IOSDataFactory.username, FND_IOSDataFactory.password);
        login.userShouldBeOnTheWelcomePageIosApp();
        Thread.sleep(1000);
        overviewScreen.Transact_menu.click();
        log.info("Transact button clicked successfully");
        Thread.sleep(1000);
        overviewScreen.Transact_buy.click();
        log.info("Buy button clicked successfully");
        buyScreen.Play_Lotto_Powerball.click();
    }

    public void Navigate_To_Buy_Prepaid_Data_Airtime() throws Throwable {
        //Login
        login.userLaunchTheMoneyAppNewIosApp();
        login.userEntersAUsernameAndPasswordForFirstLoginIosApp(FND_IOSDataFactory.username, FND_IOSDataFactory.password);
        login.userShouldBeOnTheWelcomePageIosApp();
        Thread.sleep(1000);
        overviewScreen.Transact_menu.click();
        log.info("Transact button clicked successfully");
        Thread.sleep(1000);
        overviewScreen.Transact_buy.click();
        log.info("Buy button clicked successfully");
        buyScreen.Buy_prepaid_data_airtime1.click();
    }

}


