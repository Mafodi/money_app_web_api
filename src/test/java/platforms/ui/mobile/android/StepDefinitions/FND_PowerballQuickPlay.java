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

public class FND_PowerballQuickPlay extends DriverFactory {
    WebDriverWait wait = new WebDriverWait(getAndroidDriver(),30);
    private AndroidCommonMethods basepage = new AndroidCommonMethods();
    public DE_AndroidDataFactory dataFactory = new DE_AndroidDataFactory();
    Buy_Flow buyLottoFlow = new Buy_Flow();
    AndroidBuyScreen buyScreen = new AndroidBuyScreen(driver);

    @Given("^User is on the buy Powerball screen$")
    public void userIsOnTheBuyPowerballScreen() throws Throwable {
        buyLottoFlow.Navigate_To_Play_Lotto_Powerball_Screen();
    }

    @When("^User selects Buy powerball tickets$")
    public void userSelectsBuyPowerballTickets() {
        buyScreen.Buy_tickets.click();
    }

    @And("^User selects powerball icon$")
    public void userSelectsPowerballIcon() {
        buyScreen.PowerballIcon.click();
    }

    @And("^User selects powerball QuickPlay$")
    public void userSelectsPowerballQuickPlay() {
        //quickplay selected by default
        buyScreen.Lotto_Next.click();
    }

    @And("^User selects powerball plus$")
    public void userSelectsPowerballPlusOneAndTwo() throws InterruptedException {
        basepage.android_scroll_down(2);
        buyScreen.PowerballPlus.click();
    }

    @Then("^User reviews powerball purchase$")
    public void userReviewsPowerballPurchase() {
        buyScreen.play_game_next.click();
    }

    @And("^completes Powerball QuickPlay purchase$")
    public void completesPowerballQuickPlayPurchase() throws InterruptedException {
        basepage.android_scroll_down(2);
        buyScreen.Lotto_Next.click();
        basepage.android_scroll_down(2);
        buyScreen.Lotto_Next.click();
        buyScreen.Lotto_Finish.click();
    }
}
