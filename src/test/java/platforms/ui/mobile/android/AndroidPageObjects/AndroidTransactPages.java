package platforms.ui.mobile.android.AndroidPageObjects;


public class AndroidTransactPages {


    public static String Transact_Transact_Btn ="//android.widget.TextView[@text='Transact']";


    //Transact menu options
    public static String Transact_Pay_Btn_id = "fabPay";
    public static String Transact_Transfer_Btn_id = "fabTransfer";
    public static String Transact_Buy_Btn_id = "fabBuy";
    public static String Transact_menu = "//android.widget.TextView[@text='Transact']";
    public static String Transact_single_pay = "txt_pay_title";


    //Payment elements - Android
    public static String Transact_Pay_Recipient_name_text = "id/pay_recipient_name";
    public static String Transact_Pay_Beneficiary_list_icon = "pay_select_beneficiary_icon";
    public static String Transact_Calander_Day ="10";
    public static String Transact_Calander_OK ="OK";
    public static String Transact_Pay_PayMobile_icon = "pay_to_mobile_medium_layout";
    public static String Transact_Pay_MobileNo_text = "pay_mobile_number_et";
    public static String Transact_Pay_SaveRecipient = "pay_save_recipient_toggle";

    //public static String Transact_Pay_Beneficiary_list_value = "//*[contains(@resource-id,'za.co.nedbank.qa:id/beneficiary_name') and contains(@text,'Charlie Harper')]";
    public static String Transact_Pay_Next1_button = "btnAction";

    public static String Transact_Pay_Header_text = "pay_toolbar_expanded_title";
    public static String Transact_Pay_PayTo_strip = "vpPayMethod";
    public static String Transact_Pay_DetailScreenHeader_text = "txvHeader";			//Eg Pay Misti
    public static String Transact_Pay_PayFromAcc_Strip = "viewPagerAccounts";	//The scroll/roll of accounts - swipe leftable
    public static String Transact_Pay_ActiveFromAcc = ":txvAccountName";		//Account name of the first account in the scrollable acc pager
    public static String Transact_Pay_PayRef = ":edtYourRef";			//What is the payment for (found on Mobile payment attempt)
    public static String Transact_Pay_PayDatePicker = ":iv_date_picker";		//When will it be paid date picker (found on Mobile payment attempt)
    public static String Transact_Pay_ReviewInfo_popup = "review_recipient_info_rl";
    public static String Transact_Pay_Success_message = "pay_done_success_detail_text";

    //	public static String Transact_Pay_ = "id/txvHeader			//Eg Pay Misti
    public static String Transact_Pay_Enter_amount_field = "id/edtAmount";
//	public static String Transact_Pay_ = "za.co.nedbank.qa:id/viewPagerAccounts	//The scroll/roll of accounts - swipe leftable
//	public static String Transact_Pay_ = "za.co.nedbank.qa:id/txvAccountName		//Account name of the first account in the scrollable acc pager

//	public static String Transact_Pay_ = "za.co.nedbank.qa:id/edtYourRef			//What is the payment for (found on Mobile payment attempt)
//	public static String Transact_Pay_ = "za.co.nedbank.qa:id/iv_date_picker		//When will it be paid date picker (found on Mobile payment attempt)

    public static String Transact_Pay_Next2_button = "id/btnAction";		//Next button on Pay Misti screen

    //public static String Transact_Pay_ReviewPayment_Hdng = "//*[contains(@class,'android.widget.TextView') and contains(@text,'Review payment')]";	//Review payment (confirm screen)

    public static String Transact_Pay_Pay_button = "id/btnAction";		//Pay button
    public static String Transact_Pay_New_payment_button = "id/pay_done_new_payment_btn";
    public static String Transact_Pay_Finish_button = "id/pay_done_finish_btn";
    public static String Buy_lotto_no_of_Boards = "id/gbd_quick_pick_board_view";

