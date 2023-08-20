package platforms.ui.Web.StepDefinitions.PersonalLoan;

import cucumber.api.java.en.And;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import platforms.ui.Web.Pages.PersonalLoan.DebiCheckPage;
import platforms.ui.Web.StepDefinitions.Common.DashboardSteps;
import utils.CommonFunctions;
import utils.Utils;

public class DebiCheckSteps extends Utils {

    public DebiCheckPage debiCheckPage = PageFactory.initElements(driver, DebiCheckPage.class);
    private static Logger log = Logger.getLogger(DashboardSteps.class);
    WebDriverWait wait = new WebDriverWait(driver,10);
    CommonFunctions commonFunctions = new CommonFunctions();

    @And("^user authorises the debicheck$")
    public void userAuthoriseDebiCheck() {
        String actualText = "";
        String expectedText ="";

        commonFunctions.StringValidation("For your added security");
        commonFunctions.StringValidation("Please review and authorise these debit order details through DebiCheck.");

        actualText = debiCheckPage.ifYouChoose.getText();
        expectedText ="If you choose not to use this security feature, we'll still debit you for your loan when your repayments are due.";
        Assert.assertEquals(actualText, expectedText);

        commonFunctions.StringValidation("Details of your debit order");
        commonFunctions.StringValidation("Name of creditor");
        commonFunctions.StringValidation("NEDBANK PERSONAL LOANS");
        commonFunctions.StringValidation("Account debited");
        commonFunctions.StringValidation("Instalment amount");
        commonFunctions.StringValidation("Collection day");
        commonFunctions.StringValidation("Contract reference number");

        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",debiCheckPage.authoriseBTN);

    }

}
