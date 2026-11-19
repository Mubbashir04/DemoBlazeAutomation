package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import utilities.DriverFactory;
import utilities.ExcelDataProvider;

public class LoginExcelTest
{
    @Test(dataProvider = "loginData", dataProviderClass = ExcelDataProvider.class)
    public void loginTest(String username, String password)
    {
        DriverFactory factory = new DriverFactory();

        WebDriver driver = factory.initializeDriver();

        driver.get("https://www.demoblaze.com/");

        HomePage home = new HomePage(driver);

        home.clickLogin();

        LoginPage login = new LoginPage(driver);

        login.enterUsername(username);

        login.enterPassword(password);

        login.clickLoginButton();

        System.out.println("Excel Driven Login Executed For: " + username);

        driver.quit();
    }
}
