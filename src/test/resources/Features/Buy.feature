Feature: User can Search for Luxury homes Listing
  Background:
    Given a user is on Home page

  Scenario: validate buy page is working
    When User clicks on Buy option and sort Price high to low and clicks
    Then User can see all available homes to buy

  Scenario Outline: User want to search for available listing for a specific neighbourhood
    When User clicks on Search Button upon entering the area "<Area>"
    Then User can see all available homes to buy

    Examples:
      | Area                 |
      | Hollis, New York, NY |
      | Queens, New York, NY |
