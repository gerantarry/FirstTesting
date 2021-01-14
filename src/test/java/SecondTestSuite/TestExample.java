package SecondTestSuite;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import java.io.File;

public class TestExample {
    ChromeDriverService service = new ChromeDriverService.Builder()
            .usingDriverExecutable(new File("C:\\chromedriver\\chromedriver.exe")).build();

    ChromeDriver driver;

    @Test
    void setup() {
        driver = new ChromeDriver(service);
        driver.get("https://steam-helper.ru/");
    }

    @AfterClass
    void end(){
        driver.quit();
    }
}
