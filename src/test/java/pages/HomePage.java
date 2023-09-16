package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	WebDriver driver;

	By userNameInputBox = By.name("username");
	By passwordInputBox = By.name("password");
	By homePageLoginButton = By.xpath("//input[@value=\"Log In\"]");
	By forgetLoginInfoLink = By.linkText("Forgot login info?");
	By registerLink = By.linkText("Register");

	public HomePage(WebDriver dr) {
		this.driver = dr;
	}
	RegisterPage RPString = new RegisterPage(driver);
	public void enterUserName() {
		driver.findElement(userNameInputBox).sendKeys(RPString.UserName);
	}

	public void enterPassword() {
		driver.findElement(passwordInputBox).sendKeys(RPString.Password);
	}

	public void clickOnHomePageLoginButton() {
		driver.findElement(homePageLoginButton).click();
	}

	public void clickOnForgetLoginLink() {
		driver.findElement(forgetLoginInfoLink).click();
	}

	public void clickOnRegisterLink() {
		driver.findElement(registerLink).click();
	}

}
