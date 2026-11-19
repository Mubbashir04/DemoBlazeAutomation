package stepDefinitions;

import org.testng.Assert;
import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CartPage;
import pages.ProductPage;
import pages.PurchasePage;

public class PurchaseSteps {

	private ProductPage productPage;

	private CartPage cartPage;

	private PurchasePage purchasePage;

	private String confirmationMessage;

	@When("User selects product {string}")
	public void user_selects_product(String productName) {
		CommonSteps.homePage.clickProduct(productName);

		productPage = new ProductPage(Hooks.driver);
	}

	@And("User adds the product to cart")
	public void user_adds_the_product_to_cart() {
		productPage.clickAddToCart();

		productPage.acceptAddToCartAlert();
	}

	@And("User navigates to cart page")
	public void user_navigates_to_cart_page() {
		CommonSteps.homePage.clickCart();

		cartPage = new CartPage(Hooks.driver);
	}

	@And("User places an order")
	public void user_places_an_order() {
		cartPage.clickPlaceOrder();

		purchasePage = new PurchasePage(CommonSteps.driver);

		purchasePage.waitForPurchaseForm();
	}

	@And("User enters purchase details")
	public void user_enters_purchase_details() {
		purchasePage.completePurchase("Edureka", "India", "Delhi", "1234567890123456", "11", "2026");

		confirmationMessage = purchasePage.getConfirmationMessage();
	}

	@Then("Purchase should be completed successfully")
	public void purchase_should_be_completed_successfully() {
		Assert.assertEquals(confirmationMessage, "Thank you for your purchase!");

		purchasePage.clickConfirmationOk();

	}
}