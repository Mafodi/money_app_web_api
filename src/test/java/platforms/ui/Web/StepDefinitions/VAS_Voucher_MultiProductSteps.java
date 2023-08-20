package platforms.ui.Web.StepDefinitions;


import cucumber.api.java.en.And;
import org.apache.log4j.Logger;

import org.openqa.selenium.support.PageFactory;

import platforms.ui.Web.FlowModel.Vouchers_Flow;

import utils.Utils;


public class VAS_Voucher_MultiProductSteps extends Utils {
    private static Logger log = Logger.getLogger(VAS_Voucher_MultiProductSteps.class);
    public Vouchers_Flow voucher = PageFactory.initElements(driver, Vouchers_Flow.class);


    @And("^User want to select Multi product Voucher$")
    public void userWantToSelectMultiProductVoucher() {

        voucher.Select_MultiProduct_Voucher();

    }
}
