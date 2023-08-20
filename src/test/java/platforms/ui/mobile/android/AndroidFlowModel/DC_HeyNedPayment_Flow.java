package platforms.ui.mobile.android.AndroidFlowModel;

import org.apache.log4j.Logger;
import platforms.ui.mobile.android.AndroidCommonMethods;
import platforms.ui.mobile.android.PageFactoryObject;
import utils.CommonFunctions;
import utils.DriverFactory;

public class DC_HeyNedPayment_Flow extends DriverFactory {

    private CommonFunctions common = new CommonFunctions();
    private AndroidCommonMethods basePage = new AndroidCommonMethods();
    private static Logger log = Logger.getLogger(DC_HeyNedPayment_Flow.class);
    PageFactoryObject pageFactoryObject = new PageFactoryObject(driver);

    public void PROCESS_A_DEFAULT_CARD_PAYMENT() {
        try {
            pageFactoryObject.getTaskScreenLocators().TASK_LIST_ITEM.click();
            log.info("Searched task clicked successfully");

            pageFactoryObject.getHeyNedPayScreen().PAYMENTS_PAY_NOW.click();
            log.info("Pay now button clicked successfully");

            if(pageFactoryObject.getHeyNedPayScreen().PAYMENTS_PAY_HEYNED_TITLE.isDisplayed()) {
                log.info("Pay HeyNed Lifestyle displayed successfully");
            }

            pageFactoryObject.getBaseScreenLocators().BTN_NEXT_ACTION.click();
            log.info("Pay now button clicked successfully");
            common.secondsDelay(5);
        } catch (Exception e) {
            log.info(e.getMessage());
            throw new AssertionError("Failed to complete Default Card Payment: ", e);
        }
    }

    public void PROCESS_A_NEDBANK_CARD_PAYMENT(String cvv) throws Exception {
        try {
            pageFactoryObject.getTaskScreenLocators().TASK_LIST_ITEM.click();
            log.info("Searched task clicked successfully");

            pageFactoryObject.getHeyNedPayScreen().PAYMENTS_PAY_NOW.click();
            log.info("Pay now button clicked successfully");

            pageFactoryObject.getHeyNedPayScreen().PAYMENTS_PAY_DEFAULT_CARD.click();
            log.info("Default card clicked successfully");

            if(pageFactoryObject.getHeyNedPayScreen().PAYMENTS_PAYMENT_METHOD_TITLE.isDisplayed()) {
                log.info("Payment method displayed successfully");
            }

            pageFactoryObject.getHeyNedPayScreen().PAYMENTS_ADD_ANOTHER_CARD.click();
            log.info("Add another card clicked successfully");

            if(pageFactoryObject.getLoadCardScreenLocators().CHAT_ADD_CARD_TITLE.isDisplayed()) {
                log.info("Add card screen displayed successfully");
            }

            pageFactoryObject.getHeyNedPayScreen().PAYMENTS_NEDBANK_CARD.click();
            log.info("Select Nedbank card clicked successfully");

            pageFactoryObject.getHeyNedPayScreen().PAYMENTS_VISA_CARD.click();
            log.info("Visa Classic Card clicked successfully");

            pageFactoryObject.getHeyNedPayScreen().PAYMENTS_CVV.sendKeys(cvv);
            log.info("CVV captured successfully");

            pageFactoryObject.getBaseScreenLocators().BTN_NEXT_ACTION.click();
            log.info("Next button clicked successfully");
            common.secondsDelay(5);

            pageFactoryObject.getBaseScreenLocators().BTN_NEXT_ACTION.click();
            log.info("Pay now button clicked successfully");
            common.secondsDelay(5);
        } catch (Exception e) {
            log.info(e.getMessage());
            throw new AssertionError("Failed to complete Nedbank Card Payment: ", e);
        }
    }

    public void PROCESS_A_LOAD_CARD_PAYMENT(String cardName, String cardNumber, String cardMMYY, String cardCVV) throws Exception {
        try {
            pageFactoryObject.getTaskScreenLocators().TASK_LIST_ITEM.click();
            log.info("Searched task clicked successfully");

            pageFactoryObject.getHeyNedPayScreen().PAYMENTS_PAY_NOW.click();
            log.info("Pay now button clicked successfully");

            pageFactoryObject.getHeyNedPayScreen().PAYMENTS_PAY_DEFAULT_CARD.click();
            log.info("Default card clicked successfully");

            if(pageFactoryObject.getHeyNedPayScreen().PAYMENTS_PAYMENT_METHOD_TITLE.isDisplayed()) {
                log.info("Payment method displayed successfully");
            }

            pageFactoryObject.getHeyNedPayScreen().PAYMENTS_ADD_ANOTHER_CARD.click();
            log.info("Add another card clicked successfully");

            if(pageFactoryObject.getLoadCardScreenLocators().CHAT_ADD_CARD_TITLE.isDisplayed()) {
                log.info("Add card screen displayed successfully");
            }

            pageFactoryObject.getHeyNedPayScreen().PAYMENTS_ENTER_CARD_DETAILS.click();
            log.info("Enter card details clicked successfully");

            pageFactoryObject.getLoadCardScreenLocators().LOAD_CARD_NAME.click();
            pageFactoryObject.getLoadCardScreenLocators().LOAD_CARD_NAME.sendKeys(cardName);

            try {
                basePage.hideKeyBoard();
            }
            catch(Exception e) {
                e.getMessage();
            }
            log.info("Name captured successfully");

            pageFactoryObject.getLoadCardScreenLocators().LOAD_CARD_NUMBER.click();
            pageFactoryObject.getLoadCardScreenLocators().LOAD_CARD_NUMBER.sendKeys(cardNumber);

            try {
                basePage.hideKeyBoard();
            }
            catch(Exception e) {
                e.getMessage();
            }
            log.info("Card Number captured successfully");

            pageFactoryObject.getLoadCardScreenLocators().LOAD_CARD_MMYY.click();
            pageFactoryObject.getLoadCardScreenLocators().LOAD_CARD_MMYY.sendKeys(cardMMYY);

            try {
                basePage.hideKeyBoard();
            }
            catch(Exception e) {
                e.getMessage();
            }
            log.info("Card MMYY captured successfully");

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
            log.info("Add card payment method button clicked successfully");

            if(pageFactoryObject.getLoadCardScreenLocators().CHAT_PAY_HEYNED_LIFESTYLE_TITLE.isDisplayed()) {
                log.info("Pay HeyNed Lifestyle displayed successfully");
            }

            pageFactoryObject.getBaseScreenLocators().BTN_NEXT_ACTION.click();
            log.info("Pay now button clicked successfully");
            common.secondsDelay(5);
        } catch (Exception e) {
            log.info(e.getMessage());
            throw new AssertionError("Failed to complete Load Card Payment: ", e);
        }
    }

