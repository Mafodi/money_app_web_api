package platforms.ui.mobile.android.AndroidFlowModel;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.ui.WebDriverWait;
import platforms.ui.mobile.android.AndroidCommonMethods;
import platforms.ui.mobile.android.AndroidPageObjects.AndroidOverviewScreen;
import platforms.ui.mobile.android.FND_AndroidDataFactory;
import platforms.ui.mobile.android.StepDefinitions.Login2;
import utils.DriverFactory;

public class Transfer_Flow extends DriverFactory {

    private AndroidCommonMethods basepage = new AndroidCommonMethods();
    private static Logger log = Logger.getLogger(Transfer_Flow.class);
    Login2 login=new Login2();
    AndroidOverviewScreen overviewScreen= new AndroidOverviewScreen(driver);

    public void Navigate_To_Transfer_Screen() throws Throwable {
        //Login
        login.userLaunchTheMoneyAppNew();
        login.userEntersAUsernameAndPasswordForFirstLoginB(FND_AndroidDataFactory.username,FND_AndroidDataFactory.password);
        login.userShouldBeOnTheWelcomePageB();
        Thread.sleep(3000);
        overviewScreen.Transact_menu.click();
        log.info("Transact button clicked successfully");
        overviewScreen.Transact_transfer.click();
        log.info("Transfer button clicked successfully");
    }
}
