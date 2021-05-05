Feature: Hotel search

  Scenario Outline: Search for hotels with destinations
    Given user is on homepage
    When user selects the hotels with "<destinations>" as destination
    Then user should be able to see the hotel search results
    Examples:
    | destinations        |
    | DUBAI               |

  Scenario: Search for flights
    Given user is on homepage
    When user provides the "$pec1@l Ch@7@ct3r" special characters in the hotel search
    Then user should be able to see the error message for invalid hotel search

