package platforms.ui.mobile.android.StepDefinitions.DigitalConcierge.DC_HeyNed;

import cucumber.api.java.en.Then;
import org.openqa.selenium.support.ui.WebDriverWait;
import platforms.ui.mobile.android.AndroidFlowModel.DC_HeyNedTask_Flow;
import utils.DriverFactory;

public class DC_ReceiveImageSteps extends DriverFactory {

    WebDriverWait wait = new WebDriverWait(getAndroidDriver(), 20);
    DC_HeyNedTask_Flow taskFlow = new DC_HeyNedTask_Flow();

    @Then("^I receive a map location$")
    public void iReceiveAMapLocation() {
        taskFlow.RECEIVE_HEYNED_MAP_LOCATION();
    }
}
