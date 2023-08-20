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

public class DE_NONSA_Identification extends DriverFactory {

    WebDriverWait wait = new WebDriverWait(getAndroidDriver(), 60);
    private CommonFunctions common = new CommonFunctions();
    private AndroidCommonMethods basepage = new AndroidCommonMethods();
    public DE_AndroidDataFactory dataFactory = new DE_AndroidDataFactory();
    private static Logger log = Logger.getLogger(DE_SA_Identification.class);

    @And("^User specify non SA option$")
    public void userSpecifyNonSAOption() {

        MobileElement NONSA = driver.findElement(By.id(AndroidEnrolmentScreens.DONTHAVESAID_LINK));
        if (NONSA.isDisplayed()) {
            NONSA.click();
        }
    }
    @And("^User enter passport$")
    public void userEnterPassportAndSpecifyCountryOfIssue() {

        try {
            driver.findElement(By.id(AndroidEnrolmentScreens.PASSPORT_NUM_TXT)).sendKeys(dataFactory.PASSPORT_NUMBER);

        } catch (Exception e) {
            log.info("Failed to enter id number:" + e.getMessage());
        }

        common.secondsDelay(3);

        try{
            driver.findElement(By.id(AndroidEnrolmentScreens.COI)).click();
            driver.findElement(By.id(AndroidEnrolmentScreens.PASSPORT_SEARCH)).sendKeys(dataFactory.COINAME);
            basepage.hideKeyBoard();
            driver.findElement(By.id(AndroidEnrolmentScreens.COI_NAME)).click();
        }catch(Exception e){
            e.printStackTrace();
        }

        MobileElement PASS_NEXT = driver.findElement(By.id(AndroidEnrolmentScreens.PASSPORT_NEXT));
        if (PASS_NEXT.isDisplayed()) {
            PASS_NEXT.click();
        }


    }




}
