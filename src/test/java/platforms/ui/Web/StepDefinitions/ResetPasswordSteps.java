package platforms.ui.Web.StepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.PageFactory;
import platforms.ui.Web.Pages.LoginPage;
import platforms.ui.Web.WebDataFactory;
import utils.Utils;

import java.util.concurrent.TimeUnit;

public class ResetPasswordSteps extends Utils {
    LoginPage alternateLogin = PageFactory.initElements(driver, LoginPage.class);

    @When("^user clicks on forgot details$")
    public void userClicksOnForgotDetails() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        alternateLogin.ForgotDetails.click();
    }

    @And("^user clicks on change Nedbank ID password$")
    public void userClicksOnChangeNedbankIDPassword() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        alternateLogin.ChangePassword.click();
    }

    @And("^user enters NedID TP username ([^\"]*)$")
    public void userEntersNedIDUsernameUsername(String nedIdTPUsername) {
        alternateLogin.CPUsernameTextbox.sendKeys(WebDataFactory.resetPassTPUsername);

    }

    @And("^user enters NedID Non TP username ([^\"]*)$")
    public void userEntersNedIDNonTPUsernameNTPUsername(String nedIdNTPUsername) {
        alternateLogin.CPUsernameTextbox.sendKeys(WebDataFactory.resetPassNTPUsername);
    }

    @And("^user clicks on next button$")
    public void userClicksOnNextButton() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        alternateLogin.CPNextButton.click();
    }

    @And("^user enter ([^\"]*) with ([^\"]*)$")
    public void userEnterNewPasswordWithConfirmPassword(String newPassword, String confirmPassword) {
        alternateLogin.CPNewPassword.sendKeys(WebDataFactory.NewPassword);
        alternateLogin.CPConfirmPassword.sendKeys(WebDataFactory.NewPassword);
    }


    @And("^user clicks on create Password$")
    public void userClicksOnCreatePassword() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        alternateLogin.changePassword.click();
    }

    @And("^user clicks on login$")
    public void userClicksOnLogin() {
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        alternateLogin.CPLogin.click();
    }

    @And("^user enters triple Profile ([^\"]*) with Pin ([^\"]*) with Password ([^\"]*)$")
    public void userEntersTripleProfilePppProfileWithPinPppPinWithPasswordPppPassword(String cpProfile, String cpPin, String cpPassword) {
        alternateLogin.pppProfile.sendKeys(WebDataFactory.pppProfile);
        alternateLogin.pppPin.sendKeys(WebDataFactory.pppPin);
        alternateLogin.pppPassword.sendKeys(WebDataFactory.pppPassword);
    }

    @And("^user clicks next button$")
    public void userClicksNextButton() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        alternateLogin.pppNext.click();

    }


}