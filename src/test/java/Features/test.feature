Feature: Login Feature
  Verify if user is able to Login in to the site

  Scenario: Login as a authenticated user
    Given user is google page
    When search text is entered
    Then search result is validated
