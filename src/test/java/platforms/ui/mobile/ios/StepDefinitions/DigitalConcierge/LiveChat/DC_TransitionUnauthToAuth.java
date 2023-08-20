package platforms.ui.mobile.ios.StepDefinitions.DigitalConcierge.LiveChat;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.log4j.Logger;
import platforms.ui.mobile.ios.PageFactoryObject;
import platforms.ui.mobile.ios.StepDefinitions.iOSLogin2;
import utils.DriverFactory;

public class DC_TransitionUnauthToAuth extends DriverFactory  {

    iOSLogin2 login = new iOSLogin2();

    private static Logger log = Logger.getLogger(DC_ChatAgentConnectivity.class);
    PageFactoryObject pageFactoryObj = new PageFactoryObject(driver);

    @And("^Come back to Login screen$")
    public void comeBackToLoginScreen() throws Throwable {
        pageFactoryObj.getUnauthChatScreenLocatos().back_btn.click();
        Thread.sleep(2);

    }

    @When("^login with username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void loginWithUsernameAndPassword(String userName, String password) throws Throwable {
        login.userEntersAUsernameAndPasswordForFirstLoginIosApp(userName, password);
        Thread.sleep(10);
    }


}
