package platforms.ui.Web.FlowModel;

import org.apache.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import platforms.ui.Web.Pages.SQ_Web_AuthOpt_In_Mode_Page;
import platforms.ui.Web.Pages.SQ_Web_Queuetimes_Page;
import platforms.ui.Web.Pages.SQ_Web_UnauthOpt_In_Mode_Page;
import platforms.ui.Web.Pages.SQ_Web_UnauthOpt_OUT_Mode_Page;
import utils.Utils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;


public class SQ_BranchLocator_Flow extends Utils {

    public SQ_Web_UnauthOpt_In_Mode_Page unauthOptIn = PageFactory.initElements(driver, SQ_Web_UnauthOpt_In_Mode_Page.class);
    public SQ_Web_UnauthOpt_OUT_Mode_Page unauthOptOut = PageFactory.initElements(driver, SQ_Web_UnauthOpt_OUT_Mode_Page.class);
    public SQ_Web_AuthOpt_In_Mode_Page sq_web_authOpt_in_mode_page = PageFactory.initElements(driver, SQ_Web_AuthOpt_In_Mode_Page.class);
    public SQ_Web_Queuetimes_Page sq_web_queuetimes_page = PageFactory.initElements(driver, SQ_Web_Queuetimes_Page.class);

    public static Logger logger = Logger.getLogger(SQ_BranchLocator_Flow.class);

    public WebDriver sq_setupWebDriver(String browserName) {
        String macDriverLocation = "./Drivers/Mac/";
        String linuxDriverLocation = "./Drivers/Linux/";
        String windowsDriverLocation = "./Drivers/Windows/";

        System.out.println("Browser name : " + browserName);
        if (browserName.equalsIgnoreCase("chrome")) {
            String chromeDriverPath = null;

            if (this.getOsName().equalsIgnoreCase("Windows")) {
                chromeDriverPath = windowsDriverLocation + "chromedriver.exe";
            } else if (this.getOsName().equalsIgnoreCase("Mac OS")) {
                chromeDriverPath = macDriverLocation + "chromedriver";
            } else if (this.getOsName().equalsIgnoreCase("Linux")) {
                chromeDriverPath = linuxDriverLocation + "chromedriver";
            }

            logger.info("This is the chrome driver path is :::: " + chromeDriverPath);

            String absoluteChromeDriverPath = toAbsolutePath(chromeDriverPath);
            logger.info("This is the chrome driver real path is :::: " + absoluteChromeDriverPath);

            System.setProperty("webdriver.chrome.driver", absoluteChromeDriverPath);

            Map<String, Object> prefs = new HashMap<String, Object>();

            prefs.put("profile.default_content_setting_values.geolocation", 2);

            ChromeOptions options = new ChromeOptions();

            options.setExperimentalOption("useAutomationExtension", false);

            options.addArguments("disable-infobars");

            options.setExperimentalOption("prefs", prefs);

            driver = new ChromeDriver(options);

        } else if (browserName.equalsIgnoreCase("firefox")) {
            String firefoxDriverPath = null;
            logger.info("Firefox ?: " + browserName);
            if (this.getOsName().equalsIgnoreCase("Windows")) {
                firefoxDriverPath = windowsDriverLocation + "geckodriver.exe";
            } else if (this.getOsName().equalsIgnoreCase("Mac OS")) {
                firefoxDriverPath = macDriverLocation + "geckodriver";
            } else if (this.getOsName().equalsIgnoreCase("Linux")) {
                firefoxDriverPath = linuxDriverLocation + "geckodriver";
            }
            logger.info("This is the firefox driver path is :::: " + firefoxDriverPath);

            String absoluteFirefoxDriverPath = toAbsolutePath(firefoxDriverPath);
            logger.info("This is the chrome driver real path is :::: " + absoluteFirefoxDriverPath);

            System.setProperty("webdriver.gecko.driver", absoluteFirefoxDriverPath);
            FirefoxOptions options = new FirefoxOptions();
            options.setProfile(new FirefoxProfile());
            options.addPreference("dom.webnotifications.enabled", false);
            options.addArguments("--disable-notifications");

            driver = new FirefoxDriver(options);
//            driver = new FirefoxDriver();
        } else if (browserName.equalsIgnoreCase("IE")) {
            String ieDriverPath = null;

            if (this.getOsName().equalsIgnoreCase("Windows")) {
                ieDriverPath = windowsDriverLocation + "IEDriverServer.exe";
            } else if (this.getOsName().equalsIgnoreCase("Mac OS")) {
                ieDriverPath = macDriverLocation + "IEDriverServer";
            } else if (this.getOsName().equalsIgnoreCase("Linux")) {
                ieDriverPath = linuxDriverLocation + "IEDriverServer";
            }
            logger.info("This is the chrome driver path is :::: " + ieDriverPath);

            String absoluteIeDriverPath = toAbsolutePath(ieDriverPath);
            logger.info("This is the chrome driver real path is :::: " + absoluteIeDriverPath);

            System.setProperty("webdriver.ie.driver", absoluteIeDriverPath);

            Map<String, Object> prefs = new HashMap<String, Object>();

            prefs.put("profile.default_content_setting_values.geolocation", 2);

            InternetExplorerOptions options = new InternetExplorerOptions();

            options.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,
                    true);

            options.setCapability("useAutomationExtension", false);

            options.addCommandSwitches("disable-infobars");

            options.setCapability("prefs", prefs);

            driver = new InternetExplorerDriver(options);
        }

