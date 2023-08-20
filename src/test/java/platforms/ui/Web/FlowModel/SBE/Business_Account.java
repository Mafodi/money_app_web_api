package platforms.ui.Web.FlowModel.SBE;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import platforms.ui.Web.Pages.Small_Business_Enablement.bussinessAccount.*;
import platforms.ui.Web.Pages.Small_Business_Enablement.cipc.Account_Page;
import platforms.ui.Web.Pages.Small_Business_Enablement.cipc.Landing_Page;
import platforms.ui.Web.Pages.Small_Business_Enablement.cipc.Payment;
import platforms.ui.Web.Pages.Small_Business_Enablement.cipc.Register_Page;
import platforms.ui.Web.StepDefinitions.Small_Business_Enablement.reusable.SetupConfig;
import utils.Utils;
import java.util.List;
import java.util.concurrent.TimeUnit;
import static org.junit.Assert.assertTrue;


public class Business_Account extends Utils {


    public Authenticate_Page authPage;
    public Business_Address_Page busPage;
    public Business_Details_Page busDetails;
    public Business_Type_Page busType;
    public BusinessAccount_Page busAcc;
    public Compare_Page comparePage;
    public Configure_Pages configPage;
    public Director_Type_Page directorType;
    public KeepInTouch_Page keepInTouchPage;
    public Login_Page loginPage;
    public Personal_Details_Page personalDetailsPage;
    public Prepare_Page preparePage;
    public YourDone_Page yourDonePage;
    public Declaration_Page declarePage;
    public Landing_Page landingPage;
    public Register_Page registerPage;
    public Account_Page accountPage;
    public Payment paymentPage;
    public Business_Registration businessRegistration;
    static WebDriverWait wait;


    public Business_Account() {

        driver = setupWebDriver("chrome");

        authPage = PageFactory.initElements(driver, Authenticate_Page.class);
        busPage = PageFactory.initElements(driver, Business_Address_Page.class);
        busDetails = PageFactory.initElements(driver, Business_Details_Page.class);
        busType = PageFactory.initElements(driver, Business_Type_Page.class);
        comparePage = PageFactory.initElements(driver, Compare_Page.class);
        configPage = PageFactory.initElements(driver, Configure_Pages.class);
        directorType = PageFactory.initElements(driver, Director_Type_Page.class);
        keepInTouchPage = PageFactory.initElements(driver, KeepInTouch_Page.class);
        busAcc = PageFactory.initElements(driver, BusinessAccount_Page.class);
        personalDetailsPage = PageFactory.initElements(driver, Personal_Details_Page.class);
        preparePage = PageFactory.initElements(driver, Prepare_Page.class);
        yourDonePage = PageFactory.initElements(driver, YourDone_Page.class);
        declarePage = PageFactory.initElements(driver, Declaration_Page.class);
        loginPage = PageFactory.initElements(driver, Login_Page.class);
        landingPage = PageFactory.initElements(driver, Landing_Page.class);
        registerPage = PageFactory.initElements(driver, Register_Page.class);
        accountPage = PageFactory.initElements(driver, Account_Page.class);
        paymentPage = PageFactory.initElements(driver, Payment.class);
        businessRegistration = new Business_Registration(driver);
        wait = new WebDriverWait(driver, 30);
    }

