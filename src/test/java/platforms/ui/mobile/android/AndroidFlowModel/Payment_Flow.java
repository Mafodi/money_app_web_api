package platforms.ui.mobile.android.AndroidFlowModel;

import org.apache.log4j.Logger;
import platforms.ui.mobile.android.AndroidCommonMethods;
import platforms.ui.mobile.android.AndroidPageObjects.AndroidOverviewScreen;
import platforms.ui.mobile.android.AndroidPageObjects.AndroidPayScreen;
import platforms.ui.mobile.android.FND_AndroidDataFactory;
import platforms.ui.mobile.android.StepDefinitions.Login2;
import utils.DriverFactory;

import java.util.concurrent.TimeUnit;

public class Payment_Flow extends DriverFactory {
    private AndroidCommonMethods basepage = new AndroidCommonMethods();
    private static Logger log = Logger.getLogger(Payment_Flow.class);
    Login2 login=new Login2();
    AndroidOverviewScreen overviewScreen= new AndroidOverviewScreen(driver);
    AndroidPayScreen payScreen=new AndroidPayScreen(driver);

    public void Navigate_To_Payment_Screen() throws Throwable {
        //Login
        login.userLaunchTheMoneyAppNew();
        login.userEntersAUsernameAndPasswordForFirstLoginB(FND_AndroidDataFactory.username,FND_AndroidDataFactory.password);
        login.userShouldBeOnTheWelcomePageB();
        Thread.sleep(3000);
        overviewScreen.Transact_menu.click();
        log.info("Transact button clicked successfully");
        Thread.sleep(3000);
        overviewScreen.Transact_pay.click();
        log.info("Payment button clicked successfully");
    }

    public void Enter_Payment_Amount() throws InterruptedException {
        Thread.sleep(2000);
        payScreen.Transact_Pay_Next1_button.click();
        Thread.sleep(2000);
        payScreen.Payment_amount.sendKeys("1555");
        Thread.sleep(2000);
    }

    public void Enter_Recurring_Payment_Amount() throws InterruptedException {
        Thread.sleep(2000);
        payScreen.Transact_Pay_Next1_button.click();
        Thread.sleep(2000);
        payScreen.Payment_amount.sendKeys("155");
        Thread.sleep(2000);
    }
    public void Select_future_date() throws InterruptedException {
        Thread.sleep(2000);;
        basepage.android_scroll_down(3);
        Thread.sleep(2000);
        payScreen.Calander_icon.click();
        Thread.sleep(1000);
        payScreen.Calander_next.click();
        Thread.sleep(1000);
        payScreen.Calander_day.click();
        Thread.sleep(1000);
        payScreen.Calander_ok.click();
        Thread.sleep(2000);
        basepage.android_scroll_down(2);
        payScreen.Transact_Pay_Next1_button.click();
        Thread.sleep(2000);
        payScreen.Transact_Pay_button.click();
    }
    public void Select_recurring_future_date() throws InterruptedException {
        Thread.sleep(2000);;
        basepage.android_scroll_down(3);
        Thread.sleep(2000);
        payScreen.Calander_icon.click();
        Thread.sleep(1000);
        payScreen.Calander_next.click();
        Thread.sleep(1000);
        payScreen.Calander_day.click();
        Thread.sleep(1000);
        payScreen.Calander_ok.click();
        Thread.sleep(2000);
    }
    public void Select_Beneficiary(String recipientsname) throws Throwable {
        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        payScreen.Payment_recipients_search_input.sendKeys(recipientsname);
        Thread.sleep(2000);
        String text = payScreen.Payment_recipients_benificaryname.getText();
        if(text.equalsIgnoreCase(recipientsname)) {
            payScreen.Payment_recipients_benificaryname.click();
            Thread.sleep(2000);
            driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
            try {
                basepage.android_scroll_down(2);
            } catch (Exception e) {
                log.info("Failed to select beneficiary",e);
            }
        }
    }
}
