package tests.ui_tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Debug {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setBrowserName("Chrome");
    }

    @Test
    public void test1() {
        driver.get("https://ru.wikipedia.org/");
    }

    @AfterMethod
    public void tearDown() {
        driver.close();
    }

}
