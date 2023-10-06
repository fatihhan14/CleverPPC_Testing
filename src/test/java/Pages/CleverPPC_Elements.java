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
    @FindBy(xpath = "//span[@class='title'][1]")
    public WebElement layerCartProductText;
    @FindBy(css = "a[title='Proceed to checkout']")
    public WebElement proceedTocheckout;
    @FindBy(css = "[name='processAddress']")
    public WebElement proceedTocheckout3;
    @FindBy(xpath = "(//a[@title='Proceed to checkout'])[2]")
    public WebElement proceedTocheckout2;
    @FindBy(xpath = "//button[@name='processCarrier']")
    public WebElement proceedTocheckout4;
    @FindBy(xpath = "//span[contains(text(),' Tax included')]")
    public WebElement taxIncluded;
    @FindBy(xpath = "(//a[@title='Dresses'])[2]")
    public WebElement dresses;
    @FindBy(xpath = "//span[@class='heading-counter']")
    public WebElement numberOfProducts;
    @FindBy(xpath = "//span[@title='Continue shopping']")
    public WebElement continueShopping;
    @FindBy(xpath = "//span[@id='summary_products_quantity']")
    public WebElement productSize;
    @FindBy(css = "a[title='View my shopping cart']")
    public WebElement cartIcon;
    @FindBy(xpath = "//p[@class='cart-buttons']//a")
    public WebElement checkOut;
    @FindBy(css = "select[id='id_address_delivery']")
    public WebElement addressSelect;
    @FindBy(css = "label[for='cgv']")
    public WebElement checkBoxAgree;
    @FindBy(css = "input[id='paypal-standard-btn']")
    public WebElement paypalPayButton;
    @FindBy(css = "div[class=message]")
    public WebElement paypalMessage;
    @FindBy(xpath = "//body[contains(text(),'Invalid request (1).')]")
    public WebElement creditCartErrorMessage;
    @FindBy(xpath = "(//p[@class='payment_module']//a)[3]")
    public WebElement creditCartPayButton;
    @FindBy(xpath = "(//p[@class='payment_module']//a)[1]")
    public WebElement bankWirePayButton;
    @FindBy(xpath = "(//button[@type='submit'])[2]")
     public WebElement confirmOrderButton;
    @FindBy(css = "p[class='alert alert-success']")
     public WebElement orderCompleteSuccessMsg;
    @FindBy(css = "div[class='box']")
     public WebElement orderReferanceCodeText;
    @FindBy(css = "span[title='Close window']")
    public WebElement closeWindow;
    @FindBy(linkText = "Contact us")
    public WebElement contactUsButton;
    @FindBy(css = "label[for='id_contact']")
    public WebElement subjectHeading;
    @FindBy(xpath = "//option[text()='Customer service']")
    public WebElement customerService;
    @FindBy(xpath = "(//div[@class='selector']//select)[2]")
    public WebElement chooseOrderRef;
    @FindBy(xpath = "//select[@name='id_order']/option[2]")
    public WebElement orderRef;
    @FindBy(xpath = "//select[@id='284_order_products']/option[2]")
    public WebElement productId;
    @FindBy(id = "uniform-fileUpload")
    public WebElement chooseFileButton;
    @FindBy(css = "textarea[class='form-control']")
    public WebElement textArea;
    @FindBy(xpath = "(//button[@type='submit'])[2]")
    public WebElement sendButton;




    public WebElement getWebElement(String strElement) {
        switch (strElement) {
            case "signIn": return this.signIn;
            case "sendButton": return this.sendButton;
            case "textArea": return this.textArea;
            case "chooseFileButton": return this.chooseFileButton;
            case "contactUsButton": return this.contactUsButton;
            case "customerService": return this.customerService;
            case "chooseOrderRef": return this.chooseOrderRef;
            case "orderRef": return this.orderRef;
            case "subjectHeading": return this.subjectHeading;
            case "proceedTocheckout4": return this.proceedTocheckout4;
            case "alertMessage": return this.alertMessage;
            case "closeWindow": return this.closeWindow;
            case "productId": return this.productId;
            case "orderCompleteSuccessMsg": return this.orderCompleteSuccessMsg;
            case "confirmOrderButton": return this.confirmOrderButton;
            case "checkBoxAgree": return this.checkBoxAgree;
            case "bankWirePayButton": return this.bankWirePayButton;
            case "creditCartPayButton": return this.creditCartPayButton;
            case "creditCartErrorMessage": return this.creditCartErrorMessage;
            case "paypalPayButton": return this.paypalPayButton;
            case "paypalMessage": return this.paypalMessage;
            case "addressSelect": return this.addressSelect;
            case "checkOut": return this.checkOut;
            case "cartIcon": return this.cartIcon;
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
            case "proceedTocheckout2": return this.proceedTocheckout2;
            case "taxIncluded": return this.taxIncluded;
            case "dresses": return this.dresses;
            case "numberOfProducts": return this.numberOfProducts;
            case "continueShopping": return this.continueShopping;
            case "productSize": return this.productSize;
            case "proceedTocheckout3": return this.proceedTocheckout3;

        }
        return null;
    }
}
