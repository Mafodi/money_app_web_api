package platforms.ui.Web.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FND_RecipientPage {

    @FindBy(how = How.XPATH, using = "//a[text()='Recipients']")
    public WebElement Recipients;

    @FindBy(how = How.XPATH, using = "span[text()='View More Details']")//span[@class='toggle-icon']
    public WebElement View_More_Details;

    @FindBy(how = How.XPATH, using = "//span[text()='×']")
    public WebElement Close_Error_Message;

    @FindBy(how = How.XPATH, using = "//span[@class='text' and text()='Add a new recipient']")
    public WebElement Add_A_New_Recipient;

    @FindBy(how = How.XPATH, using = "//span[text()='×']")
    public WebElement Close_Button_Apologies;

    @FindBy(how = How.XPATH, using = "(//button[@id='delete_recipient'])[2]")
    public WebElement Delete_Recipient;

    @FindBy(how = How.XPATH, using = "(//button[@id='delete_recipient'])[4]")
    public WebElement Delete_Recipient_In_Popoup;

    @FindBy(how = How.XPATH, using = "//div[@class='error-message']")
    public WebElement Success_Message_After_Delete;

    @FindBy(how = How.ID, using = "contact-card-name")
    public WebElement Recipient_Name;

    @FindBy(how = How.ID, using = "view-meter-account-number-0")
    public WebElement View_Meter_Account_No;

    @FindBy(how = How.ID, using = "view-read-only-account-number-0")
    public WebElement Account_No_After_Saving_Edit;

    @FindBy(how = How.ID, using = "view-readonly-account-number-0")
    public WebElement Mobile_No_After_Saving_Edit;

    @FindBy(how = How.ID, using = "view-read-only-account-number-0")
    public WebElement Mobile_No_After_Saving_Edit2;

    @FindBy(how = How.ID, using = "view-readonly-account-number-0")
    public WebElement Account_No_After_Saving;//view-meter-account-number-0

    @FindBy(how = How.ID, using = "view-meter-account-number-0")
    public WebElement Meter_Account_No_After_Saving;

    @FindBy(how = How.ID, using = "view-read-only-account-number-0")
    public WebElement Account_No_After_Saving2;

    @FindBy(how = How.ID, using = "Cross--Cross")
    public WebElement IBM_Cross;

    @FindBy(how = How.XPATH, using = "//button[text()='Add email']")
    public WebElement Add_Email_Button;

    @FindBy(how = How.XPATH, using = "//div[@class='clear-field-block']//input")
    public WebElement Search_Beneficiary_Text_Field;

    @FindBy(how = How.ID, using = "add-email-address-0")
    public WebElement Add_Email_Send_Text;

    @FindBy(how = How.ID, using = "srch-recip-card-A-0")
    public WebElement Search_Result_First_Name;

    @FindBy(how = How.ID, using = "srch-recip-card-S-0")
    public WebElement Search_Result_First_Name_Electric_Meter;

    @FindBy(how = How.XPATH, using = "(//button[text()='Add cellphone number'])[1]")
    public WebElement Add_Cellphone_No_Button;

    @FindBy(how = How.XPATH, using = "(//button[@id='edit_or_add_details'])[1]")
    public WebElement Edit_Or_Add_Details_Button;

    @FindBy(how = How.XPATH, using = "//input[@ga-event-name='add_recipients_add_contact_cellphone_number']")
    public WebElement Add_Cellphone_No_Text_Field;

    @FindBy(how = How.XPATH, using = "//button[text()='Add fax number']")
    public WebElement Add_fax_No;

    @FindBy(how = How.XPATH, using = "//input[@id='add-fax-number-0']")
    public WebElement Add_fax_No_Text_Field;

    @FindBy(how = How.XPATH, using = "//button[text()='Add bank account']")
    public WebElement Add_Bank_Button;

    @FindBy(how = How.XPATH, using = "//button[text()=' Add credit card ']")
    public WebElement Add_Credit_Card_Button;

    @FindBy(how = How.ID, using = "add-bank-name-0")
    public WebElement Add_Bank_Text_Field;

    @FindBy(how = How.ID, using = "add-credit-card-number-0")
    public WebElement Add_Credit_Card_No;

    @FindBy(how = How.ID, using = "add-credit-card-number-reference-0")
    public WebElement Add_Credit_Card_Your_Reference;

    @FindBy(how = How.ID, using = "add-ccredit-card-their-reference-0")
    public WebElement Add_Credit_Card_Their_Reference;

    @FindBy(how = How.XPATH, using = "//button[text()=' Add meter number ']")
    public WebElement Add_meter_number;

    @FindBy(how = How.XPATH, using = "//button[text()='Add cell phone number']")
    public WebElement add_Cellphone_No;

    @FindBy(how = How.ID, using = "add-cellphone-number-0")
    public WebElement Add_Cellphone_No_Text_Field_Recipient;

    @FindBy(how = How.ID, using = "add-account-number-0")
    public WebElement Add_Account_No_Text_Field;

    @FindBy(how = How.ID, using = "add-my-reference-0")
    public WebElement Add_My_Reference_Text_Field;

    @FindBy(how = How.ID, using = "add-branch-name-0")
    public WebElement Add_Branch_Name;

    @FindBy(how = How.ID, using = "add-meter-number-reference-0")
    public WebElement Add_Meter_No_reference;

    @FindBy(how = How.ID, using = "add-approved-my-reference-0")
    public WebElement Your_Reference_Mobile_Recipient_Edit;

    @FindBy(how = How.ID, using = "add-meter-number-0")
    public WebElement Add_Meter_No_Text_Field;

    @FindBy(how = How.ID, using = "add-approved-my-reference-0")
    public WebElement Add_My_Reference_Text_Field_Approved;

    @FindBy(how = How.ID, using = "add-their-reference-0")
    public WebElement Add_Their_Reference_Text_Field;

    @FindBy(how = How.ID, using = "add-bank-name-1")
    public WebElement Add_Bank_Text_Field_2;

    @FindBy(how = How.ID, using = "add-account-number-1")
    public WebElement Add_Account_No_Text_Field_2;

    @FindBy(how = How.ID, using = "add-my-reference-1")
    public WebElement Add_My_Reference_Text_Field_2;

    @FindBy(how = How.ID, using = "add-their-reference-1")
    public WebElement Add_Their_Reference_Text_Field_2;

    @FindBy(how = How.XPATH, using = "(//button[@id='save_recipient'])[2]")
    public WebElement Save_Recipient;

    @FindBy(how = How.XPATH, using = "(//button[@id='save_changes'])[2]")
    public WebElement Save_Changes;

    @FindBy(how = How.XPATH, using = "//button[@id='close']")
    public WebElement close_Approve_It;

    @FindBy(how = How.XPATH, using = " //div[text()=' Success! Your recipient details have been saved. ']")
    public WebElement Success_Message_After_Saving;

    @FindBy(how = How.ID, using = "api-error-message")
    public WebElement Api_Error_Message;

    @FindBy(how = How.ID, using = "add-meter-number-reference-0")
    public WebElement Electric_Meter_Your_Reference;

    @FindBy(how = How.XPATH, using = "//*[@id=\"scroll-page\"]/div/div/div/app-system-error/div/div/div/alert/div/button")
    public WebElement Error_Ms_Close;


}
