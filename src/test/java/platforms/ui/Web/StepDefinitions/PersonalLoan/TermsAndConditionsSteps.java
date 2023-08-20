package platforms.ui.Web.StepDefinitions.PersonalLoan;

import cucumber.api.java.en.And;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import platforms.ui.Web.Pages.PersonalLoan.TermsAndConditionsPage;
import platforms.ui.Web.StepDefinitions.Common.DashboardSteps;
import utils.CommonFunctions;
import utils.Utils;

public class TermsAndConditionsSteps   extends Utils {

    public TermsAndConditionsPage termsAndConditionsPage = PageFactory.initElements(driver, TermsAndConditionsPage.class);
    private static Logger log = Logger.getLogger(DashboardSteps.class);
    WebDriverWait wait = new WebDriverWait(driver,10);
    CommonFunctions commonFunctions = new CommonFunctions();

    @And("^user accept terms and conditions$")
    public void userAcceptsTermsAndConditions() {

        commonFunctions.waitForElementToBeVisible("agree");
        termsAndConditionsPage.AgreeTC.click();
    }
}
