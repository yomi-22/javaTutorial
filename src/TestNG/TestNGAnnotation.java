package TestNG;

import org.testng.annotations.*;

public class TestNGAnnotation {

    // @BeforeSuite annotation -> this executes tests before test
    // suite is run. Run before any test suite is run. It runs only once


    // @AfterSuite annotation -> this executes tests after tests
    // suite is run. Run after test suite is executed. It runs only once
    @BeforeSuite
    void beforeSuiteRun() {
        System.out.println("Execute this test before suite is run");
    }

    @AfterSuite
    void afterSuiteRun() {
        System.out.println("Execute this test after suite is run");
    }

    // @BeforeTest annotation -> this executes tests before any tests in the given
    // suite is run. Run before any test is run. It runs only once


    // @AfterTest annotation -> this executes tests after any tests in the given
    // suite is run. Run after all tests are executed. It runs only once

    @BeforeTest
    void beforeTestsRun() {
        System.out.println("Execute this test before any method is run");
    }

    @AfterTest
    void afterTestsRun() {
        System.out.println("Execute this test before any method is run");
    }
    // @BeforeClass annotation -> this executes tests before any methods in the given
    // class is run
    // @AfterClass annotation -> this executes tests after any methods in the given
    // class is run

    @BeforeClass
    void beforeAnyMethodExecuted() {
        System.out.println("Execute this test before any method is run");
    }

    @AfterClass
    void afterAnyMethodExecuted() {
        System.out.println("Execute this test before any method is run");
    }

    // @BeforeMethod annotation -> this executes tests before any method is run
    // @AfterMethod annotation -> this executes tests after any method is run
    @BeforeMethod
    void beforeMethodExecuted() {
        System.out.println("Execute this test before any method is run");
    }

    @AfterMethod
    void AfterMethodExecuted() {
        System.out.println("Execute this test after any method is run");
    }

    @Test(priority = 1)
    void launchTest() {
        System.out.println("This is a test");
    }

    @Test(priority = 2)
    void executeSteps() {
        System.out.println("Test functionalities ");
    }
}
