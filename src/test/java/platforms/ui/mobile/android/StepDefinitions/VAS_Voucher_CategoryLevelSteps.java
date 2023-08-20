package platforms.ui.mobile.android.StepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import platforms.ui.mobile.android.AndroidCommonMethods;
import platforms.ui.mobile.android.AndroidFlowModel.Voucher_Flow;
import platforms.ui.mobile.android.AndroidPageObjects.VAS_Prepaid_AndroidObjects;
import platforms.ui.mobile.android.AndroidPageObjects.VAS_Voucher_AndroidObjects;
import platforms.ui.mobile.android.VAS_AndroidDataFactory;
import utils.DriverFactory;

public class VAS_Voucher_CategoryLevelSteps extends DriverFactory {
    private static Logger log = Logger.getLogger(VAS_Voucher_CategoryLevelSteps.class);
    WebDriverWait wait = new WebDriverWait(getAndroidDriver(),40);
    Voucher_Flow voucher_flow = new Voucher_Flow();
    public String Category2, Category3;

    @And("^Android user want to select Multi Category Voucher$")
    public void androidUserWantToSelectMultiCategoryVoucher() {
      voucher_flow.Select_MultiCategoryVoucher();
    }

    @And("^Android user should navigate to category level one$")
    public void androidUserShouldNavigateToCategoryLevelOne() {
       voucher_flow.NavigateTo_CategoryLevelOne();
    }

    @And("^Android user want to select category from category level two$")
    public void androidUserWantToSelectCategoryFromCategoryLevelTwo() {
        voucher_flow.SelectCategory_FromCategoryLevelTwo();
    }

    @Then("^Android user should navigate to category level two$")
    public void androidUserShouldNavigateToCategoryLevelTwo() {
        driver.findElement(By.xpath("//android.widget.TextView[@text='Choose from "+ Category3 +"']")).isDisplayed();
        log.info("User successfully navigated to level 3");
    }

    @And("^Android user selects category$")
    public void androidUserSelectsCategory() {
        driver.findElementsById(VAS_Voucher_AndroidObjects.CategoryLevel1Product).get(0).click();
    }

    @Then("^Android user want to update Reference$")
    public void androidUserWantToUpdateReference() {
        voucher_flow.Update_Reference();
    }
}
