package platforms.ui.Web.StepDefinitions.Common;

import cucumber.api.java.en.And;
import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import platforms.ui.Web.Pages.Common.WrongInformationPage;
import utils.CommonFunctions;
import utils.Utils;

public class WrongInformationSteps extends Utils {

    public WrongInformationPage wrongInformationPage = PageFactory.initElements(driver, WrongInformationPage.class);
    private static Logger log = Logger.getLogger(DashboardSteps.class);
    WebDriverWait wait = new WebDriverWait(driver,10);
    CommonFunctions commonFunctions = new CommonFunctions();

    @And("^user selects which info is wrong \"([^\"]*)\"$")
    public void userSelectsWrongInfo(String wrongInfoFeedback) {

        commonFunctions.StringValidation("Wrong information?\n" +
                "Tell us which information is wrong, or call us on 0860 103 582 to update your information.");

        if(wrongInfoFeedback.equalsIgnoreCase("monthly income")){

            ((JavascriptExecutor) driver).executeScript("arguments[0].click();",wrongInformationPage.monthlyIncome);

        }else if(wrongInfoFeedback.equalsIgnoreCase("living expenses")){

            ((JavascriptExecutor) driver).executeScript("arguments[0].click();",wrongInformationPage.debtObligations);

        }else if(wrongInfoFeedback.equalsIgnoreCase("debt obligations")){

            ((JavascriptExecutor) driver).executeScript("arguments[0].click();",wrongInformationPage.livingExpenses);

        }

        wrongInformationPage.sendFeedback.click();
    }
}
