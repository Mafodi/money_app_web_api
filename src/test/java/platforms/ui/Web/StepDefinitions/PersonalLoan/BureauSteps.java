package platforms.ui.Web.StepDefinitions.PersonalLoan;

import cucumber.api.java.en.And;
import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import platforms.ui.Web.Pages.PersonalLoan.BureauPage;
import platforms.ui.Web.StepDefinitions.Common.DashboardSteps;
import utils.CommonFunctions;
import utils.Utils;

public class BureauSteps extends Utils {

        public BureauPage bureauPage = PageFactory.initElements(driver, BureauPage.class);
    private static Logger log = Logger.getLogger(DashboardSteps.class);
    WebDriverWait wait = new WebDriverWait(driver,10);
    CommonFunctions commonFunctions = new CommonFunctions();

    @And("^user sees the affordability screen$")
    public void userSeesAffordabilityScreen() {
        String actualText = "";
        String expectedText ="";

        commonFunctions.secondsDelay(2);

        commonFunctions.StringValidation("Please note:\n" +
                "Unfortunately, We can't offer you a personal loan at this stage because of your affordability or credit score.");

        commonFunctions.secondsDelay(2);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", bureauPage.closeBTN);
    }
}
