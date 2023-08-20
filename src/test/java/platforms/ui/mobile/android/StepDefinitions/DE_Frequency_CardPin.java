package platforms.ui.mobile.android.StepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import io.appium.java_client.MobileElement;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import platforms.ui.mobile.android.AndroidCommonMethods;
import platforms.ui.mobile.android.AndroidPageObjects.AndroidEnrolmentScreens;
import platforms.ui.mobile.android.DE_AndroidDataFactory;
import utils.CommonFunctions;
import utils.DriverFactory;

import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;


public class DE_Frequency_CardPin extends DriverFactory {

    WebDriverWait wait = new WebDriverWait(getAndroidDriver(),60);
    private CommonFunctions common = new CommonFunctions();
    private AndroidCommonMethods basepage = new AndroidCommonMethods();
    public DE_AndroidDataFactory dataFactory = new DE_AndroidDataFactory();
    private static Logger log = Logger.getLogger(DE_Frequency_CardPin.class);

    @When("^User clicks register button$")
    public void user_clicks_register_button() throws Throwable {

        //basepage.LaunchApp();

        MobileElement register = driver.findElement(By.id(AndroidEnrolmentScreens.REGISTER_BUTTON));
        if (register.isDisplayed())
        {
            register.click();
        }
    }

    @And("^User clicks personal profile$")
    public void user_clicks_personal_profile() throws Throwable {

        MobileElement personalProfile = driver.findElement(By.id(AndroidEnrolmentScreens.PERSONAL_PROFILE));
        if (personalProfile.isDisplayed())
        {
            personalProfile.click();
        }
    }

    @And("^User clicks register with card$")
    public void user_clicks_register_with_card() throws Throwable {

        try {
            MobileElement registerWithCard = driver.findElement(By.id(AndroidEnrolmentScreens.REGISTER_WITH_CARD));
            if (registerWithCard.isDisplayed()) {
                registerWithCard.click();
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @And("^User enters a card \"([^\"]*)\" and pin \"([^\"]*)\"$")
    public void user_enters_a_card_and_pin(String cardnumber, String pin) throws Throwable {

        try {

            //wait.until(presenceOfElementLocated(By.xpath(AndroidEnrolmentScreens.CARDNUMBER_TXT)));
            driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
            driver.findElement(By.id(AndroidEnrolmentScreens.CARDNUMBER_TXT)).sendKeys(dataFactory.CARD_NUMBER);
            basepage.hideKeyBoard();
            driver.findElement(By.id(AndroidEnrolmentScreens.CARDPIN)).sendKeys(dataFactory.CARD_PIN);
            basepage.hideKeyBoard();
            try {
                basepage.android_scroll_down(1);
            } catch (Exception e) {
                e.printStackTrace();
            }
            basepage.hideKeyBoard();
            driver.findElement(By.id(AndroidEnrolmentScreens.ACCEPTTerm)).click();
            driver.findElement(By.xpath(AndroidEnrolmentScreens.NEXT_LOGIN)).click();

            //common.secondsDelay(35);

            wait.until(presenceOfElementLocated(By.xpath(AndroidEnrolmentScreens.BTN_NEXT)));

            MobileElement NextButton = driver.findElement(By.xpath(AndroidEnrolmentScreens.BTN_NEXT));
            common.secondsDelay(1);
            if (NextButton.isDisplayed()) {
                NextButton.click();
            }
            driver.findElement(By.id(AndroidEnrolmentScreens.ENROLMENT_CANCEL_CREATE_PIN)).click();
        }catch (Exception e){
            log.info("Failed to enter ppp:" + e.getMessage());
        }
    }

    @And("^User is navigated to OTP$")
    public void user_is_navigated_to_OTP() throws Throwable {

        try{

            driver.findElement(By.id(AndroidEnrolmentScreens.PIN_BTN)).click();
        }catch(Exception e){
            e.printStackTrace();
        }

    }

    @And("^User enters a pin \"([^\"]*)\" then reenters pin \"([^\"]*)\"$")
    public void userEntersAPinThenReentersPin(String newpin, String reenterpin) throws Throwable {

        try {

            driver.findElement(By.id(AndroidEnrolmentScreens.PIN_TXT)).sendKeys(dataFactory.NEWPIN);
            basepage.hideKeyBoard();
            driver.findElement(By.id(AndroidEnrolmentScreens.RE_ENTER_PIN_TXT)).sendKeys(dataFactory.REENTERPIN);
            basepage.hideKeyBoard();

            driver.findElement(By.id(AndroidEnrolmentScreens.SET_PIN_BTN)).click();
        }catch(Exception e){
            e.printStackTrace();
        }

    }

    @And("^User logouts$")
    public void userLogouts() throws Throwable {

        try {
            common.secondsDelay(5);
            wait.until(presenceOfElementLocated(By.id(AndroidEnrolmentScreens.MORE_ITEMS)));

            MobileElement more = driver.findElement(By.id(AndroidEnrolmentScreens.MORE_ITEMS));
            common.secondsDelay(3);
            if (more.isDisplayed()) {
                more.click();
                driver.findElement(By.id(AndroidEnrolmentScreens.MORE_ITEMS)).click();
            }
        }catch (Exception e){
            e.printStackTrace();
        }


        try {
            basepage.android_scroll_down(3);
        } catch (Exception e) {
            e.printStackTrace();
        }
        basepage.hideKeyBoard();


        //wait.until(presenceOfElementLocated(By.xpath(AndroidEnrolmentScreens.LOGOUT)));
        try{
            driver.findElement(By.id(AndroidEnrolmentScreens.LOGOUT)).click();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @And("^User login again with pin$")
    public void userLoginAgainWithPin() throws Throwable{

        Thread.sleep(2000);
        try{
            driver.findElement(By.id(AndroidEnrolmentScreens.SECOND_LOGIN_PIN)).sendKeys(dataFactory.NEWPIN);
        }catch(Exception e){
            e.printStackTrace();
        }

    }
}
