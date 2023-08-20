package platforms.ui.Web.StepDefinitions;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import platforms.ui.Web.Pages.DC_ChatPage;
import platforms.ui.Web.Pages.LoginPage;
import platforms.ui.Web.Pages.VAS_Prepaid_prepaidWebLoginpage;
import platforms.ui.Web.Foundation_DataFactory;
import platforms.ui.Web.WebDataFactory;
import utils.CommonFunctions;
import utils.Utils;
import java.util.concurrent.TimeUnit;


public class LoginSteps extends Utils {

    public VAS_Prepaid_prepaidWebLoginpage loginPage = PageFactory.initElements(driver, VAS_Prepaid_prepaidWebLoginpage.class);
     private static Logger log = Logger.getLogger(LoginSteps.class);
    DC_ChatPage chatPage = PageFactory.initElements(driver, DC_ChatPage.class);
     WebDriverWait wait = new WebDriverWait(driver,10);
    public static CommonFunctions wc = PageFactory.initElements(driver, CommonFunctions.class);

    @Given("^user can access Money Web portal$")
    public void userCanAccessMoneyWebPortal() {
        user_launch_prepaid_web_application();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Then("^user is logged in successfully and sees the Product Dashboard$")
    public void userIsLoggedInSuccessfullyAndSeesTheProductDashboard() {

        LoginPage login = PageFactory.initElements(driver, LoginPage.class);

        try
        {
            boolean isVisible_Accept = checkNullElement(login.TsnCs);

            if(isVisible_Accept  == true)
            {
                login.TsnCs.click();
            }
            else
                driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            boolean isVisible_LogoutLabel = checkNullElement(login.LogoutLabel);
            org.testng.Assert.assertTrue(isVisible_LogoutLabel);

        }
        catch (Exception ex)
        {
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            boolean isVisible_LogoutLabel = checkNullElement(login.LogoutLabel);
            org.testng.Assert.assertTrue(isVisible_LogoutLabel);
            driver.close();
        }
    }

    @And("^user enters Non TP Username ([^\"]*) with Non TP Password ([^\"]*)$")
    public void userEntersNonTPUsernameNTPUsernameWithNonTPPasswordNTPPassword(String ntpUserName, String ntpPassword) {
        LoginPage login = PageFactory.initElements(driver, LoginPage.class);
        login.UserNameTextField.sendKeys(WebDataFactory.NTPUsername);
        login.PasswordTextField.sendKeys(WebDataFactory.NTPPassword);
    }

    @And("^user enters TP Username ([^\"]*) with TP Password ([^\"]*)$")
    public void userEntersTPUsernameTPUsernameWithTPPasswordTPPassword(String tpUserName, String tpPassword) {
        LoginPage login = PageFactory.initElements(driver, LoginPage.class);
        login.UserNameTextField.sendKeys(WebDataFactory.TPUsername);
        login.PasswordTextField.sendKeys(WebDataFactory.TPPassword);
    }

    @Then("^user is logged in successfully and sees the NON Transactional Product Dashboard$")
    public void userIsLoggedInSuccessfullyAndSeesTheNONTransactionalProductDashboard() {

        LoginPage login = PageFactory.initElements(driver, LoginPage.class);

        //Check if Terms and Conditions have been updated before showing dashboard
        try
        {
            boolean isVisible_Accept = checkNullElement(login.TsnCs);

            if(isVisible_Accept  == true)
            {
                login.TsnCs.click();
            }
            else
                driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            boolean isVisible_LogoutLabel = checkNullElement(login.LogoutLabel);
            org.testng.Assert.assertTrue(isVisible_LogoutLabel);
            boolean isVisible_AccountCard = checkNullElement(login.AccountCard);
            org.testng.Assert.assertTrue(isVisible_AccountCard);
            boolean isVisible_LoanCard = checkNullElement(login.LoanCard);
            org.testng.Assert.assertTrue(isVisible_LoanCard);
            driver.close();
        }
        catch (Exception ex)
        {
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            boolean isVisible_LogoutLabel = checkNullElement(login.LogoutLabel);
            org.testng.Assert.assertTrue(isVisible_LogoutLabel);
            boolean isVisible_AccountCard = checkNullElement(login.AccountCard);
            org.testng.Assert.assertTrue(isVisible_AccountCard);
            boolean isVisible_LoanCard = checkNullElement(login.LoanCard);
            org.testng.Assert.assertTrue(isVisible_LoanCard);
            driver.close();
        }
    }

    @Given("^user launch prepaid web application$")
    public void user_launch_prepaid_web_application(){

        String baseURL = getConfigPropertyValue("./Framework.properties", "OnlineBankingURL");
        driver.get(baseURL);
        log.info("user able to launch Online Banking application");

    }

    @Then("^user is logged in successfully and sees the Transactional Product Dashboard$")
    public void userIsLoggedInSuccessfullyAndSeesTheTransactionalProductDashboard() {
        LoginPage login = PageFactory.initElements(driver, LoginPage.class);

        //Check if Terms and Conditions have been updated before showing dashboard
        try
        {
            boolean isVisible_Accept = checkNullElement(login.TsnCs);

            if(isVisible_Accept  == true)
            {
                login.TsnCs.click();
            }
            else
                driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            boolean isVisible_LogoutLabel = checkNullElement(login.LogoutLabel);
            org.testng.Assert.assertTrue(isVisible_LogoutLabel);
            boolean isVisible_PayLabel = checkNullElement(login.PayLabel);
            org.testng.Assert.assertTrue(isVisible_PayLabel);
            boolean isVisible_TransferLabel = checkNullElement(login.TransferLabel);
            org.testng.Assert.assertTrue(isVisible_TransferLabel);
            driver.close();
        }
        catch (Exception ex)
        {
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            boolean isVisible_LogoutLabel = checkNullElement(login.LogoutLabel);
            org.testng.Assert.assertTrue(isVisible_LogoutLabel);
            boolean isVisible_PayLabel = checkNullElement(login.PayLabel);
            org.testng.Assert.assertTrue(isVisible_PayLabel);
            boolean isVisible_TransferLabel = checkNullElement(login.TransferLabel);
            org.testng.Assert.assertTrue(isVisible_TransferLabel);
            driver.close();
        }
    }

    @And("^user enters username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_enters_username_and_password(String username, String password) throws InterruptedException {

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("username")));
        loginPage.UserNameTextField.sendKeys(Foundation_DataFactory.CCUser);
        loginPage.PasswordTextField.sendKeys(Foundation_DataFactory.CCUserPassword );
        log.info("user able to enter username and password");

    }
    @And("^user enters username \"([^\"]*)\" and password from feature file\"([^\"]*)\"$")
    public void user_enters_username_and_password_from_feature_file(String username, String password) {

        try {
            wc.secondsDelay(1);
            chatPage.CLOSE_COVID.click();
        }catch(Exception e) {
            log.info("Covid-19 banner not closed");
        }

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("username")));
       loginPage.UserNameTextField.sendKeys(username);
        loginPage.PasswordTextField.sendKeys(password);
        log.info("user able to enter username and password");
    }

    @When("^user clicks on Login$")
    public void user_clicks_on_Login() {

        try {
            loginPage.LoginButton.click();
        }catch(Exception e){
            loginPage.UserNameTextField.sendKeys(Foundation_DataFactory.uname);
            loginPage.PasswordTextField.sendKeys(Foundation_DataFactory.pwd);
            loginPage.LoginButton.click();
        }
        log.info("user able click on login");

    }



    @Then("^user must logon to Money Web application$")
    public void user_must_logon_to_Money_Web_application() throws InterruptedException {
       try{
            if(loginPage.AcceptCookies.isDisplayed()){
                loginPage.AcceptCookies.click();
                loginPage.AcceptCookies.click();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
       try {
           wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Done')]")));
          driver.findElement(By.xpath("//div[contains(text(),'Done')]")).click();
         }catch(Exception e){
             wc.actionsClick(driver.findElement(By.xpath("//div[contains(text(),'Done')]")));
         }


        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        if(loginPage.OverviewNav.isDisplayed()) {
            //driver.findElement(By.xpath("//div[contains(text(),'Done')]")).click();
            loginPage.OverviewNav.click();
            String actualTitle = driver.getTitle();
            String expectedTitle = "Online Banking";
            Assert.assertEquals(actualTitle, expectedTitle);
//            Assert.assertEquals("Online Banking", actualTitle, expectedTitle);VAS Operations
            Thread.sleep(1000);
            log.info("User able to logon to money web application");
            Thread.sleep(1000);

        }


    }


    @And("^User want to logout from Online banking$")
    public void userWantToLogoutFromOnlineBanking(){

        loginPage.Logout.click();
    }

    @And("^user navigate to Login screen$")
    public void userNavigateToLoginScreen(){

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loginPage.UserNameTextField.isDisplayed();
    }

}