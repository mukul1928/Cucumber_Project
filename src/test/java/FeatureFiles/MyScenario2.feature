Feature: Validating different modules of an E-Commerce application

  Background: Login functionality
    Given users opens the web application
    And user will enter the username
    And user will enter the password
    When user will click on Login button
    Then user will be navigated to the home page

  Scenario: Validate add to cart
    And the user will then go to add to cart section

  Scenario: Update my favourites
    And the user will then go to my favourite section

  Scenario: Change User setting
    And the user will then go to change user setting section
