package pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class YahooSearchPage {
	public WebDriver driver;
	
	public YahooSearchPage(WebDriver driver) {
		this.driver = driver;
	}

	By searchButton = By.xpath("//button[@id='ybar-search']");
	By searchBar = By.xpath("//input[@id='ybar-sbq']");
	
	public void enterSearchQuery(String query) {
	    driver.findElement(searchBar).sendKeys(query);
	}
	
	public void getSearchText() {
		driver.findElement(searchBar).getText();
	}
	
	public void search() {
		driver.findElement(searchBar).sendKeys(Keys.ENTER);;
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(10));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='main']")));
	}
	
	public void clickSearch() {
		driver.findElement(searchButton).click();
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='main']")));
	}
	
	public String getTitleSearchPage() {
		return driver.getTitle();
	}
	
}
