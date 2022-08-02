package AutomationFramework.StepDefs;

import AutomationFramework.Managers.TestManager;
import AutomationFramework.Page.NorthernIslandKickout_Page;
import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class NorthernIslandKickout_StepDef {
    WebDriver driver;
    NorthernIslandKickout_Page northernIslandKickout_page;
    public NorthernIslandKickout_StepDef(TestManager pTestManager){
        this.northernIslandKickout_page = pTestManager.pageManager.getNorthernIslandKickout_page();
    }
    @Then("I am displayed the northern island kickout page")
    public void I_am_displayed_the_northern_island_kickout_page(){
        Assertions.assertEquals("You cannot use this service because you live in Northern Ireland - Check what help you could get to pay for NHS costs - NHSBSA",this.northernIslandKickout_page.driver.getTitle());
    }
}
