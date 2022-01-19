Feature: Functionality test Mortgage app Page
  Background:
    Given a user is on Home page

  Scenario: Check Mortgage app page is Working

    When user Clicks on Mortgages App to enter MobileNumber "9292313158" and clicks on TextMe free App
    Then user is able to see the success message and get Notified in phone Message