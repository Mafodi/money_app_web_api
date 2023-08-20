package platforms.ui.mobile.android;

import com.cucumber.listener.Reporter;
import io.appium.java_client.*;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;
import platforms.ui.mobile.android.AndroidPageObjects.AndroidBaseScreen;
import utils.CommonFunctions;
import utils.DriverFactory;
import utils.Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;

import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.PointOption.point;
import static java.time.Duration.ofMillis;

public class AndroidCommonMethods extends DriverFactory {
    protected WebDriverWait wait;
    private static Logger log = Logger.getLogger(DriverFactory.class);
    private Utils util = new Utils();
    private CommonFunctions common = new CommonFunctions();
    private String driverObject = util.getConfigPropertyValue(propertyFile, "driverObject");
    private static String ANDROID = "android";
    String object;

    public void hideKeyBoard() {
            driver.hideKeyboard();
    }

    public void cancelUpdateAppDialog() {
        List elementPresent = driver.findElements(By.id(AndroidBaseScreen.CANCEL_DIALOG));
        int size = elementPresent.size();
        if (size > 0) {
            driver.findElement(By.id(AndroidBaseScreen.CANCEL_DIALOG)).click();
        }
    }

    public void continueWithRootedDevice() {
        List elementPresent = driver.findElements(MobileBy.AndroidUIAutomator(AndroidBaseScreen.ROOTED_DEVICE_WARNING_NEXT));
        int size = elementPresent.size();
        if (size > 0) {
            driver.findElement(MobileBy.AndroidUIAutomator(AndroidBaseScreen.ROOTED_DEVICE_WARNING_NEXT)).click();
        }
    }


    public void closeCreatePINAndFingerPrintPage() {
        List<MobileElement> clientButtons = driver.findElements(By.id(AndroidBaseScreen.FINGERPRINT_IMAGE));
        int size = clientButtons.size();

        if (size > 0) {
            driver.findElement(By.id(AndroidBaseScreen.CLOSE_CREATE_PIN_BTN)).click();
        }

    }

    public void leftToRightSwipe(AppiumDriver driver, double startPercentage, double finalPercentage, double anchorPercentage, int duration) {
        Dimension size = driver.manage().window().getSize();
        int anchor = (int) (size.height * anchorPercentage);
        int startPoint = (int) (size.width * startPercentage);
        int endPoint = (int) (size.width * finalPercentage);

    }

    public void horizontalSwipeByPercentage (double startPercentage, double endPercentage, double anchorPercentage) {
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

    public void verticalSwipeByPercentages(double startPercentage, double endPercentage, double anchorPercentage) {
        Dimension size = driver.manage().window().getSize();
        int anchor = (int) (size.width * anchorPercentage);
        int startPoint = (int) (size.height * startPercentage);
        int endPoint = (int) (size.height * endPercentage);

        new TouchAction(driver)
                .press(point(anchor, startPoint))
                .waitAction(waitOptions(ofMillis(1000)))
                .moveTo(point(anchor, endPoint))
                .release().perform();
    }


    public void scrollPage(String direction) {
        HashMap<String, String> pageScroll = new HashMap<String, String>();
        pageScroll.put("direction", direction);
        driver.executeScript("mobile: scroll", pageScroll);
    }

    public void android_scroll_down(int k) throws InterruptedException {
        for (int i = 1; i <= k; i++) {
            try {
                Dimension dimension = driver.manage().window().getSize();

                //Dimension dimension = driver.manage().window().getSize();
                int height = (int) dimension.getHeight();
                int width = dimension.getWidth();
                int x = width / 2;
                int starty = (int) (height * 0.7);
                int endy = (int) (height * 0.20);
                swipe(x,starty,x,endy,800);
                //  driver.swipe(x, starty, x, endy, 800);
            } catch (Exception e) {
            }
        }



    }

    public static void swipe(int startx, int starty, int endx, int endy, int duration) {
        new TouchAction(driver).press(PointOption.point(startx, starty)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(duration))).
                moveTo(PointOption.point(endx, endy)).release().perform();

    }


    public enum DIRECTION {
        DOWN, UP, LEFT, RIGHT
    }

    public static void directionSwipe(DIRECTION direction) {
        Dimension size = driver.manage().window().getSize();

        int startx = 0;
        int endx = 0;
        int starty = 0;
        int endy = 0;

        switch (direction) {
//            case RIGHT:
//                starty = (int) (size.height / 2);
//                startx = (int) (size.width * 0.90);
//                endx = (int) (size.width * 0.05);
//                swipe(startx,starty,endx,endy,2000);
//
//                break;

            case RIGHT:
                starty = (int) (size.height / 2);
                startx = (int) (size.width * 0.90);
                endx = (int) (size.width * 0.05);
                swipe(startx,starty,endx,endy,100);

                break;

            case LEFT:
                starty = (int) (size.height / 2);
                startx = (int) (size.width * 0.05);
                endx = (int) (size.width * 0.90);
                swipe(startx,starty,endx,endy,2000);

                break;

            case UP:
                endy = (int) (size.height * 0.70);
                starty = (int) (size.height * 0.30);
                startx = (size.width / 2);
                swipe(startx,starty,endx,endy,2000);

                break;


            case DOWN:
                starty = (int) (size.height * 0.70);
                endy = (int) (size.height * 0.30);
                startx = (size.width / 2);
                swipe(startx,starty,endx,endy,2000);

                break;

        }
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
