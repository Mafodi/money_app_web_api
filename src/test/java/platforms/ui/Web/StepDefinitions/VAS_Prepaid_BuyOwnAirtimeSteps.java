package platforms.ui.Web.StepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
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

import static platforms.ui.Web.StepDefinitions.VAS_Prepaid_BuyPrepaidSteps.ProductName;
import static platforms.ui.Web.StepDefinitions.VAS_Prepaid_BuyPrepaidSteps.stringNumber;


public class VAS_Prepaid_BuyOwnAirtimeSteps extends Utils {
    private static Logger log = Logger.getLogger(VAS_Prepaid_BuyPrepaidNewRecipientSteps.class);
    public VAS_Prepaid_BuyPrepaidPage buyPrepaid = PageFactory.initElements(driver, VAS_Prepaid_BuyPrepaidPage.class);
    Utils utils = new Utils();
    WebDriverWait wait = new WebDriverWait(driver,50);


    @And("^user want to select OwnAmount$")
    public void userWantToSelectOwnAmount() {

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Buy airtime and bundles')]")));
        secondsDelay(1);
        WebElement PrepaidProduct = driver.findElements(By.xpath("//tab[contains(@customclass,'custom') and contains(@class,'active')]//span[@class='offer-price']")).get(0);
        utils.scrollToElement(PrepaidProduct);  //span[contains(text(),'Own Amount ')]
        if(PrepaidProduct.isDisplayed()) {
            ProductName = PrepaidProduct.getAttribute("textContent");
            log.info("PrepaidProduct : " + ProductName);
            PrepaidProduct.click();
        }
    }

    @And("^user should navigate to Own airtime screen$")
    public void userShouldNavigateToOwnAirtimeScreen(){

        buyPrepaid.OwnAirtimeScreen.isDisplayed();
    }

    @And("^user want to enter OwnAmount$")
    public void userWantToEnterOwnAmount() {
        buyPrepaid.OwnAmount.clear();
        buyPrepaid.OwnAmount.sendKeys(VAS_DataFactory.OwnAirtimeAmount);
    }

    @And("^user clicks on buy$")
    public void userClicksOnBuy(){

        buyPrepaid.BuyBtn.click();
    }

//    @And("^buy button should be disabled$")
//    public void buyButtonShouldBeDisabled() {
//
//        boolean OwnAirtimeBuy = buyPrepaid.BuyBtn.isEnabled();
//        if (OwnAirtimeBuy == false) {
//            log.info("Ok button is Disabled");
//        }
//    }

    @Then("^Buy button should be enabled$")
    public void buyButtonShouldBeEnabled() {

        boolean OwnAirtimeBuy = buyPrepaid.BuyBtn.isEnabled();
        if (OwnAirtimeBuy == true) {
            log.info("Ok button is enabled");
        }
    }

    @And("^User want to crosscheck Own Amount details$")
    public void userWantToCrosscheckOwnAmountDetails() throws IOException {

        String RecipientName = buyPrepaid.RecipientRef.getAttribute("textContent");
        String[] str_array = RecipientName.split("\\s");
        int a = str_array.length;
        stringNumber = str_array[a-1];
        System.out.println("Recipient Number : " + stringNumber);
        String stringName = str_array[0];
        System.out.println(stringName);
//        if(stringName.equals(VAS_DataFactory.recipient)){
//            log.info("Recipient Name : " + stringName);
//        }

        //product Name
        String PrName = buyPrepaid.ProductRef.getAttribute("textContent");
        if(PrName.equals(ProductName)){
            log.info("Product Name : " + ProductName);
        }

        //Amount
        String Amount = buyPrepaid.AmountRef.getAttribute("textContent");
        if(VAS_DataFactory.OwnAirtimeAmount.equals(Amount)){
            log.info("Own Amount : " + Amount);
        }

        //Payment Reference
        utils.scrollToElement(buyPrepaid.PaymentRef);
        utils.TakeScreenCapture("PaymentScreen");
        String PayRef = buyPrepaid.PaymentRef.getAttribute("value");
        if(PayRef.isEmpty()){
            buyPrepaid.PaymentRef.sendKeys(VAS_DataFactory.payRef);
        }


    }

    @And("^User should see Buy successful message$")
    public void userShouldSeeBuySuccessfulMessage() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='successIcon']")));
        if(buyPrepaid.BuySuccess.isDisplayed()) {
            String SuccessMsg = buyPrepaid.BuySuccessMsg.getAttribute("textContent");
            log.info("Success Msg : " +SuccessMsg );
        }

    }

    @And("^user should navigate to Recent purchases screen$")
    public void userShouldNavigateToRecentPurchasesScreen() {
        if(buyPrepaid.PurchaseHistory.isDisplayed()){
            String HistoryDes = buyPrepaid.PurchaseHistoryDes.getAttribute("textContent");
            String HistoryNum = driver.findElement(By.xpath("(//span[@class='number-block'])[1]")).getAttribute("textContent");
            String[] str_array = HistoryNum.split("\\s");
            String stringNum = str_array[1];
            if(stringNumber.equals(str_array)) {
                log.info("New History Added : " + HistoryDes + "&" + stringNum);
            }
            log.info("Navigated to purchase history Successfully");
        }
    }

    @And("^User should see error message if enter wrong amount$")
    public void userShouldSeeErrorMessageIfEnterWrongAmount() {
        buyPrepaid.OwnAmount.sendKeys(VAS_DataFactory.OwnAirtimeWrongAmount);
        buyPrepaid.OwnAmountError.isDisplayed();

    }
}
