Feature: AddProject
  @addproject
  Scenario: Add user to the project successfully
    Given I navigate to BMIintouch page
    When I login with my valid details
    And  I click on team icon
    And I click on add project
    And I click on flat roof box
    Then I user is added successfully


