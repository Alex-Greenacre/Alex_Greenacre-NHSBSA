package AutomationFramework.Managers;

import org.openqa.selenium.WebDriver;

public class TestManager {

    public WebDriver driver;
    public PageManager pageManager;
    public StepDefManager stepDefManager;
    public DriverManager driverManager;
    public TestManager(){
        driverManager = new DriverManager();
        this.driver = driverManager.getDriver();
        this.pageManager = new PageManager(this.driver);
    }

}
