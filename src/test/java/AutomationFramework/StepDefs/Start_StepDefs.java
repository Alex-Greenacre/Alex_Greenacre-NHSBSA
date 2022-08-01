package AutomationFramework.StepDefs;

import AutomationFramework.Managers.TestManager;
import AutomationFramework.Page.Start_Page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class Start_StepDefs {
    public WebDriver driver;
    public Start_Page start_page;
    public Start_StepDefs(TestManager pTestManager){
        this.start_page = pTestManager.pageManager.getStartPage();
    }
    //public Start_StepDefs(){}

    @Given("I navigate to the start screen")
    public void I_navigate_to_the_start_screen() {
        // Write code here that turns the phrase above into concrete actions
        Assertions.assertEquals("Check what help you could get to pay for NHS costs - NHSBSA",this.start_page.driver.getTitle());
    }
    @And("I click the start button")
    public void I_click_the_start_button(){
        this.start_page.clickStartButton();
    }


}
