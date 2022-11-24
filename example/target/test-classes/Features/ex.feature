Feature: working on login window

  Scenario Outline: newtours application
    Given user is in newtours application
    When user needs to enter <uname> and <pass>
    Then user clicks on signon button
    And user navigated homepage
  
  Examples:
  |uname|pass|
  |Chakradhar|chakri123|
  |mercury|mercury|
