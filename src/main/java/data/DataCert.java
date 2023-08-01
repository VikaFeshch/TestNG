package data;

import org.testng.annotations.DataProvider;

public class DataCert {
    @DataProvider
    public static Object[][] getNumb(){
        return new Object[][]{
                {"45924126","true"},
                {"45871","false"},
                {"78008248","true"},
                {"12345677","false"}
        };
    }
}
/*{"45924126","true"},
                {"45871","false"},
                {"78008248","true"},
                {"12345677","false"}*/
/*{"45924126"},
        {"45871"},
        {"78008248"},
        {"12345677"}*/