package platforms.ui.mobile.android.AndroidFlowModel;

import org.apache.log4j.Logger;
import platforms.ui.mobile.android.PageFactoryObject;
import utils.CommonFunctions;
import utils.DriverFactory;

import static io.appium.java_client.remote.MobileCapabilityType.NO_RESET;

public class DC_HeyNedTask_Flow extends DriverFactory {

    private CommonFunctions common = new CommonFunctions();
    private static Logger log = Logger.getLogger(DC_HeyNedTask_Flow.class);
    PageFactoryObject pageFactoryObject = new PageFactoryObject(driver);
    String object;

    public void CAPTURE_TASK_NAME(String taskName) throws Exception {
        object = String.valueOf(driver.getCapabilities().getCapability(NO_RESET));

        try {
            if(object == "false") {
                pageFactoryObject.getSubscribeScreenLocators().EDUCATIONSCREEN_OPTION1.click();
                common.secondsDelay(1);
                pageFactoryObject.getSubscribeScreenLocators().EDUCATIONSCREEN_OPTION2.click();
                log.info("Education screens clicked successfully");

                pageFactoryObject.getBaseScreenLocators().BTN_NEXT_ACTION.click();
                log.info("Get started button clicked successfully");
            }else if(object == "true") {
                log.info("Task List screen displayed successfully");
            }
        }
        catch(Exception e) {
            log.info(e.getMessage());
            throw new AssertionError("Task List not displayed: ", e);
        }

        try {
            pageFactoryObject.getTaskScreenLocators().TASK_CREATION.sendKeys(taskName);
            pageFactoryObject.getTaskScreenLocators().TASK_SEND.click();
            log.info("Task Name captured successfully");
        } catch (Exception e) {
            log.info(e.getMessage());
            throw new AssertionError("Task Name not captured: ", e);
        }
    }

    public void TASK_CREATED() {
        if(pageFactoryObject.getTaskScreenLocators().TASK_MESSAGE.isDisplayed()) {
            log.info("Task Name displayed successfully");
        }
        common.secondsDelay(5);
    }

    public void SEARCH_TASK_NAME(String taskName) throws Exception {
        object = String.valueOf(driver.getCapabilities().getCapability(NO_RESET));

        try {
            if(object == "false") {
                pageFactoryObject.getSubscribeScreenLocators().EDUCATIONSCREEN_OPTION1.click();
                common.secondsDelay(1);
                pageFactoryObject.getSubscribeScreenLocators().EDUCATIONSCREEN_OPTION2.click();
                log.info("Education screens clicked successfully");

                pageFactoryObject.getBaseScreenLocators().BTN_NEXT_ACTION.click();
                log.info("Get started button clicked successfully");
            }else if(object == "true") {
                log.info("Task List screen displayed successfully");
            }

            if(pageFactoryObject.getTaskScreenLocators().TASK_LIST_TITLE.isDisplayed()) {
                log.info("Task List displayed successfully");
            }

            pageFactoryObject.getTaskScreenLocators().TASK_SEARCH_ICON.click();
            log.info("Search icon clicked successfully");

            pageFactoryObject.getTaskScreenLocators().TASK_SEARCH_FIELD.sendKeys(taskName);
            log.info("Search task name captured successfully");
        } catch (Exception e) {
            log.info(e.getMessage());
            throw new AssertionError("Task Name not searched successfully: ", e);
        }
    }

    public void SEARCH_TASK(String taskName) throws Exception {
        if(pageFactoryObject.getTaskScreenLocators().TASK_LIST_TITLE.isDisplayed()) {
            log.info("Task List displayed successfully");
        }

        pageFactoryObject.getTaskScreenLocators().TASK_SEARCH_ICON.click();
        log.info("Search icon clicked successfully");

        pageFactoryObject.getTaskScreenLocators().TASK_SEARCH_FIELD.sendKeys(taskName);
        log.info("Search task name captured successfully");
    }

    public void SEARCHED_TASK_DISPLAYED() {
        if(pageFactoryObject.getTaskScreenLocators().TASK_LIST_ITEM.isDisplayed()) {
            log.info("Search task name captured successfully");
        }
        common.secondsDelay(5);
    }

    public void NAVIGATE_BACK_TO_TASK_LIST() {
        common.secondsDelay(5);
        pageFactoryObject.getBaseScreenLocators().BACK_ICON.click();
        log.info("Back icon clicked successfully");
    }

    public void CLOSE_A_TASK() {
        try {
            pageFactoryObject.getTaskScreenLocators().TASK_OPTION_ICON.click();
            log.info("Task menu clicked successfully");

            pageFactoryObject.getTaskScreenLocators().TASK_CANCEL_OPTION.click();
            log.info("Close option clicked successfully");
            common.secondsDelay(5);
        } catch (Exception e) {
            log.info(e.getMessage());
            throw new AssertionError("Task not closed: ", e);
        }
    }

    public void REOPEN_A_TASK() {
        try {
            pageFactoryObject.getTaskScreenLocators().TASK_OPTION_ICON.click();
            log.info("Task menu clicked successfully");

            pageFactoryObject.getTaskScreenLocators().TASK_REOPEN_OPTION.click();
            log.info("Reopen option clicked successfully");
            common.secondsDelay(5);
        } catch (Exception e) {
            log.info(e.getMessage());
            throw new AssertionError("Task not reopened: ", e);
        }
    }

    public void DELETE_A_TASK() {
        try {
            pageFactoryObject.getTaskScreenLocators().TASK_OPTION_ICON.click();
            log.info("Task menu clicked successfully");

            pageFactoryObject.getTaskScreenLocators().TASK_DELETE_OPTION.click();
            log.info("Delete option clicked successfully");

            pageFactoryObject.getBaseScreenLocators().CONFIRM_BUTTON.click();
            log.info("Confirm clicked successfully");
            common.secondsDelay(5);
        } catch (Exception e) {
            log.info(e.getMessage());
            throw new AssertionError("Task not deleted: ", e);
        }
    }

