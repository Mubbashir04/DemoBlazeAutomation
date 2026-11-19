package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.WaitUtility;

public class ProductPage {
	private WebDriver driver;

	private WaitUtility waitUtility;

	@FindBy(linkText = "Add to cart")
	private WebElement addToCartLink;

	@FindBy(css = "h2.name")
	private WebElement productName;

	@FindBy(css = "h3.price-container")
	private WebElement productPrice;

	public ProductPage(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);

		waitUtility = new WaitUtility(driver);
	}

	public String getProductName() {
		waitUtility.waitForVisibility(productName, 10);
		return productName.getText();
	}

	public String getProductPrice() {
		waitUtility.waitForVisibility(productPrice, 10);
		return productPrice.getText();
	}

	public void clickAddToCart() {
		waitUtility.waitForClickable(addToCartLink, 10);
		addToCartLink.click();
	}

	public String getAddToCartAlertMessage() {
		Alert alert = waitUtility.waitForAlert(10);

		return alert.getText();
	}

	public void acceptAddToCartAlert() {
		Alert alert = waitUtility.waitForAlert(10);

		alert.accept();
	}
}