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


    public WebElement getWebElement(String strElement) {
        switch (strElement) {
            case "signIn": return this.signIn;
            // case "emailTextBox" :
            // case "emailLoginTextBox" :
            // case "signInButton" :
            case "createAnAccountButton": return this.createAnAccountButton;
            // case "radioButton" :
            // case "firstName" :
            // case "lastName" :
            // case "password" :
            // case "checkBox" :
            // case "day" :
            // case "month" :
            // case "year" :
        }
        return null;
    }
}