    public void CANCEL_DELETE_A_TASK() {
        try {
            pageFactoryObject.getTaskScreenLocators().TASK_OPTION_ICON.click();
            log.info("Task menu clicked successfully");

            pageFactoryObject.getTaskScreenLocators().TASK_DELETE_OPTION.click();
            log.info("Delete option clicked successfully");

            pageFactoryObject.getBaseScreenLocators().CANCEL_BUTTON.click();
            log.info("Cancel clicked successfully");
            common.secondsDelay(5);
        } catch (Exception e) {
            log.info(e.getMessage());
            throw new AssertionError("Task not cancelled: ", e);
        }
    }

    public void RATE_AN_AGENT() {
        try {
            common.secondsDelay(5);
            pageFactoryObject.getTaskScreenLocators().TASK_LIST_ITEM.click();
            log.info("Searched task clicked successfully");

            if(pageFactoryObject.getTaskManagementScreen().TASK_MANAGEMENT_RATING.isDisplayed()) {
                log.info("Rating displayed successfully");
            }
            else {
                log.info("Rating not displayed successfully");
            }
            common.secondsDelay(5);

            pageFactoryObject.getTaskManagementScreen().TASK_STAR_RATING.click();
            log.info("Rating clicked successfully");
            common.secondsDelay(5);

            pageFactoryObject.getTaskManagementScreen().TASK_RATING_SUBMIT.click();
            log.info("Rating submit clicked successfully");
            common.secondsDelay(5);
        } catch (Exception e) {
            log.info(e.getMessage());
            throw new AssertionError("Rating not successful: ", e);
        }
    }

    public void COMMENT_RATE_AN_AGENT(String comment) {
        try {
            common.secondsDelay(5);
            pageFactoryObject.getTaskScreenLocators().TASK_LIST_ITEM.click();
            log.info("Searched task clicked successfully");

            if(pageFactoryObject.getTaskManagementScreen().TASK_MANAGEMENT_RATING.isDisplayed()) {
                log.info("Rating displayed successfully");
            }
            else {
                log.info("Rating not displayed successfully");
            }
            common.secondsDelay(5);

            pageFactoryObject.getTaskManagementScreen().TASK_STAR_RATING.click();
            log.info("Rating clicked successfully");
            common.secondsDelay(5);

            pageFactoryObject.getTaskManagementScreen().TASK_COMMENT_RATING.sendKeys(comment);
            log.info("Comment captured successfully");
            common.secondsDelay(3);

            pageFactoryObject.getTaskManagementScreen().TASK_RATING_SUBMIT.click();
            log.info("Rating submit clicked successfully");
            common.secondsDelay(5);
        } catch (Exception e) {
            log.info(e.getMessage());
            throw new AssertionError("Rating not successful: ", e);
        }
    }

    public void DOWNLOAD_HEYNED_IMAGE() {
        pageFactoryObject.getTaskScreenLocators().TASK_LIST_ITEM.click();
        log.info("Searched task clicked successfully");

        pageFactoryObject.getTaskManagementScreen().TASK_MANAGEMENT_IMAGE.click();
        log.info("Download image clicked successfully");

        try {
            pageFactoryObject.getBaseScreenLocators().ALLOW_BUTTON.click();
            log.info("Allow button clicked successfully");
        }
        catch(Exception e) {
            e.getMessage();
        }

        if(pageFactoryObject.getTaskManagementScreen().TASK_MANAGEMENT_IMAGE_DISPLAY.isDisplayed()) {
            log.info("Image displayed successfully");
        }
        common.secondsDelay(5);
    }

    public void RECEIVE_HEYNED_SUPPLIER() {
        pageFactoryObject.getTaskScreenLocators().TASK_LIST_ITEM.click();
        log.info("Searched task clicked successfully");

        if(pageFactoryObject.getTaskManagementScreen().TASK_MANAGEMENT_SUPPLIER.isDisplayed()) {
            log.info("Supplier displayed successfully");
        }
        common.secondsDelay(5);
    }

    public void RECEIVE_HEYNED_DOCUMENT() {
        pageFactoryObject.getTaskScreenLocators().TASK_LIST_ITEM.click();
        log.info("Searched task clicked successfully");

        pageFactoryObject.getTaskManagementScreen().TASK_MANAGEMENT_DOWNLOAD_DOCUMENT.click();
        log.info("Document displayed successfully");

        try {
            pageFactoryObject.getBaseScreenLocators().ALLOW_BUTTON.click();
            log.info("Allow button clicked successfully");
        }
        catch(Exception e) {
            e.getMessage();
        }

        pageFactoryObject.getTaskManagementScreen().TASK_MANAGEMENT_DOCUMENT.click();
        log.info("Document downloaded successfully");
        common.secondsDelay(10);
    }

    public void RECEIVE_HEYNED_MAP_LOCATION() {
        pageFactoryObject.getTaskScreenLocators().TASK_LIST_ITEM.click();
        log.info("Searched task clicked successfully");

        if(pageFactoryObject.getTaskManagementScreen().TASK_MANAGEMENT_MAP.isDisplayed()) {
            log.info("Map displayed successfully");
            pageFactoryObject.getTaskManagementScreen().TASK_MANAGEMENT_MAP_LAYOUT.click();
        }
        common.secondsDelay(10);
    }

    public void SEARCH_WHEN_NO_TASKS_PRESENT() {
        pageFactoryObject.getTaskScreenLocators().TASK_NO_RESULTS_FOUND.isDisplayed();
        log.info("No results found displayed successfully");
    }
}
