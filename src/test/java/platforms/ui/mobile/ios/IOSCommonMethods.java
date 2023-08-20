package platforms.ui.mobile.ios;

import com.cucumber.listener.Reporter;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.DriverFactory;
import utils.Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.PointOption.point;
import static java.time.Duration.ofMillis;

public class IOSCommonMethods extends DriverFactory {
    private WebDriverWait wait;
    private String propertyFile = "./Framework.properties";
    private Utils mainUtility = new Utils();
    public Logger logger = Logger.getLogger(IOSCommonMethods.class);


    public void doApplicationAccess(AppiumDriver driver, String accessType) {

        String interfaceType = mainUtility.getConfigPropertyValue(propertyFile, "appInterface");

        if (accessType == "Register") {
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            logger.info("########  I can see register flag");
            driver.findElementByAccessibilityId(IOSObjects.CONTINUE_WITH_THIS_VERSION_XPATH).click();

            if (interfaceType.equalsIgnoreCase("OLD")) {

                /**
                 * if register page is the first page seen
                 * On this page you will find 2 button **--I'm a client--** and **--Become a client--**
                 */

                logger.info("Using old interface here :::::");
                driver.findElement(By.xpath(IOSObjects.GET_STARTED_BUTTON)).click();
                driver.findElement(By.xpath(IOSObjects.LOGIN_NEDBANK_ID_BUTTON_IOS)).click();
                driver.findElement(By.xpath(IOSObjects.PROFILE_USERNAME)).sendKeys(IOSObjects.PROFILE_USERNAME);
                driver.hideKeyboard();
                driver.findElement(By.xpath(IOSObjects.PROFILE_PASSWORD)).sendKeys(IOSDataFactory.PROFILE_PASSWORD);
                driver.hideKeyboard();
                driver.findElement(By.xpath(IOSObjects.PROFILE_REG_CONTINUE_BUTTON)).click();
                driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
            } else {

                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                logger.info("Using new interface here :::::");
                driver.findElementByAccessibilityId(IOSObjects.I_AM_A_ClLIENT_IOS).click();
                driver.findElementByAccessibilityId(IOSObjects.I_DONT_HAVE_A_CARD_IOS).click();
                driver.findElementByAccessibilityId(IOSObjects.NED_ID_NAV).click();

                driver.findElement(By.xpath(IOSObjects.NEW_ENROLEMENT_USERNAME_FIELD)).sendKeys(IOSDataFactory.PROFILE_USERNAME);
                driver.hideKeyboard();
                driver.findElement(By.xpath(IOSObjects.NEW_ENROLEMENT_PASSWORD_FIELD)).sendKeys(IOSDataFactory.PROFILE_PASSWORD);
                driver.hideKeyboard();
                driver.findElementByAccessibilityId(IOSObjects.NEW_ENROLEMENT_TERMS_AND_CONDITION_CHECKBOX).click();
                driver.findElementByAccessibilityId(IOSObjects.NEW_ENROLEMENT_NEXT_BUTTON).click();
                driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
                driver.findElementByAccessibilityId(IOSObjects.NEW_ENROLMENT_CANCEL_CREATE_PIN).click();
                driver.findElementByAccessibilityId(IOSObjects.NEW_ENROLMENT_PROFILE_PAGE_OK_BUTTON).click();
            }


            /**
             * log out functions
             */
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.findElementByAccessibilityId(IOSObjects.CONTINUE_WITH_THIS_VERSION_XPATH).click();
            scrollPage("down");
            MobileElement logOutButton = (MobileElement) driver.findElementByAccessibilityId(IOSObjects.LOG_OUT_BUTTON);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            logOutButton.click();
        } else if (accessType == "Login") {
            /**
             * if register page is not the first page seen
             */
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.findElementByAccessibilityId(IOSObjects.CONTINUE_WITH_THIS_VERSION_XPATH).click();
        } else {
            logger.info("\nNo access type found now");
        }

    }

    public void acceptAlertRequest(AppiumDriver driver) {
        try {
            wait.until(ExpectedConditions.alertIsPresent());
            driver.switchTo().alert().accept();
        } catch (Exception e) {
            System.err.println("no alert visible after " + 15 + " sec.");
        }
    }

    /*
     * Delay time in seconds to pause or hold for some page objects to load takes
     * only integer value of number of seconds to pause
     *
     */


    public void scrollPage(String direction) {
        HashMap<String, String> pageScroll = new HashMap<String, String>();
        pageScroll.put("direction", direction);
        driver.executeScript("mobile: scroll", pageScroll);
    }

    public void swipeElement(MobileElement elementToSwipe, String direction) {
        Map<String, Object> params = new HashMap<>();
        params.put("direction", direction);
        params.put("element", ((MobileElement) elementToSwipe).getId());
        driver.executeScript("mobile: swipe", params);
    }


