package FirstTestSuite;

/*
Знакомлюсь с аннотациями, приоритетами, группами.
Делаю репорты по результатам теста в файл FirstTestSuite.xml
 */

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


    //добавили зависимость, если addCustomer упешно
    //выполнен, то запускается этот тест
    @Test(priority = 6, dependsOnMethods = {"addCustomer"})
    void searchCustomer(){
        System.out.println("This is searchCustomer test");
    }

    //специально проваливаем тест
    @Test(priority = 5)
    void addCustomer(){
        System.out.println("Add customer test");
        Assert.fail();
    }

    @Test(priority = 7, groups = {"close group"})
    void close(){
        System.out.println("Closing browser");
    }

}
