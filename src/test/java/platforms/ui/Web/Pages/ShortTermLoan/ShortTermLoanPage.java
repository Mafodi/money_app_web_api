package platforms.ui.Web.Pages.ShortTermLoan;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ShortTermLoanPage {


    @FindBy(how = How.ID, using ="no_thanks")
    public WebElement noThanksBTN;

    @FindBy(how = How.ID, using ="i'm_interested")
    public WebElement interestedBTN;

}
