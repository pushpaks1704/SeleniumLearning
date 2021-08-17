package p1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Set;

public class Demo24 {
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
        driver.findElement(By.id("A5")).click();
        Thread.sleep(2000);
        Set<String> windows = driver.getWindowHandles();
        System.out.println(windows.size());
        for(String win :windows){
           driver.switchTo().window(win);
            System.out.println(driver.getTitle());
            if("Cognizant".equals(driver.getTitle()))
            driver.close();
        }

    }
}
