package TestNG.DisableTests;

import org.testng.annotations.Test;

class IgnoreTestFromPackageLevel2 {
    @Test
    void Talk() {
        System.out.println("Ignore tests");
    }

    @Test
    void Send() {
        System.out.println("package ignore test 2");
    }

    @Test(priority = 2)
    void userLogin() {
        System.out.println("User login");
    }

}