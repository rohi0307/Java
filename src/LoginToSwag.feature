Feature: E2E Testing

@Login
  Scenario Outline: To check proper login of with valid credentials
    Given user on login page
    When enters <username> & <password>
    And click on login
    Then redirect to home page

    Examples: 
      | username      | password     |
      | standard_user | secret_sauce |
@AddProduct
  Scenario: Add product
    Given User on home page
    When click on one product
    Then product page opens
    And click add to cart
    Then product gets added
