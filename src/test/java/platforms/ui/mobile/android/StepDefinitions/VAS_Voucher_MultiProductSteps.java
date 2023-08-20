package platforms.ui.mobile.android.StepDefinitions;

import cucumber.api.java.en.And;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import platforms.ui.mobile.android.AndroidFlowModel.Voucher_Flow;
import platforms.ui.mobile.android.AndroidPageObjects.VAS_Voucher_AndroidObjects;
import platforms.ui.mobile.android.VAS_AndroidDataFactory;
import utils.DriverFactory;

import java.util.concurrent.TimeUnit;

public class VAS_Voucher_MultiProductSteps extends DriverFactory {
    private static Logger log = Logger.getLogger(VAS_Voucher_MultiProductSteps.class);
    WebDriverWait wait = new WebDriverWait(getAndroidDriver(),40);
    Voucher_Flow voucher_flow = new Voucher_Flow();


    @And("^Android user want to select Multi product Voucher$")
    public void androidUserWantToSelectMultiProductVoucher() {
//        String Category = driver.findElementsById(VAS_Voucher_AndroidObjects.CategoryLevel1ProName).get(Integer.parseInt(VAS_AndroidDataFactory.MultiProductCategory)).getAttribute("text");
        driver.findElementByXPath(VAS_Voucher_AndroidObjects.HollywoodBetsVoucher).click();

    }

    @And("^Android user want to select an Own Amount product$")
    public void androidUserWantToSelectAnOwnAmountProduct() {
        driver.findElements(By.id(VAS_Voucher_AndroidObjects.OwnAmountVoucher)).get(0).click();

    }

    @And("^Android User want to select a Multi voucher fixed product$")
    public void androidUserWantToSelectAMultiVoucherFixedProduct() {
        voucher_flow.Select_MultiVoucher_FixedProduct();
    }

    @And("^Android User want to select a Multi voucher OwnAmount product$")
    public void androidUserWantToSelectAMultiVoucherOwnAmountProduct() {
        voucher_flow.Select_MultiVoucher_OwnAmountProduct();
    }
}
