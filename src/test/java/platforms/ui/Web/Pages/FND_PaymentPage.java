package platforms.ui.Web.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


/**
 * Description: Pay pages elements
 * @author cc318764
 *
 */
public class FND_PaymentPage {


	@FindBy(how = How.LINK_TEXT,using = "Pay")
	public WebElement Pay_Menu_linkText;

    @FindBy(how = How.ID, using = "next")
    public WebElement next;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Recipients')]")
	public WebElement Recipient_Menu_link;

	@FindBy(how = How.XPATH, using = "//div[@class='card-info']")
	public WebElement Recipient_Select_Xpath;

	@FindBy(how = How.XPATH, using = "(//button[@class='btn gd-ghost-btn'])[1]")
	public WebElement getRecip_PayAgain_xpath;


	@FindBy(how = How.XPATH, using = "//h1[@class='main-title']")
	public WebElement Payment_Hearder;

	@FindBy(how = How.XPATH, using = "//*[@id=\"scroll-page\"]/div/div/div/app-menu-options/app-options-landing-page/section/section/ul/li[1]/a/div")
	public WebElement Pay_SinglePmtIcon_css;

	@FindBy(how = How.XPATH, using = "//*[@id=\"scroll-page\"]/div/div/div/app-menu-options/app-options-landing-page/section/section/ul/li[2]/a/div")
	public WebElement Pay_MultiplePmtIcon_css;

	@FindBy(how = How.XPATH, using = "//*[@id=\"scroll-page\"]/div/div/div/app-menu-options/app-options-landing-page/section/section/ul/li[3]/a/div")
	public WebElement Pay_GovtPmtIcon_css;

//// pay beneficiary Elements

	@FindBy(how = How.XPATH, using = "//input[@aria-label=\"Enter the recipient name\"]")
	public WebElement Pay_RecipientName_xpath;

	@FindBy (how = How.XPATH, using = "//*[@ga-event-name='pay_step1_click_on_recipient_icon']")
	public WebElement Recipient__Search;

	@FindBy (how = How.XPATH, using = "//li[@id='srch-my-recip']")
	public WebElement My_Recipients;

	@FindBy (how = How.ID, using = "srch-bnk-recip")
	public WebElement Bank_Approved_Recipients;

	@FindBy (how = How.XPATH, using = "//input[@placeholder='Search']")
	public WebElement Recipient_Search;

	@FindBy (how = How.XPATH, using = "//div[@class='card']")
	public WebElement Selec_Beneficiary_Xpath;

	@FindBy(how=How.XPATH,using="//div[@id='edit-recipient-btn']//span[contains(text(),'Edit or add details')]")
	public WebElement Recepient_Edit_Add_Xpath;

	@FindBy(how=How.XPATH,using="//div[@class='delete-button']//span[contains(text(),'Delete recipient')]")
	public WebElement Recep_Delete_Button_Xpath;

	@FindBy(how=How.XPATH,using="//span[contains(text(),'Delete Recipient')]")
	public WebElement Delete_Confirm_Button_Xpath;

	@FindBy(how=How.ID,using= "delete_recipient")
	public WebElement Recep_Delete_Butttton_Id;

	@FindBy(how=How.XPATH,using="//span[contains(text(),'Cancel')]")
	public WebElement Delete_Can_Button_Id;

	@FindBy(how=How.ID,using="mobile_number")
	public WebElement Mobile_Number_Id;

	@FindBy (how = How.XPATH, using = "//div[@class='block']//div[@class='mob']")
	public WebElement HowMuch_pay;

	@FindBy (how = How.ID, using = "amount")
	public WebElement Enter_Amount_Id;

	@FindBy (how = How.XPATH, using = "//div[@class='slider round thunder-inactive']")
	public WebElement Instant_Slider_Xpath;

    @FindBy (how = How.XPATH, using = "//input[@id='paymentDate']")
    public WebElement Instant_PayDate_Xpath;

