Feature: Login to Sauce Demo and Checkout
  Scenario Outline: valid login
    Given user is present on login page
    When user enters valid data with username as "<Username>" and password as "<password>"
    And click login button
    Then login should be successful
    Examples:
      |Username|password|
      |standard_user|secret_sauce|
      |problem_user |secret_sauce|

  Scenario Outline: invalid login
    Given user is present on login page
    When user enters invalid data with username as "<Username>" and password as "<password>"
    And click login button
    Then login should be unsuccessful
    Examples:
      |Username|password|
      |invalid_user|secret_sauce|

  Scenario Outline: Checkout
    Given user is present on login page
    When user enters valid data with username as "standard_user" and password as "secret_sauce"
    And click login button
    Then user add his desired product to cart
    Then user visits the cart to checkout
    Then user enters data with first name as "<firstname>" last name as "<lastname>" and postal code as "<postalcode>"
    Then user continues to Order info and confirms the order
    Examples:
    |firstname|lastname|postalcode|
    |faizan   |junani  |090       |

