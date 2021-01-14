package FirstTestSuite;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SecondTestCase {
    @BeforeClass(enabled = true)
    void beforeClass(){
        System.out.println("----Before class Annotation---- ");
    }

    @Test(priority = 4, groups = {"setup group"})
    void setup(){
        System.out.println("Opening browser");
    }

    @Test(priority = 6, dependsOnMethods = {"addCustomer"}) //добавили зависимость, если addCustomer упешно
    void searchCustomer(){                                  //выполнен, то запускается этот тест
        System.out.println("This is searchCustomer test");
    }

    @Test(priority = 5) //специально проваливаем тест
    void addCustomer(){
        System.out.println("Add customer test");
        Assert.fail();
    }

    @Test(priority = 7, groups = {"close group"})
    void close(){
        System.out.println("Closing browser");
    }

}
