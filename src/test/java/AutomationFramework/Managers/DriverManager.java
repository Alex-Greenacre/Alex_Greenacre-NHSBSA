package AutomationFramework.Managers;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class DriverManager {
    WebDriver driver;

    public WebDriver getDriver(){
        //if the dirver has not yet been created the driver is downloaded fron the git repo otherwise the driver is reutrned
        if (this.driver == null){
            io.github.bonigarcia.wdm.WebDriverManager.chromedriver().setup();
            this.driver = new ChromeDriver();
            this.driver.navigate().to("https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/start");

        }
        return this.driver;
    }
}
