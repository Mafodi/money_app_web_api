package platforms.ui.Web.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FND_ProfilePage {

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Settings')]")
    public WebElement Setting_Menu_link_xpath;

    @FindBy(how = How.XPATH, using = "//h5[contains(text(),'Profile settings')]")
    public WebElement Profile_Setings_xpath;

    @FindBy(how = How.XPATH, using = "//p[contains(text(),'View and change your profile limits.')]")
    public WebElement Profile_Limits_xpath;

    @FindBy(how = How.XPATH, using = "//p[contains(text(),'View and update your profile details.')]")
    public WebElement Profile_Details_xpath;

    @FindBy(how = How.XPATH, using = "//h4[@class='section-title profile-limit-header']")
    public WebElement Profile_Dash_xpath;

    @FindBy(how = How.ID, using = "update")
    public WebElement Update_Id;

    @FindBy(how = How.XPATH, using = "//button[@class='gd-ghost-btn button-width postionHeaderBtnGrp']")
    public WebElement Cancel_Xpath;

    @FindBy(how = How.CSS, using = ".limit-widget")
    public WebElement Profile_Limits_List_Css;

    @FindBy(how = How.XPATH, using = "//*[@for='transferf-option-1']")
    public WebElement Transfer_Perma_Xpath;

    @FindBy(how = How.XPATH, using = "//label[@for='paymentf-option-1']")
    public WebElement Payment_Perma_Xpath;

    @FindBy(how = How.XPATH, using = "//label[@for='lottof-option-1']")
    public WebElement Lotto_Perma_Xpath;

    @FindBy(how = How.XPATH, using = "//label[@for='sendimalif-option-1']")
    public WebElement SendIMali_Perma_Xpath;

    @FindBy(how = How.XPATH, using = "//label[@for='prepaidf-option-1']")
    public WebElement PrepaidLimit_Perma_Xpath;

    @FindBy(how = How.XPATH, using = "//label[@for='instantpaymentf-option-1']")
    public WebElement InstantLimit_Perma_Xpath;

    @FindBy(how = How.XPATH, using = "//*[@for='transferf-option-2']")
    public WebElement Transfer_Temp_Xpath;

    @FindBy(how = How.XPATH, using = "(//input[@name='amount'])[1]")
    public WebElement Transfer_Input_Xpath;

    @FindBy(how = How.XPATH, using = "//label[@for='paymentf-option-2']")
    public WebElement Payment_Temp_Xpath;

    @FindBy(how = How.XPATH, using = "(//input[@name='amount'])[2]")
    public WebElement Payment_Input_Xpath;

    @FindBy(how = How.XPATH, using = "//label[@for='lottof-option-2']")
    public WebElement Lotto_Temp_Xpath;

    @FindBy(how = How.XPATH, using = "(//input[@name='amount'])[3]")
    public WebElement Lotto_Input_Xpath;

    @FindBy(how = How.XPATH, using = "//label[@for='sendimalif-option-2']")
    public WebElement SendIMali_Temp_Xpath;

    @FindBy(how = How.XPATH, using = "(//input[@name='amount'])[4]")
    public WebElement SendIMali_Input_Xpath;

    @FindBy(how = How.XPATH, using = "//label[@for='prepaidf-option-2']")
    public WebElement PrepaidLimit_Temp_Xpath;

    @FindBy(how = How.XPATH, using = "(//input[@name='amount'])[5]")
    public WebElement PrepaidLimit_Input_Xpath;

    @FindBy(how = How.XPATH, using = "//label[@for='instantpaymentf-option-2']")
    public WebElement InstantLimit_Temp_Xpath;

    @FindBy(how = How.XPATH, using = "(//input[@name='amount'])[6]")
    public WebElement InstantLimit_Input_Xpath;

    @FindBy(how = How.XPATH, using = "//span[@class='header-message']")
    public WebElement UpdateMessage_Xpath;

    public String getLimit_List_xpath = "//div[@class='col-xs-12 col-sm-7 limit-header']";

    @FindBy(how = How.XPATH, using = "//a[@class='link-text-normal']")
    public WebElement Profile_Edit_Xpath;

    @FindBy(how = How.XPATH, using = "//div[@class='initials']")
    public WebElement Initial_Xpath;

    @FindBy(how = How.XPATH, using = "//span[@class='setting-icon']")
    public WebElement Setting_Xpath;


    @FindBy(how = How.ID,using = "preferredName")
    public WebElement Input_Edit_Xpath;

    @FindBy(how = How.ID, using = "update")
    public WebElement Update_Xpath;

    @FindBy(how = How.ID, using = "cancel")
    public WebElement Cancel_Update_xPath;

    @FindBy(how = How.XPATH, using = "//div[@class='error-message']")
    public WebElement Success_Text_Xpath;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Edit details')]")
    public WebElement Edit_Other_Xpath;

    @FindBy(how = How.XPATH, using = "//div[@class='bottom-container']//label")
    public WebElement Consent_Xpath;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Save changes')]")
    public WebElement Save_Button_Xpath;

    @FindBy(how = How.XPATH, using = " //div[contains(text(),\"You've updated your profile details.\")]")
    public WebElement Save_Message_Xpath;

    @FindBy(how = How.ID, using = "emailInput")
    public WebElement Email_Input_xPath;

    @FindBy(how = How.ID, using = "altCellInput")
    public WebElement AlterCell_Input_xPath;

    @FindBy(how = How.ID, using = "homeCellInput")
    public WebElement HomeCell_Input_xPath;

    @FindBy(how = How.ID, using = "workCellInput")
    public WebElement WorkCell_Input_xPath;

    @FindBy(how = How.ID, using = "addressLine1")
    public WebElement AddressLine1_Input_xPath;

    @FindBy(how = How.ID, using = "addressLine2")
    public WebElement AddressLine2_Input_xPath;


    @FindBy(how = How.XPATH, using = "(//input[@role='combobox'])[1]")
    public WebElement City_Input_xPath;

    @FindBy(how = How.XPATH, using = "(//input[@role='combobox'])[2]")
    public WebElement Suburb_Input1_xPath;

    @FindBy(how = How.ID, using = "addressLine1Postal1")
    public WebElement AddressLine_Postal_Input_xPath;

    @FindBy(how = How.ID, using = "addressLine1Postal2")
    public WebElement AddressLine_Postal2_Input_xPath;

    @FindBy(how = How.XPATH, using = "(//input[@role='combobox'])[2]")
    public WebElement Suburb_Postal_Input_xPath;

    @FindBy(how = How.XPATH, using = "//span[@class='highlightText']")
    public WebElement Highlight_xpath;

    @FindBy(how = How.XPATH, using = "(//span[contains(text(),'Edit')])[2]")
    public WebElement Contact_Edit_Xpath;

    @FindBy(how = How.XPATH, using = "(//span[contains(text(),'Edit')])[3]")
    public WebElement Residential_Edit_Xpath;

    @FindBy(how = How.XPATH, using = "(//span[contains(text(),'Edit')])[4]")
    public WebElement Postal_Edit_Xpath;

    @FindBy(how = How.XPATH, using = "(//input[@role='combobox'])[1]")
    public WebElement Postal_City_Xpath;

    @FindBy(how = How.XPATH, using = "//div[@class='gd-form-row consent-row']//div[@class='icon gd-checkbox']")
    public WebElement Postal_Check_Xpath;

    @FindBy(how = How.XPATH, using = "//div[@class='gd-form-row consent-row']//div[@class='icon gd-checkbox']")
    public WebElement Postal_Checked_Xpath;

    public String Province_xpath = ".//div[@id='stateInput']";
    public String Province_list_xpath=".//ul[@id='provincelist']";
    public String Postal_Province_xpath = ".//div[@id='stateInput']";
    public String Postal_Province_list_xpath= "//ul[@id='provincelist']";





    //Change Password

    @FindBy(how = How.XPATH, using = "//p[contains(text(),'Change your Nedbank ID password.')]")
    public WebElement Change_Id_Pw_xPath;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Password')]")
    public WebElement Change_Password_Xpath;

    @FindBy(how = How.ID, using = "oldPassword")
    public WebElement Old_Password_Xpath;

    @FindBy(how = How.ID, using = "password")
    public WebElement New_Password_Xpath;

    @FindBy(how = How.XPATH, using = " (//span[@class='eye-img'])[1]")
    public WebElement Eye_Img1_Xpath;

    @FindBy(how = How.XPATH, using = " (//span[@class='eye-img'])[2]")
    public WebElement Eye_Img2_Xpath;

    @FindBy(how = How.XPATH, using = "//div[@class='passwordMeter']")
    public WebElement Pw_Meter_Xpath;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Passwords match')]")
    public WebElement Pw_Match_Xpath;

    @FindBy(how = How.XPATH, using = "//div[@class='error-msg']")
    public WebElement Pw_Match_Err_Xpath;

}



