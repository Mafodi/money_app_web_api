package platforms.ui.mobile.ios.StepDefinitions.DigitalConcierge.LiveChat;

import cucumber.api.java.en.And;
import io.appium.java_client.MobileElement;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.ui.WebDriverWait;
import platforms.ui.mobile.ios.PageFactoryObject;
import utils.CommonFunctions;
import utils.DriverFactory;

import java.util.List;

public class DC_LiveChatRatingToAgent extends DriverFactory {

    private static Logger log = Logger.getLogger(DC_UnAuthLiveChat.class);
    PageFactoryObject pageFactoryObj = new PageFactoryObject(driver);
    WebDriverWait wait = new WebDriverWait(driver, 60);
    MobileElement taskToCancel = null;
    private CommonFunctions common = new CommonFunctions();

    boolean isEgentConnected =false;


    @And("^user can see NPS form to provide rating to Agent$")
    public void userCanSeeNPSFormToProvideRatingToAgent() {

        if (pageFactoryObj.getUnauthChatScreenLocatos().ratingTitle1.size() > 1) {
            System.out.println("Agent is connected");
            isEgentConnected = true;
        }
        else
            log.info("Agent was not connected");
    }

    @And("^user can provide rating to an agent Agent on first form$")
    public void userCanProvideRatingToAnAgentAgentOnFirstForm() {
        if(isEgentConnected) {
            List<MobileElement> stars = driver.findElementsByName("nps empty star");
            for (int i = 1; i < stars.size(); i++) {
                stars.get(i).click();
            }
        }
        else
            log.info("Agent was not connected");
    }

    @And("^user can provide rating on second form as well$")
    public void userCanProvideRatingOnSecondFormAsWell() {
        if (isEgentConnected) {
            if (pageFactoryObj.getUnauthChatScreenLocatos().ratingTitle2.isDisplayed()) {
                System.out.println("user is on second form for rating");
            }

            List<MobileElement> stars = driver.findElementsByName("nps empty star");
            for (int i = 1; i < 3; i++) {
                stars.get(i).click();
            }

            pageFactoryObj.getUnauthChatScreenLocatos().commentBox.click();
            pageFactoryObj.getUnauthChatScreenLocatos().commentBox.sendKeys("Good one");
        } else
            log.info("Agent was not connected");
    }
}
