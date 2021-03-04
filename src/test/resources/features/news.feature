Feature: News
  @news
  Scenario: Check news page
    Given I navigate to BBC page
    When I click on News
    Then I see News page successfully