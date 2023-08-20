package platforms.ui.mobile.android.StepDefinitions.Ghost_COD;

import cucumber.api.java.en.And;
import platforms.ui.mobile.android.AndroidFlowModel.Ghost_OverdraftLimitIncrease_NavigateToOfferScreen_Flow;
import utils.DriverFactory;

public class AndroidGhost_NavigateToOfferScreenSteps extends DriverFactory {

    Ghost_OverdraftLimitIncrease_NavigateToOfferScreen_Flow ODLI_Flow = new Ghost_OverdraftLimitIncrease_NavigateToOfferScreen_Flow();




    @And("^client navigates to Campaign screen$")
    public void clientNavigatesToCampaignScreen() {
        //Navigate to offer
        ODLI_Flow.clickPulsatingIcon();
        ODLI_Flow.selectOverdraftOffer();

    }






}
