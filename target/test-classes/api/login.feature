Feature:  as a user I want login with valid email and valid password

  Scenario: POST-as a user I want login with valid email and valid password
    Given I set POST api endpoint
    When I send POST Http request
    Then I recaive valid Http response code 200
    And I recaive valid login for new user
