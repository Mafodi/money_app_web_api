package platforms.ui.mobile.ios.StepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.Keys;
import platforms.ui.mobile.ios.iOSPageObjects.iOSVASPrePaidPurchaseDetailsScreen;
import platforms.ui.mobile.ios.iOSPageObjects.iOSVASPurchaseDetailsScreen;
import platforms.ui.mobile.ios.iOSPageObjects.iOSVASRecipientListScreen;
import utils.DriverFactory;

public class VAS_IOS_Purchase_Details_Steps extends DriverFactory {

    iOSVASPurchaseDetailsScreen purchaseDetailsScreen = new iOSVASPurchaseDetailsScreen(driver);


    @And("^User chooses \"([^\"]*)\" button on Purchase Details Screen$")
    public void userChoosesButtonOnBuyAirtimeScreen(String arg0) {

        MobileElement nextButton = driver.findElementByXPath(iOSVASPrePaidPurchaseDetailsScreen.Next_Button_Xpath);
        nextButton.click();

    }


    @And("^User searches for \"([^\"]*)\" in Recipient List Screen$")
    public void userSearchesForInRecipientListScreen(String searchName){

        MobileElement recipientSearchBox = driver.findElementByXPath(iOSVASRecipientListScreen.searchRecipient_Xpath);
        recipientSearchBox.sendKeys(Keys.ENTER);
        recipientSearchBox.sendKeys(searchName);
        recipientSearchBox.sendKeys(Keys.ENTER);

    }

    @And("^User selects the Recipient$")
    public void userSelectsTheRecipient() {

        MobileElement searchedName = driver.findElementByXPath(iOSVASRecipientListScreen.recipientSelected_xpath);
        searchedName.click();
    }
}
