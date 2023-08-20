package platforms.ui.mobile.android.AndroidPageObjects;

import java.util.List;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import utils.DriverFactory;

public class SQ_Android_Screens extends DriverFactory {

    public static final String pckg_name = "za.co.nedbank.qa";

    public SQ_Android_Screens(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    //*******************  Locators ************************

    @AndroidFindBy(id = pckg_name + ":id/tv_login")
    public MobileElement loginButton;

    @AndroidFindBy(id = pckg_name + ":id/btn_continue")
    public MobileElement continueButton;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='Next']")
    public MobileElement nextButton;

    @AndroidFindBy(id = pckg_name + ":id/nedbank_logo")
    public MobileElement ENROLMENT_WELCOME_SCREEN;

    @AndroidFindBy(id = pckg_name + ":id/menu_item_more")
    public MobileElement menuItemOptionOnHeader;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='Business profile']")
    public MobileElement businessProfile;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Nedbank ID']")
    public MobileElement tabNedbankID;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='More']")
    public MobileElement menuItemOptionOnFooter;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Get in touch']")
    public MobileElement getInTouchMenuOption;

    @AndroidFindBy(id = pckg_name + ":id/find_now")
    public MobileElement findNowButton;

    @AndroidFindBy(id = pckg_name + ":id/btnAction")
    public MobileElement nextButtonDataUsagePopUp;

    @AndroidFindBy(id = pckg_name + ":id/atm_and_branch_filter")
    public MobileElement filterButton;

    @AndroidFindBy(id = pckg_name + ":id/edtInput")
    public MobileElement searchBar;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='Clear filters']")
    public MobileElement clearFilterButton;

    @AndroidFindBy(id = pckg_name + ":id/imgSearch")
    public MobileElement closeButton;

    @AndroidFindBy(xpath = "//android.widget.ScrollView[@index='0']")
    public MobileElement scrollLocationList;

    @AndroidFindBy(id = pckg_name + ":id/atm_and_branches_address_suggestions_container")
    public List<MobileElement> locationList;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc='Google Map'][@index='0']")
    public MobileElement list;

    @AndroidFindBy(id = pckg_name + ":id/place_name")
    public MobileElement branchPlaceName;

    @AndroidFindBy(id = pckg_name + ":id/place_status")
    public MobileElement branchStatus;

    @AndroidFindBy(id = pckg_name + ":id/place_address")
    public MobileElement branchAddress;

    @AndroidFindBy(id = pckg_name + ":id/place_distance")
    public MobileElement branchDistance;

    @AndroidFindBy(id = pckg_name + ":id/place_phone")
    public MobileElement branchPhone;

    @AndroidFindBy(id = pckg_name + ":id/place_email")
    public MobileElement branchEmail;

    @AndroidFindBy(id = pckg_name + ":id/place_code")
    public MobileElement branchPlaceCode;

    @AndroidFindBy(id = pckg_name + ":id/txt_opening_hrs")
    public MobileElement branchOpeningHours;

    @AndroidFindBy(id = pckg_name + ":id/txt_feature")
    public MobileElement branchFeature;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Opening hours']")
    public MobileElement openingHoursHeader;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Features']")
    public MobileElement featuresHeader;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Services']")
    public MobileElement inBranchServicesHeader;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Service waiting times']")
    public MobileElement inBranchServicesWaitingTimesHeader;

    @AndroidFindBy(id = pckg_name + ":id/txt_service")
    public MobileElement branchService;

    @AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc='Navigate up']")
    public MobileElement backButton;

    @AndroidFindBy(id = pckg_name + ":id/tradingday_picker")
    public MobileElement openingHoursDropdown;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Open Saturdays']")
    public MobileElement openingHoursDropdownValue;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Open Sundays']")
    public MobileElement openingHoursDropdownValueOpenSundays;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[@resource-id='za.co.nedbank.qa:id/tradingday_picker'][@index='0']/android.widget.LinearLayout[@index='1']/android.widget.TextView[@text='Select an option']")
    public MobileElement clearedOpeningHourFilterField;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[@resource-id='za.co.nedbank.qa:id/service_picker'][@index='1']/android.widget.LinearLayout[@index='1']/android.widget.TextView[@text='Select an option']")
    public MobileElement clearedServicesFilterField;

    @AndroidFindBy(id = pckg_name + ":id/service_picker")
    public MobileElement serviceDropdown;

    @AndroidFindBy(id = pckg_name + ":id/txvDescription")
    public MobileElement errorNoResultFound;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Account enquiry']")
    public MobileElement serviceDropdownValue;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='New accounts and advice']")
    public MobileElement serviceDropdownSecondValue;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Bulk teller']")
    public MobileElement serviceDropdownThirdValue;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Card/Collection']")
    public MobileElement serviceDropdownFourthValue;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Clear all']")
    public MobileElement clearAllFilter;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Only 3 services can be selected. Please amend the selection']")
    public MobileElement filterServiceErrorMessage;

    @AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc='Navigate up']")
    public MobileElement backArrow;

    @AndroidFindBy(id = pckg_name + ":id/facilities_picker")
    public MobileElement facilitiesDropdown;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Deposit taking ATM']")
    public MobileElement facilitiesDropdownValue;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='Apply filters']")
    public MobileElement applyFilterButton;

    @AndroidFindBy(xpath = "//*[@text='DENY']")
    public MobileElement permissionDeny;

    @AndroidFindBy(id = pckg_name + ":id/overview_page_main_layout")
    public MobileElement overViewScreen;

    @AndroidFindBy(xpath = "//android.widget.CheckBox[@index='0']")
    public MobileElement ACCEPTTerm;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='Next']")
    public MobileElement NEXT_LOGIN;

    @AndroidFindBy(id = pckg_name + ":id/menu_item_more")
    public MobileElement topMenuIcon;

    @AndroidFindBy(id = pckg_name + ":id/data_warning_cancel_button")
    public MobileElement cancelDataWarningButton;

    @AndroidFindBy(xpath = "//android.widget.HorizontalScrollView//android.widget.LinearLayout//*//android.widget.TextView[contains(@text,'ATM')]")
    public MobileElement atmTab;

    @AndroidFindBy(id = pckg_name + ":id/atm_and_branches_details_title")
    public MobileElement atmName;

    @AndroidFindBy(id = pckg_name + ":id/atm_and_branches_details_address")
    public MobileElement atmAddress;

    @AndroidFindBy(id = pckg_name + ":id/atm_and_branches_directions_button")
    public MobileElement getDirectionButton;

    @AndroidFindBy(id = pckg_name + ":id/atm_and_branches_uber_request_button")
    public MobileElement getUberButton;

    @AndroidFindBy(id = pckg_name + ":id/accept_cash_indicator")
    public MobileElement acceptCashIndicator;

    @AndroidFindBy(id = "btn_continue")
    public MobileElement CONTINUE_WITH_THIS_VERSION;
    @AndroidFindBy(xpath = "//android.widget.Button[@text='Next']")
    public MobileElement BTN_NEXT;
    @AndroidFindBy(id = "tv_login")
    public MobileElement LOGIN;
    @AndroidFindBy(xpath = "//android.widget.EditText[@password='false' and @index='0']")
    public MobileElement NED_USERNAME;
    @AndroidFindBy(xpath = "//android.widget.EditText[@password='true' and @index='0']")
    public MobileElement NED_PASSWORD;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='Log in']")
    public MobileElement LOGIN_BUTTON;

    @AndroidFindBy(id = "imageView2")
    public MobileElement MYPOCKETCLOSE;
    @AndroidFindBy(id = "tvSkipPinBiometric")
    public MobileElement SKIP_PIN;
    @AndroidFindBy(id = "btnAction")
    public MobileElement BTN_NEXT_ACTION;
    @AndroidFindBy(id = "permission_allow_button")
    public MobileElement ALLOW_BUTTON;
    @AndroidFindBy(id = "android:id/button1")
    public MobileElement CONFIRM_BUTTON;


}
