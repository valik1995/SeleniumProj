import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstPageTest extends BaseTest {
    @Test
    public  void testURL() {
        String url = "https://www.99-bottles-of-beer.net/";
        String expectedResult = "https://www.99-bottles-of-beer.net/";
        getDriver().get(url);
        String actualResult = getDriver().getCurrentUrl();
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public  void testMainPage() {
        String url = "https://www.99-bottles-of-beer.net/";
        String expectedResult = "Welcome to 99 Bottles of Beer";
        getDriver().get(url);
        WebElement headerOfMainPage = getDriver().findElement(By.xpath("//h2[text() = 'Welcome to 99 Bottles of Beer']"));
        Assert.assertEquals(headerOfMainPage.getText(), expectedResult);
    }
}
