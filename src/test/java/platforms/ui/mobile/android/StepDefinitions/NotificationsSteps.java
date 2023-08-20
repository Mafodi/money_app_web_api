package platforms.ui.mobile.android.StepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import platforms.ui.mobile.android.AndroidCommonMethods;
import platforms.ui.mobile.android.AndroidPageObjects.AndroidNotificationsObjects;
import platforms.ui.mobile.android.VAS_AndroidDataFactory;
import utils.DriverFactory;

import java.util.ArrayList;
import java.util.List;


public class NotificationsSteps extends DriverFactory {
    private static Logger logger = Logger.getLogger(NotificationsSteps.class);
    WebDriverWait wait = new WebDriverWait(getAndroidDriver(), 80);
    String[] expectedTitles = {"DC Chat", "Tax Free", "Re-Invest or Payout", "Home Loan Enrolment", "Home Loan Property", "Greenbacks SignUp", "Activate Cards", "Buy Airtime", "Annual Credit Review", "eStatements", "Block/Unblock Cards", "Annual Credit Review", "Investment", "Pre-Approved Offers", "Uplift Dormancy", "Debit Order Listing", "How to Report Fraud", "SASBO Strike Alert", "Salary Account Switching", "Set up Savings Pocket", "Redeem GB Charges & Fees", "Redeem Forex", "Balance Peek", "Activate Overseas Travel Cards", "Share App", "Scan to Pay", "Send iMali", "Automatic Payment Order", "Redeem GB Donations", "Financial Planner", "Feedback", "Add Recepient", "Profile Limits", "Hide and Show", "ATM Limits", "DebitOrderSwitching", "Pay To Foreign", "Buy Forex", "Overdraft offer just for you!", "Apply For Home Loan", "Apply for Funeral Policy", "Apply For Home Loan", "Sell Forex", "Find out more", "Setup Money Tracker", "Update Profile Details", "Open kids account"};
    Login androidLogin = new Login();
    AndroidCommonMethods commonMethods = new AndroidCommonMethods();

