package p1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Set;

public class Demo25 {
    static {
        String key = "webdriver.chrome.driver";
        String value = "./driver/chromedriver";
        System.setProperty(key, value);
    }

    public static void main(String[] args) throws InterruptedException, IOException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.actitime.com/login.do");
        driver.findElement(By.xpath("//a[text()='actiTIME Inc.']")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//a[text()='Try Free']")).click();
    }
}
