package platforms.ui.mobile.android.AndroidPageObjects;

public class AndroidNotificationsObjects {

    public static String PUSH_APP = "android:id/app_name_text";
    public static String PUSH_TITLE = "com.android.systemui:id/notification_title";
    public static String PUSH_TEXT = "com.android.systemui:id/notification_text";
    public static String PUSH_EXPANDED_TITLE =  "android:id/title";
    public static String PUSH_EXPAND ="expanded";
    public static String PASSWORD_FIELD = "esEdtInput";
    public static String LOGIN_BUTTON = "new UiScrollable(new UiSelector()).scrollIntoView(text(\"Login\"));";
    public static String NOTIFICATION_ICON = "lotteBellView";

    public static String MESSAGE_TITLE = "tv_notification_title";
    public static String MESSAGE_DESCRIPTION = "tv_heading";
    public static String MESSAGE_DETAIL_HEADER = "notification_heading";
    public static String MESSAGE_ERROR = "txvHeader";

    public static String MORE_MENU = "tv_home_menu_item";
    public static String NOTIFICATIONS_MORE_MENU = "notifications_row";
    public static String NOTIFICATIONS_PAGE = "new UiScrollable(new UiSelector()).scrollIntoView(text(\"Notifications\"));";
    public static String PREFERENCE_SETTINGS = "preference_settings";
    public static String TRANSACTION_NOTIFICATION_LABEL = "transaction_notification_label";
    public static String TRANSACTION_NOTIFICATION_PAGE = "new UiScrollable(new UiSelector()).scrollIntoView(text(\"Transaction notifications\"));";
    public static String TRANSACTION_TYPE = "lbl_transaction_type";
    public static String NOTIFICATIONS_MESSAGES = "tv_messages";
    public static String NOTIFICATIONS_OFFERS = "tv_offers";
    public static String NOTIFICATION_SEARCH_BAR = "edtInput";
    public static String FILTER_ICON = "tvFilter";
    public static String FILTER_PAGE = "new UiScrollable(new UiSelector()).scrollIntoView(text(\"Sort transaction notifications\"));";
    public static String MOST_RECENT = "most_recent_label";
    public static String OLDEST_DATE = "tv_oldest_date";
    public static String LOWEST_AMOUNT = "tv_lowest_amount";
    public static String HIGHEST_AMOUNT = "tv_highest_amount";
    public static String TRANSACTION_SECTION_NAME = "transaction_section_name";

    public static String REPORT_FRAUD_CONTAINER = "report_fraud_container";
    public static String REPORT_FRAUD_BUTTON = "btn_report";
    public static String REPORT_FRAUD_PAGE = "new UiScrollable(new UiSelector()).scrollIntoView(text(\"Report Fraud\"));";
    public static String REPORT_FRAUD_CARD_NOTE = "tv_note_for_card";

    public static String REPORT_FRAUD_SELECT_ACTIVITY = "xvPickerText";
    public static String EDIT_INPUT_FIELD = "edtInput";
    public static String REPORT_FRAUD_PAGE_BUTTON = "btnAction";
    public static String REPORT_FRAUD_SUCCESS_PAGE = "new UiScrollable(new UiSelector()).scrollIntoView(text(\"You’ve successfully reported your fraud incident\"));";
    public static String REPORT_FRAUD_DONE_BUTTON = "btnAction";
    public static String REPORT_FRAUD_LINK = "navigation_link";


    public static String GO_TO_DEBIT_ORDERS = "navigation_link";
    public static String SWITCH_DEBIT_ORDER_ROW = "switch_debit_order_row";
    public static String DEBIT_ORDER_SECTION_NAME = "debit_order_section_name";
    public static String MESSAGES_PAGE = "new UiScrollable(new UiSelector()).scrollIntoView(text(\"Messages\"));";
    public static String OFFERS_MESSAGES_ROW = "preapproved_offers_notifications_cellview_message_tv";
    public static String MESSAGES_ROW = "notification_messages_foreground_view";
    public static String NAVIGATION_LINK = "navigation_link";
    public static String DEBIT_ORDER_HEADER = "new UiScrollable(new UiSelector()).scrollIntoView(text(\"Debit orders\"));";
    public static String NOTIFICATION_HEADING = "notification_heading";
    public static String NOTIFICATION_DETAILS = "notification_details";
    public static String NEXT_LOGIN = "//android.widget.Button[@text='Next']";
    public static String CONTINUE_BUTTON = "new UiScrollable(new UiSelector()).scrollIntoView(text(\"Continue\"));";
    public static String SKIP_BUTTON = "new UiScrollable(new UiSelector()).scrollIntoView(text(\"SKIP\"));";

    public static String NO_THANKS_BUTTON = "new UiScrollable(new UiSelector()).scrollIntoView(text(\"No Thanks\"));";
    public static String NO_THANKS_BUTTON_OFFERS = "new UiScrollable(new UiSelector()).scrollIntoView(text(\"No thanks\"));";
    public static String INTERESTED_BUTTON = "new UiScrollable(new UiSelector()).scrollIntoView(text(\"I'm interested\"));";

    public static String GREENBACKS_CONGRATULATION_MESSAGE = "tv_greenbacks_congratulation_message";
    public static String REWARDS_TERMS_AND_CONDITIONS_CHECKBOX = "rewards_terms_and_conditions_checkbox";
    public static String JOIN_BUTTON = "new UiScrollable(new UiSelector()).scrollIntoView(text(\"Join\"));";
    public static String FOR_YOUR_PAGE = "new UiScrollable(new UiSelector()).scrollIntoView(text(\"For you\"));";

    public static String NOTIFICATIONS_PREFERENCES_PAGE = "new UiScrollable(new UiSelector()).scrollIntoView(text(\"Notification preferences\"));";
    public static String NOTIFICATIONS_ACCOUNTS_ROW = "all_accounts_prefs_root_layout";
    public static String PUSH_SWITCH_PUSH_NOTIFICATIONS = "switch_push_notifications";
    public static String PUSH_SPEND_LIMIT_FIELD = "text_how_much_spend";
    public static String PUSH_BALANCE_LIMIT = "text_low_account_balance";
    public static String SMS_SWITCH_PUSH_NOTIFICATIONS = "switch_sms_notifications";
    public static String SMS_SPEND_LIMIT_FIELD = "text_how_much_spend_sms";
    public static String SMS_BALANCE_LIMIT = "text_low_account_balance_sms";


}