package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.WaitUtility;

public class SignUpPage {
	private WebDriver driver;

	private WaitUtility waitUtility;

	@FindBy(id = "sign-username")
	WebElement usernameTextbox;

	@FindBy(id = "sign-password")
	WebElement passwordTextbox;

	@FindBy(xpath = "//button[text()='Sign up']")
	WebElement signUpButton;

	public SignUpPage(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);

		waitUtility = new WaitUtility(driver);
	}

	public void enterUsername(String username) {
		waitUtility.waitForVisibility(usernameTextbox, 10);

		usernameTextbox.clear();

		usernameTextbox.sendKeys(username);
	}

	public void enterPassword(String password) {
		waitUtility.waitForVisibility(passwordTextbox, 10);

		passwordTextbox.clear();

		passwordTextbox.sendKeys(password);
	}

	public void clickSignUpButton() {
		waitUtility.waitForClickable(signUpButton, 10);

		signUpButton.click();
	}

	public void signUp(String username, String password) {
		enterUsername(username);

		enterPassword(password);

		clickSignUpButton();
	}

	public String getAlertMessage() {
		Alert alert = waitUtility.waitForAlert(10);

		return alert.getText();
	}

	public void acceptAlert() {
		Alert alert = waitUtility.waitForAlert(10);

		alert.accept();
	}
}