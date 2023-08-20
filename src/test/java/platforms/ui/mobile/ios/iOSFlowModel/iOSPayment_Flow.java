package platforms.ui.mobile.ios.iOSFlowModel;

import io.appium.java_client.TouchAction;
import io.appium.java_client.remote.HideKeyboardStrategy;
import io.appium.java_client.touch.offset.PointOption;
import org.apache.log4j.Logger;
import platforms.ui.mobile.ios.FND_IOSDataFactory;
import platforms.ui.mobile.ios.IOSCommonMethods;
import platforms.ui.mobile.ios.StepDefinitions.iOSLogin2;
import platforms.ui.mobile.ios.iOSPageObjects.iOSOverviewScreen;
import platforms.ui.mobile.ios.iOSPageObjects.iOSPayScreen;
import utils.DriverFactory;

import java.util.concurrent.TimeUnit;

public class iOSPayment_Flow extends DriverFactory {
    private IOSCommonMethods basepage = new IOSCommonMethods();
    private static Logger log = Logger.getLogger(iOSPayment_Flow.class);
    iOSLogin2 login = new iOSLogin2();
    iOSOverviewScreen overviewScreen = new iOSOverviewScreen(driver);
    iOSPayScreen payScreen = new iOSPayScreen(driver);
    TouchAction touchAction = new TouchAction(driver);


    public void Navigate_To_Payment_Screen() throws Throwable {
        //Login
        login.userLaunchTheMoneyAppNewIosApp();
        login.userEntersAUsernameAndPasswordForFirstLoginIosApp(FND_IOSDataFactory.username,FND_IOSDataFactory.password);
        login.userShouldBeOnTheWelcomePageIosApp();
        Thread.sleep(1000);
        overviewScreen.Transact_menu.click();
        log.info("Transact button clicked successfully");
        Thread.sleep(1000);
        overviewScreen.Transact_pay.click();
        log.info("Payment button clicked successfully");
    }

    public void Process_Payment_to_Beneficiary() throws InterruptedException {
        Thread.sleep(3000);
        payScreen.Transact_Pay_Next1_button.click();
        Thread.sleep(3000);
        payScreen.Payment_amount.sendKeys("155");
        Thread.sleep(1000);
        touchAction.tap(PointOption.point(41,311)).perform();
        basepage.scrollPage("down");
        basepage.scrollPage("down");
        Thread.sleep(1000);
        payScreen.Transact_Pay_Next_button.click();
        payScreen.Transact_Pay_button.click();
        if (payScreen.Pay_done_success.isDisplayed()) {
            log.info("Payment processed successfully");
        } else {
            log.info("Payment could not be processed");
        }
        basepage.scrollPage("down");
        payScreen.Transact_Pay_Finish_button.click();
        Thread.sleep(1000);
    }

    public void Select_future_date() throws InterruptedException {
        Thread.sleep(3000);
        payScreen.Transact_Pay_Next1_button.click();
        Thread.sleep(3000);
        payScreen.Payment_amount.sendKeys("1555");
        Thread.sleep(3000);
        ;
        basepage.scrollPage("down");
//Add code for iOS date picker
        Thread.sleep(3000);
        payScreen.Transact_Pay_Next_button.click();
        payScreen.Transact_Pay_button.click();
        if (payScreen.Pay_done_success.isDisplayed()) {
            log.info("Payment processed successfully");
        } else {
            log.info("Payment could not be processed");
        }
        basepage.scrollPage("down");
        payScreen.Transact_Pay_Finish_button.click();
        Thread.sleep(2000);

    }

    public void Select_Beneficiary(String recipientsname) throws Throwable {
        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        payScreen.Beneficiary_search_input.sendKeys(recipientsname);
        Thread.sleep(2000);
        String text = payScreen.Beneficiary_select.getText();
        if (text.equalsIgnoreCase(recipientsname)) {
            payScreen.Beneficiary_select.click();
            Thread.sleep(2000);
            driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
            try {
                basepage.scrollPage("down");
            } catch (Exception e) {
                log.info("Failed to select beneficiary", e);
            }
        }
    }
}
