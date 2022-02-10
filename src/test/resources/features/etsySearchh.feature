@Etsy
Feature: As a user, Should able to buy new microphone


  @TC02
  Scenario: User search for Wooden Spoon
    Given User is on the etsy Title
    Then Page title should be as expected
    When  User searches for Wooden Spoon
    Then Page title should start with wooden spoon

  Scenario: User empty Search
    Given  User is on the etsy Title
    Then Page title should be as expected
    When User serches for empty value
    Then All catagories shuld be displayed
