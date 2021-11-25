import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class Selenium {

    private WebDriver driver;

    @BeforeClass
    public void before(){
        WebDriverManager.chromedriver().setup();
    }

    @BeforeMethod
    public void beforeTest(){
       driver = new ChromeDriver();
    }

    @Test
    public  void test() throws InterruptedException {
            driver.get("https://www.google.com/");
            WebElement input = driver.findElement(By.className("gLFyf"));
            input.sendKeys("123\n");
            WebElement result = driver.findElement(By.xpath("//h3[text() = 'Jess Glynne - 123 [Official Live Video] - YouTube']"));
            Assert.assertEquals(result.getText(), "Jess Glynne - 123 [Official Live Video] - YouTube");
    }

    @AfterMethod
    public void after(){
        driver.quit();
    }

}
