import data.DataTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestParam {
    @DataProvider
    public static Object[][] getName(){
        return new Object[][]{
                {"Vasiliy"},
                {"Ivan"},
                {"Ruslan"}
        };
    }
    @Test(dataProvider = "getName")
    public void test1(String name){
        System.out.println(name);
    }
    @Test(dataProvider = "getName",dataProviderClass = DataTest.class)
    public void test2(String name){
        System.out.println(name);
    }

}
