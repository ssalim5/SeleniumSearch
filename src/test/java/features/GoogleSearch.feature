Feature: Use Google search
  @GoogleSearch
  Scenario Outline: Google search and validation
    Given User is on google home page
    When User enters <Query> into google search bar and clicks enter
    Then Validate google search results for <Query>

  Examples: 
  | Query |
  | espn  |
  | fiserv|
  | disney|
  | facebook|
  |instagram|
 
 	@GoogleSearch
  Scenario Outline: Google search using button and validation
    Given User is on google home page
    When User enters <Query> into google search bar and clicks search
    Then Validate google search results for <Query>

  Examples: 
  | Query |
  | espn  |
  | fiserv|
  | disney|
  | facebook|
  |instagram|
  
  @GoogleSearch
  Scenario Outline: Google search and link validation
    Given User is on google home page
    When User enters <Query> into google search bar and clicks enter
    Then Validate first google result link for <Query>

  Examples: 
  | Query |
  | espn  |
  | fiserv|
  | disney|
  | facebook|
  |instagram|
