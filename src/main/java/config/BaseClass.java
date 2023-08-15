package config;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
    public static WebDriver driver;
    @BeforeClass
    public void create(){
        driver=ConfigurationWebDriver.createDriver(WebDrivers.BONYGARSIA);
    }

    @AfterClass
    public void aftCl() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }
}