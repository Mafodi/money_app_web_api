package platforms.ui.Web.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TransferPage {


    @FindBy(how = How.LINK_TEXT, using = "Transfer")
    public WebElement Transfer_Menu;

    @FindBy(how = How.ID, using = "transfer-amount")
    public WebElement Transfer_Ammount_Field;

    @FindBy(how = How.ID, using = "next")
    public WebElement next;

    @FindBy(how = How.ID, using = "transfer")
    public WebElement Transfer_Button;

    @FindBy(how = How.ID, using = "datePicker")
    public WebElement Transfer_Date;

    @FindBy(how = How.XPATH, using = "//*[@id=\"radio-btn-list\"]/ul/li[2]/div/label")
    public WebElement Transfer_Occurrence;

    @FindBy(how = How.ID, using = "numRecurrence")
    public WebElement Transfer_Occurrence_Number;

    @FindBy(how = How.ID, using = "trns-select-freq")
    public WebElement Transfer_Repeat;

    @FindBy(how = How.XPATH, using = "//*[@id=\"trns-transfer-amount\"]/div[7]/div[1]/ul/li[3]")
    public WebElement Transfer_Monthly;

    @FindBy(how = How.XPATH, using = "//*[@id=\"trns-transfer-amount\"]/div[7]/div[1]/ul/li[2]")
    public WebElement Transfer_Weekly;

    @FindBy(how = How.XPATH, using = "//*[@id=\"trns-transfer-status\"]/div/app-circle-icon-heading/div/div/span[2]")
    public WebElement Transfer_Status;

    public String Transfer_DropDown_css = ".dropdown-place";
    public String Transfer_DropDownListItem_css = ".dropdown-menu>li";
    public String Transfer_ToAccount =  ".//*[@id='to_account']/div";
    public String Transfer_ToAccountList = ".//*[@id='to_account']/ul";


}
