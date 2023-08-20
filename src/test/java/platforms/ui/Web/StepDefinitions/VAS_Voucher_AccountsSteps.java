package platforms.ui.Web.StepDefinitions;


import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import platforms.ui.Web.Pages.FND_PaymentPage;
import platforms.ui.Web.Pages.VAS_Voucher_AccountsPage;
import utils.Utils;

public class VAS_Voucher_AccountsSteps extends Utils {
    private static Logger log = Logger.getLogger(VAS_Voucher_AccountsSteps.class);
    public VAS_Voucher_AccountsPage accountsPage = PageFactory.initElements(driver, VAS_Voucher_AccountsPage.class);
    public FND_PaymentPage payment = PageFactory.initElements(driver, FND_PaymentPage.class);
    WebDriverWait wait = new WebDriverWait(driver,50);



    @And("^User want to check Terms & Conditions$")
    public void userWantToCheckTermsConditions() {
        Utils.scrollToElement(accountsPage.TermsConditions);

    }

    @When("^User clicks on T's&C's Link$")
    public void userClicksOnTSCSLink(){
        accountsPage.TermsConditions.isDisplayed();
        accountsPage.TermsConditions.click();
    }

    @Then("^User should navigate to Terms screen$")
    public void userShouldNavigateToTermsScreen()  {
        accountsPage.TermsConditionsScreen.isDisplayed();

    }

    @And("^If user cancel Terms screen$")
    public void ifUserCancelTermsScreen()  {
        accountsPage.CancelTermsConditions.click();
    }

}
