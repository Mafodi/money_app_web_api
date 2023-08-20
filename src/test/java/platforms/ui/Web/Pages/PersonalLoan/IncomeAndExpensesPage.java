package platforms.ui.Web.Pages.PersonalLoan;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class IncomeAndExpensesPage {

    @FindBy(how = How.XPATH, using ="//*[@id=\"scroll-page\"]/div/div/div/app-landing/app-stepper-workflow/div/div/div[2]/app-information/div/div[3]/div/div[2]")
    public WebElement standalonePleaseNoteToolTip;

    @FindBy(how = How.XPATH, using ="//*[@id=\"scroll-page\"]/div/div/div/app-landing/app-stepper-workflow/div/div/div[2]/app-information/div/div[4]/div/div[2]")
    public WebElement conPleaseNoteToolTip;

    @FindBy(how = How.XPATH, using ="//*[@id=\"scroll-page\"]/div/div/div/app-landing/app-stepper-workflow/div/div/div[2]/app-information/div/div[6]/table/tbody/tr/td[1]/p")
    public WebElement conWKLYCorrectInfoText;

    @FindBy(how = How.XPATH, using ="//*[@id=\"scroll-page\"]/div/div/div/app-landing/app-stepper-workflow/div/div/div[2]/app-information/div/div[4]/table/tbody/tr/td[1]/p")
    public WebElement conCorrectInfoText;

    @FindBy(how = How.XPATH, using ="//*[@id=\"scroll-page\"]/div/div/div/app-landing/app-stepper-workflow/div/div/div[2]/app-information/div/div[5]/table/tbody/tr/td[1]/p")
    public WebElement standaloneCorrectInfoText;

    @FindBy(how = How.XPATH, using ="//*[@id=\"scroll-page\"]/div/div/div/app-landing/app-stepper-workflow/div/div/div[2]/app-information/div/div[3]/table/tbody/tr/td[1]/p")
    public WebElement correctInfoText;

    @FindBy(how = How.XPATH, using ="//*[@id=\"scroll-page\"]/div/div/div/app-landing/app-stepper-workflow/div/div/div[2]/app-information/div/div[1]/div/div[2]/span")
    public WebElement monthlyIncomeHeadingText;

    @FindBy(how = How.XPATH, using ="//*[@id=\"scroll-page\"]/div/div/div/app-landing/app-stepper-workflow/div/div/div[2]/app-information/div/div[1]/table/tbody/tr[1]/td[1]/div/span[1]")
    public WebElement monthlyIncomeText;

    @FindBy(how = How.XPATH, using ="//*[@id=\"scroll-page\"]/div/div/div/app-landing/app-stepper-workflow/div/div/div[2]/app-information/div/div[1]/table/tbody/tr[2]/td[1]/div/span[1]")
    public WebElement totalMonthlyExpenses;

    @FindBy(how = How.XPATH, using ="//*[@id=\"scroll-page\"]/div/div/div/app-landing/app-stepper-workflow/div/div/div[2]/app-information/div/div[1]/table/tbody/tr[3]/td[1]/div/span[1]")
    public WebElement totalMonthlyDebtObligations;

    @FindBy(how = How.XPATH, using ="//*[@id=\"scroll-page\"]/div/div/div/app-landing/app-stepper-workflow/div/div/div[2]/app-information/div/div[4]/table/tbody/tr/td[2]/div/app-toggle-button-group/div/div[1]/label/div/p")
    public WebElement MNTLYConYesButton;

    @FindBy(how = How.XPATH, using ="//*[@id=\"scroll-page\"]/div/div/div/app-landing/app-stepper-workflow/div/div/div[2]/app-information/div/div[4]/table/tbody/tr/td[2]/div/app-toggle-button-group/div/div[2]/label/div/p")
    public WebElement MNTLYConNoButton;

    @FindBy(how = How.XPATH, using ="//*[@id=\"scroll-page\"]/div/div/div/app-landing/app-stepper-workflow/div/div/div[2]/app-information/div/div[6]/table/tbody/tr/td[2]/div/app-toggle-button-group/div/div[1]/label/div/p")
    public WebElement WKLYConYesButton;

    @FindBy(how = How.XPATH, using ="//*[@id=\"scroll-page\"]/div/div/div/app-landing/app-stepper-workflow/div/div/div[2]/app-information/div/div[6]/table/tbody/tr/td[2]/div/app-toggle-button-group/div/div[2]/label/div/p")
    public WebElement WKLYConNoButton;

    @FindBy(how = How.XPATH, using ="//*[@id=\"scroll-page\"]/div/div/div/app-landing/app-stepper-workflow/div/div/div[2]/app-information/div/div[5]/table/tbody/tr/td[2]/div/app-toggle-button-group/div/div[1]/label/div/p")
    public WebElement WKLYYesButton;

    @FindBy(how = How.XPATH, using ="//*[@id=\"scroll-page\"]/div/div/div/app-landing/app-stepper-workflow/div/div/div[2]/app-information/div/div[5]/table/tbody/tr/td[2]/div/app-toggle-button-group/div/div[2]/label/div/p")
    public WebElement WKLYNoButton;

    @FindBy(how = How.XPATH, using ="//*[@id=\"scroll-page\"]/div/div/div/app-landing/app-stepper-workflow/div/div/div[2]/app-information/div/div[3]/table/tr/td[2]/div/app-toggle-button-group/div/div[1]/label/div/p")
    public WebElement MNTLYYesButton;

    @FindBy(how = How.XPATH, using ="//*[@id=\"scroll-page\"]/div/div/div/app-landing/app-stepper-workflow/div/div/div[2]/app-information/div/div[3]/table/tbody/tr/td[2]/div/app-toggle-button-group/div/div[2]/label/div/p")
    public WebElement MNTLYNoButton;

    @FindBy(how = How.XPATH, using ="//*[@id=\"scroll-page\"]/div/div/div/app-landing/app-stepper-workflow/div/div/div[2]/app-information/div/div[4]/div/div/div[2]/p[2]")
    public WebElement incorrectInfo;

    //consolidated
    @FindBy(how = How.XPATH, using ="//*[@id=\"scroll-page\"]/div/div/div/app-landing/app-stepper-workflow/div/div/div[2]/app-information/div/div[2]/div/div/span")
    public WebElement loanToBeConsolidatedText;

    @FindBy(how = How.XPATH, using ="//*[@id=\"scroll-page\"]/div/div/div/app-landing/app-stepper-workflow/div/div/div[2]/app-information/div/div[2]/table/tbody/tr[1]/td/span")
    public WebElement nedbankPersonalLoanText;

    @FindBy(how = How.XPATH, using ="//*[@id=\"scroll-page\"]/div/div/div/app-landing/app-stepper-workflow/div/div/div[2]/app-information/div/div[2]/table/tbody/tr[2]/td[1]/div/span")
    public WebElement accountNumberText;

    @FindBy(how = How.XPATH, using ="//*[@id=\"scroll-page\"]/div/div/div/app-landing/app-stepper-workflow/div/div/div[2]/app-information/div/div[2]/table/tbody/tr[3]/td[1]/div/span[1]")
    public WebElement outstandingAmountText;

    @FindBy(how = How.XPATH, using ="//*[@id=\"scroll-page\"]/div/div/div/app-landing/app-stepper-workflow/div/div/div[2]/app-information/div/div[2]/table/tbody/tr[4]/td[1]/div/span")
    public WebElement instalmentsPayableText;


}