package p1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Properties;

public class Demo5 {
    static {
        String key = "webdriver.chrome.driver";
        String value = "./driver/chromedriver";
        System.setProperty(key, value);
    }

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.actitime.com/login.do");
        driver.findElement(By.cssSelector("#username")).sendKeys("admin");
        driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys("manager");
        driver.findElement(By.cssSelector("#loginButton")).click();
        Thread.sleep(10000);
        driver.findElement(By.cssSelector("#logoutLink")).click();
        driver.close();

        Properties prop = new Properties();

    }

}
