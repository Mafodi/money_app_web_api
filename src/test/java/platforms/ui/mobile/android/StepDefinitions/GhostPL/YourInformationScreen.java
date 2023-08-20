package platforms.ui.mobile.android.StepDefinitions.GhostPL;

import cucumber.api.java.en.Then;
import platforms.ui.mobile.android.AndroidFlowModel.GhostPL.GhostProduct_YourInfo_Flow;
import platforms.ui.mobile.android.AndroidPageObjects.GhostPL.PL_Page_YourInformationScreen;
import utils.DriverFactory;

/**
 * 
 * @author Agrim Markan
 *
 */
public class YourInformationScreen extends DriverFactory {
	@Then("^User checks the title on Your Information Screen\"([^\"]*)\"$")
	public void user_checks_the_title_on_Your_Information_Screen(String getTitle) throws InterruptedException {
		GhostProduct_YourInfo_Flow.checkYourInformationScreenTitle(getTitle);
	}

	@Then("^User checks the heading on Your Information Screen \"([^\"]*)\"$")
	public void user_checks_the_heading_on_Your_Information_Screen(String getHeading) {
		GhostProduct_YourInfo_Flow.checkYourInformationScreenHeading(getHeading);
	}

	@Then("^User checks the text on Your Information Screen for PL\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"$")
	public void user_checks_the_text_on_Your_Information_Screen_for_PL(String getText1, String getText2,
			String getText3, String getText4) {
		GhostProduct_YourInfo_Flow.checkYourInformationScreenText(getText1, getText2, getText3, getText4);
	}

	@Then("^User scrolls Your information screen to bottom$")
	public void user_scrolls_Your_information_screen_to_bottom() throws Throwable {
		GhostProduct_YourInfo_Flow.scrollYourInformationScreenToBottom();
	}

	@Then("^User clicks on No Toggle$")
	public void user_clicks_on_No_Toggle() throws Throwable {
		GhostProduct_YourInfo_Flow.clickNoToggle();
	}

	@Then("^User checks the YourInformationWrongInfoToolTipText\"([^\"]*)\"$")
	public void user_checks_the_YourInformationWrongInfoToolTipText(String wrongInfoToolTipText) throws Throwable {
		GhostProduct_YourInfo_Flow.checkYourInformationScreenInformationIncorrectToolTipText(wrongInfoToolTipText);
	}

	@Then("^User Checks calculation on your information screen \"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"$")
	public void user_Checks_calculation_on_your_information_screen(String income, String expenses, String obligations)
			throws Throwable {
		GhostProduct_YourInfo_Flow.checkYourInformationScreenIncomeExpensesObligations(income, expenses, obligations);
	}

	@Then("^User checks tooltiptext \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void user_checks_tooltiptext(String arg1, String arg2, String arg3) throws Throwable {
		GhostProduct_YourInfo_Flow.checkYourInformationScreenTootlTip1(arg1);
		GhostProduct_YourInfo_Flow.checkYourInformationScreenTootlTip2(arg2);
		GhostProduct_YourInfo_Flow.checkYourInformationScreenTootlTip3(arg3);
	}

	@Then("^User checks the text on Your Information Screen for PLConsolidation\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"$")
	public void user_checks_the_text_on_Your_Information_Screen_for_PLConsolidation(String arg1, String arg2,
			String arg3) throws Throwable {
		GhostProduct_YourInfo_Flow.checkConsolidationYourInformationScreenText(arg1, arg2, arg3);
	}

	@Then("^User scrolls yourinformation screen to bottom$")
	public void user_scrolls_yourinformation_screen_to_bottom() throws Throwable {
		GhostProduct_YourInfo_Flow.scrollYourInformationScreenToBottom();
	}

	@Then("^User checks the text on Your Information Screen for Consolidation \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"$")
	public void user_checks_the_text_on_Your_Information_Screen_for_Consolidation(String arg1, String arg2, String arg3,
			String arg4, String arg5, String arg6) throws Throwable {
		GhostProduct_YourInfo_Flow.checkConsolidationYourInformationScreenExtendedText(arg1, arg2, arg3, arg4, arg5,
				arg6);
	}

	@Then("^User checks the ConsolidationToolTip \"([^\"]*)\"$")
	public void user_checks_the_ConsolidationToolTip(String arg1) throws Throwable {
		GhostProduct_YourInfo_Flow.checkConsolidationToolTip(arg1);
	}

	@Then("^User checks calculation on your information screen for consoldiation\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"$")
	public void user_checks_calculation_on_your_information_screen_for_consoldiation(String arg1, String arg2,
			String arg3) throws Throwable {
		GhostProduct_YourInfo_Flow.checkConsolidationAccountNumberAmountInstallments(arg1, arg2, arg3);
	}

	@Then("^User clicks confirm button on YourInformation screen$")
	public void user_clicks_confirm_button_on_YourInformation_screen() throws Throwable {
		GhostProduct_YourInfo_Flow.clickYourInformationScreenConfirm();
	}

	@Then("^User clicks on XButton on Your Information Screen$")
	public void user_clicks_on_XButton_on_Your_Information_Screen() throws Throwable {
		GhostProduct_YourInfo_Flow.clickYourInformationScreenXButton();
	}

	@Then("^User clicks on Confirm Button on YourInformationScreen$")
	public void user_clicks_on_Confirm_Button_on_YourInformationScreen() throws Throwable {
		GhostProduct_YourInfo_Flow.clickYourInformationScreenConfirm();
	}

//	@Then("^User checks weekly text on YourInformation screen \"([^\"]*)\"$")
//	public void user_checks_weekly_text_on_YourInformation_screen(String arg1) throws Throwable {
//		Weekly_Page_YourInformationScreen.checkWeeklyInfoMessage(arg1);
//	}
}
