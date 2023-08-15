package listeners;

import config.BaseClass;
import org.openqa.selenium.By;
import org.testng.ITestListener;
import org.testng.ITestResult;
import util.ScreenShot;

public class MainPageListener extends BaseClass implements ITestListener {
    @Override
    public void onTestFailure(ITestResult result) {
        ScreenShot.getScreenShot(driver,result.getTestName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        if(result.getMethod().getMethodName().equals("testQuery")){
            ScreenShot.getWebElementPNG(driver.findElement(By.id("coursesMenuDesktop")),result.getTestName());
        }
    }
}
