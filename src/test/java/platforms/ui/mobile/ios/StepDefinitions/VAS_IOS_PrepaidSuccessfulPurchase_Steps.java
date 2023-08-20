package platforms.ui.mobile.ios.StepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import platforms.ui.mobile.ios.iOSPageObjects.iOSOverviewScreen;
import platforms.ui.mobile.ios.iOSPageObjects.iOSPrepaidBrandSelectionScreen;
import platforms.ui.mobile.ios.iOSPageObjects.iOSVASPurchaseSuccessfulScreen;
import utils.DriverFactory;

import java.util.concurrent.TimeUnit;

public class VAS_IOS_PrepaidSuccessfulPurchase_Steps extends DriverFactory {

    iOSOverviewScreen overviewScreen= new iOSOverviewScreen(driver);

    WebDriverWait wait = new WebDriverWait(getIOSDriver(),80);

    @When("^User chooses \"([^\"]*)\" on  Purchase Success$")
    public void userChoosesOnPurchaseSuccess(String buttonName) {

        if (buttonName.equalsIgnoreCase("Finish")) {

            driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

            MobileElement finishButton = driver.findElementByAccessibilityId(iOSVASPurchaseSuccessfulScreen.finishButtonAccessibilityID);
            finishButton.click();

        }

        else if (buttonName.equalsIgnoreCase("New Purchase")) {

            driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

            MobileElement newPurchaseButton = driver.findElementByXPath(iOSVASPurchaseSuccessfulScreen.NewPurchase_Xpath);
            newPurchaseButton.click();

        }

    }


    @Then("^User is directed to Dashboard$")
    public void userIsDirectedToDashboard() {

        assert overviewScreen.Overview_MyAccount.isDisplayed();
    }

    @Then("^User is directed to Choose Prepaid Brand Screen$")
    public void userIsDirectedToChoosePrepaidBrandScreen() {

        assert driver.findElementByXPath(iOSPrepaidBrandSelectionScreen.heading_Xpath).isDisplayed();
    }
}

