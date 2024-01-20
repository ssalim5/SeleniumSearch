package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	
	public WebDriver driver;
	public SearchPage searchPage;
	public SearchResults searchResults;
	
	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}
	
	public SearchPage getSearchPage() {
		searchPage = new SearchPage(driver);
		return searchPage;
	}
	
	public SearchResults getSearchResults() {
		searchResults = new SearchResults(driver);
		return searchResults;
	}
	
}
