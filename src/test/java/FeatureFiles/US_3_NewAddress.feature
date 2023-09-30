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

  @Regression
  @Addresses
  Scenario:TC_US03_NewAddress
    Given Click on the element
      | siteMap             |
      | addressesLink       |
      | addNewAddressButton |
    When User sending the keys
      | address1 | 123 Main Street |
      | city     | New York        |
    Then Click on the element
      | idState |
    And User sending the keys
      | postalCode  | 10001        |
      | homePhone   | 444-444-4444 |
      | mobilePhone | 555-555-5555 |
    And Click on the element
      | saveAddessButton |
    And Text verification process
      | addAddressVerifyText | listed |

