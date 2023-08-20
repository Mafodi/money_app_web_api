package platforms.ui.Web.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SQ_Web_Queuetimes_Page {


    @FindBy(how = How.XPATH, using = "//a[(normalize-space()='Service waiting times')]")
    public WebElement Inbranchservices_estimatedtimes;

    @FindBy(how = How.XPATH, using = "//tbody//tr//td[normalize-space()='HH:MM']")
    public WebElement Header_waitingtimes;

    @FindBy(how = How.XPATH, using = "//button[@id='refresh']")
    public WebElement Button_refresh;

    @FindBy(how = How.XPATH, using = "//div[contains(normalize-space(),'Waiting times last updated:')]")
    public WebElement Timestamp_waitingtimes;

}
