package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.FirstResult;
import pageObjects.GoogleSearchPage;
import pageObjects.GoogleSearchResults;
import pageObjects.YahooSearchResults;
import utils.TestContextSetup;

public class GoogleSearchResultsStepDefinition {
	
	public WebDriver driver;
	public GoogleSearchPage googleSearchPage;
	public GoogleSearchResults googleSearchResults;
	public FirstResult firstResult;
	TestContextSetup testContextSetup;
	
	public GoogleSearchResultsStepDefinition(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;
		this.googleSearchPage = testContextSetup.pageObjectManager.getGoogleSearchPage();
		this.googleSearchResults = testContextSetup.pageObjectManager.getGoogleSearchResults();
		this.firstResult = testContextSetup.pageObjectManager.getFirstResult();
	}
	
	@Then("^Validate google search results for (.+)$")
	public void perform_google_search_and_validate_results(String query) {
	    Assert.assertTrue(googleSearchResults.firstResult().getAttribute("href").contains(query));
	}
	
	@Then("^Validate first google result link for (.+)$")
	public void validate_first_google_link(String query) {
		GoogleSearchResults googleSearchResults = testContextSetup.pageObjectManager.getGoogleSearchResults();
		googleSearchResults.selectFirstResult();
	    Assert.assertTrue(firstResult.getFirstResultTitle().toLowerCase().contains(query));
	}
	
}
