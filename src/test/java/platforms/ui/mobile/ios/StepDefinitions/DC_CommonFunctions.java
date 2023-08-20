package platforms.ui.mobile.ios.StepDefinitions;

import io.appium.java_client.MobileElement;
import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import platforms.ui.mobile.ios.PageFactoryObject;
import utils.DriverFactory;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class DC_CommonFunctions extends DriverFactory {

    private static Logger log = Logger.getLogger(DC_CommonFunctions.class);
    public static HashMap<MobileElement, Integer> maps = new HashMap<>();
    public static PageFactoryObject pageFactoryObj = new PageFactoryObject(driver);
    WebDriverWait wait = new WebDriverWait(driver, 60);

    public static void swipeleftiOS() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        HashMap scrollObject = new HashMap();
        scrollObject.put("direction", "left");
        js.executeScript("mobile: swipe", scrollObject);
    }

    public static void swipedowniOS() {
        try {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            HashMap<String, Object> scrollObject = new HashMap<>();
            scrollObject.put("direction", "up");
            //scrollObject.put("element", ((MobileElement) element).getId());
            js.executeScript("mobile: swipe", scrollObject);
            log.info("Swipe up was Successfully done.");
        } catch (Exception e) {
            log.warn("Swipe up was not done." +  e.getMessage());
        }
    }

    public static void swipeLeftOnElement(MobileElement element) {
        JavascriptExecutor js = (JavascriptExecutor)driver;
        HashMap scrollObject = new HashMap();
        scrollObject.put("direction", "left");
        scrollObject.put("element", (element).getId());
        js.executeScript("mobile: swipe", scrollObject);
    }

    public static void chat_icon_on_overview_page() {
        try {
            pageFactoryObj.getOverviewScreenLocator().chatButton.click();
            log.info("Clicked on chat icon");
        }
        catch (Exception ex)
        {
            log.warn(ex.getMessage());
        }
    }

    public static void dataUsage() {
        try {
            if (pageFactoryObj.getDataUsageScreenLocator().dataUsageIcon.size() > 0) {
                log.info("Data usage screen is visible");
                if (pageFactoryObj.getDataUsageScreenLocator().nextBtnDataUsageScreen.isDisplayed()) {
                    pageFactoryObj.getDataUsageScreenLocator().nextBtnDataUsageScreen.click();
                } else
                    log.info("Error message occurred");
            } else
                log.warn("Data usage screen is not visible");
        } catch (Exception ex) {
            log.warn(ex.getMessage());
        }
    }


    public static void EducationalScreenflow() {
        try {
            if (driver.findElementsByName("lifestyleWalkThrough1").size() > 0) //It means educational screen gets displayed
            {
                DC_CommonFunctions.swipeleftiOS();
                DC_CommonFunctions.swipeleftiOS();
                log.info("Education screen is done");
            }
            log.info("Education screen is already done");
        }catch (Exception ex) {
            log.warn(ex.getMessage());
        }
    }

    public static void ClickOnGetStartedButton() {
        if (driver.findElementsByName("Get started").size() > 0)
            driver.findElementsByName("Get started").get(0).click();
    }

    public static MobileElement getIntoTask(String arg0) {
        MobileElement selectedTask = null;

        try {
            Map<MobileElement, Integer> task = GetSelectedTask(arg0, false);
            Set<MobileElement> element = task.keySet();
            for (MobileElement key : task.keySet()) {
                if (key != null) {
                    selectedTask = key;
                    selectedTask.click();
                    //TODO- Need to do it on Monday
                    log.info("Got the selected task");
                } else
                    log.error("No task found for bubble");
            }
        }
        catch (Exception ex)
        {
            log.warn(ex.getMessage());
        }
        return selectedTask;
    }

    public static  Map<MobileElement, Integer> GetSelectedTask(String textbeingSearched, boolean isClosed) {
        try {
            EnterTaskName(textbeingSearched);

           log.info("after click of search icon");
            MobileElement selectedTask = null;

            String SearchResult = "//XCUIElementTypeApplication[@name=\"Money\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell";
            List<MobileElement> searchlist = driver.findElementsByXPath(SearchResult);

            if (searchlist.size() > 0) {
                String iterateTask = "//XCUIElementTypeApplication[@name=\"Money\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[";
                log.info("List size - "+ searchlist.size());

                for (int i = 1; i <= searchlist.size(); i++) {
                    String text = iterateTask + i + "]" + "/XCUIElementTypeStaticText[1]/following-sibling::XCUIElementTypeStaticText";
                    String status_Xpath = iterateTask + i + "]" + "/XCUIElementTypeStaticText[2]/following-sibling::XCUIElementTypeStaticText";
                    String status = getElement(status_Xpath).getText();
                    if ((driver.findElementByXPath(text).getText().toLowerCase()).contains((textbeingSearched).toLowerCase())) {
                        {
                            if (isClosed) {
                                if (status.equalsIgnoreCase("Cancelled")) {
                                    //should get cancelled task
                                    log.info("Cancelled Task name is matching with searched text");
                                    selectedTask = driver.findElementByXPath(iterateTask + searchlist.size() + "]");
                                    maps.put(selectedTask, i);
                                    return maps;
                                } else continue;
                            } else {
                                //pending task here
                                log.info("Opened Task name is matching with searched text");
                                selectedTask = driver.findElementByXPath(iterateTask + i + "]");
                                maps.put(selectedTask, i);
                                return maps;
                            }
                        }
                    } else
                        log.error("Task name is not matching with searched text");
                }
            } else {
                NoTaskFound();
            }
        }
        catch (Exception ex)
        {
            log.warn(ex.getMessage());
        }
        return maps;
    }

    private static void EnterTaskName(String textbeingSearched) {
        try {
            Thread.sleep(5);
            log.info("Serach icon visible");
            driver.findElementByXPath("//*[@name=\"Task list\"]/XCUIElementTypeButton[2]").click();
            driver.findElementById("SearchedTextBox").click();
            driver.findElementById("SearchedTextBox").clear();
            driver.findElementById("SearchedTextBox").sendKeys(textbeingSearched);
            log.info("Search icon clicked done");
        } catch (Exception ex) {
            log.warn("Exception is in EnterTaskName function " + ex.getMessage());
        }

    }

    public static void NoTaskFound() {
        if (pageFactoryObj.getTaskCreationScreen().noTaskMatching.size() > 0)
            log.error("No result found for searched text");
        else {
            if (pageFactoryObj.getTaskCreationScreen().emptyList.size() > 0)
                log.info("List is Empty");
            else
                log.error("Task already present.");
        }
    }

    public static void OnTaskCreationScreen() {
        try {

            if (pageFactoryObj.getTaskCreationScreen().taskListTitle.isDisplayed()) {
                log.info("User is on Task List");
            } else {
                log.info("User is not on Task List");
            }
        }catch (Exception ex)
        {
            log.error(ex.getMessage());
        }
    }

    public static MobileElement getElement(String xpath) {
        MobileElement element = null;
        try {
            element = driver.findElementByXPath(xpath);
        } catch (Exception e) {
            log.error(e.getMessage());
            System.out.println(e.getMessage());
        }
        return element;
    }


    //Card related functions

    public static MobileElement GetCard(String TaskName) {
        try {
            int reNameCardIndex = 0;

            String CardListXpath = "//XCUIElementTypeApplication[@name=\"Money\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell";
            String rightTick = "//XCUIElementTypeImage[@name=\"lifestyleDefaultCheck\"]";

            List<MobileElement> cardList = driver.findElementsByXPath(CardListXpath);

            log.info("Size" + cardList.size());
            for (int i = 1; i <= cardList.size(); i++) {
                String CardNameXpath = CardListXpath + "[" + i + "]" + "/XCUIElementTypeStaticText[1]/following-sibling::XCUIElementTypeStaticText[1]";
                String cardName = driver.findElementByXPath(CardNameXpath).getText();
                log.info(cardName);
                if (cardName.equalsIgnoreCase(TaskName)) {
                    reNameCardIndex = i;
                    log.info("Card Name matches");
                    return driver.findElementByXPath(CardListXpath + "[" + i + "]");

                }
            }
            log.error("Card Name doent matches");
        }
        catch (Exception ex)
        {
            log.warn(ex.getMessage());
        }
        return null;
    }


    public static boolean CheckAvailabilityOfCards() {

        Boolean isCardPresent = false;
        try {
            if (pageFactoryObj.getPaymentScreen().noCardAddedMessage.size()> 0) {
                isCardPresent = false;
                // getElement(CardToPay).click();
                log.info("Card is not present for payment");
            } else {
                isCardPresent = true;
                log.info("Card is present for payment");
            }
        }
        catch (Exception ex)
        {
            log.warn(ex.getMessage());
        }
        return isCardPresent;
    }

    public static void AddCardDetails(String cardName, String cardNumber, String expDate, String cvvNumber) {
        try {
            pageFactoryObj.getPaymentCardScreen().cardName.sendKeys(cardName);
            pageFactoryObj.getPaymentCardScreen().cardNumber.sendKeys(cardNumber);
            pageFactoryObj.getPaymentCardScreen().cardDate.sendKeys(expDate);
            pageFactoryObj.getPaymentCardScreen().cvvNumber.sendKeys(cvvNumber);
            //TO hide keyboard, did nelow code
            pageFactoryObj.getPaymentCardScreen().cardName.click();
            driver.hideKeyboard();
        }
        catch (Exception ex)
        {
            log.warn(ex.getMessage());
        }
    }
}