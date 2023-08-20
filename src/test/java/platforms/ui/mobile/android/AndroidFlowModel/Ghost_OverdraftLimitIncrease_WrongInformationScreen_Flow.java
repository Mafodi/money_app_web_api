package platforms.ui.mobile.android.AndroidFlowModel;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import platforms.ui.mobile.android.AndroidCommonMethods;
import platforms.ui.mobile.android.AndroidPageObjects.Android_Ghost_OverdraftLimitIncreaseObjects;
import platforms.ui.mobile.ios.PageFactoryObject;
import utils.CommonFunctions;
import utils.DriverFactory;

public class Ghost_OverdraftLimitIncrease_WrongInformationScreen_Flow extends DriverFactory {

    private static Logger log = Logger.getLogger(Ghost_OverdraftLimitIncrease_AcceptDisclaimers_Flow.class);
    PageFactoryObject pageFactoryObj = new PageFactoryObject(driver);
    WebDriverWait wait = new WebDriverWait(driver, 60);
    DC_HeyNedSubscription_Flow subscriptionFlow = new DC_HeyNedSubscription_Flow();
    Android_Ghost_OverdraftLimitIncreaseObjects androidODLIPages = new Android_Ghost_OverdraftLimitIncreaseObjects(driver);
    private AndroidCommonMethods basePage = new AndroidCommonMethods();
    private CommonFunctions common = new CommonFunctions();
    //WrongInformation

    public void WrongInfoHeader(String wrongInfoHeader) {

        try {
            common.secondsDelay(3);
            String getWrongInfoHeader = androidODLIPages.WrongInformationHeader.getText();
            if (getWrongInfoHeader.equals(wrongInfoHeader)) {
                log.info("Wrong Info Header displayed");
            } else {
                log.info("Wrong Info Header not found" + getWrongInfoHeader);
                Assert.fail(getWrongInfoHeader);
            }

        } catch (Exception e) {
            log.info("Wrong Info Header not found");
            Assert.fail(e.getMessage());
        }


    }

    public void WrongInformationSubHeader(String wrongInformationSubHeader) {

        try {
            common.secondsDelay(2);
            String getWrongInformationSubHeader = androidODLIPages.WrongInformationHeaderDescription.getText();
            if (getWrongInformationSubHeader.equals(wrongInformationSubHeader)) {
                log.info("Wrong Info sub Header displayed");
            } else {
                log.info("Wrong Info sub Header  not found" + getWrongInformationSubHeader);
                Assert.fail(getWrongInformationSubHeader);
            }

        } catch (Exception e) {
            log.info("Wrong Info sub Header  not found");
            Assert.fail(e.getMessage());
        }


    }

    public void WrongInTotalIncomeLabel(String wrongInTotalIncomeLabel) {
        try {
            common.secondsDelay(2);
            String getwrongInTotalIncomeLabel = androidODLIPages.WrongInformationcheckbox1Descrition.getText();
            if (getwrongInTotalIncomeLabel.equals(wrongInTotalIncomeLabel)) {
                log.info("WrongInTotalIncomeLabel displayed");
            } else {
                log.info("WrongInTotalIncomeLabel not found" + getwrongInTotalIncomeLabel);
                Assert.fail(getwrongInTotalIncomeLabel);
            }

        } catch (Exception e) {
            log.info("WrongInTotalIncomeLabel  not found");
            Assert.fail(e.getMessage());
        }


    }

    public void WrongInfoTotalLivingExpensesLabel(String wrongInfoTotalLivingExpensesLabel) {

        try {
            common.secondsDelay(2);
            String getWrongInfoTotalLivingExpensesLabel = androidODLIPages.WrongInformationcheckbox2Descrition.getText();
            if (getWrongInfoTotalLivingExpensesLabel.equals(wrongInfoTotalLivingExpensesLabel)) {
                log.info("Wrong Info Total Living Expenses Label displayed");
            } else {
                log.info("Wrong Info Total Living Expenses Label not found" + getWrongInfoTotalLivingExpensesLabel);
                Assert.fail(getWrongInfoTotalLivingExpensesLabel);
            }

        } catch (Exception e) {
            log.info("Wrong Info Total Living Expenses Label  not found");
            Assert.fail(e.getMessage());
        }

    }

