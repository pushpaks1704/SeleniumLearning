package PomLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class TestLoginPage {
	static {
		String key = "webdriver.chrome.driver";
		String value = "./driver/chromedriver";
		System.setProperty(key, value);
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		LoginPage loginPage = new LoginPage(driver);
		loginPage.setUserName("abc");
		loginPage.setPassword("abc");
		loginPage.clickLogin();
		loginPage.checkErrorMsg();
		loginPage.setUserName("abc");
		loginPage.setPassword("abc");
		loginPage.clickLogin();
		loginPage.checkErrorMsg();

	}

}
