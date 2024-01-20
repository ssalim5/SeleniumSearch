package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	
	public WebDriver driver;
	public SearchPage searchPage;
	
	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}
	
	public SearchPage getSearchPage() {
		searchPage = new SearchPage(driver);
		return searchPage;
	}
	
}
