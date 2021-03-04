Feature: Bcc Page
  @bcc
  Scenario: Login is successful
    Given I navigate to BBC page
    When  I click signin link
    And   I enter my valid userdetails
    And   I click login
    And  I am able to login successfully
    And  I click on search
    Then I click on Arts

