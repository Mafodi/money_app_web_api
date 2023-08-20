package platforms.ui.Web.StepDefinitions;


import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import platforms.ui.Web.FlowModel.Vouchers_Flow;
import platforms.ui.Web.Pages.VAS_Voucher_HistoryPage;
import utils.Utils;

public class VAS_Voucher_DifferentProfilesSteps extends Utils {
    private static Logger log = Logger.getLogger(VAS_Voucher_DifferentProfilesSteps.class);
    public Vouchers_Flow voucher = PageFactory.initElements(driver, Vouchers_Flow.class);


    @And("^User want to check if Hollywood bets is Visible$")
    public void userWantToCheckIfHollywoodBetsIsVisible() {
        voucher.Check_HollywoodBets_Visible();
    }

    @And("^User should not see Lotto product$")
    public void userShouldNotSeeLottoProduct(){
        voucher.ShouldNotSee_Lotto_Product();

    }

    @And("^User should see Lotto Product$")
    public void userShouldSeeLottoProduct(){
        driver.findElement(By.xpath("//*[contains(text(),'Lotto')]")).isDisplayed();

    }

    @And("^User should see Hollywood Bets Category$")
    public void userShouldSeeHollywoodBetsCategory() {
        driver.findElement(By.xpath("//div[contains(text(),'Hollywoodbets')]")).isDisplayed();

    }

    @And("^User want to switch profile$")
    public void userWantToSwitchProfile(){
       voucher.Switch_Profile();
    }

}
