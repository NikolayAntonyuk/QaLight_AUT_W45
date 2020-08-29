package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class BaseClass {
    Calculator calculator = new Calculator();

    @Parameters({"browserName", "country"})
    @BeforeMethod
    public void prepareProject(@Optional String browserName, @Optional String country) {
        System.out.println("Environments:");
        if (browserName.equals("Chrome")) {
            System.out.println("Browser name: " + browserName);
        }
    }

    @AfterMethod
    public void tearDown() {
        System.out.println("After method");
    }

}
