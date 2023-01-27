package tests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import pages.LoginPage;
import pages.BasePage;
import pages.HomePage;

public class LoginPageTest extends BasePage{
	
	@Test(priority=0)
	public void navigateToLoginPage() {
		HomePage homePage = new HomePage(driver);
		homePage.acceptCookies();
		homePage.hoverOverUserTab();
		homePage.clickSigninLink();
		logger.log(LogStatus.INFO, "Clicking the 'Sign in' link");
	}
	@Test(priority=1)
	@Parameters({"username", "password"})
	public void verifyLogin(String username, String password) { 
		LoginPage login = new LoginPage(driver);
		login.typeUsername(username);
		logger.log(LogStatus.INFO, "Entering valid username");
		login.clickContinue();
		login.typePassword(password);
		logger.log(LogStatus.INFO, "Entering valid password");
		login.clickSignIn();
		logger.log(LogStatus.INFO, "Clicking Sign in button");
	}
}	
