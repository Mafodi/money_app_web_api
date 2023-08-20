package platforms.ui.Web.Pages.Common;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FeedbackPage {

    @FindBy(how = How.ID, using ="options-check-feedback-0")
    public WebElement IllBeBack;

    @FindBy(how = How.ID, using ="send_feedback")
    public WebElement SendFeedback;



}