    public static String Payment_Label_how_would_you_like= "id/how_to_pay_layout";
    public static String Payment_Receipent_Name= "id/edtInput";//id/pay_recipient_name_input_layout
    public static String Payment_Mobilenumber_label= "id/pay_to_which_mobile_number_label";
    public static String Payment_Mobile_numer_capture= "id/pay_mobile_number_et";
    public static String Payment_amount= "edtAmount";
    public static String Payment_account_name_id= "id/txvAccountName";
    public static String Payment_reference= "id/edtYourRef";
    public static String Payment_receipent_search_lable= "id/search_field";
    public static String Payment_search_recipient_id = "id/edtInput";
    public static String Payment_Bank_Name= "id/txvPickerText";//id/label_text
    public static String Payment_Bank_search_feild= "id/search_field";
    public static String Payment_Bank_Account_no= "id/pay_account_number";
    public static String Pleaseselect_text = "Please select";
    public static String Payment_Bank_to_which_acct_id= "id/pay_to_which_account_label";
    public static String Payment_save_beneficiary= "id/pay_save_recipient_toggle";
    public static String Payment_buy_save_beneficiary= "id/toggle_buy_save_recipient";
    public static String Payment_Bank_receipent_reference= "id/edtRecipientReference";
    public static String Payment_Bank_notification= "id/txvPickerText";//id/edtNotification
    public static String Payment_Bank_SMS= "id/txvSms";
    public static String Payment_Bank_Mobile_Email_text= "id/edtMobileEmail";
    public static String Payment_Bank_payment_success= "id/pay_done_success_detail_text";
    public static String Payment_Credit_card_number= "id/edtInput";//id/edtCreditCard
    public static String Payment_payment_repeat_text= "id/txvPickerText";
    public static String Accountname= "id/txvAccountName";
    public static String Date_picker= "id/iv_date_picker";
    public static String calender_view= "id/month_view";
    public static String calender_next= "android:id/next";
    public static String calender_ok= "android:id/button1";
    public static String Payment_Bank_receipent_icon= "id/pay_select_beneficiary_icon";
    public static String Payment_Bankapproved_search_input= "et_category_search_input";
    public static String Payment_Bankapproved_benificaryname = "tv_section_cell_item_name";
    public static String Mobile_ME = "id/ll_item_view_parent";
    public static String Payment_Pay_to_mobile_text = "Pay to a mobile number";
    public static String Payment_Pay_to_credit_card_xpath = "//android.widget.TextView[@text='Pay to a credit card']";

    //Transfer elements - Android
    public static String Transact_Trf_Header_text = "id/txvHeader";
    public static String Transact_Trf_Amt_text = "id/edtAmount";
    public static String Transact_Trf_To_Acct_button = "//*[contains(@class,'android.widget.TextView') and contains(@text,'To which account?')]/following::*[contains(@text,'1009795481') and contains(@resource-id,'za.co.nedbank:id/tv_account_number')]";
    //public static String Transact_Trf_Your_Reference_text_xpath = "//*[contains(@resource-id,'za.co.nedbank:id/edtReference')";
    public static String Transact_Trf_Transfer_Now_button = "id/btnAction";	//za.co.nedbank:id/tv_transfer_now
    public static String Transact_Trf_Transfer_Success_message = "id/txvTransferInfo";
    public static String Transact_Trf_TransferNumber_text = "id/tv_description_label";	//need xpath for this to get the 3rd instance of the description label being the trf no
    public static String Transact_Trf_Transfer_Overview_screen = "";
    public static String Transact_Trf_New_Transfer_button = ":id/btnNewTransfer";
    public static String Transact_Trf_Transfer_Finish_button = ":id/btn_finish";

    //Buy elements - Andriod
    public static String Buy_Recharge_Data_Airtime_SMS_button = "id/liv_recharge_airtime_sms";
    public static String Buy_Lotto_PowerBall_Tickets = "id/liv_lotto_powerball";

    public static String Buy_Recepient_name = "id/et_buy_recipient_name";
    public static String Buy_Recepient_mobile_number = "id/et_buy_mobile_number";
    public static String Buy_Recepient_Next= "id/btnAction";//id/tv_buy_next
    public static String Buy_Provider_label= "id/tv_for_which_provider";


