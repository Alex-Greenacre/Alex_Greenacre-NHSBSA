package AutomationFramework.Managers;

import AutomationFramework.Page.Start_Page;
import AutomationFramework.Page.WhichCountryDoYouLiveIn_Page;
import AutomationFramework.StepDefs.WhichCountryDoYouLiveIn_StepDef;
import org.openqa.selenium.WebDriver;
public class PageManager {
    WebDriver driver ;
    public PageManager(WebDriver pDiver){
        this.driver = pDiver;
    }

    Start_Page start_page;
    WhichCountryDoYouLiveIn_Page whichCountryDoYouLiveIn_page;

    //Start Page
    public Start_Page getStartPage(){
        if (start_page==null){
            this.start_page = new Start_Page(this.driver);

        }
        return this.start_page;
    }
    public WhichCountryDoYouLiveIn_Page getWhichCountryDoYouLiveInPage(){
        if(whichCountryDoYouLiveIn_page==null){
            this.whichCountryDoYouLiveIn_page = new WhichCountryDoYouLiveIn_Page(this.driver);
        }
        return this.whichCountryDoYouLiveIn_page;
    }
}
