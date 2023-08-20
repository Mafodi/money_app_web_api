package platforms.ui.mobile.ios.StepDefinitions.DigitalConcierge.HeyJude;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.apache.log4j.Logger;
import platforms.ui.mobile.ios.PageFactoryObject;
import platforms.ui.mobile.ios.StepDefinitions.DC_CommonFunctions;
import platforms.ui.mobile.ios.iOSFlowModel.iOSHeyNed_Flow;
import utils.DriverFactory;

public class DC_HeyNedTermsAndCondition extends DriverFactory {

    private static Logger log = Logger.getLogger(DC_HeyNedTermsAndCondition.class);
    PageFactoryObject pageFactoryObj = new PageFactoryObject(driver);
    iOSHeyNed_Flow heyJudeFlowModel=new iOSHeyNed_Flow();


    @And("^Terms and condition option should be displayed$")
    public void termsAndConditionOptionShouldBeDisplayed() {
        try {
            DC_CommonFunctions.swipedowniOS();
            pageFactoryObj.getProfileScreenLocatorscreen().termsAndConditions.isDisplayed();

        }catch (Exception e)
        {
            log.error("Terms and conditions option is not visible");
            log.error(e.getMessage());
        }
    }

    @And("^Click on Terms and condition$")
    public void clickOnTermsAndCondition() {
        try {
            pageFactoryObj.getProfileScreenLocatorscreen().termsAndConditions.click();
        }
        catch (Exception ex)
        {
            log.error(ex.getMessage());
        }
    }

    @And("^Review screen should gets displayed$")
    public void reviewScreenShouldGetsDisplayed() {
        try {
            if(pageFactoryObj.getTnCScreenLocatorscreen().reviewTnCTitle.getText().equals("Review our terms and conditions")) {
                log.info("Review screen gets displayed");
                DC_CommonFunctions.swipedowniOS();
                DC_CommonFunctions.swipedowniOS();
            }
        }catch (Exception e)
        {
            log.error("User is not on Review subscription screen");
            log.error(e.getMessage());
        }
    }

    @And("^I can see HeyNed option on review screen$")
    public void iCanSeeHeyNedOptionOnReviewScreen() {
        try
        {
            if(pageFactoryObj.getTnCScreenLocatorscreen().heyNedOption.isDisplayed())
                log.info("HeyNed option is visible on review screen");
        }
        catch (Exception e)
        {
            log.error("HeyNed option is not visible on review screen");
            log.error(e.getMessage());
        }
    }

    @And("^Click on HeyNed option$")
    public void clickOnHeyNedOption() {
        pageFactoryObj.getTnCScreenLocatorscreen().heyNedOption.click();
    }

    @Then("^HeyJude Terms and condition should gets displayed$")
    public void heyjudeTermsAndConditionShouldGetsDisplayed() {
        try {
            pageFactoryObj.getTnCScreenLocatorscreen().heyNedTnCText.getText().equals("Nedbank app Terms & Conditions");
            log.info("HeyJude Terms and conditions gets displayed");
        }
        catch (Exception e)
        {
            log.error("HeyJude Terms and conditions not displayed");
            log.error(e.getMessage());
        }
    }

    @Given("^user is on Profile Details screen on login with username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void userIsOnProfileDetailsScreenOnLoginWithUsernameAndPassword(String arg0, String arg1) throws Throwable {
        heyJudeFlowModel.Navigate_To_HeyNed_TermsNConditions(arg0,arg1);

    }
}
