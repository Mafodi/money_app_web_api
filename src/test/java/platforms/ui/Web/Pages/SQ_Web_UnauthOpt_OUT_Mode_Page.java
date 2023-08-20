package platforms.ui.Web.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SQ_Web_UnauthOpt_OUT_Mode_Page {


    @FindBy(how = How.XPATH, using = "//div[normalize-space()='Search for a suburb']//following::div//input[@type='text']")
    public WebElement Searchbar_input;

    @FindBy(how = How.XPATH, using = "//div[contains(@class,'info-name')]")
    public WebElement Morebranchinfo_Landingpage;

    @FindBy(how = How.XPATH, using = "//div[contains(@class,'info-status')]")
    public WebElement Branch_Status_Landingpage;

    @FindBy(how = How.XPATH, using = "//div[@class='accordion']")
    public WebElement Accordion_view;

    @FindBy(how = How.XPATH, using = "//*[@src='./assets/svg/icon-branch-code.svg']")
    public WebElement AddressIcon;

    @FindBy(how = How.XPATH, using = "//*[@src='./assets/svg/icon-phone.svg']")
    public WebElement PhoneIcon;

    @FindBy(how = How.XPATH, using = "//*[@src='./assets/svg/icon-mail.svg']")
    public WebElement EmailIcon;

    @FindBy(how = How.XPATH, using = "//td[contains(normalize-space(),'Branch code')]")
    public WebElement BranchcodeIcon;

    @FindBy(how = How.XPATH, using = "//th[normalize-space()='Opening hours']")
    public WebElement Openinghours_header;

    @FindBy(how = How.XPATH, using = "//th[normalize-space()='Features']")
    public WebElement Features_header;

    @FindBy(how = How.XPATH, using = "//label[normalize-space()='In-branch services']")
    public WebElement Inbarnch_Services_header;

    @FindBy(how = How.XPATH, using = "//div[@class='closeIcon']")
    public WebElement Close_Icon;

    @FindBy(how = How.XPATH, using = "//div[text()='Filter search results']")
    public WebElement Advance_Filter;

    @FindBy(how = How.XPATH, using = "//label[@class='btn-group-label']")
    public WebElement Label_searchbar;

    @FindBy(how = How.XPATH, using = "//div[@aria-label='Please select branch opening hours']//div[normalize-space()='Select an option'] ")
    public WebElement Filter_Openinghours_click;

    @FindBy(how = How.XPATH, using = "//div[@aria-label='Please select in branch services']//div[normalize-space()='Select an option'] ")
    public WebElement Filter_Inbranchservices_click;

    @FindBy(how = How.XPATH, using = "//div[@aria-label='Please select branch facilities']//div[normalize-space()='Select an option'] ")
    public WebElement Filter_Features_click;

    @FindBy(how = How.XPATH, using = "//div[normalize-space()='A maximum of 3 options can be selected']")
    public WebElement Filter_warning_msg;

    @FindBy(how = How.XPATH, using = "//button[@id='apply_filters']")
    public WebElement Apply_Filter;

    @FindBy(how = How.XPATH, using = "//label[normalize-space()='Features']")
    public WebElement Label_feature;

    @FindBy(how = How.XPATH, using = "//div[@aria-label=\"I'm looking for:\"]")
    public WebElement ATM_Branch_Bar;

    @FindBy(how = How.XPATH, using = "//p[normalize-space()='ATM']")
    public WebElement ATM_Tab;

    @FindBy(how = How.XPATH, using = "//p[normalize-space()='Branch']")
    public WebElement Branch_Tab;

    @FindBy(how = How.XPATH, using = "//span[normalize-space()='No results found']")
    public WebElement No_result_found;

    @FindBy(how = How.XPATH, using = "//div[normalize-space()='No results found']")
    public WebElement No_result_found_searchbar;

    @FindBy(how = How.XPATH, using = "//button[@id='clear_filters']")
    public WebElement Clear_Filter;

    @FindBy(how = How.XPATH, using = "//div[@class='service-tag clear']")
    public WebElement Clear_All;

}
