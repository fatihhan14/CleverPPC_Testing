Feature: Register Functionality

  @Smoke
  @Accounts
  Scenario: TC_US01_UserRegistration
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

    Then Text verification process
      | alertMessage | created |

