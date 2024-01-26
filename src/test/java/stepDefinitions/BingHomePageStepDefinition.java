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

public class BingHomePageStepDefinition {
	
	public WebDriver driver;
	public BingSearchPage bingSearchPage;
	public BingSearchResults bingSearchResults;
	TestContextSetup testContextSetup;
	
	public BingHomePageStepDefinition(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;
		this.bingSearchPage = testContextSetup.pageObjectManager.getBingSearchPage();
		this.bingSearchResults = testContextSetup.pageObjectManager.getBingSearchResults();
	}

	@Given("User is on bing home page")
	public void user_is_on_bing_home_page() {
		Assert.assertTrue(bingSearchPage.getTitleSearchPage().contains("Bing"));
	}
	
	@When("^User enters (.+) into bing search bar and clicks enter$")
	public void user_enters_query_into_bing_search_bar_and_clicks_enter(String query) {
	    bingSearchPage.enterSearchQuery(query);
	    bingSearchPage.search();
	}
	
	@When("^User enters (.+) into bing search bar and clicks search$")
	public void user_enters_query_into_bing_search_bar_and_clicks_search(String query) {
	    bingSearchPage.enterSearchQuery(query);
	    bingSearchPage.clickSearch();
	}
	
}
