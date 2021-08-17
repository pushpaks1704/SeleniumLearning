package p1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

public class Demo21 {
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
        Thread.sleep(1000);
        //InvalidArgumentException
//		driver.findElement(By.id("A2")).sendKeys("f:/MyCV.docx");
        //WebDriverException-path is not absolute:
        File f=new File("./images/error.png");
        String path = f.getAbsolutePath();
        driver.findElement(By.id("A2")).sendKeys(path);
        driver.close();

    }
}
