package AutomationFramework.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class IsYourGpPracticeInScotOrWales_Page {
    public WebDriver driver;


    public IsYourGpPracticeInScotOrWales_Page(WebDriver pDriver){
        this.driver = pDriver;
        //Allows for FindBy to be used, look for other area to add this
        PageFactory.initElements(this.driver,this);
    }
}
