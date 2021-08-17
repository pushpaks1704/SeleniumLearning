package p1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

import java.util.Properties;

public class Demo9 {
    static {
        String key = "webdriver.chrome.driver";
        String value = "./driver/chromedriver";
        System.setProperty(key, value);
    }

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.actitime.com/login.do");
        driver.findElement(By.cssSelector("#loginButton")).click();
        Thread.sleep(1000);
        WebElement element = driver.findElement(By.xpath("//span[contains(text(),'invalid')]"));
        String colourValue = element.getCssValue("color");
        String colorHexValue = Color.fromString(colourValue).asHex();
        if ("#ce0100".equals(colorHexValue)) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
        driver.close();
    }
}
