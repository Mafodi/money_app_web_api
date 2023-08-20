package platforms.ui.mobile.ios.iOSPageObjects;

public class iOSEnrolmentScreens {


    public static  String CONTINUE_WITH_THIS_VERSION_XPATH = "//XCUIElementTypeStaticText[@name=\"Continue with this version\"]";

    public static String USERNAME_TEXTFIELD = "Username";
    // public static String PROFILE_PASSWORD = "//XCUIElementTypeApplication[@name=\"Money\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeSecureTextField";
    public static String ALLOW_BUTTON = "Allow";
    public static String I_AM_A_ClLIENT = "I'm a client";
    public static String LOGIN_BUTTON = "Log in"; //accessibility id
    public static String SkipFingerPrint = "Skip";


    //public static  String CONTINUE_WITH_THIS_VERSION_XPATH = "Continue with this version";
    public static String GET_STARTED_BUTTON = "//XCUIElementTypeButton[@name=\"Get started\"]";
    public static String LOGIN_NEDBANK_ID_BUTTON = "Nedbank ID";
    public static String PROFILE_USERNAME = "//XCUIElementTypeApplication[@name=\"Money\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeTextField";
    public static String PROFILE_PASSWORD = "//XCUIElementTypeApplication[@name=\"Money\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeSecureTextField";
    public static String REGISTER_BTN = "//XCUIElementTypeButton[@name=\"Register\"]";
    public static String PERSONAL_PROFILE = "Personal profile";
    public static String LINK_ACCOUNT_BUTTON = "(//XCUIElementTypeButton[@name=\"Next\"])[1]";
    public static String I_DONT_HAVE_A_CARD = "I don’t have a card";
    public static String NEXT_LOGIN_BUTTON = "Next";
    public static String CREATE_APP_PIN = "//XCUIElementTypeButton[@name=\"Next\"]";
    public static String ENTER_PIN ="//XCUIElementTypeApplication[@name=\"Money\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeSecureTextField[1]";
    public static String REENTER_PIN = "//XCUIElementTypeApplication[@name=\"Money\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeTextField";
    public static String NEW_ENROLEMENT_TERMS_AND_CONDITION_CHECKBOX = "checkBoxOff";
    public static String SET_PIN_BUTTON= "set PIN";
    public static String NEW_ENROLEMENT_CANCEL = "whiteCross";
    public static String NEW_ENROLEMENT_OK = "OK";
    public static String WELCOME_SCREEN = "My accounts";

    public static String ENROLE_TRANSACT = "Transact";
    public static String BUY_BUTTON = "buy";
    public static String BUY_BUNDLES = "Buy prepaid data, airtime or SMSs";
    public static String BUY_NEW = "Buy new";

    public static String RECIPIENT_SEARCH = "tableView-search-text-field";


    //**************************************************************************************************************************
    //On Debug app not QA
    public static String Enrolog_RSA_ID_Number_text = "za.co.nedbank:id/activate_application_rsa";
    public static String Enrolog_Device_name_id = "za.co.nedbank:id/activate_application_device_name";
    public static String Enrolog_Activate_Btn_id = "za.co.nedbank:id/activate_application_activate_button";
    public static String Enrolog_LoginMethod_Hdng_text = "Login to the app using your Nedbank ID";
    //Nedbank PPP
    public static String Enrolog_LoginPPPMethod_id = "za.co.nedbank:id/login_without_nedbank_id_profile_id";
    public static String Enrolog_ProfileNo_id = "za.co.nedbank:id/login_profile_number";
    public static String Enrolog_PINNo_id = "za.co.nedbank:id/login_pin";
    public static String Enrolog_Password_id = "za.co.nedbank:id/login_password";
    //**************************************************************************************************************************
    //Nedbank ID


