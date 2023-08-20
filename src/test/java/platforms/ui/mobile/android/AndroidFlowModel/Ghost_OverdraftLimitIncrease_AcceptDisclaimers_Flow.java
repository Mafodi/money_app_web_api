package platforms.ui.mobile.android.AndroidFlowModel;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import platforms.ui.mobile.android.AndroidCommonMethods;
import platforms.ui.mobile.android.AndroidPageObjects.Android_Ghost_OverdraftLimitIncreaseObjects;
import platforms.ui.mobile.ios.PageFactoryObject;
import utils.CommonFunctions;
import utils.DriverFactory;

public class Ghost_OverdraftLimitIncrease_AcceptDisclaimers_Flow extends DriverFactory {


    private static Logger log = Logger.getLogger(Ghost_OverdraftLimitIncrease_AcceptDisclaimers_Flow.class);
    PageFactoryObject pageFactoryObj = new PageFactoryObject(driver);
    WebDriverWait wait = new WebDriverWait(driver, 60);
    DC_HeyNedSubscription_Flow subscriptionFlow = new DC_HeyNedSubscription_Flow();
    Android_Ghost_OverdraftLimitIncreaseObjects androidODLIPages = new Android_Ghost_OverdraftLimitIncreaseObjects(driver);
    private AndroidCommonMethods basePage = new AndroidCommonMethods();
    private CommonFunctions common = new CommonFunctions();
    //Disclaimers

    public void ValidateDisclaimersHeader(String disclaimersHeading) {

        try {
            common.secondsDelay(3);
            String getheading = androidODLIPages.lets_get_started_header.getText();
            if (getheading.equals(disclaimersHeading)) {
                log.info("DisclaimersHeader Verified " + getheading);
            }


        } catch (Exception e) {
            log.info("DisclaimersHeader not found");
        }
    }

    public void ValidateSubHeading(String disclaimersSubHeading) {
        try {
            common.secondsDelay(3);
            String getsubheading = androidODLIPages.Disclaimers_subHeader.getText();
            if (getsubheading.equals(disclaimersSubHeading)) {
                log.info("Sub Header Verified " + getsubheading);
            }

        } catch (Exception e) {
            log.info("Sub Header not found");
        }
    }
    public void PermanantlyEmployedLabel(String permanentlyEmployedLabel) {
        try {
            common.secondsDelay(3);
            String getPermanentlyEmployedLabel = androidODLIPages.Disclaimers_permanently_employed_Text.getText();
            if (getPermanentlyEmployedLabel.equals(permanentlyEmployedLabel)) {
                log.info("Permanently employed text verified" + getPermanentlyEmployedLabel);

            }
        } catch (Exception e) {
            log.info("Permanently employed text not found");
        }
    }


    public void InsolventLabel(String insolventLabel){

        try {
            common.secondsDelay(3);
            String getInsolventLabel = androidODLIPages.insolvent_text.getText();
            if (getInsolventLabel.contains(insolventLabel)) {
                log.info("InsolventLabel Verified" + getInsolventLabel);
            } else {
                log.info("InsolventLabel not found" + getInsolventLabel);
                Assert.fail(getInsolventLabel);
            }
        } catch (Exception e) {
            log.info("InsolventLabel not found");
            Assert.fail(e.getMessage());
        }


    }

    public void SpousalConsent(String spousalConsent){
        try {
            common.secondsDelay(3);
            String getspousalConsent = androidODLIPages.spousal_consent_text.getText();
            if (getspousalConsent.contains(spousalConsent)) {
                log.info("spousalConsent Verified" + getspousalConsent);
            } else {
                log.info("spousalConsent not found" + getspousalConsent);
                Assert.fail(getspousalConsent);
            }
        } catch (Exception e) {
            log.info("spousalConsent not found");
            Assert.fail(e.getMessage());
        }

    }

    public void disclaimersCheckBoxOne() {
        try {
            common.secondsDelay(1);
            if (androidODLIPages.disclaimers_checkbox_one.isDisplayed()) {
                androidODLIPages.disclaimers_checkbox_one.click();
                log.info("Checkbox selected");

            }

        } catch (Exception e) {
            log.info("Checkbox not Found");
        }
    }

    public void disclaimersCheckboxTwo(){
        try {
            common.secondsDelay(1);
            if(!androidODLIPages.disclaimers_checkbox_two.isSelected()){
                androidODLIPages.disclaimers_checkbox_two.click();

                log.info("Checkbox selected");
            }
        }catch (Exception e){
            log.info("Checkbox not Found");
        }
    }


    public void disclaimersCheckBoxThree (){
        try {
            common.secondsDelay(1);
            if(!androidODLIPages.disclaimers_checkbox_three.isSelected()){
                androidODLIPages.disclaimers_checkbox_three.click();
            }
        }catch (Exception e){
            log.info("Checkbox not Found");
        }
    }


    public void ValidateConfirmButtonIsDisabled(){
        common.secondsDelay(1);
        boolean confirmButton = (androidODLIPages.confirm_button).isEnabled();
        if(confirmButton==false){
            log.info("Confirm Button is Disabled");
        }


    }

    public void ValidateConfirmButtonIsEnabled(){
        common.secondsDelay(1);
        boolean confirmButton = (androidODLIPages.confirm_button).isEnabled();
        Assert.assertTrue(confirmButton);
    }


    public void ClickBackButton(){
       common.secondsDelay(2);
       if(androidODLIPages.back_arrow.isDisplayed()){
           androidODLIPages.back_arrow.click();
       }

    }

   public void ClickBackArrow(){
       common.secondsDelay(3);
       if(androidODLIPages.back_arrow.isDisplayed()){
           androidODLIPages.back_arrow.click();
           common.secondsDelay(2);
       }



   }



    public void ClickConfirmButton(){
        common.secondsDelay(3);
        if (androidODLIPages.confirm_button.isDisplayed()) {
            androidODLIPages.confirm_button.click();
            common.secondsDelay(3);

        }
    }

    public void FinancialHeader(String financialHeader) {
        try {
            common.secondsDelay(1);
            String getFinancialHeader = androidODLIPages.your_information_header.getText();

            if (getFinancialHeader.contains(financialHeader)) {
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



    }
