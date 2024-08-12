package TestNG;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Base64;

import static org.apache.commons.io.FileUtils.copyFile;
import static org.apache.commons.io.FileUtils.openInputStream;

public class TakeScreenshot {

    WebDriver driver;

    public static void Screenshot(WebDriver driver, String path) throws IOException {
        TakesScreenshot screenshot = (TakesScreenshot) driver;

        // 1 Option using file
        File file = screenshot.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file, new File("./Screenshot/" + path));

        // 2 Option using base64
        var screenshot2 = screenshot.getScreenshotAs(OutputType.BASE64);
        byte[] decode2Base64 = Base64.getDecoder().decode(screenshot2);
        FileOutputStream fo = new FileOutputStream(new File("./Screenshot/" + path));
        fo.write(decode2Base64);
        fo.close();

        // 3 option using
        var screenshot3 = screenshot.getScreenshotAs(OutputType.BYTES);
        FileOutputStream fo2 = new FileOutputStream(new File("./Screenshot/" + path));
        fo.write(screenshot3);
        fo.close();
    }
@Test
    public void runSeleniumTest(WebDriver driver, String path) throws IOException {
        var chrome = new ChromeDriver();
        chrome.manage().window().maximize();
        chrome.get("https://www.youtube.com/");
        TakeScreenshot.Screenshot(driver, "Image.jpeg");
    }
}
