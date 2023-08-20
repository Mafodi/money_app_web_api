package platforms.ui.mobile.android.StepDefinitions.DigitalConcierge.DC_HeyNed;

import cucumber.api.java.en.Then;
import org.openqa.selenium.support.ui.WebDriverWait;
import platforms.ui.mobile.android.AndroidFlowModel.DC_HeyNedPayment_Flow;
import utils.DriverFactory;

public class DC_SettingsPaymentMethodsSteps extends DriverFactory {

    WebDriverWait wait = new WebDriverWait(getAndroidDriver(), 20);
    DC_HeyNedPayment_Flow paymentFlow = new DC_HeyNedPayment_Flow();

    @Then("^I capture Name displayed on card \"([^\"]*)\", Card number \"([^\"]*)\", Card MM/YY \"([^\"]*)\", Card CVV \"([^\"]*)\"$")
    public void iCaptureNameDisplayedOnCardCardNumberCardMMYYCardCVV(String cardName, String cardNumber, String cardMMYY, String cardCVV) throws Exception {
        paymentFlow.ADD_ADDITIONAL_CARD_THROUGH_HEYNED_SETTINGS(cardName, cardNumber, cardMMYY, cardCVV);
    }

    @Then("^I add the card as Payment method$")
    public void iAddTheCardAsPaymentMethod() {
        paymentFlow.PROCESS_ADD_ADDITIONAL_CARD_HEYNED_SETTINGS();
    }

    @Then("^I set the added card as default$")
    public void iSetTheAddedCardAsDefault() {
        paymentFlow.SET_CARD_AS_DEFAULT();
    }

    @Then("^I delete a card$")
    public void iDeleteACard() {
        paymentFlow.DELETE_CARD_HEYNED_SETTINGS();
    }
}
