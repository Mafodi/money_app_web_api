package platforms.ui.mobile.android.AndroidFlowModel;

import cucumber.api.java.en.Then;
import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import platforms.ui.mobile.android.AndroidCommonMethods;
import platforms.ui.mobile.android.AndroidPageObjects.Android_Ghost_OverdraftLimitIncreaseObjects;
import platforms.ui.mobile.android.Ghost_Cod_AndroidDataFactory;
import platforms.ui.mobile.ios.PageFactoryObject;
import utils.CommonFunctions;
import utils.DriverFactory;

public class Ghost_OverdraftLimitIncrease_YourOfferScreen_Flow  extends DriverFactory {

    static String initialRepayment = "";
    static String initialLoanAmount = "";
    private static Logger log = Logger.getLogger(Ghost_OverdraftLimitIncrease_AcceptDisclaimers_Flow.class);
    PageFactoryObject pageFactoryObj = new PageFactoryObject(driver);
    WebDriverWait wait = new WebDriverWait(driver, 60);
    DC_HeyNedSubscription_Flow subscriptionFlow = new DC_HeyNedSubscription_Flow();
    Android_Ghost_OverdraftLimitIncreaseObjects androidODLIPages = new Android_Ghost_OverdraftLimitIncreaseObjects(driver);
    Ghost_Cod_AndroidDataFactory ghostCodAndroidDataFactory = new Ghost_Cod_AndroidDataFactory();
    private AndroidCommonMethods basePage = new AndroidCommonMethods();
    private CommonFunctions common = new CommonFunctions();
    //YourOffer

    public void OfferScreenStepper(String offerStepper) {

        try {
            common.secondsDelay(2);
            String getOfferStepper = androidODLIPages.your_offer_screen_stepper.getText();
            if (getOfferStepper.equals(offerStepper)) {
                log.info("offer stepper displayed");
            } else {
                log.info("offer stepper not found" + getOfferStepper);
                Assert.fail(getOfferStepper);
            }

        } catch (Exception e) {
            Assert.fail(e.getMessage());
        }
    }


    public void OfferHeader(String offerHeader) {
        try {
            common.secondsDelay(2);
            String getOfferHeader = androidODLIPages.your_offer_header.getText();
            if (getOfferHeader.equals(offerHeader)) {
                log.info("OfferHeader displayed successfully");
            } else {
                log.info("OfferHeader not found");
                Assert.fail(getOfferHeader);
            }

        } catch (Exception e) {
            Assert.fail(e.getMessage());

        }

    }

    public void OverdraftAmountLabel(String overdraftAmountLabel) {
        try {
            common.secondsDelay(2);
            String getOverdraftAmountLabel = androidODLIPages.overdraft_amount_label.getText();
            if (getOverdraftAmountLabel.equals(overdraftAmountLabel)) {
                log.info("Overdraft AMount label displayed");
            } else {
                log.info("Overdraft AMount label not found");
                Assert.fail(getOverdraftAmountLabel);
            }

        } catch (Exception e) {
            Assert.fail(e.getMessage());

        }
    }

    public void ChangeAmountBelowLabel(String changeAmountBelowLabel) {
        try {
            common.secondsDelay(2);
            String getChangeAmountLabel = androidODLIPages.change_overdraft_amount_label.getText();
            if (getChangeAmountLabel.equals(changeAmountBelowLabel)) {
                log.info("changeAmountBelowLabel displayed");
            } else {
                log.info("changeAmountBelowLabel not found");
                Assert.fail(getChangeAmountLabel);
            }
        } catch (Exception e) {
            Assert.fail(e.getMessage());
        }
    }


    public void MaxMountLable(String maxAmountLabel) {
        try {
            common.secondsDelay(2);
            String getMaxAmountLabel = androidODLIPages.overdraft_maxAmount_subtitle.getText();
            if (getMaxAmountLabel.equals(maxAmountLabel)) {
                log.info("MaxAmount Displayed ");
            } else {
                log.info("changeAmountBelowLabel not found");
                Assert.fail(getMaxAmountLabel);
            }
        } catch (Exception e) {
            Assert.fail(e.getMessage());

        }

    }

    public void MinAmountLabel(String minAmountLabel) {
        try {
            common.secondsDelay(2);
            String getMinAmountLabel = androidODLIPages.overdraft_minimum_amount.getText();
            if (getMinAmountLabel.equals(minAmountLabel)) {
                log.info("MinAmountLabel displayed");
            } else {
                log.info("MinAmountLabel not found");
                Assert.fail(getMinAmountLabel);
            }
        } catch (Exception e) {
            Assert.fail(e.getMessage());
        }
    }

    public void MonthlyRepaymentLabel(String monthlyRepaymentLabel) {

        try {
            common.secondsDelay(2);
            String getMonthlyRepaymentLabel = androidODLIPages.monthly_repayment_label.getText();
            if (getMonthlyRepaymentLabel.equals(monthlyRepaymentLabel)) {
                log.info("MonthlyRepaymentLabel displayed");
            } else {
                log.info("MonthlyRepaymentLabel not found");
                Assert.fail(getMonthlyRepaymentLabel);
            }
        } catch (Exception e) {
            Assert.fail(e.getMessage());
        }
    }

