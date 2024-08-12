package TestNG;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;

// add annotation listener tag + the class name, if multiple class then add them see below
//@Listeners({Listener.class, DummyClass.class})
// Listener on a class level
@Listeners(Listener.class)
public class ListenerImplementation {
    @Test
    void showMessage()
    {
        System.out.println("My message to you");
    }
    @Test
    void voiceMessage()
    {
        System.out.println("I dropped you voicemail ");
    }
    @Test
    void textMessage()
    {
        System.out.println("I sent you a text message");
    }
    @Test
    public void testFailure() {
        System.out.println("Raise event when the test failed test. e.g Take a screenshot when test failed");
        Assert.assertTrue(false);
    }

    @Test(dependsOnMethods = "onTestFailure")
    public void onTestSkipped(ITestResult result) {
        System.out.println("Test skipped because the dependant test failed so the the testt" +
                "cant be executed");
    }
    @Test(timeOut = 1000)
    public void failedTestWithTimeout() {
        try {
            sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
