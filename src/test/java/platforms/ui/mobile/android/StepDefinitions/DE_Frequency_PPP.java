package platforms.ui.mobile.android.StepDefinitions;

import cucumber.api.java.en.And;
import io.appium.java_client.MobileElement;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import platforms.ui.mobile.android.AndroidCommonMethods;
import platforms.ui.mobile.android.AndroidPageObjects.AndroidEnrolmentScreens;
import platforms.ui.mobile.android.DE_AndroidDataFactory;
import utils.CommonFunctions;
import utils.DriverFactory;

import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

public class DE_Frequency_PPP extends DriverFactory {

    private AndroidCommonMethods basepage = new AndroidCommonMethods();
    WebDriverWait wait = new WebDriverWait(getAndroidDriver(), 60);
    private CommonFunctions common = new CommonFunctions();
    private AndroidCommonMethods basepages = new AndroidCommonMethods();
    public DE_AndroidDataFactory dataFactory = new DE_AndroidDataFactory();
    private static Logger log = Logger.getLogger(DE_Frequency_PPP.class);

    @And("^User clicks I dont have card$")
    public void userClicksIDontHaveCard() {

        driver.findElement(By.id(AndroidEnrolmentScreens.DONTHAVECARD_BTN)).click();

    }

    @And("^User enters a profile number \"([^\"]*)\", pin \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void userEntersAProfileNumberPinAndPassword(String PROFILENUMBER, String PIN, String PASSWORD) throws Throwable {

        try {
            Thread.sleep(10);

            driver.findElement(By.id(AndroidEnrolmentScreens.P_NUMBER)).sendKeys(PROFILENUMBER);
            driver.hideKeyboard();
            Thread.sleep(1000);
            driver.findElement(By.id(AndroidEnrolmentScreens.P_PIN)).sendKeys(PIN);
            driver.hideKeyboard();
            Thread.sleep(1000);
            driver.findElement(By.id(AndroidEnrolmentScreens.P_PASSWORD)).sendKeys(PASSWORD);
            driver.hideKeyboard();

            try {
                basepage.android_scroll_down(1);
            } catch (Exception e) {
                e.printStackTrace();
            }


            //common.secondsDelay(35);
            wait.until(presenceOfElementLocated(By.xpath(AndroidEnrolmentScreens.BTN_NEXT)));
            MobileElement NextButton = driver.findElement(By.xpath(AndroidEnrolmentScreens.BTN_NEXT));

            common.secondsDelay(10);
            if (NextButton.isDisplayed()) {
                NextButton.click();
            }
           // driver.findElement(By.id(AndroidEnrolmentScreens.ENROLMENT_CANCEL_CREATE_PIN)).click();
        } catch (Exception e) {
            log.info("Failed to enter profile number, pin and testing:" + e.getMessage());
        }
    }
}
