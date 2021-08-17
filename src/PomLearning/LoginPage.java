package PomLearning;

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
    @FindBy(name = "pwd")
    private WebElement pwTB;
    @FindBy(xpath = "//div[text()='Login ']")
    private WebElement loginBTN;
    @FindBy(xpath = "//span[(contains[text(),'invalid')]")
    private WebElement errMsg;
    public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
    }

    public void setUserName(String un) {
        unTB.sendKeys(un);
    }

    public void setPassword(String pw) {
        pwTB.sendKeys(pw);
    }

    public void clickLogin() {
        loginBTN.click();
    }
     public void checkErrorMsg(){
         System.out.println(errMsg.isDisplayed());
     }

}
