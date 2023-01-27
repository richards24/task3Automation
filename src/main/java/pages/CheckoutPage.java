package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckoutPage {
	
	By item = By.className("s-image");
	By buyNow = By.id("buy-now-button");
	WebDriver driver;
	WebDriverWait wait;
	
	public CheckoutPage(WebDriver driver) {
		this.driver=driver;
		wait = new WebDriverWait(driver, 5);
	}

	public void selectAnItem() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(item)).isDisplayed();
		driver.findElement(item).click();
	}

	public void addToCart() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(buyNow)).isDisplayed();
		driver.findElement(buyNow).click();
	}

	public boolean isCheckOutPageLoaded() {
		wait.until(ExpectedConditions.urlContains("https://www.amazon.de/gp/buy/addressselect"));
		return driver.getTitle().contains("Select a delivery address");

	}
}
