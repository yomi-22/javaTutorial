
package TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderClass {
   /** DataProvider -> Allow you to pass data from one method to another method by using
    the @DataProvider attribute and give the data attribute a name. It takes object of array of array by default
    However, you can change the return type if you know it e.g. String. In the below example
    email and password are using data. See below example

    Note:
    If the data provider is inside the same class, you just pass the name of the DataProvider e.g.myDataProvider
    If the data provider is inside a different same class, you need to pass the name of the DataProvider and the class name
    e.g.myDataProvider
    */

   // Data provider in the same class
@Test(dataProvider = "myDataProvider")
public void login(String email, String password)
{
    System.out.println("Data email is " + email + "Data password is " + password);
}

// data provider in a different class
@Test(dataProvider = "customDataProvider", dataProviderClass = CustomDataProvider.class)
public void verifyYourDetails(String email, String password)
{
    System.out.println();

}

@DataProvider(name = "myDataProvider")
    public Object[][] getData()
    {
        Object [][] data = {{"test@yahoo.com","test12"},{"test2@yahoo.com","test123"},
                {"test@yahoo.com","test12"}};
        return  data;
    }
}
