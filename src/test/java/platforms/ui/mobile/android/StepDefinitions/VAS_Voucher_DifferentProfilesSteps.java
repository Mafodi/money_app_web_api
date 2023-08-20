package platforms.ui.mobile.android.StepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import platforms.ui.mobile.android.AndroidFlowModel.Voucher_Flow;
import platforms.ui.mobile.android.AndroidPageObjects.VAS_Prepaid_AndroidObjects;
import platforms.ui.mobile.android.AndroidPageObjects.VAS_Voucher_AndroidObjects;
import utils.CommonFunctions;
import utils.DriverFactory;

import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

public class VAS_Voucher_DifferentProfilesSteps extends DriverFactory {
    private static Logger log = Logger.getLogger(VAS_Voucher_DifferentProfilesSteps.class);
    WebDriverWait wait = new WebDriverWait(getAndroidDriver(),40);
    Voucher_Flow voucher_flow = new Voucher_Flow();
    CommonFunctions commonFunctions = new CommonFunctions();

    @And("^Android user want to check if Hollywood bets is visible$")
    public void androidUserWantToCheckIfHollywoodBetsIsVisible() {

       voucher_flow.CheckIf_HollywoodBets_Visible();
    }

    @And("^SBS user able to switch between profiles$")
    public void sbsUserAbleToSwitchBetweenProfiles() {
       voucher_flow.sbsUser_Switch_Profiles();
    }

    @And("^Lotto should not be visible for Android SBS profile$")
    public void lottoShouldNotBeVisibleForSBSProfile() {
        voucher_flow.lotto_NotVisible_SBSProfile();
    }

    @And("^Android SBS user want to switch between profiles$")
    public void androidSBSUserWantToSwitchBetweenProfiles() {
        voucher_flow.SwitchBetweenProfiles();
    }

    @When("^Android user selects profile$")
    public void androidUserSelectsProfile() throws InterruptedException {
        driver.findElementsById(VAS_Voucher_AndroidObjects.SecondProfile).get(1).click();
        commonFunctions.secondsDelay(4);
        wait.until(presenceOfElementLocated(By.id(VAS_Prepaid_AndroidObjects.ENROLMENT_WELCOME_SCREEN)));
        Thread.sleep(1000);
        MobileElement WelcomeScreen = driver.findElementById(VAS_Prepaid_AndroidObjects.ENROLMENT_WELCOME_SCREEN);
        if (WelcomeScreen.isDisplayed()) {
            log.info("Welcome screen is displayed successfully");
        }
        Thread.sleep(1000);
        try {
            if(driver.findElement(By.xpath("//android.widget.ImageView[@index='1']")).isDisplayed()) {
                driver.findElement(By.xpath("//android.widget.ImageView[@index='1']")).click();
                commonFunctions.secondsDelay(1);
            }
        }catch (Exception e){
            e.getMessage();
        }
    }

    @And("^Lotto should be visible for Android SBS profile$")
    public void lottoShouldBeVisibleForAndroidSBSProfile() {
        driver.findElement(By.xpath(VAS_Voucher_AndroidObjects.SelectLotto)).isDisplayed();
    }

    @And("^Android SBS profile user able to see Hollywoodbets$")
    public void androidSBSProfileUserAbleToSeeHollywoodbets() {
        driver.findElement(By.xpath("//android.widget.TextView[@text='Hollywoodbets']")).isDisplayed();
    }
}