    public static String Buy_Provider_CellC =  "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.support.v4.view.ViewPager/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.ImageView";
    public static String Buy_Provider_MTN =  "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.support.v4.view.ViewPager/android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.ImageView";
    public static String Buy_Provider_Telkom =  "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.support.v4.view.ViewPager/android.widget.LinearLayout[4]/android.widget.FrameLayout/android.widget.ImageView";
    public static String Buy_Provider_Vodacom= "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.support.v4.view.ViewPager/android.widget.LinearLayout[5]/android.widget.FrameLayout/android.widget.ImageView";
    public static String Buy_SMS= "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.support.v4.view.ViewPager/android.widget.LinearLayout[4]/android.widget.FrameLayout/android.widget.TextView";
    public static String Buy_Data= "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.support.v4.view.ViewPager/android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.TextView";
    public static String Buy_Airtime= "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.support.v4.view.ViewPager/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.TextView";
    public static String Buy_Bundle_Selection= "id/txvPickerText";//id/et_bundle_name
    public static String Buy_Bundle_lable= "id/tv_prepaid_limit";
    public static String Buy_capture_reference= "id/et_buy_reference";
    public static String Buy_recharge_button= "id/btnAction";//this object needs to be updatd with terms and conidtions on andriod
    public static String Terms_Conditions_next = "Next";
    public static String Buy_Empty_account= "id/txvEmptyView";
    public static String Buy_failed_error= "id/txvHeader";
    public static String Buy_failed_description= "id/txvDescription";
    public static String Buy_failed_retry= "id/txvAction";
    public static String Buy_Lotto= "id/rb_game_option_lotto";
    public static String Buy_tickets_text= "Buy tickets";
    public static String Buy_PowerBall= "id/rb_game_option_powerball";
    public static String Buy_lotto_next= "id/btn_select_game_next";
    public static String Buy_lotto_label= "id/tv_board_for_draw_label";
    public static String Buy_lotto_limit= "id/tv_total_amount";
    public static String Buy_lotto_onboard_next= "id/btn_play_game_next";
    public static String Buy_lotto_account_label= "id/txvAccountLabel";
    public static String Transfer_when_will_it_be_transferred= "id/what_to_schedule_tv";

    public static String Buy_lotto_account_notification= "id/edt_notification";
    public static String Buy_lotto_account_notification_sms= "id/txvSms";
    public static String Buy_lotto_account_notification_email= "id/txvEmail";
    public static String Buy_lotto_account_notification_edit= "id/edt_mobile_email";
    public static String Buy_lotto_account_notification_next= "id/tv_next";
    public static String Buy_lotto_account_buy= "id/btnAction";
    public static String Buy_lotto_account_finish= "id/finish_btn";
    public static String Buy_Lotto_Pick_numbers_xpath = "//android.widget.TextView[@text='Pick numbers']";

    public static String Buy_powerball_picknumbers= "id/tv_total_amount";
    public static String Buy_powerball_numberboard_label= "id/tv_ball_pick_count_info";
    public static String Buy_powerball_numberboard_next= "id/btn_pick_number_next";
    public static String Buy_powerball_board= "id/gbd_pick_no_first_view";
    public static String Buy_powerball_board_b= "id/gbd_pick_no_second_view";
    public static String Buy_powerball_board_Success= "id/lotto_done_success_detail_text";
    public static String Buy_lotto_image ="//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.ImageView";
    public static String Buy_Powerall_image ="//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.ImageView";
    public static String Buy_Top_Electricity= "id/liv_topup_claim_electricity";
    public static String Buy_Top_Receipent_name= "id/edtInput";
    public static String Buy_Top_TandC_header_id= "id/tv_tnc_header";

