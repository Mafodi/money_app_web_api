package platforms.ui.Web.StepDefinitions.ShortTermLoan;

import cucumber.api.java.en.And;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import platforms.ui.Web.Pages.ShortTermLoan.ShortTermLoanPage;
import platforms.ui.Web.StepDefinitions.Common.DashboardSteps;
import utils.CommonFunctions;
import utils.Utils;

public class ShortTermLoanSteps extends Utils {

    public ShortTermLoanPage shortTermLoanPage = PageFactory.initElements(driver, ShortTermLoanPage.class);
    private static Logger log = Logger.getLogger(DashboardSteps.class);
    WebDriverWait wait = new WebDriverWait(driver, 10);
    CommonFunctions commonFunctions = new CommonFunctions();

    @And("^user accepts or decline STL \"([^\"]*)\"$")
    public void userAcceptsOrDeclineSTL(String STLDecidion) {

        if (STLDecidion.equalsIgnoreCase("interested")) {
            commonFunctions.secondsDelay(5);
            commonFunctions.waitForElementToBeVisible("i'm_interested");
            commonFunctions.secondsDelay(5);
            shortTermLoanPage.interestedBTN.click();

        }else if(STLDecidion.equalsIgnoreCase("no thanks")) {

            commonFunctions.waitForElementToBeVisible("no_thanks");
            shortTermLoanPage.interestedBTN.click();

        }else{
            Assert.fail("No decision to take offer or not was made.");
        }
    }
}