package platforms.ui.mobile.android.StepDefinitions;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.ui.WebDriverWait;
import platforms.ui.mobile.android.AndroidCommonMethods;
import platforms.ui.mobile.android.DE_AndroidDataFactory;
import utils.CommonFunctions;
import utils.DriverFactory;


public class DE_PersonaEight extends DriverFactory {

    WebDriverWait wait = new WebDriverWait(getAndroidDriver(), 60);
    private CommonFunctions common = new CommonFunctions();
    private AndroidCommonMethods basepage = new AndroidCommonMethods();
    public DE_AndroidDataFactory dataFactory = new DE_AndroidDataFactory();
    private static Logger log = Logger.getLogger(DE_Create_NedID.class);


}
