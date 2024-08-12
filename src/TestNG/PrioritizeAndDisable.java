package TestNG;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class PrioritizeAndDisable {
    // using priority keyword with value will enable your tests to execute in a particular
    // order  e.g 0 run before 1, 1 run before 2 etc
    @Test(priority = 1)
    void launchBrowser() {
        System.out.println("Open a new browser");
    }

    @Test(priority = 2)
    void userLogin() {
        System.out.println("User login");
    }
// There are different ways of ignoring or disable tests in TestNG. They are
    // 1. Method level, Class level and
// Package level -> You need to create a file called package-info.java then add the
    // @Ignore tag. This will disable all the tests in both method and class level in
// this package. For more info, refers to DisableTests package

// Another way of disabling a test method is by adding the '@Ignore' annotation. Any test
    // method with @Ignore keyword will not be executed. @Ignore
    @Ignore
    @Test(priority = 3, enabled = false)
    void verifyTestResult() {
        System.out.println("Close browser");
    }

    // enabled = false will disable the test and prevent the tests from executing
    @Test(priority = 4, enabled = false)
    void closeBrowser() {
        System.out.println("Close browser");
    }
}
// To ignore a test from class level, you need to add @Ignore tag on top of the class name
// This will not execute any methods inside this class
@Ignore
class  IgnoreTestFromClassLevel {
    void Talk() {
        System.out.println("Close browser");
    }

    void Send() {
        System.out.println("Close browser");
    }
}

