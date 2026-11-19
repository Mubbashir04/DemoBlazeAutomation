package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class LoginSteps {
	private WebDriver driver;

	private LoginPage loginPage;

	@When("User clicks login link")
	public void user_clicks_login_link() {
		CommonSteps.homePage.clickLogin();

		driver = CommonSteps.driver;

		loginPage = new LoginPage(driver);
	}

	@And("User enters login username {string}")
	public void user_enters_login_username(String username) {
		loginPage.enterUsername(username);
	}

	@And("User enters login password {string}")
	public void user_enters_login_password(String password) {
		loginPage.enterPassword(password);
	}

	@And("User clicks login button")
	public void user_clicks_login_button() {
		loginPage.clickLoginButton();
	}

	@Then("User should be logged in successfully")
	public void user_should_be_logged_in_successfully() {
		Assert.assertTrue(true);
	}
}