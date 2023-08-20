package platforms.ui.mobile.android.AndroidFlowModel;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.remote.MobileCapabilityType;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import platforms.ui.mobile.android.AndroidPageObjects.SQ_Android_Screens;
import utils.DriverFactory;
import utils.Utils;

import java.io.File;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;


public class SQ_Branch_LocatorAndroidFlow extends DriverFactory {

    public static final String pckg_name = "za.co.nedbank.qa";
    private static Logger log = Logger.getLogger(DriverFactory.class);
    public static String propertyFile = "./Framework.properties";
    Utils util = new Utils();
    String androidAppLocation = util.getConfigPropertyValue(propertyFile, "AndroidAppLocation") + util.getConfigPropertyValue(propertyFile, "AndroidAppName");
    File androidApp = new File(androidAppLocation);
    public SQ_Android_Screens sq_android = new SQ_Android_Screens((AppiumDriver) driver);
    public static Logger logger = Logger.getLogger(SQ_Branch_LocatorAndroidFlow.class);

    public SQ_Branch_LocatorAndroidFlow(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }


    //*********************** Functions ******************************

    public AppiumDriver getAndroidDriver_PermissionDeniel() {
        AppiumDriver<MobileElement> driver_new = null;
        try {
            PropertyConfigurator.configure("log4j.properties");
            if (driver_new == null) {
                DesiredCapabilities capabilities = setAndroidCapabilities_PermissionDeniel("emulator-5554",
                        "Android", androidApp.getAbsolutePath());
                log.info("Start driver setup");
                driver_new = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
                log.info("App launched successfully");
                log.info("Driver setup successful" + driver);
                driver_new.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            }
        } catch (Exception e) {
            log.info("Unable to load driver! - Exception: " + e.getMessage());
        }
        return driver_new;
    }

