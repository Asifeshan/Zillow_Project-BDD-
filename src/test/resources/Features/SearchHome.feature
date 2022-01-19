Feature:  For A specific Address to see price listing and other details
  Background:
    Given a user is on Home page

  Scenario: user Want to See a price listing for specific address With other details
    When user entering Address "19836 Carpenter Ave Jamaica, NY 11423" and clicks Home Value to see Home details
    Then user can validate home Value also Facts and feature with NeighbourHood details

