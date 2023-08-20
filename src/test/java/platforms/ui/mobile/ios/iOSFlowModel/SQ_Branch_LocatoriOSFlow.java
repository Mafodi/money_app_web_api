package platforms.ui.mobile.ios.iOSFlowModel;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import platforms.ui.mobile.ios.StepDefinitions.SmartQueuingSteps;
import platforms.ui.mobile.ios.iOSPageObjects.SQ_iOS_Screen;
import utils.DriverFactory;

import java.util.List;

public class SQ_Branch_LocatoriOSFlow extends DriverFactory {
    private static Logger log = Logger.getLogger(SmartQueuingSteps.class);
    public SQ_iOS_Screen sq_iOS = new SQ_iOS_Screen((AppiumDriver) driver);

    public MobileElement waitForElement(MobileElement ele) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, 120);
            wait.until(ExpectedConditions.visibilityOf(ele));
        } catch (Exception e) {
            System.out.println(ele + "is not displayed on the web page");
        }
        return ele;
    }

    public void clickGetInTouchButton() {
        sq_iOS.getInTouchButton.click();
    }

    public void clickContinueButton() {
        waitForElement(sq_iOS.continueButton);
        sq_iOS.continueButton.click();
    }

    public void clickLoginButton() {
        sq_iOS.loginButton.click();
    }

    public void clickATMBranchLocator() {
        sq_iOS.atmBranchLocator.click();
    }

    public void clickMoreButton() {
        sq_iOS.viewMoreButton.click();
    }

    public void clickFindNowButton() {
        sq_iOS.findNowButton.click();
    }

    public void clickNextButton() {
        sq_iOS.nextButton.click();
    }

    public void enterLocationSearchBox(String location) {
        sq_iOS.searchBox.sendKeys(location);
    }

    public void clickATMTab() {
        sq_iOS.atmTab.click();
    }

    public void clickBussinessProfile() {
        sq_iOS.bussinessProfile.click();
    }

    public void clickSwitchTabLogin() {
        sq_iOS.switchTabLogin.click();
    }

    public void enterUsername(String username){
        sq_iOS.userNameTextField.sendKeys(username);
        driver.hideKeyboard();
    }

    public void enterPassword(String password){
        sq_iOS.passwordTextField.sendKeys(password);
        driver.hideKeyboard();
    }

    public void clickTCCheckBox(){
        sq_iOS.termConditionCheck.click();
    }

    public void clickLoginButtonOnLoginScreen(){
        sq_iOS.loginButtonOnLoginScreen.click();
    }

    public boolean isHomePageDispalyed(){
        waitForElement(sq_iOS.myAccount);
        return sq_iOS.myAccount.isDisplayed();
    }

    public void clickOk(){
        sq_iOS.homeScreenOk.click();
    }

    public boolean isBranchDetailHeaderDisplayed() {
        waitForElement(sq_iOS.branchDetailsHeader);
        return sq_iOS.branchDetailsHeader.isDisplayed();
    }

    public void selectFromAutoSuggestion(String BranchName) {
        driver.findElementByXPath("//XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[@name=\"Sandton\"]").click();
    }

    public void clickQMaticServiceLabel() throws InterruptedException {
        Thread.sleep(10000);
        waitForElement(sq_iOS.qmaticBranchService);
        sq_iOS.qmaticBranchService.click();
    }

    public String getstatus(){
        return sq_iOS.openStatus.getText();
    }

    public void clickNonQMaticServiceLabel() {
        waitForElement(sq_iOS.branchServices);
        sq_iOS.branchServices.click();
    }

    public void clickOpeningHourLabel() {
        waitForElement(sq_iOS.openingHours);
        sq_iOS.openingHours.click();
    }

    public void clickFeaturesLabel() {
        waitForElement(sq_iOS.features);
        sq_iOS.features.click();
    }

    public boolean isServicesWaitingTimesHeaderDisplayed() {
        waitForElement(sq_iOS.qmaticBranchService);
        return sq_iOS.qmaticBranchService.isDisplayed();
    }

    public boolean isServiceErroMessageDisplayed(){
        waitForElement(sq_iOS.errorMessageServices);
        return sq_iOS.errorMessageServices.isDisplayed();
    }

    public boolean isServicesHeaderDisplayed() {
        waitForElement(sq_iOS.branchServices);
        return sq_iOS.branchServices.isDisplayed();
    }

    public boolean isOpeningHoursDisplayed() {
        waitForElement(sq_iOS.openingHours);
        return sq_iOS.openingHours.isDisplayed();
    }

    public boolean isFeaturesDisplayed() {
        waitForElement(sq_iOS.features);
        return sq_iOS.features.isDisplayed();
    }

    public boolean isGetDirectionsButtonDisplayed() {
        waitForElement(sq_iOS.getDirectionsButton);
        return sq_iOS.getDirectionsButton.isDisplayed();
    }

    public boolean isUberButtonDisplayed() {
        waitForElement(sq_iOS.rideUberButton);
        return sq_iOS.rideUberButton.isDisplayed();
    }

    public void clickFilterIcon() {
        MobileElement map_icon = driver.findElementByXPath("//XCUIElementTypeOther[@name=\"branch_locator_Mapview\"]/XCUIElementTypeOther[1]/XCUIElementTypeButton");
        waitForElement(map_icon);
        if (sq_iOS.filterIcon.isEnabled() == true) {
            sq_iOS.filterIcon.click();
        }
    }

    public void clickOpeningHoursFilter() throws InterruptedException {
        Thread.sleep(8000);
        waitForElement(sq_iOS.openingHourFilterField);
        sq_iOS.openingHourFilterField.click();
    }

    public void selectOpeningHoursFilterValue(String opening_hours) {
        sq_iOS.openingHourFilterFieldValue.click();
    }

    public void selectOpeningHoursFilterValueWithNoResult(String opening_hours) throws InterruptedException {
        Thread.sleep(8000);
        waitForElement(sq_iOS.openingHourFilterFieldValueWithNoResult);
        sq_iOS.openingHourFilterFieldValueWithNoResult.click();
    }

    public void clickInServicesFilter() {
        waitForElement(sq_iOS.inServicesFilter);
        sq_iOS.inServicesFilter.click();
    }

    public void selectInServicesFilterValue(String inServices) {
        sq_iOS.inServicesFilterValue.click();
    }

    public void selectInServicesFirstFilterValue() {
        sq_iOS.inServicesFilterValue.click();
    }

    public void selectInServicesSecondFilterValue() {
        sq_iOS.inServicesSecondFilterValue.click();
    }

    public void selectInServicesThirdFilterValue() {
        sq_iOS.inServicesThirdFilterValue.click();
    }

    public void selectInServicesFourthFilterValue() {
        sq_iOS.inServicesFourthFilterValue.click();
    }

    public void clickBackButton() {
        sq_iOS.backButton.click();
    }

    public void clickFeaturesFilter() {
        waitForElement(sq_iOS.featureFilter);
        sq_iOS.featureFilter.click();
    }

    public void selectFeaturesFilterValue(String features) {
        sq_iOS.featureFilterValue.click();
    }

    public void applyFilterButton() {
        sq_iOS.applyFilterButton.click();
    }

    public boolean isFilterHeaderDisplayed() {
        return sq_iOS.filterHeader.isDisplayed();
    }

    public boolean isNoResultErrorDisplayed() {
        waitForElement(sq_iOS.noResultError);
        return  sq_iOS.noResultError.isDisplayed();
    }

    public boolean isSearchFieldCleared() {
        waitForElement(sq_iOS.searchIcon);
        return  sq_iOS.searchIcon.isDisplayed();
    }

    public boolean isOpeningHoursEmptyFieldDisplayed() {
        waitForElement(sq_iOS.openingHourFilterField);
        return  sq_iOS.openingHourFilterField.isDisplayed();
    }

    public boolean isClearAllServiceDisplayed() {
        waitForElement(sq_iOS.clearAllServiceFilter);
        return  sq_iOS.clearAllServiceFilter.isDisplayed();
    }

    public boolean isInServicesFilterDisplayed() {
        waitForElement(sq_iOS.inServicesFilter);
        return  sq_iOS.inServicesFilter.isDisplayed();
    }

    public void clickClearSearchField(){
        sq_iOS.clearSearchField.click();
    }

    public void clickClearFilter(){
        sq_iOS.clearFilterButton.click();
    }

    public void clickClearAllButton(){
        sq_iOS.clearAllServiceFilter.click();
    }

    public void clickokButton() {
        TouchAction touchAction = new TouchAction(driver);
        touchAction.tap(PointOption.point(20, 78))
                .perform();
        sq_iOS.okButton.click();
    }

    public void clickMoreButtonAfterLogin() {
        waitForElement(sq_iOS.moreButtonMenuAfterLogin);
        sq_iOS.moreButtonMenuAfterLogin.click();
    }

    public void clickMoreButtonBeforeLogin() {
        waitForElement(sq_iOS.moreButtonMenuBeforeLogin);
        sq_iOS.moreButtonMenuBeforeLogin.click();
    }

    public static MobileElement getElement(String xpath) {
        MobileElement element = null;
        try {
            element = driver.findElementByXPath(xpath);
        } catch (Exception e) {
            log.error(e.getMessage());
            System.out.println(e.getMessage());
        }
        return element;
    }

    public void selectLocationFromList(String location) throws InterruptedException {
        waitForElement(sq_iOS.scrollLocationList);
        List<MobileElement> searchlist = driver.findElementsByXPath("//XCUIElementTypeApplication[@name=\"Money\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell");
        if (searchlist.size() > 0) {
            String iterateTask = "//XCUIElementTypeApplication[@name=\"Money\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[";
            System.out.println("List size - " + searchlist.size());
            for (int i = 1; i <= searchlist.size(); i++) {

                String status_Xpath = iterateTask + i + "]" + "/XCUIElementTypeStaticText[" + i + "]";
                String status = getElement(status_Xpath).getText();

                if (status.equalsIgnoreCase(location)) {
                    driver.findElementByXPath(status_Xpath).click();
                }
            }
        }

    }

    public void selectLocationFromListUnAuth(String location) throws InterruptedException {
        waitForElement(sq_iOS.scrollLocationListUnAuth);
        List<MobileElement> searchlist = driver.findElementsByXPath("//XCUIElementTypeApplication[@name=\"Money\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell");
        if (searchlist.size() > 0) {
            String iterateTask = "//XCUIElementTypeApplication[@name=\"Money\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[";
            System.out.println("List size - " + searchlist.size());
            for (int i = 1; i <= searchlist.size(); i++) {

                String status_Xpath = iterateTask + i + "]" + "/XCUIElementTypeStaticText[" + i + "]";
                String status = getElement(status_Xpath).getText();

                if (status.equalsIgnoreCase(location)) {
                    driver.findElementByXPath(status_Xpath).click();
                }
            }
        }

    }

    public boolean isLocationAppearanceUnAuth(String location) throws InterruptedException {
        waitForElement(sq_iOS.scrollLocationListUnAuth);
        List<MobileElement> searchlist = driver.findElementsByXPath("//XCUIElementTypeApplication[@name=\"Money\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell");
        if (searchlist.size() > 0) {
            String iterateTask = "//XCUIElementTypeApplication[@name=\"Money\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[";
            System.out.println("List size - " + searchlist.size());
            for (int i = 1; i <= searchlist.size(); i++) {

                String status_Xpath = iterateTask + i + "]" + "/XCUIElementTypeStaticText[" + i + "]";
                String status = getElement(status_Xpath).getText();

                if (status.equalsIgnoreCase(location)) {
                    break;
                }
            }
        }
        return true;
    }

    public boolean isLocationAppearance(String location) throws InterruptedException {
        waitForElement(sq_iOS.scrollLocationList);
        List<MobileElement> searchlist = driver.findElementsByXPath("//XCUIElementTypeApplication[@name=\"Money\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell");
        if (searchlist.size() > 0) {
            String iterateTask = "//XCUIElementTypeApplication[@name=\"Money\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[";
            System.out.println("List size - " + searchlist.size());
            for (int i = 1; i <= searchlist.size(); i++) {

                String status_Xpath = iterateTask + i + "]" + "/XCUIElementTypeStaticText[" + i + "]";
                String status = getElement(status_Xpath).getText();

                if (status.equalsIgnoreCase(location)) {
                    break;
                }
            }
        }
    return true;
    }


    public void selectBranchFromMap(String branch) throws InterruptedException {
        waitForElement(sq_iOS.mapView);
        List<MobileElement> mapList = driver.findElementsByXPath("//XCUIElementTypeOther[@name=\"branch_locator_Mapview\"]/XCUIElementTypeOther[1]/XCUIElementTypeButton");
        if (mapList.size() > 0) {

            for (int i = 1; i <= mapList.size(); i++) {

                String status_xpath = "//XCUIElementTypeOther[@name=\"branch_locator_Mapview\"]/XCUIElementTypeOther[1]/XCUIElementTypeButton";
                String status = driver.findElementByXPath("//XCUIElementTypeOther[@name=\"branch_locator_Mapview\"]/XCUIElementTypeOther[1]/XCUIElementTypeButton").getAttribute("label");

                if (status.equalsIgnoreCase(branch)) {
                    driver.findElementByXPath(status_xpath).click();
                }
            }
        }
    }
}