        try {
            jExecutor = (JavascriptExecutor) driver;
            driver.manage().window().maximize();
            driverWait = new WebDriverWait(driver, 5);
        } catch (Exception e) {
            logger.info("The stack trace here happens when I try to maximize the screen");
            logger.info(e.getStackTrace());
        }
        return driver;
    }

    public WebElement waitForElement(WebElement ele) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, 60);
            wait.until(ExpectedConditions.visibilityOf(ele));
        } catch (Exception e) {
            System.out.println(ele + "is not displayed on the web page");

        }
        return ele;
    }


    public void sq_Searchbar_Dropdown(WebElement Searchbar_Input, String Input_task, WebElement Dropdown_List, WebElement Display_Menu) throws InterruptedException {
        try {
            waitForElement(Searchbar_Input).sendKeys(Input_task);
            waitForElement(Dropdown_List);
            List<WebElement> ele = driver.findElements(By.xpath("//*[contains(@class,'ng-dropdown-panel-items')]//span[text()='" + Input_task + "']/.."));
            for (int i = 0; i < ele.size(); i++) {
                if (ele.get(i).getText().equalsIgnoreCase(Input_task)) {
                    ((JavascriptExecutor) driver).executeScript("arguments[0].click();", ele.get(i));
                    waitForElement(Display_Menu);
                    Thread.sleep(2000);
                    System.out.println("User Manually Entered and selected the Branch/ATM: " + Input_task + "");
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("Something Wrong with the Location Name / Location Property");
            throw e;
        }
    }

    public void searchbar(String location) throws InterruptedException {
        sq_Searchbar_Dropdown(unauthOptOut.Searchbar_input, location, unauthOptIn.Dropdown_Panel_list, unauthOptIn.BranchMenu);
    }

    public void Autosuggestion(String location) throws InterruptedException {
        Autosuggestioncheck_Dropdown(unauthOptOut.Searchbar_input, location, unauthOptIn.Dropdown_Panel_list);
    }

    public void listofBranches() throws InterruptedException {
        try {
            Thread.sleep(5000);
            if (isdisplayed(driver.findElement(By.xpath("//div[@role='presentation']//ul[@role='menu']")))) {
                List<WebElement> elements = unauthOptIn.ListofBranches;
                System.out.println("Number of Branches/ATM's Displayed:" + elements.size());
                if (elements.size() == 10) {
                    for (int i = 0; i < elements.size(); i++) {
                        System.out.println("Branch " + (i + 1) + " is:" + elements.get(i).getText());
                    }
                } else if ((elements.size() < 10) && ((unauthOptOut.Apply_Filter).isDisplayed())) {
                    for (int i = 0; i < elements.size(); i++) {
                        System.out.println("User Applied Advance Filter option ----So Displayed Branch " + (i + 1) + " is:" + elements.get(i).getText());
                    }
                }
            }
        } catch (NoSuchElementException e) {
            System.out.println("User Toggled off / Denied the Location So No branches were Loaded");

        }
    }


    public void Autosuggestioncheck_Dropdown(WebElement Searchbar_Input, String Input_task, WebElement Dropdown_List) throws InterruptedException {
        try {
            waitForElement(Searchbar_Input).sendKeys(Input_task);
            waitForElement(Dropdown_List);
            List<WebElement> ele = driver.findElements(By.xpath("//*[contains(@class,'ng-dropdown-panel-items')]//span[text()='" + Input_task + "']/.."));
            for (int i = 0; i < ele.size(); i++) {
                System.out.println("Auto suggestions for the input- "+Input_task +" is :" + ele.get(i).getText());
            }
        }
        catch(Exception e) {
            System.out.println("Something Wrong with the Location Name for the auto suggestions");
            throw e;
        }
    }


    public void guest_Clicks_Branchlocator() throws InterruptedException {
        try {
            waitForElement(unauthOptIn.username);
            waitForElement(unauthOptIn.BranchLocator).click();
            waitForElement(unauthOptIn.BranchAtm_Sidebar);
            Thread.sleep(5000);
            System.out.println("User Successfully Clicked on the Branch Locator");
        } catch (Exception e) {
            System.out.println("User Unable to click on the Branch Locator");
            throw e;
        }
    }


    public void status_Time_Kms_Branch_(String BranchName) throws InterruptedException {

        try {
            Thread.sleep(3000);
            WebElement element = driver.findElement(By.xpath("//div[text()='" + BranchName + "']"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
            String StatusTime = driver.findElement(By.xpath("//div[text()='" + BranchName + "']//following-sibling::div//div//span[@class='status']")).getText();
            System.out.println("Status Time for the Branch:" + BranchName + " is " + StatusTime);
            List<WebElement> KmsBranch = driver.findElements(By.xpath("//div[text()='" + BranchName + "']//following-sibling::div//div//span[contains(text(),'kms')]"));
            if (KmsBranch.size() > 0) {
                for (int i = 0; i < KmsBranch.size(); i++) {
                    String Kms = KmsBranch.get(i).getText();
                    System.out.println("The Branch:" + BranchName + " is Located at " + Kms + " from your current Location");
                }
            } else {
                System.out.println("User is in Opt Out Mode, So No distance details will be displayed");
            }
            if (isdisplayed(driver.findElement(By.xpath("//div[text()='" + BranchName + "']//following-sibling::div//div//i[@class='location-icon']")))) {
                System.out.println("Get directions are available to Branch Name: " + BranchName);
            }

        } catch (Exception e) {
            System.out.println("Unable to display the Status and kms of the Branch");
            throw e;

        }
    }


    public void opt_In_Firstbranch_Status_Time_Kms_Branch_() throws InterruptedException {

        try {
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", unauthOptIn.first_branch);
            String Branchname = waitForElement(unauthOptIn.first_branch_Name).getText();
            String StatusTime = waitForElement(unauthOptIn.first_branch_status).getText();
            System.out.println("Status Time for the First Branch:" + Branchname + " is " + StatusTime);
            String KmsBranch = waitForElement(unauthOptIn.first_branch_kms).getText();
            System.out.println("First Branch:" + Branchname + " is Located at " + KmsBranch + " from your location");
            waitForElement(unauthOptIn.Getdirection_location);
            System.out.println("First Branch:" + Branchname + " has the Option of Get Direction to reach out there");
        } catch (Exception e) {
            System.out.println("Unable to display the Status and kms of the First Branch");
            throw e;
        }
    }

    public void click_Morebranchinfo(String BranchName) throws Exception {
        try {
            Thread.sleep(5000);
            ((JavascriptExecutor) driver).executeScript("window.scrollBy(0, -100)", "");
            waitForElement(driver.findElement(By.xpath("//div[text()='"+ BranchName +"']//following-sibling::div//div//span[@class='branch-more-info']"))).click();
            String branchname = waitForElement(unauthOptOut.Morebranchinfo_Landingpage).getText();
            String status = waitForElement(unauthOptOut.Branch_Status_Landingpage).getText();
            System.out.println("User Successfully Landed on the MoreBranch Info Page of branch :" + branchname + " and the branch status is " + status);
        } catch (Exception e) {
            System.out.println("User Unable to Land on the MoreBranch Info Screen");
            throw e;
        }

    }

    public void validating_Qmatic_Nonqmatic_Branchinfopage_fields() {
        try {
            driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
            String status = waitForElement(unauthOptOut.Branch_Status_Landingpage).getText();
            System.out.println(status);
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", unauthOptOut.Accordion_view);
            waitForElement(unauthOptOut.AddressIcon);
            waitForElement(unauthOptOut.PhoneIcon);
            waitForElement(unauthOptOut.EmailIcon);
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", unauthOptOut.BranchcodeIcon);
            waitForElement(unauthOptOut.BranchcodeIcon);
            Thread.sleep(3000);
            if (status.contains("OPEN")) {
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", unauthOptIn.Inbranchservice);
                if (isdisplayed(unauthOptIn.Nonqmatic_Inbranchservice)) {
                    waitForElement(unauthOptIn.Nonqmatic_Inbranchservice).click();
                    waitForElement(unauthOptIn.InbranchserviceList);
                    System.out.println("Given branch was Non Qmatic and verified Inbranch services list");
                } else {
                    waitForElement(sq_web_queuetimes_page.Inbranchservices_estimatedtimes).click();
                    waitForElement(unauthOptIn.InbranchserviceList);
                    waitForElement(sq_web_queuetimes_page.Header_waitingtimes);
                    waitForElement(sq_web_queuetimes_page.Timestamp_waitingtimes);
                    waitForElement(sq_web_queuetimes_page.Button_refresh);
                    System.out.println("Given branch was Qmatic branch and verified the WT header and Timestamp with refresh button");
                }
            } else if (status.contains("CLOSED")) {
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", unauthOptIn.Nonqmatic_Inbranchservice);
                waitForElement(unauthOptIn.Nonqmatic_Inbranchservice).click();
                waitForElement(unauthOptIn.InbranchserviceList);
                System.out.println("Branch is closed & Successfully verified Services List ");
            }

            Thread.sleep(1000);
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", unauthOptIn.Openinghours);
            waitForElement(unauthOptIn.Openinghours).click();
            waitForElement(unauthOptIn.Tradinghours);
            waitForElement(unauthOptIn.Static_publicholiday_msg);
            Thread.sleep(1000);
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", unauthOptIn.Feature);
            Thread.sleep(1000);
            waitForElement(unauthOptIn.Feature).click();
            waitForElement(unauthOptIn.Feature_List);
            System.out.println("Successfully verified all the fields of the branch (Opening hours & services & Features)");
        } catch (Exception e) {
            System.out.println("User Page is not Loaded properly when clicks on More Branch Info option");
        }
    }

    public void usercloses_Morebranchinfo_page() throws InterruptedException {
        Thread.sleep(3000);
        waitForElement(unauthOptOut.Close_Icon).click();
        waitForElement(unauthOptIn.BranchMenu);
        System.out.println("User successfully clicked on Close Icon in More Info Screen");
    }

    public void verifyuser_landed_sidebar_page() {
        if (isdisplayed(unauthOptIn.BranchMenu)) {
            System.out.println("User Successfully get backs to the side bar Page");
        } else {
            System.out.println("User unable to navigate to the Side bar page");
        }
    }

    public void userclicks_on_advancefilters() {
        try {
            Thread.sleep(5000);
            WebElement element = waitForElement(unauthOptOut.Label_searchbar);
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
            waitForElement(unauthOptOut.Advance_Filter).click();
            System.out.println("User Successfully Clicked on Advance Filters");

        } catch (Exception e) {
            System.out.println("Unable to click on Advance Filter Option");
        }
    }

    public void advanceFilter(String Openinghours_option, String Inbranchservice_option1, String Inbranchservice_option2, String Inbranchservice_option3, String Feature_option) {

        try {
            waitForElement(unauthOptOut.Filter_Openinghours_click).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//li[normalize-space()='"+ Openinghours_option +"']")).click();
            waitForElement(unauthOptOut.Filter_Inbranchservices_click).click();
            driver.findElement(By.xpath("//label[@for='"+ Inbranchservice_option1 +"']//span[normalize-space()='"+ Inbranchservice_option1 +"']")).click();
            driver.findElement(By.xpath("//label[@for='"+ Inbranchservice_option2 +"']//span[normalize-space()='"+ Inbranchservice_option2 +"']")).click();
            driver.findElement(By.xpath("//label[@for='"+ Inbranchservice_option3 +"']//span[normalize-space()='"+ Inbranchservice_option3 +"']")).click();
            waitForElement(unauthOptOut.Filter_Features_click).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//li[normalize-space()='" + Feature_option +"']")).click();
            System.out.println("User Successfully Selected the " + Openinghours_option + " and " + Inbranchservice_option1 + ", " + Inbranchservice_option2 + " & " + Inbranchservice_option3 + " & " + Feature_option + " Using Advance Filter option");

        } catch (Exception e) {

            System.out.println("User unable to select the option in Advance Filter");
        }

    }

    public void advanceFilter_Warning(String Openinghours_option, String Inbranchservice_option1, String Inbranchservice_option2, String Inbranchservice_option3, String Inbranchservice_option4, String Feature_option) {

        try {
            waitForElement(unauthOptOut.Filter_Openinghours_click).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//li[normalize-space()='"+ Openinghours_option +"']")).click();
            waitForElement(unauthOptOut.Filter_Inbranchservices_click).click();
            driver.findElement(By.xpath("//label[@for='"+ Inbranchservice_option1 +"']//span[normalize-space()='"+ Inbranchservice_option1 +"']")).click();
            driver.findElement(By.xpath("//label[@for='"+ Inbranchservice_option2 +"']//span[normalize-space()='"+ Inbranchservice_option2 +"']")).click();
            driver.findElement(By.xpath("//label[@for='"+ Inbranchservice_option3 +"']//span[normalize-space()='"+ Inbranchservice_option3 +"']")).click();
            driver.findElement(By.xpath("//label[@for='"+ Inbranchservice_option4 +"']//span[normalize-space()='"+ Inbranchservice_option4 +"']")).click();
            if (isdisplayed(unauthOptOut.Filter_warning_msg)) {
                System.out.println("Waring Message displayed : User Allowed to choose Max of 3 services only");
            }
            driver.findElement(By.xpath("//label[@for='"+ Inbranchservice_option3 +"']//span[normalize-space()='"+ Inbranchservice_option3 +"']")).click();
            System.out.println("Now User deselected one service option : " + Inbranchservice_option3);
            if (!isdisplayed(unauthOptOut.Filter_warning_msg)) {
                System.out.println("So No warning Message displayed");
            }

            waitForElement(unauthOptOut.Filter_Features_click).click();
            driver.findElement(By.xpath("//li[normalize-space()='"+ Feature_option +"']")).click();
            System.out.println("User Successfully Selected the " + Openinghours_option + " and " + Inbranchservice_option1 + ", " + Inbranchservice_option2 + " & " + Feature_option + " Using Advance Filter option");

        } catch (Exception e) {

            System.out.println("User unable to select the option in Advance Filter");
        }

    }


    public void clicks_Tag_Adv_options(String Inbranchservice1, String Inbranchservice2) throws InterruptedException {
        try {
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", unauthOptOut.Inbarnch_Services_header);
            driver.findElement(By.xpath("//div[normalize-space(text())='"+ Inbranchservice1 +"']//span[text()='X']")).click();
            driver.findElement(By.xpath("//div[normalize-space(text())='"+ Inbranchservice2 +"']//span[text()='X']")).click();
            System.out.println("User Successfully removed  the " + Inbranchservice1 + "& " + Inbranchservice2 + " from the filter option by clicking on the X Tag");
        } catch (Exception e) {
            System.out.println("User Unable to click on X tag ");
        }
    }


    public void clear_Advancefilter() throws InterruptedException {
        try {
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", unauthOptOut.Inbarnch_Services_header);
            unauthOptOut.Clear_All.click();
            unauthOptOut.Clear_Filter.click();
            System.out.println("User Successfully clicked on Clear All and clear filter");
        } catch (Exception e) {
            System.out.println("User Unable to click on X tag ");
        }
    }

    public void clicks_ApplyFilter() throws InterruptedException {
        try {
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", unauthOptOut.Label_feature);
            Thread.sleep(3000);
            waitForElement(unauthOptOut.Apply_Filter).click();
            System.out.println("User Successfully Applied the Filter");
        } catch (Exception e) {
            System.out.println("User Unable to click on Apply Filter");
        }
    }

    public void opt_In_Firstbranch_Morebranchinfo() {
        try {
            waitForElement(unauthOptIn.Morebranchinfo_firstbranch).click();
            System.out.println("User Successfully Clicked on More branch Info button");
        } catch (Exception e) {
            System.out.println("Unable to click on 1st Branch More Branch Info button");

        }
    }

    public void logon_landing_Welcomepage() {
        try {
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            if (isdisplayed(sq_web_authOpt_in_mode_page.OverviewNav)) {
                Thread.sleep(1500);
                if (isdisplayed(sq_web_authOpt_in_mode_page.Done_popup)) {
                    waitForElement(sq_web_authOpt_in_mode_page.Done_popup).click();
                }
                System.out.println("User Successfully Landed on Money App and closed Welcome Pop Up ");
            }

        } catch (Exception e) {
            System.out.println("User unable to land on the Welcome Page");
        }
    }

    public void click_findbranch_validate_tenbranches() throws InterruptedException {
        waitForElement(sq_web_authOpt_in_mode_page.Gettouch);
        waitForElement(sq_web_authOpt_in_mode_page.Gettouch).click();
        System.out.println("User successfully clicked on Get In Touch button");
        Thread.sleep(4000);
//        try {
//            if (sq_web_authOpt_in_mode_page.Alert_close.isDisplayed()) {
//                waitForElement(sq_web_authOpt_in_mode_page.Alert_close).click();
//            }
//
//            if (sq_web_authOpt_in_mode_page.close_security_popup.isDisplayed()) {
//                waitForElement(sq_web_authOpt_in_mode_page.close_security_popup).click();
//            }
//        }
//        catch (NoSuchElementException e){
//            System.out.println("Alert messages are not available on the Screen");
//
//        }
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", sq_web_authOpt_in_mode_page.label_getintouch);
        waitForElement(sq_web_authOpt_in_mode_page.FindATM_Tab);
        waitForElement(sq_web_authOpt_in_mode_page.FindATM_Tab).click();
        System.out.println("User Successfully Clicked on Find Now Button");
        listofBranches();

    }


    public void logout() {

        try {
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", sq_web_authOpt_in_mode_page.Logout);
            waitForElement(sq_web_authOpt_in_mode_page.Logout).click();
            Thread.sleep(2500);
            waitForElement(sq_web_authOpt_in_mode_page.UserNameTextField);
            System.out.println("User successfully Logged out from Money App");
        } catch (Exception e) {
            System.out.println("user unable to logout from Money App");
        }

    }

    public void click_ATM_Tab_Opt_Out() {
        try {
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", unauthOptOut.ATM_Branch_Bar);
            ((JavascriptExecutor) driver).executeScript("window.scrollBy(0, -250)", "");
            waitForElement(unauthOptOut.ATM_Tab).click();
            Thread.sleep(5000);
            System.out.println("User Successfully Clicked on ATM Tab");
            waitForElement(unauthOptIn.searchbar_clear).click();
            waitForElement(unauthOptIn.Title_searchbar).click();
        } catch (Exception e) {
            System.out.println("User unable to click on ATM Tab");
        }
    }

    public void click_ATM_Tab_Opt_In() {
        try {
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", unauthOptOut.ATM_Branch_Bar);
            ((JavascriptExecutor) driver).executeScript("window.scrollBy(0, -250)", "");
            waitForElement(unauthOptOut.ATM_Tab).click();
            Thread.sleep(5000);
        } catch (Exception e) {
            System.out.println("User unable to click on ATM Tab");
        }
    }

    public void click_Branch_Tab_Opt_In() {
        try {
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", unauthOptOut.ATM_Branch_Bar);
            ((JavascriptExecutor) driver).executeScript("window.scrollBy(0, -250)", "");
            waitForElement(unauthOptOut.Branch_Tab).click();
            Thread.sleep(5000);
        } catch (Exception e) {
            System.out.println("User unable to click on Branch Tab");
        }
    }

    public void aTM_Stats() throws InterruptedException {

        try {
            List<WebElement> elements = unauthOptIn.ListofBranches;
            System.out.println("Number of ATM's Displayed:" + elements.size());
            if (elements.size() == 10) {
                for (int i = 0; i < elements.size(); i++) {
                    String ATMname = elements.get(i).getText();
                    List<WebElement> ATM_Stats = driver.findElements(By.xpath("//*[text()='" + ATMname + "']//following-sibling::div//div"));
                    if (ATM_Stats.size() >= 2) {
                        for (int j = 0; j < ATM_Stats.size(); j++) {
                            String Type = ATM_Stats.get(j).getText();
                            System.out.println("The ATM Stats for :" + ATMname + " is " + Type);
                        }
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Unable to display the ATM Stats");
            throw e;
        }
    }

    public boolean isdisplayed(WebElement element) {
        boolean isdisplayed = false;
        try {
            if (element.isDisplayed()) {
                isdisplayed = true;
            }
        } catch (Exception e) {
            System.out.println(element + "is not displayed on the page");
        }
        return isdisplayed;
    }

    public void searchbar_error(String location) throws InterruptedException {
        waitForElement(unauthOptOut.Searchbar_input).sendKeys(location);
        System.out.println("User entered location : " + location + " Successfully in the search bar");
        if ((isdisplayed(waitForElement(unauthOptOut.No_result_found_searchbar)))) {
            System.out.println(location + " is not a valid location");
        } else {
            System.out.println(location + " is a valid location");
        }
    }

    public void Advancefilter_error() throws InterruptedException {
        if ((isdisplayed(waitForElement(unauthOptOut.No_result_found)))) {
            System.out.println(" This is not a valid selection in Advance filter and No results found");
        } else {
            listofBranches();
            System.out.println(" This is a Valid selection in Advance filter and found list of branches");
        }
    }
}
