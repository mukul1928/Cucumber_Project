@sanity
Feature: Login Validation

  @test1
  Scenario Outline: Validate login functionality with Correct Credentials
    Given users opens the web application
    And user will enter the "<username>"
    And user will enter the "<password>"
    When user will click on Login button
    Then user will be navigated to the homepage of the application
    #Then user will be able to see his details

    Examples: 
      | username | password  |
      | chandan  | test@1234 |
      | mukul    | test@5678 |
      | gowri    | test@6847 |

  @test2
  Scenario: Validate login functionality with Incorrect Credentials
    Given users opens the web application
    And user will enter the username
    And user will enter the password
    When user will click on Login button
    Then user will be getting the appropriate error message
    
    
  #Scenario: Validate login functionality keeping userid and passsword blank
    #Given users opens the web application
    #And user will enter the username as "Chandu"
    #And user will enter the password as "test@6874"
    #When user will click on Login button
    #Then user will be getting the appropriate error message
