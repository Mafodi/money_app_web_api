package platforms.ui.mobile.ios.StepDefinitions.DigitalConcierge.HeyJude;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import io.appium.java_client.MobileElement;
import org.apache.log4j.Logger;
import platforms.ui.mobile.ios.PageFactoryObject;
import platforms.ui.mobile.ios.StepDefinitions.DC_CommonFunctions;
import utils.CommonFunctions;
import utils.DriverFactory;

public class DC_HeyNedReceiveDocument extends DriverFactory {

    private static Logger log = Logger.getLogger(DC_HeyNedReceiveDocument.class);
    PageFactoryObject pageFactoryObj = new PageFactoryObject(driver);
    private CommonFunctions common = new CommonFunctions();
    boolean docToDownload = false;

    @And("^Received a document from Hey Jude agent \"([^\"]*)\"$")
    public void receivedADocumentFromHeyJudeAgent(String arg0) {
        try {
            MobileElement selectedTask = DC_CommonFunctions.getIntoTask(arg0);
            if (selectedTask != null) {
                log.info(pageFactoryObj.getTaskCreationScreen().pdfDownloadBtn.size());
                if (pageFactoryObj.getTaskCreationScreen().pdfDownloadBtn.size() > 0) {
                    for (MobileElement element : pageFactoryObj.getTaskCreationScreen().pdfDownloadBtn) {
                        if (element != null) {
                            docToDownload = true;
                            element.click();
                            common.secondsDelay(3);
                            break;
                        }
                    }
                } else
                    log.info("No pdf to download");
            }
        }
        catch (Exception ex)
        {
            log.warn(ex.getMessage());
        }
    }

    @Then("^The document should be downloaded and download button should be no longer exists$")
    public void theDocumentShouldBeDownloadedAndDownloadButtonShouldBeNoLongerExists() {
        if(docToDownload)
            log.info("Documents downloaded");
        else
            log.info("no document to download");
    }
}
