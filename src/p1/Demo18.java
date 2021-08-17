package p1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.List;

public class Demo18 {
    static {
        String key = "webdriver.chrome.driver";
        String value = "./driver/chromedriver";
        System.setProperty(key, value);
    }

    public static void main(String[] args) throws InterruptedException, IOException {
        LocalDateTime currTime = LocalDateTime.now();
        System.out.println(currTime);
        WebDriver driver = new ChromeDriver();
        driver.get("file:///Users/umadevi/Downloads/ListBox2.html");
        Thread.sleep(1000);
        WebElement listBox = driver.findElement(By.id("A3"));
        Select select=new Select(listBox);

        List<WebElement> selectedOptions = select.getAllSelectedOptions();

        int count=selectedOptions.size();
        System.out.println("Number of selected options:"+count);

        for(int i=0;i<count;i++)
        {
            WebElement option = selectedOptions.get(i);
            String text=option.getText();
            System.out.println(text);
        }

        WebElement option = select.getFirstSelectedOption();
        System.out.println("First Selected option:"+option.getText());

        List<WebElement> allOptions = select.getOptions();
        int count2=allOptions.size();
        System.out.println("Number of options:"+count2);

        for(int i=0;i<count2;i++)
        {
            String text=allOptions.get(i).getText();
            System.out.println(text);
        }

        driver.close();

    }

}
