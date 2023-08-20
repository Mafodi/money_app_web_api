package platforms.ui.Web.FlowModel.SBE;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;
import platforms.ui.Web.Pages.Small_Business_Enablement.bussinessAccount.*;
import platforms.ui.Web.Pages.Small_Business_Enablement.cipc.Account_Page;
import platforms.ui.Web.Pages.Small_Business_Enablement.cipc.Landing_Page;
import platforms.ui.Web.Pages.Small_Business_Enablement.cipc.Payment;
import platforms.ui.Web.Pages.Small_Business_Enablement.cipc.Register_Page;
import platforms.ui.Web.StepDefinitions.Small_Business_Enablement.reusable.SetupConfig;
import utils.Utils;
import java.util.List;

public class Business_Registration extends Utils {

    static WebDriverWait wait = new WebDriverWait(driver, 10);

    public Business_Registration(WebDriver driver) {

        super();
    }
    public static void clickOnRegisterOnTheLandingPage() {


        ((JavascriptExecutor) driver).executeScript(SetupConfig.scrollView, Landing_Page.hyperLinkRegister);
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Landing_Page.hyperLinkRegister.click();
    }
    public static void clickRegisterWithName() {

        ((JavascriptExecutor) driver).executeScript(SetupConfig.scrollView, Register_Page.btnSelectPackage2);

        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Register_Page.btnSelectPackage1.click();
    }
    public static void enterCompanyName(String companyNames[]) {

        try {
            Thread.sleep(3500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement txtFourthName = Register_Page.txtBusinessName4;

        for (int i = 0; i < companyNames.length; i++) {

            if (i == 0) {

                Register_Page.txtBusinessName1.sendKeys(companyNames[i]);
                ((JavascriptExecutor) driver).executeScript(SetupConfig.scrollView, txtFourthName);

            } else if (i == 1) {

                Register_Page.txtBusinessName2.sendKeys(companyNames[i]);
            } else if (i == 2) {

                Register_Page.txtBusinessName3.sendKeys(companyNames[i]);
            } else {

                txtFourthName.sendKeys(companyNames[i]);
            }
        }

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void clickSubmitOnNames() {

        ((JavascriptExecutor) driver).executeScript(SetupConfig.scrollView, Register_Page.btnSubmit);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Register_Page.btnSubmit.click();
    }
    public static void verifyBBEE_Section() {

        try {
            Thread.sleep(3500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement lblBBEE = Register_Page.pageValidationText;

        try {
            Thread.sleep(3500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Assert.assertTrue(lblBBEE.getText().equalsIgnoreCase("BBBEE exemption certificate"));
    }
    public static void enterNumberOfShareholders(String val) {


        ((JavascriptExecutor) driver).executeScript(SetupConfig.scrollView, Register_Page.scroll);

        Register_Page.txtNumberOfShareholders.sendKeys(val);


    }
    public static void enterNumberOfBlackShareholders(String val) {

        Register_Page.txtNumberOfBlackShareholders.sendKeys(val);

    }
    public static void enterPercentageHeldByBlackShareholders(String val) {

        Register_Page.percentageOfBlackShareholders.clear();
        Register_Page.percentageOfBlackShareholders.sendKeys(val);
    }
    public static void enterPercentageOfBlackFemaleShareholders(String val) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement scrolldown = Register_Page.txtBlackWithDisabilities;
        ((JavascriptExecutor) driver).executeScript(SetupConfig.scrollView, scrolldown);

        Register_Page.percentageOfBlackFemale.sendKeys(val);


    }
    public static void enterNumberOfBlackUnemployedShareholders(String val) {

        Register_Page.txtBlackAndUnemployed.sendKeys(val);

    }
    public static void enterNumberOfBlackYouthShareholders(String val) {

        ((JavascriptExecutor) driver).executeScript(SetupConfig.scrollView, Register_Page.scroll);
        Register_Page.txtBlackYouth.sendKeys(val);
    }
    public static void enterNumberOfBlackShareholdersWithDisabilities(String val) {

        Register_Page.txtBlackWithDisabilities.sendKeys(val);

    }
    public static void enterNumberOfBlackShareholdersLivingRuralAreas(String val) {

        Register_Page.txtBlackAndLivingRural.sendKeys(val);

    }
    public static void enterNumberOfBlackShareholdersWhoMilitaryVeterans(String val) {

        Register_Page.txtBlackMilitaryVeterans.sendKeys(val);

    }
    public static void clickNextOnBusinessAccounts() {

        Account_Page.btnNext.click();
    }
    public static void clickNextOnBEEE(){

        ((JavascriptExecutor) driver).executeScript(SetupConfig.scrollView, Register_Page.scroll);
        try {
            Thread.sleep(3500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Register_Page.scroll.click();
    }
    public static void selectNoSameBusinessAddress() {

        Business_Address_Page.noPhysicalAddress.click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        ((JavascriptExecutor) driver).executeScript(SetupConfig.scrollView, Business_Address_Page.noPhysicalAddress);
    }
    public static void enterBusinessAddress(String businessAddress) {


        WebElement txtBusinessAddress = Business_Address_Page.addressSearchHolder.findElement(By.xpath(Business_Address_Page.txtsearchAddress));

        txtBusinessAddress.sendKeys(businessAddress);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        List<WebElement> lstOptions = Business_Address_Page.addressSearchHolder.findElements(By.tagName(Business_Address_Page.dropdownList));

        if (!lstOptions.isEmpty()) {
            WebElement getFirstOption = lstOptions.get(0);
            getFirstOption.click();
        }


        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        ((JavascriptExecutor) driver).executeScript(SetupConfig.scrollView, Business_Address_Page.noPostalAddress);

    }
    public static void selectNoNotSamePostalAddress() {

        ((JavascriptExecutor) driver).executeScript(SetupConfig.scrollView, Business_Address_Page.noPostalAddress);
        try {
            Thread.sleep(3500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Business_Address_Page.noPostalAddress.click();
        ((JavascriptExecutor) driver).executeScript(SetupConfig.scrollView, Business_Address_Page.noPostalAddress);
    }
    public static void enterPostalAddress(String postalAddress) {


        WebElement txtPostalAddress = Business_Address_Page.addressSearchHolder.findElement(By.xpath(Business_Address_Page.txtsearchAddress));

        txtPostalAddress.sendKeys(postalAddress);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        List<WebElement> lstOptions = Business_Address_Page.addressSearchHolder.findElements(By.tagName(Business_Address_Page.dropdownList));

        if (!lstOptions.isEmpty()) {
            WebElement getFirstOption = lstOptions.get(0);
            getFirstOption.click();
        }


        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void clickNext() {

        ((JavascriptExecutor) driver).executeScript(SetupConfig.scrollView, Business_Address_Page.btnNext);

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Business_Address_Page.btnNext.click();
    }
    public static void verifyDirectorDetailsPage() {

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {

            Assert.assertTrue(Personal_Details_Page.lblDirectorDetails.getText().equalsIgnoreCase("Personal details"));
        } catch (NoSuchElementException e) {

            if (Login_Page.errorMessage.isDisplayed()) {

                Login_Page.btnLogin.click();
            }

            try {
                Thread.sleep(5000);
            } catch (InterruptedException a) {
                e.printStackTrace();
            }
            Assert.assertTrue(Personal_Details_Page.lblDirectorDetails.getText().equalsIgnoreCase("Personal details"));
        }

    }
    public static void clickEdit_PersonalDetails() {

        Personal_Details_Page.editPersonalDetails.click();
    }
    public static void clickCloseEdit_PersonalDetails() {

        ((JavascriptExecutor) driver).executeScript(SetupConfig.scrollView, Personal_Details_Page.closeEdit);

        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Personal_Details_Page.closeEdit.click();

        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        ((JavascriptExecutor) driver).executeScript(SetupConfig.scrollView, Personal_Details_Page.btnNext1);
    }
    public static void changePersonalDetails(String idNumber, String emailAddress, String cellPhone) {


        Personal_Details_Page.txtIdNumber.clear();
        Personal_Details_Page.txtIdNumber.sendKeys(idNumber);

        ((JavascriptExecutor) driver).executeScript(SetupConfig.scrollView, Personal_Details_Page.txtCellPhone);

        Personal_Details_Page.txtEmailAddress.clear();
        Personal_Details_Page.txtEmailAddress.sendKeys(emailAddress);

        Personal_Details_Page.txtCellPhone.clear();
        Personal_Details_Page.txtCellPhone.sendKeys(cellPhone);
    }
    public static void clickNextOnCompanyDirectorship() {

        try {

            ((JavascriptExecutor) driver).executeScript(SetupConfig.scrollView, Personal_Details_Page.btnNext1);
            try {
                Thread.sleep(2500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Personal_Details_Page.btnNext1.click();

        }catch(NoSuchElementException e){

            if(Login_Page.errorMessage.isDisplayed()){

                Login_Page.btnLogin.click();
            }

            ((JavascriptExecutor) driver).executeScript(SetupConfig.scrollView, Personal_Details_Page.btnNext1);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException a) {
                e.printStackTrace();
            }
            Personal_Details_Page.btnNext1.click();
            try {
                Thread.sleep(2500);
            } catch (InterruptedException a) {
                e.printStackTrace();
            }

        }

    }
    public static void verifyRegistrationMethodSection() {

        Assert.assertTrue(Register_Page.lblRegistrationMethodHeading.getText().equalsIgnoreCase("How would you like to register your business?"));
    }
    public static void clickEdit_HomeAddressDetails() {

        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ((JavascriptExecutor) driver).executeScript(SetupConfig.scrollView, Personal_Details_Page.editHomeAddress);

        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Personal_Details_Page.editHomeAddress.click();
    }
    public static void editHomeAddress(String Address) {


        WebElement txtBusinessAddress = Business_Address_Page.addressSearchHolder.findElement(By.xpath(Business_Address_Page.txtsearchAddress));

        txtBusinessAddress.sendKeys(Address);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        List<WebElement> lstOptions = Business_Address_Page.addressSearchHolder.findElements(By.tagName(Business_Address_Page.dropdownList));

        if (!lstOptions.isEmpty()) {
            WebElement getFirstOption = lstOptions.get(0);
            getFirstOption.click();
        }


        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void editPostalAddress(String Address){

        WebElement txtPostalAddress = Business_Address_Page.addressSearchHolder.findElement(By.xpath(Business_Address_Page.txtsearchAddress));

        txtPostalAddress.sendKeys(Address);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        List<WebElement> lstOptions = Business_Address_Page.addressSearchHolder.findElements(By.tagName(Business_Address_Page.dropdownList));

        if (!lstOptions.isEmpty()) {
            WebElement getFirstOption = lstOptions.get(0);
            getFirstOption.click();
        }


        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void clickEdit_CloseOnPostalAddressDetails() {

        ((JavascriptExecutor) driver).executeScript(SetupConfig.scrollView, Personal_Details_Page.editPostalAddress);

        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Personal_Details_Page.editPostalAddress.click();
    }
    public static void clickAnyHelpfulLink() {

        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Register_Page.helpfulTip2.click();
    }
    public static void selectDateToOpenAccount(String dateVal) {

        List<WebElement> lstCards = driver.findElements(By.className(Account_Page.lstCard));

        for (WebElement ele : lstCards) {
            ((JavascriptExecutor) driver).executeScript(SetupConfig.scrollView, ele);
        }

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        ((JavascriptExecutor) driver).executeScript(SetupConfig.scrollView, Account_Page.drdOption);

        Account_Page.drdOption.click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        List<WebElement> lstOptions = Account_Page.drdOption.findElements(By.tagName(Account_Page.listSelect));
        for (WebElement ele : lstOptions) {
            if (ele.getText().equalsIgnoreCase(dateVal)) {
                ele.click();
            }
        }
    }
    public static void verifyDeclarationTermsOfCondition() {


        List<WebElement> lstHeaders = Declaration_Page.acceptTerms.findElements(By.tagName(Declaration_Page.aText));

        for (WebElement ele : lstHeaders) {
            if (ele.getText().equalsIgnoreCase("declaration")) {
                Assert.assertTrue(ele.getText().equalsIgnoreCase("declaration"));
                break;
            }
        }
    }
    public static void clickSkipOnOpeningOfBusinessAccounts() {

        ((JavascriptExecutor) driver).executeScript(SetupConfig.scrollView, Account_Page.btnSkip);

        Account_Page.btnSkip.click();
    }
    public static void verifyPaymentSection() {

        Assert.assertTrue(Payment.validationText.getText().equalsIgnoreCase("Make your payment"));
    }
    public static void verifyProducts() {

        Assert.assertTrue(Payment.lblVerify.getText().equalsIgnoreCase("CIPC business registration"));
    }
    public static void clickNextToPayLaterOption() {

        ((JavascriptExecutor) driver).executeScript(SetupConfig.scrollView, Payment.btnNext);

        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Payment.btnNext.click();
    }
    public static void clickPayNow() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement paymentForm = driver.findElement(By.className("account-details"));

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", paymentForm);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement btnNext = driver.findElement(By.tagName("button"));

        btnNext.click();
    }
    public static void verifyGetInTouchSection() {

        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(KeepInTouch_Page.assertText.getText().equalsIgnoreCase("Keep In touch"));
    }
    public static void clickNextOnDeclaration() {

        Declaration_Page.btnNextOnDeclaration.click();
    }
    public static void selectPayNowOption() {

        ((JavascriptExecutor) driver).executeScript(SetupConfig.scrollView, Payment.btnPayNow);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Payment.btnPayNow.click();
    }
    public static void clickNextOnPaymentScreen() {

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement btnNext = driver.findElement(By.xpath("//section/div[3]/button"));
        ((JavascriptExecutor) driver).executeScript(SetupConfig.scrollView, btnNext);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        btnNext.click();
    }
    public static void selectDeclarationOptions() {

        Declaration_Page.checkBoxShareHolders.click();

        Declaration_Page.checkSoleBusiness.click();

        Declaration_Page.checkTermsAndConditions.click();


        ((JavascriptExecutor) driver).executeScript(SetupConfig.scrollView, Declaration_Page.checkAccurateInfo);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Declaration_Page.checkAccurateInfo.click();
    }
    public static void selectDirectorOrShareholder() {

        ((JavascriptExecutor) driver).executeScript(SetupConfig.scrollView, Director_Type_Page.hyperLinkForSingleDiirector);
        Director_Type_Page.hyperLinkForSingleDiirector.click();
    }
    public static void selectYesOnBEECertificate(String choice){

        if(choice.equalsIgnoreCase(choice)){

            ((JavascriptExecutor) driver).executeScript(SetupConfig.scrollView, Register_Page.btnNext);

            try {
                Thread.sleep(3500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Register_Page.btnYes.click();
        }else{

            Register_Page.btnNo.click();
        }
    }
    public static Boolean complete_Application(){

        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        boolean the_End = false;

        if(YourDone_Page.feedback.isDisplayed()){

            the_End = true;
        }
        return the_End;
    }

    public static void validateEnteredNames(String names[],String msgAssert){

        enterCompanyName(names);

        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void validateHelpfulTips(){

        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(Register_Page.txtHelpfulTip2.getText().equalsIgnoreCase("Use your name to give an idea of what your business does, " +
                "but keep it simple. Shorter is usually better. Make sure it’s easy to spell and pronounce."));
    }
    public static void clickNextOnDirectorDetails(){

        ((JavascriptExecutor) driver).executeScript(SetupConfig.scrollView, Personal_Details_Page.btnNext1);
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Personal_Details_Page.btnNext1.click();
    }
}
