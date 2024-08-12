package TestNG;

import org.testng.annotations.Test;

public class DependencyAnnotation {
    // dependsOnMethods annotation-> Is when method depends on another method for the
    // method to run. If the test another test is depending on fails, the other tests depending on that
    // particular test will be ignored. However, you can force the test to run regardless
    // if the test fails by using the 'AlwaysRun' annotation
    @Test(groups = "smoke")
    void launchBrowser() {
        System.out.println("Open a new browser");
    }

    @Test(priority = 2, dependsOnMethods = {"launchBrowser"})
    void userLogin() {
        System.out.println("User login");
    }

    // enabled = false will disable the test and prevent the tests from executing
    @Test(priority = 3, dependsOnMethods = {"launchBrowser", "userLogin"}, alwaysRun = true)
    void checkResult() {
        System.out.println("Close browser");
    }
    // method depending on group called 'smoke'
    @Test(priority = 3, dependsOnGroups = {"smoke"})
    void closeBrowser() {
        System.out.println("Close browser");
    }
}