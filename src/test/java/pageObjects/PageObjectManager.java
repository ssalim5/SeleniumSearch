package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	
	public WebDriver driver;
	public GoogleSearchPage googleSearchPage;
	public GoogleSearchResults googleSearchResults;
	public BingSearchPage bingSearchPage;
	public BingSearchResults bingSearchResults;
	
	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}
	
	public GoogleSearchPage getGoogleSearchPage() {
		googleSearchPage = new GoogleSearchPage(driver);
		return googleSearchPage;
	}
	
	public GoogleSearchResults getGoogleSearchResults() {
		googleSearchResults = new GoogleSearchResults(driver);
		return googleSearchResults;
	}
	
	public BingSearchPage getBingSearchPage() {
		bingSearchPage = new BingSearchPage(driver);
		return bingSearchPage;
	}
	
	public BingSearchResults getBingSearchResults() {
		bingSearchResults = new BingSearchResults(driver);
		return bingSearchResults;
	}
	
}
