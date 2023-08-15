package data;

import org.testng.annotations.DataProvider;

import java.util.ArrayList;
import java.util.Arrays;

public class DataTest {
    @DataProvider
    public static Object[][] getName() {
        return new Object[][]{
                {"Vasiliy"},
                {"Ivan"},
                {"Ruslan"}
        };
    }

    @DataProvider
    public static Object[][] getSearchVariant() {
        return new Object[][]{
                {"QA", Arrays.asList("QA Manual", "QA Automation — Java", "QA Technical Pro")},
                {"Python", Arrays.asList("Python Basic", "Python Pro", "QA Automation — Python")}
        };
    }

}
