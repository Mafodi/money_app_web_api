package platforms.ui.Web.Pages.PersonalLoan;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DebiCheckPage {

    @FindBy(how = How.XPATH, using ="//*[@id=\"scroll-page\"]/div/div/div/app-landing/app-stepper-workflow/div/div/div[2]/app-debit-order/div/div[1]")
    public WebElement validation;



    @FindBy(how = How.XPATH, using ="//*[@id=\"scroll-page\"]/div/div/div/app-landing/app-stepper-workflow/div/div/div[2]/app-debit-order/div/div[1]/div[2]/p[2]")
    public WebElement ifYouChoose;

    @FindBy(how = How.XPATH, using ="")
    public WebElement reasonForLoanDropDown;

    @FindBy(how = How.XPATH, using ="decline")
    public WebElement declineBTN;

    @FindBy(how = How.ID, using ="authorise")
    public WebElement authoriseBTN;
}
