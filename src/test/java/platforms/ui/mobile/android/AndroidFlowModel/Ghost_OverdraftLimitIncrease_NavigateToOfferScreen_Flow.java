package platforms.ui.mobile.android.AndroidFlowModel;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.ui.WebDriverWait;
import platforms.ui.mobile.android.AndroidCommonMethods;
import platforms.ui.mobile.ios.PageFactoryObject;
import platforms.ui.mobile.android.AndroidPageObjects.Android_Ghost_OverdraftLimitIncreaseObjects;
import utils.CommonFunctions;
import utils.DriverFactory;

public class Ghost_OverdraftLimitIncrease_NavigateToOfferScreen_Flow extends DriverFactory {

    private static Logger log = Logger.getLogger(Ghost_OverdraftLimitIncrease_NavigateToOfferScreen_Flow.class);
    PageFactoryObject pageFactoryObj = new PageFactoryObject(driver);
    WebDriverWait wait = new WebDriverWait(driver, 60);
    Android_Ghost_OverdraftLimitIncreaseObjects androidODLIPages = new Android_Ghost_OverdraftLimitIncreaseObjects(driver);
    private AndroidCommonMethods basePage = new AndroidCommonMethods();
    private CommonFunctions common = new CommonFunctions();
    //NavigateToOffers

    public void clickPulsatingIcon() {

        try {
            common.secondsDelay(3);
            (androidODLIPages.Pulsating_Icon1).click();
            log.info("pulsating icon clicked");
        } catch (Exception e) {
            (androidODLIPages.Pulsating_Icon).click();
            log.info("pulsating icon clicked");
        }
    }


    public void selectOverdraftOffer() {
        try{
            common.secondsDelay(3);
            (androidODLIPages.For_You).click();
            common.secondsDelay(3);
            basePage.android_scroll_down(3);
            if(androidODLIPages.Select_Offer.isDisplayed()){
                androidODLIPages.Select_Offer.click();
                common.secondsDelay(3);
                log.info("Offer selected");
            }
        }catch (Exception e){
            log.info("Offer Not available");
        }



    }





}
