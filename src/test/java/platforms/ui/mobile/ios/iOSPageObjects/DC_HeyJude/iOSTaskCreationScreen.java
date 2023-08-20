package platforms.ui.mobile.ios.iOSPageObjects.DC_HeyJude;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

public class iOSTaskCreationScreen {

    public iOSTaskCreationScreen(AppiumDriver iOSDriver)
    {
        PageFactory.initElements(new AppiumFieldDecorator(iOSDriver), this);
    }

    @iOSXCUITFindBy(xpath="//XCUIElementTypeNavigationBar[@name=\"Task list\"]")
    public MobileElement taskListTitle;

    @iOSXCUITFindBy(xpath="//XCUIElementTypeButton[@name=\"Open\"]")
    public MobileElement openTab;

    @iOSXCUITFindBy(xpath="//XCUIElementTypeButton[@name=\"Closed\"]")
    public MobileElement closeTab;

    @iOSXCUITFindBy(accessibility="lifestyleTextBox")
    public MobileElement createTaskTextBox;

    //Inside Task
    @iOSXCUITFindBy(xpath="//XCUIElementTypeApplication[@name=\"Money\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]")
    public List<MobileElement> chatTextBoxinsideTask;

    @iOSXCUITFindBy(xpath="//XCUIElementTypeButton[@name=\"lifestyleSendArrow\"]")
    public MobileElement sendButton;

    @iOSXCUITFindBy(xpath="//XCUIElementTypeApplication[@name=\"Money\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeNavigationBar[1]/XCUIElementTypeOther")
    public MobileElement taskTitle;

    @iOSXCUITFindBy(accessibility="//XCUIElementTypeApplication[@name=\"Money\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell")
    public List<MobileElement> searchResult;

    //Searsch feature
    @iOSXCUITFindBy(xpath="//*[@name=\"Task list\"]/XCUIElementTypeButton[2]")
    public MobileElement searchIcon;

    @iOSXCUITFindBy(accessibility="SearchedTextBox")
    public MobileElement searchTextBox;

    @iOSXCUITFindBy(accessibility="//XCUIElementTypeStaticText[@name=\"There are no tasks matching your search.\"]")
    public List<MobileElement> noTaskMatching;

    @iOSXCUITFindBy(accessibility="//XCUIElementTypeImage[@name=\"lifestyleCreateTask\"]")
    public List<MobileElement> emptyList;

    //Image locators - TODO - Need to revisit
    @iOSXCUITFindBy(xpath="(//XCUIElementTypeButton[@name=\"pdfDownloadButton\"])")
    public List<MobileElement> pdfDownloadBtn;

    @iOSXCUITFindBy(xpath="(//XCUIElementTypeStaticText[@name=\"downloadImageButton\"])")
    public  List<MobileElement> imageDownloadBtn;

    @iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name=\"viewMapButton\"]")
    public  List<MobileElement> mapDownloadBtn;

    //Delete task
    @iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name=\"Delete task\"]")
    public MobileElement deleteTaskPopUp;

    @iOSXCUITFindBy(accessibility="No")
    public MobileElement noPopUpBtn;

    @iOSXCUITFindBy(accessibility="Yes")
    public MobileElement yesPopUpBtn;

    @iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name=\"Delete\"]")
    public MobileElement deleteBtn;

    @iOSXCUITFindBy(xpath="(//XCUIElementTypeButton[@name=\"Reopen\"])[1]")
    public MobileElement reopenBtn;

    //"//XCUIElementTypeStaticText[@name=\"Cancel\"]"
    @iOSXCUITFindBy(xpath="(//XCUIElementTypeButton[@name=\"Cancel\"])[1]")
    public MobileElement cancelBtn;
    //Rating
    @iOSXCUITFindBy(id="Please take a moment to rate your experience")
    public MobileElement npsBox;

    @iOSXCUITFindBy(id="FeeedbackSubmitButton")
    public MobileElement submitButton;

    // inside task
    @iOSXCUITFindBy(id="feedbackTextBox")
    public MobileElement commentTextBox;


    @iOSXCUITFindBy(accessibility="lifestylePhotoGallery\n")
    public MobileElement photoGalleryIcon;

    @iOSXCUITFindBy(accessibility="lifestyleCamera")
    public MobileElement cameraIcon;

    @iOSXCUITFindBy(accessibility="BackAccessiblity")
    public MobileElement backbuttonfromTaskList;

    //Supplier functionality
    @iOSXCUITFindBy(xpath="//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[2]")
    public MobileElement supplierName;

    @iOSXCUITFindBy(xpath="//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[3]")
    public MobileElement supplierAddress;

    @iOSXCUITFindBy(xpath="//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[4]")
    public MobileElement supplierDirection;

    @iOSXCUITFindBy(xpath="//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[5]")
    public MobileElement supplierPhoneNumber;

    //Audio task creation

    @iOSXCUITFindBy(accessibility="lifestyleMic")
    public MobileElement audioBtnOnTaskList;

    @iOSXCUITFindBy(accessibility="recordButton")
    public MobileElement audioRecordBtn;

    @iOSXCUITFindBy(accessibility="recordingTimeLabel")
    public MobileElement audioRecordingTimer;

    @iOSXCUITFindBy(accessibility="sendButton")
    public MobileElement audioSendBtn;

    @iOSXCUITFindBy(accessibility="audioPlayButton")
    public MobileElement audioTaskPlayBtn;
}
