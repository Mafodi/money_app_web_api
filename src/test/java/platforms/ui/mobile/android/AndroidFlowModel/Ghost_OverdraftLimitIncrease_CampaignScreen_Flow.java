package platforms.ui.mobile.android.AndroidFlowModel;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import platforms.ui.mobile.android.AndroidCommonMethods;
import platforms.ui.mobile.ios.PageFactoryObject;
import platforms.ui.mobile.android.AndroidPageObjects.Android_Ghost_OverdraftLimitIncreaseObjects;
import utils.CommonFunctions;
import utils.DriverFactory;

public class Ghost_OverdraftLimitIncrease_CampaignScreen_Flow extends DriverFactory {

    private static Logger log = Logger.getLogger(Ghost_OverdraftLimitIncrease_CampaignScreen_Flow.class);
    PageFactoryObject pageFactoryObj = new PageFactoryObject(driver);
    WebDriverWait wait = new WebDriverWait(driver, 60);
    Android_Ghost_OverdraftLimitIncreaseObjects androidODLIPages = new Android_Ghost_OverdraftLimitIncreaseObjects(driver);
    private AndroidCommonMethods basePage = new AndroidCommonMethods();
    private CommonFunctions common = new CommonFunctions();
    //Campaign

    public void ValidateCampaignHeader (String campaignHeading){

        try {
            common.secondsDelay(3);
            String getheading = androidODLIPages.campaign_header.getText();
            if(getheading.equals(campaignHeading)){
                log.info("Campaign header Verified" + getheading);
            }else {
                log.info("Campaign header not found" + getheading);
                Assert.fail(getheading);
            }
        }catch (Exception e){
            log.info("Campaign header not found");
            Assert.fail(e.getMessage());
        }


    }

    public void ValidateSubHeading(String campaignSubHeading){

        try {
            common.secondsDelay(3);
            String getSubHeading = androidODLIPages.campaign_header_description.getText();
            if(getSubHeading.contains(campaignSubHeading)){
                log.info("Campaign getSubHeading Verified" + getSubHeading);
            }else {
                log.info("Campaign getSubHeading not found" + getSubHeading);
                Assert.fail(getSubHeading);
            }
        }catch (Exception e){
            log.info("Campaign header not found");
            Assert.fail(e.getMessage());
        }


    }


    public void ValidateFeaturesAndBenefitsLabel(String featuresAndBenefitsLabel){

        try {
            common.secondsDelay(3);
            String getfeaturesAndBenefitsLabel = androidODLIPages.features_and_benefits_label.getText();
            if(getfeaturesAndBenefitsLabel.equals(featuresAndBenefitsLabel)){
                log.info("Campaign featuresAndBenefitsLabel Verified" + getfeaturesAndBenefitsLabel);
            }else {
                log.info("Campaign featuresAndBenefitsLabel not found" + getfeaturesAndBenefitsLabel);
                Assert.fail(getfeaturesAndBenefitsLabel);
            }
        }catch (Exception e){
            log.info("Campaign featuresAndBenefitsLabel not found");
            Assert.fail(e.getMessage());
        }


    }

    public void ValidateFirstBenefit(String firstBenefit){
        try {
            common.secondsDelay(3);
            String getfirstBenefit= androidODLIPages.first_benefit.getText();
            if(getfirstBenefit.equals(firstBenefit)){
                log.info("Campaign firstBenefit Verified" + getfirstBenefit);
            }else {
                log.info("Campaign firstBenefit not found" + getfirstBenefit);
                Assert.fail(getfirstBenefit);
            }
        }catch (Exception e){
            log.info("Campaign firstBenefit not found");
            Assert.fail(e.getMessage());
        }


    }

    public void ValidateSecondBenefit(String secondBenefit){

        try {
            common.secondsDelay(3);
            String getSecondBenefit= androidODLIPages.second_benefit.getText();
            if(getSecondBenefit.equals(secondBenefit)){
                log.info("Campaign firstBenefit Verified" + getSecondBenefit);
            }else {
                log.info("Campaign secondBenefit not found" + getSecondBenefit);
                Assert.fail(getSecondBenefit);
            }
        }catch (Exception e){
            log.info("Campaign secondBenefit not found");
            Assert.fail(e.getMessage());
        }

    }

    public void VAliadteThirdBenefit(String ThirdBenefit){

        try {
            common.secondsDelay(3);
            String getSThirdBenefit= androidODLIPages.third_benefit.getText();
            if(getSThirdBenefit.equals(ThirdBenefit)){
                log.info("Campaign firstBenefit Verified" + getSThirdBenefit);
                common.secondsDelay(3);
            }else {
                log.info("Campaign ThirdBenefit not found" + getSThirdBenefit);
                Assert.fail(getSThirdBenefit);
            }
        }catch (Exception e){
            log.info("Campaign ThirdBenefit not found");
            Assert.fail(e.getMessage());
        }


    }

    public void ClickNoThanksButton(){

        try{
            common.secondsDelay(3);
            if(androidODLIPages.no_thanks_button.isDisplayed()){
                androidODLIPages.no_thanks_button.click();
                log.info("No Thanks Button clicked");

                common.secondsDelay(2);
            }
        }catch (Exception e){
            log.info("No Thanks Button not found");
        }

    }


    public void forYourOfferScreen(){
        try{
            common.secondsDelay(3);
            basePage.android_scroll_down(3);

            if(androidODLIPages.Select_Offer.isDisplayed()){
                log.info("On Offers Screen");
                common.secondsDelay(3);
            }

        }catch (Exception e){
            log.info("Offers screen not found");
        }
    }


    public void ClickInterestedButton (){
        try{
            common.secondsDelay(3);
            if(androidODLIPages.Im_Interetsted_button.isDisplayed()){
                androidODLIPages.Im_Interetsted_button.click();
                log.info("I'm Interested Button clicked");

                common.secondsDelay(3);
            }
        }catch (Exception e){
            log.info("I'm Interested not found");
        }


    }


    public void DisclaimersHeader(String disclaimersHeading){
        try{
            common.secondsDelay(3);
            String getDisclaimersHeading = androidODLIPages.lets_get_started_header.getText();
            if (getDisclaimersHeading.equals(disclaimersHeading))
             {
                log.info("On Disclaimers Screen");

            }else{

                log.info("On Disclaimers Not Found");
                common.secondsDelay(3);
            }
        }catch (Exception e){
            log.info("Disclaimers not found");
        }

    }






}
