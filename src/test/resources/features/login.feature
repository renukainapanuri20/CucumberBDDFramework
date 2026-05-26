Feature: Google Search Functionality

  Scenario: Search Selenium in Google

    Given user opens chrome browser
    When user opens Google homepage
    And user searches for "Selenium WebDriver"
    Then search results should appear