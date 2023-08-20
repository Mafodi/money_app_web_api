package platforms.ui.Web.StepDefinitions.PersonalLoan;

import cucumber.api.java.en.And;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import platforms.ui.Web.Pages.PersonalLoan.IncomeAndExpensesPage;
import platforms.ui.Web.StepDefinitions.Common.DashboardSteps;
import utils.CommonFunctions;
import utils.Utils;

public class IncomeAndExpensesSteps  extends Utils {

    public IncomeAndExpensesPage incomeAndExpensesPage = PageFactory.initElements(driver, IncomeAndExpensesPage.class);
    private static Logger log = Logger.getLogger(DashboardSteps.class);
    WebDriverWait wait = new WebDriverWait(driver,10);
    CommonFunctions commonFunctions = new CommonFunctions();

    @And("^confirm income and expenses \"([^\"]*)\" \"([^\"]*)\"$")
    public void confirmIncomeAndExpenses(String correctInfo,String offerDecription) {

        String actualText = "";
        String expectedText = "";

        //commonFunctions.StringValidation("Your monthly income and expenses");
        commonFunctions.secondsDelay(5);
        commonFunctions.StringValidation("Total monthly debt obligations");

        commonFunctions.StringValidation("Total monthly income");

        commonFunctions.StringValidation("Total monthly living expenses");

        if (offerDecription.contains("Consolidation")) {

            commonFunctions.StringValidation("Your current loans to be consolidated");

            commonFunctions.StringValidation("NEDBANK PERSONAL LOANS");

            commonFunctions.StringValidation("Account number");

            commonFunctions.StringValidation("Outstanding amount");

            commonFunctions.StringValidation("Instalments payable");

            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true)", driver.findElement(By.id("confirm")));

            if(offerDecription.contains("WKLY")){

                actualText = incomeAndExpensesPage.conPleaseNoteToolTip.getText();
                expectedText = "Please note.\n" +
                        "We see you get paid weekly, this is a summarised view of all" +
                        " your income and expenses per month.";
                Assert.assertEquals(actualText, expectedText);

                commonFunctions.StringValidation("Is your information correct?");
            }else{

                commonFunctions.StringValidation("Is your information correct?");
            }

        }else if(offerDecription.contains("WKLY")){

            actualText = incomeAndExpensesPage.standalonePleaseNoteToolTip.getText();
            expectedText = "Please note.\n" +
                    "We see you get paid weekly, this is a summarised view of all" +
                    " your income and expenses per month.";
            Assert.assertEquals(actualText, expectedText);

            commonFunctions.StringValidation("Is your information correct?");
        }

            if (correctInfo.equalsIgnoreCase("yes")) {

                if (offerDecription.contains("WKLY Pass:Consolidation")) {

                    commonFunctions.findAndClickButtonByText("Yes");

                } else if (offerDecription.contains("MNTHLY Pass:Consolidation")) {

                    commonFunctions.secondsDelay(5);
                    commonFunctions.findAndClickButtonByText("Yes");

                } else if (offerDecription.contains("MNTHLY Pass:Personal") || offerDecription.contains("MNTHLY Pass:One month")) {

                    commonFunctions.secondsDelay(5);
                    commonFunctions.findAndClickButtonByText("Yes");

                } else if (offerDecription.contains("WKLY Pass:Personal")) {

                    commonFunctions.findAndClickButtonByText("Yes");
                }
                commonFunctions.clickConfirm();

            } else if (correctInfo.equalsIgnoreCase("no")) {

                if (offerDecription.contains("WKLY Pass:Consolidation")) {

                    incomeAndExpensesPage.WKLYConNoButton.click();

                } else if (offerDecription.contains("MNTHLY Pass:Consolidation")) {

                    incomeAndExpensesPage.MNTLYConNoButton.click();

                } else if (offerDecription.contains("MNTHLY Pass:Personal")) {

                    incomeAndExpensesPage.MNTLYNoButton.click();

                } else if (offerDecription.contains("WKLY Pass:Personal")) {

                    incomeAndExpensesPage.WKLYNoButton.click();
                }

                commonFunctions.StringValidation("Please note.\n" +
                        "\n" +
                        "If your information is wrong, we’ll need to end this application. " +
                        "You’ll be given the option to tell us which information is wrong " +
                        "and we’ll be in touch to help you.");

                commonFunctions.clickConfirm();

            }

    }
}
