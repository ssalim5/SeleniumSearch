package pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BingSearchPage {
	public WebDriver driver;
	
	public BingSearchPage(WebDriver driver) {
		this.driver = driver;
	}

	By searchBar = By.xpath("//textarea[@id='sb_form_q']");
	By searchBar2 = By.xpath("//textarea[@type='search']");
	By searchButton = By.xpath("//label[@id='search_icon']");
	
	public void enterSearchQuery(String query) {
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@id='sb_form_q']")));
		WebElement s = driver.findElement(searchBar);
		s.click();
	    WebElement s2 = driver.findElement(searchBar2);
	    s2.sendKeys(query);
	}
	
	public void getSearchText() {
		driver.findElement(searchBar).getText();
	}
	
	public void search() {
		driver.findElement(searchBar).sendKeys(Keys.ENTER);
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ol[@id='b_results']")));
	}
	
	public void clickSearch() {
		driver.findElement(searchButton).click();
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ol[@id='b_results']")));
	}
	
	public String getTitleSearchPage() {
		return driver.getTitle();
	}
	
}
