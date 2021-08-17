package p1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.List;

public class Demo13 {
    static {
        String key = "webdriver.chrome.driver";
        String value = "./driver/chromedriver";
        System.setProperty(key, value);
    }

    public static void main(String[] args) throws InterruptedException, IOException {
        LocalDateTime currTime = LocalDateTime.now();
        System.out.println(currTime);
        WebDriver driver = new ChromeDriver();
        driver.get("file:///Users/umadevi/Downloads/Demo(1).html");
        List<WebElement> elements = driver.findElements(By.xpath("//input[@type='text']"));
        System.out.println(elements.size());
        String [] data = {"Java","Selenium","world"};
        int i=0;
        for(WebElement element :elements){
            element.sendKeys(data[i]);
            i++;
        }
    }
}
