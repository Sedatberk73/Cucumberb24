Feature: Disce job search
  As a user, I should be able to search for jobs using a keyword and zipcode, then see results.
@btr-21
  Scenario: User searches for a job
    Given User is on dice homepage
    When User enters keyword and zipcode
    Then User should see search results