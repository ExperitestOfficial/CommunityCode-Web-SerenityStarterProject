package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import page_objects.HomePage;

public class LoginSteps {

    HomePage homePage;

    @Given("We are on Digital.ai bank home-page")
    public void navigateToHomePage(){
        homePage.open();
    }

    @When("We login to dashboard")
    public void login(){
        homePage.enterUserName("company");
        homePage.enterPassword("company");
        homePage.performLogin();
    }

}
