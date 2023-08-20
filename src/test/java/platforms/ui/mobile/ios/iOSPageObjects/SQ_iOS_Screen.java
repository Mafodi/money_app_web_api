package platforms.ui.mobile.ios.iOSPageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;
import utils.DriverFactory;

public class SQ_iOS_Screen extends DriverFactory {

    public SQ_iOS_Screen(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    //*******************  Locators ************************

    @iOSXCUITFindBy(xpath="//XCUIElementTypeButton[@name=\"Get in touch\"]")
    public MobileElement getInTouchButton;

    @iOSXCUITFindBy(xpath="//XCUIElementTypeButton[@name=\"Continue\"]")
    public MobileElement continueButton;

    @iOSXCUITFindBy(accessibility="Allow")
    public MobileElement allow;

    @iOSXCUITFindBy(accessibility="Allow Once")
    public MobileElement allowOnce;

    @iOSXCUITFindBy(accessibility="Don’t Allow")
    public MobileElement doNotAllow;

    @iOSXCUITFindBy(accessibility="Log in")
    public MobileElement loginButton;

    @iOSXCUITFindBy(accessibility="ATM and branch locator")
    public MobileElement atmBranchLocator;

    @iOSXCUITFindBy(xpath="//XCUIElementTypeButton[@name=\"View more\"]")
    public MobileElement viewMoreButton;

    @iOSXCUITFindBy(accessibility="Find the nearest branch or ATM")
    public MobileElement findNearestBranchATMText;

    @iOSXCUITFindBy(accessibility="Find now")
    public MobileElement findNowButton;

    @iOSXCUITFindBy(accessibility="Next")
    public MobileElement nextButton;

    @iOSXCUITFindBy(accessibility="branch_locator_search")
    public MobileElement searchBox;

    @iOSXCUITFindBy(accessibility="ATM")
    public MobileElement atmTab;

    @iOSXCUITFindBy(accessibility="Business profile")
    public MobileElement bussinessProfile;

    @iOSXCUITFindBy(accessibility="Nedbank ID")
    public MobileElement switchTabLogin;

    @iOSXCUITFindBy(accessibility="Branch Information")
    public MobileElement branchDetailsHeader;

    @iOSXCUITFindBy(accessibility="Service waiting times")
    public MobileElement qmaticBranchService;

    @iOSXCUITFindBy(accessibility="Only 3 services can be selected. Please amend the selection")
    public MobileElement errorMessageServices;

    @iOSXCUITFindBy(accessibility="Services")
    public MobileElement branchServices;

    @iOSXCUITFindBy(accessibility="Opening hours")
    public MobileElement openingHours;

    @iOSXCUITFindBy(accessibility="Features")
    public MobileElement features;

    @iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name=\"Get Directions\"]")
    public MobileElement getDirectionsButton;

    @iOSXCUITFindBy(accessibility="Ride there with Uber")
    public MobileElement rideUberButton;

    @iOSXCUITFindBy(accessibility="filterIcon")
    public MobileElement filterIcon;

    @iOSXCUITFindBy(xpath="//XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[@name=\"Select an option\"]")
    public MobileElement openingHourFilterField;

    @iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name=\"Open Saturdays\"]")
    public MobileElement openingHourFilterFieldValue;

    @iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name=\"Open Sundays\"]")
    public MobileElement openingHourFilterFieldValueWithNoResult;

    @iOSXCUITFindBy(xpath="//XCUIElementTypeButton[@name=\"left_button\"]")
    public MobileElement backButton;

    @iOSXCUITFindBy(xpath="//XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[@name=\"Select an option\"]")
    public MobileElement inServicesFilter;

    @iOSXCUITFindBy(accessibility="Account enquiry")
    public MobileElement inServicesFilterValue;

    @iOSXCUITFindBy(accessibility="New accounts and advice")
    public MobileElement inServicesSecondFilterValue;

    @iOSXCUITFindBy(accessibility="Bulk teller")
    public MobileElement inServicesThirdFilterValue;

    @iOSXCUITFindBy(accessibility="Card/Collection")
    public MobileElement inServicesFourthFilterValue;

    @iOSXCUITFindBy(accessibility="Clear all")
    public MobileElement clearAllServiceFilter;

    @iOSXCUITFindBy(xpath="//XCUIElementTypeTable/XCUIElementTypeCell[3]/XCUIElementTypeStaticText[@name=\"Select an option\"]")
    public MobileElement featureFilter;

    @iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name=\"Deposit taking ATM\"]")
    public MobileElement featureFilterValue;

    @iOSXCUITFindBy(xpath="//XCUIElementTypeTable/XCUIElementTypeButton[@name=\"Apply filters\"]")
    public MobileElement applyFilterButton;

    @iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name=\"Filter\"]")
    public MobileElement filterHeader;

    @iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name=\"No Result Found\"]")
    public MobileElement noResultError;

    @iOSXCUITFindBy(xpath="//XCUIElementTypeButton[@name=\"searchClose\"]")
    public MobileElement clearSearchField;

    @iOSXCUITFindBy(xpath="//XCUIElementTypeButton[@name=\"Clear filters\"]")
    public MobileElement clearFilterButton;

    @iOSXCUITFindBy(xpath="//XCUIElementTypeButton[@name=\"search\"]")
    public MobileElement searchIcon;

    @iOSXCUITFindBy(accessibility="OK")
    public MobileElement okButton;

    @iOSXCUITFindBy(accessibility="More Options")
    public MobileElement moreButtonMenuAfterLogin;

    @iOSXCUITFindBy(accessibility="More")
    public MobileElement moreButtonMenuBeforeLogin;

    @iOSXCUITFindBy(xpath="//XCUIElementTypeApplication[@name=\"Money\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable")
    public MobileElement scrollLocationList;

    @iOSXCUITFindBy(xpath="//XCUIElementTypeApplication[@name=\"Money\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell")
    public MobileElement scrollLocationListUnAuth;

    @iOSXCUITFindBy(xpath="//XCUIElementTypeOther[@name=\"branch_locator_Mapview\"]")
    public MobileElement mapView;

    @iOSXCUITFindBy(accessibility="The branch is: OPEN until 15:00")
    public MobileElement openStatus;

    @iOSXCUITFindBy(accessibility="Username")
    public MobileElement userNameTextField;

    @iOSXCUITFindBy(accessibility="Password")
    public MobileElement passwordTextField;

    @iOSXCUITFindBy(accessibility="checkBoxOff")
    public MobileElement termConditionCheck;

    @iOSXCUITFindBy(accessibility="Next")
    public MobileElement loginButtonOnLoginScreen;

    @iOSXCUITFindBy(accessibility="My accounts")
    public MobileElement myAccount;

    @iOSXCUITFindBy(accessibility="Page Control")
    public MobileElement homeScreenOk;

}
