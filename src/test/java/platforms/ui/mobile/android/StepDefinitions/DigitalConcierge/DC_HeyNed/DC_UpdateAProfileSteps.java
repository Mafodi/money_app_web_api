package platforms.ui.mobile.android.StepDefinitions.DigitalConcierge.DC_HeyNed;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.ui.WebDriverWait;
import platforms.ui.mobile.android.AndroidFlowModel.DC_HeyNedSettings_Flow;
import utils.DriverFactory;

public class DC_UpdateAProfileSteps extends DriverFactory {

    WebDriverWait wait = new WebDriverWait(getAndroidDriver(), 20);
    DC_HeyNedSettings_Flow nedSettingsFlow = new DC_HeyNedSettings_Flow();

    @When("^I navigate to HeyNed settings$")
    public void iNavigateToHeyNedSettings() {
        nedSettingsFlow.NAVIGATE_TO_HEYNED_SETTINGS();
    }

    @Then("^I update profile email address \"([^\"]*)\"$")
    public void iUpdateProfileEmailAddress(String emailAddress) throws Exception {
        nedSettingsFlow.UPDATE_PROFILE_EMAIL_ADDRESS(emailAddress);
    }
}
