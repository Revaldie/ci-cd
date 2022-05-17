Feature: as user i want to see all categories with invalid url

  Scenario:GET-as user i want to see all categories with invalid url
    Given I set get api to endpoints
    When I send get request HTTP
    Then I recaive with invalid HTTP responce code 404
    And I not revaice all categories
