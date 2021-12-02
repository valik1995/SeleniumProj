import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class wikipediaTest extends BaseTest {
    @Test
    public void firstTest(){
        getDriver().get("https://en.wikipedia.org/wiki/Main_Page");
        WebElement searchInput = getDriver().findElement(By.xpath("//input[@id = 'searchInput']"));
        searchInput.sendKeys("QA tester");
        /*searchInput.sendKeys("QA tester\n");*/
        /*searchInput.sendKeys(Keys.ENTER);*/
        WebElement searchButton = getDriver().findElement(By.xpath("//*[@id = 'searchButton']"));
        searchButton.click();
        WebDriverWait wait = new WebDriverWait(getDriver(), 20);
        WebElement searchResult = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h1[@id = 'firstHeading']")));
        //WebElement searchResult = getDriver().findElement(By.xpath("//h1[@id = 'firstHeading']"));
        Assert.assertEquals(searchResult.getText(), "Search results");
    }
}
