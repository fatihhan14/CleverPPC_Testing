Feature: New Address Functionality

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


  Scenario:TC_US02_AddToCart
    Given Hover to the element
      | women |
    When Click on the element
      | summerDress |
    Then Click on the random elements
    And Text verification process
      | layerCartProductText | successfully |
    And Click on the element
      | proceedTocheckout |
    And Text verification process
      | summaryCRTL | Tax included |
