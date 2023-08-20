package platforms.ui.mobile.ios.iOSFlowModel;

import io.appium.java_client.TouchAction;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.ui.WebDriverWait;
import platforms.ui.mobile.ios.FND_IOSDataFactory;
import platforms.ui.mobile.ios.IOSCommonMethods;
import platforms.ui.mobile.ios.StepDefinitions.iOSLogin2;
import platforms.ui.mobile.ios.VASIOSDataFactory;
import platforms.ui.mobile.ios.iOSPageObjects.iOSBuyScreen;
import platforms.ui.mobile.ios.iOSPageObjects.iOSOverviewScreen;
import utils.DriverFactory;

public class IOSBuyVoucher_Flow extends DriverFactory {

    WebDriverWait wait= new WebDriverWait(getIOSDriver(),60);
    private IOSCommonMethods basepage = new IOSCommonMethods();
    private static Logger log = Logger.getLogger(iOSPayment_Flow.class);
    iOSLogin2 login = new iOSLogin2();
    iOSOverviewScreen overviewScreen = new iOSOverviewScreen(driver);
    TouchAction touchAction = new TouchAction(driver);
    iOSBuyScreen buyScreen = new iOSBuyScreen(driver);





    /*public void NavigatetoBuyVouchers(){

        login.userLaunchTheMoneyAppNewIosApp();
        login.userEntersAUsernameAndPasswordForFirstLoginIosApp(VASIOSDataFactory.PROFILE_USERNAME, VASIOSDataFactory.PROFILE_PASSWORD;
        login.userShouldBeOnTheWelcomePageIosApp();
        Thread.sleep(1000);
        overviewScreen.Transact_menu.click();
        log.info("Transact button clicked successfully");
        Thread.sleep(1000);
        overviewScreen.Transact_buy.click();
        log.info("Buy button clicked successfully");


    }*/
}
