package platforms.ui.Web.StepDefinitions;


import cucumber.api.java.en.And;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import platforms.ui.Web.FlowModel.Vouchers_Flow;
import platforms.ui.Web.Pages.VAS_Voucher_CategoryLevelPage;
import platforms.ui.Web.VAS_DataFactory;
import utils.Utils;


public class VAS_Voucher_CategoryLevelSteps extends Utils {

    private static Logger log = Logger.getLogger(VAS_Voucher_CategoryLevelSteps.class);
    public Vouchers_Flow voucher = PageFactory.initElements(driver, Vouchers_Flow.class);
    public VAS_Voucher_CategoryLevelPage buyCategoryVoucher = PageFactory.initElements(driver, VAS_Voucher_CategoryLevelPage.class);


    @And("^User want to select Multi Category Voucher$")
    public void userWantToSelectMultiCategoryVoucher() {
     voucher.Select_MultiCategory_Voucher();
    }

    @And("^User should navigate to Category level one$")
    public void userShouldNavigateToCategoryLevelOne() {
       voucher.Navigate_CategoryLevelOne();
    }

    @And("^User want to select category from Category level one$")
    public void userWantToSelectCategoryFromCategoryLevelOne(){
        voucher.Select_Category_CategoryLevelOne();
    }

    @And("^User should navigate to category level two$")
    public void userShouldNavigateToCategoryLevelTwo(){
       voucher.Navigate_CategoryLevelTwo();
    }

    @And("^User want to select category from Category level two$")
    public void userWantToSelectCategoryFromCategoryLevelTwo() {
        voucher.Select_Category_CategoryLevelTwo();
    }

    @And("^User should navigate to Own Amount category level two$")
    public void userShouldNavigateToOwnAmountCategoryLevelTwo()  {
       voucher.Navigate_OwnAmount_CategoryLevelTwo();
    }


    @And("^user want to enter Own Amount$")
    public void userWantToEnterOwnAmount(){

        buyCategoryVoucher.VoucherOwnAmount.sendKeys(VAS_DataFactory.VoucherOwnAmount);
    }

    @And("^User want to update Reference$")
    public void userWantToUpdateReference(){
       voucher.Update_Reference();


    }
}
