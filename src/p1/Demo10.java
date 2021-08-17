package p1;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

import java.io.File;
import java.io.IOException;

public class Demo10 {
    static {
        String key = "webdriver.chrome.driver";
        String value = "./driver/chromedriver";
        System.setProperty(key, value);
    }

    public static void main(String[] args) throws InterruptedException, IOException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.actitime.com/login.do");
        driver.findElement(By.cssSelector("#loginButton")).click();
        Thread.sleep(2000);
        WebElement element = driver.findElement(By.xpath("//span[contains(text(),'invalid')]"));
        File srcfile = element.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcfile,new File("./images/error.png"));
        driver.close();
    }
}
