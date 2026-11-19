package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.WaitUtility;

public class PurchasePage {
	private WebDriver driver;

	private WaitUtility waitUtility;

	@FindBy(id = "name")
	private WebElement nameTextbox;

	@FindBy(id = "country")
	private WebElement countryTextbox;

	@FindBy(id = "city")
	private WebElement cityTextbox;

	@FindBy(id = "card")
	private WebElement cardTextbox;

	@FindBy(id = "month")
	private WebElement monthTextbox;

	@FindBy(id = "year")
	private WebElement yearTextbox;

	@FindBy(xpath = "//button[text()='Purchase']")
	private WebElement purchaseButton;

	@FindBy(xpath = "//h2[text()='Thank you for your purchase!']")
	private WebElement confirmationMessage;

	@FindBy(xpath = "//button[text()='OK']")
	private WebElement confirmationOkButton;

	public PurchasePage(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);

		waitUtility = new WaitUtility(driver);
	}

	public void enterName(String name) {
		waitUtility.waitForVisibility(nameTextbox, 10);
		nameTextbox.clear();
		nameTextbox.sendKeys(name);
	}

	public void enterCountry(String country) {
		waitUtility.waitForVisibility(countryTextbox, 10);
		countryTextbox.clear();
		countryTextbox.sendKeys(country);
	}

	public void enterCity(String city) {
		waitUtility.waitForVisibility(cityTextbox, 10);
		cityTextbox.clear();
		cityTextbox.sendKeys(city);
	}

	public void enterCard(String card) {
		waitUtility.waitForVisibility(cardTextbox, 10);
		cardTextbox.clear();
		cardTextbox.sendKeys(card);
	}

	public void enterMonth(String month) {
		waitUtility.waitForVisibility(monthTextbox, 10);
		monthTextbox.clear();
		monthTextbox.sendKeys(month);
	}

	public void enterYear(String year) {
		waitUtility.waitForVisibility(yearTextbox, 10);
		yearTextbox.clear();
		yearTextbox.sendKeys(year);
	}

	public void clickPurchase() {
		waitUtility.waitForClickable(purchaseButton, 10);

		purchaseButton.click();
	}

	public void waitForPurchaseForm() {
		waitUtility.waitForVisibility(nameTextbox, 10);
	}

	public void completePurchase(String name, String country, String city, String card, String month, String year) {
		enterName(name);
		enterCountry(country);
		enterCity(city);
		enterCard(card);
		enterMonth(month);
		enterYear(year);

		clickPurchase();
	}

	public String getConfirmationMessage() {
		waitUtility.waitForVisibility(confirmationMessage, 10);

		return confirmationMessage.getText();
	}

	public void clickConfirmationOk() {
		waitUtility.waitForClickable(confirmationOkButton, 10);

		confirmationOkButton.click();
	}
}