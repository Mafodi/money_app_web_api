package platforms.ui.Web.FlowModel;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import platforms.ui.Web.Pages.VAS_Prepaid_prepaidWebLoginpage;
import platforms.ui.Web.StepDefinitions.LoginSteps;
import utils.Utils;

public class Login_flow  extends Utils {
    public VAS_Prepaid_prepaidWebLoginpage loginPage = PageFactory.initElements(driver, VAS_Prepaid_prepaidWebLoginpage.class);
    private static Logger log = Logger.getLogger(LoginSteps.class);
    WebDriverWait wait = new WebDriverWait(driver,80);

    public void USER_LAUNCH_PREPAID_WEB_APPLICATION() {

        String baseURL = getConfigPropertyValue("./Framework.properties", "OnlineBankingURL");
        driver.get(baseURL);
        log.info("user able to launch Online Banking application");

    }



    public void USER_ENTERS_USERNAME_AND_PASSWORD() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
        //loginPage.UserNameTextField.sendKeys(username);
        //loginPage.PasswordTextField.sendKeys(password);
        log.info("user able to enter username and password");
        {
        }}}