package platforms.ui.mobile.ios.StepDefinitions.DigitalConcierge.HeyJude;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import platforms.ui.mobile.ios.PageFactoryObject;
import platforms.ui.mobile.ios.StepDefinitions.DC_CommonFunctions;
import utils.DriverFactory;


public class DC_ProfileUpdate extends DriverFactory {

    WebDriverWait wait = new WebDriverWait(driver, 20);
    private static Logger log = Logger.getLogger(DC_ProfileUpdate.class);
    PageFactoryObject pageFactoryObj = new PageFactoryObject(driver);

    String name = null;
    String surName = null;
    String cellPhoneNumber = null;
    String email = null;


    @And("^I should be able to see the profile details and can Edit it$")
    public void iShouldBeAbleToSeeTheProfileDetailsAndCanEditIt() {
        try {
            if (pageFactoryObj.getProfileUpdateScreenLocator().profileScreentile.isDisplayed()) {
                log.info("User is on EditProfileScreen");
                pageFactoryObj.getProfileUpdateScreenLocator().editBtn.click();
            }
        } catch (Exception ex) {
            log.error(ex.getMessage());
        }
    }

    @And("^I enter valid details \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
    public void iEnterValidDetails(String arg0, String arg1, String arg2, String arg3) {
        try {
            name = arg0;
            surName = arg1;
            cellPhoneNumber = arg2;
            email = arg3;

            pageFactoryObj.getProfileUpdateScreenLocator().editName.clear();
            pageFactoryObj.getProfileUpdateScreenLocator().editName.sendKeys(arg0);

            pageFactoryObj.getProfileUpdateScreenLocator().editSurname.clear();
            pageFactoryObj.getProfileUpdateScreenLocator().editSurname.sendKeys(arg1);

            pageFactoryObj.getProfileUpdateScreenLocator().editCellphone.clear();
            pageFactoryObj.getProfileUpdateScreenLocator().editCellphone.sendKeys(arg2);
            DC_CommonFunctions.swipedowniOS();

            pageFactoryObj.getProfileUpdateScreenLocator().editEmail.clear();
            pageFactoryObj.getProfileUpdateScreenLocator().editEmail.sendKeys(arg3);

            DC_CommonFunctions.swipedowniOS();
            log.info("Updated info");
        }
        catch (Exception ex)
        {
            log.error(ex.getMessage());
        }
    }

    @And("^click on Save button$")
    public void clickOnSaveButton() {
        try {
            pageFactoryObj.getProfileUpdateScreenLocator().saveBtn.click();
            log.info("Clicked on Save button");
        }
        catch (Exception ex)
        {
            log.error(ex.getMessage());
        }
    }

    @Then("^I can see the updated profile details on Profile screen$")
    public void iCanSeeTheUpdatedProfileDetailsOnProfileScreen() {
        try {
            if (pageFactoryObj.getProfileUpdateScreenLocator().name.getText().equalsIgnoreCase(name))
                log.info("Name updated successfully");
            if (pageFactoryObj.getProfileUpdateScreenLocator().surname.getText().equalsIgnoreCase(surName))
                log.info("surName updated successfully");
            if (pageFactoryObj.getProfileUpdateScreenLocator().cellphone.getText().equalsIgnoreCase(surName))
                log.info("surName updated successfully");
            if (pageFactoryObj.getProfileUpdateScreenLocator().email.getText().equalsIgnoreCase(email))
                log.info("email updated successfully");
            wait.until(ExpectedConditions.visibilityOfAllElements(pageFactoryObj.getProfileUpdateScreenLocator().editBtn));
            log.info("Profile updated successfully");
        }catch (Exception ex) {
            log.warn(ex.getMessage());
        }
    }
}
