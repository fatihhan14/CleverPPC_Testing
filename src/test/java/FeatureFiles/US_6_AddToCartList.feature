Feature: Add to Cart List Functionality

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

  @Cart
  @Products
  Scenario:TC_US06_AddToCartList
    Given Click on the element
      | dresses |
    When Click on the random elements 3

    Then Click on the element
      | proceedTocheckout |
    And Text verification process
      | productSize | 3 products |
