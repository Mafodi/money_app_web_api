package platforms.ui.mobile.ios.StepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.support.ui.WebDriverWait;
import platforms.ui.mobile.ios.BasePageIOS;
import platforms.ui.mobile.ios.IOSObjects;
import platforms.ui.mobile.ios.iOSFlowModel.SQ_Branch_LocatoriOSFlow;
import utils.DriverFactory;

import java.util.List;

public class SmartQueuingSteps extends DriverFactory {
    WebDriverWait wait = new WebDriverWait(getIOSDriver(), 60);
    private static Logger logger = Logger.getLogger(SmartQueuingSteps.class);
    SQ_Branch_LocatoriOSFlow branch_flow = new SQ_Branch_LocatoriOSFlow();
    BasePageIOS base = new BasePageIOS();

    @When("^ios user select get in touch button$")
    public void ios_user_select_get_in_touch_button() {
        try {
            branch_flow.clickGetInTouchButton();

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }


    }

    @Given("^user launches iOS money app$")
    public void userLaunchesIOSMoneyApp() {
        try {
            base.waitForElement(new MobileBy.ByAccessibilityId(IOSObjects.ALLOW_LOCATION));
        } catch (Exception e) {
            e.getMessage();
        }
    }


    @When("^user allow location services$")
    public void user_allow_location_services() {
        try {
            driver.findElementByAccessibilityId(IOSObjects.ALLOW_LOCATION).click();

        } catch (Exception e) {
            e.getMessage();
        }
    }

    @When("^user deny location services$")
    public void user_deny_location_services() throws Throwable {
        try {
            driver.findElementByAccessibilityId(IOSObjects.DENY_LOCATION).click();

        } catch (Exception e) {
            e.getMessage();
        }

    }

    @When("^user enters username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void userEntersUsernameAndPassword(String username, String password) {
        try {
            branch_flow.clickBussinessProfile();
            branch_flow.clickSwitchTabLogin();
            branch_flow.enterUsername(username);
            branch_flow.enterPassword(password);
            branch_flow.clickTCCheckBox();
            branch_flow.clickLoginButtonOnLoginScreen();
        } catch (Exception e) {
            throw new AssertionError("User has not logged in succesfully:", e);
        }

    }

    @Then("^user should be on ios welcome screen$")
    public void userShouldBeOnIosWelcomeScreen() {
        try {
            if (branch_flow.isHomePageDispalyed() == true) {
                branch_flow.clickOk();
            }

        } catch (Exception e) {
            throw new AssertionError("User Not navigated to welcome screen:", e);
        }
    }


    @When("^ios user select continue button$")
    public void ios_user_select_continue_button$() {
        //wait.until(presenceOfElementLocated(new MobileBy.ByAccessibilityId(IOSObjects.CONTINUE_BUTTON)));
        try {
            branch_flow.clickContinueButton();
        } catch (Exception e) {
            logger.info(e.getStackTrace());
        }

    }

    @When("^ios user select login button$")
    public void ios_user_select_login_buttom() {
        try {
            branch_flow.clickLoginButton();
        } catch (Exception e) {
            e.getMessage();
        }

    }

