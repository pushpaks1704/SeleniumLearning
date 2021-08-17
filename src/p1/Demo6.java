package p1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Properties;

public class Demo6 {
    static {
        String key = "webdriver.chrome.driver";
        String value = "./driver/chromedriver";
        System.setProperty(key, value);
    }

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("file:///Users/umadevi/Downloads/Demo.html");
        WebElement element =driver.findElement(By.id("A1"));
        Thread.sleep(1000);
        element.clear();
        Thread.sleep(1000);
        element.sendKeys("Hello World");
      //  driver.findElement(By.id("A2")).click();
        System.out.println(driver.findElement(By.id("A3")).isDisplayed());
        System.out.println(driver.findElement(By.id("A1")).isEnabled());
        System.out.println(driver.findElement(By.id("A4")).isEnabled());
        System.out.println(driver.findElement(By.id("A5")).isSelected());
        System.out.println(driver.findElement(By.id("A6")).isSelected());
        driver.findElement(By.id("A7")).click();
        driver.findElement(By.id("A8")).submit();
    }

}
