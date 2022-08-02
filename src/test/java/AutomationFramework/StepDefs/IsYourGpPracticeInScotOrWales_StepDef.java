package AutomationFramework.StepDefs;

//import AutomationFramework.Managers.TestManager;
import AutomationFramework.Managers.TestManager;
import AutomationFramework.Page.IsYourGpPracticeInScotOrWales_Page;
import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Assertions;

public class IsYourGpPracticeInScotOrWales_StepDef {
    IsYourGpPracticeInScotOrWales_Page isYourGpPracticeInScotOrWales_Page;
    public IsYourGpPracticeInScotOrWales_StepDef(TestManager pTestManager){
        this.isYourGpPracticeInScotOrWales_Page = pTestManager.pageManager.getisYourGpPracticeInScotOrWalesPage();
    }
    @Then("I am displayed the is your gp in scotland or wales screen")
    public void I_am_displayed_the_is_your_gp_in_sctoland_or_wales_screen(){
        Assertions.assertEquals("Is your GP practice in Scotland or Wales? - Check what help you could get to pay for NHS costs - NHSBSA",this.isYourGpPracticeInScotOrWales_Page.driver.getTitle());
    }

}
