package p1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.List;

public class Demo15 {
    static {
        String key = "webdriver.chrome.driver";
        String value = "./driver/chromedriver";
        System.setProperty(key, value);
    }

    public static void main(String[] args) throws InterruptedException, IOException {
        //open the browser
        WebDriver driver=new ChromeDriver();
        //enter google.com
        driver.get("https://www.google.com/");
        Thread.sleep(1000);
        //enter 'selenium' in search box
        driver.findElement(By.name("q")).sendKeys("selenium");
        Thread.sleep(1000);
        //find all the auto suggestions
        List<WebElement> allASE = driver.findElements(By.xpath("//span[contains(text(),'selenium')]"));
        //print the count
        int count=allASE.size();
        System.out.println(count);
        //print the text
        for(int i=0;i<count;i++) {
            String text=allASE.get(i).getText();
            System.out.println(text);
            Select select = new Select(allASE.get(i));

        }

        //select the 1st one

    }

}
