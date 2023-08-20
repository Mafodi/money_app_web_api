package platforms.ui.Web.Pages.Common;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class WrongInformationPage {

    @FindBy(how = How.XPATH, using ="//*[@id=\"main-overlay\"]/div/div[2]/div/div/div/app-wrong-information/div/div[1]/div[1]")
    public WebElement heading;

    @FindBy(how = How.ID, using ="options-check-wrong-0")
    public WebElement monthlyIncome;

    @FindBy(how = How.ID, using ="options-check-wrong-1")
    public WebElement livingExpenses;

    @FindBy(how = How.ID, using ="options-check-wrong-2")
    public WebElement debtObligations;

    @FindBy(how = How.ID, using ="send_feedback")
    public WebElement sendFeedback;

}
