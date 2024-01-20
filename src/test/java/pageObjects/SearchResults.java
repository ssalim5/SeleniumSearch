package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchResults {
	public WebDriver driver;
	
	public SearchResults(WebDriver driver) {
		this.driver = driver;
	}

	By searchButton = By.xpath("//input[@class='gNO89b']");
	By searchBar = By.xpath("//textarea[@id='APjFqb']");
	By firstResult = By.xpath("//div[@id='search']//a[1]");

	public String firstResult() {
		return driver.findElement(firstResult).getAttribute("href");
	}
	
}
