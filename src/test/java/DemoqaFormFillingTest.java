import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utils.Utility;

import java.util.List;

public class DemoqaFormFillingTest extends BaseTest {
    @Test
    public void fillForm() throws InterruptedException {
        getDriver().get("https://demoqa.com/automation-practice-form");
        getDriver().findElement(By.id("firstName")).sendKeys("Valiantsin");
        WebElement textName = getDriver().findElement(By.id("lastName"));

        textName.sendKeys("Alt");
        textName.clear();
        textName.sendKeys("Altukhou");
        //newClick(driver , driver.findElement(By.xpath("//input[@name = 'gender'][@value = 'Male']")));
        List<WebElement> gender = getDriver().findElements(By.xpath("//input[@type= 'radio']"));
        gender.size();
        for (int i = 0; i < gender.size(); i++) {
            String value = gender.get(i).getAttribute("value");
            if(value.equalsIgnoreCase("male")){
                Utility.jsClick(getDriver(), gender.get(i));
                break;
            }
        }
    }
}
