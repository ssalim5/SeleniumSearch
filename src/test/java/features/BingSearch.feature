Feature: Use Bing search
  @BingSearch
  Scenario Outline: Bing search and validation
    Given User is on bing home page
    When User enters <Query> into bing search bar and clicks enter
    Then Validate bing search results for <Query>

  Examples: 
  | Query |
  | espn  |
  | fiserv|
  | disney|
  | facebook|
  |instagram|
  
  @BingSearch
  Scenario Outline: Bing search using button and validation
    Given User is on bing home page
    When User enters <Query> into bing search bar and clicks search
    Then Validate bing search results for <Query>

  Examples: 
  | Query |
  | espn  |
  | fiserv|
  | disney|
  | facebook|
  |instagram|
  
  @BingSearch
  Scenario Outline: Bing search and link validation
    Given User is on bing home page
    When User enters <Query> into bing search bar and clicks enter
    Then Validate first bing result link for <Query>

  Examples: 
  | Query |
  | espn  |
  | fiserv|
  | disney|
  | facebook|
  |instagram|
  