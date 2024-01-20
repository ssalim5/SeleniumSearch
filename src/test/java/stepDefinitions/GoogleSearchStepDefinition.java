package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.SearchPage;
import utils.TestContextSetup;

public class GoogleSearchStepDefinition {
	
	public WebDriver driver;
	public String landingPageProductName;
	public String offerPageProductName;
	public SearchPage searchPage;
	TestContextSetup testContextSetup;
	
	public GoogleSearchStepDefinition(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;
		this.searchPage = testContextSetup.pageObjectManager.getSearchPage();
	}

	@Given("User is on google home page")
	public void user_is_on_google_home_page() {
		Assert.assertTrue(searchPage.getTitleSearchPage().contains("Google"));

	}
//	^user searched with Shortname (.+) and extracted actual name of product$
	@When("^User enters (.+) into search bar and clicks search$")
	public void user_enters_query_into_search_bar_and_clicks_search(String query) {
	    searchPage.enterSearchQuery(query);
	}
	@Then("Perform search and validate results")
	public void perform_search_and_validate_results() {
	    searchPage.search();
	}
	
}
