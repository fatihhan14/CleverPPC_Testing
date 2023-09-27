Feature: User Registration on CleverPPC Prestashop Store

  Scenario: TC_US06_UserRegistration
    Given the user accesses the website
    When Click on the element
      | signIn |

    And User sending the keys
      | emailTextBox | falanfilan@gmail.com |

    And Click on the element
      | createAnAccount |

    And Click on the element
      | radioButton |

    And User sending the keys
      | firstName | John   |
      | lastName  | Doe    |
      | password  | 123456 |

    And Click on the element
      | checkBox |

    And  User select on the element
      | day   | 01   |
      | month | 02   |
      | year  | 1990 |

    Then Success message should be displayed

     #| address       | 123 Main Street |
     #| City          | New York        |
     #| Postal Code   | 10001           |
     #| Mobile Phone  | 555-555-5555    |
     #| Alias Address | Home Address    |