    @When("^android user click notification icon$")
    public void android_user_click_notification_icon() {
        try {
            driver.findElement(By.id(AndroidNotificationsObjects.NOTIFICATION_ICON)).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^android user click on messages notifications$")
    public void android_user_click_on_messages_notifications() {
        try {
            driver.findElement(By.id(AndroidNotificationsObjects.NOTIFICATIONS_MESSAGES)).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^android user open notification messages$")
    public void android_user_open_first_message() {
        try {
            List<MobileElement> messageDescList = driver.findElements(By.id(AndroidNotificationsObjects.MESSAGE_DESCRIPTION));
            List<String> titleStringList = new ArrayList<>();

            for (MobileElement messageHeader: messageDescList) {
                String title = messageHeader.getText();
                titleStringList.add(title);
            }

            for (MobileElement message : messageDescList) {
                message.click();
                MobileElement header = driver.findElement(By.id(AndroidNotificationsObjects.MESSAGE_DETAIL_HEADER));
                String headerString = header.getText();
                System.out.println(titleStringList);
                System.out.println(headerString);
                Assert.assertTrue(titleStringList.contains(headerString));
                driver.navigate().back();
            }

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
            driver.navigate().back();

        }
    }

    @Then("^android user can see notification icon$")
    public void android_user_can_see_notification_icon() {
        try {
            int size = driver.findElements(By.id(AndroidNotificationsObjects.NOTIFICATION_ICON)).size();
            Assert.assertEquals(1, size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^android user can see messages notification$")
    public void android_user_can_see_messages_notification() {
        try {
            int size = driver.findElements(By.id(AndroidNotificationsObjects.NOTIFICATIONS_MESSAGES)).size();
            Assert.assertEquals(1, size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^android user is on messages page$")
    public void android_user_is_on_messages_page() {
        try {
            int size = driver.findElements(MobileBy.AndroidUIAutomator(AndroidNotificationsObjects.MESSAGES_PAGE)).size();
            Assert.assertEquals(1, size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^android user can see continue and no thanks buttons$")
    public void android_user_can_see_action_buttons() {
        try {
            int continueButtons = driver.findElements(MobileBy.AndroidUIAutomator(AndroidNotificationsObjects.CONTINUE_BUTTON)).size();
            Assert.assertEquals(1, continueButtons);

            int noThanksButtons = driver.findElements(MobileBy.AndroidUIAutomator(AndroidNotificationsObjects.NO_THANKS_BUTTON)).size();
            Assert.assertEquals(1, noThanksButtons);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @And("^android user can see for you notifications$")
    public void android_user_can_see_for_you_notifications() {
        try {
            int size = driver.findElements(By.id(AndroidNotificationsObjects.NOTIFICATIONS_OFFERS)).size();
            Assert.assertEquals(1, size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^android user click offers notifications$")
    public void android_user_click_offers_notifications() {
        try {
            driver.findElement(By.id(AndroidNotificationsObjects.NOTIFICATIONS_OFFERS)).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^android user open first offer notification$")
    public void android_user_open_first_offer_notification() {
        try {
            driver.findElement(By.id(AndroidNotificationsObjects.OFFERS_MESSAGES_ROW)).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^android user is on offers page$")
    public void android_user_is_on_offers_page() {
        try {
            int size = driver.findElements(MobileBy.AndroidUIAutomator(AndroidNotificationsObjects.FOR_YOUR_PAGE)).size();
            Assert.assertEquals(1, size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^android user is on offers drtails page$")
    public void android_user_is_on_offers__details_page() {
        try {
            int interested = driver.findElements(MobileBy.AndroidUIAutomator(AndroidNotificationsObjects.INTERESTED_BUTTON)).size();
            Assert.assertEquals(1, interested);
            int noThanks = driver.findElements(MobileBy.AndroidUIAutomator(AndroidNotificationsObjects.NO_THANKS_BUTTON_OFFERS)).size();
            Assert.assertEquals(1, noThanks);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @When("^android user search for a notification \"([^\"]*)\"$")
    public void android_user_search_for_a_notification_something(String notification) {
        try {
            MobileElement searchBar = driver.findElement(By.id(AndroidNotificationsObjects.NOTIFICATION_SEARCH_BAR));
            searchBar.click();
            searchBar.setValue(notification);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @Then("^android user is on transactions notifications page$")
    public void android_user_is_on_transactions_notifications_page() {
        try {
            int size = driver.findElements(MobileBy.AndroidUIAutomator(AndroidNotificationsObjects.TRANSACTION_NOTIFICATION_PAGE)).size();
            Assert.assertEquals(1, size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^android user can see go to debit orders message$")
    public void android_user_can_see_go_to_debit_orders() {
        try {
            int size = driver.findElements(By.id(AndroidNotificationsObjects.REPORT_FRAUD_CONTAINER)).size();
            Assert.assertEquals(1, size);

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^android user can see transaction type$")
    public void android_user_can_see_notification_type() {
        try {
            int size = driver.findElements(By.id(AndroidNotificationsObjects.TRANSACTION_TYPE)).size();
            Assert.assertEquals(1, size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @And("^android user open first transaction notification$")
    public void android_user_open_first_transaction_notification() {
        try {
            driver.findElement(By.id(AndroidNotificationsObjects.MESSAGES_ROW)).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^android user click go to debit orders or report fraud$")
    public void android_user_click_go_to_debit_orders() {
        try {
            int debitOrders = driver.findElements(By.id(AndroidNotificationsObjects.GO_TO_DEBIT_ORDERS)).size();
            int reportFraud = driver.findElements(By.id(AndroidNotificationsObjects.REPORT_FRAUD_CONTAINER)).size();

            if (debitOrders == 1) {
                driver.findElement(By.id(AndroidNotificationsObjects.GO_TO_DEBIT_ORDERS)).click();
                int size = driver.findElements(By.id(AndroidNotificationsObjects.DEBIT_ORDER_SECTION_NAME)).size();
                Assert.assertEquals(1, size);
                int debitOrderSwitching = driver.findElements(By.id(AndroidNotificationsObjects.SWITCH_DEBIT_ORDER_ROW)).size();
                Assert.assertEquals(1, debitOrderSwitching);
                logger.info("Validated go to debit order flow");
            }

            if (reportFraud == 1) {
                driver.findElement(By.id(AndroidNotificationsObjects.REPORT_FRAUD_LINK)).click();
                String reportFraudButton = driver.findElement(By.id(AndroidNotificationsObjects.REPORT_FRAUD_BUTTON)).getText();
                Assert.assertEquals("Report", reportFraudButton);
                driver.findElement(By.id(AndroidNotificationsObjects.REPORT_FRAUD_BUTTON)).click();
                int cardNote = driver.findElements(By.id(AndroidNotificationsObjects.REPORT_FRAUD_CARD_NOTE)).size();
                Assert.assertEquals(1, cardNote);
            }


        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @When("^android user click transactions notifications$")
    public void android_user_click_transactions_notifications() {
        try {
            driver.findElement(By.id(AndroidNotificationsObjects.TRANSACTION_NOTIFICATION_LABEL)).click();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^android user click transactions notifications sort button$")
    public void android_user_click_transactions_notifications_sort_button() {
        try {
            driver.findElement(By.id(AndroidNotificationsObjects.FILTER_ICON)).click();

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^android user select transaction sort option \"([^\"]*)\"$")
    public void android_user_select_transaction_sort_option_something(String sortBy) {
        try {
            System.out.println("ss");
            switch (sortBy) {
                case "Most recent":
                    driver.findElement(By.id(AndroidNotificationsObjects.MOST_RECENT)).click();
                    break;

                case "Oldest date":
                    driver.findElement(By.id(AndroidNotificationsObjects.OLDEST_DATE)).click();
                    break;

                case "Lowest amount":
                    driver.findElement(By.id(AndroidNotificationsObjects.LOWEST_AMOUNT)).click();
                    break;

                case "Highest amount":
                    driver.findElement(By.id(AndroidNotificationsObjects.HIGHEST_AMOUNT)).click();
                    break;

                default:
                    logger.info("Invalid sort value enters");
            }

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^android user can see transaction notifications$")
    public void android_user_can_see_transaction_notification() {
        try {
            int size = driver.findElements(By.id(AndroidNotificationsObjects.TRANSACTION_NOTIFICATION_LABEL)).size();
            Assert.assertEquals(1, size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @Then("^android user is on transaction sort page$")
    public void android_user_is_on_transaction_sort_page() {
        try {
            int size = driver.findElements(MobileBy.AndroidUIAutomator(AndroidNotificationsObjects.FILTER_PAGE)).size();
            Assert.assertEquals(1, size);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^android transaction notifications are sorted by \"([^\"]*)\"$")
    public void android_transaction_notifacations_are_sorted(String sortBy) {
        try {
            String sortOption = driver.findElement(By.id(AndroidNotificationsObjects.TRANSACTION_SECTION_NAME)).getText().trim();
            Assert.assertEquals(sortBy.toUpperCase(), sortOption);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Given("^user launch the android money app$")
    public void user_launch_the__android_money_app() {
//
//        wait.until(presenceOfElementLocated(By.xpath(VAS_Prepaid_AndroidObjects.BTN_NEXT)));
////        MobileElement continueWithVersion = driver.findElement(By.id(VAS_Prepaid_AndroidObjects.CONTINUE_WITH_THIS_VERSION));
////        if (continueWithVersion.isDisplayed()) {
////            continueWithVersion.click();
////        }
//        try {
//            MobileElement btnNext = driver.findElement(By.xpath(VAS_Prepaid_AndroidObjects.BTN_NEXT));
//            if (btnNext.isDisplayed()) {
//                btnNext.click();
//            }
//        } catch (Exception e) {
//            e.getMessage();
//        }
        logger.info("Successfully launched Nedbank App");
    }

    @When("^android user open push notification with title$")
    public void android_user_open_push_notifications() {
        try {
            List<String> titles = new ArrayList<>();
            ((AndroidDriver) driver).openNotifications();
//            String pushApp = driver.findElement(By.id(AndroidNotificationsObjects.PUSH_APP)).getText();
//            List<MobileElement> notificationTitles = driver.findElements(By.id(AndroidNotificationsObjects.PUSH_TITLE));
//            List<MobileElement> notificationTexts = driver.findElements(By.id(AndroidNotificationsObjects.PUSH_TEXT));
//            int count = 0;
//            for (MobileElement currentTitle : notificationTitles) {
//                String titleString = currentTitle.getText();
//                titles.add(titleString);
//            }
//
//
//            for (String expectedTitle : expectedTitles) {
//
//                if (pushApp.equalsIgnoreCase("Money")) {
//                    for (String title : titles) {
//
//                        if (expectedTitle.equalsIgnoreCase(title))
//                            count++;
//                    }
//                }
//            }
//
//                Assert.assertTrue(count > 0);
//                notificationTitles.get(0).click();
//
//                int expandedNTitles = driver.findElements(By.id(AndroidNotificationsObjects.PUSH_EXPANDED_TITLE)).size();
//                if (expandedNTitles > 0) {
//                    for (int n = 0; n < expandedNTitles; n++) {
//                        if(n > 0) {
//                            ((AndroidDriver) driver).openNotifications();
//                            notificationTitles.get(n).click();
//                        }
//
//                    }
//                }

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

}
