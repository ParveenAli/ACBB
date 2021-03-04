Feature: ChangePassword
  @regression
Scenario: Change password successfully
Given I navigate to BMIIntouch page
When  I login with my user details
And   I click on my  profile icon
And I change to new password
Then I see password change successfully