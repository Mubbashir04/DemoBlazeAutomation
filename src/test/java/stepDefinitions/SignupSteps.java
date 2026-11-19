package stepDefinitions;

import org.testng.Assert;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SignUpPage;

public class SignupSteps {
	private SignUpPage signUpPage;

	private String alertMessage;

	@When("User clicks signup link")
	public void user_clicks_signup_link() {
		CommonSteps.homePage.clickSignUp();

		signUpPage = new SignUpPage(CommonSteps.driver);
	}

	@And("User enters signup username {string}")
	public void user_enters_signup_username(String username) {
		signUpPage.enterUsername(username);
	}

	@And("User enters signup password {string}")
	public void user_enters_signup_password(String password) {
		signUpPage.enterPassword(password);
	}

	@And("User clicks signup button")
	public void user_clicks_signup_button() {
		signUpPage.clickSignUpButton();

		alertMessage = signUpPage.getAlertMessage();

		signUpPage.acceptAlert();
	}

	@Then("User should signup successfully")
	public void user_should_signup_successfully() {
		Assert.assertNotNull(alertMessage);
	}
}