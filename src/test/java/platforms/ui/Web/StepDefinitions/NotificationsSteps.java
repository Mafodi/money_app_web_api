package platforms.ui.Web.StepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import platforms.ui.Web.NotificationsObjects;
import utils.Utils;

import java.util.ArrayList;
import java.util.List;

public class NotificationsSteps extends Utils {
    private static Logger logger = Logger.getLogger(LoginSteps.class);
    WebDriverWait wait = new WebDriverWait(driver, 10);


    @When("^web user click notification icon$")
    public void web_user_click_notification_icon() {
        try {
            driver.findElement(By.className(NotificationsObjects.NOTIFICATIONS_ICON)).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^web user can see notification icon$")
    public void web_user_can_see_notification_icon() {
        try {
            int size = driver.findElements(By.className(NotificationsObjects.NOTIFICATIONS_ICON)).size();
            Assert.assertEquals(1, size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^web user can see notifications header$")
    public void web_user_can_see_notification() {
        try {
            int size = driver.findElements(By.cssSelector(NotificationsObjects.NOTIFICATIONS_HEADER)).size();
            Assert.assertEquals(1, size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^web user can see messages notification$")
    public void web_user_can_see_messages_notification() {
        try {
            int size = driver.findElements(By.cssSelector(NotificationsObjects.NOTIFICATIONS_MESSAGES)).size();
            Assert.assertEquals(1, size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^web user can see for you notifications$")
    public void user_can_see_for_your_notifications() {
        try {
            int size = driver.findElements(By.cssSelector(NotificationsObjects.NOTIFICATIONS_FOR_YOU)).size();
            Assert.assertEquals(1, size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @When("^web user click on messages notifications$")
    public void user_click_on_messages_notifications() {
        try {
            driver.findElement(By.cssSelector(NotificationsObjects.NOTIFICATIONS_MESSAGES)).click();

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^web user navigate to notifications message details$")
    public void user_open_notification_details_message() {
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated((By.className(NotificationsObjects.MESSAGE_DESCRIPTION))));
            List<WebElement> messageTitleList = driver.findElements(By.className(NotificationsObjects.MESSAGE_TITLE));
            List<WebElement> messageDescList = driver.findElements(By.className(NotificationsObjects.MESSAGE_DESCRIPTION));
            List<String> titleStringList = new ArrayList<>();

            for (WebElement messageTitle : messageTitleList) {
                String title = messageTitle.getText();
                titleStringList.add(title);
            }

            for (WebElement message : messageDescList) {
                secondsDelay(2);
                message.click();
                WebElement header = driver.findElement(By.cssSelector(NotificationsObjects.MESSAGE_DETAIL_HEADER));
                String headerString = header.getText();
                System.out.println(titleStringList);
                System.out.println(headerString);
                Assert.assertTrue(titleStringList.contains(headerString));
                secondsDelay(1);

                switch (headerString) {
                    case "Activate Cards":
                        driver.findElement(By.cssSelector(NotificationsObjects.CONTINUE_BUTTON)).click();
                        int size = driver.findElements(By.className(NotificationsObjects.NOTIFICATION_ERROR)).size();
                        if(size > 0) {
                            logger.error(header + " Notifications has an error could not be opened");
                            TakeScreenCapture(headerString);
                        }
                        break;

                    case "Greenbacks SignUp":
                        driver.findElement(By.cssSelector(NotificationsObjects.CONTINUE_BUTTON)).click();
                        int size0 = driver.findElements(By.id(NotificationsObjects.OVERLAY_CLOSE_BUTTON)).size();
                        String businessUnitHeader = driver.findElement(By.className(NotificationsObjects.LANDING_HEADER)).getText();
                        secondsDelay(1);
                        Assert.assertTrue(businessUnitHeader.contains("You qualify for the Nedbank Greenbacks programme."));
                        if (size0 == 1) {
                            driver.findElement(By.id(NotificationsObjects.OVERLAY_CLOSE_BUTTON)).click();
                        }
                        break;

                    case "Re-Invest or Payout":
                        driver.findElement(By.cssSelector(NotificationsObjects.RE_INVEST_BUTTON)).click();
                        int size1 = driver.findElements(By.className(NotificationsObjects.NOTIFICATION_ERROR)).size();
                        if(size1 > 0) {
                            logger.error(header + " Notifications has an error could not be opened");
                        }
                        break;

                    case "Tax Free":
                        driver.findElement(By.cssSelector(NotificationsObjects.TAX_FREE_DONE_BUTTON)).click();
                        int size2 = driver.findElements(By.className(NotificationsObjects.NOTIFICATION_ERROR)).size();
                        if(size2 > 0) {
                            logger.error(header + " Notifications has an error could not be opened");

                        }
                        break;

                    default:
                        logger.info("Invalid message title entered");
                }
            }

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^web user open notifications messages$")
    public void user_open_first_message() {
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated((By.className(NotificationsObjects.MESSAGE_DESCRIPTION))));
            List<WebElement> messageTitleList = driver.findElements(By.className(NotificationsObjects.MESSAGE_TITLE));
            List<WebElement> messageDescList = driver.findElements(By.className(NotificationsObjects.MESSAGE_DESCRIPTION));
            List<String> titleStringList = new ArrayList<>();

            for (WebElement messageTitle : messageTitleList) {
                String title = messageTitle.getText();
                titleStringList.add(title);
            }

            for (WebElement message : messageDescList) {
                message.click();
                WebElement header = driver.findElement(By.cssSelector(NotificationsObjects.MESSAGE_DETAIL_HEADER));
                String headerString = header.getText();
                System.out.println(titleStringList);
                System.out.println(headerString);
                Assert.assertTrue(titleStringList.contains(headerString));
           }

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @Then("^web user is on messages page$")
    public void user_is_on_messages_page() {
        try {
            int size = driver.findElements(By.cssSelector(NotificationsObjects.MESSAGES_PAGE)).size();
            Assert.assertEquals(1, size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^web user click on for you notifications$")
    public void user_click_on_your_offers_notifications() {
        try {
            driver.findElement(By.cssSelector(NotificationsObjects.NOTIFICATIONS_FOR_YOU)).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^web user open first for you notification$")
    public void user_open_first_offers_notification() {
        try {
            driver.findElement(By.cssSelector(NotificationsObjects.FIRST_FOR_YOU_MESSAGE)).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @When("^web user accept offer from notification$")
    public void user_accept_offer_from_notification() {
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id(NotificationsObjects.INTERESTED_BUTTON)));
            driver.findElement(By.id(NotificationsObjects.INTERESTED_BUTTON)).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^web user click back button from notification offer$")
    public void user_click_back_button_from_get_started() {
        try {
            driver.findElement(By.id(NotificationsObjects.BACK_BUTTON)).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^web user click notification offer no thanks button$")
    public void user_click_no_thanks_notification_offer_button() {
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id(NotificationsObjects.NO_THANKS_BUTTON)));
            driver.findElement(By.id(NotificationsObjects.NO_THANKS_BUTTON)).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^web user is on for you notifications page$")
    public void user_is_on_offers_notifications_page() {
        try {
            int size = driver.findElements(By.cssSelector(NotificationsObjects.FOR_YOU_MESSAGE_PAGE)).size();
            Assert.assertEquals(1, size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^web user is on \"([^\"]*)\" offer details page$")
    public void user_is_on_something_offer_details_page(String offer) {
        try {
            String offerPageHeader = driver.findElement(By.className(NotificationsObjects.OFFER_PAGE)).getText();
            Assert.assertEquals(offer, offerPageHeader);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^web user is on \"([^\"]*)\" offer get started page$")
    public void user_is_on_something_offer_start_page(String offer) {
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated((By.id(NotificationsObjects.BACK_BUTTON))));
            String offerPageHeader = driver.findElement(By.className(NotificationsObjects.OFFER_PAGE)).getText();
            Assert.assertEquals(offer, offerPageHeader);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @When("^web user click delete message icon$")
    public void user_click_delete_message_icon() {
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated((By.cssSelector(NotificationsObjects.DELETE_MESSAGE_ICON))));
            driver.findElement(By.cssSelector(NotificationsObjects.DELETE_MESSAGE_ICON)).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^web user click cancel button$")
    public void user_click_cancel_message_icon() {
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated((By.cssSelector(NotificationsObjects.CANCEL_BUTTON))));
            driver.findElement(By.cssSelector(NotificationsObjects.CANCEL_BUTTON)).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^web user click continue button$")
    public void user_click_continue_buttn() {
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated((By.cssSelector(NotificationsObjects.CONTINUE_BUTTON))));
            driver.findElement(By.cssSelector(NotificationsObjects.CONTINUE_BUTTON)).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^web user click close button$")
    public void user_click_close_button() {
        try {
            driver.findElement(By.cssSelector(NotificationsObjects.CLOSE_BUTTON)).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @When("^web user click checkbox for message to delete$")
    public void user_click_checkbox_for_message_to_delete() {
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated((By.cssSelector(NotificationsObjects.FIRST_MESSAGE_CHECKBOX))));
            driver.findElement(By.cssSelector(NotificationsObjects.FIRST_MESSAGE_CHECKBOX)).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^web user can see checkbox for message to delete$")
    public void user_can_see_checkbox_for_message_to_delete() {
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated((By.cssSelector(NotificationsObjects.FIRST_MESSAGE_CHECKBOX))));
            int size = driver.findElements(By.cssSelector(NotificationsObjects.FIRST_MESSAGE_CHECKBOX)).size();
            Assert.assertEquals(1, size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^message is deleted from the notification list$")
    public void message_is_deleted_from_the_notification_list() {
        int size = driver.findElements(By.cssSelector(NotificationsObjects.DELETE_SELECTED_BUTTON)).size();
        Assert.assertEquals(0, size);
    }

    @And("^web user click delete selected message$")
    public void user_click_delete_selected_message() {
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated((By.cssSelector(NotificationsObjects.DELETE_SELECTED_BUTTON))));
            driver.findElement(By.cssSelector(NotificationsObjects.DELETE_SELECTED_BUTTON)).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^web user can see no thanks button$")
    public void web_user_can_see_no_thanks_button() {
        int size = driver.findElements(By.cssSelector(NotificationsObjects.NO_THANKS_BUTTON)).size();
        Assert.assertEquals(1, size);
    }


    @Then("^web user cannot see notification error$")
    public void web_user_can_see_not_see_no_thanks_button() {
        int size = driver.findElements(By.className(NotificationsObjects.NOTIFICATION_ERROR)).size();
        Assert.assertEquals(0, size);
    }
}
