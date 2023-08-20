package platforms.ui.mobile.ios.StepDefinitions;

import cucumber.api.java.en.Then;
import platforms.ui.mobile.ios.iOSPageObjects.iOSPrepaidBrandSelectionScreen;
import utils.DriverFactory;

public class VAS_IOS_BrandSelection_Steps extends DriverFactory {


    @Then("^choose prepaid brand screen displays$")
    public void choosePrepaidBrandScreenDisplays() {

        assert driver.findElementByXPath(iOSPrepaidBrandSelectionScreen.heading_Xpath).isDisplayed();


    }

}

