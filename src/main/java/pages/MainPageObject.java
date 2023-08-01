package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPageObject {
    private WebDriver driver;
    private By courseMenu = By.xpath("//button[@data-dropdown-trigger=\"coursesMenu\"]");

    public MainPageObject(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isDis(){
        return driver.findElement(courseMenu).isDisplayed();
    }
    public void isClick(){
        driver.findElement(courseMenu).click();
    }
}
