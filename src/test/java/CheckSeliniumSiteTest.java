import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckSeliniumSiteTest extends BaseTest {
    @Test
    public void titleTest() {
        getDriver().get("https://www.selenium.dev/");
        WebElement documentationButton = getDriver().findElement(By.xpath("//a[@href = '/documentation']"));
        documentationButton.click();
        WebElement searchField = getDriver().findElement(By.xpath("//input[@type = 'search']"));
        searchField.sendKeys("element");
        WebElement item = getDriver().findElement(By.xpath("//a[@href = 'https://www.selenium.dev/documentation/webdriver/web_element/']"));
        item.click();
        WebElement pagetTitleWe = getDriver().findElement(By.tagName("h1"));
        String pagetTitle = pagetTitleWe.getText();
        Assert.assertEquals(pagetTitle , "Web element");
    }
}
