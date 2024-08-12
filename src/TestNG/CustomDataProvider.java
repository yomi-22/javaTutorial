package TestNG;

import org.testng.annotations.DataProvider;

public class CustomDataProvider {
    @DataProvider(name ="customDataProvider")
    public Object [][] retriveData()
    {
        Object [][] info = {{"mytest","test123", "valid user details"},{"mytest2","test1234"},{"mytest3","test12345"}};
    return info;
    }
}
