package p1;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {
    static {
        String key = "webdriver.chrome.driver";
        String value = "./driver/chromedriver";
        System.setProperty(key, value);
    }

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        Dimension d = new Dimension(100, 200);
        driver.manage().window().maximize();
        driver.manage().window().setSize(d);
        int x = 200;
        int y = 100;
        for (int i = 1; i <= 10; i++) {
            Point p = new Point(x, y);
            driver.manage().window().setPosition(p);
            x = x + 50;
            y = y + 50;
            Thread.sleep(500);
        }
        driver.close();


    }
}
