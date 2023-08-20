package platforms.ui.Web.StepDefinitions.PersonalLoan;

import cucumber.api.java.en.And;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import platforms.ui.Web.Pages.PersonalLoan.FinalStepPage;
import platforms.ui.Web.StepDefinitions.Common.DashboardSteps;
import utils.CommonFunctions;
import utils.Utils;

public class FinalStepSteps extends Utils {

    public FinalStepPage finalStepStepPage = PageFactory.initElements(driver, FinalStepPage.class);
    private static Logger log = Logger.getLogger(DashboardSteps.class);
    WebDriverWait wait = new WebDriverWait(driver,10);


    CommonFunctions commonFunctions = new CommonFunctions();

    @And("^user completes the offer \"([^\"]*)\" \"([^\"]*)\"$")
    public void userCompletesOffer(String reasonForLoan,String email) {

        commonFunctions.secondsDelay(5);

        finalStepStepPage.reasonForLoanDropDown.click();

        commonFunctions.findAndClickButtonByText(reasonForLoan);

        finalStepStepPage.emailText.sendKeys(email);

        finalStepStepPage.acceptLoanBTN.click();
    }
}
