import config.BaseClass;
import data.DataCert;
import data.DataTest;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import pages.CertificatePage;
import pages.MainPageObject;
import listeners.MyTestListener;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(MyTestListener.class)
public class TestHillelHWw20 extends BaseClass {
       private static MainPageObject mainPage;
       private static CertificatePage certPage;
    @BeforeClass
    public static void bt() {
        mainPage = new MainPageObject(driver);
        certPage = PageFactory.initElements(driver,CertificatePage.class);
    }

    @Test
   public static void testCourseButDis(){
        driver.get("https://ithillel.ua/");
        mainPage.isDis();
    }
    @Test(dependsOnMethods = {"testCourseButDis"}, alwaysRun = true, dataProvider = "getNumb",dataProviderClass = DataCert.class)
    public static void testCheckCert(String num, String bool) throws Exception {
        driver.get("https://certificate.ithillel.ua/");
        certPage.inputNumCert(num);
        certPage.clButCheck();
        switch (bool){
            case "true" : Assert.assertTrue(certPage.checkcertifChekForm());break;
            case "false" : Assert.assertFalse(certPage.checkcertifChekForm());break;
        }
    }
}
