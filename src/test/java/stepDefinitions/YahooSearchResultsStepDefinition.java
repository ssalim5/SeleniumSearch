package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.FirstResult;
import pageObjects.YahooSearchPage;
import pageObjects.YahooSearchResults;
import utils.TestContextSetup;

public class YahooSearchResultsStepDefinition {
	
	public WebDriver driver;
	public YahooSearchPage yahooSearchPage;
	public YahooSearchResults yahooSearchResults;
	public FirstResult firstResult;
	TestContextSetup testContextSetup;
	
	public YahooSearchResultsStepDefinition(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;
		this.yahooSearchPage = testContextSetup.pageObjectManager.getYahooSearchPage();
		this.yahooSearchResults = testContextSetup.pageObjectManager.getYahooSearchResults();
		this.firstResult = testContextSetup.pageObjectManager.getFirstResult();
	}
	
	@Then("^Validate yahoo search results for (.+)$")
	public void perform_yahoo_search_and_validate_results(String query) {
	    Assert.assertTrue(yahooSearchResults.firstResultLink().getAttribute("href").contains(query));
	}
	
	@Then("^Validate first yahoo result link for (.+)$")
	public void validate_first_yahoo_link(String query) {
		switchToFirstResult();
	    Assert.assertTrue(firstResult.getFirstResultTitle().toLowerCase().contains(query));
	}
	
	public void switchToFirstResult() {
		YahooSearchResults yahooSearchResults = testContextSetup.pageObjectManager.getYahooSearchResults();
		yahooSearchResults.selectFirstResult();
		testContextSetup.genericUtils.switchWindowToChild();
		
	}
	
}