    //************************************************iOS****************************************************************************************
    public static String iEnrolog_continue_with_version_id = "Continue with this version";
    public static String iEnrolog_register_id = "Register";
    public static String iLogin="Have a Nedbank ID? Log in";
    public static String iEnrolog_ignore_id = "Ignore";
    public static String iEnrolog_ima_client_id = "I'm a client";
    public static String iEnrolog_personal_profile_id = "Personal profile";
    public static String iEnrolog_register_with_card_id = "//XCUIElementTypeButton[@name=\"Register with card\"]"; //Register with card
    public static String iEnrolog_profile_number_inputfeild_id = "profile_number";
    public static String iEnrolog_move_back_id = "back white";
    public static String iEnrolog_card_static_msg_id = "I’m a client Please enter your personal Nedbank savings, debit, cheque or credit card details to register.";
    public static String iEnrolog_card_createpin_id = "Create app PIN";
    public static String iEnrolog_card_number_xpath = "//XCUIElementTypeTextField";
    public static String iEnrolog_card_pin_xpath = "//XCUIElementTypeSecureTextField";
    public static String iEnrolog_card_creat_app_pin_msg_xpath = "//XCUIElementTypeNavigationBar[@name=\"Create app PIN\"]";
    public static String iEnrolog_card_creat_enter_pin_xpath = "//XCUIElementTypeSecureTextField[1]";
    public static String iEnrolog_card_creat_reenter_pin_xpath = "//XCUIElementTypeSecureTextField[2]";
    public static String iEnrolog_card_set_pin_id = "//XCUIElementTypeButton[@name=\"Set PIN\"]";
    public static String iEnrolog_card_info_id = "info";
    public static String iEnrolog_card_load_error_id = "Load error";
    public static String iEnrolog_card_retry_id = "RETRY";
    public static String iEnrolog_card_second_login_msg_id = "Log in with your app PIN.";
    public static String iEnrolog_card_app_pin_id = "secondLoginPIN__pin_textfield";
    public static String iEnrolog_card_terms_and_conditions_id = "terms and conditions.";
    public static String iEnrolog_card_login_tab_id = "Login";
    public static String iEnrolog_become_client_id = "Become a client";
    public static String iEnrolog_Next_id = "checkBoxOff";
    public static String iEnrolog_whiteCross_id = "whiteCross";
    public static String iEnrolog_you_still_register_xpath = "//XCUIElementTypeButton[@name=\"You can still register! \"]";
    public static String iEnrolog_WelcomeScreen_id = "BANKING";
    public static String iEnrolog_WelcomeScreen_Getstarted_button_id = "Get Started";
    public static String iEnrolog_LoginNedID_text_id = "login__email_field";
    public static String iEnrolog_LoginNedID_text_xpath = "Username";
    public static String iEnrolog_LoginNedPassword_text_id = "login__password_field";
    public static String iEnrolog_LoginNedPassword_text_xpath = "Password";
    public static String iEnrolog_checkbox_id = "checkBoxOff";
    public static String iEnrolog_login_id = "Next";
    public static String iEnrolog_Login_Btn_id = "Next";//login__login_button
    public static String iEnrolog_ApproveIT_id = "approve-it__phone-label";
    public static String iEnrolog_WelcomeScreen_My_account_id = "My accounts";
    public static String iEnrolog_Transact = "Transact";
    public static String iEnrolog_GettingStarted_need_help = "login__help-button";
    public static String iEnrolog_GettingStarted_forgot_details_id = "Forgot details?";
    public static String iEnrolog_nedbank_id = "Nedbank ID";
    public static String iEnrolog_GettingStarted_forgot_username_id = "Forgot your Nedbank ID username?";
    public static String iEnrolog_GettingStarted_forgot_password_id = "Forgot your Nedbank ID password?";
    public static String iEnrolog_sa_id_id = "SA ID number";
    public static String iEnrolog_capture_sa_id_xpath = "//XCUIElementTypeTextField";
    public static String iEnrolog_next_id = "Next";
    public static String iEnrolog_forgot_username_success_id = "We’re retrieving your details";
    public static String iEnrolog_forgot_username_success_next_xpath = "//XCUIElementTypeButton[@name=\"Next\"]";
    public static String iEnrolog_forgot_passport_lable_id = "Passport number";
    public static String iEnrolog_forgot_passport_input_xpath = "//XCUIElementTypeTextField";
    public static String iEnrolog_forgot_passport_country_id = "Select a country";
    public static String iEnrolog_forgot_passport_country_search_xpath = "//XCUIElementTypeTextField";
    public static String iEnrolog_forgot_passport_country_Passport_next = "Next";
    public static String iEnrolog_GettingStarted_forgot_Pass_username_next = "forgotten__next-button";
    public static String iEnrolog_forgot_password_next_id = "login__login_button";
    public static String iEnrolog_GettingStarted_rsa_id = "forgotten__number-input";
    public static String iEnrolog_GettingStarted_forgot_new_username_msg = "SentSuccessfully";
    public static String iEnrolog_GettingStarted_forgot_new_password_done = "approveit__resend";
    public static String iEnrolog_PPP_forgotusername_passport = "forgotten__passport-number-option";
    public static String iEnrolog_PPP_forgotusername_passport_text = "forgotten__passport-input";
    public static String iEnrolog_PPP_forgotusername_country = "forgotten__country-input";
    public static String iEnrolog_Allow_Btn_id = "Allow";
    public static String iEnrolog_GettingStarted_forgot_password = "Forgot your Nedbank ID password?";
    public static String iEnrolog_GettingStarted_forgot_Pass_username = "forgotten-password__username-input";
    public static String iEnrolog_GettingStarted_forgot_new_password = "change-password__new-password-text-field";
    public static String iEnrolog_Reset_password = "Change password";
    public static String iEnrolog_GettingStarted_forgot_new_password_change_success = "You’ve updated your Nedbank ID Password successfully.";
    public static String iEnrolog_GettingStarted_forgot_Password_username_next = "forgotten-password__next-button";
    public static String iEnrolog_reset_password_label = "What would you like your new Nedbank ID Password to be?";
    public static String iEnrolog_Profile_Pin_Password = "login__banking_profile_button";
    public static String iEnrolog_PPP_ID = "Profile, PIN and password";
    public static String iEnrolog_PPP_xpath = "//XCUIElementTypeButton[@name=\"Profile, PIN and password\"]";
    public static String iEnrolog_nedbankid_xpath = "//XCUIElementTypeTextField";
    public static String iEnrolog_nedbankid_password_xpath = "//XCUIElementTypeSecureTextField";
    public static String iEnrolog_login_label = "Select one of the following methods to register:";
    public static String iEnrolog_secondlogin_PPP_icon = "Profile, PIN and password";
    public static String iEnrolog_secondlogin_PPP = "We need to link your accounts.";
    public static String iEnrolog_secondlogin_PPP_static_msg_id = "Provide your old Nedbank Internet Banking details.";
    public static String iEnrolog_Profile_number = "Profile, PIN and password";
    public static String iEnrolog_Profile_number_capture_xpath = "//XCUIElementTypeTextField";
    public static String iEnrolog_Profile_feild_capture_pin_xpath = "//XCUIElementTypeSecureTextField[1]";
    public static String iEnrolog_Password_feild_capture_password_xpath = "//XCUIElementTypeSecureTextField[2]";
    public static String iEnrolog_Profile_number_xpath = "//XCUIElementTypeTextField";
    public static String iEnrolog_Profile_pin_xpath = "//XCUIElementTypeSecureTextField";
    public static String iEnrolog_forgot_password_xpath = "//XCUIElementTypeSecureTextField";
    public static String iEnrolog_forgot_password_reset_msg_success_id = "Good news! You already have a Nedbank ID.";
    public static String iEnrolog_Continue = "login__login_button";
    public static String icreate_username__username_input = "create_username__username_input";
    public static String icreate_username_next_button = "create_username__next_button";
    public static String iEnrolog_Password_input = "create_password__password_input";
    public static String iEnrolog_Password_finish_button = "create_password__confirm_button";
    public static String iEnrolog_Overview = "My accounts";
    public static String iEnrolog_welcome = "overview__navigation_bar";
    public static String iEnrolog_PPP_LoginNedID_text_id = "simplelogin_username_field";
    public static String iEnrolog_PPP_LoginNedID_password_id = "simplelogin_password_field";
    public static String CnewpiniEnrolog_PPP_LoginNedID_username_xpath = "profile_number_field";
    public static String iPin_ID = "profile_number_field";
    public static String iRePin_ID = "profile_number_field";
    public static String iCreateAPin= "Create app PIN";
    public static String iEnrolog_PPP_LoginNedID_password_xpath = "Password";
    public static String iEnrolog_PPP_Login_id = "login_button";
    public static String iEnrolog_PPP_Login_next_id = "Next";
    public static String iLogin1="Landing_Login_Button";
    public static String iEnrolog_PPP_continue = "CONTINUE";
    public static String iapprove_button = "approveit__resend";
    public static String iforgetten_button = "forgotten__next-button";
    public static String iforgetten_header = "forgotten__header";
    public static String iWelcome = "Welcome!";
    public static String iloginlable = "We need to link your accounts.";
    public static String icapturepassword = "change-password__new-password-text-field";
    public static String icapturepassword_re = "change-password__reenter-new-password-text-field";
    public static String imore = "More";
    public static String ieditprofile = "Profile management";//Edit profile
    public static String ilogout = "Log out";
    public static String iforgotpassword = "Forgot your password";
    public static String iforgotpassword_xpath = "//XCUIElementTypeButton[@name=\"Forgot your password \"]";
    public static String iresetpassword = "login__login_button";
    public static String iconnoentry = "iconNoEntry";
    public static String ichangepassword = "change-password__new-password-text-field";
    public static String ichange_updated_password = "change-password__reenter-new-password-text-field";
    public static String ichange_secondlogin_password_xpath = "//XCUIElementTypeSecureTextField";
    public static String ichange_secondlogin_button = "Log in";
    public static String ifeedback = "Feedback";
    public static String icompliment = "feedback__compliment-image";
    public static String iquery = "query inactive";
    public static String icomplaint = "complaint inactive";
    public static String ifeedbackcomments_xpath = "//XCUIElementTypeStaticText[@name=\"Tell us more\"]/following-sibling::XCUIElementTypeTextView";//XCUIElementTypeTextView
    public static String isubmit_button = "Submit feedback";
    public static String iDone = "Done";
    public static String iprofile_limits = "Profile limits";
    public static String iprofile_transfer_limits = "Transfer limit";
    public static String iprofile_transfer_limits_change = "set-profile-limits__limit-amount-text-field";
    public static String iCurrent_payment_limit = "Current payment limit";
    public static String iupdate_limit = "Update limits";
    public static String isystem_error = "Error";
    public static String iPayment_limit = "Payment limit";
    public static String iLOTTO_limit = "LOTTO limit";
    public static String iPrepaid_limit = "Prepaid limit";
    public static String iSendiMali_limit = "Send-iMali limit";
    public static String iInstant_payment_limit = "Instant payment limit";
    public static String iTell_us_more = "Tell us more";
    public static String iEDIT = "EDIT";
    public static String ipreferredname = "//XCUIElementTypeApplication[@name=\"Money\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeTextField/XCUIElementTypeTextField";
    public static String isetpreferredname_button = "Set preferred name";
    public static String iset_your_preferred_name_lable = "//XCUIElementTypeButton[@name=\"SET PREFERRED NAME\"]";
    public static String ipreferre_name = "preferred_name";
    public static String iRSAID = "Don’t have an SA ID?";
    public static String PassportField = "Enter passport number";
    public static String iDontHaveAnID = "";
    public static String ienterID = "";
    public static String iInternationalPassword = "";
    public static String iPHP="";
    public static String pin = "//XCUIElementTypeApplication[@name=\"Money\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeSecureTextField[1]\n";
    public static String newpin = "//XCUIElementTypeTextField[@name=\"profile_number_field\"]";
    public static String Setpin ="//XCUIElementTypeSecureTextField[@name=\"pin_filed\"]";
    public static String IDHAC = "I don’t have a card";
    //------------------------- recipient bank details add ----------------------
    public static String iRecipients = "Recipients";
    public static String iaddRecipient = "addRecipient";
    public static String irecipient_name = "recipient_name";
    public static String iAddabankaccount = "Add a bank account";
    public static String irecipient_bank_name = "recipient_bank_name";
    public static String iABSA_BANK = "ABSA BANK";
    public static String iNEDBANK = "NEDBANK";
    public static String iCAPITEC_BANK= "CAPITEC BANK";
    public static String iFNB_SOUTH_AFRICA= "FNB SOUTH AFRICA";
    public static String iSTANDARD_BANK_SOUTH_AFRICA= "STANDARD BANK SOUTH AFRICA";
    public static String irecipient_bank_account_number= "recipient_bank_account_number";
    public static String irecipient_credit_card_number= "recipient_credit_card_number";
    public static String iyourreference= "recipient_bank_reference";
    public static String irecipient_referecne= "recipient_bank_recipient_reference";
    public static String irecipient_credit_card_reference= "recipient_credit_card_reference";
    public static String irecipient_credit_card_recipient_reference= "recipient_credit_card_recipient_reference";
    public static String iSelect_bank= "Select bank";
    public static String isearch= "search";
    public static String iedit= "EDIT";
    public static String iADD= "identifeir.add.recipient";
    //------------------------- recipient Mobile details add ------------------------
    public static String iMyrecipientslable= "My recipients";
    public static String iAddamobilenumber= "Add a mobile number";
    public static String irecipient_mobile_number  = "recipient_mobile_number";
    public static String irecipient_mobile_reference = "recipient_mobile_reference";
    //------------------------- recipient Electricity details add --------------------
    public static String iadd_meter_number = "Add a meter number";
    public static String irecipientnumber = "recipient_meter_number";
    public static String irecipientreference = "recipient_meter_reference";
    //------------------------- recipient delete bank details add ---------------------
    public static String itableview = "tableView-search-text-field";
    //public static String isearch_result_xpath = "//XCUIElementTypeStaticText[@name="beneficiary_name"][1]";
    public static String isearch_result_id = "beneficiary_name";
    public static String ideleterecipient = "DELETE RECIPIENT";
    public static String iYes = "Yes";
    public static String ipin = "PIN";
    public static String irecipient_add_reference = "recipient_bank_reference";
    public static String irecipient_add_recipient_reference = "recipient_bank_recipient_reference";
    public static String iUPDATE = "Update";
    public static String iAccountmanagement = "Account management";
    public static String iSetdefaultaccount = "Set default account";
    public static String iSETASDEFAULT = "SET AS DEFAULT";
    public static String iCLOSE = "CLOSE";
    public static String iLinkaccounts = "Link accounts";
    public static String iCONTINUE = "CONTINUE";
    public static String iAddbank = "Addbank";
    public static String imultidimension = "Multidimension";
    public static String iAddcreditcard ="Addcreditcard";
    public static String iMobilenumberadd ="Mobilenumberadd";
    public static String iprofilelimits_xpath = "//XCUIElementTypeOther[@name=\"Profile limits\"]";
    public static String RSA_ID = "SA ID number";
    //public static String iClickNext = "//XCUIElementTypeButton[@name=\"forgotten-password__next-button\"]";
    public static String iClickNext = "forgotten-password__next-button";
    public static String iDontHaveSAID = "Don’t have an SA ID?";
    public static String iPassportNo = "Passport number";
    public static String SelectCountry = "Select a country";
    public static String Search = "search";
    public static String EnterCountry = "";
    public static String existingPassword="Password";
    public static String SelectUK = "United Kingdom";
    public static String Cpin="//XCUIElementTypeApplication[@name=\"Money\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeSecureTextField[1]";
    public static String CRePin = "profile_number_field";
    public static String Set_PIN ="pin_filed";
    public static String iEnrolog_PPP_LoginNedID_username_xpath="Username";
    public static String NedID1 = "Username";
    public static String Password1 = "Password";
    public static String CheckBox = "checkBoxOff";
    public static String Login1 = "Log in";
    public static String Continue = "Continue";
    public static String iRegister = "Register";
    public static String PersonalProfile = "Personal profile";
    public static String iClickCountry = "Select a country";
    public static String iUK = "select_country_textfiled";
    public static String iUKSelect = "United Kingdom";
    public static String iNext = "forgotten-password__next-button";
    public static String iProfileNumber = "profile_number_field";
    public static String iPin="pin_filed";
    public static String iPassword = "password_field";
    public static String iPasswordXpath="//XCUIElementTypeSecureTextField[@name=\"password_field\"]";
    public static String iPPPNext = "//XCUIElementTypeButton[@name=\"Next\"]";
    public static String iForgot = "Forgot details?";
    public static String iForgotPassword = "//XCUIElementTypeStaticText[@name=\"Reset your Nedbank ID password\"]";
    public static String iForgotNedID="forgotten-password__username-input";
    public static String iNextPassword="forgotten-password__next-button";
    // public static String iChangePassword = "//XCUIElementTypeSecureTextField[@name=\"change-password__new-password-text-field\"]";
    public static String iChangePassword="change-password__new-password-text-field";
    public static String iConfirmNewPassword = "Change password";
    public static String iGoToLogin = "approveit__resend";
    public static String iCloseNotification = "down image grey";
    public static String iCloseNewNotification="Continue with this version";
    public static String iIDNumber="SA ID number";
    public static String Enrolog_Continue_Btn = "Next";
    public static String iPrimerNext="Next";
    public static String iNewUsername="forgotten-password__username-input";
    public static String iNewPassword="forgotten-password__username-input";
    public static String iCheckBox="checkBoxOff";
    public static String iCreate = "iCreate";
    public static String iUsername="forgotten-password__username-input";
    public static String PPPContinue="Next";
    public static String iContinue = "Continue with this version";

