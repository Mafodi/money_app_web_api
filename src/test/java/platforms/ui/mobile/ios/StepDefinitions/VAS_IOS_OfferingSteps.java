package platforms.ui.mobile.ios.StepDefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.MobileElement;
import platforms.ui.mobile.ios.iOSPageObjects.IOSVASOfferingScreen;
import platforms.ui.mobile.ios.iOSPageObjects.IOSVASVoucherCarouselScreens;
import utils.DriverFactory;

import java.util.concurrent.TimeUnit;

public class VAS_IOS_OfferingSteps extends DriverFactory {

    @When("^User chooses \"([^\"]*)\" on Vas Offering Screen$")
    public void userChoosesOnVasOfferingScreen(String offerringType) {

        switch (offerringType) {

            case "Buy gift voucher":

                MobileElement buyVouchersButton = driver.findElementByAccessibilityId(IOSVASOfferingScreen.BUY_VOUCHERS_ACCESSIBILITYID);
                buyVouchersButton.click();
                break;

            case "Buy prepaid data, airtime or SMSs":

                MobileElement buyPrepaidLink = driver.findElementByXPath(IOSVASOfferingScreen.PrePaids_Xpath);
                buyPrepaidLink.click();
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                break;


        }



       // MobileElement buyVouchersButton = driver.findElementByAccessibilityId(IOSVASOfferingScreen.BUY_VOUCHERS_ACCESSIBILITYID);




    }

    @Then("^first time use Carousel screen appears$")
    public void firstTimeUseCarouselScreenAppears() {

//        String expectedValue = VASIOSDataFactory.CarouselScreen1Text;
//
//        MobileElement actualValue = driver.findElementByAccessibilityId(IOSVASVoucherCarouselScreens.CarouselScreen1Text_AccessibilityID);
//        actualValue.getText();
//
//        Assert.assertTrue(expectedValue.equals(actualValue));

        //assert driver.findElementByAccessibilityId(IOSVASVoucherCarouselScreens.CarouselScreen1Image_AccessibilityID).isDisplayed();
        assert driver.findElementByXPath(IOSVASVoucherCarouselScreens.CarouselScreenXpath).isDisplayed();
    }

    @When("^User taps on IOS Back button$")
    public void userTapsOnIOSBackButton() {

        MobileElement backButton = driver.findElementByAccessibilityId(IOSVASVoucherCarouselScreens.Back_Button_AccessibilityID);
        backButton.click();
    }


}
