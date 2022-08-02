package AutomationFramework.StepDefs;

import AutomationFramework.Managers.TestManager;
import AutomationFramework.Page.WhichCountryDoYouLiveIn_Page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class WhichCountryDoYouLiveIn_StepDef {

    public WhichCountryDoYouLiveIn_Page whichCountryDoYouLiveIn_Page;
    public WhichCountryDoYouLiveIn_StepDef(TestManager pTestManager){
        this.whichCountryDoYouLiveIn_Page = pTestManager.pageManager.getWhichCountryDoYouLiveInPage();
    }
    
    
    
    @Then("I am navigated to what the what is your country page")
    public void i_am_navigated_to_what_the_what_is_your_country_page() {
        Assertions.assertEquals("Which country do you live in? - Check what help you could get to pay for NHS costs - NHSBSA",this.whichCountryDoYouLiveIn_Page.driver.getTitle());
    }
    //Allows values to be inputted from the feature file
    //values are used to click the correct radio button for the scenario
    @And("^I select the country \"([^\"]*)\"")
    public void I_select_the_country_x(String pCountry){
        if (pCountry.equals("England")){
            this.whichCountryDoYouLiveIn_Page.clickRadEngland();
        }
        else if(pCountry.equals("Scotland")){
            this.whichCountryDoYouLiveIn_Page.clickRadScotland();
        }
        else if (pCountry.equals("Wales")) {
            this.whichCountryDoYouLiveIn_Page.clickRadWales();
        }
        else if (pCountry.equals("Northern Island")){
            this.whichCountryDoYouLiveIn_Page.clickRadNire();
        }
    }
    @When("I click next on the what country do you live in page")
    public void I_click_next_on_the_what_country_do_you_live_in_page(){
        this.whichCountryDoYouLiveIn_Page.clickBtnNext();
    }
    @When("I click the back button on the what country do you live page")
    public void I_click_the_back_button_on_the_what_count_do_you_live_page(){
        this.whichCountryDoYouLiveIn_Page.clickBtnBack();
    }
    @Then("I am displayed an error")
    public void I_am_displayed_an_error(){
        Assertions.assertEquals("There is a problem", this.whichCountryDoYouLiveIn_Page.getError());
    }
}
