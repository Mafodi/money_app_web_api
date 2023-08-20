package platforms.ui.mobile.android.StepDefinitions.DigitalConcierge.DC_HeyNed;

import cucumber.api.java.en.Then;
import org.openqa.selenium.support.ui.WebDriverWait;
import platforms.ui.mobile.android.AndroidFlowModel.DC_HeyNedPayment_Flow;
import utils.DriverFactory;

public class DC_MakeAPaymentSteps extends DriverFactory {

    WebDriverWait wait = new WebDriverWait(getAndroidDriver(), 20);
    DC_HeyNedPayment_Flow paymentFlow = new DC_HeyNedPayment_Flow();

    @Then("^Process a default card payment$")
    public void processADefaultCardPayment() {
        paymentFlow.PROCESS_A_DEFAULT_CARD_PAYMENT();
    }

    @Then("^Process a Nedbank card payment using \"([^\"]*)\"$")
    public void processANedbankCardPaymentUsing(String cvv) throws Exception {
        paymentFlow.PROCESS_A_NEDBANK_CARD_PAYMENT(cvv);
    }

    @Then("^Process a load card payment using Card Name \"([^\"]*)\", Card Number \"([^\"]*)\", MM/YY \"([^\"]*)\" and CVV \"([^\"]*)\"$")
    public void processALoadCardPaymentUsingCardNameCardNumberMMYYAndCVV(String cardName, String cardNumber, String cardMMYY, String cardCVV) throws Exception {
        paymentFlow.PROCESS_A_LOAD_CARD_PAYMENT(cardName, cardNumber, cardMMYY, cardCVV);
    }
}
