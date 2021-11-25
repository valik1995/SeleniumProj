import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckSeliniumSite {
    @Test
    public void titleTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/Brymonsoft08_1/Downloads/chromedriver_win32 (1)/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/");
        driver.manage().window().maximize();
        WebElement documentationButton = driver.findElement(By.xpath("//a[@href = '/documentation']"));
        documentationButton.click();
        WebElement searchField = driver.findElement(By.xpath("//input[@type = 'search']"));
        searchField.sendKeys("element");
        Thread.sleep(1000);
        WebElement item = driver.findElement(By.xpath("//a[@href = 'https://www.selenium.dev/documentation/webdriver/web_element/']"));
        item.click();
        WebElement pagetTitleWe = driver.findElement(By.tagName("h1"));
        String pagetTitle = pagetTitleWe.getText();
        Assert.assertEquals(pagetTitle , "Web element");
        driver.quit();
    }
}
