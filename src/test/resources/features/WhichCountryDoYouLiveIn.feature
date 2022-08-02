
Feature: feature file involving tests for the which country do you live in page
  #Happy paths
  @WhichCountryDoYouLiveIn
  Scenario Outline: As a user I want to be able to select a country which is not NI
    Given I navigate to the start screen
    And I click the start button
    And I am navigated to what the what is your country page
    When I select the country "<Country>"
    And I click next on the what country do you live in page
    Then I am displayed the is your gp in scotland or wales screen
    Examples:
    |Country |
    |England |
    #|Scotland|  - issue with
    |Wales   |

  Scenario Outline: As a user I want to be able to select the country Northern Island
    Given I navigate to the start screen
    And I click the start button
    And I am navigated to what the what is your country page
    When I select the country "<Country>"
    And I click next on the what country do you live in page
    Then I am displayed the northern island kickout page
    Examples:
    |Country        |
    |Northern Island|

  Scenario: As a user I want to be able to return to the last page
    Given I navigate to the start screen
    And I click the start button
    And I am navigated to what the what is your country page
    When I click the back button on the what country do you live page
    Then I am displayed the start page
  #Unhappy path
  Scenario: As a user I want to be shown an error if i try to continue without selecting a country
    Given I navigate to the start screen
    And I click the start button
    And I am navigated to what the what is your country page
    And I click next on the what country do you live in page
    Then I am displayed an error