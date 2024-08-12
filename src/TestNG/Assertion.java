package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.Scanner;

public class Assertion {
    @Test(priority = 1, groups = {"sanity"})
    void launchBrowser() {
        String browser = "Chrome";
        Assert.assertEquals("No browser", browser, "Expected text is not displayed");
        System.out.println("Open a new browser");
    }

    @Test(priority = 2, groups = {"regression"})
    void userLogin() {
        boolean isChild = true;
        boolean isAdult = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Are you adult?");
        var result = scanner.nextBoolean();
        Assert.assertTrue(isChild, "You are an adult");
        Assert.assertFalse(result, "You are a child");

        System.out.println("User login");
    }
    // Soft Assertion - is used when you want all the tests to run even if the tests
    //fail. It does not throw exception. However, it will tell you where
    // tests fail if there is any failure.You need to create instance
    // of SoftAssertion. Also you need to add softAssert.assertAll();
    // to get the lists of
    // of the tests that fail and where they fail on
    @Test
    void softAssertionMethod() {
        SoftAssert softAssert = new SoftAssert();

        boolean isChild = true;
        boolean isAdult = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Are you adult?");
        var result = scanner.nextBoolean();
        softAssert.assertTrue(isChild, "You are an adult");
        softAssert.assertFalse(result, "You are a child");
        softAssert.assertAll();
    }

    @Test(priority = 2, groups = {"regression"})
    void verifyInfoOnPage() {
        System.out.println("Verify certain texts are displayed");
    }
}
