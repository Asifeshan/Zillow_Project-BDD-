
Feature: Test login functionalities

  Background:
    Given a user is on Home page
    And User Clicks on SignIn Link

  @positive_test
  Scenario: Check login is successful with valid credentials
    When After Clicking SignIN User enters email "my.work14625@gmail.com" and password "Coffee@2000" and Clicks On LogIn Button
    Then user is navigated to homepage


   @dataDriven_test @positive_test
   Scenario: Check login using data table
    When After Clicking SignIN user click on login button upon entering credentials
      | email                  | password    |
      | my.work14625@gmail.com | Coffee@2000 |
    Then user is navigated to homepage


   @negative_test
   Scenario: Check login unsuccessful with invalid credentials
     When user click on signIn upon entering validEmail "my.work14625@gmail.com" and invalidPassword "Coffee@3000"
     Then user is failed to login


