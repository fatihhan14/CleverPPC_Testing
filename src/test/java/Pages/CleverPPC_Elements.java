package Pages;

import Utulities.GWD;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CleverPPC_Elements extends Parent {

    public CleverPPC_Elements() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(css = "button[id='SubmitCreate']")
    public WebElement createAnAccountButton;
    @FindBy(css = "div[class='header_user_info']>a")
    public WebElement signIn;
    @FindBy(css = "input[id='email_create']")
    public WebElement emailCreate;
    @FindBy(css = "input[id='email']")
    public WebElement emailLoginTextBox;
    @FindBy(css = "button[id='SubmitLogin']")
    public WebElement loginButton;
    @FindBy(css = "input[id='id_gender1']")
    public WebElement radioButton;
    @FindBy(css = "input[id='customer_firstname']")
    public WebElement firstName;
    @FindBy(css = "input[id='customer_lastname']")
    public WebElement lastName;
    @FindBy(css = "input[id='email']")
    public WebElement email;
    @FindBy(css = "input[id='passwd']")
    public WebElement password;
    @FindBy(css = "input[id='newsletter']")
    public WebElement checkBox;
    @FindBy(css = "input[id='optin']")
    public WebElement checkBox2;
    @FindBy(css = "button[id='submitAccount']")
    public WebElement registerButton;
    @FindBy(css = "p[class='alert alert-success']")
    public WebElement alertMessage;
    @FindBy(css = "select[id='days']")
    public WebElement day;
    @FindBy(css = "select[id='months']")
    public WebElement month;
    @FindBy(id = "years")
    public WebElement year;
    @FindBy(xpath = "//div[@id='center_column']//p")
    public WebElement myAccountText;
    @FindBy(xpath = "//p[contains(text(),'There is 1 error')]")
    public WebElement authenticationText ;






    public WebElement getWebElement(String strElement) {
        switch (strElement) {
            case "signIn": return this.signIn;
            case "emailCreate" : return this.emailCreate;
            case "emailLoginTextBox" : return this.emailLoginTextBox;
            case "loginButton" : return this.loginButton;
            case "createAnAccountButton": return this.createAnAccountButton;
            case "radioButton" : return this.radioButton;
            case "firstName" : return this.firstName;
             case "lastName" : return this.lastName;
             case "email" : return this.email;
            case "password" : return this.password;
            case "checkBox" : return this.checkBox;
            case "checkBox2" : return this.checkBox2;
            case "registerButton" : return this.registerButton;
            case "day" : return this.day;
            case "month" : return this.month;
            case "year" : return this.year;
            case "myAccountText" : return this.myAccountText;
            case "authenticationText" : return this.authenticationText;

        }
        return null;
    }
}
