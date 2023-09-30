Feature: Login Functionlity

  @Smoke
    @Accounts
  Scenario Outline: TC_US06_UserLogin
    Given Navigate to website
    And Click on the element
      | signIn |
    When User sending the keys
      | emailLoginTextBox | <email>    |
      | password          | <password> |
    And Click on the element
      | loginButton |
    Then Text message should be displayed
      | <messageElement> | <messageText> |
    Examples:
      | email                   | password   | messageElement     | messageText      |
      | falanfiln@gmail.com     | Deneme.123 | authenticationText | There is 1 error |
      | falanfiln@gmail.com     | Deneme.123 | authenticationText | There is 1 error |
      | falanfiln@gmail.com     | Deneme.123 | authenticationText | There is 1 error |
      | falanfilan123@gmail.com | Deneme.123 | myAccountText      | Welcome          |