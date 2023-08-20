package platforms.ui.Web.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class LoginPage {

    //NEDID Login
    @FindBy(how = How.XPATH, using ="//input[@id='username']")
    public WebElement UserNameTextField;

    @FindBy(how = How.XPATH, using ="//input[@id='password']")
    public WebElement PasswordTextField;

    @FindBy(how = How.XPATH, using ="//button[@id='log_in']")
    public WebElement LoginButton;

    //Create NEDID
    @FindBy(how = How.XPATH, using ="//button[@id='create_my_nedbank_id']")
    public WebElement CreateNedIdButton;

    @FindBy(how = How.XPATH, using ="//input[@id='username']")
    public WebElement NedUsernameTextField;

    @FindBy(how = How.XPATH, using ="//input[@id='password']")
    public WebElement NedPasswordTextField;

    @FindBy(how = How.XPATH, using ="//input[@id='verifyPassword']")
    public WebElement NedConfirmPasswordTextfield;

    @FindBy(how = How.XPATH, using ="//button[@id='create']")
    public WebElement NedFinalCreateNedIdButton;

    //On Success Page
    @FindBy(how = How.XPATH, using ="//button[@id='done']")
    public WebElement DoneButton;

    //Accept Terms and Conditions
    @FindBy(how = How.XPATH, using ="//button[@id='accept']")
    public WebElement AcceptTCs;

    //SAID Login
    @FindBy(how = How.XPATH, using ="//div[@class='registration']")
    public WebElement RegisterIMG;

    @FindBy(how = How.XPATH, using ="//input[@id='idnumber']")
    public WebElement IDTextfield;

    @FindBy(how = How.XPATH, using ="//button[@id='next']")
    public WebElement NextButton;

    @FindBy(how = How.XPATH, using ="//input[@id='password']")
    public WebElement RegPasswordTextField;

    //Passport Login


    @FindBy(how = How.XPATH, using ="//span[contains(text(),'Don’t have an SA ID')]")
    public WebElement NOSAIDButton;
    @FindBy(how = How.XPATH, using ="//input[@id='passport']")
    public WebElement PassportTextField;
    @FindBy(how = How.XPATH, using ="//input[@id='source']")
    public WebElement CountryTextField;
    @FindBy(how = How.XPATH, using ="//input[@id='password']")
    public WebElement PassPassword;


    //Assert Logged In State and Correct Dashboard
    @FindBy(how = How.XPATH, using ="//a[contains(text(),'Log out')]")
    public WebElement LogoutLabel;

    @FindBy(how = How.XPATH, using ="//a[contains(text(),'Pay')]")
    public WebElement PayLabel;

    @FindBy(how = How.XPATH, using ="//a[contains(text(),'Transfer')]")
    public WebElement TransferLabel;

    @FindBy(how = How.XPATH, using ="//b[contains(text(),'bank')]")
    public WebElement AccountCard;

    @FindBy(how = How.XPATH, using ="//b[contains(text(),'loan')]")
    public WebElement LoanCard;

    @FindBy(how = How.XPATH, using ="//a[contains(text(),'View and apply ')]")
    public WebElement ViewApplyLabel;


    //Reset Password
    @FindBy(how = How.XPATH, using ="//a[contains(text(),'Forgot your details?')]")
    public WebElement ForgotDetails;

    @FindBy(how = How.XPATH, using ="//td[contains(text(),'Reset your')]")
    public WebElement ChangePassword;

    @FindBy(how = How.XPATH, using ="//input[@id = 'username']")
    public WebElement CPUsernameTextbox;

    @FindBy(how = How.XPATH, using ="//button[@id='next']")
    public WebElement CPNextButton;

    @FindBy(how = How.XPATH, using ="//input[@id = 'password']")
    public WebElement CPNewPassword;

    @FindBy(how = How.XPATH, using ="//input[@id = 'verifyPassword']")
    public WebElement CPConfirmPassword;

    @FindBy(how = How.XPATH, using ="//button[@id = 'change_password']")
    public WebElement changePassword;

    @FindBy(how = How.XPATH, using ="//button[@id = 'log_in']")
    public WebElement CPLogin;

    @FindBy(how = How.XPATH, using ="//input[@id = 'profile']")
    public WebElement pppProfile;

    @FindBy(how = How.XPATH, using ="//input[@id = 'pin']")
    public WebElement pppPin;

    @FindBy(how = How.XPATH, using ="//input[@id = 'password']")
    public WebElement pppPassword;

    @FindBy(how = How.XPATH, using ="//button[@id = 'next']")
    public WebElement pppNext;

    //Accept Ts & Cs
    @FindBy(how = How.XPATH, using ="//button[@id = 'accept']")
    public WebElement TsnCs;


    //==========================================================================================
    //                        Methods
    //==========================================================================================

    /**
     * Method fills in username and password and logs the user into the application
     * @param userName - Specify username to log into the web application
     * @param password - Specify password to log into the web application
     */
    public void Login(String userName, String password) {

        UserNameTextField.sendKeys(userName);
        PasswordTextField.sendKeys(password);
        LoginButton.click();
    }

    public void Register(String SAID, String password) {

        RegisterIMG.click();
        IDTextfield.sendKeys(SAID);
        NextButton.click();
        RegPasswordTextField.sendKeys(password);
        LoginButton.click();
    }

    public void ChangePassword(String CPUsername, String newPassword, String confirmPassword, String cpProfile, String cpPin, String cpPassword) {
        ForgotDetails.click();
        ChangePassword.click();
        CPUsernameTextbox.sendKeys(CPUsername);
        CPNextButton.click();
        CPNewPassword.sendKeys(newPassword);
        CPConfirmPassword.sendKeys(confirmPassword);
        changePassword.click();
        CPLogin.click();
        pppProfile.sendKeys(cpProfile);
        pppPin.sendKeys(cpPin);
        pppPassword.sendKeys(cpPassword);
        pppNext.click();

    }


}