package tests;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import pages.BasePage;
import pages.CheckoutPage;

public class CheckoutTest extends BasePage{

	@Test(priority=0)
	public void verifySelectAnItem() {
		CheckoutPage checkoutPage = new CheckoutPage(driver);
		checkoutPage.selectAnItem();
		logger.log(LogStatus.INFO, "Selecting an item");
	}
	@Test(priority=1)
	public void verifyAddToCart() {
		CheckoutPage checkoutPage = new CheckoutPage(driver);
		checkoutPage.addToCart();
		logger.log(LogStatus.INFO, "Adding an item and navigating to checkout page");
		Assert.assertTrue(checkoutPage.isCheckOutPageLoaded());
	}
}
