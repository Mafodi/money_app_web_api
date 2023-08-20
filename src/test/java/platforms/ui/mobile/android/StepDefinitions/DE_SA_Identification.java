package platforms.ui.mobile.android.StepDefinitions;

import cucumber.api.java.en.And;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import platforms.ui.mobile.android.AndroidCommonMethods;
import platforms.ui.mobile.android.AndroidPageObjects.AndroidEnrolmentScreens;
import platforms.ui.mobile.android.DE_AndroidDataFactory;
import utils.CommonFunctions;
import utils.DriverFactory;

import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

public class DE_SA_Identification extends DriverFactory {

    WebDriverWait wait = new WebDriverWait(getAndroidDriver(), 60);
    private CommonFunctions common = new CommonFunctions();
    private AndroidCommonMethods basepage = new AndroidCommonMethods();
    public DE_AndroidDataFactory dataFactory = new DE_AndroidDataFactory();
    private static Logger log = Logger.getLogger(DE_SA_Identification.class);

    @And("^User enter SA ID$")
    public void userEnterSAID() {

        try {
            driver.findElement(By.id(AndroidEnrolmentScreens.SAID_TXT)).sendKeys(dataFactory.SAID_NUMBER);
            //basepage.hideKeyBoard();

            driver.findElement(By.id(AndroidEnrolmentScreens.SAID_LBL)).click();

        } catch (Exception e) {
            log.info("Failed to enter id number:" + e.getMessage());
        }

        wait.until(presenceOfElementLocated(By.xpath(AndroidEnrolmentScreens.BTN_NEXT)));
            driver.findElement(By.xpath(AndroidEnrolmentScreens.BTN_NEXT)).click();
    }

}