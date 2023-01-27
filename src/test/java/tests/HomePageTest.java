package tests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
import pages.BasePage;
import pages.HomePage;

public class HomePageTest extends BasePage {

    @Test(priority=0)
    @Parameters({"searchItems"})
    public void verifySearchingItem(String searchItems) {
        HomePage homePage = new HomePage(driver);
        homePage.searchItem(searchItems);
        logger.log(LogStatus.INFO, "Searching item");
    }
}