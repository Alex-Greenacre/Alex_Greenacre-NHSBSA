package AutomationFramework.Managers;

import AutomationFramework.StepDefs.IsYourGpPracticeInScotOrWales_StepDef;
import AutomationFramework.StepDefs.NorthernIslandKickout_StepDef;
import AutomationFramework.StepDefs.Start_StepDefs;
import AutomationFramework.StepDefs.WhichCountryDoYouLiveIn_StepDef;

public class StepDefManager {
    TestManager testManager;
    StepDefManager(TestManager pTestManager){
        this.testManager = pTestManager;
    }
    Start_StepDefs start_stepDefs;
    WhichCountryDoYouLiveIn_StepDef whichCountryDoYouLiveIn_stepDef;
    IsYourGpPracticeInScotOrWales_StepDef isYourGpPracticeInScotOrWales_stepDef;
    NorthernIslandKickout_StepDef northernIslandKickout_stepDef;
    //Start page
    //if no start page exsit's then a new one is created
    public Start_StepDefs getStart_stepDefs() {
        if(this.start_stepDefs == null){
            this.start_stepDefs = new Start_StepDefs(this.testManager);
        }
        return this.start_stepDefs;
    }
    public WhichCountryDoYouLiveIn_StepDef getWhichCountryDoYouLiveIn_stepDef(){
        if (this.whichCountryDoYouLiveIn_stepDef == null){
            this.whichCountryDoYouLiveIn_stepDef = new WhichCountryDoYouLiveIn_StepDef(this.testManager);
        }
        return this.whichCountryDoYouLiveIn_stepDef;
    }
    public IsYourGpPracticeInScotOrWales_StepDef isYourGpPracticeInScotOrWales_stepDef(){
        if (this.isYourGpPracticeInScotOrWales_stepDef==null){
            this.isYourGpPracticeInScotOrWales_stepDef = new IsYourGpPracticeInScotOrWales_StepDef(this.testManager);
        }
        return this.isYourGpPracticeInScotOrWales_stepDef;
    }
    public NorthernIslandKickout_StepDef northernIslandKickout_stepDef(){
        if (this.northernIslandKickout_stepDef==null){
            this.northernIslandKickout_stepDef = new NorthernIslandKickout_StepDef(this.testManager);
        }
        return this.northernIslandKickout_stepDef;
    }


}