    public static String Buy_Top_Meter_number= "id/edtMeterNumber";
    public static String Buy_Top_save_recipent= "id/scSaveRecipient";
    public static String Buy_Top_search_befi= "id/iv_buy_select_receipient";
    public static String Buy_Top__layout_lable= "id/review_app_bar_layout";
    public static String Buy_Top__amount= "id/amount_view";
    public static String Buy_Top__from= "id/from";
    public static String Buy_Top__reference= "id/your_reference";
    public static String Buy_Top_payment_date= "id/electricity_done_payment_date_layout";
    public static String Buy_Top_payment_recipient_number= "id/electricity_done_recipient_number";
    public static String Buy_Top_payment_trans_nubmer= "id/electricity_done_transaction_number";
    public static String Logout= "id/log_out_row";
    public static String EditProfile= "id/apply_row_divider";//id/edit_profile_text
    public static String profileManagement= "id/lnrProfileManagement";
    public static String Buy_Transaction_failure= "id/txvHeader";
    public static String Payment_success_lable = "id/pay_done_success_detail_text";
    public static String profile_contact= "id/contact_us_row";
    public static String profile_feedback_request_call= "id/contact_us_row";
    public static String profile_feedback_request_call_second= "id/btnAction";
    public static String profile_select_option= "id/preferred_time_edit_text";
    public static String profile_common_text= "id/callback_reason_edit_text";
    public static String Profile_contact_us_contact_us_text = "Contact us";
    public static String Profile_contact_us_feedback_text = "Feedback";
    public static String profile_contct_us_request_call_back_button_id= "id/btnAction";
    public static String Profile_contact_us_Discard_text = "DISCARD";
    public static String profile_done= "id/success_done_button";
    public static String Buy_ownairtime= "id/et_airtime_amount";
    public static String payment_instant= "id/switchInstantPay";
    public static String payment_cardview= "id/review_info_cardview";
    public static String pay_mobile_me = "id/ll_item_view_parent";
    public static String Buy_Tickets = "Buy tickets";
    public static String View_tickets_text = "View tickets";
    public static String Lotto_tickets_page_heading_text = "LOTTO tickets";
    public static String Lotto_tickets_select_first_row_id = "id/rl_lotto_history_row";
    public static String PowerBall_tickets_select_first_row_xpath = "//android.widget.TextView[@text='PowerBall']";
    public static String Lotto_tickets_select_first_row_xpath = "//android.widget.TextView[@text='LOTTO']";
    public static String Lotto_tickets_lottolabel_description_id = "id/tv_ticket_description";
    public static String PowerBall_Board_name_id = "id/tv_played_board_number";
    public static String PowerBall_Board_B_text = "B";
    public static String Lotto_tickets_Lotto_Screen_from_account_id = "id/tv_ticket_from_Account";
    public static String Lotto_tickets_Lotto_Screen_no_of_boards_id = "id/tv_ticket_no_of_boards";
    public static String Lotto_tickets_Lotto_Screen_no_of_draws_id = "id/tv_ticket_no_of_draws";
    public static String Lotto_tickets_Lotto_Screen_purchase_date_id = "id/tv_ticket_purchase_date";
    public static String Lotto_tickets_Lotto_Screen_reference_number_id = "id/tv_ticket_reference_number";
    public static String Lotto_tickets_Lotto_Screen_draw_numbe_id = "id/tv_ticket_draw_number";
    public static String Lotto_tickets_Lotto_cost_id = "id/tv_ticket_cost";
    public static String Lotto_view_Board_A_number_1_xpath = "//android.widget.TextView[@text='15']";
    public static String Lotto_view_Board_A_number_2_xpath = "//android.widget.TextView[@text='20']";
    public static String Lotto_view_Board_A_number_3_xpath = "//android.widget.TextView[@text='30']";
    public static String Lotto_view_Board_A_number_4_xpath = "//android.widget.TextView[@text='1']";
    public static String Lotto_view_Board_A_number_5_xpath = "//android.widget.TextView[@text='40']";
    public static String Lotto_view_Board_A_number_6_xpath = "//android.widget.TextView[@text='9']";
    public static String Lotto_view_Board_B_number_1_xpath = "//android.widget.TextView[@text='1']";
    public static String Lotto_view_Board_B_number_2_xpath = "//android.widget.TextView[@text='29']";
    public static String Lotto_view_Board_B_number_3_xpath = "//android.widget.TextView[@text='18']";
    public static String Lotto_view_Board_B_number_4_xpath = "//android.widget.TextView[@text='8']";
    public static String Lotto_view_Board_B_number_5_xpath = "//android.widget.TextView[@text='41']";
    public static String Lotto_view_Board_B_number_6_xpath = "//android.widget.TextView[@text='7']";
    public static String Lotto_tickets_view_screen_replay_btn_id = "id/replay_button";
    public static String Lotto_terms_conditions_btn_id ="za.co.nedbank.qa:id/btn_continue_tnc";
    public static String Lotto_view_lotto_screen_discard_id = "android:id/button1";
    public static String Lotto_view_lotto_screen_name_xpath = "//android.widget.TextView[@text='PowerBall']";
    public static String Lotto_view_lotto_tickets_screen_xpath = "//android.widget.TextView[@text='LOTTO tickets']";
    public static String Lotto_tickets_no_of_boards_id = "id/tv_board_for_draw_label";
    public static String Lotto_tickets_available_profile_limit_id = "id/tv_remaining_credit_limit_label";
    public static String Lotto_tickets_available_limit_id = "id/tv_total_amount";
    public static String Lotto_view_text = "//android.widget.TextView[@text='How would you like to play?']";
    public static String Lotto_tickets_game_type_id = "id/tv_game_option_name";
    public static String Lotto_view_howmany_board_text_xpath = "//android.widget.TextView[@text='How many boards?']";
    public static String Lotto_tickets_draw_boards_id = "id/tv_board_for_draw_label";
    public static String Lotto_tickets_price_msg_txt_id = "id/tv_additional_game_price_info";
    public static String Lotto_tickets_no_of_draws_text_id = "id/txvPickerText";
    public static String Lotto_tickets_lotto_plus_one_id = "id/switch_game_first_selector";
    public static String Lotto_tickets_lotto_plus_two_id = "id/switch_game_second_selector";
    public static String Lotto_tickets_available_balance_id= "id/txvAccountLabel";
    public static String Lotto_review_purchase_text_xpath = "//android.widget.TextView[@text='Review LOTTO Purchase']";
    public static String Lotto_review_purchase_date_xpath = "//android.widget.TextView[@text='Purchase date']";
    public static String transfer_retry_text = "RETRY";
    public static String transfer_Next_button_text = "Next";
    public static String transfer_Next_occurrences_text = "OCCURRENCES";
    //*****************************************************Balance peek object*************************************************************

