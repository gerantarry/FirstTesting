package FirstTestSuite;
/*
Знакомлюсь с аннотациями, приоритетами, группами.
Делаю репорты по результатам теста в файл FirstTestSuite.xml
 */

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstTestCase {

    @BeforeTest
    void beforeTest(){
        System.out.println("====Before Test Annotation ====");
    }

    @Test(priority = 1, groups = {"setup group"})
    void setup() {
        System.out.println("Opening browser");
    }

    @Test(priority = 2)
    void login() {
        System.out.println("This is login test");
    }

    @Test(priority = 3, groups = {"close group"})
    void close() {
        System.out.println("Closing browser");
    }

    @BeforeMethod
    void beforeMethod(){
        System.out.println("\n_____before method_____");
    }
}
