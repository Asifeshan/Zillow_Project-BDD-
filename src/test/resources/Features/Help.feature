Feature: Functionality test of Help page
  Background:
    Given a user is on Home page

  Scenario: Check Help page is working
    When User clicks on Help button and navigated to Help Page
    Then click on submit a request button
#    Then User able to navigate to Submit a request Page  ** Captcha Appears With this Step**