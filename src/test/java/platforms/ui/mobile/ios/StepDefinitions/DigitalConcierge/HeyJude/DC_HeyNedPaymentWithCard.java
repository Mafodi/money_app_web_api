package platforms.ui.mobile.ios.StepDefinitions.DigitalConcierge.HeyJude;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import io.appium.java_client.MobileElement;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.ui.WebDriverWait;
import platforms.ui.mobile.ios.PageFactoryObject;
import platforms.ui.mobile.ios.StepDefinitions.DC_CommonFunctions;
import utils.CommonFunctions;
import utils.DriverFactory;

import java.util.Map;
import java.util.Set;

import static platforms.ui.mobile.ios.StepDefinitions.DC_CommonFunctions.getElement;

public class DC_HeyNedPaymentWithCard extends DriverFactory {

    private static Logger log = Logger.getLogger(DC_HeyNedPaymentWithCard.class);
    PageFactoryObject pageFactoryObj = new PageFactoryObject(driver);
    WebDriverWait wait = new WebDriverWait(driver, 60);
    private CommonFunctions common = new CommonFunctions();
    MobileElement selectedTask = null;

    String paymentElement = "//XCUIElementTypeApplication[@name=\"Money\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]";

    @And("^Received a payment from Hey Jude agent \"([^\"]*)\"$")
    public void receivedAPaymentFromHeyJudeAgent(String arg0) throws Throwable {
        try {
            String Amount = null;
            //Go into the selected task
            Map<MobileElement, Integer> selectedElement = DC_CommonFunctions.GetSelectedTask(arg0, false);
            Set<MobileElement> element = selectedElement.keySet();
            for (MobileElement key : selectedElement.keySet()) {
                if (key != null) {
                    selectedTask = key;
                    selectedTask.click();
                    log.info("Got the selected task");
                } else
                    log.error("No task found for bubble");
            }

            String PaymentTitle = getElement(paymentElement).getText();
            if (PaymentTitle.equalsIgnoreCase("Payment"))
                log.info("payment is available");
            else
                log.error("Payment is not available");
            String PaymentAmount = paymentElement + "/following-sibling::XCUIElementTypeStaticText[6]";

            Amount = getElement(PaymentAmount).getText();
            log.info(Amount);
            common.secondsDelay(4);
        }catch (Exception ex)
        {
            log.warn(ex.getMessage());
        }
    }

    @Then("^click on Pay now button$")
    public void clickOnPayNowButton() throws Throwable {
        pageFactoryObj.getPaymentScreen().payNowButton.click();
        common.secondsDelay(4);
    }

    @And("^I should redirect to Payment screen$")
    public void iShouldRedirectToPaymentScreen() throws Throwable {
        try {
            if (pageFactoryObj.getPaymentScreen().paymentScreenTitle.isDisplayed()) {
                log.info("User is on Payment screen");
            }
        }catch (Exception e) {
            log.error(e.getMessage());
            log.error("user is not on Payment screen");
        }
        common.secondsDelay(4);
    }



    @And("^No card is available for Payment$")
    public void noCardIsAvailableForPayment() throws Throwable {
        try {
            if (pageFactoryObj.getPaymentScreen().noCardAddedMessage.size() > 0) {
                log.info("Card is not present for payment");
                pageFactoryObj.getPaymentScreen().payNowOnPaymentScreen.click();
                common.secondsDelay(2);
            }
        }catch (Exception ex)
        {
            log.warn(ex.getMessage());
        }
    }


    @And("^click on Add Card button$")
    public void clickOnAddCardButton() throws Throwable {
        pageFactoryObj.getPaymentCardScreen().addCardButton.click();
        common.secondsDelay(2);
    }

//    @Then("^Click on Added card$")
//    public void clickOnAddedCard() throws Throwable {
//        String AddedCard = "//XCUIElementTypeApplication[@name=\"Money\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell";
//        getElement(AddedCard).click();
//        log.info("click on Added card");
//    }


    @Then("^click on Pay now button of Payment screen$")
    public void clickOnPayNowButtonOfPaymentScreen() throws Throwable {
        pageFactoryObj.getPaymentScreen().payNowOnPaymentScreen.click();
        common.secondsDelay(4);
    }

    @And("^Payment should be successful$")
    public void paymentShouldBeSuccessful() throws Throwable {
        //user should land on Done screen
        if(pageFactoryObj.getPaymentScreen().doneButton.isDisplayed())
        {
            log.info("Payment Successful");
        }
        common.secondsDelay(4);
    }

    @Then("^click on Done button$")
    public void clickOnDoneButton() throws Throwable {
        pageFactoryObj.getPaymentScreen().doneButton.click();
        common.secondsDelay(4);
    }


    @And("^User should redirect to Task and Payment status changes to Paid$")
    public void userShouldRedirectToTaskAndPaymentStatusChangesToPaid() throws Throwable {
        if(pageFactoryObj.getPaymentScreen().payNowButton.getText().equalsIgnoreCase("Payment successful"))
            log.info("payment Successful");
        else
            log.error("Payment failed");
        common.secondsDelay(4);

    }


    @And("^select nedbank card to make payment$")
    public void selectNedbankCardToMakePayment() throws Throwable {
      boolean cardAdded =  DC_CommonFunctions.CheckAvailabilityOfCards();
      if(cardAdded)
      {
          pageFactoryObj.getPaymentScreen().addPaymentMethosBtnOnHeyNed.click();
      }
      else
      {
          pageFactoryObj.getPaymentScreen().addedCard.click();
      }
    }

    @And("^click added card or click Add payment method to add card$")
    public void clickAddedCardOrClickAddPaymentMethodToAddCard() throws Throwable {
        boolean cardAdded =  DC_CommonFunctions.CheckAvailabilityOfCards();
        if(cardAdded == false)
        {
            log.info("Proceed with payment");
            pageFactoryObj.getPaymentScreen().addPaymentMethosBtnOnHeyNed.click();
        }
        else
        {
            log.info("Add another card for payment");
            pageFactoryObj.getPaymentScreen().addedCard.click();
        }
    }
}
