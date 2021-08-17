package p1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo19 {
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
        WebElement listBox = driver.findElement(By.id("A2"));
        Select select=new Select(listBox);
        List<WebElement> allOptions = select.getOptions();
        String string = select.getWrappedElement().getText();
        ArrayList<String> allText=new ArrayList<String>();
        for(WebElement option:allOptions)
        {
            String text=option.getText();
            allText.add(text);
        }

        System.out.println(allText);

        Collections.sort(allText);//DNSO

        System.out.println(allText);

        driver.close();

    }
//reverse order

 //duplicate in the list

    //print list box content in sorted order
//check if list box has any duplicate options
//print list box content in reverse sorted order
}
