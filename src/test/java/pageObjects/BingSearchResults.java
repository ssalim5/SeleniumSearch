package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BingSearchResults {
	public WebDriver driver;
	
	public BingSearchResults(WebDriver driver) {
		this.driver = driver;
	}

	By searchBar = By.xpath("//textarea[@id='sb_form_q']");
	By firstResultLink = By.xpath("//h2[1]/a");
	By searchButton = By.xpath("//label[@id='search_icon']");


	public WebElement firstResultLink() {
		return driver.findElement(firstResultLink);
	}
	public void selectFirstResult() {
		driver.findElement(firstResultLink).click();
//		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(1));
	}
	
}
