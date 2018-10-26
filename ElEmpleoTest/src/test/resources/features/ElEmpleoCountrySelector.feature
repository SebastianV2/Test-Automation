#Author: your.email@your.domain.com

Feature: ElEmpleo Country Selector
  As a web user I want to get into elempleo home page picking a country

  Scenario: Piking a country on elempleo homepage
    Given thet sebas in on elempleo homepage
    When he clicks on desired country and he gets into selected country homepage
      | country  |
      | Colombia |
    And he searches a job on search box
      | job    |
      | carpintero |
    And he clicks one option from list of jobs
      | option |
      |     3 |
    Then he applies to selected offer
