Feature: Validate Data Table

  Scenario: Validate Successfull Login
    Given user is on HRMLogin page
    When user will enter the credientials
      | Mukul | chandanpandey1928@gmail.com | 9807717087 | 19-10-1990 |
    Then user will be submitting the form
