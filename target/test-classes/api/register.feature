Feature: as a user i want to register without email and password

  Scenario:POST-as a user i want to register without email and password
    Given I set Post Api Endpoint
    When I Send Post Http request with body text Without email and password
    Then I recaive invalid Http response code 400
    And I do not register account

