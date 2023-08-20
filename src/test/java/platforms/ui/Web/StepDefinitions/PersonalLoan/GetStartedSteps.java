package platforms.ui.Web.StepDefinitions.PersonalLoan;

import cucumber.api.java.en.And;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import platforms.ui.Web.Pages.PersonalLoan.GetStartedPage;
import platforms.ui.Web.StepDefinitions.Common.DashboardSteps;
import utils.CommonFunctions;
import utils.Utils;

public class GetStartedSteps extends Utils {

    public GetStartedPage getStartedPage = PageFactory.initElements(driver, GetStartedPage.class);
    private static Logger log = Logger.getLogger(DashboardSteps.class);
    WebDriverWait wait = new WebDriverWait(driver,10);
    CommonFunctions commonFunctions = new CommonFunctions();

    @And("^user confirms the consent \"([^\"]*)\"$")
    public void userConfirmsTheConsent(String offerDecription) {

        commonFunctions.secondsDelay(5);
        String actualText = "";
        String expectedText = "";

        if (offerDecription.contains("Consolidation")) {

//            actualText = getStartedPage.mailHeadingText.getText();
//            expectedText = "Are you tired of paying multiple loan accounts every month?";
//            Assert.assertThat(actualText, CoreMatchers.containsString(expectedText));
//
//            actualText = getStartedPage.multipleLoanText.getText();
//            expectedText = "Allow us to settle your loans on your behalf so that you:";
//            Assert.assertEquals(actualText, expectedText);
//
//            actualText = getStartedPage.settleLoanText.getText();
//            expectedText = "Can pay a fixed monthly instalment at a fixed interest rate;" +
//                    " and could qualify for a reduced monthly instalment on your loan.";
//            Assert.assertEquals(actualText, expectedText);

        }else if (offerDecription.contains("One month")) {
            //cater for heading
        } else if (offerDecription.contains("Personal")) {
//
//            actualText = getStartedPage.pleaseConfirmText.getText();
//            expectedText = "To get a decision in a few minutes, please confirm that:";
//            Assert.assertEquals(actualText, expectedText);
        }


//        actualText = getStartedPage.employeedText.getText();
//        expectedText = "you're permanently employed;";
//        Assert.assertEquals(actualText, expectedText);
//
//        actualText = getStartedPage.spouceText.getText();
//        expectedText = "neither you nor your spouse is insolvent, under administration, " +
//                "curatorship or undergoing debt counselling and that neither you nor " +
//                "your spouse has any pending disputes with a credit bureau;";
//        Assert.assertEquals(actualText, expectedText);
//
//        actualText = getStartedPage.consentText.getText();
//        expectedText = "you consent to us processing your personal information so that " +
//                "we can provide banking services to you.";
//        Assert.assertEquals(actualText, expectedText);

        commonFunctions.clickAllCheckBoxes();

        commonFunctions.clickConfirm();

    }

}
