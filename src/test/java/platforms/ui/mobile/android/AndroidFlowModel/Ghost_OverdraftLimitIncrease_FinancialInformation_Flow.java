package platforms.ui.mobile.android.AndroidFlowModel;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import platforms.ui.mobile.android.AndroidCommonMethods;
import platforms.ui.mobile.android.Ghost_Cod_AndroidDataFactory;
import platforms.ui.mobile.android.AndroidPageObjects.Android_Ghost_OverdraftLimitIncreaseObjects;
import platforms.ui.mobile.ios.PageFactoryObject;
import utils.CommonFunctions;
import utils.DriverFactory;

public class Ghost_OverdraftLimitIncrease_FinancialInformation_Flow extends DriverFactory {

    private static Logger log = Logger.getLogger(Ghost_OverdraftLimitIncrease_AcceptDisclaimers_Flow.class);
    PageFactoryObject pageFactoryObj = new PageFactoryObject(driver);
    WebDriverWait wait = new WebDriverWait(driver, 60);
    DC_HeyNedSubscription_Flow subscriptionFlow = new DC_HeyNedSubscription_Flow();
    Android_Ghost_OverdraftLimitIncreaseObjects androidODLIPages = new Android_Ghost_OverdraftLimitIncreaseObjects(driver);
    Ghost_Cod_AndroidDataFactory ghostCodAndroidDataFactory = new Ghost_Cod_AndroidDataFactory();
    private AndroidCommonMethods basePage = new AndroidCommonMethods();
    private CommonFunctions common = new CommonFunctions();
    //FinancialInformation

    public void FinancialScreenSteeper(String financialInfoStepper) {

        try {
            common.secondsDelay(2);
            String getFinancialInfoStepper = androidODLIPages.your_information_screen_stepper.getText();
            if (getFinancialInfoStepper.equals(financialInfoStepper)) {
                log.info("Financial screen stepper displayed");
            } else {
                log.info("Financial screen stepper not found" + getFinancialInfoStepper);
                Assert.fail(getFinancialInfoStepper);
            }

        } catch (Exception e) {
            log.info("Financial screen stepper not found");
            Assert.fail(e.getMessage());
        }


    }

    public void FinancialHeader(String financialHeader) {
        try {
            common.secondsDelay(3);
            String getFinancialHeader = androidODLIPages.your_information_header.getText();

            if (getFinancialHeader.equals(financialHeader)) {
                log.info("Financial header" + getFinancialHeader);
            } else {
                log.info("Financial header not found" + getFinancialHeader);
                Assert.fail(getFinancialHeader);
            }
        } catch (Exception e) {
            log.info("Financial header not found");
            Assert.fail(e.getMessage());
        }


    }


    public void FinancialSubHeader(String financialSubHeading) {
        try {
            common.secondsDelay(1);
            String getFinancialSubHeader = androidODLIPages.your_information_header_description.getText();
            if (getFinancialSubHeader.equals(financialSubHeading)) {
                log.info("Financial Sub header displayed successfully");
            } else {
                log.info("Financial Sub header not found");
                Assert.fail(getFinancialSubHeader);
            }

        } catch (Exception e) {
            Assert.fail(e.getMessage());
        }
    }

    public void totalMonthlyIncome(String totalMonthlyIncome) {
        try {
            common.secondsDelay(1);
            String gettotalMonthlyIncome = androidODLIPages.total_monthly_income_label.getText();
            if (gettotalMonthlyIncome.equals(totalMonthlyIncome)) {
                log.info("totalMonthlyIncome displayed successfully");
            } else {
                log.info("totalMonthlyIncome not found");
                Assert.fail(gettotalMonthlyIncome);
            }
        } catch (Exception e) {
            Assert.fail(e.getMessage());
        }
    }

    public void TotalMonthlyIncomeToolTip(String totalMonthlyIncomeToolTip) {
        try {


            common.secondsDelay(1);
            String gettotalMonthlyIncomeToolTip = androidODLIPages.monthly_income_toolTip_description.getText();
            if (gettotalMonthlyIncomeToolTip.equals(totalMonthlyIncomeToolTip)) {
                log.info("totalMonthlyIncomeToolTip displayed successfully" + gettotalMonthlyIncomeToolTip);
            } else {
                log.info("totalMonthlyIncomeToolTip not found");
                Assert.fail(gettotalMonthlyIncomeToolTip);
            }
        } catch (Exception e) {
            Assert.fail(e.getMessage());
        }
    }

