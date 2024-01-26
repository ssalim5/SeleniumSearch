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

public class GoogleHomePageStepDefinition {
	
	public WebDriver driver;
	public GoogleSearchPage googleSearchPage;
	public GoogleSearchResults googleSearchResults;
	TestContextSetup testContextSetup;
	
	public GoogleHomePageStepDefinition(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;
		this.googleSearchPage = testContextSetup.pageObjectManager.getGoogleSearchPage();
		this.googleSearchResults = testContextSetup.pageObjectManager.getGoogleSearchResults();
	}

	@Given("User is on google home page")
	public void user_is_on_google_home_page() {
		Assert.assertTrue(googleSearchPage.getTitleSearchPage().contains("Google"));
	}
	
	@When("^User enters (.+) into google search bar and clicks enter$")
	public void user_enters_query_into_google_search_bar_and_clicks_enter(String query) {
	    googleSearchPage.enterSearchQuery(query);
	    googleSearchPage.search();
	}
	
	@When("^User enters (.+) into google search bar and clicks search$")
	public void user_enters_query_into_google_search_bar_and_clicks_search(String query) {
	    googleSearchPage.enterSearchQuery(query);
	    googleSearchPage.clickSearch();
	}
	
}
