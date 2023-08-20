package platforms.ui.mobile.android.AndroidFlowModel;

import org.apache.log4j.Logger;
import platforms.ui.mobile.android.AndroidCommonMethods;
import platforms.ui.mobile.android.PageFactoryObject;
import platforms.ui.mobile.android.StepDefinitions.DC_Initialize;
import utils.CommonFunctions;
import utils.DriverFactory;

import java.util.concurrent.TimeUnit;

import static io.appium.java_client.remote.MobileCapabilityType.NO_RESET;

public class DC_HeyNedSubscription_Flow extends DriverFactory {

    private CommonFunctions common = new CommonFunctions();
    private AndroidCommonMethods basePage = new AndroidCommonMethods();
    private static Logger log = Logger.getLogger(DC_HeyNedSubscription_Flow.class);
    DC_Initialize login = new DC_Initialize();
    PageFactoryObject pageFactoryObject = new PageFactoryObject(driver);
    String object;

    public void LOGGED_INTO_NEDBANKMONEYAPP_WITH_USERNAME_AND_PASSWORD(String username, String password) throws Exception {
        try {
            login.asAClientIAmOnTheNedbankMoneyApp();
            login.iCaptureUsernameAndPassword(username, password);
            login.homeScreenPageShouldDisplay();
        } catch (Exception e) {
            log.info("User is not successfully logged into NedbankMoneyApp: " + e.getMessage());
        }
    }

    public void NAVIGATE_TO_HEYNED_LIFESTYLE_ASSISTANT() {
        try {
            common.secondsDelay(5);
            pageFactoryObject.getOverviewScreenLocators().CHAT_ICON.click();
            log.info("Chat icon clicked successfully");

            pageFactoryObject.getBaseScreenLocators().BTN_NEXT_ACTION.click();
            log.info("Next button clicked successfully");

            pageFactoryObject.getSubscribeScreenLocators().LIFESTYLE_OPTION.click();
            log.info("HeyNed Lifestyle clicked successfully");
        } catch (Exception e) {
            log.info("User is not successfully navigated to HeyNed Lifestyle Assistant: " + e.getMessage());
        }
    }

    public void NAVIGATE_TO_CREATE_HEYNED_PROFILE() {
        object = String.valueOf(driver.getCapabilities().getCapability(NO_RESET));

        try {
            if(object == "false") {
                pageFactoryObject.getSubscribeScreenLocators().EDUCATIONSCREEN_OPTION1.click();
                common.secondsDelay(1);
                pageFactoryObject.getSubscribeScreenLocators().EDUCATIONSCREEN_OPTION2.click();
                log.info("Education screens clicked successfully");

                pageFactoryObject.getBaseScreenLocators().BTN_NEXT_ACTION.click();
                log.info("Get started button clicked successfully");
            }
            else if(object == "true") {
                log.info("Education screens already shown");
            }
        }
        catch(Exception e) {
            log.info(e.getMessage());
            throw new AssertionError("Failed to navigate to Create HeyNed Profile: ", e);
        }
    }

    public void CAPTURE_PROFILE_DETAILS(String name, String surname, String cellphone, String email) throws Exception {
        try {
            common.secondsDelay(15);
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            pageFactoryObject.getBaseScreenLocators().BTN_NEXT_ACTION.click();
            log.info("Next button clicked successfully");

            pageFactoryObject.getSubscribeScreenLocators().PROFILE_NAME.clear();
            pageFactoryObject.getSubscribeScreenLocators().PROFILE_NAME.sendKeys(name);

            try {
                basePage.hideKeyBoard();
            }
            catch(Exception e) {
                e.getMessage();
            }
            log.info("Profile name captured successfully");

            pageFactoryObject.getSubscribeScreenLocators().PROFILE_SURNAME.clear();
            pageFactoryObject.getSubscribeScreenLocators().PROFILE_SURNAME.sendKeys(surname);

            try {
                basePage.hideKeyBoard();
            }
            catch(Exception e) {
                e.getMessage();
            }
            log.info("Profile surname captured successfully");

            pageFactoryObject.getSubscribeScreenLocators().PROFILE_CELLPHONE.clear();
            pageFactoryObject.getSubscribeScreenLocators().PROFILE_CELLPHONE.sendKeys(cellphone);

            try {
                basePage.hideKeyBoard();
            }
            catch(Exception e) {
                e.getMessage();
            }
            log.info("Profile cellphone number captured successfully");

            pageFactoryObject.getSubscribeScreenLocators().PROFILE_EMAIL.clear();
            pageFactoryObject.getSubscribeScreenLocators().PROFILE_EMAIL.sendKeys(email);

            try {
                basePage.hideKeyBoard();
            }
            catch(Exception e) {
                e.getMessage();
            }
            basePage.android_scroll_down(2);
            log.info("Profile email address captured successfully");
        } catch (Exception e) {
            log.info(e.getMessage());
            throw new AssertionError("Failed to capture HeyNed Profile Details: ", e);
        }
    }

