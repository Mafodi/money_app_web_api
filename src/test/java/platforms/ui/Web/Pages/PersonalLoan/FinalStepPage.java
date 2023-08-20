package platforms.ui.Web.Pages.PersonalLoan;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FinalStepPage {

    @FindBy(how = How.XPATH, using ="//*[@id=\"scroll-page\"]/div/div/div/app-landing/app-stepper-workflow/div/div/div[2]/app-final-step/div/div/div/div/div[3]/div[2]/div/div[1]")
    public WebElement reasonForLoanDropDown;

    @FindBy(how = How.ID, using ="email")
    public WebElement emailText;

    @FindBy(how = How.ID, using ="accept_loan")
    public WebElement acceptLoanBTN;
}
