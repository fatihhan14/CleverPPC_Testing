package StepDefinitions;

import Pages.CleverPPC_Elements;
import Utulities.GWD;
import Utulities.MyFunc;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;

public class CleverPPC_Test_Steps {
    CleverPPC_Elements ce = new CleverPPC_Elements();


    @Given("Navigate to website")
    public void NavigateTowebsite() {
        GWD.getDriver().get("https://cleverppc.com/prestashop4/");
    }

    @When("Click on the element")
    public void clickOnTheElement(DataTable dt) {
        List<String> strClickItems = dt.asList(String.class);
        for (int i = 0; i < strClickItems.size(); i++) {
            WebElement e = ce.getWebElement(strClickItems.get(i));
            ce.myClick(e);
        }
    }

    @When("Click on the element with myJsClick")
    public void clickOnTheElementmyJsClick(DataTable dt) {
        List<String> strClickItems = dt.asList(String.class);
        for (int i = 0; i < strClickItems.size(); i++) {
            WebElement e = ce.getWebElement(strClickItems.get(i));
            ce.myJsClick(e);
        }
    }

    @And("User sending the keys")
    public void userSendingTheKeys(DataTable dt) {
        List<List<String>> items = dt.asLists(String.class);
        for (int i = 0; i < items.size(); i++) {
            WebElement e = ce.getWebElement(items.get(i).get(0));
            ce.mySendKeys(e, items.get(i).get(1));
        }
    }

    @And("Hover to the element")
    public void hoverToTheElement(DataTable dt) {
        List<String> hoverList = dt.asList(String.class);
        for (int i = 0; i < hoverList.size(); i++) {
            WebElement e = ce.getWebElement(hoverList.get(i));
            ce.moveToElement(e);
        }
    }

    @And("User select on the element")
    public void userSelectOnTheElement(DataTable dt) {
        List<List<String>> selectList = dt.asLists(String.class);
        for (int i = 0; i < selectList.size(); i++) {
            WebElement e = ce.getWebElement(selectList.get(i).get(0));
            ce.selectElementWithText(e, selectList.get(i).get(1));
        }
    }

    @Then("Text verification process")
    public void textMessageShouldBeDisplayed(DataTable dt) {
        List<List<String>> text = dt.asLists(String.class);
        for (int i = 0; i < text.size(); i++) {
            WebElement e = ce.getWebElement(text.get(i).get(0));
            ce.verifyContainsText(e, text.get(i).get(1));
        }

    }

    @Then("Click on the random elements")
    public void clickOnTheRandomElements() {
        int random = MyFunc.randomGenerator(ce.productList.size());
        ce.moveToElement(ce.productList.get(random));
        ce.addToCart.get(random).click();
    }

    @Then("Click on the random elements 3")
    public void clickOnTheRandomElements3() {
        int a = 0;
        int a2 = 0;
        int random = MyFunc.randomGenerator(ce.productList.size());
        ce.moveToElement(ce.productList.get(random));
        ce.addToCart.get(random).click();
        ce.myJsClick(ce.continueShopping);
        a2 = random;
        do {
            random = MyFunc.randomGenerator(ce.productList.size());
            if (random != a2) {
                ce.moveToElement(ce.productList.get(random));
                ce.addToCart.get(random).click();
                ce.myJsClick(ce.continueShopping);
                a++;
            }
            a2 = random;
        } while (a != 2);
    }

    @And("Length of the product list verification process")
    public void lengthOfTheProductListVerificationProcess(DataTable dt) {
        List<String> text = dt.asList(String.class);

        for (int i = 0; i < text.size(); i++) {
            WebElement e = ce.getWebElement(text.get(i));
            String e2 = Integer.toString(ce.addToCart.size());
            ce.verifyContainsText(e, e2);
        }
    }

    @And("Page is returned")
    public void pageIsReturned() {
        GWD.getDriver().navigate().back();
    }

    @And("Order Reference Text saving")
    public void orderReferenceTextSaving() {
        System.out.println(ce.orderReferanceCodeText.getText());
    }


    @When("User uploading files to the website")
    public void userUploadingFilesToTheWebsite() throws AWTException {
        Robot robot = new Robot();
        StringSelection dosyaYolu = new StringSelection("C:\\Users\\fatih\\OneDrive\\Masaüstü\\DEKONT.jpg");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(dosyaYolu, null);
        MyFunc.Wait(1);

        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);

        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);

        MyFunc.Wait(1);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }
}
