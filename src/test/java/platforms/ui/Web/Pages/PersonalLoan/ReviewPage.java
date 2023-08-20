package platforms.ui.Web.Pages.PersonalLoan;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ReviewPage {

    @FindBy(how = How.XPATH, using ="//*[@id=\"scroll-page\"]/div/div/div/app-landing/app-stepper-workflow/div/div/div[2]/app-review/div/div/div[7]/table/tbody/tr/td[2]/div/app-toggle-button-group/div/div[1]/label/div/p")
    public WebElement yesNedInsure;

    @FindBy(how = How.XPATH, using ="//*[@id=\"scroll-page\"]/div/div/div/app-landing/app-stepper-workflow/div/div/div[2]/app-review/div/div/div[7]/table/tbody/tr/td[2]/div/app-toggle-button-group/div/div[2]/label/div/p")
    public WebElement noNedInsure;

    @FindBy(how = How.XPATH, using ="//*[@id=\"scroll-page\"]/div/div/div/app-landing/app-stepper-workflow/div/div/div[2]/app-review/div/div/div[8]/div/div/div[2]/div[2]")
    public WebElement noNedInsureInfo;

    @FindBy(how = How.XPATH, using ="//*[@id=\"scroll-page\"]/div/div/div/app-landing/app-stepper-workflow/div/div/div[2]/app-review/div/div/div[1]/p")
    public WebElement checkInfoHeadingText;

    @FindBy(how = How.XPATH, using ="//*[@id=\"scroll-page\"]/div/div/div/app-landing/app-stepper-workflow/div/div/div[2]/app-review/div/div/div[3]/div[2]/p")
    public WebElement loanDetailsText;

    @FindBy(how = How.XPATH, using ="//*[@id=\"scroll-page\"]/div/div/div/app-landing/app-stepper-workflow/div/div/div[2]/app-review/div/div/div[4]/div[3]/p")
    public WebElement loanDetailsText2;

    @FindBy(how = How.XPATH, using ="//*[@id=\"scroll-page\"]/div/div/div/app-landing/app-stepper-workflow/div/div/div[2]/app-review/div/div/div[4]/div[3]/div[2]/table/tr[1]/td[1]/span[1]")
    public WebElement accountAmountText;


    @FindBy(how = How.XPATH, using ="//*[@id=\"scroll-page\"]/div/div/div/app-landing/app-stepper-workflow/div/div/div[2]/app-review/div/div/div[3]/div[2]/div[2]/table/tr[3]/td[1]/span[1]")
    public WebElement totalLoansAmountText;

    @FindBy(how = How.XPATH, using ="//*[@id=\"scroll-page\"]/div/div/div/app-landing/app-stepper-workflow/div/div/div[2]/app-review/div/div/div[3]/div[2]/div[2]/table/tr[4]/td[1]/span[1]")
    public WebElement totalAmountPayableText;

    @FindBy(how = How.XPATH, using ="//*[@id=\"scroll-page\"]/div/div/div/app-landing/app-stepper-workflow/div/div/div[2]/app-review/div/div/div[3]/div[2]/div[2]/table/tr[5]/td[1]/span")
    public WebElement fixedInterestRateText;

    @FindBy(how = How.XPATH, using ="//*[@id=\"scroll-page\"]/div/div/div/app-landing/app-stepper-workflow/div/div/div[2]/app-review/div/div/div[3]/div[2]/div[2]/table/tr[6]/td[1]/span")
    public WebElement numberOfInstallmentsText;

    @FindBy(how = How.XPATH, using ="//*[@id=\"scroll-page\"]/div/div/div/app-landing/app-stepper-workflow/div/div/div[2]/app-review/div/div/div[3]/div[2]/div[2]/table/tr[7]/td[1]/span")
    public WebElement initiationFeeText;

    @FindBy(how = How.XPATH, using ="//*[@id=\"scroll-page\"]/div/div/div/app-landing/app-stepper-workflow/div/div/div[2]/app-review/div/div/div[3]/div[2]/div[2]/table/tr[8]/td[1]/span[1]")
    public WebElement creditCostText;

    @FindBy(how = How.XPATH, using ="//*[@id=\"scroll-page\"]/div/div/div/app-landing/app-stepper-workflow/div/div/div[2]/app-review/div/div/div[3]/div[3]/p")
    public WebElement monthlyRepaymentText;


    @FindBy(how = How.XPATH, using ="//*[@id=\"scroll-page\"]/div/div/div/app-landing/app-stepper-workflow/div/div/div[2]/app-review/div/div/div[3]/div[3]/div[2]/table/tr[1]/td[1]/span")
    public WebElement creditLifeText;


    @FindBy(how = How.XPATH, using ="//*[@id=\"scroll-page\"]/div/div/div/app-landing/app-stepper-workflow/div/div/div[2]/app-review/div/div/div[3]/div[3]/div[2]/table/tr[2]/td[1]/span")
    public WebElement serviceFeeText;


    @FindBy(how = How.XPATH, using ="//*[@id=\"scroll-page\"]/div/div/div/app-landing/app-stepper-workflow/div/div/div[2]/app-review/div/div/div[3]/div[3]/div[2]/table/tr[3]/td[1]/span")
    public WebElement baseRepaymentText;


    @FindBy(how = How.XPATH, using ="//*[@id=\"scroll-page\"]/div/div/div/app-landing/app-stepper-workflow/div/div/div[2]/app-review/div/div/div[3]/div[3]/div[2]/div[2]/table/tr/td/span[2]")
    public WebElement totalText;


    @FindBy(how = How.XPATH, using ="//*[@id=\"scroll-page\"]/div/div/div/app-landing/app-stepper-workflow/div/div/div[2]/app-review/div/div/div[4]/div[1]/p")
    public WebElement creditLifeInsuranceHeadingText;


    @FindBy(how = How.XPATH, using ="//*[@id=\"scroll-page\"]/div/div/div/app-landing/app-stepper-workflow/div/div/div[2]/app-review/div/div/div[4]/div[3]")
    public WebElement lifeInsuranceText;

    //===============Staff================


    @FindBy(how = How.XPATH, using ="//*[@id=\"scroll-page\"]/div/div/div/app-landing/app-stepper-workflow/div/div/div[2]/app-review/div/div/div[4]/div[3]/p")
    public WebElement loanDetailsTextStaff;

    @FindBy(how = How.XPATH, using ="//*[@id=\"scroll-page\"]/div/div/div/app-landing/app-stepper-workflow/div/div/div[2]/app-review/div/div/div[2]/div[2]/div[2]/table/tr[1]/td[1]/span")
    public WebElement accountAmountTextStaff;

    @FindBy(how = How.XPATH, using ="//*[@id=\"scroll-page\"]/div/div/div/app-landing/app-stepper-workflow/div/div/div[2]/app-review/div/div/div[2]/div[2]/div[2]/table/tr[2]/td[1]/span[1]")
    public WebElement totalLoansAmountTextStaff;

    @FindBy(how = How.XPATH, using ="//*[@id=\"scroll-page\"]/div/div/div/app-landing/app-stepper-workflow/div/div/div[2]/app-review/div/div/div[2]/div[2]/div[2]/table/tr[2]/td[1]/span[1]")
    public WebElement totalAmountPayableTextStaff;

    @FindBy(how = How.XPATH, using ="//*[@id=\"scroll-page\"]/div/div/div/app-landing/app-stepper-workflow/div/div/div[2]/app-review/div/div/div[2]/div[2]/div[2]/table/tr[3]/td[1]/span")
    public WebElement onceOffTextStaff;

    @FindBy(how = How.XPATH, using ="//*[@id=\"scroll-page\"]/div/div/div/app-landing/app-stepper-workflow/div/div/div[2]/app-review/div/div/div[2]/div[2]/div[2]/table/tr[5]/td[1]/span")
    public WebElement numberOfInstallmentsTextStaff;

    @FindBy(how = How.XPATH, using ="//*[@id=\"scroll-page\"]/div/div/div/app-landing/app-stepper-workflow/div/div/div[2]/app-review/div/div/div[2]/div[2]/div[2]/table/tr[4]/td[1]/span")
    public WebElement totalYoullPayTextStuff;

    @FindBy(how = How.XPATH, using ="//*[@id=\"scroll-page\"]/div/div/div/app-landing/app-stepper-workflow/div/div/div[2]/app-review/div/div/div[2]/div[3]/div[2]/table/tr[5]/td[1]/span")
    public WebElement fixedInterestRateTextStaff;

    @FindBy(how = How.XPATH, using ="//*[@id=\"scroll-page\"]/div/div/div/app-landing/app-stepper-workflow/div/div/div[2]/app-review/div/div/div[2]/div[3]/div[2]/table/tr[7]/td[1]/span")
    public WebElement initiationFeeTextStaff;

    @FindBy(how = How.XPATH, using ="//*[@id=\"scroll-page\"]/div/div/div/app-landing/app-stepper-workflow/div/div/div[2]/app-review/div/div/div[2]/div[2]/div[2]/table/tr[6]/td[1]/span[1]")
    public WebElement creditCostTextStaff;

    @FindBy(how = How.XPATH, using ="//*[@id=\"scroll-page\"]/div/div/div/app-landing/app-stepper-workflow/div/div/div[2]/app-review/div/div/div[4]/div[4]/p")
    public WebElement monthlyRepaymentTextStaff;

    @FindBy(how = How.XPATH, using ="//*[@id=\"scroll-page\"]/div/div/div/app-landing/app-stepper-workflow/div/div/div[2]/app-review/div/div/div[4]/div[4]/div[2]/table/tr[1]/td[1]/span")
    public WebElement creditLifeTextStaff;

    @FindBy(how = How.XPATH, using ="//*[@id=\"scroll-page\"]/div/div/div/app-landing/app-stepper-workflow/div/div/div[2]/app-review/div/div/div[4]/div[4]/div[2]/table/tr[2]/td[1]/span")
    public WebElement serviceFeeTextStaff;

    @FindBy(how = How.XPATH, using ="//*[@id=\"scroll-page\"]/div/div/div/app-landing/app-stepper-workflow/div/div/div[2]/app-review/div/div/div[4]/div[4]/div[2]/table/tr[3]/td[1]/span")
    public WebElement baseRepaymentTextStaff;

    @FindBy(how = How.XPATH, using ="//*[@id=\"scroll-page\"]/div/div/div/app-landing/app-stepper-workflow/div/div/div[2]/app-review/div/div/div[4]/div[4]/div[2]/table/tr[4]/td[1]/span[1]")
    public WebElement standardAmountTextStuff;

    @FindBy(how = How.XPATH, using ="//*[@id=\"scroll-page\"]/div/div/div/app-landing/app-stepper-workflow/div/div/div[2]/app-review/div/div/div[4]/div[5]/p")
    public WebElement staffDiscountHeading;

    @FindBy(how = How.XPATH, using ="//*[@id=\"scroll-page\"]/div/div/div/app-landing/app-stepper-workflow/div/div/div[2]/app-review/div/div/div[4]/div[5]/div[2]/table/tr[1]/td[1]/span[1]")
    public WebElement staffInterestRate;

    @FindBy(how = How.XPATH, using ="//*[@id=\"scroll-page\"]/div/div/div/app-landing/app-stepper-workflow/div/div/div[2]/app-review/div/div/div[4]/div[5]/div[2]/table/tr[2]/td[1]/span")
    public WebElement staffDiscount2;

    @FindBy(how = How.XPATH, using ="//*[@id=\"scroll-page\"]/div/div/div/app-landing/app-stepper-workflow/div/div/div[2]/app-review/div/div/div[4]/div[5]/div[2]/table/tr[2]/td[2]/div/span[1]")
    public WebElement totalTexStaff;

    @FindBy(how = How.XPATH, using ="//*[@id=\"scroll-page\"]/div/div/div/app-landing/app-stepper-workflow/div/div/div[2]/app-review/div/div/div[5]/div[1]/p")
    public WebElement creditLifeInsuranceHeadingTextStaff;

    @FindBy(how = How.XPATH, using ="//*[@id=\"scroll-page\"]/div/div/div/app-landing/app-stepper-workflow/div/div/div[2]/app-review/div/div/div[5]/div[3]")
    public WebElement lifeInsuranceTextStaff;

}