package platforms.ui.mobile.android.StepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import platforms.ui.mobile.android.AndroidCommonMethods;
import platforms.ui.mobile.android.AndroidPageObjects.AndroidEnrolmentScreens;
import platforms.ui.mobile.android.AndroidPageObjects.AndroidLoginScreen;
import platforms.ui.mobile.android.DE_AndroidDataFactory;
import utils.CommonFunctions;
import utils.DriverFactory;

import java.io.IOException;

import static java.lang.Thread.sleep;
import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

public class DE_Create_NedID extends DriverFactory {

    WebDriverWait wait = new WebDriverWait(getAndroidDriver(),60);
    private CommonFunctions common = new CommonFunctions();
    AndroidCommonMethods basepage = new AndroidCommonMethods();
    public DE_AndroidDataFactory dataFactory = new DE_AndroidDataFactory();
    private static Logger log = Logger.getLogger(DE_Create_NedID.class);

    @Given("^User is promted to create nedbank ID$")
    public void userIsPromtedToCreateNedbankID() {

    }

    @When("^User click create$")
    public void userClickCreate() {

        try{
           MobileElement create = driver.findElement(By.id(AndroidEnrolmentScreens.NID_CREATE_BTN));
           if(create.isDisplayed()){
               create.click();
               create.click();
           }
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    @And("^User enters a nedbank id username \"([^\"]*)\" and nedbank id password \"([^\"]*)\"$")
    public void userEntersANedbankIdUsernameAndNedbankIdPassword(String NEDUSERNAME, String NEDPASSWORD) throws Throwable {
        wait.until(presenceOfElementLocated(new MobileBy.ById(AndroidEnrolmentScreens.NID_USERNAME_TXT)));
            driver.findElement(By.id(AndroidEnrolmentScreens.NID_USERNAME_TXT)).sendKeys(NEDUSERNAME);
            //driver.hideKeyboard();
        wait.until(presenceOfElementLocated(new MobileBy.ById(AndroidEnrolmentScreens.NID_PASSWORD_TXT)));
            driver.findElement(By.id(AndroidEnrolmentScreens.NID_PASSWORD_TXT)).sendKeys(NEDPASSWORD);
       // driver.hideKeyboard();
        wait.until(presenceOfElementLocated(new MobileBy.ById(AndroidEnrolmentScreens.ClickTnC)));
        driver.findElement(By.id(AndroidEnrolmentScreens.ClickTnC)).click();
        wait.until(presenceOfElementLocated(new MobileBy.ById(AndroidEnrolmentScreens.NEXT_NID)));
            driver.findElement(By.id(AndroidEnrolmentScreens.NEXT_NID)).click();
            Thread.sleep(30000);
            AndroidCommonMethods.captureScreenshot("Successfully clicked sign in button");
            }



    @And("^User validates$")
    public void
    userValidates() {

        try{
            wait.until(presenceOfElementLocated(By.id(AndroidEnrolmentScreens.NID_DONE)));

            MobileElement NidDone = driver.findElement(By.id(AndroidEnrolmentScreens.NID_DONE));
            common.secondsDelay(1);
            if (NidDone.isDisplayed()) {
                NidDone.click();
            }
        }catch (Exception e){
            log.info("Failed to click done button:" + e.getMessage());

        }
    }


    @And("^User clicks Forgot your Nedbank ID password$")
    public void userClicksContinueWithThisVersion() {
        wait.until(presenceOfElementLocated(new MobileBy.ById(AndroidLoginScreen.ForgotPassword)));
        driver.findElementById(AndroidLoginScreen.ForgotPassword).click();


    }


    @And("^User enters Nedbank id username \"([^\"]*)\"$")
    public void userEntersNedID(String username) {
        wait.until(presenceOfElementLocated(new MobileBy.ById(AndroidLoginScreen.EnterUsername)));
        driver.findElementById(AndroidLoginScreen.EnterUsername).sendKeys(username);


    }
    @When("^User clicks next$")
    public void userClicksNext(){
        wait.until(presenceOfElementLocated(new MobileBy.ById(AndroidLoginScreen.Next_Button)));
        driver.findElementById(AndroidLoginScreen.Next_Button).click();
        try {
            sleep(50000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

    @Then ("^User creates a new password \"([^\"]*)\"$")
    public void userEntersNewPassword(String password) {
       // wait.until(presenceOfElementLocated(new MobileBy.ById(AndroidLoginScreen.NewPassword)));
        driver.findElementById(AndroidLoginScreen.NewPassword).sendKeys(password);
        driver.findElementById(AndroidLoginScreen.ConfirmButton).click();

    }


    @And("^User selects login shortcut$")
    public void userSelectsLoginShortcut() {
        wait.until(presenceOfElementLocated(new MobileBy.ById(AndroidLoginScreen.LoginShortcut)));
        driver.findElementById(AndroidLoginScreen.LoginShortcut).click();


    }


    @And("^User clicks the more button$")
    public void userSelectsMoreButton() {
        wait.until(presenceOfElementLocated(new MobileBy.ById(AndroidLoginScreen.morebutton)));
        driver.findElementById(AndroidLoginScreen.morebutton).click();


    }

    @Then("^User selects Login and Security then selects Nedbank ID$")
    public void userSelectsNed() {
        wait.until(presenceOfElementLocated(new MobileBy.ById(AndroidLoginScreen.loginandsecurity)));
        driver.findElementById(AndroidLoginScreen.loginandsecurity).click();
        driver.findElementById(AndroidLoginScreen.nedbankid).click();


    }

    @And("^User clicks change password \"([^\"]*)\"$")
    public void userChangesPassword(String password) {
        wait.until(presenceOfElementLocated(new MobileBy.ById(AndroidLoginScreen.changePassword)));
        driver.findElementById(AndroidLoginScreen.changePassword).click();
        wait.until(presenceOfElementLocated(new MobileBy.ById(AndroidLoginScreen.editPassword)));
        driver.findElementById(AndroidLoginScreen.editPassword).sendKeys(password);
        driver.findElementById(AndroidLoginScreen.confirmNewPassword).click();


    }

    @And("^User logs out$")
    public void userSelectsLogout() throws InterruptedException {
       // wait.until(presenceOfElementLocated(new MobileBy.ById(AndroidBaseScreen.backbutton)));
      //  driver.findElementByXPath(AndroidBaseScreen.backbutton).click();
        Thread.sleep(15000);
         wait.until(presenceOfElementLocated(new MobileBy.ById(AndroidLoginScreen.logout)));
        driver.findElementById(AndroidLoginScreen.logout).click();



    }

    @And("^User relogs with new pin\"([^\"]*)\"$")
    public void userrelogs(String Password) {
        driver.findElementById(AndroidLoginScreen.secondLoginPassword).sendKeys(Password);
        driver.findElementById(AndroidLoginScreen.confirmLogin).click();
        try {
            Thread.sleep(50000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

    @Then("^User successfully hits dashboard$")
    public void user() {

            wait.until(presenceOfElementLocated(new MobileBy.ById(AndroidLoginScreen.HomeMenuPanel)));
        try {
            AndroidCommonMethods.captureScreenshot("Successfully clicked sign in button");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    @And("^User clicks register,selects personal profile and enters SA ID Number \"([^\"]*)\"$")
    public void User_Clicks_Register(String RSAID) {
        wait.until(presenceOfElementLocated(new MobileBy.ById(AndroidLoginScreen.Register)));
        driver.findElementById(AndroidLoginScreen.Register).click();
        wait.until(presenceOfElementLocated(new MobileBy.ById(AndroidLoginScreen.PersonalProfile)));
        driver.findElementById(AndroidLoginScreen.PersonalProfile).click();
        wait.until(presenceOfElementLocated(new MobileBy.ById(AndroidLoginScreen.RSAID)));
        driver.findElementById(AndroidLoginScreen.RSAID).sendKeys(RSAID);
        wait.until(presenceOfElementLocated(new MobileBy.ById(AndroidLoginScreen.NextID)));
        driver.findElementById(AndroidLoginScreen.NextID).click();


    }

    @And("^User enters Nedbank ID Password Register flow \"([^\"]*)\"$")
    public void userEntersNedIDPasswordRegisterFlow(String username) throws IOException {
        wait.until(presenceOfElementLocated(new MobileBy.ById(AndroidLoginScreen.PasswordRegister)));
        driver.findElementById(AndroidLoginScreen.PasswordRegister).sendKeys(username);
        wait.until(presenceOfElementLocated(new MobileBy.ById(AndroidLoginScreen.AcceptTNC)));
        driver.findElementById(AndroidLoginScreen.AcceptTNC).click();
        wait.until(presenceOfElementLocated(new MobileBy.ById(AndroidLoginScreen.GoNext)));
        driver.findElementById(AndroidLoginScreen.GoNext).click();
        try {
            Thread.sleep(50000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        AndroidCommonMethods.captureScreenshot("Successfully clicked sign in button");


    }


    }


