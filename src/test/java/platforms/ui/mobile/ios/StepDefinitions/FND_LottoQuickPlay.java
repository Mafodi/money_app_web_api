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
import utils.DriverFactory;

public class FND_LottoQuickPlay extends DriverFactory {

    WebDriverWait wait = new WebDriverWait(getIOSDriver(), 60);
    private IOSCommonMethods basepage = new IOSCommonMethods();
    public DE_AndroidDataFactory dataFactory = new DE_AndroidDataFactory();
    private static Logger log = Logger.getLogger(platforms.ui.mobile.ios.StepDefinitions.FND_Make_A_Payment_Beneficiary_Payment_from_Current_to_Current_Account_nedbank.class);
    iOSBuy_Flow buyFlow=new iOSBuy_Flow();
    iOSBuyScreen buyScreen=new iOSBuyScreen(driver);

    public FND_LottoQuickPlay(){};

    @Given("^User is on the buy Lotto screen ios app$")
    public void userIsOnTheBuyLottoScreenIosApp() throws Throwable {
        buyFlow.Navigate_To_Buy_Lotto_Powerball_Screen();
    }

    @When("^User selects Buy Lotto tickets ios app$")
    public void userSelectsBuyLottoTicketsIosApp() {
        buyScreen.Buy_tickets.click();
    }

    @And("^User selects Lotto icon ios app$")
    public void userSelectsLottoIconIosApp() {
        //Selected by default
        buyScreen.Lotto_Next.click();
    }

    @And("^User selects Lotto QuickPlay ios app$")
    public void userSelectsLottoQuickPlayIosApp() {
        //quickplay selected by default
        basepage.scrollPage("down");
        buyScreen.Lotto_Next.click();
    }

    @And("^User selects Lotto plus ios app$")
    public void userSelectsLottoPlusIosApp() {
        basepage.scrollPage("down");
        //TODO:Lotto Plus has switch has no identifier
        buyScreen.Lotto_Next.click();
    }

    @Then("^User reviews Lotto purchase ios app$")
    public void userReviewsLottoPurchaseIosApp() {
        buyScreen.Review_Next.click();
    }

    @And("^completes Lotto QuickPlay purchase ios app$")
    public void completesLottoQuickPlayPurchaseIosApp() {
        buyScreen.Finish.click();
    }
}