    //public static String view_balance = "id/second_login_option_balance";
    public static String view_balance = "View balance";

    public static String view_balance_msg = "id/tv_balance_peek_disabled_message";
    public static String second_login_btn = "id/btn_second_login";
    //public static String second_login_password = "id/second_login_password";
    public static String second_login_password = "id/edtInput";
    //public static String second_login_btn_balance= "id/btnAction";
    public static String second_login_btn_balance= "id/btnAction";
    public static String inactive_andriod= "id/login_security_peek_balance_text";
    public static String account_name= "id/tv_account_name";
    public static String toggle_off= "id/switch_account";
    public static String moveback_balance_peek= "Navigate up";
    public static String active_balance_text = "id/login_security_peek_balance_text";
    public static String deactive= "id/tv_deactivate_balance_peek";
    public static String deactive_yes= "android:id/button1";

    //*********************************** rewards************************************************************************************************
    public static String myrewards= "id/overview_page_title";
    public static String Greenback_Value= "id/overview_page_value_1";
    public static String Greenback_lable= "id/overview_page_label_1";
    public static String Greenback_points= "id/overview_page_value_2";
    public static String Greenback_navagation= "id/overview_account_type_next_navigation";
    public static String Greenback_chart= "id/account_details_chart";

    //************************************* Account Rename*****************************************************************************************
    //public static String Account_Rename= "id/tv_account_rename";
    public static String Account_Rename= "id/account_name_action_edit";
    public static String Account_rename_edit= "id/edt_preferred_account_name";
    public static String Account_rename_back = "Navigate up";
    public static String Account_specialchar_error= "id/txvError";
    public static String Account_rename_confirm_btn= "id/btnAction";
    public static String Account_rename_success_msg= "id/txvHeader";



