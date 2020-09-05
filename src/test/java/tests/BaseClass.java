package tests;

import lera.PrepareTestData;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.util.ArrayList;

public class BaseClass {
    Calculator calculator = new Calculator();
    PrepareTestData prepareTestData = new PrepareTestData();

    @Parameters({"browserName", "country"})
    @BeforeMethod
    public void prepareProject(@Optional String browserName, @Optional String country) {
        System.out.println("Environments:");
        if (browserName != null && browserName.equals("Chrome")) {
            System.out.println("Browser name: " + browserName);
        } else {
            System.out.println("Browser name: " + browserName + " not found");
        }
        if (country != null && country.equals("SE")) {
            System.out.println("Country: " + country);
        } else {
            System.out.println("Country: " + country + " not found");
        }
        System.out.println("Before method");
        prepareTestData.createListWithStringItem(prepareTestData.addItemsInList());
    }

    @AfterMethod
    public void tearDown() {
        System.out.println("After method");
    }

}