    public static void driverInitializer(String url) {

        driver.get(url);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    public static void closeDriver() {

        driver.close();
    }

    public static void UserOnBusinessAccountPage() {

        Assert.assertEquals("ACCOUNTS", (BusinessAccount_Page.txtBusinessAccount).getText());
    }

    public static void compareAccounts() {

        BusinessAccount_Page.btnCompareAccs.click();
    }

    public static void verifyAndCompareAccounts() {

        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String businessBundleOnePrice = Compare_Page.businessBundleOnePrice.getText();
        Assert.assertEquals("R259", businessBundleOnePrice);

        String businessBundleTwoPrice = Compare_Page.businessBundleTwoPrice.getText();
        Assert.assertEquals("R420", businessBundleTwoPrice);

        String payAsYouUse = Compare_Page.payASYouUsePrice.getText();
        Assert.assertEquals("R60", payAsYouUse);


    }

    public static void selectBusinessPayAsYouUse() {

        Actions action = new Actions(driver);
        action.moveToElement(BusinessAccount_Page.optPayAsYouUse).build().perform();
        BusinessAccount_Page.btnSelect1.click();
    }

    public static void selectBusinessBundle60() {

        ((JavascriptExecutor) driver).executeScript(SetupConfig.scrollView, BusinessAccount_Page.txtToScroll);

        Actions action = new Actions(driver);
        action.moveToElement(BusinessAccount_Page.optBusinessBundle60).build().perform();
        BusinessAccount_Page.btnSelect2.click();
    }

    public static void selectBusinessBundle35() {


        ((JavascriptExecutor) driver).executeScript(SetupConfig.scrollView, BusinessAccount_Page.txtToScroll);

        Actions action = new Actions(driver);
        action.moveToElement(BusinessAccount_Page.optBusinessBundle35).build().perform();
        BusinessAccount_Page.btnSelect3.click();
    }

    public static void selectDirectorOrShareholder() {

        Director_Type_Page.btnSelectSingle.click();
    }

    public static void selectAgreeTermsAndConditions() {

        ((JavascriptExecutor) driver).executeScript(Prepare_Page.checkbox1);
        ((JavascriptExecutor) driver).executeScript(Prepare_Page.checkbox2);
    }

    public static void clickNextBusinessBundle() {

        WebElement element = Prepare_Page.btnNext;
        Actions actions = new Actions(driver);
        actions.moveToElement(element).click().perform();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void clickYesOnNedbankClientQuestion() {

        Authenticate_Page.selectYes.click();
    }

    public static void enterUsername(String username) {

        Login_Page.txtUsername.clear();
        Login_Page.txtUsername.sendKeys(username);
    }

    public static void enterPassword(String password) {

        Login_Page.txtPassword.clear();
        Login_Page.txtPassword.sendKeys(password);
    }

    public static void clickLogin() {


        ((JavascriptExecutor) driver).executeScript(SetupConfig.scrollView, Login_Page.btnLogin);
        wait.until(ExpectedConditions.elementToBeClickable(Login_Page.btnLogin));
        Login_Page.btnLogin.click();

    }

    public static void selectYesDirectorshipDetails(String answer) {

        ((JavascriptExecutor) driver).executeScript(SetupConfig.scrollView, Personal_Details_Page.btnNext);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if(answer.equalsIgnoreCase("Yes")){

            Personal_Details_Page.btnYes.click();
        }else{

            Personal_Details_Page.btnNo.click();
        }

    }

    public static void clickNextOnPersonalDetails() {

        Personal_Details_Page.btnNext.click();

    }

    public static void selectCompanyOption(String opt) {

        WebElement element1 = Business_Type_Page.businessType;
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//sbe-select/div")));

        if (!(element1.isDisplayed())) {

            try {
                Thread.sleep(7000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        element1.click();

        if (opt.equalsIgnoreCase("Sole Proprietor")) {

            Business_Type_Page.soleProp.click();
        } else if (opt.equalsIgnoreCase("Close Corporation")) {

            Business_Type_Page.closeCorp.click();
        } else {

            Business_Type_Page.privateComp.click();
        }
    }

    public static void setBusinessRegistrationNumber(String regNumber) {

        Business_Type_Page.regNumber.clear();
        Business_Type_Page.regNumber.sendKeys(regNumber);

    }

    public static void clickNextCompanyDetails() {

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        ((JavascriptExecutor) driver).executeScript(SetupConfig.scrollView, Business_Type_Page.btnNextCompanyDetails);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Business_Type_Page.btnNextCompanyDetails.click();

    }

    public static void setDateOfIncorporation(String dateOfIncorporation) {
        /*WebElement txtDate = Business_Type_Page.dtpDateofIncorporation.fi(By.tagName("input"));
        ((JavascriptExecutor)tempWebDr).executeScript("arguments[0].removeAttribute('readonly');", txtDate);
        txtDate.sendKeys(dateOfIncorporation);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ((JavascriptExecutor)tempWebDr).executeScript(SetupConfig.scrollView, dtpDateofIncorporation);*/
    }

    public static void setBusinessTelephone(String telephone) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {

            Business_Details_Page.telNumber.sendKeys(telephone);
        } catch (NoSuchElementException e) {

            Register_Page.btnSubmit.click();

            try {
                Thread.sleep(5000);
            } catch (InterruptedException a) {
                e.printStackTrace();
            }
            Business_Details_Page.telNumber.sendKeys(telephone);
        }

    }

    public static void selectFinancialYearEnd(String financialYearEnd) {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement dropdown = Business_Details_Page.financialEnd;

        //This will scroll the page till the element is found
        js.executeScript(SetupConfig.scrollView, dropdown);
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        dropdown.click(); // assuming you have to click the "dropdown" to open it


        List<WebElement> options = dropdown.findElements(By.tagName(Business_Details_Page.listOfMonths));
        for (WebElement option : options) {
            if (option.getText().equalsIgnoreCase(financialYearEnd)) {
                option.click();
            }
        }
    }

    public static void selectEconomicSector(String economicSector) {
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement dropdown = Business_Details_Page.economicSector;


        dropdown.click();
        List<WebElement> options = dropdown.findElements(By.xpath(Business_Details_Page.listOfSectors));
        for (WebElement option : options) {
            if (option.getText().equalsIgnoreCase(economicSector)) {
                option.click();
            }
        }

    }

    public static void selectExpectedRevenue(String annualTurnover) {

        WebElement dropdown = Business_Details_Page.turnOver;
        //dropdown.click(); // assuming you have to the "dropdown" to open it

        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        dropdown.click();
        List<WebElement> options = dropdown.findElements(By.tagName(Business_Details_Page.listOfExpRev));
        for (WebElement option : options) {
            if (option.getText().equalsIgnoreCase(annualTurnover)) {
                option.click();
            }
        }
    }

    public static void setIncomeSource(String incomeSource) {

        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ((JavascriptExecutor) driver).executeScript(SetupConfig.scrollView, Business_Details_Page.adminType);

        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement dropdown = Business_Details_Page.incomeOrigin;
        dropdown.click();

        List<WebElement> options = dropdown.findElements(By.tagName(Business_Details_Page.listOfRevOrigin));
        for (WebElement option : options) {
            if (option.getText().equalsIgnoreCase(incomeSource)) {

                try {
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                option.click();
            }
        }
    }

    public static void businessDescription(String description) {

        Business_Details_Page.tellUsAboutYourBusiness.clear();
        Business_Details_Page.tellUsAboutYourBusiness.sendKeys(description);
    }

    public static void administrationType(String admType) {

        WebElement dropdown = Business_Details_Page.adminType;
        ((JavascriptExecutor) driver).executeScript(SetupConfig.scrollView, Business_Details_Page.btnNext);

        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        dropdown.click();

        List<WebElement> options = dropdown.findElements(By.tagName(Business_Details_Page.listOfAdminType));
        for (WebElement option : options) {
            if (option.getText().equalsIgnoreCase(admType)) {

                try {
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                option.click();
            }
        }
    }

    public static void selectCountriesOfOperation(String [] countries){

        WebElement dropdown = Business_Details_Page.country;

        dropdown.click();
        List<WebElement> options = dropdown.findElements(By.tagName(Business_Details_Page.listOfCountries));
        for (int i = 0; i < countries.length; i++) {

            for (WebElement option : options) {
                if (option.getText().equalsIgnoreCase(countries[i])) {
                    try {
                        Thread.sleep(1500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    option.click();
                }
            }
        }

    }

    public static void selectForTaxOblications(String taxObligation) {

        if (taxObligation.equalsIgnoreCase("Yes")) {

            Personal_Details_Page.yesTaxObligation.click();

        } else {

            Personal_Details_Page.noTaxObligastion.click();
        }

        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void clickNextOnBusinessDetailsSection() {


        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Business_Details_Page.btnNext.click();
    }

    public static void selectSameBusinessTradingAddress() {

        Business_Address_Page.yesPhysicalAddress.click();

    }

    public static void selectSameBusinessAddressAsPostal() {

        ((JavascriptExecutor) driver).executeScript(SetupConfig.scrollView, Business_Address_Page.btnNext);
        try {
            Thread.sleep(3500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Business_Address_Page.yesPostalAddress.click();

    }

    public static void clickNextOnBusinessAddressSection() {
        //base.driver.findElement(By.xpath("//div/button")).click();
        WebElement element = Business_Address_Page.btnNext;
        Actions actions = new Actions(driver);
        actions.moveToElement(element).click().perform();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Business_Address_Page.btnNext.click();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement Next = Business_Address_Page.btnNext;

        //This will scroll the page till the element is found
        js.executeScript(SetupConfig.scrollView, Next);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void clickNextOnPersonInChargeOfBusiness() {

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Assert.assertEquals("Person in charge of banking relationships", Configure_Pages.textSetUp.getText());

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ((JavascriptExecutor) driver).executeScript(SetupConfig.scrollView, Configure_Pages.btnNext);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Configure_Pages.btnNext.click();
    }

    public static void clickCustomizeNext() {

        Configure_Pages.btnNextSetting.click();
    }

    public static void setMaximumCardLimits() {

        WebElement slider = Configure_Pages.setLimtSlider;
        int width = slider.getSize().getWidth();
        Actions move = new Actions(driver);
        org.openqa.selenium.interactions.Action action = move.dragAndDropBy(slider, ((width)), 0).build();
        action.perform();
    }

    public static void setCardLimits() {

        WebElement slider = Configure_Pages.setLimtSlider;
        int width = slider.getSize().getWidth();

        Actions move = new Actions(driver);
        move.dragAndDropBy(slider, ((width * 25) / 100), 0).build().perform();
    }

    public static void selectOptionalExtras() {

        WebElement eleToScroll = Configure_Pages.optionalExtras;
        //((JavascriptExecutor) driver).executeScript(SetupConfig.scrollView, eleToScroll);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        List<WebElement> lstOptions = driver.findElements(By.className(Configure_Pages.checkOptionalExtras));

        for (WebElement option : lstOptions) {
            option.click();
        }

        WebElement eleToScroll_Button = Configure_Pages.btnNextOptional;
        ((JavascriptExecutor) driver).executeScript(SetupConfig.scrollView, eleToScroll_Button);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void setMinimumCardLimit(String minValue) {

        String textMin = Configure_Pages.minValue.getText();

        System.out.println("The Value Is:- " + textMin);
        Assert.assertEquals(minValue, textMin);
    }

    public static void selectOptionForBusinessCreditCard(String cardOption) {

        WebElement btn = Configure_Pages.btnNextSetting;
        //((JavascriptExecutor) driver).executeScript(SetupConfig.scrollView, btn);

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (cardOption.equalsIgnoreCase("yes")) {
            Configure_Pages.yesCreditCard.click();
        } else {

            Configure_Pages.noCreditCard.click();
        }
    }

    public static void verifyCardDeliverySection() {

        try {
            Thread.sleep(3500);
        } catch (InterruptedException e) {

        }
        Assert.assertEquals("Your card", Configure_Pages.txtCard.getText());

    }

    public static void selectCollectionOption() {

        Configure_Pages.collection.click();
    }

    public static void selectLocationOfCollection(String branch) {

        WebElement txtSearchBranch = Configure_Pages.txtSearchBranch;
        txtSearchBranch.click();
        txtSearchBranch.sendKeys(branch);

        WebElement ele = Configure_Pages.preferredBranch;
        List<WebElement> lstResults = driver.findElements(By.tagName(Configure_Pages.branchList));

        for (WebElement opt : lstResults) {
            if (opt.getText().equalsIgnoreCase(branch)) {
                opt.click();
            }
        }

        ((JavascriptExecutor) driver).executeScript(SetupConfig.scrollView, ele);
    }

    public static void selectOptionForPersonalBanker(String option, String branch) {

        WebElement optionYes = Configure_Pages.btnSameAsCollection;
        WebElement optionNo = Configure_Pages.btnNotSameAsCollection;

        if (option.equalsIgnoreCase("yes")) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            optionYes.click();
        } else if (option.equalsIgnoreCase("no")) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            optionNo.isEnabled();
            optionNo.click();
            WebElement txtPersonalBanker = Configure_Pages.myPersonalBanker;

            WebElement txtBankerLocation = Configure_Pages.txtMyPersonalBankerLocation;
            ((JavascriptExecutor) driver).executeScript(SetupConfig.scrollView, txtBankerLocation);
            txtBankerLocation.click();
            txtBankerLocation.sendKeys(branch);

            List<WebElement> lstBankers = driver.findElements(By.tagName(Configure_Pages.branchList));

            for (WebElement ele : lstBankers) {
                if (ele.getText().equalsIgnoreCase(branch)) {
                    ele.click();
                }
            }

            ((JavascriptExecutor) driver).executeScript(SetupConfig.scrollView, optionYes);
        }

    }

    public static void clickNextOnCardDelivery() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Configure_Pages.btnNextDelivery.click();
    }

    public static void verifyDeclarationTermsOfCondition() {

        WebElement frmTerms = Declaration_Page.acceptTerms;
        List<WebElement> lstHeaders = driver.findElements(By.tagName(Declaration_Page.assertText));

        for (WebElement ele : lstHeaders) {
            if (ele.getText().equalsIgnoreCase("declaration")) {
                assertTrue(ele.getText().equalsIgnoreCase("declaration"));
                break;
            }
        }
    }

    public static void selectDeclarationOptions() {

        WebElement optShareholding = Declaration_Page.checkBoxShareHolders;
        optShareholding.click();

        WebElement optSoleBusiness = Declaration_Page.checkSoleBusiness;
        optSoleBusiness.click();

        WebElement optTermsConditions = Declaration_Page.checkTermsAndConditions;
        optTermsConditions.click();

        WebElement optInfoAccuracy = Declaration_Page.checkAccurateInfo;

        ((JavascriptExecutor) driver).executeScript(SetupConfig.scrollView, optInfoAccuracy);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        optInfoAccuracy.click();
    }

    public static void clickNextOnDeclaration() {

        WebElement btnNext = Declaration_Page.btnNextOnDeclaration;
        btnNext.click();
    }

    public static void clickNextOnGetInTouch() {

        WebElement btnNext = KeepInTouch_Page.btnNextOnKeepInTouch;
        ((JavascriptExecutor) driver).executeScript(SetupConfig.scrollView, btnNext);
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        btnNext.click();
    }

    public static void verifySuccessPageBusinessAccounts() {

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement lblHeader = YourDone_Page.assertionText;
        assertTrue(lblHeader.getText().equalsIgnoreCase("You're done"));
    }

    public static void clickNedbankSmallBusinessCreditCard() {
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        List<WebElement> lstCreditCardOptions = driver.findElements(By.className("select-button"));

        WebElement firstButton = lstCreditCardOptions.get(0);
        ((JavascriptExecutor) driver).executeScript(SetupConfig.scrollView, firstButton);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (WebElement ele : lstCreditCardOptions) {
            if (ele.getText().equalsIgnoreCase("Check Online now")) {

                try {
                    Thread.sleep(2500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                ele.click();
                break;
            }
        }
    }

    public static void selectGiveConsent() {
        WebElement chkConsent = driver.findElement(By.className("applicant-prepare-content"));
        ((JavascriptExecutor) driver).executeScript(SetupConfig.scrollView, chkConsent);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        chkConsent.click();
    }

    public static void clickNextOnCreditCheckConsent() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement btnNext = driver.findElement(By.xpath("//div[6]/div[1]/button"));
        btnNext.click();
    }

    public static void enterMonthlyGrossNetIncome(String gross, String netIncome) {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement txtGross = Configure_Pages.grossIncome;
        WebElement txtNet = Configure_Pages.netIncome;

        txtGross.sendKeys(gross);
        txtNet.sendKeys(netIncome);
    }

    public static void enterMonthlyExpensesDebt(String expenses, String debt) {

        WebElement txtExpenses = Configure_Pages.livingExpenses;
        txtExpenses.sendKeys(expenses);

        ((JavascriptExecutor) driver).executeScript(SetupConfig.scrollView, txtExpenses);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement txtDebt = Configure_Pages.repayment;
        txtDebt.sendKeys(debt);
    }

    public static void clickNextOnCreditQualification() {

        WebElement btnNext = Configure_Pages.btnNextQualify;
        btnNext.click();
    }

    public static void verifyCompanyYEFromCIPC() {

        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        String date = driver.findElement(By.xpath(Business_Details_Page.dateOfIncorp)).getAttribute("value");


        System.out.println("The Date IS:- " + date);
        Assert.assertEquals("23 October 2007", date);
    }

    public static void verifyCloseCorpYEFromCIPC() {

        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        String date = driver.findElement(By.xpath(Business_Details_Page.dateOfIncorp)).getAttribute("value");


        System.out.println("The Date IS:- " + date);
        Assert.assertEquals("23 October 2007", date);
    }

    public static void noOptionOfUsingPersonalNameAsBusiness() {

        Business_Type_Page.noTradingName.click();
    }

    public static void setUpBusinessAccount() {

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String card = Configure_Pages.assertionTextH.getText();
        Assert.assertEquals("Setting up your business account", card);
    }

    public static void selectDeliveryOption() {

        Configure_Pages.delivery.click();
    }

    public static void productDelivery(String str) {

        if (str.equalsIgnoreCase("Business")) {

            Configure_Pages.deliverBusinessAddr.click();

        } else if (str.equalsIgnoreCase("Residential")) {
            Configure_Pages.deliverResidentialAddr.click();
        } else {

        }

    }

    public static void selectLocationOfPrivateBanker(String bankerLocation) {


        WebElement txtPersonalBanker = Configure_Pages.txtSearchBranch;

        ((JavascriptExecutor) driver).executeScript(SetupConfig.scrollView, Configure_Pages.btnNextDelivery);
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        txtPersonalBanker.click();
        txtPersonalBanker.sendKeys(bankerLocation);

        List<WebElement> lstBankers = driver.findElements(By.tagName(Configure_Pages.branchList));

        for (WebElement ele : lstBankers) {
            if (ele.getText().equalsIgnoreCase(bankerLocation)) {
                ele.click();
            }
        }

        ((JavascriptExecutor) driver).executeScript(SetupConfig.scrollView, txtPersonalBanker);
    }

    public static void configureScreen() {

        try {
            Thread.sleep(3500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertEquals("Setting up your business account", Configure_Pages.textSetUp.getText());

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void userSelectYesOrNoForAddingATradeName(String opt) {

        if (opt.equalsIgnoreCase("yes")) {

            Business_Type_Page.yesTradingName.click();
        } else {

            Business_Type_Page.noTradingName.click();
        }
    }

    public static void enterTradingName(String name) {

        Business_Type_Page.txtTradingName.sendKeys(name);
    }

    public static void feedbackPopup() {

        try {
            Thread.sleep(30000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if (YourDone_Page.feedback.isDisplayed()) {

            YourDone_Page.btnNoThanks.click();
        }
    }

    public static void enterIDNumber(String id) {

        Authenticate_Page.txtIDnumber.clear();
        Authenticate_Page.txtIDnumber.sendKeys(id);

    }

    public static void clickNextAfterIDNumber() {

        Authenticate_Page.btnNext.click();
    }

}


