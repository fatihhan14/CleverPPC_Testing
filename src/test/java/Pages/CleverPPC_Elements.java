package Pages;

import Utulities.GWD;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

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
    public WebElement authenticationText;
    @FindBy(linkText = "Sitemap")
    public WebElement siteMap;
    @FindBy(linkText = "Addresses")
    public WebElement addressesLink;
    @FindBy(css = "a[title='Add an address']")
    public WebElement addNewAddressButton;
    @FindBy(css = "input[id='address1']")
    public WebElement address1;
    @FindBy(css = "input[id='city']")
    public WebElement city;
    @FindBy(css = "select[id='id_state']>option[value='43']")
    public WebElement idState;
    @FindBy(css = "input[id='postcode']")
    public WebElement postalCode;
    @FindBy(css = "input[id='phone']")
    public WebElement homePhone;
    @FindBy(css = "input[id='phone_mobile']")
    public WebElement mobilePhone;
    @FindBy(css = "button[id='submitAddress']")
    public WebElement saveAddessButton;
    @FindBy(xpath = "//strong[contains(text(),'Your addresses are listed below')]")
    public WebElement addAddressVerifyText;
    @FindBy(css = "a[title='Women']")
    public WebElement women;
    @FindBy(css = "a[title='Summer Dresses']")
    public WebElement summerDress;
    @FindBy(css = "[id='product_list']>li")
    public List<WebElement> productList;
    @FindBy(xpath = "//*[contains(text(),'Add to cart')]")
    public List<WebElement> addToCart;
    @FindBy(xpath = "//span[contains(text(),'Women')]")
    public WebElement womenText;
    @FindBy(xpath = "//span[contains(text(),'Summer Dresses')]")
    public WebElement summurDressText;
    @FindBy(xpath = "//span[@class='title'][1]")
    public WebElement layerCartProductText;
    @FindBy(css = "a[title='Proceed to checkout']")
    public WebElement proceedTocheckout;
    @FindBy(xpath = "//span[contains(text(),' Tax included')]")
    public WebElement summaryCRTL;


    public WebElement getWebElement(String strElement) {
        switch (strElement) {
            case "signIn": return this.signIn;
            case "emailCreate": return this.emailCreate;
            case "emailLoginTextBox": return this.emailLoginTextBox;
            case "loginButton": return this.loginButton;
            case "createAnAccountButton": return this.createAnAccountButton;
            case "radioButton": return this.radioButton;
            case "firstName": return this.firstName;
            case "lastName": return this.lastName;
            case "email": return this.email;
            case "password": return this.password;
            case "checkBox": return this.checkBox;
            case "checkBox2": return this.checkBox2;
            case "registerButton": return this.registerButton;
            case "day": return this.day;
            case "month": return this.month;
            case "year": return this.year;
            case "myAccountText": return this.myAccountText;
            case "authenticationText": return this.authenticationText;
            case "siteMap": return this.siteMap;
            case "addressesLink": return this.addressesLink;
            case "addNewAddressButton": return this.addNewAddressButton;
            case "address1": return this.address1;
            case "city": return this.city;
            case "idState": return this.idState;
            case "postalCode": return this.postalCode;
            case "homePhone": return this.homePhone;
            case "mobilePhone": return this.mobilePhone;
            case "saveAddessButton": return this.saveAddessButton;
            case "addAddressVerifyText": return this.addAddressVerifyText;
            case "women": return this.women;
            case "summerDress": return this.summerDress;
            case "layerCartProductText": return this.layerCartProductText;
            case "proceedTocheckout": return this.proceedTocheckout;
            case "summaryCRTL": return this.summaryCRTL;

        }
        return null;
    }
}
