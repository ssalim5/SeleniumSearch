package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	
	public WebDriver driver;
	public GoogleSearchPage googleSearchPage;
	public GoogleSearchResults googleSearchResults;
	
	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}
	
	public GoogleSearchPage getSearchPage() {
		googleSearchPage = new GoogleSearchPage(driver);
		return googleSearchPage;
	}
	
	public GoogleSearchResults getSearchResults() {
		googleSearchResults = new GoogleSearchResults(driver);
		return googleSearchResults;
	}
	
}
