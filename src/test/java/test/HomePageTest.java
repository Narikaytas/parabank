package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.HomePage;

public class HomePageTest {

	WebDriver driver;

	HomePage hp;

	@Test(priority = 1)
	public void setup() {
		 ChromeOptions options = new ChromeOptions();
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(options);
			driver.manage().window().maximize();
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		hp = new HomePage(driver);
	}
	
	@Test(priority = 2)
	public void registerUser() {
		hp.enterUserName();
		hp.enterPassword();
		hp.clickOnHomePageLoginButton();
	}

}
