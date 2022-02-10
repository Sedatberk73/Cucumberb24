@rerun
Feature: As a user, Rerunning failed scenarios

  Scenario: one
    Given User adds two numbers
    Then Result should be as expected

  Scenario: two
    Given User adds three numbers
    Then Result should be sum of three

  Scenario: three
    Given User divides two numbers
    Then Result should be division