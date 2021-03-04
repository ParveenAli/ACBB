Feature: More
  @more
  Scenario: Check more page
    Given I navigate to BBC page
    When I click on More
    And I click on Arts
    Then I see Arts page successfully