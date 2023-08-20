package platforms.ui.Web.StepDefinitions.PersonalLoan;

import cucumber.api.java.en.And;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import platforms.ui.Web.Pages.PersonalLoan.ReviewPage;
import platforms.ui.Web.StepDefinitions.Common.DashboardSteps;
import utils.CommonFunctions;
import utils.Utils;

public class ReviewSteps  extends Utils {

    public ReviewPage reviewPage = PageFactory.initElements(driver, ReviewPage.class);
    private static Logger log = Logger.getLogger(DashboardSteps.class);
    WebDriverWait wait = new WebDriverWait(driver,10);
    CommonFunctions commonFunctions = new CommonFunctions();

    @And("^user reviews personal loan \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void userReviewsPersonalLoan(String staff,String nedbankInsurance,String offerDescription) {
        String actualText = "";
        String expectedText ="";

//        actualText = reviewPage.checkInfoHeadingText.getText();
//        expectedText = "Please check the information you're about to submit.";
//        Assert.assertEquals(actualText, expectedText);

        if(staff.equals("no")){



            if(offerDescription.contains("Personal loan")){



                if(commonFunctions.waitForElementVisibleByXpath(2,"//*[@id=\"scroll-page\"]/div/div/div/app-landing/app-stepper-workflow/div/div/div[2]/app-review/div/div/div[3]/div[2]/p") == true){
//                    actualText = reviewPage.loanDetailsText.getText();
//                    expectedText = "Details of your loan";
//                    Assert.assertEquals(actualText, expectedText);
                }else{
//                    actualText = reviewPage.loanDetailsText2.getText();
//                    expectedText = "Details of your loan";
//                    Assert.assertEquals(actualText, expectedText);
                }


                if(offerDescription.contains("WKLY")){
//                    actualText = reviewPage.monthlyRepaymentText.getText();
//                    expectedText = "Total repayment";
//                    Assert.assertEquals(actualText, expectedText);
                }else{

//                    commonFunctions.StringValidation("Total monthly repayment");
                }

//                actualText = reviewPage.totalLoansAmountText.getText();
//                expectedText = "Total you'll pay back";
//                Assert.assertEquals(actualText, expectedText);
//
//                commonFunctions.StringValidation("Fixed interest rate");
//
//                commonFunctions.StringValidation("Number of instalments");
//
//                commonFunctions.StringValidation("Credit cost multiple");

            }else if (offerDescription.contains("month")) {
                //                commonFunctions.StringValidation("");
            }else{

//                commonFunctions.StringValidation("Details of your loan");

//                actualText = reviewPage.accountAmountText.getText();
//                expectedText = "Amount we'll pay to settle your loans";
//                Assert.assertEquals(actualText, expectedText);

                //commonFunctions.StringValidation("Amount we'll pay into your account");

//                commonFunctions.StringValidation("Total loan amount");
//
//                actualText = reviewPage.totalLoansAmountText.getText();
//                expectedText = "Total loan amount";
//                Assert.assertEquals(actualText, expectedText);
//
//                commonFunctions.StringValidation("Fixed interest rate");
//
//                commonFunctions.StringValidation("Number of instalments");
//
//                commonFunctions.StringValidation("Initiation fee");
//
//                commonFunctions.StringValidation("Credit cost multiple");
            }

            if(offerDescription.contains("WKLY")){
//                commonFunctions.StringValidation("Total repayment");
            }else if(!offerDescription.contains("month")){
//                commonFunctions.StringValidation("Total monthly repayment");

            if(!offerDescription.contains("month")) {
//                commonFunctions.StringValidation("Credit life insurance");
//
//                commonFunctions.StringValidation("Monthly service fee");
//
//                commonFunctions.StringValidation("Base repayment");
//
//                commonFunctions.StringValidation("Total loan amount");
//
//                commonFunctions.StringValidation("Credit life insurance");

//                actualText = reviewPage.lifeInsuranceText.getText();
//                expectedText ="If you take out a personal loan, you need credit life insurance to ensure that your loan is covered in the event of your death, disablement or retrenchment. Please call 0860 263 543 for more information.\n" +
//                        "We’ve included Nedbank credit insurance in our offer. The cover is subject to exclusions , which we’ll email to you.";
//                Assert.assertEquals(actualText, expectedText);
            }

        }else{
            //if user is Staff
//            commonFunctions.findAndClickButtonByText("Staff");
//
//            commonFunctions.StringValidation("Details of your loan");

            if(offerDescription.contains("Personal loan")){

                if(offerDescription.contains("WKLY")){
//                    commonFunctions.StringValidation("Total repayment");
                }else{
//                    commonFunctions.StringValidation("Total monthly repayment");
                }

                if(offerDescription.contains("Personal loan")) {
//                    commonFunctions.StringValidation("Total loan amount");
//
//                    commonFunctions.StringValidation("Total you'll pay back");
                }else{
//                    commonFunctions.StringValidation("Total you'll pay back");
//
//                    commonFunctions.StringValidation("Fixed interest rate");
                }



            }else{
//                actualText = reviewPage.accountAmountTextStaff.getText();
//                expectedText = "Amount we'll pay into your account";
//                Assert.assertEquals(actualText, expectedText);
//
//                actualText = reviewPage.totalAmountPayableTextStaff.getText();
//                expectedText = "Total loan amount";
//                Assert.assertEquals(actualText, expectedText);
//
//                actualText = reviewPage.onceOffTextStaff.getText();
//                expectedText = "Once-off initiation fee of 8%";
//                Assert.assertEquals(actualText, expectedText);
//
//                actualText = reviewPage.totalYoullPayTextStuff.getText();
//                expectedText = "Total you'll pay back";
//                Assert.assertEquals(actualText, expectedText);
//
//                actualText = reviewPage.numberOfInstallmentsTextStaff.getText();
//                expectedText = "Number of instalments";
//                Assert.assertEquals(actualText, expectedText);

//                actualText = reviewPage.initiationFeeTextStaff.getText();
//                expectedText = "Initiation fee";
//                Assert.assertEquals(actualText, expectedText);
//
//                actualText = reviewPage.creditCostTextStaff.getText();
//                expectedText = "Credit cost multiple";
//                Assert.assertEquals(actualText, expectedText);
            }
//
//                commonFunctions.StringValidation("Staff discount");
//
//                commonFunctions.StringValidation("Staff variable interest rate");
//
//                commonFunctions.StringValidation("Staff discount");

            if(offerDescription.contains("WKLY")){
//                commonFunctions.StringValidation("Total repayment");
            }else{
//                actualText = reviewPage.monthlyRepaymentTextStaff.getText();
//                expectedText = "Total monthly repayment";
//                Assert.assertEquals(actualText, expectedText);
            }
//                actualText = reviewPage.creditLifeTextStaff.getText();
//                expectedText = "Credit life insurance";
//                Assert.assertEquals(actualText, expectedText);
//
//                actualText = reviewPage.serviceFeeTextStaff.getText();
//                expectedText = "Monthly service fee";
//                Assert.assertEquals(actualText, expectedText);
//
//                actualText = reviewPage.baseRepaymentTextStaff.getText();
//                expectedText = "Base repayment";
//                Assert.assertEquals(actualText, expectedText);
//
//                actualText = reviewPage.totalTexStaff.getText();
//                expectedText = "Total";
//                Assert.assertEquals(actualText, expectedText);
//
//                actualText = reviewPage.creditLifeInsuranceHeadingTextStaff.getText();
//                expectedText = "Credit life insurance";
//                Assert.assertEquals(actualText, expectedText);
//
//                actualText = reviewPage.lifeInsuranceTextStaff.getText();
//                expectedText ="If you take out a personal loan, you need credit life insurance to ensure that your loan is covered in the event of your death, disablement or retrenchment. Please call 0860 263 543 for more information.\n" +
//                        "We’ve included Nedbank credit insurance in our offer. The cover is subject to exclusions , which we’ll email to you.";
//                Assert.assertEquals(actualText, expectedText);
        }


        if(nedbankInsurance.equals("no")) {

            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true)", driver.findElement(By.id("confirm")));

            commonFunctions.secondsDelay(2);

            reviewPage.noNedInsure.click();

            commonFunctions.secondsDelay(2);
//
//            actualText = reviewPage.noNedInsureInfo.getText();
//
//            commonFunctions.StringValidation("If you choose to use your own insurance, this online application will end." +
//                    "\n We’ll have to call you to help you with your personal-loan application. As a result the process may take longer." +
//                    "\n Would you like to continue, using your own insurance?");
        }


    }

        commonFunctions.clickConfirm();
    }
}
