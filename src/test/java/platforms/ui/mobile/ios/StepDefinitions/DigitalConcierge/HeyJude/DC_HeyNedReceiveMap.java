package platforms.ui.mobile.ios.StepDefinitions.DigitalConcierge.HeyJude;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.MobileElement;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.ui.WebDriverWait;
import platforms.ui.mobile.ios.PageFactoryObject;
import platforms.ui.mobile.ios.StepDefinitions.DC_CommonFunctions;
import utils.CommonFunctions;
import utils.DriverFactory;

public class DC_HeyNedReceiveMap extends DriverFactory {
    private static Logger log = Logger.getLogger(DC_HeyNedReceiveMap.class);
    PageFactoryObject pageFactoryObj = new PageFactoryObject(driver);
    WebDriverWait wait = new WebDriverWait(driver, 60);
    private CommonFunctions common = new CommonFunctions();
    String viewMapBtn ="//XCUIElementTypeStaticText[@name=\"viewMapButton\"])";


    @When("^Received a map from Hey Jude agent \"([^\"]*)\"$")
    public void receivedAMapFromHeyJudeAgent(String arg0) {
        MobileElement selectedTask =  DC_CommonFunctions.getIntoTask(arg0);
        common.secondsDelay(1);
    }

    @Then("^I clicked on the View on Maps Button to download map$")
    public void iClickedOnTheViewOnMapsButtonToDownloadMap() throws Throwable {
        try {
            if (pageFactoryObj.getTaskCreationScreen().mapDownloadBtn.size() > 0) {
                for (MobileElement element : pageFactoryObj.getTaskCreationScreen().mapDownloadBtn) {
                    element.click();
                    log.info("map downloaded");
                    common.secondsDelay(5);
                    return;
                }
            } else
                log.error("No image to download");
        }
        catch (Exception ex)
        {
            log.warn(ex.getMessage());
        }
    }
}
