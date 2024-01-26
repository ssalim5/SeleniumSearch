package pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleSearchResults {
	public WebDriver driver;
	
	public GoogleSearchResults(WebDriver driver) {
		this.driver = driver;
	}

	By searchButton = By.xpath("//input[@class='gNO89b']");
	By searchBar = By.xpath("//textarea[@id='APjFqb']");
	By firstResultLink = By.xpath("//div[@id='search']//a[1]");

	public WebElement firstResult() {
		return driver.findElement(firstResultLink);
	}
	
	public void selectFirstResult() {
		driver.findElement(firstResultLink).click();
//		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(1));
	}
	
}
