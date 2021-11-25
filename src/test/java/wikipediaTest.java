import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class wikipediaTest extends Utils{

    @Test
    public void firstTest(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://en.wikipedia.org/wiki/Main_Page");
        WebElement searchInput = driver.findElement(By.xpath("//input[@id = 'searchInput']"));
        searchInput.sendKeys("QA tester");
        /*searchInput.sendKeys("QA tester\n");*/
        /*searchInput.sendKeys(Keys.ENTER);*/
        WebElement searchButton = driver.findElement(By.xpath("//*[@id = 'searchButton']"));
        searchButton.click();
        WebElement searchResult = driver.findElement(By.xpath("//h1[@id = 'firstHeading']"));
        Assert.assertEquals(searchResult.getText(), "Search results");
        driver.quit();
    }
}
