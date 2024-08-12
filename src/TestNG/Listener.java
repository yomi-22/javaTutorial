package TestNG;

import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;
import org.testng.internal.annotations.IListeners;

import static java.lang.Thread.sleep;
/*What is listener - is the interfaces that are listening to an event to happen or
  trigger event based on test result.
  listener can be applied both on class and suite level.
  Listener on class level will listen to an event on class level by add the class
  that implement the listener interface
  Listener on suite level will listen to an event on suite level by add the the project.class
  that implement the listener interface

* */
public class Listener implements ITestListener {
    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("Raise event before the test start e.g. Check DB connection");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("Raise event when the test passed test" + result.getStatus());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("Raise event when the test failed test. e.g Take a screenshot when test failed");
        Assert.assertTrue(false);
    }

    @Test(dependsOnMethods = "onTestFailure")
    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("Test skipped because the dependant test failed so the the testt" +
                "cant be executed");
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        System.out.println("Percentage of test failed from the success pass rate");
    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
        System.out.println("Test failed due timeout");
    }

    @Override
    public void onStart(ITestContext context) {
        ITestListener.super.onStart(context);
    }

    @Override
    public void onFinish(ITestContext context) {
        ITestListener.super.onFinish(context);
    }
}