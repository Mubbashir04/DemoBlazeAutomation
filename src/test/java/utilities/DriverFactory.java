package utilities;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	private WebDriver driver;

	private ConfigReader config;

	public WebDriver initializeDriver() {
		config = new ConfigReader();

		String browser = config.getProperty("browser");

		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();

			driver = new ChromeDriver();
		}

		else if (browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();

			driver = new EdgeDriver();
		}

		else if (browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();

			driver = new FirefoxDriver();
		}

		else {
			System.out.println("Invalid Browser Name");
		}

		driver.manage().window().maximize();

		int waitTime = Integer.parseInt(config.getProperty("implicitWait"));

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(waitTime));

		return driver;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public void quitBrowser() {
		if (driver != null) {
			driver.quit();
		}
	}
}