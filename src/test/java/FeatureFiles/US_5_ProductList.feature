Feature: Product List Functionality

  Background: LOGIN
    Given Navigate to website
    And Click on the element
      | signIn |
    When User sending the keys
      | emailLoginTextBox | falanfilan123@gmail.com |
      | password          | Deneme.123              |
    And Click on the element
      | loginButton |
    Then Text verification process
      | myAccountText | Welcome |

  @Regression
  @Products
  Scenario:TC_US05_ProductList
    When Click on the element
      | dresses |
    And Text verification process
      | numberOfProducts | 5 |
    And Length of the product list verification process
      | numberOfProducts |
