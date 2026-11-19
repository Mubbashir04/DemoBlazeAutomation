package utilities;

import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtility {
	private WebDriver driver;

	public WaitUtility(WebDriver driver) {
		this.driver = driver;
	}

	public void waitForVisibility(WebElement element, int seconds) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));

		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public void waitForClickable(WebElement element, int seconds) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));

		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	public void fluentWait(WebElement element, int timeout, int pollingTime) {
		FluentWait<WebDriver> wait = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(timeout))
				.pollingEvery(Duration.ofSeconds(pollingTime)).ignoring(NoSuchElementException.class);

		wait.until(driver -> element.isDisplayed());
	}
	
	public Alert waitForAlert(int seconds)
	{
	    WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(seconds));

	    return wait.until(ExpectedConditions.alertIsPresent());
	}
}