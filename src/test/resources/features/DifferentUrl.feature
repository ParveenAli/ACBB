Feature: Different Url
  @diffUrl
  Scenario Outline: Navigate different Url
    Given I navigate to BMIintouch page
    When I go to <url>

    Examples:
    |url|
    |it |
    |pl |
    |uk |
    |dk |
    |fi |
    |no |
    |my |
    |es |
    |se |
    |de |