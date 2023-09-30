Feature: Contact Us Functionality

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

@Contact
@Support
  Scenario:TC_US08_ContactUs
    Given Click on the element
      | contactUsButton  |
      | customerService  |
      | orderRef         |
      | productId         |
      | chooseFileButton |
    When User uploading files to the website
    Then User sending the keys
      | textArea | Banka havalesi henüz yapıldı, ödeme dekontu ektedir. John Doe |
    And Click on the element
      | sendButton |
    And Text verification process
      | alertMessage | successfully |