    private DesiredCapabilities setAndroidCapabilities_PermissionDeniel(String... args) {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, args[0]);
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, args[1]);
        capabilities.setCapability(MobileCapabilityType.APP, args[2]);
        capabilities.setCapability("appPackage", pckg_name);
        capabilities.setCapability("appActivity", "za.co.nedbank.ui.splashscreen.SplashScreenActivity");

        return capabilities;
    }

    public MobileElement waitForElement(MobileElement ele) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, 60);
            wait.until(ExpectedConditions.visibilityOf(ele));
        } catch (Exception e) {
            System.out.println(ele + "is not displayed on the web page");
        }
        return ele;
    }

    public MobileElement waitForElementToClickable(MobileElement ele) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, 60);
            wait.until(ExpectedConditions.elementToBeClickable(ele));
        } catch (Exception e) {
            System.out.println(ele + "is not displayed on the web page");
        }
        return ele;
    }

    public void clickPageIndicator() {
        try {
            waitForElement(sq_android.overViewScreen);
            sq_android.overViewScreen.click();
            System.out.println("User is able to land on to the overview screen");
        } catch (Exception e) {
            System.out.println("User unable to land on to the overview screen");
            throw e;
        }
    }

    public void clickloginButton() {
        waitForElement(sq_android.loginButton);
        sq_android.loginButton.click();
    }

    public void clickBusinessProfile() {
        waitForElement(sq_android.businessProfile);
        sq_android.businessProfile.click();
    }

    public void clickSwitchTab() {
        waitForElement(sq_android.tabNedbankID);
        sq_android.tabNedbankID.click();
    }

    public void clickMenuFooter() throws InterruptedException {
        try {
            WebDriverWait wait = new WebDriverWait(driver, 200);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@text='More']")));
            sq_android.menuItemOptionOnFooter.click();
            System.out.println("User is able to click on to the Menu footer");
        } catch (Exception e) {
            System.out.println("User unable to to click on to the Menu footer");
            throw e;
        }
    }

    public void clickGetInTouch() {
        try {
            waitForElement(sq_android.getInTouchMenuOption);
            sq_android.getInTouchMenuOption.click();
            System.out.println("User is able to click on to Get In Touch");
        } catch (Exception e) {
            System.out.println("User unable to to click on to Get In Touch");
            throw e;
        }
    }

    public void clickFindNowButton() {
        try {
            waitForElement(sq_android.findNowButton);
            sq_android.findNowButton.click();
            System.out.println("User is able to click on Find Now Button");
        } catch (Exception e) {
            System.out.println("User unable to to click on Find Now Button");
            throw e;
        }
    }

    public void clickNextButton() {
        try {
            waitForElement(sq_android.nextButtonDataUsagePopUp);
            sq_android.nextButtonDataUsagePopUp.click();
            System.out.println("User is able to click on Next Button");
        } catch (Exception e) {
            System.out.println("User unable to to click on Next Button");
            throw e;
        }
    }

    public boolean filterButtonExistance() {
        waitForElement(sq_android.filterButton);
        return sq_android.filterButton.isDisplayed();
    }

    public void enterLocation(String location) {
        waitForElement(sq_android.searchBar);
        sq_android.searchBar.sendKeys(location);
    }

    public void clickCloseButton() {
        waitForElement(sq_android.closeButton);
        sq_android.closeButton.click();
    }

    public void selectLocationFromList(String location) throws InterruptedException {
        waitForElement(sq_android.scrollLocationList);
        List<MobileElement> ele = driver.findElements(By.xpath("//android.widget.ScrollView//android.widget.LinearLayout//android.widget.LinearLayout//android.widget.TextView[@index='0']"));
        for (int i = 0; i < ele.size(); i++) {
            System.out.println(ele.size());
            if (ele.get(i).getText().equalsIgnoreCase(location)) {
                ele.get(i).click();
                break;
            }
        }
    }

    public boolean autosuggestionAppearance(String location) throws InterruptedException {
        waitForElement(sq_android.scrollLocationList);
        List<MobileElement> ele = driver.findElements(By.xpath("//android.widget.ScrollView//android.widget.LinearLayout//android.widget.LinearLayout//android.widget.TextView[@index='0']"));
        for (int i = 0; i < ele.size(); i++) {
            System.out.println(ele.size());
            if (ele.get(i).getText().equalsIgnoreCase(location)) {
                break;
            }
        }
        return true;
    }

    public String autosuggestionDisappearance() {
        return sq_android.searchBar.getText();
    }

    public void clickClearFilterButton() {
        sq_android.clearFilterButton.click();
    }

    public boolean isOpeningHoursFilterCleared() {
        return sq_android.clearedOpeningHourFilterField.isDisplayed();
    }

    public boolean isServicesFilterCleared() {
        return sq_android.clearedServicesFilterField.isDisplayed();
    }

    public void selectBranchFromMap(String branch) throws InterruptedException {
        waitForElement(sq_android.list);
        Thread.sleep(4000);
        List<MobileElement> ele = driver.findElements(By.xpath("//android.view.View[@content-desc='Google Map']/android.view.View"));
        for (int i = 0; i < ele.size(); i++) {
            System.out.println("Element size is " + ele.size());
            String actual = ele.get(i).getAttribute("content-desc");
            if ((ele.get(i).getAttribute("content-desc")).equalsIgnoreCase(branch + ". ")) {
                ele.get(i).click();
                break;
            }
        }
    }

    public boolean BranchesOnMapAppearance(String branch) throws InterruptedException {
        waitForElement(sq_android.list);
        Thread.sleep(4000);
        List<MobileElement> ele = driver.findElements(By.xpath("//android.view.View[@content-desc='Google Map']//android.view.View"));
        for (int i = 0; i < ele.size(); i++) {
            System.out.println(ele.size());
            System.out.println(ele.get(i).getAttribute("content-desc"));
            if ((ele.get(i).getAttribute("content-desc")).equals(branch + ". ")) {
                break;
            }
        }
        return true;
    }

    public void selectATMFromMap(String atmName) throws InterruptedException {
        waitForElement(sq_android.list);
        Thread.sleep(4000);
        List<MobileElement> ele = driver.findElements(By.xpath("//android.view.View[@content-desc='Google Map']//android.view.View"));
        for (int i = 0; i < ele.size(); i++) {
            System.out.println(ele.size());
            if ((ele.get(i).getAttribute("content-desc")).equalsIgnoreCase(atmName + ". ")) {
                ele.get(i).click();
                break;
            }
        }
    }

    public boolean ATMOnMapAppearance(String atmName) throws InterruptedException {
        waitForElement(sq_android.list);
        Thread.sleep(4000);
        List<MobileElement> ele = driver.findElements(By.xpath("//android.view.View[@content-desc='Google Map']//android.view.View"));
        for (int i = 0; i < ele.size(); i++) {
            System.out.println(ele.size());
            if ((ele.get(i).getAttribute("content-desc")).equalsIgnoreCase(atmName + ". ")) {
                break;
            }
        }
        return true;
    }

    public String getActualBranch() {
        waitForElement(sq_android.branchPlaceName);
        return sq_android.branchPlaceName.getText();
    }

    public void clickonPocketPopUp(){
        waitForElement(sq_android.ENROLMENT_WELCOME_SCREEN);
        sq_android.ENROLMENT_WELCOME_SCREEN.click();
    }

    public boolean branchStatusIsDisplayed() {
        waitForElement(sq_android.branchStatus);
        return sq_android.branchStatus.isDisplayed();
    }

    public boolean branchAddressIsDisplayed() {
        waitForElement(sq_android.branchAddress);
        return sq_android.branchAddress.isDisplayed();
    }

    public boolean branchDistanceIsDisplayed() {
        waitForElement(sq_android.branchDistance);
        return sq_android.branchDistance.isDisplayed();
    }

    public boolean branchPlaceCodeIsDisplayed() {
        waitForElement(sq_android.branchPlaceCode);
        return sq_android.branchPlaceCode.isDisplayed();
    }

    public boolean branchPhoneisDisplayed() {
        waitForElement(sq_android.branchPhone);
        return sq_android.branchPhone.isDisplayed();
    }

    public boolean branchEmailisDisplayed() {
        waitForElement(sq_android.branchEmail);
        return sq_android.branchEmail.isDisplayed();
    }

    public boolean branchOpeningHoursisDisplayed() {
        waitForElement(sq_android.branchOpeningHours);
        return sq_android.branchOpeningHours.isDisplayed();
    }

    public boolean branchFeatureisDisplayed() {
        waitForElement(sq_android.branchFeature);
        return sq_android.branchFeature.isDisplayed();
    }

    public boolean branchServiceisDisplayed() {
        waitForElement(sq_android.branchService);
        return sq_android.branchService.isDisplayed();
    }

    public void clickBackButton() {
        waitForElement(sq_android.backButton);
        sq_android.backButton.click();
    }

    public void clickbranchOpeningHours() {
        waitForElement(sq_android.branchOpeningHours);
        sq_android.branchOpeningHours.click();
    }

    public void clickFeatures() {
        waitForElement(sq_android.branchFeature);
        sq_android.branchFeature.click();
    }

    public void clickInServices() {
        waitForElement(sq_android.branchService);
        sq_android.branchService.click();
    }

    public String checkStatus() {
        waitForElement(sq_android.branchStatus);
        return sq_android.branchStatus.getText();
    }

    public boolean verifyOpeningHoursScreen() {
        waitForElement(sq_android.openingHoursHeader);
        return sq_android.openingHoursHeader.isDisplayed();
    }

    public boolean verifyFeaturesScreen() {
        waitForElement(sq_android.featuresHeader);
        return sq_android.featuresHeader.isDisplayed();
    }

    public boolean verifyInBranchScreen() {
        waitForElement(sq_android.inBranchServicesHeader);
        return sq_android.inBranchServicesHeader.isDisplayed();
    }

    public boolean verifyInBranchScreenWaitingTimes() {
        waitForElement(sq_android.inBranchServicesWaitingTimesHeader);
        return sq_android.inBranchServicesWaitingTimesHeader.isDisplayed();
    }

    public boolean searchBarisDisplayed() {
        waitForElement(sq_android.searchBar);
        return sq_android.searchBar.isDisplayed();
    }

    public void clickFilterButton() {
        waitForElementToClickable(sq_android.filterButton);
        sq_android.filterButton.click();
    }

    public void clickopeningHoursDropdown() {
        waitForElement(sq_android.openingHoursDropdown);
        sq_android.openingHoursDropdown.click();
    }

    public void clickopeningHoursDropdownValue() {
        waitForElement(sq_android.openingHoursDropdownValue);
        sq_android.openingHoursDropdownValue.click();
    }

    public void clickopeningHoursDropdownValueOpenSunday() {
        waitForElement(sq_android.openingHoursDropdownValueOpenSundays);
        sq_android.openingHoursDropdownValueOpenSundays.click();
    }

    public String errorNoResultFound() {
        waitForElement(sq_android.errorNoResultFound);
        return sq_android.errorNoResultFound.getText();
    }

    public void clickServiceDropdown() {
        waitForElement(sq_android.serviceDropdown);
        sq_android.serviceDropdown.click();
    }

    public void clickServiceDropdownValue() {
        waitForElement(sq_android.serviceDropdownValue);
        sq_android.serviceDropdownValue.click();
    }

    public void clickServiceDropdownSecondValue() {
        sq_android.serviceDropdownSecondValue.click();
    }

    public void clickServiceDropdownThirdValue() {
        sq_android.serviceDropdownThirdValue.click();
    }

    public boolean isfilterSelected() {
        return sq_android.clearAllFilter.isDisplayed();
    }

    public void clickServiceDropdownFourthValue() {
        sq_android.serviceDropdownFourthValue.click();
    }

    public boolean serviceFilterErrorMessage() {
        return sq_android.filterServiceErrorMessage.isDisplayed();
    }

    public void clickClearAll() {
        waitForElement(sq_android.clearAllFilter);
        sq_android.clearAllFilter.click();
    }

    public void navigateBack() {
        waitForElement(sq_android.backArrow);
        sq_android.backArrow.click();
    }

    public void clickFacilitiesDropdown() {
        waitForElement(sq_android.facilitiesDropdown);
        sq_android.facilitiesDropdown.click();
    }

    public void clickFacilitiesDropdownValue() {
        waitForElement(sq_android.facilitiesDropdownValue);
        sq_android.facilitiesDropdownValue.click();
    }

    public void clickApplyFilterButton() {
        waitForElement(sq_android.applyFilterButton);
        sq_android.applyFilterButton.click();
    }

    public void clickTopMenu() {
        waitForElement(sq_android.topMenuIcon);
        sq_android.topMenuIcon.click();
    }

    public boolean isFilterApplied() {
        waitForElement(sq_android.filterButton);
        return sq_android.filterButton.isDisplayed();
    }

    public void clickATMTab() {
        waitForElement(sq_android.atmTab);
        sq_android.atmTab.click();
    }

    public String getATMName() {
        waitForElement(sq_android.atmName);
        return sq_android.atmName.getText();
    }

    public boolean atmAddressisDisplayed() {
        waitForElement(sq_android.atmAddress);
        return sq_android.atmAddress.isDisplayed();
    }

    public boolean directionButtonisDisplayed() {
        waitForElement(sq_android.getDirectionButton);
        return sq_android.getDirectionButton.isDisplayed();
    }

    public boolean uberButtonisDisplayed() {
        waitForElement(sq_android.getUberButton);
        return sq_android.getUberButton.isDisplayed();
    }

    public boolean cashIndicatorisDisplayed() {
        waitForElement(sq_android.acceptCashIndicator);
        return sq_android.acceptCashIndicator.isDisplayed();
    }

    public void runBackground() {
        try {
            driver.runAppInBackground(Duration.ofSeconds(4));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
