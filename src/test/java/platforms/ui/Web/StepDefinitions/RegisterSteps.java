package platforms.ui.Web.StepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import platforms.ui.Web.Pages.LoginPage;
import platforms.ui.Web.WebDataFactory;
import utils.Utils;

import java.util.concurrent.TimeUnit;

public class RegisterSteps extends Utils {
    LoginPage register = PageFactory.initElements(driver, LoginPage.class);

    @When("^user clicks on registration button$")
    public void userClickOnRegistrationButton() {
        register.RegisterIMG.click();
    }

    @And("^user enters TP SAID ([^\"]*)$")
    public void userEntersTPSAIDSAID(String tpsaid) {
        register.IDTextfield.sendKeys(WebDataFactory.TPSAID);
    }

    @And("^user enters Non TP SAID ([^\"]*)$")
    public void userEntersNonTPSAIDSAID(String ntpsaid) {
        register.IDTextfield.sendKeys(WebDataFactory.NTPSAID);
    }

    @And("^user clicks the next button$")
    public void userClickOnNextButton() {
        register.NextButton.click();
    }

    @And("^user enter TP SAID Password ([^\"]*)$")
    public void userEnterTPSAIDPasswordPassword(String tpsaidpassword) {
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        register.RegPasswordTextField.sendKeys(WebDataFactory.TPSAIDPassword);
    }

    @And("^user enter Non TP Password ([^\"]*)$")
    public void userEnterNonTPPasswordPassword(String ntpsaidpassword) {
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        register.RegPasswordTextField.sendKeys(WebDataFactory.NTPSAIDPassword);
    }

    @And("^user clicks on Don't have an SAID$")
    public void userClicksOnDonTHaveAnSAID() {
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        register.NOSAIDButton.click();
    }

    @And("^user enters Passport ([^\"]*) with Country ([^\"]*)$")
    public void userEntersPassportPassportWithCountryCountry(String passport, String country) {
        register.PassportTextField.sendKeys(WebDataFactory.Passport);
        register.CountryTextField.sendKeys(WebDataFactory.Country);
        driver.findElement(By.xpath("//span[text()='"+WebDataFactory.Country+"']")).click();
    }


    @And("^user enters Passport Password ([^\"]*)$")
    public void userEntersPassportPasswordPPassword(String ppassword) {
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        register.PassPassword.sendKeys(WebDataFactory.PassPassword);
    }
    //Then Statement already defined in LoginSteps.java
    //Depending on whether TP or Non TP the specific validation is made
}
