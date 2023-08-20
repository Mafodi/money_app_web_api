package platforms.ui.mobile.ios.StepDefinitions.DigitalConcierge.HeyJude;

import cucumber.api.java.en.And;
import io.appium.java_client.MobileElement;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.ui.WebDriverWait;
import platforms.ui.mobile.ios.PageFactoryObject;
import platforms.ui.mobile.ios.StepDefinitions.DC_CommonFunctions;
import utils.CommonFunctions;
import utils.DriverFactory;

public class DC_HeyNedDeleteCard extends DriverFactory {


    private static Logger log = Logger.getLogger(DC_HeyNedDeleteCard.class);
    PageFactoryObject pageFactoryObj = new PageFactoryObject(driver);
    WebDriverWait wait = new WebDriverWait(driver, 60);
    private CommonFunctions common = new CommonFunctions();

    @And("^user selects card \"([^\"]*)\"and swipe on the card to delete$")
    public void userSelectsCardAndSwipeOnTheCardToDelete(String arg0) {
        try {
            MobileElement element = DC_CommonFunctions.GetCard(arg0);
            log.info("Deleted Card");
            DC_CommonFunctions.swipeLeftOnElement(element);

            MobileElement deleteBtn = driver.findElementByName("Delete");
            boolean isDeleteBtndisplayed = deleteBtn.isDisplayed();
            if (isDeleteBtndisplayed) {
                deleteBtn.click();
            }
        } catch (Exception ex) {
            log.warn(ex.getMessage());
        }
    }

    @And("^user can delete card$")
    public void userCanDeleteCard() {
    }
}
