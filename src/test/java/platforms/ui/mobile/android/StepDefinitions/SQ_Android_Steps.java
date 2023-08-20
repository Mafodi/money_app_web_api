package platforms.ui.mobile.android.StepDefinitions;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import java.time.Duration;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import io.appium.java_client.MobileBy;
import org.apache.log4j.Logger;
import platforms.ui.mobile.android.AndroidFlowModel.SQ_Branch_LocatorAndroidFlow;
import platforms.ui.mobile.android.AndroidPageObjects.AndroidBaseScreen;
import utils.DriverFactory;
import utils.Utils;

public class SQ_Android_Steps extends DriverFactory {

    private static Logger log = Logger.getLogger(SQ_Android_Steps.class);
    AndroidBaseScreen login = new AndroidBaseScreen(driver);
    SQ_Branch_LocatorAndroidFlow branch_flow = new SQ_Branch_LocatorAndroidFlow(driver);
    Utils utils = new Utils();

    @Given("^Quit the driver and reinitiate$")
    public void quit_the_driver_and_reinitiate() throws Throwable {
        try {
            driver.quit();
            driver = branch_flow.getAndroidDriver_PermissionDeniel();
            System.out.println(driver);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Given("^android app is launched$")
    public void app_is_launched() throws Throwable {

        AndroidBaseScreen login = new AndroidBaseScreen(driver);
        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
        try {
            login.NEXT_LOGIN.click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Given("^Deny the permission pop up$")
    public void deny_the_permission_pop_up() throws Throwable {
        try {
            driver.findElement(MobileBy.xpath("//*[@text='DENY']")).click();
            driver.findElement(MobileBy.xpath("//*[@text='DENY']")).click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @When("^again deny the permission pop up$")
    public void again_deny_the_permission_pop_up() throws Throwable {
        try {
            driver.findElement(MobileBy.xpath("//*[@text='DENY']")).click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @When("^click on Next button on network permission screen$")
    public void click_on_Next_button_on_network_permission_screen() throws Throwable {
        try {
            SQ_Branch_LocatorAndroidFlow branch_flow = new SQ_Branch_LocatorAndroidFlow(driver);

            driver.runAppInBackground(Duration.ofSeconds(1));
            Thread.sleep(3000);
            branch_flow.clickNextButton();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @When("^user click on Menu footer$")
    public void user_click_on_Menu_footer() throws Throwable {
        try {
            SQ_Branch_LocatorAndroidFlow branch_flow = new SQ_Branch_LocatorAndroidFlow(driver);
            branch_flow.clickMenuFooter();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @When("^user enters valid username and valid password$")
    public void user_enter_username_and_password(DataTable data_table) {
        try {
            SQ_Branch_LocatorAndroidFlow branch_flow = new SQ_Branch_LocatorAndroidFlow(driver);
            AndroidBaseScreen login = new AndroidBaseScreen(driver);
            branch_flow.clickloginButton();
            branch_flow.clickBusinessProfile();
            branch_flow.clickSwitchTab();
            for (Map<String, String> data : data_table.asMaps(String.class, String.class)) {
                login.NED_USERNAME.sendKeys(data.get("username"));
                login.NED_PASSWORD.sendKeys(data.get("password"));
            }
            login.ACCEPTTerm.click();
            login.NEXT_LOGIN.click();
            // Wait for ApproveIT
            driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @When("^user clicks on top menu bar$")
    public void user_clicks_on_top_menu_bar() throws Throwable {
        try {
            SQ_Branch_LocatorAndroidFlow branch_flow = new SQ_Branch_LocatorAndroidFlow(driver);
            branch_flow.clickTopMenu();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @When("^user navigates to Branch locator on android app$")
    public void user_navigates_to_Branch_locator_on_android_app() throws Throwable {
        try {
            SQ_Branch_LocatorAndroidFlow branch_flow = new SQ_Branch_LocatorAndroidFlow(driver);
            Thread.sleep(2000);
            branch_flow.clickGetInTouch();
            branch_flow.clickFindNowButton();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Then("^Verify that list of ten closest active branches on the map should displayed on android app$")
    public void verify_that_list_of_ten_closest_active_branches_on_the_map_should_displayed_on_android_app()
            throws Throwable {
        try {
            SQ_Branch_LocatorAndroidFlow branch_flow = new SQ_Branch_LocatorAndroidFlow(driver);
            if (branch_flow.filterButtonExistance() == true) {
                System.out.println("User landed to the Branch locator screen succesfully");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Then("^User search for the \"([^\"]*)\" and navigates to the branch \"([^\"]*)\" on android app$")
    public void user_search_for_the_and_navigates_to_the_branch_on_android_app(String location, String branch)
            throws Throwable {
        try {
            SQ_Branch_LocatorAndroidFlow branch_flow = new SQ_Branch_LocatorAndroidFlow(driver);
            branch_flow.enterLocation(location);
            branch_flow.selectLocationFromList(location);
            branch_flow.selectBranchFromMap(branch);
            Thread.sleep(4000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Then("^Verify the relevant branch \"([^\"]*)\" is appearing on the map$")
    public void verify_the_relevant_branch_is_appearing_on_the_map(String branch) throws Throwable {
        try {
            SQ_Branch_LocatorAndroidFlow branch_flow = new SQ_Branch_LocatorAndroidFlow(driver);
            if (branch_flow.BranchesOnMapAppearance(branch) == true) {
                System.out.println("Branch is appearing on the map");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Then("^Verify the \"([^\"]*)\" , Status Time and Kms displayed for the branch on android app$")
    public void verify_the_Status_Time_and_Kms_displayed_for_the_branch_on_android_app(String branchName)
            throws Throwable {
        try {
            SQ_Branch_LocatorAndroidFlow branch_flow = new SQ_Branch_LocatorAndroidFlow(driver);
            if (branch_flow.getActualBranch() == branchName) {
                System.out.println("Branch is correct");
            } else {
                System.out.println("Branch name is incorrect");
            }

            if (branch_flow.branchStatusIsDisplayed() == true) {

                System.out.println("Branch status is displayed");
            }

            if (branch_flow.branchAddressIsDisplayed() == true) {

                System.out.println("Branch address is displayed");
            }

            if (branch_flow.branchStatusIsDisplayed() == true) {

                System.out.println("Branch Distance is displayed");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Then("^Verify the address, phonenumber, email, branchcode, opening hours, features and In Branch Services on android app screen$")
    public void verify_the_address_phonenumber_email_branchcode_opening_hours_features_and_In_Branch_Services_on_android_app_screen()
            throws Throwable {
        try {
            SQ_Branch_LocatorAndroidFlow branch_flow = new SQ_Branch_LocatorAndroidFlow(driver);
            if (branch_flow.branchPlaceCodeIsDisplayed() == true) {

                System.out.println("Branch Place Code is displayed");
            }
            if (branch_flow.branchPhoneisDisplayed() == true) {

                System.out.println("Branch Phone Number is displayed");
            }
            if (branch_flow.branchEmailisDisplayed() == true) {

                System.out.println("Branch Email is displayed");
            }
            if (branch_flow.branchOpeningHoursisDisplayed() == true) {

                System.out.println("Branch Opening Hours is displayed");
            }
            if (branch_flow.branchFeatureisDisplayed() == true) {

                System.out.println("Branch Features is displayed");
            }

            if (branch_flow.branchServiceisDisplayed() == true) {

                System.out.println("Branch Services is displayed");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Then("^Verify the In Branch Services and Estimated waiting times is appearing correctly$")
    public void verify_the_In_Branch_Services_and_Estimated_waiting_times_is_appearing_correctly() throws Throwable {
        try {
            SQ_Branch_LocatorAndroidFlow branch_flow = new SQ_Branch_LocatorAndroidFlow(driver);
            if (!branch_flow.checkStatus().equalsIgnoreCase("This branch is: CLOSED")) {
                branch_flow.clickInServices();
                branch_flow.verifyInBranchScreenWaitingTimes();
            } else {
                branch_flow.clickInServices();
                branch_flow.verifyInBranchScreen();
            }
            branch_flow.clickBackButton();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Then("^Verify the opening hours section is appearing correctly$")
    public void verify_the_opening_hours_section_is_appearing_correctly() throws Throwable {
        try {
            SQ_Branch_LocatorAndroidFlow branch_flow = new SQ_Branch_LocatorAndroidFlow(driver);
            branch_flow.clickbranchOpeningHours();
            branch_flow.verifyOpeningHoursScreen();
            branch_flow.clickBackButton();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Then("^Verify the features section is appearing correctly$")
    public void verify_the_features_section_is_appearing_correctly() throws Throwable {
        try {
            SQ_Branch_LocatorAndroidFlow branch_flow = new SQ_Branch_LocatorAndroidFlow(driver);
            branch_flow.clickFeatures();
            branch_flow.verifyFeaturesScreen();
            branch_flow.clickBackButton();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Then("^Verify the In Branch Services is appearing correctly$")
    public void verify_the_In_Branch_Services_is_appearing_correctly() throws Throwable {
        try {
            SQ_Branch_LocatorAndroidFlow branch_flow = new SQ_Branch_LocatorAndroidFlow(driver);
            branch_flow.clickInServices();
            branch_flow.verifyInBranchScreen();
            branch_flow.clickBackButton();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Then("^User clicks on the back button on android app$")
    public void user_clicks_on_the_back_button_on_android_app() throws Throwable {
        try {
            SQ_Branch_LocatorAndroidFlow branch_flow = new SQ_Branch_LocatorAndroidFlow(driver);
            branch_flow.clickBackButton();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Then("^Verify user gets back to the map screen on android app$")
    public void verify_user_gets_back_to_the_map_screen_on_android_app() throws Throwable {
        try {
            SQ_Branch_LocatorAndroidFlow branch_flow = new SQ_Branch_LocatorAndroidFlow(driver);
            if (branch_flow.searchBarisDisplayed() == true) {
                System.out.println("User successfully navigates back to Branch screen");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Then("^user click on the AdvanceFilter Option on android app$")
    public void user_click_on_the_AdvanceFilter_Option_on_android_app() throws Throwable {
        try {
            SQ_Branch_LocatorAndroidFlow branch_flow = new SQ_Branch_LocatorAndroidFlow(driver);
            branch_flow.clickFilterButton();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @When("^User selects the option of Openings hours, Inbranch services, and Features on the filter section$")
    public void user_selects_the_option_of_Openings_hours_Inbranch_services_and_Features_on_the_filter_section()
            throws Throwable {
        try {
            SQ_Branch_LocatorAndroidFlow branch_flow = new SQ_Branch_LocatorAndroidFlow(driver);
            branch_flow.clickopeningHoursDropdown();
            branch_flow.clickopeningHoursDropdownValue();
            branch_flow.clickServiceDropdown();
            branch_flow.clickServiceDropdownValue();
            branch_flow.navigateBack();
            branch_flow.clickFacilitiesDropdown();
            branch_flow.clickFacilitiesDropdownValue();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @When("^clicks on Apply_Filters button on android app$")
    public void clicks_on_Apply_Filters_button_on_android_app() throws Throwable {
        try {
            SQ_Branch_LocatorAndroidFlow branch_flow = new SQ_Branch_LocatorAndroidFlow(driver);
            branch_flow.clickApplyFilterButton();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Then("^Verify the list of Branches displayed on the map$")
    public void verify_the_list_of_Branches_displayed_on_the_map() throws Throwable {
        try {
            SQ_Branch_LocatorAndroidFlow branch_flow = new SQ_Branch_LocatorAndroidFlow(driver);
            if (branch_flow.isFilterApplied() == true) {
                System.out.println("Filters applied successfully");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Then("^switch the ATM tab on android app$")
    public void switch_the_ATM_tab_on_android_app() throws Throwable {
        try {
            SQ_Branch_LocatorAndroidFlow branch_flow = new SQ_Branch_LocatorAndroidFlow(driver);
            branch_flow.clickATMTab();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Then("^click on the atm pin \"([^\"]*)\" on android app$")
    public void click_on_the_atm_pin_on_android_app(String atmName) throws Throwable {
        try {
            SQ_Branch_LocatorAndroidFlow branch_flow = new SQ_Branch_LocatorAndroidFlow(driver);
            branch_flow.selectATMFromMap(atmName);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Then("^Verify \"([^\"]*)\" , address, distance, Get map Direction and Ride with Uber on bottom of the screen$")
    public void verify_address_distance_Get_map_Direction_and_Ride_with_Uber_on_bottom_of_the_screen(String atmName)
            throws Throwable {
        try {
            SQ_Branch_LocatorAndroidFlow branch_flow = new SQ_Branch_LocatorAndroidFlow(driver);
            if (branch_flow.getATMName() == atmName) {
                System.out.print("ATM name is displayed");
            }
            if (branch_flow.atmAddressisDisplayed() == true) {
                System.out.print("ATM address is displayed");
            }
            if (branch_flow.directionButtonisDisplayed() == true) {
                System.out.print("Get Directions Button is displayed");
            }
            if (branch_flow.uberButtonisDisplayed() == true) {
                System.out.print("Get Uber Button is displayed");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Then("^User search for the \"([^\"]*)\" in the search bar$")
    public void user_search_for_the_in_the_search_bar(String location) throws Throwable {
        try {
            SQ_Branch_LocatorAndroidFlow branch_flow = new SQ_Branch_LocatorAndroidFlow(driver);
            branch_flow.enterLocation(location);
            branch_flow.selectLocationFromList(location);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @When("^User selects the option of Openings hours i\\.e\\. Filter which gives No Result on the filter section$")
    public void user_selects_the_option_of_Openings_hours_i_e_Filter_which_gives_No_Result_on_the_filter_section() throws Throwable {
        try {
            SQ_Branch_LocatorAndroidFlow branch_flow = new SQ_Branch_LocatorAndroidFlow(driver);
            branch_flow.clickopeningHoursDropdown();
            branch_flow.clickopeningHoursDropdownValueOpenSunday();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Then("^Verify the proper error message is appearing on the map screen$")
    public void verify_the_proper_error_message_is_appearing_on_the_map_screen() throws Throwable {
        try {
            SQ_Branch_LocatorAndroidFlow branch_flow = new SQ_Branch_LocatorAndroidFlow(driver);
            if (branch_flow.errorNoResultFound().equalsIgnoreCase("No results found.")) {
                System.out.println("Successfully validated no result found message in case of No result is found after applying filter");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Then("^User enter three character \"([^\"]*)\" in the search bar$")
    public void user_enter_three_character_in_the_search_bar(String threeLetterLocation) throws Throwable {
        try {
            SQ_Branch_LocatorAndroidFlow branch_flow = new SQ_Branch_LocatorAndroidFlow(driver);
            branch_flow.enterLocation(threeLetterLocation);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Then("^Verify that relevant autosuggestions \"([^\"]*)\" should appear$")
    public void verify_that_relevant_autosuggestions_should_appear(String location) throws Throwable {
        try {
            SQ_Branch_LocatorAndroidFlow branch_flow = new SQ_Branch_LocatorAndroidFlow(driver);
            if (branch_flow.autosuggestionAppearance(location) == true) {
                System.out.println("Autosuggestion works properly");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Then("^User search for the valid/invalid \"([^\"]*)\" in the search bar$")
    public void user_search_for_the_valid_invalid_in_the_search_bar(String location) throws Throwable {
        try {
            SQ_Branch_LocatorAndroidFlow branch_flow = new SQ_Branch_LocatorAndroidFlow(driver);
            branch_flow.enterLocation(location);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Then("^user clicks on close button$")
    public void user_clicks_on_close_button() throws Throwable {
        try {
            SQ_Branch_LocatorAndroidFlow branch_flow = new SQ_Branch_LocatorAndroidFlow(driver);
            branch_flow.clickCloseButton();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Then("^Verify the search location got cleared$")
    public void verify_the_search_location_got_cleared() throws Throwable {
        try {
            SQ_Branch_LocatorAndroidFlow branch_flow = new SQ_Branch_LocatorAndroidFlow(driver);
            if (branch_flow.autosuggestionDisappearance().equalsIgnoreCase("Search")) {
                System.out.println("Close button works properly");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @And("^clicks on Clear_Filters button on android app$")
    public void clicksOnClear_FiltersButtonOnAndroidApp() {
        try {
            SQ_Branch_LocatorAndroidFlow branch_flow = new SQ_Branch_LocatorAndroidFlow(driver);
            branch_flow.clickClearFilterButton();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Then("^Verify that selected filter values are cleared out$")
    public void verifyThatSelectedFilterValuesAreClearedOut() {
        try {
            SQ_Branch_LocatorAndroidFlow branch_flow = new SQ_Branch_LocatorAndroidFlow(driver);
            if (branch_flow.isOpeningHoursFilterCleared() == true) {
                System.out.println("Filter is cleared successfully");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @And("^User selects multiple services in services filter$")
    public void userSelectsMultipleServicesInServicesFilter() {
        try {
            SQ_Branch_LocatorAndroidFlow branch_flow = new SQ_Branch_LocatorAndroidFlow(driver);
            branch_flow.clickServiceDropdown();
            branch_flow.clickServiceDropdownValue();
            branch_flow.clickServiceDropdownSecondValue();
            branch_flow.clickServiceDropdownThirdValue();
            branch_flow.navigateBack();

        } catch (Exception e) {
            e.printStackTrace();

        }
    }

    @Then("^Verify that selected services are appearing$")
    public void verifyThatSelectedServicesAreAppearing() {
        try {
            SQ_Branch_LocatorAndroidFlow branch_flow = new SQ_Branch_LocatorAndroidFlow(driver);
            if (branch_flow.isfilterSelected() == true) {
                System.out.println("Multi Filter is selected successfully");
            }
        } catch (Exception e) {
            e.printStackTrace();

        }
    }


    @And("^User selects multiple services in services filter i\\.e\\. more than three services$")
    public void userSelectsMultipleServicesInServicesFilterIEMoreThanThreeServices() {
        try {
            SQ_Branch_LocatorAndroidFlow branch_flow = new SQ_Branch_LocatorAndroidFlow(driver);
            branch_flow.clickServiceDropdown();
            branch_flow.clickServiceDropdownValue();
            branch_flow.clickServiceDropdownSecondValue();
            branch_flow.clickServiceDropdownThirdValue();
            branch_flow.clickServiceDropdownFourthValue();

        } catch (Exception e) {
            e.printStackTrace();

        }
    }


    @Then("^Verify that proper error message should appear$")
    public void verifyThatProperErrorMessageShouldAppear() {
        try {
            SQ_Branch_LocatorAndroidFlow branch_flow = new SQ_Branch_LocatorAndroidFlow(driver);
            if (branch_flow.serviceFilterErrorMessage() == true) {
                System.out.println("Proper validation is applied");
            }
        } catch (Exception e) {
            e.printStackTrace();

        }
    }

    @And("^User clicks on the Clear All$")
    public void userClicksOnTheClearAll() {
        try {
            SQ_Branch_LocatorAndroidFlow branch_flow = new SQ_Branch_LocatorAndroidFlow(driver);
            branch_flow.clickClearAll();
        } catch (Exception e) {
            e.printStackTrace();

        }

    }

    @Then("^Verify that all the selected services are cleared out$")
    public void verifyThatAllTheSelectedServicesAreClearedOut() {
        try {
            SQ_Branch_LocatorAndroidFlow branch_flow = new SQ_Branch_LocatorAndroidFlow(driver);
            if (branch_flow.isServicesFilterCleared() == true) {
                System.out.println("Filter is cleared successfully");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @And("^User search for the \"([^\"]*)\" and navigates to the searched location on android app$")
    public void userSearchForTheAndNavigatesToTheSearchedLocationOnAndroidApp(String location) throws Throwable {
        try {
            SQ_Branch_LocatorAndroidFlow branch_flow = new SQ_Branch_LocatorAndroidFlow(driver);
            branch_flow.enterLocation(location);
            branch_flow.selectLocationFromList(location);
            Thread.sleep(4000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @And("^verify the atm pin \"([^\"]*)\" on android app$")
    public void verifyTheAtmPinOnAndroidApp(String atm) throws Throwable {
        try {
            SQ_Branch_LocatorAndroidFlow branch_flow = new SQ_Branch_LocatorAndroidFlow(driver);
            if (branch_flow.ATMOnMapAppearance(atm) == true) {
                System.out.println("ATM is appearing on the map");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Then("^user is on the home screen$")
    public void userIsOnTheHomeScreen() {
        //driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
        try {
            SQ_Branch_LocatorAndroidFlow branch_flow = new SQ_Branch_LocatorAndroidFlow(driver);
            branch_flow.clickonPocketPopUp();
            System.out.println("MyPocket closed successfully");
        } catch (Exception e) {
            e.getMessage();
        }

    }
}
