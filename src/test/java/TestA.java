import listeners.MyTestListener;
import org.testng.annotations.*;
@Listeners(MyTestListener.class)
public class TestA {
    @BeforeClass
    public void befCl(){
        System.out.println("before class");
    }
    @BeforeMethod
    public void befMeth(){
        System.out.println("before method");
    }

    @Test(description = "download", groups = {"smoke","regretion"},priority = 10)
    public void test1() throws Exception {
        System.out.println("test1");
        throw new Exception("hi");
    }
    @Test
    public void test2(){
        System.out.println("test2");
    }
    @Test(dependsOnMethods = {"test1"}, alwaysRun = true)
    public void test3(){
        System.out.println("test3");
    }
    @AfterClass
    public void aftCl(){
        System.out.println("after class");
    }
    @AfterMethod
    public void aftMeth(){
        System.out.println("after method");
    }

}
