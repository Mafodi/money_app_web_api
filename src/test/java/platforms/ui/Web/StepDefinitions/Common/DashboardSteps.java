package platforms.ui.Web.StepDefinitions.Common;

import cucumber.api.java.en.Then;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import platforms.ui.Web.Pages.Common.DashboardPage;
import utils.CommonFunctions;
import utils.Utils;


public class DashboardSteps extends Utils {

     public DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
    CommonFunctions commonFunctions = new CommonFunctions();
     private static Logger log = Logger.getLogger(DashboardSteps.class);
     WebDriverWait wait = new WebDriverWait(driver,10);


    @Then("^user must see application dashboard$")
    public void user_must_see_application_dashboard() {

        try{
            if(dashboardPage.AcceptCookies.isDisplayed()){
                dashboardPage.CloseCookies.click();
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        commonFunctions.secondsDelay(10);

        if(dashboardPage.WelcomeText.isDisplayed()) {

            String actualTitle = driver.getTitle();
            String expectedTitle = "Online Banking";
            Assert.assertEquals(actualTitle,expectedTitle);

            boolean popUp = true;

            try {

                while(popUp){

                    popUp = commonFunctions.findAndClickButtonByText("Done");

                }

            } catch (Exception e) {

                System.out.println(e.getMessage());

            }
        }

    }

}
