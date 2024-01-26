package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class YahooSearchResults {
	public WebDriver driver;
	
	public YahooSearchResults(WebDriver driver) {
		this.driver = driver;
	}

	By searchButton = By.xpath("//button[@id='ybar-search']");
	By searchBar = By.xpath("//input[@id='ybar-sbq']");
	By firstResult = By.xpath("//div[@class='compTitle options-toggle']/h3/a");

	public String firstResult() {
		return driver.findElement(firstResult).getAttribute("href");
	}
	
}
