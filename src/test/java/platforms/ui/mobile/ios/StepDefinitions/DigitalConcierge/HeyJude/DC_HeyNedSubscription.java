package platforms.ui.mobile.ios.StepDefinitions.DigitalConcierge.HeyJude;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.appium.java_client.MobileElement;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.ui.WebDriverWait;
import platforms.ui.mobile.ios.PageFactoryObject;
import platforms.ui.mobile.ios.StepDefinitions.DC_CommonFunctions;
import platforms.ui.mobile.ios.iOSFlowModel.iOSHeyNed_Flow;
import platforms.ui.mobile.ios.iOSPageObjects.DC_HeyJude.iOSDataUsageScreen;
import utils.CommonFunctions;
import utils.DriverFactory;

import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;


public class DC_HeyNedSubscription extends DriverFactory {
    private static Logger log = Logger.getLogger(DC_HeyNedSubscription.class);
    boolean isRegistrationScreen = false;
    WebDriverWait wait = new WebDriverWait(driver, 60);
    iOSDataUsageScreen dataUsageScreenLocators = new iOSDataUsageScreen(driver);
    PageFactoryObject pageFactoryObj = new PageFactoryObject(driver);
    private CommonFunctions common = new CommonFunctions();
    iOSHeyNed_Flow heyJudeFlowModel=new iOSHeyNed_Flow();

    public boolean IsRegistrationScreen() {
        try {
            if (pageFactoryObj.getSubscriptionScreenLocator().registrationTitle.size() > 0) {
                log.info("Registration form gets displayed");
                isRegistrationScreen = true;
            } else
                log.info("Registration form is already done");
        } catch (Exception ex) {
            log.warn(ex.getMessage());
        }
        return isRegistrationScreen;
    }

    @Then("^user should see the subscription options screen$")
    public void userShouldSeeTheSubscriptionOptionsScreen() {
        try {
            wait.until(visibilityOf(pageFactoryObj.getSubscriptionScreenLocator().subscriptionHeading));
            if (pageFactoryObj.getSubscriptionScreenLocator().subscriptionHeading.getText().contains("Join the HeyNed lifestyle service for")) {
                log.info("User is on Subscription Page");
                System.out.println("On subscription screen");
            }
        }catch (Exception ex) {
            log.warn(ex.getMessage());
        }
    }

    @And("^click on Next Button on subscription screen$")
    public void clickOnNextButtonOnSubscriptionScreen() {
        try {
            common.secondsDelay(10);
            wait.until(visibilityOf(pageFactoryObj.getSubscriptionScreenLocator().subscriptionHeading));
            pageFactoryObj.getSubscriptionScreenLocator().nextButton.click();
        }catch (Exception ex) {
            log.warn(ex.getMessage());
        }
    }

    @And("^Registration form should be displayed$")
    public void registrationFormShouldBeDisplayed() {
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        IsRegistrationScreen();
    }

