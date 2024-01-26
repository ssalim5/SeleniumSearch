package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.BingSearchPage;
import pageObjects.BingSearchResults;
import pageObjects.GoogleSearchPage;
import pageObjects.GoogleSearchResults;
import utils.TestContextSetup;

public class BingSearchResultsStepDefinition {
	
	public WebDriver driver;
	public BingSearchPage bingSearchPage;
	public BingSearchResults bingSearchResults;
	TestContextSetup testContextSetup;
	
	public BingSearchResultsStepDefinition(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;
		this.bingSearchPage = testContextSetup.pageObjectManager.getBingSearchPage();
		this.bingSearchResults = testContextSetup.pageObjectManager.getBingSearchResults();
	}
	
	@Then("^Validate bing search results for (.+)$")
	public void perform__bing_search_and_validate_results(String query) {
	    Assert.assertTrue(bingSearchResults.firstResult().contains(query));
	}
	
}
