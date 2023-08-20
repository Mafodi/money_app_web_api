package platforms.ui.mobile.ios.iOSFlowModel;

import org.apache.log4j.Logger;
import platforms.ui.mobile.android.AndroidCommonMethods;
import platforms.ui.mobile.ios.FND_IOSDataFactory;
import platforms.ui.mobile.ios.StepDefinitions.iOSLogin2;
import platforms.ui.mobile.ios.iOSPageObjects.iOSOverviewScreen;
import utils.DriverFactory;

public class iOSTransfer_Flow extends DriverFactory {

    private AndroidCommonMethods basepage = new AndroidCommonMethods();
    private static Logger log = Logger.getLogger(iOSTransfer_Flow.class);
    iOSLogin2 login=new iOSLogin2();
    iOSOverviewScreen overviewScreen= new iOSOverviewScreen(driver);

    public void Navigate_To_Transfer_Screen() throws Throwable {
        //Login
        login.userLaunchTheMoneyAppNewIosApp();
        login.userEntersAUsernameAndPasswordForFirstLoginIosApp(FND_IOSDataFactory.username,FND_IOSDataFactory.password);
        login.userShouldBeOnTheWelcomePageIosApp();
        Thread.sleep(3000);
        overviewScreen.Transact_menu.click();
        log.info("Transact button clicked successfully");
        Thread.sleep(1000);
        overviewScreen.Transact_transfer.click();
        log.info("Transfer button clicked successfully");
    }
}
