package PomLearning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import sun.jvm.hotspot.debugger.Page;

import java.util.List;

public class GooglePage {

    @FindBy(xpath = "//a")
    private List<WebElement> allLinks;

    public GooglePage(WebDriver driver) {
        PageFactory.initElements(driver, this);

    }

    public int getLinkSize() {
        return allLinks.size();
    }

    public void printText(){
         for(WebElement link : allLinks){
             if(!link.getText().isEmpty())
             System.out.println(link.getText());
         }

    }
}
