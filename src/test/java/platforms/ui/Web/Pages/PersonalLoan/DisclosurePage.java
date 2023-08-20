package platforms.ui.Web.Pages.PersonalLoan;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DisclosurePage {

    @FindBy(how = How.ID, using ="undefined-f-option-1")
    public WebElement SpouseAgreed;

    @FindBy(how = How.ID, using ="undefined-f-option-2")
    public WebElement DoesntApply;

    @FindBy(how = How.XPATH, using ="//*[@id=\"scroll-page\"]/div/div/div/app-landing/app-stepper-workflow/div/div/div[2]/app-disclosures/div/div/div[2]/div/div[2]/div[1]/div/ul[1]/li[1]/span[1]")
    public WebElement debitOrderMandateHeading;

    @FindBy(how = How.XPATH, using ="//*[@id=\"scroll-page\"]/div/div/div/app-landing/app-stepper-workflow/div/div/div[2]/app-disclosures/div/div/div[2]/div/div[2]/div[1]/div/ul[1]/li[2]")
    public WebElement debitOrderMandateText;

    @FindBy(how = How.XPATH, using ="//*[@id=\"scroll-page\"]/div/div/div/app-landing/app-stepper-workflow/div/div/div[2]/app-disclosures/div/div/div[2]/div/div[2]/div[1]/div/ul[2]/li[1]/span[1]")
    public WebElement creditAndFraudMandateHeading;

    @FindBy(how = How.XPATH, using ="//*[@id=\"scroll-page\"]/div/div/div/app-landing/app-stepper-workflow/div/div/div[2]/app-disclosures/div/div/div[2]/div/div[2]/div[1]/div/ul[2]/li[2]")
    public WebElement creditAndFraudMandateText;

    @FindBy(how = How.XPATH, using ="//*[@id=\"scroll-page\"]/div/div/div/app-landing/app-stepper-workflow/div/div/div[2]/app-disclosures/div/div/div[2]/div/div[2]/div[1]/div/ul[3]/li[1]/span[1]")
    public WebElement honestyHeading;

    @FindBy(how = How.XPATH, using ="//*[@id=\"scroll-page\"]/div/div/div/app-landing/app-stepper-workflow/div/div/div[2]/app-disclosures/div/div/div[2]/div/div[2]/div[1]/div/ul[3]/li[2]")
    public WebElement honestyText;

    @FindBy(how = How.XPATH, using ="//*[@id=\"scroll-page\"]/div/div/div/app-landing/app-stepper-workflow/div/div/div[2]/app-disclosures/div/div/div[2]/div/div[2]/div[1]/div/ul[4]/li[1]/span[1]")
    public WebElement  spousalConsentHeading;

    @FindBy(how = How.XPATH, using ="//*[@id=\"scroll-page\"]/div/div/div/app-landing/app-stepper-workflow/div/div/div[2]/app-disclosures/div/div/div[2]/div/div[2]/div[1]/div/ul[4]/li[2]/p")
    public WebElement spousalConsentText;

    @FindBy(how = How.XPATH, using ="//*[@id=\"scroll-page\"]/div/div/div/app-landing/app-stepper-workflow/div/div/div[2]/app-disclosures/div/div/div[2]/div/div[2]/div[1]/div/ul[5]/li[1]/span[1]")
    public WebElement  spousalConsentHeadingStaff;

    @FindBy(how = How.XPATH, using ="//*[@id=\"scroll-page\"]/div/div/div/app-landing/app-stepper-workflow/div/div/div[2]/app-disclosures/div/div/div[2]/div/div[2]/div[1]/div/ul[5]/li[2]/p")
    public WebElement spousalConsentTextStaff;

    @FindBy(how = How.XPATH, using ="//*[@id=\"scroll-page\"]/div/div/div/app-landing/app-stepper-workflow/div/div/div[2]/app-disclosures/div/div/div[2]/div/div[2]/div[1]/div/ul[4]/li[1]/span[1]")
    public WebElement  settlementHeading;

    @FindBy(how = How.XPATH, using ="//*[@id=\"scroll-page\"]/div/div/div/app-landing/app-stepper-workflow/div/div/div[2]/app-disclosures/div/div/div[2]/div/div[2]/div[1]/div/ul[4]/li[2]")
    public WebElement settlementText;

}
