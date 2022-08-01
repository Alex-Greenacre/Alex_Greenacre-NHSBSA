package AutomationFramework.StepDefs;

import AutomationFramework.Managers.TestManager;
import AutomationFramework.Page.WhichCountryDoYouLiveIn_Page;
import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Assertions;

public class WhichCountryDoYouLiveIn_StepDef {

    public WhichCountryDoYouLiveIn_Page whichCountryDoYouLiveIn_Page;
    public WhichCountryDoYouLiveIn_StepDef(TestManager pTestManager){
        this.whichCountryDoYouLiveIn_Page = pTestManager.pageManager.getWhichCountryDoYouLiveInPage();
    }
    
    
    
    @Then("I am naviagted to what the what is your country page")
    public void i_am_naviagted_to_what_the_what_is_your_country_page() {
        // Write code here that turns the phrase above into concrete actions
        Assertions.assertEquals("Test",this.whichCountryDoYouLiveIn_Page.driver.getTitle());
    }
}
