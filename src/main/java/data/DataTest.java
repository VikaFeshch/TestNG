package data;

import org.testng.annotations.DataProvider;

public class DataTest {
    @DataProvider
    public static Object[][] getName(){
        return new Object[][]{
                {"Vasiliy"},
                {"Ivan"},
                {"Ruslan"}
        };
    }
}
