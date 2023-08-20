package platforms.ui.Web.StepDefinitions;


import com.github.javafaker.Faker;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import platforms.ui.Web.Pages.VAS_Prepaid_BuyPrepaidPage;
import utils.Utils;

import java.io.IOException;

public class VAS_Prepaid_BuyPrepaidNewRecipientSteps extends Utils {
    private static Logger log = Logger.getLogger(VAS_Prepaid_BuyPrepaidNewRecipientSteps.class);
    public VAS_Prepaid_BuyPrepaidPage buyPrepaid = PageFactory.initElements(driver, VAS_Prepaid_BuyPrepaidPage.class);
    Utils utils = new Utils();
//    VAS_BundleSelectionSteps bundleSelectionSteps = new VAS_BundleSelectionSteps();

    Faker faker = new Faker();
    public String name = faker.name().fullName();

//    @And("^User want to add \"([^\"]*)\"$")
//    public void userWantToAdd(String arg0){
//        //ExtentTestManager.getTest().log(Status.INFO, "User want to add new recipient");
//        buyPrepaid.RecipientInput.sendKeys(name);
//    }
//
//    @And("^User enter \"([^\"]*)\"$")
//    public void userEnter(String arg0) throws IOException {
//        //ExtentTestManager.getTest().log(Status.INFO, "User want to add Mobile number");
//        buyPrepaid.RecipientMobileNum.sendKeys(utils.randomMobileNum());
//
//    }


//    @And("^User want to crosscheck new Recipient details$")
//    public void userWantToCrosscheckNewRecipientDetails() {
//        //ExtentTestManager.getTest().log(Status.INFO, "User want to add Mobile number");
//        String RecipientName = driver.findElement(By.id(VAS_AndroidObjects.RecipientNameCheck)).getAttribute("text");
//        System.out.println(RecipientName);
//        String[] str_array = RecipientName.split("\\s");
//        String stringA = str_array[3];
//        System.out.println(stringA);
//        if(RecipientName.equals(name)){
//            log.info("Correct Recipient Name");
//        }
//
//        //Product Price
//        String productPrice = driver.findElement(By.id(VAS_AndroidObjects.PriceCheck)).getAttribute("text");
//        System.out.println(productPrice);
//        if(productPrice.equals(bundleSelectionSteps.ProductPrice)){
//            log.info("Correct Product Price");
//        }
//
//        //Payment Reference
//        String PayRef = buyPrepaid.PaymentRef.getAttribute("textContent");
//        if(PayRef.isEmpty()){
//            buyPrepaid.PaymentRef.sendKeys(VAS_DataFactory.payRef);
//        }


//    }
}
