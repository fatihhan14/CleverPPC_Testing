package StepDefinitions;

import Pages.CleverPPC_Elements;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

import java.util.List;

public class RegisterSteps {
    CleverPPC_Elements ce = new CleverPPC_Elements();
    @Given("the user accesses the website")
    public void theUserAccessesTheWebsite() {
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
            ce.myClick(e);
        }
    }

    @And("User sending the keys")
    public void userSendingTheKeys(DataTable dt) {
        List<List<String>> items = dt.asLists(String.class);
        for (int i = 0; i < items.size(); i++) {
            WebElement e = ce.getWebElement(items.get(i).get(0));
            ce.mySendKeys(e,items.get(i).get(1));
        }
    }

    @And("User select on the element")
    public void userSelectOnTheElement() {
    }

    @Then("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {
    }
}
