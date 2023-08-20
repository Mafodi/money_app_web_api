package platforms.ui.Web.Pages.Common;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SuccessPage {

    @FindBy(how = How.XPATH, using ="//*[@id=\"main-overlay\"]/div/div[2]/div/div/div/div/div/div[1]/div/div[1]/p[1]")
    public WebElement successText;

    @FindBy(how = How.XPATH, using ="//*[@id=\"main-overlay\"]/div/div[2]/div/div/div/div/div/div[1]/div/div[1]/p[2]")
    public WebElement loanAprovedText;

    @FindBy(how = How.XPATH, using ="//*[@id=\"main-overlay\"]/div/div[2]/div/div/div/div/div/div[1]/div/div[3]/span")
    public WebElement loanWillBePaidText;

    @FindBy(how = How.XPATH, using ="//*[@id=\"main-overlay\"]/div/div[2]/div/div/div/div/div/div[1]/div/div[5]/span")
    public WebElement documentsText;

    @FindBy(how = How.XPATH, using ="//*[@id=\"main-overlay\"]/div/div[2]/div/div/div/div/div/div[1]/div/div[6]/span")
    public WebElement helpText;

    @FindBy(how = How.ID, using ="done")
    public WebElement doneBTN;

}
