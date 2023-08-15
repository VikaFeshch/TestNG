import config.BaseClass;
import data.DataTest;
import listeners.MainPageListener;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.MainPageFactory;

import java.util.List;

@Listeners(MainPageListener.class)

public class TestMainPage extends BaseClass {
    static final String MAIN_URL="https://dnipro.ithillel.ua/";
    MainPageFactory page;
    @BeforeClass
    public void bb(){
        driver.get(MAIN_URL);
        page= new MainPageFactory(driver);
    }
    @Test(testName = "Search TEst",dataProviderClass = DataTest.class,dataProvider = "getSearchVariant")
    public void testQuery(String courseName, List<String> listResponse) throws InterruptedException {
        Assert.assertEquals(page.checkResponseList(courseName),listResponse);
    }
}
