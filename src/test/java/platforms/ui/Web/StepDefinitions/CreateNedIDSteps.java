package platforms.ui.Web.StepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.PageFactory;
import platforms.ui.Web.Pages.LoginPage;
import utils.Utils;

import java.util.concurrent.TimeUnit;

public class CreateNedIDSteps extends Utils {
    LoginPage createNedID = PageFactory.initElements(driver, LoginPage.class);

    @And("^user clicks on Create NEDID$")
    public void userClicksOnCreateNEDID() {
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        createNedID.CreateNedIdButton.click();
        
    }


    @And("^user enters Username ([^\"]*) with Password ([^\"]*) with Confirm Password ([^\"]*)$")
    public void userEntersUsernameUsernameWithPasswordPasswordWithConfirmPasswordConfirmPassword(String username, String password, String confirmPassword) {
        createNedID.NedUsernameTextField.sendKeys(username);
        createNedID.NedPasswordTextField.sendKeys(password);
        createNedID.NedConfirmPasswordTextfield.sendKeys(confirmPassword);

    }

    @When("^user clicks Create button$")
    public void userClicksCreateButton() {
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        createNedID.NedFinalCreateNedIdButton.click();
    }

    @And("^user clicks Done on the confirmation screen$")
    public void userClicksDoneOnTheConfirmationScreen() {
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        createNedID.DoneButton.click();
    }

    @And("^user accepts terms and conditions$")
    public void userAcceptsTermsAndConditions() {
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        createNedID.AcceptTCs.click();
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        createNedID.AcceptTCs.click();

    }
}
