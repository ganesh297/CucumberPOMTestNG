Feature: Acceptance testing to validate Search Cars Page is working.
  In order to validate that 
  the Search Cars page is working
  Doing the Acceptance Testing

  @Smoke
  Scenario: Validate Search Cars Page
    Given I am on the Home Page "http://newtours.demoaut.com/mercurysignon.php" of MercuryTours Website
    When User enter username
    And User enter password
    And click Login
    Then Verify Home Page
    