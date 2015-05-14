Feature: Find A Retailer

  Scenario: A user wants to search using a postal code
    Given the user is in the Find a Retailer landing page
    When a user enters "3000"
    And clicks on search button
    Then result should be shown
    And the user closes the browser

  Scenario: A user wants to search using a suburb
    Given the user is in the Find a Retailer landing page
    When a user enters "Melbourne"
    Then result should be shown
    And the user closes the browser