    //*************************************  hide/unhide accounts***********************************************************************************
    public static String Account_Management_ID= "id/account_management_row";
    public static String Hide_Show_Accounts_ID= "id/hideshow_accounts_layout";
    public static String Hide_Show_Accounts_Title_ID= "id/link_account_title";
    public static String Hide_Show_Account_number_ID= "id/account_number";
    public static String Hide_Show_on_toggle_xpath= "//android.widget.Switch[@text='Show ON']";
    public static String Hide_Show_off_toggle_xpath= "//android.widget.Switch[@text='Show OFF']";
    public static String Hide_Show_error_msg_id= "id/txvHeader";
    public static String Hide_Show_id_back = "Navigate up";
    public static String never_text = "Never";
    public static String transfer_text = "Transfer";
    public static String Pay_To_mobile_Text = "Pay to a mobile number";
    public static String Buy_prepaid_airtime_sms_text = "Buy prepaid data, airtime or SMSs";
    public static String Hide_Show_on_Page_count_xpath = "//android.support.v7.app.ActionBar.Tab[@class='android.support.v7.app.ActionBar$Tab']";

    //*********************************** service providers******************************************************************************************
    public static String service_provider_telkom_id = "TLK";
    public static String service_provider_vodacom_id = "VDC";
    public static String service_provider_virgin_id = "VGN";
    public static String service_provider_mtn_id = "MTN";
    public static String service_provider_telkomMobile_id = "8TA";
    public static String service_provider_Finish= "Finish";
    public static String pay_message_text= "Whom would you like to pay?";
    public static String prepaid_type_text= "Airtime";
    public static String prepaid_buy_error_msg_text= "Transaction failed";
    public static String prepaid_connection_error= "Connection to server was lost";
    public static String prepaid_service_provider_error= "Service provider was unable to process the request.";
    public static String prepaid_error_description_id = "id/txvDescription";

    //************************************ feeze cards**********************************************************************************************************
    public static String freeze_cards_card_option_text = "Cards";
    public static String freeze_cards_card_screen_id = "id/cards_header";
    public static String freeze_cards_frozen_card_toggle_id = "id/account_cards_frozen_switch";
    public static String freeze_cards_alert_id = "id/alertTitle";
    public static String freeze_cards_alert_next_button_id = "android:id/button1";
    public static String freeze_cards_frozen_text_id = "id/view_card_froze_text";
    public static String freeze_cards_frozen_text_xpath = "//android.widget.TextView[contains(@text,'Frozen)]";
    public static String freeze_cards_unfreeze_msg = "Do you want to unfreeze your card?";
    //public static String freeze_cards_active_text_id = "id/view_card_active_text";
    public static String freeze_cards_balance_text = "Available balance";
    public static String freeze_cards_active_text_id = "id/card_background_imgv";
    public static String freeze_cards_flip_card_id = "id/view_card_number";


    //************************************ online purchase on or off***********************************************************************************************

    public static String online_purchase_radio_button_id = "id/account_cards_online_purchases_switch";
    public static String online_purchase_activation_popup_msg_id = "id/alertTitle";
    public static String online_purchase_activation_msg_id = "id/txvDescription";
    public static String online_purchase_message_done_button_id = "id/txvAction";

    //************************************ Tap on or off***********************************************************************************************
    public static String tap_go_radio_button_id = "id/account_cards_tap_go_switch";
    public static String tap_go_popup_msg_id = "id/alertTitle";//Deactivate tap and go?
    public static String tap_go_activation_msg_id = "id/txvDescription"; //Tap and go has been deactivated.
    public static String tap_go_done_button_id = "id/txvAction";


