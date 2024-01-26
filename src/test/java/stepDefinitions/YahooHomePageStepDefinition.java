package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.YahooSearchPage;
import pageObjects.YahooSearchResults;
import utils.TestContextSetup;

public class YahooHomePageStepDefinition {
	
	public WebDriver driver;
	public YahooSearchPage yahooSearchPage;
	public YahooSearchResults yahooSearchResults;
	TestContextSetup testContextSetup;
	
	public YahooHomePageStepDefinition(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;
		this.yahooSearchPage = testContextSetup.pageObjectManager.getYahooSearchPage();
		this.yahooSearchResults = testContextSetup.pageObjectManager.getYahooSearchResults();
	}

	@Given("User is on yahoo home page")
	public void user_is_on_yahoo_home_page() {
		Assert.assertTrue(yahooSearchPage.getTitleSearchPage().contains("Yahoo"));
	}
	
	@When("^User enters (.+) into yahoo search bar and clicks enter$")
	public void user_enters_query_into_yahoo_search_bar_and_clicks_enter(String query) {
	    yahooSearchPage.enterSearchQuery(query);
	    yahooSearchPage.search();
	}
	
	@When("^User enters (.+) into yahoo search bar and clicks search$")
	public void user_enters_query_into_yahoo_search_bar_and_clicks_search(String query) {
	    yahooSearchPage.enterSearchQuery(query);
	    yahooSearchPage.clickSearch();
	}
	
}
