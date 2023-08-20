package platforms.ui.mobile.android.StepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.ui.WebDriverWait;
import platforms.ui.mobile.android.AndroidCommonMethods;
import platforms.ui.mobile.android.AndroidFlowModel.Buy_Flow;
import platforms.ui.mobile.android.AndroidPageObjects.AndroidBuyScreen;
import platforms.ui.mobile.android.DE_AndroidDataFactory;
import utils.DriverFactory;

public class FND_LottoQuickPlay extends DriverFactory {
    WebDriverWait wait = new WebDriverWait(getAndroidDriver(),30);
    private AndroidCommonMethods basepage = new AndroidCommonMethods();
    public DE_AndroidDataFactory dataFactory = new DE_AndroidDataFactory();
    Buy_Flow buyLottoFlow = new Buy_Flow();
    AndroidBuyScreen buyScreen = new AndroidBuyScreen(driver);


    public FND_LottoQuickPlay(){}

    @Given("^User is on the buy Lotto screen$")
    public void userIsOnTheBuyLottoScreen() throws Throwable {
        buyLottoFlow.Navigate_To_Play_Lotto_Powerball_Screen();
    }
    @When("^User selects Buy tickets$")
    public void userSelectsBuyTickets() {
        buyScreen.Buy_tickets.click();
    }

    @And("^User selects QuickPlay$")
    public void userSelectsQuickPlay() {
        //quickplay selected by default
        buyScreen.Lotto_Next.click();
    }

    @And("^User selects lotto plus one and two")
    public void userSelectsLottoPlusAnd() throws InterruptedException {
        basepage.android_scroll_down(2);
        buyScreen.LottoPlus1.click();
        buyScreen.LottoPlus2.click();
        buyScreen.play_game_next.click();
    }

    @Then("^User reviews purchase$")
    public void userReviewsPurchase() throws InterruptedException {
        basepage.android_scroll_down(2);
        buyScreen.Lotto_Next.click();
    }

    @And("^completes Lotto QuickPlay purchase$")
    public void completesLottoQuickPlayPurchase() throws InterruptedException {
        basepage.android_scroll_down(2);
        buyScreen.Lotto_Next.click();
        basepage.android_scroll_down(1);
        buyScreen.Lotto_Finish.click();
    }


}
