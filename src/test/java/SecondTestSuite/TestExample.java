package SecondTestSuite;

import com.beust.jcommander.Parameter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestExample {


    ChromeDriver driver;

    @BeforeClass
    @Parameters({"url"})
    void setup(String url) {

        driver=new ChromeDriver();
        driver.get(url);
    }

    @Test
    void testlogo(){
        WebElement logo = driver.findElement(By.xpath("//*[@id='masthead']/div/div[1]/div"));
        Assert.assertTrue(logo.isDisplayed(),"logo not displayed");
    }

    @AfterClass
    void end(){
        driver.quit();
    }
}
/*
System.setProperty("webdriver.opera.driver", "C:\\webdrivers\\operadriver.exe");
        driver = new OperaDriver();
 */