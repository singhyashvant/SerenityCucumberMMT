Feature: Flight search

  Scenario Outline: Search for flight with source and destinations
    Given user is on homepage
    When user provides the "<source>" and "<destination>" in the search criteria
    Then user should be able to see the search results
    Examples:
      | source     | destination         |
      | LONDON     | DUBAI               |

  Scenario: Search for flights
    Given user is on homepage
    When user provides the "Inv@l1D Ch@7@ct3r" special characters in the source
    Then user should be able to see the error message for invalid flight source

