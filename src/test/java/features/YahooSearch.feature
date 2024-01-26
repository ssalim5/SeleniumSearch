Feature: Use Yahoo search
  @YahooSearch
  Scenario Outline: Yahoo search and validation
    Given User is on yahoo home page
    When User enters <Query> into yahoo search bar and clicks enter
    Then Validate yahoo search results for <Query>

  Examples: 
  | Query |
  | espn  |
  | fiserv |
 
 	@YahooSearch
  Scenario Outline: Yahoo search using button and validation
    Given User is on yahoo home page
    When User enters <Query> into yahoo search bar and clicks search
    Then Validate yahoo search results for <Query>

  Examples: 
  | Query |
  | espn  |
  | fiserv |
