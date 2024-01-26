package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BingSearchResults {
	public WebDriver driver;
	
	public BingSearchResults(WebDriver driver) {
		this.driver = driver;
	}

	By searchBar = By.xpath("//textarea[@id='sb_form_q']");
	By firstResult = By.xpath("//ol[@id='b_results']/li[1]/h2/a");
	By searchButton = By.xpath("//label[@id='search_icon']");


	public String firstResult() {
		return driver.findElement(firstResult).getText();
	}
	
}