    public void MonthlyRepaymentValue(String monthlyRepaymentValue) {
        try {
            common.secondsDelay(2);
            String getMonthlyRepaymentValue = androidODLIPages.monthly_repayment_value.getText();
            if (getMonthlyRepaymentValue.equals(monthlyRepaymentValue)) {
                log.info("MonthlyRepaymentValue displayed");
            } else {
                log.info("MonthlyRepaymentValue not found");
                Assert.fail(getMonthlyRepaymentValue);
            }
        } catch (Exception e) {
            Assert.fail(e.getMessage());
        }
    }

    public void ReviewMyCreditAnnually(String reviewMyCreditAnnually) {
        try {
            common.secondsDelay(2);
            String getReviewMyCreditAnnually = androidODLIPages.review_my_creditLimitAnnuallyText.getText();
            if (getReviewMyCreditAnnually.equals(reviewMyCreditAnnually)) {
                log.info("Review My Credit Annually displayed");
            } else {
                log.info("Review My Credit Annually not found");
                Assert.fail(getReviewMyCreditAnnually);
            }

        } catch (Exception e) {
            Assert.fail(e.getMessage());
        }
    }

    public void CaptureInvalidLoanAmount() {

        common.secondsDelay(3);
        androidODLIPages.overdraft_amount_value.clear();
        androidODLIPages.overdraft_amount_value.sendKeys(ghostCodAndroidDataFactory.InvalidAmount);
        androidODLIPages.overdraft_amount_value.click();
        Actions act = new Actions(driver);
        act.sendKeys(Keys.ENTER);
        act.build().perform();

        common.secondsDelay(2);
    }

    public void InvalidAmountErrorMessage() {

        try {

            common.secondsDelay(3);

            String invalidAmountErrorMessage = ghostCodAndroidDataFactory.InvalidAmountErrorMessage;
            String getInvalidAmountErrorMessage = androidODLIPages.invalidAmountErrorMessage.getText();
            if (getInvalidAmountErrorMessage.equals(invalidAmountErrorMessage)) {
                log.info("Invalid Amount Error Message displayed:" + getInvalidAmountErrorMessage);
                common.secondsDelay(2);
            } else {
                log.info("Invalid Amount Error Message not found");
                Assert.fail(getInvalidAmountErrorMessage);
            }

        } catch (Exception e) {
            Assert.fail(e.getMessage());
        }

    }

    public void getCurrentLoanAmount() {
        try {
            common.secondsDelay(2);
            String initialLoanAmount = androidODLIPages.overdraft_amount_value.getText();

            log.info("initial Loan Amount" + initialLoanAmount);
            common.secondsDelay(1);

        } catch (Exception e) {
            Assert.fail(e.getMessage());
        }


    }

    public void newLoanAmount() {
        try {
            common.secondsDelay(2);
            String getNewLoanAmount = androidODLIPages.overdraft_amount_value.getText();
            if (!initialLoanAmount.equals(getNewLoanAmount)) {
                log.info("New Loan Amount updated successfully:" + getNewLoanAmount);
                common.secondsDelay(2);
            } else {
                log.info("New Loan Amount not updated");
                Assert.fail(getNewLoanAmount);
            }

        } catch (Exception e) {
            Assert.fail(e.getMessage());
        }


    }

    public void getCurrentRepaymentAmount() {
        try {
            common.secondsDelay(2);
            String initialRepayment = androidODLIPages.monthly_repayment_value.getText();

            log.info("Initial Repayment amount" + initialRepayment);
            common.secondsDelay(1);

        } catch (Exception e) {
            Assert.fail(e.getMessage());
        }


    }


    public void UpdateLoanAmountViaSlider() {

        try {
            common.secondsDelay(2);
            Actions act = new Actions(driver);
            act.dragAndDropBy(androidODLIPages.overdraft_amount_slidder, -100, 0).perform();
            common.secondsDelay(3);


        } catch (Exception e) {
            Assert.fail(e.getMessage());
        }

    }

    public void validateNewRepaymentAmount() {

        try {
            common.secondsDelay(2);
            String newRepaymentAmount = androidODLIPages.monthly_repayment_value.getText();
            log.info("New Repayment amount" + newRepaymentAmount);
            if (!initialRepayment.equals(newRepaymentAmount)) {
                log.info("Repayment amount updated successfully");
                common.secondsDelay(2);
            } else {
                log.info("Repayment amount not updated");
                Assert.fail(newRepaymentAmount);
            }

        } catch (Exception e) {
            Assert.fail(e.getMessage());
        }
    }


    public void ClickRecalculateButton() {

        common.secondsDelay(2);
        if (androidODLIPages.recalculateButton.isDisplayed()) {
            androidODLIPages.recalculateButton.click();

        }

    }

    public void ClickYesToggle() {
        try {
            common.secondsDelay(2);
            if (androidODLIPages.annual_increase_toggle_yes.isDisplayed()) {
                androidODLIPages.annual_increase_toggle_yes.click();
                common.secondsDelay(2);
            }

        } catch (Exception e) {
            Assert.fail(e.getMessage());
        }


    }

    public void getAnnualIncreaseToggleMessage(String AnnualIncreaseToggleMessage) {
        try {
            common.secondsDelay(1);
            String getAnnualIncreaseToggleMessage = androidODLIPages.annual_increase_toggle_message.getText();
            if (getAnnualIncreaseToggleMessage.equals(AnnualIncreaseToggleMessage)) {
                log.info("AnnualIncreaseToggleMessage displayed:" + getAnnualIncreaseToggleMessage);
            } else {
                log.info("AnnualIncreaseToggleMessage not found ");
                Assert.fail(getAnnualIncreaseToggleMessage);
            }

        } catch (Exception e) {
            Assert.fail(e.getMessage());
        }

    }
}