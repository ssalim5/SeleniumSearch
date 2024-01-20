package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage {
	public WebDriver driver;
	
	public SearchPage(WebDriver driver) {
		this.driver = driver;
	}

	By searchButton = By.xpath("//input[@class='gNO89b']");
	By searchBar = By.xpath("//textarea[@id='APjFqb']");
	
	public void enterSearchQuery(String query) {
	    driver.findElement(searchBar).sendKeys(query);
	}
	
	public void getSearchText() {
		driver.findElement(searchBar).getText();
	}
	
	public void search() {
		driver.findElement(searchButton).click();
	}
	
	public String getTitleSearchPage() {
		return driver.getTitle();
	}
	
}
