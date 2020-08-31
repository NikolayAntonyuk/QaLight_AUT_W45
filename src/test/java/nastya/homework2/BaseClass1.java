package nastya.homework2;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import tests.Calculator;

public class BaseClass1 {
   public Calculator calculator = new Calculator();
   public PrepareTestData prepareTestData = new PrepareTestData();


   @BeforeMethod
   public void setPrepareTestData() {
       prepareTestData.fillArrayInt();
       prepareTestData.fillArrayString();
   }

    @BeforeClass
    public void prepareProject() {
        System.out.println("Prepare project");
    }
}
