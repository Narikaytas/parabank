package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.HomePage;
import pages.RegisterPage;

public class ResgisterPageTest {

	WebDriver driver;

	RegisterPage rp;
	HomePage hp;

	@Test(priority = 1)
	public void setup() {
		ChromeOptions options = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		hp = new HomePage(driver);
		rp = new RegisterPage(driver);
	}

	@Test(priority = 2)
	public void registerUser() {
		hp.clickOnRegisterLink();
		rp.enterFirstName();
		rp.enterLastName();
		rp.enteraddress();
		rp.enterCity();
		rp.enterState();
		rp.enterZipCode();
		rp.enterPhoneNumber();
		rp.enterSSNIdNumber();
		rp.enterUserName();
		rp.enterPassword();
		rp.re_EnterPassword();
		rp.registerButtonClick();

	}

}
