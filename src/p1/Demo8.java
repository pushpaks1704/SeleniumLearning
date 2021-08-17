package p1;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo8 {
    static {
        String key = "webdriver.chrome.driver";
        String value = "./driver/chromedriver";
        System.setProperty(key, value);
    }

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("file:///Users/umadevi/Downloads/Demo.html");
        WebElement element = driver.findElement(By.id("A2"));

        System.out.println(element.getTagName());
        System.out.println(element.getAttribute("href"));
        System.out.println(element.getAttribute("id"));
        System.out.println(element.getText());


        driver.close();
    }

}