    public void ADD_ADDITIONAL_CARD_THROUGH_HEYNED_SETTINGS(String cardName, String cardNumber, String cardMMYY, String cardCVV) throws Exception {
        pageFactoryObject.getHeyNedSettingsScreen().SETTINGS_PAYMENT_METHODS_OPTION.click();
        log.info("Payment methods clicked successfully");

        pageFactoryObject.getHeyNedPayScreen().PAYMENTS_ADD_ANOTHER_CARD.click();
        log.info("Add another card clicked successfully");

        pageFactoryObject.getHeyNedPayScreen().PAYMENTS_ENTER_CARD_DETAILS.click();
        log.info("Enter card details clicked successfully");

        pageFactoryObject.getLoadCardScreenLocators().LOAD_CARD_NAME.click();
        pageFactoryObject.getLoadCardScreenLocators().LOAD_CARD_NAME.sendKeys(cardName);

        try {
            basePage.hideKeyBoard();
        }
        catch(Exception e) {
            e.getMessage();
        }
        log.info("Name captured successfully");

        pageFactoryObject.getLoadCardScreenLocators().LOAD_CARD_NUMBER.click();
        pageFactoryObject.getLoadCardScreenLocators().LOAD_CARD_NUMBER.sendKeys(cardNumber);

        try {
            basePage.hideKeyBoard();
        }
        catch(Exception e) {
            e.getMessage();
        }
        log.info("Card Number captured successfully");

        pageFactoryObject.getLoadCardScreenLocators().LOAD_CARD_MMYY.click();
        pageFactoryObject.getLoadCardScreenLocators().LOAD_CARD_MMYY.sendKeys(cardMMYY);

        try {
            basePage.hideKeyBoard();
        }
        catch(Exception e) {
            e.getMessage();
        }
        log.info("Card MMYY captured successfully");

        pageFactoryObject.getLoadCardScreenLocators().LOAD_CARD_CVV.click();
        pageFactoryObject.getLoadCardScreenLocators().LOAD_CARD_CVV.sendKeys(cardCVV);

        try {
            basePage.hideKeyBoard();
        }
        catch(Exception e) {
            e.getMessage();
        }
        log.info("Card CVV captured successfully");
    }

    public void PROCESS_ADD_ADDITIONAL_CARD_HEYNED_SETTINGS() {
        pageFactoryObject.getBaseScreenLocators().BTN_NEXT_ACTION.click();
        log.info("Add card button clicked successfully");

        if(pageFactoryObject.getLoadCardScreenLocators().CHAT_LOAD_CARD_NAME.isDisplayed()) {
            log.info("Card added successfully");
        }
        common.secondsDelay(3);
    }

    public void SET_CARD_AS_DEFAULT() {
        pageFactoryObject.getHeyNedSettingsScreen().SETTINGS_SUBSCRIPTION_OPTION.click();
        log.info("Subscriptions clicked successfully");

        pageFactoryObject.getHeyNedSettingsScreen().CHANGE_SUBSCRIPTION_CARD.click();
        log.info("Change clicked successfully");

        pageFactoryObject.getHeyNedSettingsScreen().CHANGE_DEFAULT_CARD.click();
        log.info("Selected card clicked successfully");

        if(pageFactoryObject.getHeyNedSettingsScreen().DEFAULT_CARD_UPDATED.isDisplayed()) {
            log.info("Payment details updated message displayed successfully");
        }
        common.secondsDelay(5);
    }

    public void DELETE_CARD_HEYNED_SETTINGS() {
        pageFactoryObject.getHeyNedSettingsScreen().SETTINGS_PAYMENT_METHODS_OPTION.click();
        log.info("Payment methods clicked successfully");

        pageFactoryObject.getHeyNedSettingsScreen().PAYMENTS_LAST_CARD_OPTIONS.click();
        log.info("More icon clicked successfully");

        pageFactoryObject.getHeyNedSettingsScreen().PAYMENTS_DELETE_CARD.click();
        log.info("Delete clicked successfully");

        pageFactoryObject.getBaseScreenLocators().CONFIRM_BUTTON.click();
        log.info("Confirm clicked successfully");
        common.secondsDelay(5);
    }
}
