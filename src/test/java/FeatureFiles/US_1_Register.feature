Feature: User Registration on CleverPPC Prestashop Store

  @Smoke
  @Accounts
  Scenario: TC_US06_UserRegistration
    Given Navigate to website
    When Click on the element
      | signIn |

    And User sending the keys
      | emailCreate | falanfilan123@gmail.com |

    And Click on the element
      | createAnAccountButton |
      | radioButton           |

    And User sending the keys
      | firstName | John                    |
      | lastName  | Doe                     |
      | email     | falanfilan123@gmail.com |
      | password  | Deneme.123              |

    And Click on the element
      | registerButton |

    Then Text message should be displayed
      | alertMessage | created |

     #| address       | 123 Main Street |
     #| City          | New York        |
     #| Postal Code   | 10001           |
     #| Mobile Phone  | 555-555-5555    |
     #| Alias Address | Home Address    |
