package platforms.ui.mobile.ios.iOSPageObjects;

public class iOSVASPrePaidPurchaseDetailsScreen {


    public static String PhoneNumberAccessibilityID = "buy_recipient_reference";
    public static String SelectFromRecipientAccessibilityID = "VASSearchrecipient";
    public static String Next_Button_Xpath = "//XCUIElementTypeButton[@name=\"Next\"]";
    public static String SelectFromRecipientButton_Xpath = "//XCUIElementTypeImage[@name=\"VASSearchrecipient\"]";
    public static String SelectFromRecipient_AccessID = "VASSearchrecipient";
    public static String SelectRecipient_Xpath = "//XCUIElementTypeTable[@name=\"Who is the prepaid for?, Save recipient, Select from recipients, Select from phone contacts, Nedbank and its suppliers cannot be held responsible for numbers entered incorrectly.\"]/XCUIElementTypeOther[3]/XCUIElementTypeOther[1]/XCUIElementTypeButton";
    public static String SelectRepNew_Xpath = "(//XCUIElementTypeStaticText[@name=\"Select from recipients\"])";
    public static String SaveRec_Xpath = "//XCUIElementTypeTable/XCUIElementTypeOther[3]/XCUIElementTypeOther[1]/XCUIElementTypeButton";
    public static String RecipientName_Xpath = "(//XCUIElementTypeTextField[@name=\"buy_recipient_reference\"])[2]";
    public static String ValidPhoneNumberValidation_Xpath= "//XCUIElementTypeStaticText[@name=\"Please enter a valid phone number\"]";

}