    /**
     * This flips the checkbox off and on to validate that the checkbox is active
     *
     * @param checkboxToValidate
     */
    public void validateCheckboxIsClickable(MobileElement checkboxToValidate) {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        checkboxToValidate.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        checkboxToValidate.click();
    }


    public void clickDoneOrReturnButtonToHideKeyBoard() {
        try {
            int size = driver.findElements(By.xpath(IOSObjects.PERSONAL_DETAILS_OPTIONS_DONE_BUTTON)).size();
            if (size > 0) {
                driver.findElement(By.xpath(IOSObjects.PERSONAL_DETAILS_OPTIONS_DONE_BUTTON)).click();
            } else {
                driver.hideKeyboard();
            }
        } catch (Exception ex) {
            logger.info(ex.getStackTrace());
        }
    }

    public void swipe(int startx, int starty, int endx, int endy, int duration) {
        new TouchAction(driver).press(PointOption.point(startx, starty)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(duration))).
                moveTo(PointOption.point(endx, endy)).release().perform();

    }

    public void horizontalSwipeByPercentage(double startPercentage, double endPercentage, double anchorPercentage) {
        Dimension size = driver.manage().window().getSize();
        int anchor = (int) (size.height * anchorPercentage);
        int startPoint = (int) (size.width * startPercentage);
        int endPoint = (int) (size.width * endPercentage);

        new TouchAction(driver)
                .press(point(startPoint, anchor))
                .waitAction(waitOptions(ofMillis(1000)))
                .moveTo(point(endPoint, anchor))
                .release().perform();
    }


    public static int phoneNumberGenerator() {

        //Random randomGenerator = new Random();
        //int randomInt = randomGenerator.nextInt(3) + 1;


        String[] arr = {"082", "063", "079", "061", "073"};

        Random phonePart1 = new Random();

        int randomNumber = phonePart1.nextInt(arr.length);

        Random random = new Random();

        int phoneNumberPart2 = random.nextInt(900) + 100;

        int phoneNumberPart3 = random.nextInt(9000) + 1000;

        int mobileTelephoneNumber = Integer.valueOf(String.valueOf(arr[randomNumber]) + String.valueOf(phoneNumberPart2) + String.valueOf(phoneNumberPart3));
        System.out.println("0" + mobileTelephoneNumber);

        return mobileTelephoneNumber;

    }

    public static String generatePassword (int length) {

        //minimum length of 6
        if (length < 4) {
            length = 6;
        }

        final char[] lowercase = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        final char[] uppercase = "ABCDEFGJKLMNPRSTUVWXYZ".toCharArray();
        final char[] numbers = "0123456789".toCharArray();
        final char[] symbols = "^$?!@#%&".toCharArray();
        final char[] allAllowed = "abcdefghijklmnopqrstuvwxyzABCDEFGJKLMNPRSTUVWXYZ0123456789^$?!@#%&".toCharArray();

        //Use cryptographically secure random number generator
        Random random = new SecureRandom();

        StringBuilder password = new StringBuilder();

        for (int i = 0; i < length-4; i++) {
            password.append(allAllowed[random.nextInt(allAllowed.length)]);
        }

        //Ensure password policy is met by inserting required random chars in random positions
        password.insert(random.nextInt(password.length()), lowercase[random.nextInt(lowercase.length)]);
        password.insert(random.nextInt(password.length()), uppercase[random.nextInt(uppercase.length)]);
        password.insert(random.nextInt(password.length()), numbers[random.nextInt(numbers.length)]);
        password.insert(random.nextInt(password.length()), symbols[random.nextInt(symbols.length)]);

        return password.toString();
    }

    public static void captureScreenshot(String scenario) throws IOException {


        String screenshotName = scenario.replaceAll(" ", "_");
        String timestamp = new SimpleDateFormat("yyyy:MM:dd_HH:mm:ss").format(Calendar.getInstance().getTime()).replaceAll(":", "-");
        String encodedBase64 = null;
        FileInputStream fileInputStream = null;
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File source = screenshot.getScreenshotAs(OutputType.FILE);
        String destination = System.getProperty("user.dir") + "/target/cucumber-reports/MobileReports/Screenshots/" + screenshotName + timestamp + ".png";
        File finalDestination = new File(destination);
        FileUtils.copyFile(source, finalDestination);

        fileInputStream = new FileInputStream(finalDestination);
        byte[] bytes = new byte[(int) finalDestination.length()];
        fileInputStream.read(bytes);
        encodedBase64 = new String(Base64.encodeBase64(bytes));
        String img = "data:image/png;base64," + encodedBase64;

        Reporter.addScreenCaptureFromPath(img.toString());

    }

}