	@FindBy (how = How.XPATH, using = "//h4[@class='section-title step-title']")
	public WebElement Payment_review_Xpath;

	@FindBy (how = How.XPATH, using = " //td[contains(text(),'Recipient:')]/following-sibling::td")
	public WebElement Recepient_details;

	@FindBy (how = How.XPATH,using ="//td[contains(text(),'Bank:')]/following-sibling::td")
	public WebElement Pay_Bank_Details;

	@FindBy (how = How.XPATH,using ="//td[contains(text(),'Payment date:')]/following-sibling::td")
	public WebElement Pay_Date_Xpath;

	@FindBy(how = How.ID, using = "next")
	public WebElement Amount_Next_ID;

	@FindBy(how = How.ID, using = "your_reference")
	public WebElement Your_Reff_id;

	@FindBy(how = How.XPATH, using = "//p[@class='text'][contains(text(),'Credit card')]")
	public WebElement Credit_card_Xpath;

	@FindBy(how = How.XPATH, using = "//input[@id='card_number ']")
	public WebElement Credit_card_Number;

	@FindBy(how = How.NAME, using = "theirReference")
	public WebElement Their_Reff_id;

	@FindBy(how = How.XPATH, using="//div[@class='icon']")
	public WebElement Notification_click_Xpath;

	@FindBy(how = How.XPATH, using="//li[contains(text(),'Email')]")
	public WebElement Notifi_Email_Select_Xpath;

	@FindBy(how = How.XPATH, using="//li[contains(text(),'Fax')]")
	public WebElement Notifi_Fax_Select_Xpath;

	@FindBy(how = How.XPATH, using="//li[contains(text(),'SMS')]")
	public WebElement Notifi_SMS_Select_Xpath;

	@FindBy(how = How.XPATH, using="//div[@class='text']")
	public WebElement Notifi_NONE_Select_Xpath;

	@FindBy(how = How.ID, using ="pay")
	public WebElement Pay_Button_Id;

	@FindBy(how = How.ID, using ="notificationInput")
	public WebElement Notifi_Input_Id;

	@FindBy(how = How.ID, using ="notificationFaxInput")
	public WebElement Fax_Notifi_Input_Id;

	@FindBy(how = How.XPATH, using ="//span[contains(text(),'Next')]")
	public WebElement Button_next_xpath;

	@FindBy(how = How.XPATH, using ="//span[contains(text(),'New payment')]")
	public WebElement New_Payment_Xpath;

	@FindBy(how = How.XPATH, using ="//div[@class='slider round inline-block']")
	public WebElement Reci_save_slider_Xpath;

	@FindBy(how = How.XPATH, using = "//span[@class='icon payIcons selected']")
	public WebElement Pay_BankIcon_xpath;

	@FindBy(how = How.ID, using = "pay")
	public WebElement Pay_button;

