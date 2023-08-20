package platforms.ui.mobile.android.StepDefinitions.DigitalConcierge.DC_HeyNed;

import cucumber.api.java.en.Then;
import org.openqa.selenium.support.ui.WebDriverWait;
import platforms.ui.mobile.android.AndroidFlowModel.DC_HeyNedTask_Flow;
import utils.DriverFactory;

public class DC_ReceiveSupplierSteps extends DriverFactory {

    WebDriverWait wait = new WebDriverWait(getAndroidDriver(), 20);
    DC_HeyNedTask_Flow nedTaskFlow = new DC_HeyNedTask_Flow();

    @Then("^I receive a supplier$")
    public void iReceiveASupplier() {
        nedTaskFlow.RECEIVE_HEYNED_SUPPLIER();
    }
}
