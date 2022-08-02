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


    @FindBy(how= How.XPATH,using="radio-england")
    WebElement rad_england;
    @FindBy(how = How.ID,using = "radio-scotland")
    WebElement rad_scotland;
    @FindBy(how = How.ID,using = "radio-wales")
    WebElement rad_wales;
    @FindBy(how = How.ID,using = "radio-nire")
    WebElement rad_nire;
    @FindBy(how = How.ID,using="next-button")
    WebElement btn_next;
    @FindBy(how = How.ID, using="error-summary-heading")
    WebElement lbl_error;
    @FindBy(how = How.ID,using="back-button")
    WebElement btn_Back;

    public void clickRadEngland(){
        rad_england.click();
    }
    public void clickRadScotland(){
        rad_scotland.click();
    }
    public void clickRadWales(){
        rad_wales.click();
    }
    public void clickRadNire(){
        rad_nire.click();
    }
    public void clickBtnNext(){
        btn_next.click();
    }

    public String getError(){return lbl_error.getText();}
    public void clickBtnBack(){btn_Back.click();}


}
