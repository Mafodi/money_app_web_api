package platforms.ui.mobile.android.StepDefinitions.DigitalConcierge.DC_HeyNed;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.ui.WebDriverWait;
import platforms.ui.mobile.android.AndroidFlowModel.DC_HeyNedSettings_Flow;
import utils.DriverFactory;

public class DC_TermsAndConditionsSteps extends DriverFactory {

    WebDriverWait wait = new WebDriverWait(getAndroidDriver(), 60);
    DC_HeyNedSettings_Flow nedSettingsFlow = new DC_HeyNedSettings_Flow();

    @When("^I navigate to Review our terms and conditions screen$")
    public void iNavigateToReviewOurTermsAndConditionsScreen() throws Exception {
        nedSettingsFlow.NAVIGATE_TO_REVIEW_OUR_TERMS_AND_CONDITIONS_SCREEN();
    }

    @Then("^I review HeyNed terms and conditions$")
    public void iReviewHeyNedTermsAndConditions() throws Exception {
        nedSettingsFlow.NAVIGATE_TO_HEYNED_TERMS_AND_CONDITIONS();
    }
}
