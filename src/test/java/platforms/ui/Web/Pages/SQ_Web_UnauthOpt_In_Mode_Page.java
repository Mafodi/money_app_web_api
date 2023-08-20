package platforms.ui.Web.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class SQ_Web_UnauthOpt_In_Mode_Page {


    @FindBy(how = How.XPATH, using = "//div//a[normalize-space()='Branch locator']")
    public WebElement BranchLocator;

    @FindBy(how = How.ID, using = "username")
    public WebElement username;

    @FindBy(how = How.XPATH, using = "//div[@class='pad-sidebar']")
    public WebElement BranchAtm_Sidebar;

    @FindBy(how = How.XPATH, using = "//ul[@role='menu']")
    public WebElement BranchMenu;

    @FindBy(how = How.XPATH, using = "//ul[@role='menu']/li/div[1]")
    public List<WebElement> ListofBranches;

    @FindBy(how = How.XPATH, using = "//span[@title='Clear all']")
    public WebElement searchbar_clear;

    @FindBy(how = How.XPATH, using = "//p[normalize-space()='Branch']")
    public WebElement Branch_Tab;

    @FindBy(how = How.XPATH, using = "//div[@class='ng-dropdown-panel-items scroll-host']")
    public WebElement Dropdown_Panel_list;

    @FindBy(how = How.XPATH, using = "(//span[@class='branch-more-info'])[1]")
    public WebElement Morebranchinfo_firstbranch;

    @FindBy(how = How.XPATH, using = "(//li[@role='menuitem'])[1]")
    public WebElement first_branch;

    @FindBy(how = How.XPATH, using = "(//span[@class='status'])[1]")
    public WebElement first_branch_status;

    @FindBy(how = How.XPATH, using = "(//div[@class='branch-name'])[1]")
    public WebElement first_branch_Name;

    @FindBy(how = How.XPATH, using = "(//span[contains(normalize-space(),'kms')])[1]")
    public WebElement first_branch_kms;

    @FindBy(how = How.XPATH, using = "(//div[contains(normalize-space(),'kms')])[1]")
    public WebElement first_ATM_kms;

    @FindBy(how = How.XPATH, using = "(//div[@class='branch-stats']//div)[2]")
    public WebElement first_ATM_Address;

    @FindBy(how = How.XPATH, using = "//a[contains(normalize-space(),'Service')]")
    public WebElement Inbranchservice;

    @FindBy(how = How.XPATH, using = "//a[normalize-space()='Services']")
    public WebElement Nonqmatic_Inbranchservice;

    @FindBy(how = How.XPATH, using = "//tbody[@class='ng-star-inserted']")
    public WebElement InbranchserviceList;

    @FindBy(how = How.XPATH, using = "//a[normalize-space()='Features']")
    public WebElement Feature;

    @FindBy(how = How.XPATH, using = "//div[@class='items']")
    public WebElement Feature_List;

    @FindBy(how = How.XPATH, using = "//a[normalize-space()='Opening hours']")
    public WebElement Openinghours;

    @FindBy(how = How.XPATH, using = "//table[@class='trading-hours']")
    public WebElement Tradinghours;

    @FindBy(how = How.XPATH, using = "//div[@class='holiday-msg ng-star-inserted']")
    public WebElement Static_publicholiday_msg;

    @FindBy(how = How.XPATH, using = "//label[normalize-space()='Located in or close to:']")
    public WebElement Title_searchbar;

    @FindBy(how = How.XPATH, using = "//div[normalize-space()='Murraysburg Ddu']//following-sibling::div[@class='branch-stats']//div")
    public List<WebElement> ATM_Stats;

    @FindBy(how = How.XPATH, using = "(//i[@class='location-icon'])[1]")
    public WebElement Getdirection_location;

}