	@FindBy(how = How.XPATH, using = "//dd[@class='info-description capitalize']")
	public WebElement Pay_Account_Type_Vefify;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'×')]")
	public WebElement Error_banner_Xpath;

	@FindBy(how = How.XPATH, using = "(//dd[@class='info-description'])[3]")
	public WebElement Pay_Reff_varify;

	@FindBy(how = How.XPATH, using = "//span[@class='step-title status-font margin-with-icon']")
	public WebElement Pay_Confor_xpath;

	@FindBy(how = How.XPATH, using = "//h4[@class='step-title section-title']")
	public WebElement Pay_Confor1_xpath;

	@FindBy(how = How.XPATH, using = "//dt[contains(text(),'Recipient')]/following-sibling::dd")
	public WebElement Reci_Confo_Details_xpath;

	@FindBy(how = How.XPATH, using = "//td[contains(text(),'Recipient:')]/following-sibling::td")
	public WebElement Rpt_REC_Conf_details_Xpath;

	@FindBy(how = How.XPATH, using = "//td[contains(text(),'Bank:')]/following-sibling::td")
	public WebElement Rpt_Bank__details_Xpath;

	@FindBy(how=How.XPATH,using = "//dt[contains(text(),'phone')]/following-sibling::dd")
	public WebElement Reci_Confo_Details_xpath1;

	@FindBy(how=How.XPATH,using = "//div[@class='ok-button']//button[@id='delete_recipient']")
	public WebElement Confirm_delete;

	@FindBy(how = How.XPATH, using = "//div[@class='error-message']")
	public WebElement Success_Message_After_Delete;

	@FindBy(how=How.XPATH,using = "//td[contains(text(),'Recipient:')]/following-sibling::td")
	public WebElement Recepient_name;

	@FindBy(how = How.XPATH, using = "//dt[contains(text(),'Amount')]/following-sibling::dd")
	public WebElement Amount_confor_xpath;

	@FindBy(how = How.XPATH, using ="//dt[contains(text(),'Transaction no')]/following-sibling::dd")
	public WebElement Transc_confor_xpath;

	@FindBy(how = How.XPATH, using ="//td[contains(text(),'Transaction no:')]/following-sibling::td")
	public WebElement Transc_confor1_xpath;

	@FindBy(how = How.XPATH, using ="//td[contains(text(),'Amount:')]/following-sibling::td")
	public WebElement RPT_Amount_xpath;

	@FindBy(how=How.XPATH,using="//td[contains(text(),'Payment date:')]/following-sibling::td")
	public WebElement Rpt_Pay_Date_confo_xpath;

	@FindBy(how=How.XPATH,using="//dt[contains(text(),'Payment date')]/following-sibling::dd")
	public WebElement Payment_Date_confo_xpath;

	@FindBy(how=How.XPATH,using="//span[contains(text(),'Go back')]")
	public WebElement Go_back_xpath;

	@FindBy(how=How.XPATH,using="//i[@class='float-Cross']")
	public WebElement Float_cross_xpath;

	@FindBy(how=How.ID,using="new_payment")
	public WebElement New_payment_ID;

	@FindBy(how=How.XPATH,using="//button[@id='go_to_overview']")
	public WebElement Overview_xpath;

	@FindBy(how = How.LINK_TEXT, using = "Overview")
	public WebElement Overview_linkText;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Go to overview')]")
	public WebElement Go_To_Overview_Xpath;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'New payment')]")
	public WebElement NewPayment_Xpath;

	@FindBy(how = How.XPATH, using = "//h4[@class='section-title step-title']")
	public WebElement NewPayment_Click_verify;

	@FindBy(how = How.XPATH, using = "//app-ng-select-typeahead[@id='bank']//input")
	public WebElement Bank_Input_Xpath;

	@FindBy(how = How.XPATH, using = "//span[@class='icon calendar']")
	public WebElement Calender_Icon_Xpath;

	@FindBy(how = How.XPATH, using = "//button[@class='dp-calendar-nav-right']")
	public WebElement Calender_Next_Month_Xpath;

	@FindBy(how = How.XPATH, using = "//button[@class='dp-calendar-day dp-current-month ng-star-inserted'][contains(text(),'02')]")
	public WebElement Next_Month_Date_Xpath;

	@FindBy(how = How.XPATH, using = "//p[@class='text'][contains(text(),'Cellphone')]")
	public WebElement Pay_PayMobileIcon_Xpath;

	@FindBy(how = How.XPATH, using = "(//input[@type='text'])[2]")
	public WebElement Date_Input_xpath;

	@FindBy(how = How.XPATH, using = "//input[@ga-event-name=\"pay_recipient_details_enter_account_number\"]")
	public WebElement Pay_BankAccNo_id;

	@FindBy(how = How.XPATH, using ="//div[@class='icon']")
	public WebElement Repeat_Options;

	@FindBy(how = How.XPATH, using = " //li[contains(text(),'Weekly')]")
	public WebElement Repeat_Option_Weekly;
	@FindBy(how = How.XPATH, using = "//li[contains(text(),'Monthly')]")
	public WebElement Repeat_Option_Monthly;

	@FindBy(how = How.XPATH, using = " //label[contains(text(),'Occurrences')]")
	public WebElement Occure_Option;

	@FindBy(how = How.ID, using = "numRecurrence")
	public WebElement Occure_Number;


	public String Account_from_Xpath="//*[@id='from_account']/div";
	public String Account_List_Xpath= ".//*[@id='from_account']/ul";
	public String Bank_input_Xpath=".//app-ng-select-typeahead[@id='bank']//input";
	public String BankList_Xpath = "//div[@class='ng-dropdown-panel-items scroll-host']//div//div/span";
	public String Account_Type_xpath = "//div[@id='account_type']";
	public String Account_list_xpath = "//ul[@id='typeList']";



	private String Pay_ViewReciplistIcon_css = "span.receipient-search-icon.icon";    //css=
	private String Pay_SubMenuText_css = ".text";
	private String Pay_RecipientName_css = "input[type=\"text\"]";
	//private String Pay_RecipientName_xpath = "/html/body/app-root/div/div/div/div/ng-component/app-work-flow/div/div/div/div[2]/app-pay-to/form/div/div/div/app-ng-select-typeahead/div/ng-select/div/div/div[3]/input";

