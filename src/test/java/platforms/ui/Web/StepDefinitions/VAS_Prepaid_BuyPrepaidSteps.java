package platforms.ui.Web.StepDefinitions;


import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import platforms.ui.Web.Pages.VAS_Prepaid_BuyPrepaidPage;
import platforms.ui.Web.VAS_DataFactory;
import utils.Utils;

import java.io.IOException;


public class VAS_Prepaid_BuyPrepaidSteps extends Utils {
    private static Logger log = Logger.getLogger(VAS_Prepaid_BuyPrepaidSteps.class);
    LoginSteps login = new LoginSteps();
    public VAS_Prepaid_BuyPrepaidPage buyPrepaid = PageFactory.initElements(driver, VAS_Prepaid_BuyPrepaidPage.class);
    Utils utils = new Utils();
    public static String ProductName, PrepaidPrice, stringNumber, recipientName;
    WebDriverWait wait = new WebDriverWait(driver,70);

    @Given("^Existing customer logged onto Web$")
    public void existing_customer_logged_onto_Web() throws InterruptedException {
        login.user_launch_prepaid_web_application();
        login.user_enters_username_and_password_from_feature_file(VAS_DataFactory.uname, VAS_DataFactory.pwd);
//        login.user_enters_username_and_password(VAS_DataFactory.uname, VAS_DataFactory.pwd);
        login.user_clicks_on_Login();
        login.user_must_logon_to_Money_Web_application();
    }

    @And("^User clicks buy button$")
    public void user_clicks_buy_button(){
        try{
            if(driver.findElement(By.xpath("//div[contains(@class,'dismiss-icon')]")).isDisplayed()){
                driver.findElement(By.xpath("//div[contains(@class,'dismiss-icon')]")).click();
            }
        }catch (Exception e){
            e.getMessage();
        }
        buyPrepaid.Buy.click();
        log.info("user able click on Buy option");
    }

    @When("^User want to buy prepaid$")
    public void user_want_to_buy_prepaid() {

        buyPrepaid.BuyPrepaid.click();
        log.info("user able click on Buy Prepaid option");

    }

    @Then("^User should navigate to prepaid screen$")
    public void user_should_navigate_to_prepaid_screen(){
        try{
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("buy_new")));
            buyPrepaid.BuyNew.click();

        }catch (Exception e){
            e.getMessage();
        }
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Buy prepaid')]")));
        buyPrepaid.PrepaidLandingScreen.isDisplayed();
        log.info("user able navigate tp prepaid screen");
    }

    @And("^User want to select Existing \"([^\"]*)\"$")
    public void userWantToSelectExisting(String arg0){
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@role='combobox']")));
//        buyPrepaid.RecipientInput.click();
//        buyPrepaid.RecipientInput.sendKeys(VAS_DataFactory.recipient);
//        driver.findElement(By.xpath("(//div[@role='option'])[1]")).click();
//        log.info("Existing Recipient : " + VAS_DataFactory.recipient);

    }

    @And("^User want to proceed Next$")
    public void userWantToProceedNext(){
        scrollToElement(buyPrepaid.NextBtn);
        buyPrepaid.NextBtn.click();

    }

    @And("^User should navigate to Provider screen$")
    public void userShouldNavigateToProviderScreen(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Choose a provider')]")));
        buyPrepaid.ProviderScreen.isDisplayed();
    }

    @When("^User selects \"([^\"]*)\"$")
    public void userSelects(String provider){

        buyPrepaid.SetProvider(provider);
        log.info("Bundle Type : " + provider);

    }

    @Then("^User should navigate to default provider screen$")
    public void userShouldNavigateToDefaultProviderScreen(){
        buyPrepaid.ProductScreen.isDisplayed();
    }

    @And("^user able to select \"([^\"]*)\"$")
    public void userAbleToSelect(String Category){

        buyPrepaid.SelectCategory(Category);
        log.info("Category Type : " + Category);

    }

    @And("^User want to add new \"([^\"]*)\" name$")
    public void userWantToAddNewName(String recipientName){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@role='combobox']")));
        buyPrepaid.RecipientInput.sendKeys(recipientName);
        log.info("Existing Recipient : " + recipientName);

    }

    @And("^User want to add \"([^\"]*)\"$")
    public void userWantToAdd(String MobileNumber){
        buyPrepaid.RecipientMobileNum.sendKeys(MobileNumber);
    }

    @When("^User want select Prepaid Product$")
    public void userWantSelectPrepaidProduct() {
        WebElement PrepaidProduct = driver.findElement(By.xpath("(//tab[contains(@customclass,'custom') and contains(@class,'active')]//div[@class='content-container'])[1]"));

        utils.scrollToElement(PrepaidProduct);
        if(PrepaidProduct.isDisplayed()) {
            String Product = PrepaidProduct.getAttribute("textContent");
            String[] str_array = Product.split("00");
            PrepaidPrice = str_array[0] + "00";
            ProductName = str_array[1];
            PrepaidProduct.click();
        }
    }

    @Then("^User navigates to Recipient screen$")
    public void userNavigatesToRecipientScreen() {
        buyPrepaid.RecipientScreen.isDisplayed();


    }

    @And("^User want to buy prepaid for new Recipient$")
    public void userWantToBuyPrepaidForNewRecipient() {

    }

    @And("^User want to click Next$")
    public void userWantToClickNext(){

    }


    @Then("^User should navigate to Payment screen$")
    public void userShouldNavigateToPaymentScreen(){

        buyPrepaid.PaymentScreen.isDisplayed();

    }

    @And("^User want to review all Recipient details$")
    public void userWantToReviewAllRecipientDetails() throws IOException {
        //Recipient name
        String RecipientName = buyPrepaid.RecipientRef.getAttribute("textContent");
        String[] str_array = RecipientName.split("\\s");
        int a = str_array.length;
        stringNumber = str_array[a-1];
        System.out.println("Recipient Number : " + stringNumber);
        String stringName = str_array[0];
        System.out.println(stringName);
        if(stringName.equals(recipientName)){
            log.info("Recipient Name : " + stringName);
        }

        //product Name
        String PrepaidProductName = buyPrepaid.ProductRef.getAttribute("textContent");
        if(ProductName.equals(PrepaidProductName)){
            log.info("Product Name : " + ProductName);
        }

        //Amount
        String Amount = buyPrepaid.AmountRef.getAttribute("textContent");
        if(PrepaidPrice.equals(Amount)){
            log.info("Own Amount : " + PrepaidPrice);
        }

        //Payment Reference
        utils.scrollToElement(buyPrepaid.PaymentRef);
        utils.TakeScreenCapture("PaymentScreen");
        String PayRef = buyPrepaid.PaymentRef.getAttribute("value");
        if(PayRef.isEmpty()){
            buyPrepaid.PaymentRef.sendKeys(VAS_DataFactory.payRef);
        }

    }

    @And("^User want buy product$")
    public void userWantBuyProduct(){

        utils.scrollToElement(buyPrepaid.BuyBtn);
        buyPrepaid.BuyBtn.click();
    }
}
