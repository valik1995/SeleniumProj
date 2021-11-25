import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Utils {
    @BeforeTest
    public void setUp(){
        System.out.println("The testing start");
        driverSetUp();
    }

    @AfterTest
    public void reportReady(){
        System.out.println("Report is ready to be shared");
    }

    public static void driverSetUp(){
        System.setProperty("webdriver.chrome.driver", "C:/Users/Brymonsoft08_1/Downloads/chromedriver_win32 (1)/chromedriver.exe");
    }
}
