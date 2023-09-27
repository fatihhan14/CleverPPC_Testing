Feature: Login Functionlity

  Scenario: TC_US06_UserLogin
    Given the user accesses the website
    When User sending the keys
      | emailLoginTextBox | falanfilan@gmail.com |
      | password          | 123456               |
    And Click on the element
      | signInButton |
    Then Success message should be displayed

    When Click on the element with myJsClick