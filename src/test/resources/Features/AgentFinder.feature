
Feature: Functionality test of agent finder page
  Background:
    Given a user is on Home page

  Scenario: Check Agent finder page is working

    When user enters at agent finder and input zipcode "11423" and clicks on search Button
    Then User able to see the Featured Agents