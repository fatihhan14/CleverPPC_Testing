Feature: Ordering and payment Functionality

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

  @Products
  @Checkout
  Scenario:TC_US07_OrderingAndPayment
    Given Click on the element
      | dresses |

    When Click on the random elements 3
    And Click on the element
      | closeWindow |

    Given Hover to the element
      | cartIcon |

    When Click on the element
      | checkOut           |
      | proceedTocheckout2 |
      | proceedTocheckout3 |
      | checkBoxAgree      |
      | proceedTocheckout4 |
      | paypalPayButton    |
    And Text verification process
      | paypalMessage | tekrar deneyin |
    And Page is returned
    And Click on the element
      | creditCartPayButton |
    And Text verification process
      | creditCartErrorMessage | Invalid |
    And Page is returned
    And Click on the element
      | bankWirePayButton  |
      | confirmOrderButton |
    And Text verification process
      | orderCompleteSuccessMsg | Your order on Xu Clothing is complete. |
    And Order Reference Text saving
