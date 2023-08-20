package platforms.ui.Web.StepDefinitions.PersonalLoan;

import cucumber.api.java.en.And;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import platforms.ui.Web.Pages.PersonalLoan.YourOfferPage;
import platforms.ui.Web.StepDefinitions.Common.DashboardSteps;
import utils.CommonFunctions;
import utils.Utils;

public class YourOfferSteps extends Utils {

    public YourOfferPage yourOfferPage = PageFactory.initElements(driver, YourOfferPage.class);
    private static Logger log = Logger.getLogger(DashboardSteps.class);
    WebDriverWait wait = new WebDriverWait(driver,10);
    CommonFunctions commonFunctions = new CommonFunctions();


    @And("^user recalculate personal loan \"([^\"]*)\" \"([^\"]*)\"$")
    public void userRecalculatePersonalLoan(String repaymentDate,String loanAmount) {

        commonFunctions.secondsDelay(5);
        yourOfferPage.loanAmount.clear();
        yourOfferPage.loanAmount.sendKeys(loanAmount);


        if(driver.getPageSource().contains(repaymentDate)){
            commonFunctions.findAndClickButtonByText("Salary date");
        }

        commonFunctions.findAndClickButtonByText("Recalculate");

        commonFunctions.secondsDelay(5);
        commonFunctions.clickConfirm();
        commonFunctions.secondsDelay(5);
    }

}
