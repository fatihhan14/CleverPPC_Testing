package Pages;

import Utulities.GWD;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class CleverPPC_Elements extends Parent{

    public CleverPPC_Elements() {
        PageFactory.initElements(GWD.getDriver(),this);
    }


    public WebElement getWebElement (String strElement){
        switch (strElement){
           // case "signIn" :
           // case "emailTextBox" :
           // case "emailLoginTextBox" :
           // case "signInButton" :
           // case "createAnAccount" : return this.createAnAccount;
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
