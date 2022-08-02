package AutomationFramework.StepDefs;

import AutomationFramework.Managers.TestManager;
import AutomationFramework.Page.Start_Page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class Start_StepDefs {
    public WebDriver driver;
    public Start_Page start_page;
    public Start_StepDefs(TestManager pTestManager){
        this.start_page = pTestManager.pageManager.getStartPage();
    }

    @Given("I navigate to the start screen")
    public void I_navigate_to_the_start_screen() {
        // Write code here that turns the phrase above into concrete actions
        this.start_page.driver.navigate().to("https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/start");
        Assertions.assertEquals("Check what help you could get to pay for NHS costs - NHSBSA",this.start_page.driver.getTitle());
    }
    @Then("I am displayed the start page")
    public void  I_am_on_the_start_page(){
        Assertions.assertEquals("Check what help you could get to pay for NHS costs - NHSBSA",this.start_page.driver.getTitle());
    }
    @And("I click the start button")
    public void I_click_the_start_button(){
        this.start_page.clickStartButton();
    }


}
