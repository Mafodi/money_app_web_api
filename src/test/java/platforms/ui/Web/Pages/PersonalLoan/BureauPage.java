package platforms.ui.Web.Pages.PersonalLoan;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BureauPage {

    @FindBy(how = How.XPATH, using ="//*[@id=\"main-overlay\"]/div/div[2]/div/div/div/app-opps/div/div[2]")
    public WebElement clause;

    @FindBy(how = How.ID, using ="close")
    public WebElement closeBTN;


}
