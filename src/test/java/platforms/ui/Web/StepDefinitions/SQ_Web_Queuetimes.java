package platforms.ui.Web.StepDefinitions;

import cucumber.api.java.en.Then;
import org.apache.log4j.Logger;
import platforms.ui.Web.FlowModel.SQ_BranchLocator_Flow;
import utils.Utils;

public class SQ_Web_Queuetimes extends Utils {

    public static Logger log = Logger.getLogger(SQ_Web_Queuetimes.class);
    SQ_BranchLocator_Flow branchlocatorflow = new SQ_BranchLocator_Flow();

    @Then("^Verify all the fields related to the Qmatic waiting times$")
    public void verify_all_the_fields_related_to_the_Qmatic_waiting_times(){
        branchlocatorflow.validating_Qmatic_Nonqmatic_Branchinfopage_fields();
    }
}
