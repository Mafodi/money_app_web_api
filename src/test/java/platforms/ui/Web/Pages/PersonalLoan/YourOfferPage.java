package platforms.ui.Web.Pages.PersonalLoan;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class YourOfferPage {

    @FindBy(how = How.ID, using ="slider-cntnr")
    public WebElement AmountSlider;

    @FindBy(how = How.ID, using ="recalculate")
    public WebElement RecalculateButton;

    @FindBy(how = How.XPATH, using ="//*[@id=\"loan-amount\"]")
    public WebElement loanAmount;
}
