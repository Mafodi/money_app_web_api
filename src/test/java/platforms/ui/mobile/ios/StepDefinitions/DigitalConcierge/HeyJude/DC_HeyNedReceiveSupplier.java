package platforms.ui.mobile.ios.StepDefinitions.DigitalConcierge.HeyJude;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import io.appium.java_client.MobileElement;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.ui.WebDriverWait;
import platforms.ui.mobile.ios.PageFactoryObject;
import platforms.ui.mobile.ios.StepDefinitions.DC_CommonFunctions;
import utils.CommonFunctions;
import utils.DriverFactory;

public class DC_HeyNedReceiveSupplier extends DriverFactory {

    private static Logger log = Logger.getLogger(DC_HeyNedReceiveSupplier.class);
    PageFactoryObject pageFactoryObj = new PageFactoryObject(driver);
    WebDriverWait wait = new WebDriverWait(driver, 60);
    private CommonFunctions common = new CommonFunctions();

    @And("^Received a supplier details from Hey Jude agent for task \"([^\"]*)\"$")
    public void receivedASupplierDetailsFromHeyJudeAgentForTask(String arg0){
        MobileElement selectedTask =  DC_CommonFunctions.getIntoTask(arg0);
    }

    @And("^I can see the supplier details with description$")
    public void iCanSeeTheSupplierDetailsWithDescription() {
        try {
            pageFactoryObj.getTaskCreationScreen().supplierName.getText();
            pageFactoryObj.getTaskCreationScreen().supplierAddress.getText();
            pageFactoryObj.getTaskCreationScreen().supplierDirection.getText();
            pageFactoryObj.getTaskCreationScreen().supplierPhoneNumber.getText();
            common.secondsDelay(4);
        }catch (Exception ex)
        {
            log.warn(ex.getMessage());
        }
    }

    @Then("^If more than one supplier is present, i can swipe supplier$")
    public void ifMoreThanOneSupplierIsPresentICanSwipeSupplier() {
        DC_CommonFunctions.swipeleftiOS();
    }
}
