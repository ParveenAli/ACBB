Feature: AddNumber
  @addnumber
  Scenario: Add number successfully
    Given I navigate to BMIintouch page
    When I login with my valid details
    And I click on my  profile button
    And I click on edit button
    And I entre number
    Then I save number successfully