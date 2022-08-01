package AutomationFramework.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class WhichCountryDoYouLiveIn_Page {
    public WhichCountryDoYouLiveIn_Page(WebDriver pDriver){
        this.driver = pDriver;
        PageFactory.initElements(this.driver,this);
    }
    public WebDriver driver;


    @FindBy(how= How.ID,using="radio-england")
    WebElement rad_england;


}
