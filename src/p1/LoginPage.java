package p1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//add pwTB and loginBTN
//add 2 more methods setPassword() and clickLogin()
//call those 2 new methods in TestLoginPage.java
//run TestLoginPage,post the output
// i want output from all 27 people today
//
public class LoginPage {
    @FindBy(id = "username")
    private WebElement unTB;

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void setUserName(String un) {
        unTB.sendKeys(un);
    }
}
