package platforms.ui.mobile.ios.StepDefinitions.DigitalConcierge.HeyJude;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.ui.WebDriverWait;
import platforms.ui.mobile.ios.PageFactoryObject;
import platforms.ui.mobile.ios.StepDefinitions.DC_CommonFunctions;
import utils.CommonFunctions;
import utils.DriverFactory;

public class DC_HeyNedCreateAudioTask extends DriverFactory {

    private static Logger log = Logger.getLogger(DC_HeyNedCreateAudioTask.class);
    PageFactoryObject pageFactoryObj = new PageFactoryObject(driver);
    WebDriverWait wait = new WebDriverWait(driver, 60);
    private CommonFunctions common = new CommonFunctions();


    @And("^user can create audio task by using microphone$")
    public void userCanCreateAudioTaskByUsingMicrophone() {
        try {
            log.info("Audio start starts");
            pageFactoryObj.getTaskCreationScreen().audioBtnOnTaskList.click();

            //user will be redirected to record screen
            if (pageFactoryObj.getTaskCreationScreen().audioRecordBtn.isDisplayed()) {
                pageFactoryObj.getTaskCreationScreen().audioRecordBtn.click();
                //Make sure recording gets started
                if (pageFactoryObj.getTaskCreationScreen().audioRecordingTimer.isDisplayed()) {
                    log.info("Audio start starts");

                    //  wait(3);
                    pageFactoryObj.getTaskCreationScreen().audioRecordBtn.click();
                }

            } else
                log.error("Not on audio recording screen");
        } catch (Exception ex) {
            log.warn(ex.getMessage());
        }

    }

    @And("^user clicks on Audio Send button$")
    public void userClicksOnAudioSendButton(){
        pageFactoryObj.getTaskCreationScreen().audioSendBtn.click();
        log.info("User clicks on Audio Send button");
    }

    @Then("^user should be able to land on audio task$")
    public void userShouldBeAbleToLandOnAudioTask(){
        try {
            common.secondsDelay(2);
            log.info("User is in Audio Task");
            //verify the audio
            boolean isPlayBtn = pageFactoryObj.getTaskCreationScreen().audioTaskPlayBtn.isDisplayed();
            if (isPlayBtn) {
                log.info("Audio task is present");
                pageFactoryObj.getTaskCreationScreen().audioTaskPlayBtn.click();
                common.secondsDelay(7);
            } else
                log.error("Audion task is not present");
        }catch (Exception ex) {
            log.warn(ex.getMessage());
        }
    }

    @And("^I should be able to land on task list by clicking back button from Audio task$")
    public void iShouldBeAbleToLandOnTaskListByClickingBackButtonFromAudioTask(){
        pageFactoryObj.getTaskCreationScreen().backbuttonfromTaskList.click();
        DC_CommonFunctions.OnTaskCreationScreen();
    }
}
