import base.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SergeyReviewTest extends BaseTest {
    @Test
    public void review() {
        getDriver().get("https://shop.demoqa.com/my-account/");
        getDriver().findElement(By.linkText("Lost your password?")).click();
        getDriver().navigate().to("https://shop.demoqa.com/my-account/");
        getDriver().navigate().back();
        getDriver().navigate().forward();
        getDriver().navigate().refresh();
    }
}
