Feature: working on newtours

  Scenario Outline: newtours application
    Given user in newtours 
    When user needs to click register link
    Then user needs to get country names in dropdown
    And user closes the browser