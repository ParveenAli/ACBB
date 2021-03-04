Feature: Check Header Link
  @header
 Scenario Outline:  Verify Header LinK
    Given I navigate to BBC page
    When I click <headerlink>
    Then I see <headerlink> page loads

    Examples:
    | headerlink|
    | News        |
    | Sport       |
    |weather      |
    |iPlayer     |
    |Sound       |
    |CBBC        |

