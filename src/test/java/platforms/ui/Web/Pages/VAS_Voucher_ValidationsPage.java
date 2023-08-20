package platforms.ui.Web.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class VAS_Voucher_ValidationsPage {

    @FindBy(how = How.XPATH, using = "//span[@class='message-content']")
    public WebElement OwnAmountError;

    @FindBy(how = How.XPATH, using = "//span[@class='error-icon']")
    public WebElement ReferenceError;
}