//	private String Pay_BankNameList_css = ".ng-dropdown-panel-items.scroll-host";
//	private String Pay_BankNameListOptions_css = ".ng-option.ng-option-child.ng-star-inserted";

	private String Pay_SearchRecipModal_xpath = "//app-search-recipients/div/div/div/h6";
	private String Pay_SearchRecipInput_css = ".ng-untouched.ng-pristine.ng-valid";
	private String Pay_SearchRecipNoResults_css = "div.no-recipients-message.col-xs-12.no-padding > span";
	private String Pay_SearchRecipResultItem_css = ".title.word-break";    //"p.account-type > span";
	private String Pay_SearchRecipBankApprovedTab_css = "#srch-bnk-recip";

	//private String Pay_BankAccNo_id = "account_number ";
	private String Pay_BankBranch_id = "branch";
	private String Pay_AccTypePickerArrow_xpath = "//*[@id=\"scroll-page\"]/div/ng-component/app-work-flow/div/div[2]/div/div[2]/app-pay-to/form/div[2]/div[4]/div/div/div[2]";
	private String Pay_AccTypeSelUL_xpath = "//*[@id=\"scroll-page\"]/div/ng-component/app-work-flow/div/div[2]/div/div[2]/app-pay-to/form/div[2]/div[4]/div[1]/ul";
	private String Pay_MobileNo_id = "mobile_number";
	private String Pay_CCard_id = "card_number ";

	private String Pay_NextStepsLbl_xpath = "//h6[contains(text(),'Next steps')]";
	private String Pay_Stp1NextButton_xpath = ".//*[@id='scroll-page']/div/ng-component/app-work-flow/div/div[1]/div/div[2]/div[2]/app-bottom-button/button";

	private String Pay_Amount_id = "amount";
	private String Pay_InstantPay_css = ".slider.round.thunder-";        //Add inactive or active based on expectation in the step definition
	private String Pay_InstantPayFeeInfo_xpath = "/html/body/app-root/div/div/div/div/ng-component/app-work-flow/div/div[3]/div/div[2]/app-pay-amount/form/div[2]/div/span[2]";
	private String Pay_InstantPayFeeInfo_css = ".info-text";

	private String Pay_DailyPayLimit_css = ".transfer-hint";
	private String Pay_FromAccPickerArrow_css = ".glyphicon.glyphicon-triangle-bottom.toggle-icon";    //From acc dropdown arrow
	private String Pay_FromAccSelName_css = ".left.para-title";
	private String Pay_FromAccSelAccNo_css = ".left";
	//private String Pay_FromAccNo_xpath = ".//*[@id='scroll-page']/div/ng-component/app-work-flow/div/div[2]/div/div[2]/app-pay-amount/form/div[3]/app-account-list/div/div/div/div[1]/div[2]/div[1]";
	//private String Pay_FromAccNo_xpath = ".//*[@id='from_account']/div";
	//private String Pay_FromAccNoList_xpath = ".//*[@id='from_account']/ul";
	private String Pay_FromAccAvailBalAmt_xpath = ".//*[@id='scroll-page']/div/ng-component/app-work-flow/div/div[2]/div/div[2]/app-pay-amount/form/div[3]/app-account-list/div/div/div/div[1]/div[2]/div[2]";

	private String Pay_CalendarIcon_css = ".icon.calendar";
	private String Pay_EndPaymentDate_css = ".dp-picker-day-time-directive.icon-field";
	private String Pay_PaymentDate_css = "input.dp-picker-input.ng-pristine.ng-valid.ng-untouched";
	private String Pay_DatePMonth_xpath = ".//*[@id='datePicker']/div[2]/div/dp-day-calendar/div/dp-calendar-nav/div/div[2]/div[2]";        //Month element
	private String Pay_DatePMonthSelector_css = "button.dp-nav-header.dp-nav-header-btn";
	private String Pay_DPMonthSelector_css = ".dp-calendar-nav-container";
	private String Pay_DatePMonthElement_xpath = "//dp-month-calendar/div/div/div[";    //append in using method div number and button number eg. "2]/button[3]"
	private String Pay_DayElement_xpath = ".//*[@class='dp-calendar-day ng-star-inserted dp-current-month']";    //test this out - append  and contains(@text,'x'...
	private String Pay_CalendarYearNextBtn_css = ".dp-calendar-nav-right";
	private String Pay_CalendarYearPrevBtn_css = ".dp-calendar-nav-left";

	private String Pay_EDPaymentDate_css = ".dp-picker-input.ng-pristine.ng-valid.ng-touched";
	private String Pay_EDDatePMonthElement_xpath = "//dp-month-calendar/div/div/div[";    //append in using method div number and button number eg. "2]/button[3]"
	private String Pay_EDDayElement_xpath = ".//*[@class='dp-calendar-day dp-current-month']";    //test this out - append  and contains(@text,'x'...
	private String Pay_EDDayElement_css = ".dp-calendar-day.dp-current-month";
	private String Pay_RepeatPaymentDDArrow_xpath = ".//*[@id='scroll-page']/div/ng-component/app-work-flow/div/div[3]/div/div[2]/app-pay-amount/form/div[5]/div/div/div[1]";
	private String Pay_RepeatPayList_xpath = ".//*[@id='scroll-page']/div/ng-component/app-work-flow/div/div[3]/div/div[2]/app-pay-amount/form/div[5]/div/ul";
	private String Pay_PaymentDate_id = "paymentDate";
	private String Pay_RepeatBy_css = ".radio-item-wrapper>label";    //choose on instance approach 1-end date 2-occurences
	private String Pay_NumOccurences_id = "numRecurrence";

	private String Pay_Stp2NextButton_xpath = "";

	//repeatable css elements used in different places	-	 check if this is a viable approach
	private String Pay_SectionHdr_css = ".step-title.section-title";    //.section-title.step-title
	//private String Pay_DropDown_css = ".dropdown-place";
	private String Pay_ParaTitle_css = ".para-title";
	private String Pay_Button_css = ".gd-primary-btn";
	private String Pay_DropDownListItem_css = ".dropdown-menu>li";

	private String Pay_YourRef_id = "your_reference";
	private String Pay_TheirRef_name = "theirReference";
	//private String Pay_NotificationInput_id = "notificationInput";    //for both email and sms
	private String Pay_NotificationFaxInput_id = "notificationFaxInput";
	private String Pay_NotificationDDArrow_xpath = ".//*[@id='scroll-page']/div/ng-component/app-work-flow/div/div[3]/div/div[2]/app-pay-for/div/form/div[3]/div/div/div[2]";
	private String Pay_NotificationPayList_xpath = ".//*[@id='scroll-page']/div/ng-component/app-work-flow/div/div[3]/div/div[2]/app-pay-for/div/form/div[3]/div/ul";
	private String PayMob_NotificationDDArrow_xpath = ".//*[@id='scroll-page']/div/ng-component/app-work-flow/div/div[3]/div/div[2]/app-pay-for/div/form/div[2]/div/div/div[2]";
	private String PayMob_NotificationPayList_xpath = ".//*[@id='scroll-page']/div/ng-component/app-work-flow/div/div[3]/div/div[2]/app-pay-for/div/form/div[2]/div/ul";
	private String Pay_NotificationEmail_xpath = ".//*[@id='scroll-page']/div/ng-component/app-work-flow/div/div[2]/div/div[2]/app-pay-for/div/form/div[3]/div/ul/li[1]";
	private String Pay_NotificationFax_xpath = ".//*[@id='scroll-page']/div/ng-component/app-work-flow/div/div[2]/div/div[2]/app-pay-for/div/form/div[3]/div/ul/li[2]";
	private String Pay_NotificationSMS_xpath = ".//*[@id='scroll-page']/div/ng-component/app-work-flow/div/div[2]/div/div[2]/app-pay-for/div/form/div[3]/div/ul/li[3]";

	private String Pay_ReviewBase_xpath = "/html/body/app-root/div/div/div/div/ng-component/app-work-flow/div/div[2]/div/div[2]/app-pay-review/div/table/tbody";
	private String Pay_RvwPmtDets_xpath = "html/body/app-root/div[1]/div/ng-component/app-work-flow/div/div[2]/div/div[2]/app-pay-review/div/table/tbody";
	private String Pay_RvwRecipient_xpath = "html/body/app-root/div[1]/div/ng-component/app-work-flow/div/div[2]/div/div[2]/app-pay-review/div/table/tbody/tr[1]/td[2]";
	private String Pay_RvwBank_xpath = "html/body/app-root/div[1]/div/ng-component/app-work-flow/div/div[2]/div/div[2]/app-pay-review/div/table/tbody/tr[2]/td[2]";
	private String Pay_RvwFromAcc_xpath = "html/body/app-root/div[1]/div/ng-component/app-work-flow/div/div[2]/div/div[2]/app-pay-review/div/table/tbody/tr[5]/td[2]";
	private String Pay_RvwYourRef_xpath = "html/body/app-root/div[1]/div/ng-component/app-work-flow/div/div[2]/div/div[2]/app-pay-review/div/table/tbody/tr[6]/td[2]";
	private String Pay_RvwTheirRef_xpath = "html/body/app-root/div[1]/div/ng-component/app-work-flow/div/div[2]/div/div[2]/app-pay-review/div/table/tbody/tr[7]/td[2]";
	private String Pay_RvwSaveRecipTog_css = ".slider.round.inline-block";

	//	private String Pay_ConfirmBase1_xpath = "//*[@id=\"scroll-page\"]/div/app-status/div/div/div/div[2]/table[1]/tbody";
	private String Pay_ConfirmBase1_xpath = "/html/body/app-root/div/div/div/div/app-status/div/div/div/div[2]/table[1]/tbody";
	private String Pay_ConfirmBase2_xpath = "/html/body/app-root/div/div/div/div/app-status/div/div/div/div[2]/table[2]/tbody";
	private String Pay_ConfirmBase3_xpath = "/html/body/app-root/div/div/div/div/app-status/div/div/div/div[2]/table[3]/tbody";
	private String Pay_RptConfirmBase1_xpath = "/html/body/app-root/div/div/div/div/app-repeat-transaction-status/div/div/div/div/table[1]/tbody";
	private String Pay_RptConfirmBase2_xpath = "/html/body/app-root/div/div/div/div/app-repeat-transaction-status/div/div/div/div/table[2]/tbody";
	private String Pay_RptConfirmBase3_xpath = "/html/body/app-root/div/div/div/div/app-repeat-transaction-status/div/div/div/div/table[3]/tbody";

	private String Pay_NewPaymentBtn_id = "new_payment";
	private String Pay_OverviewBtn_id = "go_to_overview";

	//Pay again from Recipient view
	private String Pay_FromAccBlock_css = ".discrp-block.current";
	private String Pay_RecipPayDataBlock_css = ".tabular-data-col-2>tbody";
	private String Pay_RecipPayBtn_css = "#pay";
	private String Pay_RecipPayGoBackBtn_css = "#go_back";
	private String Pay_RecipPayRepeatWarning_css = ".info-text.warning-error";
	private String Pay_RecipPayCancelBtn_css = ".btn.gd-secondary-btn.cancel-btn";
	private String Pay_ErrorValMsg_css = ".gd-error";

	//Multiple payments elements
	private String Pay_MultTitle_css = ".title";                                //Main page title for multiple payments
	private String Pay_MultFromAccPick_css = ".account-arrow";                    //From account arrow picker - use the css dropdown selection method
	private String Pay_MultFromAccItem_css = ".account-item";                    //From account list item from which selection will take place
	private String Pay_MultRecipientRow_css = ".recipients-detail-row.gd-form";    //Each recipient record in the displayed table
	private String Pay_MultRecipMultAccDropDown_css = ".fa.fa-angle-down";        //The dropdown that appears where the recipient has multiple recipient details
	private String Pay_MultAccType_css = ".account-type";                        //Account number (single or multiple) represented by the recipient
	private String Pay_MultRecipientBlock_css = ".recipients-info";                //
	private String Pay_MultInfoError_css = ".info-error";                        //Errors like limit related errors
	private String Pay_MultInstantPayMessage_css = ".instant-pay";                //Instant pay info message for fee.
	private String Pay_MultYourRef_name = "yourReference";                        //by name - Your reference field
	private String Pay_MultTheirRef_name = "theirReference";                    //by name - Their reference field
	private String Pay_MultAmount_name = "transferAmount";                        //by name - Amount field
	private String Pay_MultPaymentContainer_css = ".payment-container";            //total qty and amount of payments made
	private String Pay_MultRptLastPmt_css = ".tick-mark-container";                //Repeat last Payment checkbox
	private String Pay_MultAddNotif_css = ".add-notifictaion";                    //Add notification icon
	private String Pay_MultNotificationLink_css = ".link-text-normal";            //Link for existing recipient notification displayed
	private String Pay_MultNotificationTypeDDArrow_css = ".gd-basic-dropdown";    //Notification type drop
	private String Pay_MultPayCount_css = ".payment";
	private String Pay_MultPayTotal_css = ".total-amount.bold-text.multiple-account-info";
	private String Pay_MultPayAccDetail_css = ".account-selected";                //Detail of the account shown - named
	private String Pay_GhostButton_css = ".gd-ghost-btn";                        //this is for the Edit payment details link button

	private String Pay_MultRvwPayTotal_css = ".row.total-amount.bold-black";    //Total payment on review screen
	private String Pay_MultPayRvwPmtRow_css = ".table-border-top.data-container";
	private String Pay_MultPayRvwDelIcon_css = ".col-md-1.col-xs-2.deleteImage.delete-icon";
	private String Pay_MultPayDelSureBtn_id = "remove_this_transaction";

	private String Pay_MultPayPmtProof_css = ".download-icon";
	private String Pay_MultPayDetails_css = ".col-md-1.col-sm-3.col-xs-12.pull-right-mobile.pull-up-mobile.row-action";
	private String Pay_MultPaySuccPmtRow_css = ".row.each-row";                    //Each row container for each payment captured and shown on success screen
	private String Pay_MultPrintModalCloseBtn_css = ".close.pull-right";
	private String Pay_MultPrintModalAmt_css = ".pop-multiple-payment";
	private String Pay_MultSuccessIcon_css = ".success-icon";



}