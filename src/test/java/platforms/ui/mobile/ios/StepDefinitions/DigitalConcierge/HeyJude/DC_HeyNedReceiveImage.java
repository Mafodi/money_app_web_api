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

public class DC_HeyNedReceiveImage extends DriverFactory {

    private static Logger log = Logger.getLogger(DC_HeyNedReceiveImage.class);
    PageFactoryObject pageFactoryObj = new PageFactoryObject(driver);
    WebDriverWait wait = new WebDriverWait(driver, 60);
    private CommonFunctions common = new CommonFunctions();

    @And("^Received a image from Hey Jude agent \"([^\"]*)\"$")
    public void receivedAImageFromHeyJudeAgent(String arg0) {
        MobileElement selectedTask =  DC_CommonFunctions.getIntoTask(arg0);
    }

    @Then("^The image should be downloaded and download button should be no longer exists$")
    public void theImageShouldBeDownloadedAndDownloadButtonShouldBeNoLongerExists() {
        try {
            if (pageFactoryObj.getTaskCreationScreen().imageDownloadBtn.size() > 0) {
                for (MobileElement element : pageFactoryObj.getTaskCreationScreen().imageDownloadBtn) {
                    element.click();
                    log.info("Image downloaded");
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
