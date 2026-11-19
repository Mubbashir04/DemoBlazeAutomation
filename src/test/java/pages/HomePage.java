package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;

	@FindBy(id = "signin2")
	WebElement signUpLink;

	@FindBy(id = "login2")
	WebElement loginLink;

	@FindBy(id = "cartur")
	WebElement cartLink;

	public HomePage(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);
	}

	public void clickSignUp() {
		signUpLink.click();
	}

	public void clickLogin() {
		loginLink.click();
	}

	public void clickCart() {
		cartLink.click();
	}

	public void clickProduct(String productName) {
		driver.findElement(org.openqa.selenium.By.linkText(productName)).click();
	}
}