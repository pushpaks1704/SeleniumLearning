package p1;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {
    static {
        String key = "webdriver.chrome.driver";
        String value = "./driver/chromedriver";
        System.setProperty(key, value);
    }

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("file:///Users/umadevi/Downloads/Sample2.html");
        WebElement element = driver.findElement(By.tagName("a"));
        element.click();
        System.out.println("Navigated url is--->" + driver.getCurrentUrl());
        driver.close();
    }
}