    @When("^ios user close app inter action blocking views$")
    public void ios_user_close_app_blocking_inter_actions_views() {
        try {
            branch_flow.clickokButton();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @And("^ios user select post login more menu$")
    public void ios_user_select_post_login_more_menu() {
        try {
            branch_flow.clickMoreButtonAfterLogin();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^ios user select atm and branch locator$")
    public void ios_user_select_atm_and_branch_locator() {
        try {
            base.secondsDelay(2);
            base.scrollPage("down");
            branch_flow.clickATMBranchLocator();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^ios user scroll the page down$")
    public void ios_user_scroll_the_page_down() {
        try {
            base.scrollPage("down");
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @When("^ios user select view more button$")
    public void ios_can_select_view_more_button() {
        try {
            branch_flow.clickMoreButton();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^ios user select pre login more button$")
    public void ios_user_select_pre_login_more_button$() {
        try {
            branch_flow.clickMoreButtonBeforeLogin();
        } catch (Exception e) {
            logger.info("Unable to select pre-login more button");
        }

    }

    @When("^ios user select find now button$")
    public void ios_user_select_find_now_button() {
        try {
            branch_flow.clickFindNowButton();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^ios user select next button$")
    public void ios_user_select_next_button() {
        try {
            base.secondsDelay(1);
            branch_flow.clickNextButton();
            base.secondsDelay(15);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @When("^ios user search for a branch \"([^\"]*)\"$")
    public void ios_user_search_for_a_branch_something(String branchName) {
        try {
            branch_flow.enterLocationSearchBox(branchName);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^ios user select branch \"([^\"]*)\" location from the map$")
    public void ios_user_select_branch_location_from_the_map(String branch) throws Throwable {
        try {
            branch_flow.selectBranchFromMap(branch);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @When("^ios user select atm tab$")
    public void ios_user_select_atm_tab() {
        try {
            branch_flow.clickATMTab();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @When("^ios user select atm location from the map$")
    public void ios_user_select_atm_location_from_the_map() {
        try {
            List<MobileElement> mapLocations = driver.findElementByAccessibilityId(IOSObjects.MAP_LOCATION_OUTER_VIEW).findElementByXPath(IOSObjects.MAP_LOCATION_VIEW)
                    .findElementsByClassName(IOSObjects.MAP_LOCATION_ICONS);
            mapLocations.get(0).click();
            base.secondsDelay(2);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^ios user can see branch locations listed on the map$")
    public void ios_user_can_see_branch_locations_listed_on_the_map() {
        try {
            base.waitForElement(new MobileBy.ByAccessibilityId(IOSObjects.MAP_LOCATION_ICONS));
            Boolean isDisplayed = driver.findElementByAccessibilityId(IOSObjects.MAP_LOCATION_OUTER_VIEW).
                    findElementByXPath(IOSObjects.MAP_LOCATION_VIEW)
                    .findElementByClassName(IOSObjects.MAP_LOCATION_ICONS).isDisplayed();
            Assert.assertEquals(true, isDisplayed);

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^ios user is on branch details page$")
    public void ios_user_is_on_branch_details_page() {
        try {
            Boolean isDisplayed = branch_flow.isBranchDetailHeaderDisplayed();
            Assert.assertEquals(true, isDisplayed);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @Then("^ios user can see atm locations listed on the map$")
    public void ios_user_can_see_atm_locations_listed_on_the_map() {
        try {
            Boolean isDisplayed = driver.findElementByAccessibilityId(IOSObjects.MAP_LOCATION_OUTER_VIEW).
                    findElementByXPath(IOSObjects.MAP_LOCATION_VIEW)
                    .findElementByClassName(IOSObjects.MAP_LOCATION_ICONS).isDisplayed();
            Assert.assertEquals(true, isDisplayed);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @When("^ios user select \"([^\"]*)\" from search results$")
    public void ios_user_select_from_search_results(String branchName) throws Throwable {
        try {
            branch_flow.selectLocationFromList(branchName);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^ios user select branch In services label and is on In services screen$")
    public void ios_user_select_branch_In_services_label_and_is_on_In_services_screen() throws Throwable {
        try {
            if (branch_flow.getstatus().equalsIgnoreCase("The branch is: OPEN until 15:00")) {
                branch_flow.clickNonQMaticServiceLabel();
                Boolean isDisplayed = branch_flow.isServicesHeaderDisplayed();
                Assert.assertEquals(true, isDisplayed);
            } else {
                branch_flow.clickNonQMaticServiceLabel();
                Boolean isDisplayed = branch_flow.isServicesHeaderDisplayed();
                Assert.assertEquals(true, isDisplayed);
            }
            branch_flow.clickBackButton();

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^ios user select branch opening hours label$")
    public void ios_user_can_select_branch_opening_hours() {
        try {
            branch_flow.clickOpeningHourLabel();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @When("^ios user select branch features label$")
    public void ios_user_can_select_branch_features() {
        try {
            branch_flow.clickFeaturesLabel();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^ios user is on opening hours page$")
    public void ios_user_is_on_branch_opening_hours_page() {
        try {
            Boolean isDisplayed = branch_flow.isOpeningHoursDisplayed();
            Assert.assertEquals(true, isDisplayed);
            driver.navigate().back();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @Then("^ios user is on features page$")
    public void ios_user_is_on_branch_features_page() {
        try {
            Boolean isDisplayed = branch_flow.isFeaturesDisplayed();
            Assert.assertEquals(true, isDisplayed);
            driver.navigate().back();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^ios user can see get map directions button$")
    public void ios_user_can_see_get_map_directions_button() {
        try {
            Boolean isDisplayed = branch_flow.isGetDirectionsButtonDisplayed();
            Assert.assertEquals(true, isDisplayed);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @And("^ios user can see get map get uber ride button$")
    public void ios_user_can_see_get_uber_button() {
        try {
            Boolean isDisplayed = branch_flow.isUberButtonDisplayed();
            Assert.assertEquals(true, isDisplayed);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @When("^ios user select filter button$")
    public void ios_user_select_filter_button() {
        try {
            branch_flow.clickFilterIcon();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^ios user select opening hours \"([^\"]*)\" filter option$")
    public void ios_user_select_opening_hours_filter_option(String opening_hours) throws Throwable {
        try {
            branch_flow.clickOpeningHoursFilter();
            branch_flow.selectOpeningHoursFilterValue(opening_hours);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^ios user select services \"([^\"]*)\" filter option$")
    public void ios_user_select_services_filter_option(String inServices) throws Throwable {
        try {
            branch_flow.clickInServicesFilter();
            branch_flow.selectInServicesFilterValue(inServices);
            branch_flow.clickBackButton();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^ios user select features \"([^\"]*)\" filter option$")
    public void ios_user_select_features_filter_option(String features) throws Throwable {
        try {
            branch_flow.clickFeaturesFilter();
            branch_flow.selectFeaturesFilterValue(features);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^ios user select apply filter button$")
    public void ios_user_select_apply_filter_button() {
        try {
            branch_flow.applyFilterButton();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^ios user is on filter branch page$")
    public void ios_user_is_on_filter_branch_page() {
        try {
            Boolean isDisplayed = branch_flow.isFilterHeaderDisplayed();
            Assert.assertEquals(true, isDisplayed);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^ios user can branch map is filtered$")
    public void ios_user_can_branch_map_is_filtered() {
        try {
            Boolean isDisplayed = driver.findElementByAccessibilityId(IOSObjects.MAP_LOCATION_OUTER_VIEW).
                    findElementByXPath(IOSObjects.MAP_LOCATION_VIEW)
                    .findElementByClassName(IOSObjects.MAP_LOCATION_ICONS).isDisplayed();
            Assert.assertEquals(true, isDisplayed);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^user should get proper error message$")
    public void userShouldGetProperErrorMessage() {
        try {
            Boolean isDisplayed = branch_flow.isNoResultErrorDisplayed();
            Assert.assertEquals(true, isDisplayed);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^ios user select opening hours \"([^\"]*)\" filter option which gives no results$")
    public void iosUserSelectOpeningHoursFilterOptionWhichGivesNoResults(String opening_hours) throws Throwable {
        try {
            branch_flow.clickOpeningHoursFilter();
            branch_flow.selectOpeningHoursFilterValueWithNoResult(opening_hours);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^ios user search for a branch location \"([^\"]*)\" in the search bar$")
    public void iosUserSearchForABranchLocationInTheSearchBar(String locationFirstThreeLetter) throws Throwable {
        try {
            branch_flow.enterLocationSearchBox(locationFirstThreeLetter);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^Verify that relevant autosuggestions \"([^\"]*)\" should appear in iOS$")
    public void verifyThatRelevantAutosuggestionsShouldAppearInIOS(String location) throws Throwable {
        try {
            branch_flow.isLocationAppearance(location);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^user clicks on clear search field button in iOS$")
    public void userClicksOnClearSearchFieldButtonInIOS() {
        try {
            branch_flow.clickClearSearchField();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^Verify the search location got cleared in iOS$")
    public void verifyTheSearchLocationGotClearedInIOS() {
        try {
            Boolean isDisplayed = branch_flow.isSearchFieldCleared();
            Assert.assertEquals(true, isDisplayed);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^clicks on Clear_Filters button in iOS app$")
    public void clicksOnClear_FiltersButtonInIOSApp() {
        try {
            branch_flow.clickClearFilter();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^Verify that selected filter values are cleared out in iOS app$")
    public void verifyThatSelectedFilterValuesAreClearedOutInIOSApp() {
        try {
            Boolean isDisplayed = branch_flow.isOpeningHoursEmptyFieldDisplayed();
            Assert.assertEquals(true, isDisplayed);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^ios user select multiple services in filter options$")
    public void iosUserSelectMultipleServicesInFilterOptions() {
        try {
            branch_flow.clickInServicesFilter();
            branch_flow.selectInServicesFirstFilterValue();
            branch_flow.selectInServicesSecondFilterValue();
            branch_flow.selectInServicesThirdFilterValue();
            branch_flow.clickBackButton();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^Verify that selected services are appearing in iOS app$")
    public void verifyThatSelectedServicesAreAppearingInIOSApp() {
        try {
            Boolean isDisplayed = branch_flow.isClearAllServiceDisplayed();
            Assert.assertEquals(true, isDisplayed);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^ios user select multiple services in filter options i\\.e\\. more than three services in iOS app$")
    public void iosUserSelectMultipleServicesInFilterOptionsIEMoreThanThreeServicesInIOSApp() {
        try {
            branch_flow.clickInServicesFilter();
            branch_flow.selectInServicesFirstFilterValue();
            branch_flow.selectInServicesSecondFilterValue();
            branch_flow.selectInServicesThirdFilterValue();
            branch_flow.selectInServicesFourthFilterValue();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @And("^User clicks on the Clear All in iOS app$")
    public void userClicksOnTheClearAllInIOSApp() {
        try {
            branch_flow.clickClearAllButton();
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^Verify that all the selected services are cleared out in iOS app$")
    public void verifyThatAllTheSelectedServicesAreClearedOutInIOSApp() {
        try {
            Boolean isDisplayed = branch_flow.isInServicesFilterDisplayed();
            Assert.assertEquals(true, isDisplayed);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @When("^ios user select branch In services waiting times label and is on In services waiting times screen$")
    public void iosUserSelectBranchInServicesWaitingTimesLabelAndIsOnInServicesWaitingTimesScreen() {
        try {
            if (branch_flow.getstatus().equalsIgnoreCase("The branch is: OPEN until 15:00")) {
                branch_flow.clickQMaticServiceLabel();
                Boolean isDisplayed = branch_flow.isServicesWaitingTimesHeaderDisplayed();
                Assert.assertEquals(true, isDisplayed);
            } else {
                branch_flow.clickNonQMaticServiceLabel();
                Boolean isDisplayed = branch_flow.isServicesHeaderDisplayed();
                Assert.assertEquals(true, isDisplayed);
            }
            branch_flow.clickBackButton();

        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^Verify the error message for selecting more than three services filter$")
    public void verifyTheErrorMessageForSelectingMoreThanThreeServicesFilter() {
        try {
            Boolean isDisplayed = branch_flow.isServiceErroMessageDisplayed();
            Assert.assertEquals(true, isDisplayed);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }


    @And("^ios user select \"([^\"]*)\" from search results for unauth case$")
    public void iosUserSelectFromSearchResultsForUnauthCase(String branchName) throws Throwable {
        try {
            branch_flow.selectLocationFromListUnAuth(branchName);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    @Then("^Verify that relevant autosuggestions \"([^\"]*)\" should appear in iOS for unauth case$")
    public void verifyThatRelevantAutosuggestionsShouldAppearInIOSForUnauthCase(String location) throws Throwable {
        try {
            branch_flow.isLocationAppearanceUnAuth(location);
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }
}

