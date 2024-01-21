Feature: Use google search
  @GoogleSearch
  Scenario Outline: Google search and validation
    Given User is on google home page
    When User enters <Query> into search bar and clicks search
    Then Validate search results for <Query>

  Examples: 
  | Query |
  | espn  |
  | fiserv |
