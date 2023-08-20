package platforms.ui.mobile.android.AndroidPageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class Android_Ghost_OverdraftLimitIncreaseObjects {

    public Android_Ghost_OverdraftLimitIncreaseObjects(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }


    //Dashboard screen
    @AndroidFindBy(id = "bell_icon")
    public MobileElement Pulsating_Icon1;
    @AndroidFindBy(id ="lotteBellView")
    public MobileElement Pulsating_Icon;
    @AndroidFindBy(id ="tv_offers")
    public MobileElement For_You;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Overdraft Limit Increase']")
    public MobileElement Select_Offer;
    @AndroidFindBy(id ="view_preapproved_offers_campaign_title_tv")
    public MobileElement campaign_header;

    //Campaign screen
    @AndroidFindBy(id ="view_preapproved_offers_campaign_description_tv")
    public MobileElement campaign_header_description;
    @AndroidFindBy(id ="view_pre_approved_offers_campaign_fnb_tv")
    public MobileElement features_and_benefits_label;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Your new limit will be available within one business day.']")
    public MobileElement first_benefit;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='No additional cost.']")
    public MobileElement second_benefit;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='No paperwork or documents to submit.']")
    public MobileElement third_benefit;
    @AndroidFindBy(accessibility ="Navigate up")
    public MobileElement back_arrow;
    @AndroidFindBy(id ="btnAction")
    public MobileElement Im_Interetsted_button;
    @AndroidFindBy(xpath = "//android.widget.Button[@text='No thanks']")
    public MobileElement no_thanks_button;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Let's get started\"]")
    public MobileElement lets_get_started_header;


    // Lets get started screen
    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"To get a decision in a few minutes, please confirm that:\"]")
    public MobileElement Disclaimers_subHeader;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"you're permanently employed;\"]")
    public MobileElement Disclaimers_permanently_employed_Text;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='neither you nor your spouse is insolvent, under administration, curatorship or undergoing debt counselling and that neither you nor your spouse has any pending disputes with a credit bureau;']")
    public MobileElement insolvent_text;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='you consent to us processing your personal information so that we can provide banking services to you.']")
    public MobileElement spousal_consent_text;
    @AndroidFindBy(id ="item_cb")
    public MobileElement disclaimers_checkbox_one;
    @AndroidFindBy(xpath = "//android.widget.CheckBox[@checked='false' and @index='0']")
    public MobileElement disclaimers_checkbox_two;
    @AndroidFindBy(xpath = "//android.widget.CheckBox[@checked='false' and @index='0']")
    public MobileElement disclaimers_checkbox_three;
    @AndroidFindBy(id ="btnAction")
    public MobileElement confirm_button;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Step 01 of 03']")
    public MobileElement your_information_screen_stepper;

    // Your Information/ Financial Screen
    @AndroidFindBy(accessibility ="Close")
    public MobileElement x_close_button;
    @AndroidFindBy(id = "customStepProgressBar")
    public MobileElement progressBar;
    @AndroidFindBy(id ="view_title")
    public MobileElement your_information_header;
    @AndroidFindBy(id ="view_user_info_screen_title")
    public MobileElement your_information_header_description;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Total monthly income']")
    public MobileElement total_monthly_income_label;
    @AndroidFindBy(id ="nbsliding_tooltip_value")
    public MobileElement total_monthly_income_value;
    @AndroidFindBy(xpath = "//android.widget.ImageView[@clickable='true' and @index='1']")
    public MobileElement total_monthly_income_toolTip;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='This information comes from your Nedbank salary account.']")
    public  MobileElement monthly_income_toolTip_description;
    @AndroidFindBy(id ="nbsliding_tooltip_description_layout")
    public MobileElement monthly_income_toolTip_description_1;
    @AndroidFindBy(xpath = "//android.widget.ImageView[@clickable='false' and @index='2']")
    public MobileElement total_monthly_income_toolTip_bar;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Total monthly living expenses']")
    public MobileElement total_monthly_living_expenses_label;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='This can include rent, food, transport, medical expenses and school fees.']")
    public MobileElement total_monthly_living_expenses_toolTip_Description;
    @AndroidFindBy(id = "nbsliding_tooltip_value")
    public MobileElement total_monthly_living_expenses_value;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Total monthly debt obligations']")
    public MobileElement total_monthly_debt_obligation_label;
    @AndroidFindBy(id = "nbsliding_tooltip_value")
    public  MobileElement total_monthly_debt_obligation_value;
    @AndroidFindBy(id = "nbsliding_tooltip_info")
    public  MobileElement total_monthly_debt_obligation_toolTip;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='This can include car finance, home loans, cellphone contracts, credit cards and store card accounts.']")
    public MobileElement total_monthly_debt_obligation_toolTip_Description;
    @AndroidFindBy(id = "view_offer_item_value_subtext_tv")
    public  MobileElement info_incorrect_message;
    @AndroidFindBy(id = "switch_field_toggle")
    public  MobileElement info_incorrect_switches;
    @AndroidFindBy(id = "switch_field_positive_button")
    public  MobileElement info_incorrect_switch_yes;
    @AndroidFindBy(id = "switch_field_negative_button")
    public  MobileElement info_incorrect_switch_no;
    @AndroidFindBy(id = "view_offer_item_value_subtext_tv")
    public  MobileElement info_incorrect_message_Description;


    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Step 02 of 03']")
    public MobileElement your_offer_screen_stepper;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Your offer']")
    public  MobileElement your_offer_header;
    @AndroidFindBy(id = "pre_approved_offer_loan_amount_tv")
    public  MobileElement overdraft_amount_label;
    @AndroidFindBy(id = "pre_approved_offer_adjust_loan_tv")
    public  MobileElement change_overdraft_amount_label;
    @AndroidFindBy(id = "pre_approved_offer_loan_amount_value_tv")
    public  MobileElement overdraft_amount_value;
    @AndroidFindBy(id = "pre_approved_offer_loan_amount_value_subtitle_tv")
    public  MobileElement overdraft_maxAmount_subtitle;
    @AndroidFindBy(id = "pre_approved_offer_loan_amount_current_placeholder_tv")
    public  MobileElement overdraft_amount_current_placeholder;
    @AndroidFindBy(id = "pre_approved_offer_amount_seek_bar")
    public  MobileElement overdraft_amount_slidder;
    @AndroidFindBy(id = "pre_approved_offer_minimum_amount_tv")
    public  MobileElement overdraft_minimum_amount;
    @AndroidFindBy(id = "pre_approved_offer_loan_amount_invalid_tv")
    public  MobileElement invalidAmountErrorMessage;

    @AndroidFindBy(id = "pre_approved_offer_maximum_amount_tv")
    public  MobileElement overdraft_maximum_amount;
    @AndroidFindBy(id = "pre_approved_offer_monthly_repayments_tv")
    public  MobileElement monthly_repayment_label;
    @AndroidFindBy(id = "pre_approved_offer_monthly_repayments_value_tv")
    public  MobileElement monthly_repayment_value;
    @AndroidFindBy(id = "pre_approved_offer_annual_increase")
    public  MobileElement review_my_creditLimitAnnuallyText;
    @AndroidFindBy(id = "pre_approved_offer_annual_increase_toggle")
    public  MobileElement annual_increase_toggles;
    @AndroidFindBy(id = "switch_field_positive_button")
    public  MobileElement annual_increase_toggle_yes;
    @AndroidFindBy(id = "switch_field_negative_button")
    public  MobileElement annual_increase_toggle_no;
    @AndroidFindBy(id = "view_offer_item_value_subtext_tv")
    public  MobileElement annual_increase_toggle_message;
    @AndroidFindBy(id = "pre_approved_offer_recalculate_monthly_payment_button")
    public  MobileElement recalculateButton;


    //Disclosures


    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Step 03 of 03']")
    public MobileElement disclosures_screen_stepper;

    @AndroidFindBy(id = "disclosures_screen_title")
    public MobileElement disclosures_header;
    @AndroidFindBy(id = "preapproved_offers_common_view_divider_tv")
    public MobileElement disclosureSubHeader;
    @AndroidFindBy(id = "preapproved_offers_common_view_value_tv")
    public MobileElement creditAndFruadMandate_Description;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='HONESTY']")
    public MobileElement honesty_label;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='You confirm that the information you've provided is correct.']")
    public MobileElement honesty_description;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='SPOUSAL CONSENT']")
    public MobileElement spousalConsentDivider;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='If you're married in community of property or if you were married outside of South Africa, your spouse must agree in writing to your taking up this limit increase']")
    public MobileElement spousalConsentdescription;
    @AndroidFindBy(xpath = "//android.widget.RadioButton[@text='I confirm that my spouse has agreed to the above.']")
    public MobileElement spousalConcentRadioButton1;
    @AndroidFindBy(xpath = "//android.widget.RadioButton[@text='This doesn't apply to me.']")
    public MobileElement spousalConcentRadioButton2;
    @AndroidFindBy(id = "preapproved_offer_success_screen_title")
    public MobileElement successHeader;

    //Success
    @AndroidFindBy(id = "ic_preapproved_rand_offer")
    public MobileElement successRandIcon;
    @AndroidFindBy(id = "preapproved_offer_success_screen_preapproved_offer_message")
    public MobileElement successPreapprovedOfferMessage;
    @AndroidFindBy(id = "ic_offer_mail")
    public MobileElement successMailIcon;
    @AndroidFindBy(id = "preapproved_offer_success_screen_help_message")
    public MobileElement successHelpMessage;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Wrong information']")
    public MobileElement WrongInformationHeader;

    //Wrong Information Screen
    @AndroidFindBy(id = "preapproved_offers_common_view_title_tv")
    public MobileElement WrongInformationHeaderDescription;
    @AndroidFindBy(xpath = "//android.widget.CheckBox[@checked='false' and @index='0']")
    public MobileElement WrongInformationCheckbox1;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Total monthly income']")
    public MobileElement WrongInformationcheckbox1Descrition;
    @AndroidFindBy(xpath = "//android.widget.CheckBox[@checked='true' and @index='0']")
    public MobileElement CheckboxSelected;
    @AndroidFindBy(xpath = "//android.widget.CheckBox[@checked='false' and @index='0']")
    public MobileElement WrongInformationCheckbox2;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Total monthly living expenses']")
    public MobileElement WrongInformationcheckbox2Descrition;
    @AndroidFindBy(xpath = "//android.widget.CheckBox[@checked='false' and @index='0']")
    public MobileElement WrongInformationCheckbox3;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Total monthly debt obligations']")
    public MobileElement WrongInformationcheckbox3Descrition;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='We’ll be in touch to help you.']")
    public MobileElement WrongInformationHelpText;
    @AndroidFindBy(xpath = "//android.widget.Button[@text='Done']")
    public MobileElement DoneButton;
    @AndroidFindBy(id = "ic_leaving_soon_offer")
    public MobileElement leavingSoSoonIcon;


    //Drop Off Screen
    @AndroidFindBy(id = "leaving_message")
    public MobileElement leavingSoSoonHeader;
    @AndroidFindBy(id = "leaving_message1")
    public MobileElement leaving_message;
    @AndroidFindBy(xpath = "//android.widget.Button[@text='Give feedback']")
    public MobileElement givefeedbackButton;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Feedback']")
    public MobileElement feedbackheader;

    //Feedback Screen
    @AndroidFindBy(id = "drop_off_reasons_title")
    public MobileElement dropoffReason_Title;
    @AndroidFindBy(id = "drop_off_reasons_title_description")
    public MobileElement dropoffReason_description;
    @AndroidFindBy(xpath = "//android.widget.CheckBox[@checked='false' and @index='0']")
    public MobileElement dropOffCheckbox1;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='I'll come back later']")
    public MobileElement dropOffCheckbox1_description;
    @AndroidFindBy(id = "item_cb")
    public MobileElement dropOffCheckbox2;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='The offer doesn't meet my needs']")
    public MobileElement dropOffCheckbox2_description;
    @AndroidFindBy(id = "item_cb")
    public MobileElement dropOffCheckbox3;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='I prefer going to a branch or calling the contact centre']")
    public MobileElement dropOffCheckbox3_description;
    @AndroidFindBy(xpath = "//android.widget.Button[@text='Send Feedback']")
    public MobileElement sendFeedbackButton;


    //Bureau Screen



}
