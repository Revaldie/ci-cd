Feature:  User As an admin,I want to see list of detail product

  Scenario: GET - As admin i have be able to get detail product
    Given I set GET api endpoints
    When I send GET HTTP request
    Then I receive valid HTTP response code 200
    And I recaive valid data for detail product

