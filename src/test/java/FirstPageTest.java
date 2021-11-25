import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstPageTest {

    @Test
    public  void testURL() {
        System.setProperty("webdriver.chrome.driver", "C:/Users/Brymonsoft08_1/Downloads/chromedriver_win32 (1)/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        String url = "https://www.99-bottles-of-beer.net/";
        String expectedResult = "https://www.99-bottles-of-beer.net/";

        driver.get(url);
        String actualResult = driver.getCurrentUrl();

        Assert.assertEquals(actualResult, expectedResult);
        driver.close();
    }

    @Test
    public  void testMainPage() {
        System.setProperty("webdriver.chrome.driver", "C:/Users/Brymonsoft08_1/Downloads/chromedriver_win32 (1)/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        String url = "https://www.99-bottles-of-beer.net/";
        String expectedResult = "Welcome to 99 Bottles of Beer";

        driver.get(url);

        WebElement headerOfMainPage = driver.findElement(By.xpath("//h2[text() = 'Welcome to 99 Bottles of Beer']"));
        Assert.assertEquals(headerOfMainPage.getText(), expectedResult);
        driver.close();
    }
}