    //public static String iLoginXpath= "//XCUIElementTypeButton[@name=\"Have a Nedbank ID? Log in\"]";
    public static String iLoginXpath="//XCUIElementTypeApplication[@name=\"Money\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeTable/XCUIElementTypeCell[3]";
    public static String iSAID = "Forgot your Nedbank ID username?";
    public static String iForgotUsername= "//XCUIElementTypeStaticText[@name=\"Forgot your Nedbank ID username?\"]";
    public static String inputSAID="SA ID number";
    public static String iGotoLogin = "Go to login";
    public static String iForgotUsername1="forgotten-password__next-button";
    public static String iNextButton="//XCUIElementTypeButton[@name=\"forgotten-password__next-button\"]";
    public static String iPersonal="Personal profile";
    public static String iPasswordNID = "change-password__new-password-text-field";
    public static String iPasswordNew="Password";
    public static String iAcceptBox = "checkBoxOff";
    public static String iCreateNedPassword = "Create";
    public static String INewPassowrd ="change-password__new-password-text-field";
    public static String iNewNext= "Next";
    public static String iSimon = "MR SIMON JAMES PAUCK";
    public static String CONTINUE_WITH_THIS_VERSION_LINK_TEXT = "Continue with this version";
    public static String newLogin="Landing_Login_Button";
    public static String more="More";
    public static String eCert="emCertID: ";
    public static String CardOption = "";
    public static String CardAndPin = "Card & ATM PIN";
    public static String CardNumber = "Card number";
    public static String ATMPIN= "ATM PIN";
    public static String iConfirmNext= "Next";
    public static String IDNumNext="forgotten-password__next-button";
    public static String iOK="OK";
    public static String iMore="More";
    public static String iLogout="Log out";
    public static String iPassword2ndLogin="Password";
    public static String iLoginNew="Log in";
    public static String iCreateAppPin="Create app PIN";
    public static String iAddPinField1="settingsPin__pin_textfield_Identifier";
    public static String iAddPinField2="//XCUIElementTypeOther[@name=\"settingsPin__pin_textfield_Identifier\"]";
    public static String iConfirmNewPin="Create";
    public static String iConfirmNewPin2="//XCUIElementTypeButton[@name=\"Create\"]";
    public static String iNedID="Nedbank ID";
    public static String iLoginAndSecurity="Login and security";
    public static String iChangePassword1="Change Password";
    public static String iCaptureChangePassword="change-password__new-password-text-field";
    public static String iSaveNewPassword="Save new password";
    public static String iConfirmNewPassword1="DONE";
    public static String iBackButton="left_button";
    public static String iNewPin="//XCUIElementTypeApplication[@name=\"Money\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]";
    public static String iReveal="eyeOpenPassword";
    public static String iUnReveal="eyeClosedPassword";
    public static String ilogin="login";
    public static String iRegisterNew="Register User";





}
