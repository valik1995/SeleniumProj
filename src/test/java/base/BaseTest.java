package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public abstract class BaseTest {
    private WebDriver driver;

    @BeforeClass
    protected void before() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeMethod
    protected void beforeTest() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }
    @AfterMethod
    protected void after() {
        driver.quit();
    }

    protected WebDriver getDriver() {
        return driver;
    }
}