    @And("^user enters valid \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
    public void userEntersValid(String Name, String Surname, String cellPhoneNumber, String Email) {
        try {
            if (isRegistrationScreen) {
                pageFactoryObj.getSubscriptionScreenLocator().regName.clear();
                pageFactoryObj.getSubscriptionScreenLocator().regName.sendKeys(Name);

                pageFactoryObj.getSubscriptionScreenLocator().regSurname.clear();
                pageFactoryObj.getSubscriptionScreenLocator().regSurname.sendKeys(Surname);

                driver.hideKeyboard();
                pageFactoryObj.getSubscriptionScreenLocator().regCellphoneNumber.clear();

                pageFactoryObj.getSubscriptionScreenLocator().regCellphoneNumber.sendKeys(cellPhoneNumber);
                pageFactoryObj.getSubscriptionScreenLocator().regEmail.clear();

                pageFactoryObj.getSubscriptionScreenLocator().regEmail.sendKeys(Email);
                driver.hideKeyboard();
                log.info("Done with the Customer Info");
                DC_CommonFunctions.swipedowniOS();
            }
        }catch (Exception ex) {
            log.warn(ex.getMessage());
        }
    }

    @And("^click on Next button on Registration form$")
    public void clickOnNextButtonOnRegistrationForm() {
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        if (isRegistrationScreen) {
            System.out.println("Click on Next button");
            pageFactoryObj.getSubscriptionScreenLocator().nextButton.click();
        }
    }

    @Then("^Success screen should be displayed$")
    public void successScreenShouldBeDisplayed() {
        try {
            driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
            if (pageFactoryObj.getSubscriptionScreenLocator().subscriptionSuccessMessage.getText().equalsIgnoreCase("Great! Your HeyNed lifestyle service is active.")) {
                log.info("Subscription is free");
                pageFactoryObj.getSubscriptionScreenLocator().nextButton.click();
            }
        }catch (Exception ex) {
            log.warn(ex.getMessage());
        }
    }

    @And("^user should be able to see T&C button$")
    public void userShouldBeAbleToSeeTCButton() {
        if(pageFactoryObj.getSubscriptionScreenLocator().termsAndConditions.isDisplayed())
            log.info("Terms and condition button is visible to user.");
    }

    @Then("^user should be able to see Terms and Conditions screen for Heyjude$")
    public void userShouldBeAbleToSeeTermsAndConditionsScreenForHeyjude() {
        pageFactoryObj.getSubscriptionScreenLocator().termsAndConditions.click();
        log.info("Terms and condition screens are visible to user");
    }


    @And("^Review Subscription screen should be displayed$")
    public void reviewSubscriptionScreenShouldBeDisplayed() throws Throwable {
        if(pageFactoryObj.getSubscriptionScreenLocator().reviewSubscriptionTitle.size()>0)
            log.info("user is on review subscription sceeen");
    }

    @And("^click on Subscribe button$")
    public void clickOnSubscribeButton() throws Throwable {
        pageFactoryObj.getSubscriptionScreenLocator().subscribeButton.click();
    }


    @Then("^user should be successfully registered and payment screen should be displayed$")
    public void userShouldBeSuccessfullyRegisteredAndPaymentScreenShouldBeDisplayed() throws Throwable {
        if(pageFactoryObj.getSubscriptionScreenLocator().subscriptionPayementScreen.size()>0)
            log.info("User is on payment sceeen");
    }

    @And("^I can see all the Nedbank cards present in the profile$")
    public void iCanSeeAllTheNedbankCardsPresentInTheProfile() throws Throwable {
    }

    @And("^Select a nedbank card for payment$")
    public void selectANedbankCardForPayment() throws Throwable {
        try {
            String SelectedCardNumber = null;

            if (pageFactoryObj.getSubscriptionScreenLocator().nedbankCardForPayment.size() > 0) {
                log.info("User needs to select card");
                for (MobileElement element : pageFactoryObj.getSubscriptionScreenLocator().nedbankCardForPayment) {
                    element.click();
                    break;
                }
            }
        } catch (Exception ex) {
            log.warn(ex.getMessage());
        }
    }

    @And("^Enter CVV \"([^\"]*)\" and click on Next button$")
    public void enterCVVAndClickOnNextButton(String arg0) throws Throwable {
        try {
            pageFactoryObj.getSubscriptionScreenLocator().cvvNumber.sendKeys(arg0);
            //To hide keyboard, clicking on selected card
            pageFactoryObj.getSubscriptionScreenLocator().cvvNumber.click();
            pageFactoryObj.getSubscriptionScreenLocator().nextButton.click();
        }catch (Exception ex) {
            log.warn(ex.getMessage());
        }
    }

    @Given("^user is on HeyNed Subscription screen on login with username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void userIsOnHeyNedSubscriptionScreenOnLoginWithUsernameAndPassword(String userName, String password) throws Throwable {
        heyJudeFlowModel.Navigate_To_HeyNed_Subscription(userName, password);

    }
}
