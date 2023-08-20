package platforms.ui.mobile.ios.StepDefinitions;//package platforms.ui.mobile.ios.StepDefinitions;
//
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//import io.appium.java_client.MobileElement;
//import org.apache.log4j.Logger;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import platforms.ui.mobile.ios.IOSCommonMethods;
//import platforms.ui.mobile.ios.IOSDataFactory;
//import platforms.ui.mobile.ios.iOSPageObjects.iOSEnrolmentScreens;
//import utils.CommonFunctions;
//import utils.DriverFactory;
//import utils.Utils;
//
//
//import java.util.concurrent.TimeUnit;
//
//
//public class DE_CommonSteps extends DriverFactory {
//
//    public class iosLoginSteps extends DriverFactory {
//
//        WebDriverWait wait = new WebDriverWait(getIOSDriver(), 60);
//        private CommonFunctions common = new CommonFunctions();
//        private Utils utils = new Utils();
//        private Logger log = Logger.getLogger(DE_CommonSteps.class);
//        private IOSCommonMethods basepage = new IOSCommonMethods();
//
//
//        @Given("^user launches IOS money app$")
//        public void userLaunchesIOSMoneyApp() {
//            try {
//                driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
//                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(iOSEnrolmentScreens.CONTINUE_WITH_THIS_VERSION_XPATH)));
//
//                MobileElement ContinueButton = driver.findElement(By.xpath(iOSEnrolmentScreens.CONTINUE_WITH_THIS_VERSION_XPATH));
//                if (ContinueButton.isDisplayed()) {
//
//                    ContinueButton.click();
//                }
//
//                driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
//                MobileElement REGLandingButton = driver.findElement(By.xpath(iOSEnrolmentScreens.REGISTER_BTN));
//                REGLandingButton.click();
//
//                driver.findElementByAccessibilityId(iOSEnrolmentScreens.PERSONAL_PROFILE).click();
//
//                MobileElement TDontHaveCardButton = driver.findElement(By.id(iOSEnrolmentScreens.I_DONT_HAVE_A_CARD));
//                TDontHaveCardButton.click();
//
//                MobileElement NedbankIdButton = driver.findElement(By.id(iOSEnrolmentScreens.LOGIN_NEDBANK_ID_BUTTON));
//                NedbankIdButton.click();
//            } catch (Exception e) {
//                log.info("Failed to launch MoneyApp : " + e.getMessage());
//            }
//
//        }
//
//        @When("^user enters a username \"([^\"]*)\" and password \"([^\"]*)\"$")
//        public void userEntersAUsernameAndPassword(String arg0, String arg1) {
//            try {
//                driver.findElement(By.xpath(iOSEnrolmentScreens.PROFILE_USERNAME)).sendKeys(IOSDataFactory.PROFILE_USERNAME);
//
//                driver.hideKeyboard();
//                driver.findElement(By.xpath(iOSEnrolmentScreens.PROFILE_PASSWORD)).sendKeys(IOSDataFactory.PROFILE_PASSWORD);
//
//                driver.hideKeyboard();
//                common.secondsDelay(2);
//
//                MobileElement TermsAndConditions = driver.findElement(By.id(iOSEnrolmentScreens.NEW_ENROLEMENT_TERMS_AND_CONDITION_CHECKBOX));
//                TermsAndConditions.click();
//
//                MobileElement NextLoginButton = driver.findElement(By.name(iOSEnrolmentScreens.NEXT_LOGIN_BUTTON));
//                NextLoginButton.click();
//
//                driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
//
//                if (NextLoginButton.isDisplayed()) {
//                    NextLoginButton.click();
//                }
//
//                if (NextLoginButton.isDisplayed()) {
//                    common.secondsDelay(2);
//                    NextLoginButton.click();
//                }
//
//                common.secondsDelay(2);
//                driver.findElementByAccessibilityId(iOSEnrolmentScreens.NEW_ENROLEMENT_CANCEL).click();
//
//            } catch (Exception e) {
//                log.info("failed to enter userName and password: " + e.getMessage());
//            }
//        }
//
//        @Then("^user should be on ios welcome page$")
//        public void userShouldBeOnIosWelcomePage() {
//            try {
//                MobileElement welcomeScreen = driver.findElementByAccessibilityId(iOSEnrolmentScreens.WELCOME_SCREEN);
//                if (welcomeScreen.isDisplayed()) {
//                    System.out.println("user successfully navigated to Welcome screen");
//                }
//                MobileElement enrolementOk = driver.findElementByAccessibilityId(iOSEnrolmentScreens.NEW_ENROLEMENT_OK);
//                if (enrolementOk.isDisplayed()) {
//                    enrolementOk.click();
//                }
//            } catch (Exception e) {
//                log.info("Welcome screen is displayed successfully: " + e.getMessage());
//            }
//
//        }
//
//
//        @Given("^User_PPP_NID clicks on login button$")
//        public void user_ppp_nid_clicks_on_login_button() throws Throwable {
//            {
//                //Select next button
//                driver.findElementById(iOSEnrolmentScreens.iEnrolog_PPP_Login_next_id).click();
//            }
//
//        }
//
//
//        @Given("^User_PPP_NID access Ned app and landing pg displayed$")
//        public void user_PPP_NID() throws Throwable {
//
//            driver.findElementByAccessibilityId(iOSEnrolmentScreens.iEnrolog_continue_with_version_id).click();
//
//        }
//
//        @Then("^User_PPP_NID swipes through carosel$")
//        public void user_ppp_nid_swipes_through_carousel() throws Throwable {
//            {
//                //Select next button
//                //(258, 197, 24, 536, 2);
//            }
//
//        }
//
//        @Given("^User_PPP waits for login approval$")
//        public void User_PPP_waits_for_login_approval() throws Throwable {
//            {
//                driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
//                MobileElement heading = (MobileElement) driver.findElementById(iOSEnrolmentScreens.iEnrolog_ApproveIT_id);
//                if (heading.isDisplayed()) {
//                    System.out.println("Approve-IT screen displayed successfully");
//                }
//
//
//            }
//
//
//        }
//
//        @Given("^User_PPP validates the nedbank message screen$")
//        public void user_ppp_validates_the_nedbank_message_screen() throws Throwable {
//            {
//                //checking the success message
//                driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
//                MobileElement successmsg = (MobileElement) driver.findElementById(iOSEnrolmentScreens.iEnrolog_forgot_password_reset_msg_success_id);
//                if (successmsg.isDisplayed()) {
//                    System.out.println("Good news! You already have a Nedbank ID.");
//                } else {
//                    System.out.println("PPP is not linked to user id");
//                }
//            }
//
//        }
//
//        @Given("^User_PPP captures \"([^\"]*)\" and \"([^\"]*)\"$")
//        public void user_ppp_creates_new_pin(String nedbankid, String nedidpassword) throws Throwable {
//            {
//                //********************** get nedbank id *********************************
//                driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
//                String getnedbankid = driver.findElementByAccessibilityId(iOSEnrolmentScreens.iEnrolog_PPP_LoginNedID_username_xpath).getText();
//                if (getnedbankid.equalsIgnoreCase(nedbankid)) {
//                    System.out.println("Nedbank id matches");
//                    driver.findElementByAccessibilityId(iOSEnrolmentScreens.iEnrolog_PPP_LoginNedID_password_xpath).sendKeys(nedidpassword);
//                    driver.hideKeyboard();
//                    driver.findElementById(iOSEnrolmentScreens.iEnrolog_Next_id).click();
//                } else {
//                    System.out.println("Nedbank ID does not match");
//                    return;
//                }
//            }
//
//        }
//
//
//        @Then("^User_PPP validates the welcome screen$")
//        public void user_ppp_validates_the_welcome_screen() throws Throwable {
//            {
//                //hanlding close button
//                driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
//                MobileElement closeimage = (MobileElement) driver.findElementById(iOSEnrolmentScreens.iEnrolog_whiteCross_id);
//                if (closeimage.isDisplayed()) {
//                    System.out.println("image selected successfully");
//                    closeimage.click();
//                }
//
//                //handling welcome page
//                driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
//                WebElement welcome = driver.findElement(By.id(iOSEnrolmentScreens.iEnrolog_welcome));
//
//                if (welcome.isDisplayed()) {
//                    System.out.println("Welcome screen is displayed successfully ");
//                    //   String screenshot_path = driver.captureScreenshot(driver, "Welcome Screen");
//                    //   Reporter.addScreenCaptureFromPath(screenshot_path);
//                } else {
//                    System.out.println("Welcome screen  failed to display");
//                }
//            }
//
//        }
//
//        @Given("^User_PPP_NID clicks on create app pin$")
//        public void user_ppp_nid_clicks_on_create_app_pin() throws Throwable {
//            {
//                driver.findElementByAccessibilityId(iOSEnrolmentScreens.iCreateAPin).click();
//            }
//
//        }
//
//
//        @Then("^User_PPP captures the following PIN \"([^\"]*)\" and \"([^\"]*)\"$")
//        public void user_ppp_captures_PIN(String Cpin, String Cnewpin) throws Throwable {
//            {
//                //********************** get nedbank id *********************************
//                driver.manage().timeouts().implicitlyWait(60000, TimeUnit.MILLISECONDS);
//                driver.findElementByXPath(iOSEnrolmentScreens.Cpin).sendKeys(Cpin);
//                driver.hideKeyboard();
//                driver.manage().timeouts().implicitlyWait(60000, TimeUnit.MILLISECONDS);
//                driver.findElementByAccessibilityId(iOSEnrolmentScreens.CRePin).sendKeys(Cnewpin);
//                driver.hideKeyboard();
//                driver.manage().timeouts().implicitlyWait(60000, TimeUnit.MILLISECONDS);
//                driver.hideKeyboard();
//                driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
//                driver.findElementByAccessibilityId(iOSEnrolmentScreens.Set_PIN).click();
//
//
//                try {
//                    //driver.getKeyboard().sendKeys(Keys.RETURN);
//                    driver.hideKeyboard();
//                } catch (Exception e) {
//                }
//
//
//            }
//
//        }
//
//
//        @And("^User_PPP captures data for \"([^\"]*)\" and \"([^\"]*)\"$")
//        public void user_ppp_signs_into_portal(String nedbankid1, String nedidpassword1) throws Throwable {
//            {
//                //********************** get nedbank id *********************************
//                driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
//                String getnedbankid = driver.findElementByXPath(iOSEnrolmentScreens.iEnrolog_PPP_LoginNedID_username_xpath).getText();
//                if (getnedbankid.equalsIgnoreCase(nedbankid1)) {
//                    System.out.println("Nedbank id matches");
//                    driver.findElementByXPath(iOSEnrolmentScreens.iEnrolog_PPP_LoginNedID_password_xpath).sendKeys(nedidpassword1);
//                    driver.hideKeyboard();
//                    driver.findElementById(iOSEnrolmentScreens.iEnrolog_Next_id).click();
//                } else {
//                    System.out.println("Nedbank ID does not match");
//                    return;
//                }
//            }
//        }
//
//
//        @And("^User_PPP_NID clicks on Log In$")
//        public void user_ppp_nid_clicks_on_Log_In() throws Throwable {
//            {
//                driver.findElementByAccessibilityId(iOSEnrolmentScreens.iLogin).click();
//            }
//
//        }
//
//        @And("^User_PPP_NID clicks on I dont have a card$")
//        public void user_ppp_nid_clicks_IDHAC() throws Throwable {
//            {
//                driver.findElementByAccessibilityId(iOSEnrolmentScreens.IDHAC).click();
//            }
//        }
//
//        @Then("^User_PPP_Logoff$")
//        public void User_PPP_Logoff() {
//            {
//                driver.close();
//            }
//
//        }
//
//
//        @Given("^User_PPP Captures Pin \"([^\"]*)\" and Re-Enter Pin \"([^\"]*)\"$")
//        public void user_ppp_creates_new_pin_flow(String iPin, String iRePin) throws Throwable {
//            {
//
//                driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
//                String getnedbankid = driver.findElementByXPath(iOSEnrolmentScreens.iPin_ID).getText();
//                if (getnedbankid.equalsIgnoreCase(iPin)) {
//                    System.out.println("Nedbank id matches");
//                    driver.findElementByXPath(iOSEnrolmentScreens.iEnrolog_PPP_LoginNedID_password_xpath).sendKeys(iRePin);
//                    driver.hideKeyboard();
//                    driver.findElementById(iOSEnrolmentScreens.iEnrolog_Next_id).click();
//                } else {
//                    System.out.println("Nedbank ID does not match");
//                    return;
//                }
//            }
//        }
//
//
//        @And("^User_PPP_NID Captures ID \"([^\"]*)\"$")
//        public void user_ppp_nid_clicks_on_create_RSA_ID(String IDNumber) throws Throwable {
//            {
//                driver.findElementByAccessibilityId(iOSEnrolmentScreens.ienterID).sendKeys(IDNumber);
//            }
//
//        }
//
//        @And("^User_PPP_NID Captures Passport \"([^\"]*)\"$")
//        public void user_ppp_nid_clicks_on_create_passport(String IDNumber) throws Throwable {
//            {
//                driver.findElementByAccessibilityId(iOSEnrolmentScreens.ienterID).sendKeys(IDNumber);
//            }
//
//
//        }
//
//
//        @And("^User_PPP_NID captures RSA ID \"([^\"]*)\"$")
//        public void user_NID_Captures_ID(String RSA_ID) throws Throwable {
//            {
//                driver.manage().timeouts().implicitlyWait(61, TimeUnit.SECONDS);
//
//                driver.findElementByAccessibilityId(iOSEnrolmentScreens.RSA_ID).sendKeys(RSA_ID);
//                driver.hideKeyboard();
//                try {
//                    //driver.getKeyboard().sendKeys(Keys.RETURN);
//                    driver.hideKeyboard();
//                } catch (Exception e) {
//                }
//
//                //************************************ TC  **************************************************
//                driver.manage().timeouts().implicitlyWait(61, TimeUnit.SECONDS);
//                driver.findElementByAccessibilityId(iOSEnrolmentScreens.iNext).click();
//
//            }
//        }
//
//
//        @And("^User_PPP_NID clicks on IAccept$")
//        public void User_Clicks_IAccept() throws Throwable {
//            {
//                driver.findElementByAccessibilityId(iOSEnrolmentScreens.iEnrolog_Allow_Btn_id).click();
//            }
//        }
//
//        @And("^User_ID Clicks Next$")
//        public void User_ID_ClicksNext() throws Throwable {
//            {
//                driver.findElementByAccessibilityId(iOSEnrolmentScreens.iClickNext).click();
//            }
//
//
//        }
//
//        @And("^User_ID Clicks Dont Have ID$")
//        public void User_ID_Clicks_Dont_Have_ID() throws Throwable {
//            {
//                driver.findElementByAccessibilityId(iOSEnrolmentScreens.iDontHaveSAID).click();
//            }
//        }
//
//
//        @And("^User Foreign ID Captures \"([^\"]*)\"$")
//        public void User_ID_Clicks_PassportNo(String Passport) throws Throwable {
//            {
//                driver.findElementByAccessibilityId(iOSEnrolmentScreens.iPassportNo).sendKeys(Passport);
//            }
//        }
//
//
//        @And("^User_ID Clicks On CountrySelect$")
//        public void User_ID_Clicks_CountrySelect() throws Throwable {
//            {
//                driver.findElementByAccessibilityId(iOSEnrolmentScreens.SelectCountry).click();
//            }
//        }
//
//        @And("^User_ID Enters Country Text \"([^\"]*)\"$")
//        public void User_ID_Clicks_CountryType(String Country) throws Throwable {
//            {
//                driver.findElementByAccessibilityId(iOSEnrolmentScreens.SelectCountry).sendKeys(Country);
//            }
//        }
//
//        @And("^User_ID Selects United Kingdom$")
//        public void User_ID_Clicks_CountrySelectUK() throws Throwable {
//            {
//                driver.findElementByAccessibilityId(iOSEnrolmentScreens.SelectUK).click();
//            }
//        }
//
//        @Given("^User_Logs in as a new user$")
//        public void user_logs_in_as_new_user() throws Throwable {
//            // user_logs_In_as_new_user();
//        }
//
////    @Given("^User_Logs in as a non Federated user$")
////    public void user_logs_in_as_federated_user() throws Throwable {
////        user_logs_in_as_Federated_user();
////    }
//
//
//        @Then("^User captures \"([^\"]*)\" and \"([^\"]*)\"$")
//        public void user_captures_NedID(String NedID, String Password) throws Throwable {
//            {
//
//                driver.manage().timeouts().implicitlyWait(60000, TimeUnit.MILLISECONDS);
//                driver.findElementByAccessibilityId(iOSEnrolmentScreens.NedID1).sendKeys(NedID);
//                driver.hideKeyboard();
//                driver.manage().timeouts().implicitlyWait(60000, TimeUnit.MILLISECONDS);
//                driver.findElementByAccessibilityId(iOSEnrolmentScreens.Password1).sendKeys(Password);
//                driver.hideKeyboard();
//                driver.manage().timeouts().implicitlyWait(60000, TimeUnit.MILLISECONDS);
//                driver.hideKeyboard();
//                driver.findElementByAccessibilityId(iOSEnrolmentScreens.CheckBox).click();
//                driver.findElementByAccessibilityId(iOSEnrolmentScreens.Login1).click();
//
//                try {
//                    //driver.getKeyboard().sendKeys(Keys.RETURN);
//                    driver.hideKeyboard();
//                } catch (Exception e) {
//                }
//
//
//            }
//
//        }
//
//
//        @And("^User Continues with version$")
//        public void User_Continues_with_version1() throws Throwable {
//            {
//                driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
//                driver.findElementByAccessibilityId(iOSEnrolmentScreens.Continue).click();
//            }
//        }
//
//
//        @Then("^User Clicks Login$")
//        public void User_Clicks_Login() throws Throwable {
//
//            {
//                driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
//                driver.findElementByAccessibilityId(iOSEnrolmentScreens.newLogin).click();
//
//            }
//        }
//
//
//        @When("^User captures NedbankID \"([^\"]*)\" and password \"([^\"]*)\"$")
//        public void user_captures_NedbankID_and_password(String NedID, String Password) throws Throwable {
//
//            {
//                driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
//                //idriver.findElementById(EnrolmentLoginPages.iEnrolog_nedbank_id).click();
//
//                //capture Ned ID
//                driver.findElementByAccessibilityId(iOSEnrolmentScreens.iEnrolog_LoginNedID_text_xpath).sendKeys(NedID);
//                // driver.hideKeyboard();
//                //Capture the password
//                driver.findElementByAccessibilityId(iOSEnrolmentScreens.iEnrolog_LoginNedPassword_text_xpath).sendKeys(Password);
//                driver.hideKeyboard();
//                driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
//                //************************************ TC  **************************************************
//                driver.findElementByAccessibilityId(iOSEnrolmentScreens.iEnrolog_checkbox_id).click();
//                driver.findElementByAccessibilityId(iOSEnrolmentScreens.Login1).click();
//            }
//
//
//        }
//
//
//        @Then("^User Clicks Register$")
//        public void User_Clicks_Register() throws Throwable {
//
//            {
//                driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
//                driver.findElementByAccessibilityId(iOSEnrolmentScreens.iRegister).click();
//                IOSCommonMethods.captureScreenshot("Taking a screenshot");
//
//            }
//        }
//
//
//        @Then("^User Clicks On Personal Profile$")
//        public void User_Clicks_PersonalProfile() throws Throwable {
//
//            {
//                driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
//                driver.findElementByAccessibilityId(iOSEnrolmentScreens.PersonalProfile).click();
//
//            }
//        }
//
//        @And("^User Selects Country Text Box$")
//        public void User_Selects_Country() throws Throwable {
//            {
//                driver.findElementByAccessibilityId(iOSEnrolmentScreens.iClickCountry).click();
//            }
//
//
//        }
//
//
//        @And("^User Captures Country Origin \"([^\"]*)\"$")
//        public void User_Captures_Country_Origin(String Country) throws Throwable {
//            {
//                driver.findElementByAccessibilityId(iOSEnrolmentScreens.iUK).sendKeys(Country);
//                driver.findElementByAccessibilityId(iOSEnrolmentScreens.iUKSelect).click();
//                driver.findElementByAccessibilityId(iOSEnrolmentScreens.iNext).click();
//            }
//        }
//
//
//        @Given("^User_PPP_NID captures the \"([^\"]*)\", \"([^\"]*)\",\"([^\"]*)\"$")
//        public void user_ppp_nid_captures_(String Bankingprofile, String pin, String password) throws Throwable {
//            {
//                driver.findElementByAccessibilityId(iOSEnrolmentScreens.iProfileNumber).sendKeys(Bankingprofile);
//                driver.hideKeyboard();
//                driver.findElementByAccessibilityId(iOSEnrolmentScreens.iPin).sendKeys(pin);
//                driver.hideKeyboard();
//                driver.findElementByAccessibilityId(iOSEnrolmentScreens.iPassword).sendKeys(password);
//
//
//                try {
//                    //driver.getKeyboard().sendKeys(Keys.RETURN);
//                    driver.hideKeyboard();
//                } catch (Exception e) {
//                }
//
//                //************************************ TC  **************************************************
//                driver.manage().timeouts().implicitlyWait(61, TimeUnit.SECONDS);
//                driver.findElementByAccessibilityId(iOSEnrolmentScreens.iPPPNext).click();
//            }
//        }
//
//
//        @And("^User Selects Next$")
//        public void User_Selects_Next() throws Throwable {
//            {
//                driver.findElementByAccessibilityId(iOSEnrolmentScreens.iPPPNext).click();
//            }
//
//        }
//
//
//        @Then("^User Clicks ForgotDetails$")
//        public void User_Clicks_ForgotDetails() throws Throwable {
//
//            {
//                driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
//                driver.findElementByAccessibilityId(iOSEnrolmentScreens.iForgot).click();
//
//            }
//        }
//
//
//        @And("^User Clicks ForgotPassword$")
//        public void User_Clicks_ForgotPassword() throws Throwable {
//
//            {
//                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//                driver.findElementByAccessibilityId(iOSEnrolmentScreens.iForgotPassword).click();
//
//            }
//        }
//
//
//        @And("^User Inputs NedID1 \"([^\"]*)\"$")
//        public void User_EntersNedID12(String ID) throws Throwable {
//
//            {
//                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//                driver.findElementByAccessibilityId(iOSEnrolmentScreens.iForgotNedID).sendKeys(ID);
//
//            }
//        }
//
//
//        @And("^User Inputs ID Number \"([^\"]*)\"$")
//        public void User_EntersNedIDNo(String IDNo) throws Throwable {
//
//            {
//                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//                driver.findElementByAccessibilityId(iOSEnrolmentScreens.iIDNumber).sendKeys(IDNo);
//
//            }
//        }
//
//
//        @And("^User clicks Next confirming Username")
//        public void User_Clicks_next_username() throws Throwable {
//
//            {
//                Thread.sleep(5000);
//                driver.findElementByAccessibilityId(iOSEnrolmentScreens.iNewNext).click();
//
//            }
//        }
//
//        @And("^User clicks Next confirming ID Number")
//        public void User_Clicks_Confirm() throws Throwable {
//
//            {
//                driver.manage().timeouts().wait(20000);
//                driver.findElementByAccessibilityId(iOSEnrolmentScreens.iNewNext).click();
//
//            }
//        }
//
//        @And("^User clicks Next on NedID Primer Page")
//        public void User_Clicks_next_NID_Primer() throws Throwable {
//
//            {
//                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//                driver.findElementByAccessibilityId(iOSEnrolmentScreens.iPrimerNext).click();
//
//            }
//        }
//
//
//        @And("^User Inputs NewPassword \"([^\"]*)\"$")
//        public void User_EntersPassword(String password) throws Throwable {
//
//            {
//
//                driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
//                driver.findElementByXPath(iOSEnrolmentScreens.iChangePassword).sendKeys(password);
//
//            }
//        }
//
//
//        @And("^User clicks confirm new password")
//        public void User_Confirm_new_password() throws Throwable {
//
//            {
//                driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
//                driver.findElementByAccessibilityId(iOSEnrolmentScreens.iConfirmNewPassword).click();
//
//            }
//        }
//
//
//        @And("^User clicks Login Shortcut")
//        public void USer_Clicks_Login_1() throws Throwable {
//
//            {
//                driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
//                driver.findElementByAccessibilityId(iOSEnrolmentScreens.iGoToLogin).click();
//
//            }
//        }
//
//        @Then("^User Logs off")
//        public void USer_Clicks_Log_Off() throws Throwable {
//
//            {
//                driver.manage().timeouts().implicitlyWait(145, TimeUnit.SECONDS);
//                driver.findElementByAccessibilityId(iOSEnrolmentScreens.iCloseNotification).click();
//
//            }
//        }
//
//
//        @And("^User Clicks Continue with version$")
//        public void User_Continues_with_version2() throws Throwable {
//            {
//                driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
//                driver.findElementByAccessibilityId(iOSEnrolmentScreens.iCloseNewNotification).click();
//            }
//        }
//
//
//        @And("^User Inputs NedID \"([^\"]*)\"$")
//        public void User_NewNedID(String IDNo) throws Throwable {
//
//            {
//                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//                driver.findElementByAccessibilityId(iOSEnrolmentScreens.iUsername).sendKeys(IDNo);
//
//            }
//        }
//
//
//        @And("^User Inputs NewNedID \"([^\"]*)\"$")
//        public void User_Inputs_NewNedID(String password) throws Throwable {
//
//            {
//                driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
//                driver.findElementByXPath(iOSEnrolmentScreens.iNewUsername).sendKeys(password);
//
//            }
//        }
//
//
//        @And("^User Inputs NewPasswordNedID \"([^\"]*)\"$")
//        public void User_EntersPasswordID(String password) throws Throwable {
//
//            {
//                driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
//                driver.findElementByAccessibilityId(iOSEnrolmentScreens.iNewPassword).sendKeys(password);
//                driver.findElementByAccessibilityId(iOSEnrolmentScreens.iCheckBox).click();
//                driver.findElementByAccessibilityId(iOSEnrolmentScreens.iCreate).click();
//
//
//            }
//        }
//
//
//        public void User_Clicks_On_Get_Started_Button() throws Throwable {
//            //handling the "Get Started Button"
//
//
//            //Wait for potential Allow requests
//            try {
//                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//                MobileElement allowExists = (MobileElement) driver.findElementByAccessibilityId(iOSEnrolmentScreens.iEnrolog_Allow_Btn_id);
//                if (allowExists.isDisplayed()) {
//                    allowExists.click();
//                }
//            } catch (Exception e) {
//            }
//
//            //Wait for potential Allow requests
//            try {
//                driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//                MobileElement allowExists = (MobileElement) driver.findElementByAccessibilityId(iOSEnrolmentScreens.iEnrolog_Allow_Btn_id);
//                if (allowExists.isDisplayed()) {
//                    allowExists.click();
//                }
//            } catch (Exception e) {
//            }
//
//            //handling old version error
//            try {
//                driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
//                MobileElement ignore = (MobileElement) driver.findElementByAccessibilityId(iOSEnrolmentScreens.iEnrolog_ignore_id);
//                if (ignore.isDisplayed()) {
//                    ignore.click();
//                }
//            } catch (Exception e) {
//            }
//
//            //handling continue with old version
//            try {
//
//                driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
//                MobileElement continuewithversion = (MobileElement) driver.findElementByAccessibilityId(iOSEnrolmentScreens.iEnrolog_continue_with_version_id);
//                if (continuewithversion.isDisplayed()) {
//                    continuewithversion.click();
//                }
//            } catch (Exception e) {
//            }
//
//
//        }
//
//
//        @Given("^User_PPP_NID captures \"([^\"]*)\", \"([^\"]*)\",\"([^\"]*)\"$")
//        public void user_ppp_nid_captures(String Bankingprofile, String pin, String password) throws Throwable {
//
//            driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
//            //MobileElement profilemsg = (MobileElement) idriver.findElementById(EnrolmentLoginPages.iEnrolog_secondlogin_PPP_static_msg_id);
//
//            System.out.println("User capture PPP");
//            driver.findElementByAccessibilityId(iOSEnrolmentScreens.iProfileNumber).sendKeys(Bankingprofile);
//            //IOSBasePage.hidekeyboard_iphone();
//            driver.findElementByAccessibilityId(iOSEnrolmentScreens.iPin).sendKeys(pin);
//            //IOSBasePage.hidekeyboard_iphone();
//            driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
//            driver.findElementByAccessibilityId(iOSEnrolmentScreens.iPassword).sendKeys(password);
//            //IOSBasePage.hidekeyboard_iphone();
//            driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
//            driver.findElementByAccessibilityId(iOSEnrolmentScreens.iPassword).sendKeys(password);
//            // IOSBasePage.hidekeyboard_iphone();
//            driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
//            driver.findElementByAccessibilityId(iOSEnrolmentScreens.iPassword).sendKeys(password);
//            // IOSBasePage.hidekeyboard_iphone();
//            driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
//            driver.findElementByAccessibilityId(iOSEnrolmentScreens.PPPContinue).click();
//
//            //to hide the key board
//
//
//        }
//
//        @Given("^User_PPP_NID captures password\"([^\"]*)\"$")
//        public void user_ppp_password(String password) throws Throwable {
//            driver.findElementByAccessibilityId(iOSEnrolmentScreens.iPassword).sendKeys(password);
//            driver.findElementByAccessibilityId(iOSEnrolmentScreens.PPPContinue).click();
//
//        }
//
//
//        @Given("^user selects login sequence$")
//        public void userSelectsLogin() {
//            try {
//                driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
//                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(iOSEnrolmentScreens.CONTINUE_WITH_THIS_VERSION_XPATH)));
//
//                MobileElement ContinueButton = driver.findElement(By.xpath(iOSEnrolmentScreens.CONTINUE_WITH_THIS_VERSION_XPATH));
//                if (ContinueButton.isDisplayed()) {
//
//                    ContinueButton.click();
//                }
//
//
////            driver.findElementByAccessibilityId(iOSEnrolmentScreens.PERSONAL_PROFILE).click();
//
//
//            } catch (Exception e) {
//                log.info("Failed to launch MoneyApp : " + e.getMessage());
//            }
//
//        }
//
//        @And("^User Clicks Login Button$")
//        public void User_Login() throws Throwable {
//
//            {
//                driver.manage().timeouts().implicitlyWait(600, TimeUnit.SECONDS);
//                driver.findElementByAccessibilityId(iOSEnrolmentScreens.newLogin).click();
//                IOSCommonMethods.captureScreenshot("User Enters Password");
//
//
//            }
//        }
//
//        @And("^User Clicks ForgotUsername$")
//        public void User_Clicks_ForgotUsername() throws Throwable {
//
//            {
//                driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
//                driver.findElementByAccessibilityId(iOSEnrolmentScreens.iForgotUsername).click();
//
//            }
//        }
//
//
//        @And("^User Inputs SAID \"([^\"]*)\"$")
//        public void User_NewNedIDSAID(String IDNo) throws Throwable {
//
//            {
//                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//                driver.findElementByAccessibilityId(iOSEnrolmentScreens.inputSAID).sendKeys(IDNo);
//                driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
//                driver.findElementByAccessibilityId(iOSEnrolmentScreens.iForgotUsername1).click();
//                driver.findElementByAccessibilityId(iOSEnrolmentScreens.iForgotUsername1).click();
//                driver.findElementByAccessibilityId(iOSEnrolmentScreens.iForgotUsername1).click();
//                driver.findElementByAccessibilityId(iOSEnrolmentScreens.iForgotUsername1).click();
//                driver.findElementByAccessibilityId(iOSEnrolmentScreens.iPrimerNext).click();
//                driver.findElementByAccessibilityId(iOSEnrolmentScreens.iPassword).sendKeys(IOSCommonMethods.generatePassword(1));
//
//
//            }
//        }
//
//
//        @And("^User clicks Go to Login")
//        public void And_User_Clicks_Next_Forgoten_Username() throws Throwable {
//
//            {
//                driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
//                driver.findElementByAccessibilityId(iOSEnrolmentScreens.iGotoLogin).click();
//
//            }
//
//        }
//
//
//        @And("^User Clicks Register Button$")
//        public void User_Register_Button() throws Throwable {
//
//            {
//                driver.manage().timeouts().implicitlyWait(600, TimeUnit.SECONDS);
//                driver.findElementByAccessibilityId(iOSEnrolmentScreens.iRegister).click();
//                driver.findElementByAccessibilityId(iOSEnrolmentScreens.iPersonal).click();
//                IOSCommonMethods.captureScreenshot("User Enters Password");
//
//
//            }
//        }
//
//        @And("^User Creates NID Username \"([^\"]*)\"$")
//        public void User_Creates_NedID_Username(String Username) throws Throwable {
//
//            {
//                driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
//                driver.findElementByAccessibilityId(iOSEnrolmentScreens.iUsername).sendKeys(Username);
//                driver.findElementByAccessibilityId(iOSEnrolmentScreens.iPrimerNext).click();
//
//            }
//        }
//
//        @And("^User Creates NID Password \"([^\"]*)\"$")
//        public void User_Creates_NedID_Password(String Password) throws Throwable {
//
//            {
//                driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
//                driver.findElementByAccessibilityId(iOSEnrolmentScreens.iPasswordNID).sendKeys(Password);
//
//
//            }
//        }
//
//
//        @And("^User Accepts T&C's and Clicks Create$")
//        public void User_Accepts_TC() throws Throwable {
//
//            {
//                driver.manage().timeouts().implicitlyWait(600, TimeUnit.SECONDS);
//                driver.findElementByAccessibilityId(iOSEnrolmentScreens.iAcceptBox).click();
//                driver.findElementByAccessibilityId(iOSEnrolmentScreens.LOGIN_BUTTON).click();
//
//
//
//            }
//
//
//        }
//
//        @And("^User Clicks Done$")
//        public void User_Clicks_Done() throws Throwable {
//
//            {
//                driver.manage().timeouts().implicitlyWait(600, TimeUnit.SECONDS);
//                driver.findElementByAccessibilityId(iOSEnrolmentScreens.iDone).click();
//              //  IOSCommonMethods.captureScreenshot("User Enters Password");
//
//
//            }
//
//        }
//
//
//        @And("^User Inputs NedID Field Validation Case \"([^\"]*)\"$")
//        public void User_NewNedID_Field_Val(String password) throws Throwable {
//
//            {
//                driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
//                driver.findElementByXPath(iOSEnrolmentScreens.iChangePassword).sendKeys(password);
//                driver.findElementByXPath(iOSEnrolmentScreens.iChangePassword).clear();
//            }
//        }
//
//        @And("^User clicks Next Username")
//        public void User_Clicks_next() throws Throwable {
//
//            {
//                driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
//                driver.findElementByAccessibilityId(iOSEnrolmentScreens.iNext).click();
//
//            }
//        }
//
//        @And("^User Clicks Card Option")
//        public void user_Clicks_Card_and_Pin(String CardNo, String CardPin) throws Throwable {
//            driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
//            driver.findElementByAccessibilityId(iOSEnrolmentScreens.CardAndPin).click();
//        }
//
//
//
//        @And("^User Captures Card \"([^\"]*)\" and Pin \"([^\"]*)\"$")
//        public void user_Captures_Card_and_Pin(String CardNo, String CardPin) throws Throwable {
//            driver.findElementByAccessibilityId(iOSEnrolmentScreens.CardNumber).sendKeys(CardNo);
//            driver.findElementByAccessibilityId(iOSEnrolmentScreens.ATMPIN).sendKeys(CardPin);
//            driver.findElementByAccessibilityId(iOSEnrolmentScreens.iConfirmNext).click();
//
//
//        }
//    }
//}





