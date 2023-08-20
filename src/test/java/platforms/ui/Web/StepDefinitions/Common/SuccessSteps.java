package platforms.ui.Web.StepDefinitions.Common;

import cucumber.api.java.en.And;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import platforms.ui.Web.Pages.Common.SuccessPage;
import utils.CommonFunctions;
import utils.Utils;

public class SuccessSteps extends Utils {

    public SuccessPage successPage = PageFactory.initElements(driver, SuccessPage.class);
    private static Logger log = Logger.getLogger(DashboardSteps.class);
    WebDriverWait wait = new WebDriverWait(driver,10);
    CommonFunctions commonFunctions = new CommonFunctions();

    @And("^user sees successful screen$")
    public void userCompletesOffer() {

        commonFunctions.secondsDelay(5);

        commonFunctions.StringValidation("Success!");

        commonFunctions.StringValidation("Your loan application has been approved");

        commonFunctions.StringValidation("Your loan will be paid into your Nedbank " +
                "salary account ending in ****5951 within the next " +
                "business day.");

        commonFunctions.StringValidation("Your personal loan documents will be emailed" +
                " to you within 3 working days.");

        commonFunctions.StringValidation("If you need help or have any questions, call " +
                "us on 0860 555 1110860 555 111 or email us at " +
                "PLAdmin@Nedbank.co.zaPLAdmin@Nedbank.co.za.");

        successPage.doneBTN.click();
    }
}
