package platforms.ui.mobile.ios.StepDefinitions.DigitalConcierge.HeyJude;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import io.appium.java_client.MobileElement;
import org.apache.log4j.Logger;
import platforms.ui.mobile.ios.PageFactoryObject;
import utils.CommonFunctions;
import utils.DriverFactory;
import java.util.List;

public class DC_HeyNedAddPaymentCard extends DriverFactory {
    private static Logger log = Logger.getLogger(DC_HeyNedAddPaymentCard.class);
    boolean noCardPresent = false;
    PageFactoryObject pageFactoryObj = new PageFactoryObject(driver);
    private CommonFunctions common = new CommonFunctions();

    @And("^user clicks on Payment methods screen$")
    public void userClicksOnPaymentMethodsScreen() {
        try {
            common.secondsDelay(4);
            if (pageFactoryObj.getHeyNedSettingScreen().paymentMethodOption.isEnabled()) {
                pageFactoryObj.getHeyNedSettingScreen().paymentMethodOption.click();
                log.info("Clicked on Payment option");
            }
        } catch (Exception ex) {
            log.warn(ex.getMessage());
        }
    }

    @And("^user can see the list of cards$")
    public void userCanSeeTheListOfCards() {
        try {
            common.secondsDelay(2);
            log.info("On Cards screen");
            if (pageFactoryObj.getPaymentCardScreen().PaymentOptionOnCardsScreen.isDisplayed()) {
                log.info("User is on Cards screen");
            }
        }
        catch (Exception ex) {
            log.warn(ex.getMessage());
        }
    }

    @And("^Select a nedbank card$")
    public void selectANedbankCard() {
        try {
            common.secondsDelay(1);
            if (pageFactoryObj.getPaymentCardScreen().nedbankCardsList.isDisplayed()) {
                pageFactoryObj.getPaymentCardScreen().nedbankCardsList.click();
                log.info("Nedbank Cards are present");
            } else {
                pageFactoryObj.getPaymentCardScreen().noNedbankCard.isDisplayed();
                noCardPresent = true;
                log.info("No Nedbank card present for loggedin user");
            }
        }
        catch (Exception ex)
        {
            log.warn(ex.getMessage());
        }
    }

    @And("^Enter CVV \"([^\"]*)\" and click Next button$")
    public void enterCVVAndClickNextButton(String arg0) {
        try {
            if (!noCardPresent) {
                pageFactoryObj.getPaymentCardScreen().cvvNumber.sendKeys(arg0);

                log.info("Click on Next button");
                //To hide keyboard, clicking on selected card
                pageFactoryObj.getPaymentCardScreen().cardNumber.click();
                pageFactoryObj.getPaymentCardScreen().addCardButton.click();
            }
        } catch (Exception ex) {
            log.warn(ex.getMessage());
        }
    }

    @And("^switch on the toggle button for Default card option$")
    public void switchOnTheToggleButtonForDefaultCardOption() throws Throwable {
        pageFactoryObj.getPaymentCardScreen().defaultCardBtn.click();
    }

    @Then("^card should be added as a default card$")
    public void cardShouldBeAddedAsADefaultCard() {
        try {
            if (!noCardPresent) {
                String CardListXpath = "//XCUIElementTypeApplication[@name=\"Money\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell";

                List<MobileElement> cardList = pageFactoryObj.getPaymentCardScreen().CardListXpath;
                log.info(cardList.size());

                String CardNameXpath = CardListXpath + "[" + cardList.size() + "]" + "/XCUIElementTypeStaticText[1]/following-sibling::XCUIElementTypeStaticText[2]";
                String cardName = driver.findElementByXPath(CardNameXpath).getText();
                log.info(cardName);
                List<MobileElement> isDefaultCard = pageFactoryObj.getPaymentCardScreen().rightTick;
                log.info(isDefaultCard.size());
                if (isDefaultCard.size() == 0)
                    log.info("Added card is a not default card");
                return;
            }
        } catch (Exception ex) {
            log.warn(ex.getMessage());
        }

    }


    @Then("^card should be added as a non default card$")
    public void cardShouldBeAddedAsANonDefaultCard() throws Throwable {
        try {
            wait(3);
            List<MobileElement> cardList = pageFactoryObj.getPaymentCardScreen().CardListXpath;
            log.info(cardList.size());
            List<MobileElement> isDefaultCard = pageFactoryObj.getPaymentCardScreen().rightTick;
            log.info(isDefaultCard.size());
            if (isDefaultCard.size() == 0)
                log.info("Added card is a not default card");
            return;
        } catch (Exception ex) {
            log.warn(ex.getMessage());
        }
    }
}
