package platforms.ui.mobile.android.StepDefinitions;

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

import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

public class DE_PersonaSeven extends DriverFactory {

    WebDriverWait wait = new WebDriverWait(getAndroidDriver(), 60);
    private CommonFunctions common = new CommonFunctions();
    private AndroidCommonMethods basepage = new AndroidCommonMethods();
    public DE_AndroidDataFactory dataFactory = new DE_AndroidDataFactory();
    private static Logger log = Logger.getLogger(DE_Create_NedID.class);

    @When("^P seven user enters a username \"([^\"]*)\" and password \"([^\"]*)\" for first login$")
    public void pSevenUserEntersAUsernameAndPasswordForFirstLogin(String USERNAME , String PASSWORD ) throws Throwable  {

        try {
            Thread.sleep(100);
            wait.until(presenceOfElementLocated(By.xpath(AndroidEnrolmentScreens.NED_USERNAME)));
            driver.findElement(By.id(AndroidEnrolmentScreens.NED_USERNAME)).sendKeys(dataFactory.P7_USERNAME);
            basepage.hideKeyBoard();
            driver.findElement(By.xpath(AndroidEnrolmentScreens.NED_PASSWORD)).sendKeys(dataFactory.P7_PASSWORD);
            basepage.hideKeyBoard();


            driver.findElement(By.id(AndroidEnrolmentScreens.ACCEPTTerm)).click();
            driver.findElement(By.xpath(AndroidEnrolmentScreens.NEXT_LOGIN)).click();

            //wait.until(presenceOfElementLocated(By.xpath(AndroidEnrolmentScreens.BTN_NEXT)));

            MobileElement NextButton = driver.findElement(By.xpath(AndroidEnrolmentScreens.BTN_NEXT));
            common.secondsDelay(3);
            if (NextButton.isDisplayed()) {
                NextButton.click();
            }
            //driver.findElement(By.id(AndroidEnrolmentScreens.ENROLMENT_CANCEL_CREATE_PIN)).click();
        }catch (Exception e){
            log.info("Failed to enter username and password:" + e.getMessage());
        }

        common.secondsDelay(10);

    }
}
