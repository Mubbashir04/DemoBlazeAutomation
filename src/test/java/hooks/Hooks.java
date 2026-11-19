package hooks;

import org.openqa.selenium.WebDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import utilities.ConfigReader;
import utilities.DriverFactory;
import io.cucumber.java.Scenario;
import utilities.ScreenshotUtility;

public class Hooks {
	public static WebDriver driver;

	private DriverFactory driverFactory;

	@Before
	public void startBrowser() {
		driverFactory = new DriverFactory();

		driver = driverFactory.initializeDriver();

		ConfigReader config = new ConfigReader();

		driver.get(config.getProperty("url"));
	}

	@After
	public void tearDown(Scenario scenario) {
		if (scenario.isFailed()) {
			ScreenshotUtility.captureScreenshot(driver, scenario.getName());
		}

		driverFactory.quitBrowser();
	}
}