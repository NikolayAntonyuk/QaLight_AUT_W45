package sasha.vi_tests;
import static java.lang.Thread.sleep;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static tests.logger.CustomLogger.logger;
public class debug {
    WebDriver driver;

         @BeforeMethod

    public void setup() {
          String baseURL = "https://ru.wikipedia.org/";
          System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
          driver = new ChromeDriver();
          driver.get(baseURL);
          driver.manage().window().maximize();
    }

          @Test
          public void test23() throws InterruptedException {
          logger.info(driver.getCurrentUrl());
          sleep( 10000);
        }


         @AfterMethod
         public void tearDown() {
             driver.close();

         }
}
