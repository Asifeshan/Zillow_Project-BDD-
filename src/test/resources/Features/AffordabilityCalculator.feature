Feature: Affordability Calculator
  Background:
    Given a user is on Home page

  Scenario: Calculate Rate of How much user can Afford
    When user click on payment button upon entering the data
      | AnnualIncome | MonthlyDebts | DownPayment |
      | 100000       | 500          | 50000       |
    Then user can validate the payment is "$2,475" and full report
    And user Clicks On Full Report
    Then User can validate How much "You can afford $449,757"