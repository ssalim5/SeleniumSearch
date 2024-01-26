package pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class YahooSearchResults {
	public WebDriver driver;
	
	public YahooSearchResults(WebDriver driver) {
		this.driver = driver;
	}

	By searchButton = By.xpath("//button[@id='ybar-search']");
	By searchBar = By.xpath("//input[@id='ybar-sbq']");
	By firstResultLink = By.xpath("//div[@class='compTitle options-toggle']/h3/a");

	public WebElement firstResultLink() {
		return driver.findElement(firstResultLink);
	}
	
	public void selectFirstResult() {
		driver.findElement(firstResultLink).click();
//		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(1));
	}
	
}
