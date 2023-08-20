package platforms.ui.Web.Pages.Common;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DashboardPage {

    @FindBy(how = How.XPATH, using ="//*[@id=\"scroll-page\"]/div/div/div/app-landing/div/div/div[1]/div/div/app-greeting/div/div/span")
    public WebElement WelcomeText;

    @FindBy(how = How.XPATH, using ="/html/body/app-root/app-header/div/header[2]/div/div/div/div/div[2]/ul/li[2]/div")
    public WebElement NotificationIcon;

    @FindBy(how = How.XPATH, using ="//*[@id=\"scroll-page\"]/div/app-side-bar/div[1]/div/div/app-notification/div/ul/li[2]/div[1]/p")
    public WebElement ForYouButton;

    @FindBy(how = How.XPATH, using ="//*[@id=\"scroll-page\"]/div/app-side-bar/div[1]/div/div/app-notification/div/div/div")
    public WebElement NotificationText;

    @FindBy(how = How.XPATH, using = "/html/body/app-root/cookie-law/cookie-law-component/div/div/span/div/span[2]/a")
    public WebElement AcceptCookies;

    @FindBy(how = How.XPATH, using = "/html/body/app-root/cookie-law/cookie-law-component/div/div/span/div/span[3]")
    public WebElement CloseCookies;

    @FindBy(how = How.XPATH, using = "//*[@id=\"scroll-page\"]/div/div/div/app-landing/app-stepper-workflow/div/div/app-navigation-bar/div[1]/div[2]")
    public WebElement Exit;

}