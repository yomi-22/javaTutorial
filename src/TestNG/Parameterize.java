package TestNG;

import org.testng.annotations.*;

public class Parameterize {
    /**
     * Parameters annotation -> Allow you to pass parameters from testng.xml file. You need to specify @Parameters tag
     * on the test method. You have to use the same parameter names in the method also in the xml file e.g.
     * <test name="parameter">
     * <parameter name="browser" value="chrome"/>
     * <parameter name="url" value="https://google.com"/>
     * <classes>
     * <class name="TestNG.Parameterize">
     * <methods>
     * <include name="launchBrowser"/>
     * </methods>
     * </class>
     * </classes>
     * </test>
     */

    @BeforeClass
    @Parameters({"browser", "url"})
    @Test
    void launchBrowser(String browser, String url) {
        System.out.println("Open " + browser + " browser");
        System.out.println("Navigate to a " + url);
    }
// default parameter/optional parameter - This is when you want the parameter to be optional
    // at the same, you have to provide a default value so if the user did not pass any value
    // the default value will be used. This is done by passing '@optional' to the method parameter
    // assign a default value to it
    @BeforeMethod
    @Parameters({"name"})
    @Test
    void defaultParameter(@Optional("Yomi") String name) {
        System.out.println("My name is  " + name);

    }
}
