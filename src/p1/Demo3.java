package p1;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {
    static {
        String key = "webdriver.chrome.driver";
        String value = "./driver/chromedriver";
        System.setProperty(key, value);
    }

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("file:///Users/umadevi/Downloads/Sample.html");
        driver.findElement(By.tagName("a")).click();

        sleepAndBack(driver);

        driver.findElement(By.id("d1")).click();

        sleepAndBack(driver);

        driver.findElement(By.name("n1")).click();

        sleepAndBack(driver);

        driver.findElement(By.className("c1")).click();

        sleepAndBack(driver);

        driver.findElement(By.linkText("Google")).click();

        sleepAndBack(driver);

        driver.findElement(By.partialLinkText("Goo")).click();
        sleepAndBack(driver);

        System.out.println("Navigated url is--->" + driver.getCurrentUrl());
        driver.close();
    }

    public static void sleepAndBack(WebDriver driver) throws InterruptedException {
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(1000);
    }

}
