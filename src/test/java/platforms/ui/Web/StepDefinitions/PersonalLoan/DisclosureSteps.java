package platforms.ui.Web.StepDefinitions.PersonalLoan;

import cucumber.api.java.en.And;
import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import platforms.ui.Web.Pages.PersonalLoan.DisclosurePage;
import platforms.ui.Web.StepDefinitions.Common.DashboardSteps;
import utils.CommonFunctions;
import utils.Utils;

public class DisclosureSteps  extends Utils {

    public DisclosurePage disclosurePage = PageFactory.initElements(driver, DisclosurePage.class);
    private static Logger log = Logger.getLogger(DashboardSteps.class);
    WebDriverWait wait = new WebDriverWait(driver,10);
    CommonFunctions commonFunctions = new CommonFunctions();

    @And("^user confirms disclosure \"([^\"]*)\"$")
    public void userConfirmsDisclosure(String offerDescription) {
        String actualText = "";
        String expectedText ="";


//        commonFunctions.StringValidation("Debit order mandate");

        if(!offerDescription.contains("month")) {

//            commonFunctions.StringValidation("Your instalment is due from the 1st of next " +
//                    "month and you consent to our debiting your Nedbank " +
//                    "salary account on the day your salary is paid.");
//
//            commonFunctions.StringValidation("Credit and fraud check mandate");
//
//            commonFunctions.StringValidation("By accepting this offer, you agree that Nedbank may " +
//                    "do credit and fraud checks when necessary.");
//
//            commonFunctions.StringValidation("Honesty");
//
//            actualText = disclosurePage.honestyText.getText();
//            expectedText = "You confirm that the information you've provided is correct.";
//            Assert.assertEquals(actualText, expectedText);


            if (!offerDescription.contains("Personal loan")) {
//                commonFunctions.StringValidation("Settlements");
//
//                actualText = disclosurePage.settlementText.getText();
//                expectedText = "We'll make necessary payment(s) to your credit providers" +
//                        " to settle the existing loans, however, it's your responsibility" +
//                        " to make sure that they've been paid in full. You must contact " +
//                        "your credit providers to confirm that there are no outstanding " +
//                        "interest charges or fees on the loan(s) and must settle any " +
//                        "outstanding fee(s) or interest immediately.";
//                Assert.assertEquals(actualText, expectedText);
//
//                commonFunctions.StringValidation("Spousal consent");

//                actualText = disclosurePage.spousalConsentText.getText();
//                expectedText = "If you're married in community of property or if you " +
//                        "were married outside of South Africa, your spouse must agree " +
//                        "in writing to your taking up this loan.";
//                Assert.assertEquals(actualText, expectedText);
//                Assert.assertEquals(actualText, expectedText);

            } else {

//                commonFunctions.StringValidation("Spousal consent");
//
//                actualText = disclosurePage.spousalConsentText.getText();
//                expectedText = "If you're married in community of property or if you " +
//                        "were married outside of South Africa, your spouse must agree " +
//                        "in writing to your taking up this loan.";
//                Assert.assertEquals(actualText, expectedText);
            }
        }
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", disclosurePage.DoesntApply);

        commonFunctions.clickConfirm();
    }
}
