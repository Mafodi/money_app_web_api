package platforms.ui.mobile.ios;

import com.cucumber.listener.Reporter;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.DriverFactory;

import java.io.*;
import java.time.Duration;
import java.util.*;
import java.util.concurrent.TimeUnit;

import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.PointOption.point;
import static java.time.Duration.ofMillis;

public class BasePageIOS extends DriverFactory {
    private WebDriverWait wait;
    private String propertyFile = "./Framework.properties";
    public Logger logger = Logger.getLogger(BasePageIOS.class);
    private static String screenshotName;

    public void acceptAlertRequest(AppiumDriver driver) {
        try {
            wait.until(ExpectedConditions.alertIsPresent());
            driver.switchTo().alert().accept();
        } catch (Exception e) {
            System.out.println("Alert is not displayed after 15 seconds");
        }
    }

    /*
     * Delay time in seconds to pause or hold for some page objects to load takes
     * only integer value of number of seconds to pause
     *
     */


    public void secondsDelay(int sec) {
        int timeInMilliSeconds;
        try {
            timeInMilliSeconds = sec * 1000;
            logger.info("##############################################");
            logger.info("Going for " + timeInMilliSeconds + " delay");
            logger.info("##############################################");
            Thread.sleep(timeInMilliSeconds);
        } catch (Exception e) {
            logger.info(e.getStackTrace());
        }
    }


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



    public void horizontalSlide() {
        TouchAction swipe = new TouchAction(driver)
                .press(PointOption.point(55,119))
                .waitAction(waitOptions(ofMillis(800)))
                .moveTo(PointOption.point(0,119))
                .release()
                .perform();
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
            int size = driver.findElementsByAccessibilityId("Done").size();
            if (size > 0) {
                driver.findElementByAccessibilityId("Done").click();
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

    public void switchToWebView() {
        Set handles = driver.getContextHandles();
        List<String> handlesList = new ArrayList(handles);
        String webApp = handlesList.get(1);
        driver.context(webApp);

    }

    public void switchToNativeView() {
        Set handles = driver.getContextHandles();
        List<String> handlesList = new ArrayList(handles);
        String nativeApp = handlesList.get(0);
        driver.context(nativeApp);

    }

    /***EXTENT REPORT****************************************************************/
    public static String returnDateStampIOS(String fileExtension) {
        Date d = new Date();
        String date = d.toString().replace(":", "_").replace(" ", "_") + fileExtension;
        return date;
    }

    public static void captureIOSScreenshot() throws IOException, InterruptedException {
        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

        screenshotName = returnDateStampIOS(".jpg");

        FileUtils.copyFile(srcFile, new File(System.getProperty("user.dir") + "/Reports/ios-screenshot/" + screenshotName));

        Reporter.addStepLog("Taking a screenshot!");
        Reporter.addStepLog("<br>");
        Reporter.addStepLog("<a target=\"_blank\", href="+ returnIOSScreenshotName() + "><img src="+ returnIOSScreenshotName()+ " height=200 width=300></img></a>");
    }

    public static String returnIOSScreenshotName() {
        return (System.getProperty("user.dir") + "/Reports/ios-screenshot/" + screenshotName);
    }

    private static void copyFileUsingStreamIOS(File source, File dest) throws IOException {
        InputStream is = null;
        OutputStream os = null;

        try {
            is = new FileInputStream(source);
            os = new FileOutputStream(dest);
            byte[] buffer = new byte[1024];
            int length;

            while((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
            }
        } finally {
            is.close();
            os.close();
        }
    }


    public static void copyLatestIOSExtentReport() throws IOException {
        Date d = new Date();
        String date = d.toString().replace(":", "_").replace(" ", "_");
        File source = new File(System.getProperty("user.dir") + "/Reports/cucumber-ios-reports/ios-report.html");
        File dest = new File(System.getProperty("user.dir") + "/Reports/customer-ios-report/" + date + ".html");
        copyFileUsingStreamIOS(source, dest);
    }

    public void waitForMobileElement( MobileBy selector) {
        WebDriverWait wait = new WebDriverWait(driver,60);
        wait.until(ExpectedConditions.visibilityOfElementLocated(selector));
    }

    public void waitForElement(By selector) {
        WebDriverWait wait = new WebDriverWait(driver,40);
        wait.until(ExpectedConditions.visibilityOfElementLocated(selector));
    }
}
