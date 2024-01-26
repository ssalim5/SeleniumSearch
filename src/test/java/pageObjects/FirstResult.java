package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FirstResult {
	public WebDriver driver;
	
	public FirstResult(WebDriver driver) {
		this.driver = driver;
	}
	
	public String getFirstResultTitle() {
		return driver.getTitle();
	}
	
}
