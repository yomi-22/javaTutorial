package TestNG;

import org.testng.annotations.Test;

public class GroupTests {
    // Groups annotation-> Allows user to group test. It allows tests to be run based on
    // group they belong to using the 'XML Create'. 'include name' attribute will be
    // the name of test group and same applies to the test you want to exclude from
    // executing. e.g
    //                <groups>
    //                    <run>
    //                        <include name="regression"/>
    //                        <include name="sanity"/>
    //                        <exclude name="smoke">
    //
    //                        </exclude>
    //                    </run>
    //                </groups>
    @Test(priority = 1, groups = "sanity")
    void launchBrowser() {
        System.out.println("Open a new browser");
    }

    @Test(priority = 2, groups = "regression")
    void userLogin() {
        System.out.println("User login");
    }

    @Test(priority = 2, groups = {"regression"})
    void verifyInfoOnPage() {
        System.out.println("Verify certain texts are displayed");
    }

    @Test(priority = 3, groups = {"smoke"})
    void checkResult() {
        System.out.println("Close browser");
    }

    // method depending on method
    @Test(priority = 3, dependsOnMethods = {"checkResult"})
    void testResultPercentage() {
        System.out.println("Tests result %");
    }

    // method depending on group
    @Test(priority = 3, dependsOnGroups = {"smoke", "sanity"})
    void closeBrowser() {
        System.out.println("Close browser");
    }
    // groups depend on group. Check the testng xml file
}
