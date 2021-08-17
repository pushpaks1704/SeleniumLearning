package p1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.List;

public class Demo16 {
    static {
        String key = "webdriver.chrome.driver";
        String value = "./driver/chromedriver";
        System.setProperty(key, value);
    }

    public static void main(String[] args) throws InterruptedException, IOException {
        LocalDateTime currTime = LocalDateTime.now();
        System.out.println(currTime);
        WebDriver driver = new ChromeDriver();
        driver.get("file:///Users/umadevi/Downloads/ListBox1.html");
        Thread.sleep(1000);
        WebElement listBox = driver.findElement(By.id("A1"));
        Select select=new Select(listBox);
        select.selectByIndex(1);
        Thread.sleep(1000);
        select.selectByValue("b");
        Thread.sleep(1000);
        select.selectByVisibleText("Chennai");
        boolean v = select.isMultiple();
        System.out.println(v);
        select.deselectByIndex(0);
    }
}
