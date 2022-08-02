package AutomationFramework.Managers;

import AutomationFramework.Page.IsYourGpPracticeInScotOrWales_Page;
import AutomationFramework.Page.NorthernIslandKickout_Page;
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
    IsYourGpPracticeInScotOrWales_Page isYourGpPracticeInScotOrWales_page;
    NorthernIslandKickout_Page northernIslandKickout_page;

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
    public IsYourGpPracticeInScotOrWales_Page getisYourGpPracticeInScotOrWalesPage(){
        if(isYourGpPracticeInScotOrWales_page==null){
            this.isYourGpPracticeInScotOrWales_page = new IsYourGpPracticeInScotOrWales_Page(this.driver);
        }
        return this.isYourGpPracticeInScotOrWales_page;
    }
    public NorthernIslandKickout_Page getNorthernIslandKickout_page(){
        if(northernIslandKickout_page==null){
            this.northernIslandKickout_page = new NorthernIslandKickout_Page(this.driver);
        }
        return this.northernIslandKickout_page;
    }
}
