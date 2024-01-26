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
import pageObjects.FirstResult;
import pageObjects.BingSearchPage;
import pageObjects.BingSearchResults;
import utils.TestContextSetup;


public class BingSearchResultsStepDefinition {
	
	public WebDriver driver;
	public BingSearchPage bingSearchPage;
	public BingSearchResults bingSearchResults;
	public FirstResult firstResult;
	TestContextSetup testContextSetup;
	
	public BingSearchResultsStepDefinition(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;
		this.bingSearchPage = testContextSetup.pageObjectManager.getBingSearchPage();
		this.bingSearchResults = testContextSetup.pageObjectManager.getBingSearchResults();
		this.firstResult = testContextSetup.pageObjectManager.getFirstResult();
	}
	
	@Then("^Validate bing search results for (.+)$")
	public void perform__bing_search_and_validate_results(String query) {
		System.out.println("SEARCH RESULTS: " + bingSearchResults.firstResultLink().getText());
	    Assert.assertTrue(bingSearchResults.firstResultLink().getText().toLowerCase().contains(query));
	}
	
	@Then("^Validate first bing result link for (.+)$")
	public void validate_first_bing_link(String query) {
		BingSearchResults bingSearchResults = testContextSetup.pageObjectManager.getBingSearchResults();
		bingSearchResults.selectFirstResult();
	    Assert.assertTrue(firstResult.getFirstResultTitle().toLowerCase().contains(query));
	}
	
}
