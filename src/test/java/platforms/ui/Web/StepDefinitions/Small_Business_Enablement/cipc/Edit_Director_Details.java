package platforms.ui.Web.StepDefinitions.Small_Business_Enablement.cipc;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.log4j.Logger;
import platforms.ui.Web.FlowModel.SBE.Business_Account;
import platforms.ui.Web.FlowModel.SBE.Business_Registration;
import platforms.ui.Web.StepDefinitions.Small_Business_Enablement.reusable.SBE_DataFactory;


public class Edit_Director_Details {

    Business_Account myMethods = new Business_Account();
    private static Logger log = Logger.getLogger(Edit_Director_Details.class);

    @Given("^I have logged in successfully$")
    public void iHaveLoggedInSuccessfully() {

        Business_Account.driverInitializer(SBE_DataFactory.cipcURL);

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Business_Registration.clickOnRegisterOnTheLandingPage();
        Business_Registration.selectDirectorOrShareholder();
        Business_Account.selectAgreeTermsAndConditions();
        Business_Account.clickNextBusinessBundle();
        Business_Account.clickYesOnNedbankClientQuestion();
        Business_Account.enterUsername(SBE_DataFactory.username);
        Business_Account.enterPassword(SBE_DataFactory.pwd);
        Business_Account.clickLogin();
    }

    @And("^I am now on the director details page$")
    public void iAmNowOnTheDirectorDetailsPage() {

        Business_Registration.verifyDirectorDetailsPage();
    }

    @When("^I click edit on the home address section$")
    public void iClickEditOnTheHomeAddressSection() {

        Business_Registration.clickEdit_HomeAddressDetails();
    }

    @When("^I click edit on the personal details section$")
    public void iClickEditOnThePersonalDetailsSection() {

        Business_Registration.clickEdit_PersonalDetails();
    }

    @And("^I update the ID number (.*), email address (.*), and cell phone (.*)$")
    public void iUpdateTheIDNumberId_numberEmailAddressEmail_addressAndCellPhoneCell_phone(String idNumber, String emailAddress, String cellphone) {

        Business_Registration.changePersonalDetails(idNumber,emailAddress,cellphone);
    }

    @And("^I click close on the personal details section$")
    public void iClickCloseOnThePersonalDetailsSection() {

        Business_Registration.clickCloseEdit_PersonalDetails();
    }
    @When("^I click next on director personal details$")
    public void iClickNextOnDirectorPersonalDetails() {

        Business_Registration.clickNextOnDirectorDetails();
    }

    @Then("^I am now on the registration method section$")
    public void iAmNowOnTheRegistrationMethodSection() {

        Business_Registration.verifyRegistrationMethodSection();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Business_Account.closeDriver();
    }

    @And("^I update the home address (.*)$")
    public void iUpdateTheHomeAddressHome_address(String homeAddress) {

        Business_Registration.enterBusinessAddress(homeAddress);
    }

    @And("^I click close on the home address section$")
    public void iClickCloseOnTheHomeAddressSection() {

        Business_Registration.clickCloseEdit_PersonalDetails();
    }

    @When("^I click edit on the postal address section$")
    public void iClickEditOnThePostalAddressSection() {

        Business_Registration.clickEdit_CloseOnPostalAddressDetails();
    }

    @And("^I update the postal address (.*)$")
    public void iUpdateThePostalAddressHome_address(String postalAddress) {

        Business_Registration.editPostalAddress(postalAddress);
    }

    @And("^I click close on the postal address section$")
    public void iClickCloseOnThePostalAddressSection() {

        Business_Registration.clickCloseEdit_PersonalDetails();
    }


}
