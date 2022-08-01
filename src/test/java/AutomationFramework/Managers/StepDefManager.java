package AutomationFramework.Managers;

import AutomationFramework.StepDefs.Start_StepDefs;
import AutomationFramework.StepDefs.WhichCountryDoYouLiveIn_StepDef;

public class StepDefManager {
    TestManager testManager;
    StepDefManager(TestManager pTestManager){
        this.testManager = pTestManager;
    }
    Start_StepDefs start_stepDefs;
    WhichCountryDoYouLiveIn_StepDef whichCountryDoYouLiveIn_stepDef;
    //Start page
    //if no start page exsits then a new one is created
    public Start_StepDefs getStart_stepDefs() {
        if(this.start_stepDefs == null){
            this.start_stepDefs = new Start_StepDefs(this.testManager);
        }
        return this.start_stepDefs;
    }
    public WhichCountryDoYouLiveIn_StepDef whichCountryDoYouLiveIn_stepDef(){
        if (this.whichCountryDoYouLiveIn_stepDef == null){
            this.whichCountryDoYouLiveIn_stepDef = new WhichCountryDoYouLiveIn_StepDef(this.testManager);
        }
        return this.whichCountryDoYouLiveIn_stepDef;
    }
}
