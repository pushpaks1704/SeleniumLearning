package p1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.time.LocalDateTime;

public class Demo23 {
    static {
        String key = "webdriver.chrome.driver";
        String value = "./driver/chromedriver";
        System.setProperty(key, value);
    }

    public static void main(String[] args) throws InterruptedException, IOException {
        LocalDateTime currTime = LocalDateTime.now();
        System.out.println(currTime);
        WebDriver driver = new ChromeDriver();
        driver.get("file:///Users/umadevi/Downloads/PopUpDemo.html");
        Thread.sleep(1000);
        driver.findElement(By.id("A4")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("java");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("world");
        driver.findElement(By.xpath("(//span[text()='Login'])[2]")).click();
        driver.findElement(By.xpath("//button[text()]")).click();


        driver.close();
    }
}