    public void WrongInfoTotalDebtObligationLabel(String wrongInfoTotalDebtObligationLabel) {

        try {
            common.secondsDelay(2);
            String getWrongInfoTotalDebtObligationLabel = androidODLIPages.WrongInformationcheckbox3Descrition.getText();
            if (getWrongInfoTotalDebtObligationLabel.equals(wrongInfoTotalDebtObligationLabel)) {
                log.info("WrongInfoTotalDebt Obligation Label displayed");
            } else {
                log.info("Wrong Info Total Living Expenses Label not found" + getWrongInfoTotalDebtObligationLabel);
                Assert.fail(getWrongInfoTotalDebtObligationLabel);
            }

        } catch (Exception e) {
            log.info("Wrong Info Total Living Expenses Label  not found");
            Assert.fail(e.getMessage());
        }


    }

    public void WeWillBeInTouchText(String weWillBeInTouchText) {

        try {
            common.secondsDelay(2);
            String getWeWillBeInTouchText = androidODLIPages.WrongInformationHelpText.getText();
            if (getWeWillBeInTouchText.equals(weWillBeInTouchText)) {
                log.info("We Will Be In Touch Text displayed");
            } else {
                log.info("We Will Be In Touch Text not found" + getWeWillBeInTouchText);
                Assert.fail(getWeWillBeInTouchText);
            }

        } catch (Exception e) {
            log.info("We Will Be In Touch Text not found");
            Assert.fail(e.getMessage());
        }

    }

    public void wrongInfoCheckBoxOne() {
        try {
            common.secondsDelay(1);
            if (androidODLIPages.WrongInformationCheckbox1.isDisplayed()) {
                androidODLIPages.WrongInformationCheckbox1.click();
                log.info("Checkbox selected");

            }

        } catch (Exception e) {
            log.info("Checkbox not Found");
        }
    }

    public void wrongInfoCheckboxTwo() {
        try {
            common.secondsDelay(1);
            if (!androidODLIPages.WrongInformationCheckbox2.isSelected()) {
                androidODLIPages.WrongInformationCheckbox2.click();

                log.info("Checkbox selected");
            }
        } catch (Exception e) {
            log.info("Checkbox not Found");
        }
    }


    public void wrongInfoCheckBoxThree() {
        try {
            common.secondsDelay(1);
            if (!androidODLIPages.WrongInformationCheckbox3.isSelected()) {
                androidODLIPages.WrongInformationCheckbox3.click();
            }
        } catch (Exception e) {
            log.info("Checkbox not Found");
        }
    }

    public void ValidateDoneButtonIsDisabled() {
        common.secondsDelay(1);
        Assert.assertTrue(!androidODLIPages.DoneButton.isEnabled());
            log.info("Confirm Button is Disabled");
        }


    public void ValidateDoneButtonIsEnabled() {
        common.secondsDelay(1);
        boolean confirmButton = (androidODLIPages.DoneButton).isEnabled();
        Assert.assertTrue(confirmButton);
    }


    public void ClickDoneButton(){
        common.secondsDelay(1);
        if(androidODLIPages.DoneButton.isDisplayed()){
            androidODLIPages.DoneButton.click();
            common.secondsDelay(2);
        }
    }

    public void DashboardWelcomeScreen(){
        common.secondsDelay(2);
        if(pageFactoryObj.getOverviewScreenLocator().Overview_MyAccount.isDisplayed()){
           log.info("On Dashboard screen");
           common.secondsDelay(2);
        }
}
}