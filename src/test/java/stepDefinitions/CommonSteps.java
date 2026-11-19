package stepDefinitions;

import org.openqa.selenium.WebDriver;
import hooks.Hooks;
import io.cucumber.java.en.Given;
import pages.HomePage;

public class CommonSteps {
	public static WebDriver driver;

	public static HomePage homePage;

	@Given("User launches DemoBlaze application")
	public void user_launches_demoblaze_application() {
		driver = Hooks.driver;

		homePage = new HomePage(driver);

		System.out.println("Application Launched");
	}
}