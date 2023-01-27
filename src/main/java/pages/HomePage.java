package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	By signinButton  = By.className("nav-action-inner");
	By searchBar = By.id("twotabsearchtextbox");
	By searchBtn= By.id("nav-search-submit-button");
	By cookieBtn= By.id("sp-cc-accept");
	By userTab = By.id("nav-link-accountList-nav-line-1");
	WebDriver driver;
	WebDriverWait wait;
	public HomePage(WebDriver driver) {
		this.driver=driver;
		wait = new WebDriverWait(driver, 5);
	}
	public void clickSigninLink() {
		 wait.until(ExpectedConditions.elementToBeClickable(signinButton));
		 driver.findElement(signinButton).click();
	}
	public void searchItem(String item)
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(searchBar)).isDisplayed();
		driver.findElement(searchBar).sendKeys(item);
		driver.findElement(searchBtn).click();
	}
	public void hoverOverUserTab() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(userTab)).isDisplayed();
		new Actions(driver).moveToElement(driver.findElement(userTab)).perform();
	}

	public void acceptCookies() {
		if(driver.findElement(cookieBtn).isDisplayed())
		{
			driver.findElement(cookieBtn).click();
		}
	}
}
