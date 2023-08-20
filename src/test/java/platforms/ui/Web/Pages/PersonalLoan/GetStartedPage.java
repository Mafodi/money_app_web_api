package platforms.ui.Web.Pages.PersonalLoan;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class GetStartedPage {

    //consolidation
    @FindBy(how = How.XPATH, using ="//*[@id=\"main-overlay\"]/div/div[2]/div/div/div/div/div[1]/div[1]/div[4]/span")
    public WebElement multipleLoanText;
    @FindBy(how = How.XPATH, using ="//*[@id=\"main-overlay\"]/div/div[2]/div/div/div/div/div[1]/div[1]/div[5]/span")
    public WebElement settleLoanText;
    @FindBy(how = How.XPATH, using ="//*[@id=\"main-overlay\"]/div/div[2]/div/div/div/div/div[1]/div[1]/div[6]/span")
    public WebElement monthlyInstalmentText;


    @FindBy(how = How.XPATH, using ="//*[@id=\"main-overlay\"]/div/div[2]/div/div/div/div/div[1]/div[1]/div[2]/span")
    public WebElement mailHeadingText;
    @FindBy(how = How.XPATH, using ="//*[@id=\"main-overlay\"]/div/div[2]/div/div/div/div/div[1]/div[1]/div[3]/span")
    public WebElement pleaseConfirmText;


    @FindBy(how = How.XPATH, using ="//*[@id=\"main-overlay\"]/div/div[2]/div/div/div/div/div[1]/div[2]/div[1]/div[2]/div")
    public WebElement employeedText;
    @FindBy(how = How.XPATH, using ="//*[@id=\"main-overlay\"]/div/div[2]/div/div/div/div/div[1]/div[3]/div[1]/div[2]/div")
    public WebElement spouceText;
    @FindBy(how = How.XPATH, using ="//*[@id=\"main-overlay\"]/div/div[2]/div/div/div/div/div[1]/div[4]/div[1]/div[2]/div")
    public WebElement consentText;

}
