package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.github.javafaker.Faker;

public class RegisterPage {
		
	WebDriver driver;
	Faker fakeData = new Faker();
 	
	By firstNameInputBox = By.id("customer.firstName");
	By lastNameInputBox = By.id("customer.lastName");
	By addressInputBox = By.id("customer.address.street");
	By cityInputBox = By.id("customer.address.city");
	By stateInputBox = By.id("customer.address.state");
	By zipCodeInputBox = By.id("customer.address.zipCode");
	By phoneNumberInputBox = By.id("customer.phoneNumber");
	By ssnInputBox = By.id("customer.ssn");
	By usernameInputBox_RegistrationPage = By.id("customer.username");
	By passwordInputBox_RegistrationPage = By.id("customer.password");
	By repeatedPasswordInputBox = By.id("repeatedPassword");
	By registerButton = By.xpath("//input[@value=\"Register\"]");
	
	public RegisterPage(WebDriver dr)
	{
		this.driver=dr;
	}
	
	public void enterFirstName() {
		driver.findElement(firstNameInputBox).sendKeys(fakeData.name().firstName());
	}
	public void enterLastName() {
		driver.findElement(lastNameInputBox).sendKeys(fakeData.name().lastName());
	}
	public void enteraddress() {
		driver.findElement(addressInputBox).sendKeys(fakeData.address().streetAddress());
	}
	public void enterCity() {
		driver.findElement(cityInputBox).sendKeys(fakeData.address().cityName());
	}
	public void enterState() {
		driver.findElement(stateInputBox).sendKeys(fakeData.address().state());
	}
	public void enterZipCode() {
		driver.findElement(zipCodeInputBox).sendKeys(fakeData.address().zipCode());
	}
	public void enterPhoneNumber() {
		driver.findElement(phoneNumberInputBox).sendKeys(fakeData.phoneNumber().cellPhone());
	}
	public void enterSSNIdNumber() {
		driver.findElement(ssnInputBox).sendKeys(fakeData.number().digits(9));
	}
	public String UserName = fakeData.name().username();
	public void enterUserName() {
		driver.findElement(usernameInputBox_RegistrationPage).sendKeys(UserName);
	}
	public String Password = fakeData.internet().password(10, 20, true, true, true);
	public void enterPassword() {
		
		driver.findElement(passwordInputBox_RegistrationPage).sendKeys(Password);
	}
	public void re_EnterPassword() {
		driver.findElement(repeatedPasswordInputBox).sendKeys(Password);
	}
	public void registerButtonClick() {
		driver.findElement(registerButton).click();
	}

	
	 
	
	
	

}
