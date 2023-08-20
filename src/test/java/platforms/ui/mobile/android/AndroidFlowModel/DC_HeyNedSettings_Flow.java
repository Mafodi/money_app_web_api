package platforms.ui.mobile.android.AndroidFlowModel;

import org.apache.log4j.Logger;
import platforms.ui.mobile.android.AndroidCommonMethods;
import platforms.ui.mobile.android.PageFactoryObject;
import utils.CommonFunctions;
import utils.DriverFactory;

public class DC_HeyNedSettings_Flow extends DriverFactory {

    private CommonFunctions common = new CommonFunctions();
    private AndroidCommonMethods basePage = new AndroidCommonMethods();
    private static Logger log = Logger.getLogger(DC_HeyNedSettings_Flow.class);
    PageFactoryObject pageFactoryObject = new PageFactoryObject(driver);

    public void NAVIGATE_TO_HEYNED_SETTINGS() {
        pageFactoryObject.getHeyNedSettingsScreen().SETTINGS_MORE.click();
        log.info("More icon clicked successfully");

        pageFactoryObject.getHeyNedSettingsScreen().SETTINGS_OPTION.click();
        log.info("Settings clicked successfully");

        pageFactoryObject.getHeyNedSettingsScreen().SETTINGS_HEYNED_SETTINGS.click();
        log.info("HeyNed Settings clicked successfully");
    }

    public void UPDATE_PROFILE_EMAIL_ADDRESS(String email) throws Exception {
        pageFactoryObject.getHeyNedSettingsScreen().SETTINGS_PROFILE_OPTION.click();
        log.info("Profile clicked successfully");

        pageFactoryObject.getBaseScreenLocators().BTN_NEXT_ACTION.click();
        log.info("Edit button clicked successfully");

        pageFactoryObject.getHeyNedSettingsScreen().SETTINGS_EMAIL_ADDRESS.clear();
        pageFactoryObject.getHeyNedSettingsScreen().SETTINGS_EMAIL_ADDRESS.sendKeys(email);
        log.info("Profile clicked successfully");

        pageFactoryObject.getBaseScreenLocators().BTN_NEXT_ACTION.click();
        log.info("Save button clicked successfully");
        common.secondsDelay(3);
    }

    public void NAVIGATE_TO_REVIEW_OUR_TERMS_AND_CONDITIONS_SCREEN() throws Exception {
        pageFactoryObject.getHeyNedSettingsScreen().SETTINGS_MORE.click();
        log.info("More icon clicked successfully");

        pageFactoryObject.getTaskManagementScreen().TERMS_CONDITIONS.click();
        log.info("Terms and Conditions clicked successfully");
    }

    public void NAVIGATE_TO_HEYNED_TERMS_AND_CONDITIONS() throws Exception {
        basePage.android_scroll_down(5);
        pageFactoryObject.getTaskManagementScreen().TASK_MANAGEMENT_HEYNED.click();
        log.info("HeyNed clicked successfully");

        if(pageFactoryObject.getTaskManagementScreen().TERMS_CONDITIONS_HEYNED_TITLE.isDisplayed()) {
            basePage.android_scroll_down(5);
        }
        common.secondsDelay(5);
    }
}
