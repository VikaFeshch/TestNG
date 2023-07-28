import config.BaseClass;
import org.testng.annotations.Test;

public class TestAA extends BaseClass {
    @Test
    public void test1(){
        driver.get("http://google.com");
    }

}