    public void totalMonthlyIncomeValue(String totalMonthlyIncomeValue) {
        try {
            String gettotalMonthlyIncomeValue = androidODLIPages.total_monthly_income_value.getText();
            if (gettotalMonthlyIncomeValue.charAt(0) == 'R' && Character.isDigit(totalMonthlyIncomeValue.charAt(1))) {
                log.info("Total Monthly Income: " + totalMonthlyIncomeValue.charAt(0) + totalMonthlyIncomeValue.charAt(1));

            } else {
                log.info("Total Monthly Income Value: not found");
                Assert.fail(gettotalMonthlyIncomeValue);
            }

        } catch (Exception e) {
            Assert.fail(e.getMessage());
        }
    }

    public void TotalMonthlyLivingExpenses(String totalMonthlyLivingExpenses) {
        try {
            common.secondsDelay(1);
            String getTotalMonthlyLivingExpenses = androidODLIPages.total_monthly_living_expenses_label.getText();
            if (getTotalMonthlyLivingExpenses.equals(totalMonthlyLivingExpenses)) {
                log.info("TotalMonthlyLivingExpenses displayed successfully");
            } else {
                log.info("TotalMonthlyLivingExpenses  not found");
                Assert.fail(getTotalMonthlyLivingExpenses);

            }
        } catch (Exception e) {
            Assert.fail(e.getMessage());
        }
    }

    public void TotalMonthlyLivingExpensesToolTip(String totalMonthlyLivingExpensesToolTip) {
        try {
            common.secondsDelay(1);
            String getTotalMonthlyLivingExpensesToolTip = androidODLIPages.total_monthly_living_expenses_toolTip_Description.getText();
            if (getTotalMonthlyLivingExpensesToolTip.equals(totalMonthlyLivingExpensesToolTip)) {
                log.info("TotalMonthlyLivingExpensesToolTip displayed successfully" + getTotalMonthlyLivingExpensesToolTip);
            } else {
                log.info("TotalMonthlyLivingExpensesToolTip not found");
                Assert.fail(getTotalMonthlyLivingExpensesToolTip);
            }
        } catch (Exception e) {
            Assert.fail(e.getMessage());
        }
    }

    public void TotalMonthlyLivingExpensesValue(String totalMonthlyLivingExpensesValue) {
        try {

            common.secondsDelay(1);
            String getTotalMonthlyLivingExpensesValue = androidODLIPages.total_monthly_living_expenses_value.getText();
            if (getTotalMonthlyLivingExpensesValue.charAt(0) == 'R' && Character.isDigit(totalMonthlyLivingExpensesValue.charAt(1))) {
                log.info("Total Monthly LivingExpenses: " + totalMonthlyLivingExpensesValue.charAt(0) + totalMonthlyLivingExpensesValue.charAt(1));


            } else {
                log.info("TotalMonthlyLivingExpenses value not found");
                Assert.fail(getTotalMonthlyLivingExpensesValue);
            }
        } catch (Exception e) {
            Assert.fail(e.getMessage());
        }
    }

    public void TotalMonthlyDebtObligations(String totalMonthlyDebtObligation) {

        try {
            common.secondsDelay(1);
            String getTotalMonthlyDebtObligations = androidODLIPages.total_monthly_debt_obligation_label.getText();
            if (getTotalMonthlyDebtObligations.equals(totalMonthlyDebtObligation)) {
                log.info("TotalMonthlyDebtObligations displayed successfully");
            } else {
                log.info("TotalMonthlyDebtObligations displayed not found");
                Assert.fail(getTotalMonthlyDebtObligations);
            }
        } catch (Exception e) {
            Assert.fail(e.getMessage());
        }
    }

    public void TotalMonthlyDebtObligationsToolTip(String totalMonthlyDebtObligationsToolTip) {
        try {
            String getTotalMonthlyDebtObligationsToolTip = androidODLIPages.total_monthly_debt_obligation_toolTip_Description.getText();
            if (getTotalMonthlyDebtObligationsToolTip.equals(totalMonthlyDebtObligationsToolTip)) {
                log.info("TotalMonthlyDebtObligationsToolTip displayed successfully" + getTotalMonthlyDebtObligationsToolTip);
            } else {
                log.info("TotalMonthlyDebtObligationsToolTip not found");
                Assert.fail(getTotalMonthlyDebtObligationsToolTip);
            }


        } catch (Exception e) {
            Assert.fail(e.getMessage());
        }
    }

