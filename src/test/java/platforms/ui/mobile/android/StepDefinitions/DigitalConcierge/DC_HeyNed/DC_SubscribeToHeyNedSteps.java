package platforms.ui.mobile.android.StepDefinitions.DigitalConcierge.DC_HeyNed;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.ui.WebDriverWait;
import platforms.ui.mobile.android.AndroidFlowModel.DC_HeyNedSubscription_Flow;
import utils.DriverFactory;

public class DC_SubscribeToHeyNedSteps extends DriverFactory {

    WebDriverWait wait = new WebDriverWait(getAndroidDriver(), 20);
    DC_HeyNedSubscription_Flow subscriptionFlow = new DC_HeyNedSubscription_Flow();

    @Given("^As a client I am logged into NedbankMoneyApp with Username \"([^\"]*)\" and Password \"([^\"]*)\"$")
    public void asAClientIAmLoggedIntoNedbankMoneyAppWithUsernameAndPassword(String username, String password) throws Exception {
        subscriptionFlow.LOGGED_INTO_NEDBANKMONEYAPP_WITH_USERNAME_AND_PASSWORD(username, password);
    }

    @When("^I navigate to HeyNed lifestyle assistant$")
    public void iNavigateToHeyNedLifestyleAssistant() {
        subscriptionFlow.NAVIGATE_TO_HEYNED_LIFESTYLE_ASSISTANT();
    }

    @And("^I navigate to Create your HeyNed profile screen$")
    public void iNavigateToCreateYourHeyNedProfileScreen() {
        subscriptionFlow.NAVIGATE_TO_CREATE_HEYNED_PROFILE();
    }

    @And("^I capture profile Name \"([^\"]*)\", Surname \"([^\"]*)\", Cellphone \"([^\"]*)\" and Email \"([^\"]*)\"$")
    public void iCaptureProfileNameSurnameCellphoneAndEmail(String name, String surname, String cellphone, String email) throws Exception {
        subscriptionFlow.CAPTURE_PROFILE_DETAILS(name, surname, cellphone, email);
    }

    @And("^I capture Nedbank card CVV number \"([^\"]*)\"$")
    public void iCaptureNedbankCardCVVNumber(String cardCVV) throws Exception {
        subscriptionFlow.CAPTURE_NEDBANK_CARD_CVV(cardCVV);
    }

    @Then("^I should land on the HeyNed service is active screen$")
    public void iShouldLandOnTheHeyNedServiceIsActiveScreen() {
        subscriptionFlow.SUBSCRIBE_TO_HEYNED();
    }

    @And("^I capture Add card name \"([^\"]*)\", number \"([^\"]*)\", MM/YY \"([^\"]*)\", CVV \"([^\"]*)\"$")
    public void iCaptureAddCardNameNumberMMYYCVV(String cardName, String cardNum, String cardMMYY, String cardCVV) throws Exception {
        subscriptionFlow.CAPTURE_CARD_DETAILS(cardName, cardNum, cardMMYY, cardCVV);
    }

    @Then("^I click on T&Css$")
    public void iClickOnTCss() {
        subscriptionFlow.SELECT_HEYNED_TERMS_AND_CONDITIONS();
    }
}
