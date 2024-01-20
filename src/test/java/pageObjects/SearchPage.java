package pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchPage {
	public WebDriver driver;
	
	public SearchPage(WebDriver driver) {
		this.driver = driver;
	}

	By searchButton = By.xpath("//input[@class='gNO89b']");
	By searchBar = By.xpath("//textarea[@id='APjFqb']");
	By espnResults = By.xpath("//div[@id='search']//a[1]");

	
	public void enterSearchQuery(String query) {
	    driver.findElement(searchBar).sendKeys(query);
	}
	
	public void getSearchText() {
		driver.findElement(searchBar).getText();
	}
	
	public void search() {
		driver.findElement(searchButton).click();
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='search']")));
	}
	
	public String getTitleSearchPage() {
		return driver.getTitle();
	}
	
}
