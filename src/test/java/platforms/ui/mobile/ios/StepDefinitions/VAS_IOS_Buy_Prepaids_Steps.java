package platforms.ui.mobile.ios.StepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import platforms.ui.mobile.android.AndroidPageObjects.VAS_Prepaid_AndroidObjects;
import platforms.ui.mobile.ios.iOSPageObjects.*;
import utils.DriverFactory;

import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

public class VAS_IOS_Buy_Prepaids_Steps extends DriverFactory {

    WebDriverWait wait = new WebDriverWait(getIOSDriver(),80);


    @And("^User chooses \"([^\"]*)\" to buy a prepaid product for$")
    public void ChoosePrepaidBrand(String prepaidBrandSelection){

        switch (prepaidBrandSelection) {

            case "CellC":

                MobileElement cellCBrandImage = driver.findElementByXPath(iOSPrepaidBrandSelectionScreen.CellCXpath);
                //driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
                cellCBrandImage.click();
               // driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
                break;


            case "Vodacom":

                MobileElement vodacomBrandImage = driver.findElementByXPath(iOSPrepaidBrandSelectionScreen.Vodacom_Xpath);
                driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
                vodacomBrandImage.click();
                driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
                break;

            case "MTN":

                MobileElement mtnBrandImage = driver.findElementByXPath(iOSPrepaidBrandSelectionScreen.MTN_Xpath);
                driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
                mtnBrandImage.click();
                driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
                break;

            case "Telkom":

                MobileElement telkomBrandImage = driver.findElementByXPath(iOSPrepaidBrandSelectionScreen.Telkom_Xpath);
                driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
                telkomBrandImage.click();
                driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
                break;

            case "Virgin Mobile":

                MobileElement virginBrandImage = driver.findElementByXPath(iOSPrepaidBrandSelectionScreen.Virgin_Xpath);
                driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
                virginBrandImage.click();
                driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
                break;






        }

    }

    @And("^User chooses \"([^\"]*)\" to top up airtime$")
    public void SelectAirTimeTopUpAirtime(String arg0) {

        MobileElement ownAmountSelection = driver.findElementByAccessibilityId(iOSVASPrePaidOwnAmountScreen.OwnAmount_Access_AccessibilityID);
        ownAmountSelection.click();

    }

    @And("^User enters \"([^\"]*)\" to Top Up airtime$")
    public void userEntersToTopUpAirtime(String amount) {

        MobileElement amountField = driver.findElementByAccessibilityId(iOSVASPrePaidOwnAmountScreen.ownAmountAccessibiltyID);
        amountField.sendKeys(amount);
        amountField.sendKeys(Keys.ENTER);
        //MobileElement amountLabel = driver.findElementByAccessibilityId(iOSVASPrePaidOwnAmountScreen.AmountLabel_AccessibilityID);

        //driver.hideKeyboard();




    }

    @And("^User chooses \"([^\"]*)\" button on Own Amount Screen$")
    public void SelectButtonOwnAmount(String arg0) {

        MobileElement nextButton = driver.findElementByXPath(iOSVASPrePaidOwnAmountScreen.nextButtonXpath);
        nextButton.click();

    }

    @And("^User chooses \"([^\"]*)\" on Buy Prepaid screen$")
    public void userChoosesOnBuyPrepaidScreen(String arg0) {

        MobileElement nextButtonBuyScreen = driver.findElementByXPath(iOSVASPrepaidBuyScreen.nextButtonBuyPrepaid);
        nextButtonBuyScreen.click();
    }

    @And("^User chooses \"([^\"]*)\" on Review Details Screen$")
    public void userChoosesOnReviewDetailsScreen(String arg0) {

        MobileElement buyButton = driver.findElementByXPath(iOSVASReviewDetailsScreen.buyButtonReviewDetailsScreenXpath);
        buyButton.click();
    }

    @Then("^Purchase Successful screen displays$")
    public void purchaseSuccessfulScreenDisplays() {

        assert driver.findElementByAccessibilityId(iOSVASPurchaseSuccessfulScreen.finishButtonAccessibilityID).isDisplayed();



    }

    @Then("^Prepaid Carousel should display$")
    public void prepaidCarouselShouldDisplay() {

        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

        assert driver.findElementByXPath(iOSVASPrepaidCarouselScreens.carousel_xpath).isDisplayed();
    }

    @When("^User clicks on Select from Recipients Button$")
    public void userClicksOnSelectFromRecipientsButton() {

       // MobileElement selectFromRecipientButton = driver.findElementByXPath(iOSVASPrePaidPurchaseDetailsScreen.SelectRepNew_Xpath);
       // selectFromRecipientButton.click();
       // driver.findElementByXPath("//XCUIElementTypeTable/XCUIElementTypeOther[3]/XCUIElementTypeOther[1]/XCUIElementTypeButton").click();
        MobileElement saveRecToggle = driver.findElementByXPath(iOSVASPrePaidPurchaseDetailsScreen.SaveRec_Xpath);
        saveRecToggle.click();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }





    @And("^User chooses \"([^\"]*)\" from data list$")
    public void userChoosesFromDataList(String cellCDataList){

        switch (cellCDataList) {

            case "Daily 5MB":
                 driver.findElementByAccessibilityId(IOSVASPrepaidProductSelectionScreen.CellData_AccessID).click();

        }

    }

    @And("^User selects Data for CellC$")
    public void userSelectsDataForCellC() {

        driver.findElementByXPath("(//XCUIElementTypeCell[@name='Cell C'])[1]").click();

        ///MobileElement cellCData = driver.findElementByXPath(iOSVASProductCategorySelectionScreen.CellCData_Xpath);

        /*if(cellCData.isDisplayed()) {
            cellCData.click();*/

    }



    @Then("^list of Recipients screen opens up$")
    public void listOfRecipientsScreenOpensUp() {

        assert driver.findElementByXPath(iOSVASRecipientListScreen.searchRecipientLabel_Xpath).isDisplayed();


    }

    @And("^User chooses Next on Carousel screen one$")
    public void userChoosesNextOnCarouselScreenOne() {

        MobileElement nextButton  = driver.findElementByXPath(iOSVASPrepaidCarouselScreens.Next_Button_Xpath);
        nextButton.click();

    }

    @When("^User chooses Get Started Button$")
    public void userChoosesGetStartedButton() {

        MobileElement nextButton  = driver.findElementByXPath(iOSVASPrepaidCarouselScreens.GetStartedButton_Xpath);
        nextButton.click();
    }

    @Then("^User is taken to choose Prepaid Brand Screen$")
    public void userIsTakenToChoosePrepaidBrandScreen() {

        assert driver.findElementByXPath(iOSPrepaidBrandSelectionScreen.heading_Xpath).isDisplayed();
    }

    @And("^User chooses Data to buy$")
    public void userChoosesDataToBuy() {

        driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);

        driver.findElementByAccessibilityId("Data").click();
        driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
    }


    @And("^User toggles Save Recipient on$")
    public void userTogglesSaveRecipientOn() {

        driver.findElementByXPath("//XCUIElementTypeSwitch[@value='0']").click();
    }

    @And("^User enters \"([^\"]*)\" for Recipient Name$")
    public void userEntersForRecipientName(String recipientName) {

        MobileElement recipientNamefield = driver.findElementByXPath(iOSVASPrePaidPurchaseDetailsScreen.RecipientName_Xpath);
        recipientNamefield.sendKeys(recipientName);
        recipientNamefield.sendKeys(Keys.ENTER);

    }
}
