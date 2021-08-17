package p1;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo7 {
    static {
        String key = "webdriver.chrome.driver";
        String value = "./driver/chromedriver";
        System.setProperty(key, value);
    }

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("file:///Users/umadevi/Downloads/Demo.html");
        WebElement element = driver.findElement(By.id("A1"));

        int x = element.getLocation().getX();
        System.out.println(x);

        int y = element.getLocation().getY();
        System.out.println(y);

        int h = element.getSize().getHeight();
        System.out.println(h);

        int w = element.getSize().getWidth();
        System.out.println(w);

        //using rectangle also we can get the size and location of the element

        Rectangle rectangle = element.getRect();
        System.out.println(rectangle.getX());
        System.out.println(rectangle.getY());
        System.out.println(rectangle.getHeight());
        System.out.println(rectangle.getWidth());
        driver.close();
    }

}
