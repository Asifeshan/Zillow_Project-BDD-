Feature: Functionality test of agent finder page

  Background:
    Given a user is on Home page

  Scenario Outline: Check Agent finder page is working

    When user enters at agent finder and input Location "<Neighbourhood/City/Zip>" type Agent name "<AgentName>" and clicks on search Button
    Then User able to see the Featured Agents
    Examples:
      | Neighbourhood/City/Zip | AgentName   |
      | Queens                 | Vincent koo |

