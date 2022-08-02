package AutomationFramework.Managers;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

public class DriverManager {
    WebDriver driver;
    //change config value to change the browser
    String config = "Chrome";
    public WebDriver getDriver(){
        //if the dirver has not yet been created the driver is downloaded fron the git repo otherwise the driver is reutrned
        if (this.driver == null && this.config=="Chrome"){
            io.github.bonigarcia.wdm.WebDriverManager.chromedriver().setup();
            this.driver = new ChromeDriver();
            //this.driver.navigate().to("https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/start");

        }
        else {
            io.github.bonigarcia.wdm.WebDriverManager.firefoxdriver().setup();
            this.driver = new FirefoxDriver();
        }
        return this.driver;
    }
}
