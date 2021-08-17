package p1;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class Demo11 {
    static {
        String key = "webdriver.chrome.driver";
        String value = "./driver/chromedriver";
        System.setProperty(key, value);
    }

    public static void main(String[] args) throws InterruptedException, IOException {
        LocalDateTime currTime = LocalDateTime.now();
        System.out.println(currTime);
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.actitime.com/login.do");
        driver.findElement(By.cssSelector("#loginButton")).click();
        Thread.sleep(2000);
        WebElement element = driver.findElement(By.xpath("//span[contains(text(),'invalid')]"));
        TakesScreenshot tk = (TakesScreenshot)driver;
        File srcfile = tk.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcfile,new File("./images/interface"+currTime+".png"));
        driver.close();
    }
}
