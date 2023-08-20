package platforms.ui.mobile.android.StepDefinitions;


import com.github.javafaker.Faker;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.MobileElement;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import platforms.ui.mobile.android.AndroidCommonMethods;
import platforms.ui.mobile.android.AndroidFlowModel.Prepaid_Flow;
import platforms.ui.mobile.android.AndroidPageObjects.VAS_Prepaid_AndroidObjects;
import platforms.ui.mobile.android.AndroidPageObjects.VAS_Voucher_AndroidObjects;
import platforms.ui.mobile.android.VAS_AndroidDataFactory;
import utils.CommonFunctions;
import utils.DriverFactory;
import utils.Utils;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

public class VAS_Prepaid_AddNewRecipientSteps extends DriverFactory {
    WebDriverWait wait = new WebDriverWait(getAndroidDriver(),30);
    private static Logger log = Logger.getLogger(VAS_Prepaid_AddNewRecipientSteps.class);
    public Prepaid_Flow prepaid_flow = new Prepaid_Flow();



    Faker faker = new Faker();
    String name = faker.name().fullName();


    @And("^Android user should see Carousal for first time$")
    public void androidUserShouldSeeCarousalForFirstTime() {
        prepaid_flow.Prepaid_Carousal();
    }

    @And("^Android user should navigate to Provider screen$")
    public void androidUserShouldNavigateToProviderScreen() {
        prepaid_flow.Navigate_Prepaid_ProviderScreen();
    }

    @When("^Android user clicks on \"([^\"]*)\"$")
    public void androidUserClicksOn(String Provider){
       prepaid_flow.ProviderSelection(Provider);
    }

    @Then("^Android user should navigate to category screen$")
    public void androidUserShouldNavigateToCategoryScreen() {
        driver.findElementByXPath(VAS_Prepaid_AndroidObjects.CategoryScreen).isDisplayed();
    }

    @And("^Android user selects \"([^\"]*)\"$")
    public void androidUserSelects(String Category) {
        prepaid_flow.CategorySelection(Category);

    }

    @And("^Android user selects product from category$")
    public void androidUserSelectsProductFromCategory() {
        wait.until(presenceOfElementLocated(By.id(VAS_Prepaid_AndroidObjects.Product)));
        driver.findElementsById(VAS_Prepaid_AndroidObjects.Product).get(0).click();
    }

    @And("^Android user navigates to Recipient screen$")
    public void androidUserNavigatesToRecipientScreen() {
        prepaid_flow.Navigates_RecipientScreen();
    }

    @And("^Android user want to add new \"([^\"]*)\"$")
    public void androidUserWantToAddNew(String Recipient) {
        driver.findElementsById(VAS_Prepaid_AndroidObjects.EditField).get(0).clear();
        driver.findElementsById(VAS_Prepaid_AndroidObjects.EditField).get(0).sendKeys(Recipient);
        driver.findElementById(VAS_Prepaid_AndroidObjects.SaveBeneficiarySwitch).click();
        driver.findElementsById(VAS_Prepaid_AndroidObjects.EditField).get(1).sendKeys(name);
    }

    @And("^Android user navigates to payment screen$")
    public void androidUserNavigatesToPaymentScreen() throws IOException {
        prepaid_flow.Navigates_PaymentScreen();
    }

    @And("^Android user want to review prepaid purchase$")
    public void androidUserWantToReviewPrepaidPurchase() throws IOException {
        prepaid_flow.Review_PrepaidPurchase();
    }

    @When("^Android user clicks on Buy$")
    public void androidUserClicksOnBuy() throws IOException {
        prepaid_flow.Buy();
    }

    @Then("^Android user navigates to Success screen$")
    public void androidUserNavigatesToSuccessScreen() throws IOException {
        prepaid_flow.Navigates_SuccessScreen();
    }

    @And("^Android user want to close the transaction$")
    public void androidUserWantToCloseTheTransaction() {
        driver.findElementById(VAS_Prepaid_AndroidObjects.Close).click();
    }

    @And("^Android user should navigate to OwnAmount screen$")
    public void androidUserShouldNavigateToOwnAmountScreen() {
        wait.until(presenceOfElementLocated(By.xpath(VAS_Prepaid_AndroidObjects.OwnAmountScreen)));
        driver.findElementByXPath(VAS_Prepaid_AndroidObjects.OwnAmountScreen).isDisplayed();
    }

    @And("^Android user should navigate to OwnAmount LandLine screen$")
    public void androidUserShouldNavigateToOwnAmountLandLineScreen() {
        wait.until(presenceOfElementLocated(By.xpath(VAS_Prepaid_AndroidObjects.landLineScreen)));
        driver.findElementByXPath(VAS_Prepaid_AndroidObjects.landLineScreen).isDisplayed();
    }

    @And("^Android user want to enter \"([^\"]*)\"$")
    public void androidUserWantToEnter(String OwnAmount) {
      driver.findElementById(VAS_Prepaid_AndroidObjects.EditField).sendKeys(OwnAmount);
    }

    @And("^Android user want to do new purchase$")
    public void androidUserWantToDoNewPurchase() {
        driver.findElementByXPath(VAS_Prepaid_AndroidObjects.NewPurchaseButton).click();
    }

}
