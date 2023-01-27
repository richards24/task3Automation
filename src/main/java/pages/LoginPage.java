package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

	By usernameField = By.id("ap_email");
	By passwordField = By.name("password");
	By signInButton = By.id("signInSubmit");
	By continueBtn = By.id("continue");
	
	WebDriver driver;
	WebDriverWait wait;

	public LoginPage(WebDriver driver) {
		this.driver=driver; 
		wait = new WebDriverWait(driver, 10);
	}
	public void typeUsername(String username) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(usernameField)).isDisplayed();
		driver.findElement(usernameField).sendKeys(username);
	}
	public void typePassword(String password) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(passwordField)).isDisplayed();
		driver.findElement(passwordField).sendKeys(password);
	}
	public void clickSignIn() {
		driver.findElement(signInButton).click();
	}
	public void clickContinue()  {
		driver.findElement(continueBtn).click();
	}
}
