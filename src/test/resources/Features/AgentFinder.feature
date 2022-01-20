Feature: Functionality test of agent finder page

  Background:
    Given a user is on Home page

  Scenario Outline: Check Agent finder page is working

    When user enters at agent finder and input Location "<Neighbourhood/City/Zip>" and clicks on search Button
    Then User able to see the Featured Agents
    Examples:
      | Neighbourhood/City/Zip |
      | 11423                  |
      | Hollis                 |
      | East Elmhurst          |
      | Queens                 |

