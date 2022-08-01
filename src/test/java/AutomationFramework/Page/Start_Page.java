package AutomationFramework.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.*;

public class Start_Page {

    public Start_Page(WebDriver pDriver){
        this.driver = pDriver;
        //Allows for FindBy to be used, look for other area to add this
        PageFactory.initElements(this.driver,this);
    }
    public WebDriver driver;
    //finds the web element using selinum findby method
    //in this case finding by id
    @FindBy(how = How.ID, using= "next-button") WebElement btn_start;

    //allows the step def to interact with the page
    public void clickStartButton(){
        btn_start.click();
    }
}
