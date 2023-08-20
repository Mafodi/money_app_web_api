package platforms.ui.Web.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class VAS_Voucher_AccountsPage {

    @FindBy(how = How.XPATH, using = "//span[@class='tnc-highlighter']")
    public WebElement TermsConditions;

    @FindBy(how = How.XPATH, using = "//b[contains(text(),'Please review our terms and conditions')]")
    public WebElement TermsConditionsScreen;

    @FindBy(how = How.ID, using = "overlay-close")
    public WebElement CancelTermsConditions;
}
