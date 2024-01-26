package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.GoogleSearchPage;
import pageObjects.GoogleSearchResults;
import utils.TestContextSetup;

public class GoogleSearchResultsStepDefinition {
	
	public WebDriver driver;
	public GoogleSearchPage googleSearchPage;
	public GoogleSearchResults googleSearchResults;
	TestContextSetup testContextSetup;
	
	public GoogleSearchResultsStepDefinition(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;
		this.googleSearchPage = testContextSetup.pageObjectManager.getGoogleSearchPage();
		this.googleSearchResults = testContextSetup.pageObjectManager.getGoogleSearchResults();
	}
	
	@Then("^Validate google search results for (.+)$")
	public void perform_google_search_and_validate_results(String query) {
	    Assert.assertTrue(googleSearchResults.firstResult().contains(query));
	}
	
}
