Feature: Weather
  @weather
  Scenario: Check weather page
    Given I navigate to BBC page
    When I click on weather
    Then I see weather page successfully