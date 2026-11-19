package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.WaitUtility;

public class CartPage {
	private WebDriver driver;

	private WaitUtility waitUtility;

	@FindBy(xpath = "//button[text()='Place Order']")
	private WebElement placeOrderButton;

	public CartPage(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);

		waitUtility = new WaitUtility(driver);
	}

	public boolean isProductPresentInCart(String productName) {
		try {
			driver.findElement(By.xpath("//td[text()='" + productName + "']"));

			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public void clickPlaceOrder() {
		waitUtility.waitForClickable(placeOrderButton, 10);

		placeOrderButton.click();
	}
}