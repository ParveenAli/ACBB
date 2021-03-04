Feature: Link
  @link
  Scenario: Load BMIRoof
    Given I navigate to BMIintouch page
    When I login with my valid details
    And I clickmieilink
    And I clickappBMIRoofPro
    Then I see BMIRoofPro page successfully