    public void TotalMonthlyDebtObligationsValue(String totalMonthlyDebtObligationsValue) {
        try {

            String getTotalMonthlyDebtObligationsValue = androidODLIPages.total_monthly_debt_obligation_value.getText();
            if (getTotalMonthlyDebtObligationsValue.charAt(0) == 'R' && Character.isDigit(totalMonthlyDebtObligationsValue.charAt(1))) {
                log.info("Total Monthly Debt Obligations: " + totalMonthlyDebtObligationsValue.charAt(0) + totalMonthlyDebtObligationsValue.charAt(1));

            } else {
                log.info("TotalMonthlyDebtObligations value not found");
                Assert.fail(getTotalMonthlyDebtObligationsValue);
            }
        } catch (Exception e) {
            Assert.fail(e.getMessage());

        }
    }

    public void CorrectInformationText(String CorrectInformationText) {
        try {
            common.secondsDelay(1);
            String getCorrectInformationText = androidODLIPages.info_incorrect_message.getText();

            if (getCorrectInformationText.equals(CorrectInformationText)) {
                log.info("CorrectInformationText displayed successfully");

            } else {
                log.info("CorrectInformationText not found");
                Assert.fail(getCorrectInformationText);
            }

        } catch (Exception e) {
            Assert.fail(e.getMessage());
        }

    }

    public void ClickNoToggle() {
        common.secondsDelay(1);
        androidODLIPages.info_incorrect_switch_no.click();

    }

    public void OfferHeader(String yourOfferHeader) {
        try {
            common.secondsDelay(2);
            String getOfferHeader = androidODLIPages.your_offer_header.getText();
            if (getOfferHeader.equals(yourOfferHeader)) {
                log.info("On Offer screen");
                common.secondsDelay(2);
            } else {
                log.info("offerHeader not found");
                Assert.fail(getOfferHeader);
            }

        } catch (Exception e) {
            Assert.fail(e.getMessage());
        }

    }

    public void Click_X_Button() {
        common.secondsDelay(3);
        if (androidODLIPages.x_close_button.isDisplayed()) {
            androidODLIPages.x_close_button.click();
        }


    }

    public void LeavingSoSoonHeader(String leavingSoSoonHeader) {
        try {
            common.secondsDelay(2);
            String getLeavingSoSoonHeader = androidODLIPages.leavingSoSoonHeader.getText();
            if (getLeavingSoSoonHeader.equals(leavingSoSoonHeader)) {
                log.info("On Leaving so soon screen");
                common.secondsDelay(2);
            } else {
                log.info("On Leaving so soon screen not found");
                Assert.fail(getLeavingSoSoonHeader);
            }
        } catch (Exception e) {
            Assert.fail(e.getMessage());

        }

    }

    public void ClickIncorrectInNoToogle() {
        common.secondsDelay(2);
        if (androidODLIPages.info_incorrect_switch_no.isDisplayed()) {
            androidODLIPages.info_incorrect_switch_no.click();
            common.secondsDelay(2);
        }
    }

    public void IncorrectSwitcheMessage() {

        try {

            common.secondsDelay(2);

            String incorrectInfoToggleMessage = ghostCodAndroidDataFactory.incorrectInfoToggleMessage;
            String getIncorrectSwitcheMessage = androidODLIPages.info_incorrect_message.getText();
            if (getIncorrectSwitcheMessage.equals(incorrectInfoToggleMessage)) {
                log.info("incorrectInfoToggeleMessage displayed" + incorrectInfoToggleMessage);
            } else {
                log.info("incorrectInfoToggeleMessage not found");
                Assert.fail(getIncorrectSwitcheMessage);
            }

        } catch (Exception e) {
            Assert.fail(e.getMessage());
        }


    }


    public void WrongInfoHeader(String wrongInfoHeader) {
        try {
            common.secondsDelay(2);
            String getWrongInHeader = androidODLIPages.WrongInformationHeader.getText();
            if (getWrongInHeader.equals(wrongInfoHeader)) {
                log.info("On Wrong information screen");
                common.secondsDelay(2);
            } else {
                log.info("Wrong information screen not found");
                Assert.fail(getWrongInHeader);
            }


    }catch(
    Exception e)

    {
        Assert.fail(e.getMessage());
    }

}

}
