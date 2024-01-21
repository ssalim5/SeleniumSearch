# Search Engine Testing with Selenium
This repository tests Google's search engine to verify that the proper results being returned.
It is built using the Cucumber framework, Selenium WebDriver and testNG with modularity in mind.

## File Structure
src/test/java:

cucumberOptions/TestNGTestRunner:
- Test Runner that joins feature files and step definitions
- Parameters for plugins that introduce extent reports and html test reports

features/GoogleSearch.feature:
- Feature file with Scenario outline that can be edited to introduce more test cases

pageObjects:
- Central object manager, PageObjectManger, that returns required pages
Each pages is considered as its own class with locators and methods for accessing page elements and using features

stepDefinitions:
- Hooks file can be used to quit browser after each test and other utilities such as taking screenshots after a failed test
Each page has separate step definitions for testing each stage of the scenario outline

Utils:
- TestBase provides the webdriver and sets browser settings, properties and the url
- TestContextSetup provides the PageObjectManager to the step definition files

src/test/resources:
- Driver files, extent report properties adn global properties are served
