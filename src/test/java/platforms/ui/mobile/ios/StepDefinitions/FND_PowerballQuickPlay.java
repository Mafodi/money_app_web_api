package platforms.ui.mobile.ios.StepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.ui.WebDriverWait;
import platforms.ui.mobile.android.DE_AndroidDataFactory;
import platforms.ui.mobile.ios.IOSCommonMethods;
import platforms.ui.mobile.ios.iOSFlowModel.iOSBuy_Flow;
import platforms.ui.mobile.ios.iOSPageObjects.iOSBuyScreen;
import platforms.ui.mobile.ios.iOSPageObjects.iOSOverviewScreen;
import utils.DriverFactory;

public class FND_PowerballQuickPlay extends DriverFactory {

    WebDriverWait wait = new WebDriverWait(getIOSDriver(), 60);
    private IOSCommonMethods basepage = new IOSCommonMethods();
    public DE_AndroidDataFactory dataFactory = new DE_AndroidDataFactory();
    private static Logger log = Logger.getLogger(platforms.ui.mobile.ios.StepDefinitions.FND_Make_A_Payment_Beneficiary_Payment_from_Current_to_Current_Account_nedbank.class);
    iOSBuy_Flow buyFlow=new iOSBuy_Flow();
    iOSBuyScreen buyScreen=new iOSBuyScreen(driver);

    public FND_PowerballQuickPlay(){};

    @Given("^User is on the buy Powerball screen ios app$")
    public void userIsOnTheBuyPowerballScreenIosApp() throws Throwable {
        buyFlow.Navigate_To_Buy_Lotto_Powerball_Screen();
    }

    @When("^User selects Buy powerball tickets ios app$")
    public void userSelectsBuyPowerballTicketsIosApp() {
        buyScreen.Buy_tickets.click();
    }

    @And("^User selects powerball icon ios app$")
    public void userSelectsPowerballIconIosApp() {
        buyScreen.Powerball_icon.click();
        buyScreen.Lotto_Next.click();
    }

    @And("^User selects powerball QuickPlay ios app$")
    public void userSelectsPowerballQuickPlayIosApp() {
        //quickplay default
        basepage.scrollPage("down");
        buyScreen.Lotto_Next.click();
    }

    @And("^User selects powerball plus ios app$")
    public void userSelectsPowerballPlusIosApp() {
        //TODO:powerball plus icon has no identifier
        basepage.scrollPage("down");
        buyScreen.Lotto_Next.click();
    }

    @Then("^User reviews powerball purchase ios app$")
    public void userReviewsPowerballPurchaseIosApp() {
        buyScreen.Review_Next.click();
    }

    @And("^completes Powerball QuickPlay purchase ios app$")
    public void completesPowerballQuickPlayPurchaseIosApp() {
        buyScreen.Finish.click();
    }
}
