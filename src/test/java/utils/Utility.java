package utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Utility {
    public static void jsClick(WebDriver driver, WebElement element){
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", element);
    }

    public static void scroll(WebDriver driver, WebElement element){
        //todo : implement method
        throw new RuntimeException("This method \"scroll\" is nor implemented");
    }

    public static void scrollClick(WebDriver driver, WebElement element){
        scroll(driver, element);
        element.click();

    }
}