    //********************************** share account details*****************************************************************************************
    //public static String share_acct_details_tab_xpath = "//android.support.v7.app.ActionBar.Tab[contains(@index,'1') and contains(@NAF,'true')]";
    public static String share_acct_details_tab_id = "id/tv_share_account";
    public static String share_acct_details_icon_id = "id/tv_share_account";
    public static String share_acct_details_email_id = "id/tv_share_details_via_email";
    public static String share_acct_details_app_id = "id/tv_share_details_via_app";
    public static String share_acct_details_title_id = "id/alertTitle";
    public static String share_acct_details_account_details_id = "id/details_header";
    public static String share_acct_details_mail_validation_error_id = "id/txvError";
    public static String share_acct_details_mail_capture_id = "id/et_email_address";
    public static String share_acct_details_another_mail_capture_id = "id/tv_add_another_email";
    public static String share_acct_details_remove_mail_capture_id = "id/tv_remove";
    public static String share_acct_details_send_btn_id = "id/btn_send";
    public static String share_acct_details_done_btn_id = "id/btn_done";
    public static String share_acct_second_mail_xpath = "//android.widget.RelativeLayout[2]";

    //********************************** statement delivery details*****************************************************************************************

    public static String statement_delivery_preferences_id = "id/tv_statement_delivery_preference";
    public static String statement_delivery_email_xpath = "//android.widget.TextView[@text='Email']";
    public static String statement_delivery_Post_xpath = "//android.widget.TextView[@text='Post']";
    public static String statement_delivery_donotsend_xpath = "//android.widget.TextView[@text='Do not send']";
    public static String statement_delivery_every_day_banking_id = "id/overview_page_title";
    public static String statement_delivery_every_day_statement_frequency_id = "id/tv_frequency";
    public static String statement_delivery_every_day_statement_primary_mail_id = "id/edt_primary_email";
    public static String statement_delivery_every_day_statement_Success_id = "id/txvHeader";
    public static String statement_delivery_every_day_statement_close_id = "id/txvAction";


    //********************************** Manage Overd draft*****************************************************************************************

    public static String Manage_Overd_draft_id = "id/tv_manage_overdraft";
    public static String Manage_Overd_draft_chq_acct_name_id = "id/tv_account_name";
    public static String Manage_Overd_draft_success_msg_id = "android:id/message";
    public static String Manage_Overd_draft_success_msg_done_id = "android:id/button1";
    public static String Manage_Overd_draft_Account_number_id = "id/tv_account_number";
    public static String Manage_Overd_draft_request_submitted_24hrs_id = "id/tv_account_number";
    public static String Manage_Overd_draft_limit_id = "id/tv_overdraft_limit_val";
    public static String Manage_Overd_draft_available_amt_id = "id/tv_available_amount_val";
    public static String Manage_Overd_draft_amt_id = "id/tv_overdraft_amt_val";
    public static String Manage_Overd_draft_intrest_id = "id/tv_debit_interest_val";
    public static String Manage_Overd_draft_cancel_btn_id = "id/btn_cancel_overdraft";
    public static String Manage_Overd_draft_change_btn_id = "id/btn_change_limit";
    public static String Manage_Overd_draft_new_limit_id = "id/et_newlimit";
    public static String Manage_Overd_draft_submit_request_id = "id/btn_submit_request";


    public static String view_Banker_xpath = "//android.widget.TextView[@text='View banker']";
    public static String view_Banker_id = "id/view_banker_layout";
    public static String view_Banker_your_banker_xpath = "//android.widget.TextView[@text='Your banker']";
    public static String view_Banker_add_to_contact_id = "id/tv_add_to_contacts";
    public static String view_Banker_add_to_save_id = "com.android.contacts:id/editor_menu_save_button";
    public static String view_Banker_add_to_photo_id = "com.android.contacts:id/photo";
    public static String Atm_Limit_value_id = "id/card_atm_limit";
    public static String Atm_Limit_withdrawl_limit_id = "id/card_limit_title";
    public static String Atm_Limit_withdrawl_limitchange_id = "id/card_limit_edit";
    public static String Atm_Limit_withdrawl_update_limit_id = "id/btnAction";
    public static String every_day_banking_xpath ="//android.widget.TextView[@text='Everyday banking']";

}