    public void CAPTURE_NEDBANK_CARD_CVV(String cardCVV) throws Exception {
        try {
            pageFactoryObject.getBaseScreenLocators().BTN_NEXT_ACTION.click();
            log.info("Next button clicked successfully");

            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            pageFactoryObject.getSubscribeScreenLocators().AMEX_CARD.click();
            log.info("Amex card clicked successfully");

            pageFactoryObject.getLoadCardScreenLocators().CHAT_CVV.sendKeys(cardCVV);
            log.info("CVV number captured successfully");

            pageFactoryObject.getBaseScreenLocators().BTN_NEXT_ACTION.click();
            log.info("Next button clicked successfully");

            if(pageFactoryObject.getLoadCardScreenLocators().CHAT_SUBSCRIBE_CARD_TITLE.isDisplayed()) {
                log.info("Subscribe using this card displayed successfully");
            }
        } catch (Exception e) {
            log.info(e.getMessage());
            throw new AssertionError("Failed to capture Nedbank card CVV: ", e);
        }
    }

    public void SUBSCRIBE_TO_HEYNED() {
        try {
            pageFactoryObject.getBaseScreenLocators().BTN_NEXT_ACTION.click();
            log.info("Next button clicked successfully");

            common.secondsDelay(5);
            if(pageFactoryObject.getLoadCardScreenLocators().CHAT_SUBSCRIBE_ACTIVE.isDisplayed()) {
                log.info("HeyNed service is active screen displayed successfully");
            }

            pageFactoryObject.getBaseScreenLocators().BTN_NEXT_ACTION.click();
            log.info("Next button clicked successfully");

            common.secondsDelay(5);
        } catch (Exception e) {
            log.info(e.getMessage());
            throw new AssertionError("Failed to subscribe to HeyNed: ", e);
        }
    }

    public void CAPTURE_CARD_DETAILS(String cardName, String cardNumber, String cardMMYY, String cardCVV) throws Exception {
        try {
            pageFactoryObject.getBaseScreenLocators().BTN_NEXT_ACTION.click();
            log.info("Next button clicked successfully");

            common.secondsDelay(5);

            pageFactoryObject.getLoadCardScreenLocators().LOAD_CARD_NAME.click();
            pageFactoryObject.getLoadCardScreenLocators().LOAD_CARD_NAME.sendKeys(cardName);

            try {
                basePage.hideKeyBoard();
            }
            catch(Exception e) {
                e.getMessage();
            }
            log.info("Card name captured successfully");

            pageFactoryObject.getLoadCardScreenLocators().LOAD_CARD_NUMBER.click();
            pageFactoryObject.getLoadCardScreenLocators().LOAD_CARD_NUMBER.sendKeys(cardNumber);

            try {
                basePage.hideKeyBoard();
            }
            catch(Exception e) {
                e.getMessage();
            }
            log.info("Card number captured successfully");

            pageFactoryObject.getLoadCardScreenLocators().LOAD_CARD_MMYY.click();
            pageFactoryObject.getLoadCardScreenLocators().LOAD_CARD_MMYY.sendKeys(cardMMYY);

            try {
                basePage.hideKeyBoard();
            }
            catch(Exception e) {
                e.getMessage();
            }
            log.info("Card MM/YY captured successfully");

            pageFactoryObject.getLoadCardScreenLocators().LOAD_CARD_CVV.click();
            pageFactoryObject.getLoadCardScreenLocators().LOAD_CARD_CVV.sendKeys(cardCVV);

            try {
                basePage.hideKeyBoard();
            }
            catch(Exception e) {
                e.getMessage();
            }
            log.info("Card CVV captured successfully");

            pageFactoryObject.getBaseScreenLocators().BTN_NEXT_ACTION.click();
            log.info("Add card button clicked successfully");
        } catch (Exception e) {
            log.info(e.getMessage());
            throw new AssertionError("Failed to capture card details: ", e);
        }
        common.secondsDelay(5);
    }

    public void SELECT_HEYNED_TERMS_AND_CONDITIONS() {
        try {
            pageFactoryObject.getTaskManagementScreen().TERMS_CONDITIONS_SUBSCRIPTION.click();
            log.info("T&Cs clicked successfully");
            common.secondsDelay(15);
        } catch (Exception e) {
            log.info(e.getMessage());
            throw new AssertionError("Failed to click Terms and Conditions: ", e);
        }
    }
}
