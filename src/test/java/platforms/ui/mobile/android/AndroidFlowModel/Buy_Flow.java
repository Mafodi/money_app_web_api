package platforms.ui.mobile.android.AndroidFlowModel;

import org.apache.log4j.Logger;
import platforms.ui.mobile.android.AndroidCommonMethods;
import platforms.ui.mobile.android.AndroidPageObjects.AndroidBuyScreen;
import platforms.ui.mobile.android.AndroidPageObjects.AndroidOverviewScreen;
import platforms.ui.mobile.android.FND_AndroidDataFactory;
import platforms.ui.mobile.android.StepDefinitions.Login2;
import utils.DriverFactory;

public class Buy_Flow extends DriverFactory {
    private AndroidCommonMethods basepage = new AndroidCommonMethods();
    private static Logger log = Logger.getLogger(Payment_Flow.class);
    Login2 login = new Login2();
    AndroidOverviewScreen overviewScreen = new AndroidOverviewScreen(driver);
    AndroidBuyScreen buyScreen= new AndroidBuyScreen(driver);

    public void Navigate_To_Play_Lotto_Powerball_Screen() throws Throwable {
        //Login
        login.userLaunchTheMoneyAppNew();
        login.userEntersAUsernameAndPasswordForFirstLoginB(FND_AndroidDataFactory.username,FND_AndroidDataFactory.password);
        login.userShouldBeOnTheWelcomePageB();
        Thread.sleep(3000);
        overviewScreen.Transact_menu.click();
        log.info("Transact button clicked successfully");
        overviewScreen.Transact_buy.click();
        log.info("Payment button clicked successfully");
        buyScreen.Buy_Lotto_Powerball.click();
        log.info("Play lotto and powerball button clicked successfully");
    }

    public void Navigate_To_Prepaid_data_airtime_sms() throws Throwable {
        //Login
        login.userLaunchTheMoneyAppNew();
        login.userEntersAUsernameAndPasswordForFirstLoginB(FND_AndroidDataFactory.username,FND_AndroidDataFactory.password);
        login.userShouldBeOnTheWelcomePageB();
        Thread.sleep(3000);
        overviewScreen.Transact_menu.click();
        log.info("Transact button clicked successfully");
        overviewScreen.Transact_buy.click();
        log.info("Payment button clicked successfully");
        buyScreen.Buy_Lotto_Powerball.click();
        log.info("Play lotto and powerball button clicked successfully");
    }


}


