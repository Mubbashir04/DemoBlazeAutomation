package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.WaitUtility;

public class LoginPage {
	WebDriver driver;
	private WaitUtility waitUtility;

	@FindBy(id = "loginusername")
	WebElement usernameTextbox;

	@FindBy(id = "loginpassword")
	WebElement passwordTextbox;

	@FindBy(xpath = "//button[text()='Log in']")
	WebElement loginButton;

	public LoginPage(WebDriver driver) {
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

	public void clickLoginButton() {
		waitUtility.waitForClickable(loginButton, 10);

		loginButton.click();
	}

	public void login(String username, String password) {
		enterUsername(username);

		enterPassword(password);

		clickLoginButton();
	}
}