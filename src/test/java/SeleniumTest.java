import base.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class SeleniumTest extends BaseTest {
    @Test
    public  void test(){
            getDriver().get("https://www.google.com/");
            WebElement input = getDriver().findElement(By.className("gLFyf"));
            input.sendKeys("123\n");
            WebElement result = getDriver().findElement(By.xpath("//h3[text() = 'Jess Glynne - 123 [Official Live Video] - YouTube']"));
            Assert.assertEquals(result.getText(), "Jess Glynne - 123 [Official Live Video] - YouTube");
    }
}
