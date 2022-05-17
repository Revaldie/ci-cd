Feature:As user i want to buy some product

  Scenario: POST-As user i want to buy some product
    Given user success auth using exiting user
    When user set endpoint for post transaction
    And user send post transaction endpoint
    Then user received HTTP response 200