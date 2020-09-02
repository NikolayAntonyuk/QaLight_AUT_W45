package tests;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import tests.listeners.CustomListener;

import static tests.logger.CustomLogger.logger;

@Listeners(CustomListener.class)
public class CalculatorTests extends BaseClass {

    @Test(groups = "test1", priority = 1)
    public void test1(String msg) {

        int actualResult = calculator.sum(2, 2);
        int expectedResult = 4;
        Assert.assertEquals(expectedResult, actualResult);
        logger.info(msg);
    }

    @Test(groups = "test2", priority = 2)
    public void test2() {
        int actualResult = calculator.subtraction(2, 2);
        int expectedResult = 0;
        Assert.assertEquals(expectedResult, actualResult);
        logger.info("ok");
    }

    @Test(groups = "test3", priority = 3)
    public void test3() {
        int actualResult = calculator.multiplication(2, 3);
        int expectedResult = 6;
        Assert.assertEquals(expectedResult, actualResult);
        logger.info("ok");
    }

    @Test(groups = "test4", priority = 4)
    public void test4() {
        int actualResult = calculator.division(2, 2);
        int expectedResult = 1;
        Assert.assertEquals(expectedResult, actualResult);
        logger.info("ok");
    }

    @Test(groups = "test5", priority = 5)
    public void test5() {
        test1("My message");
        test2();
        test3();
        test4();
    }

}
