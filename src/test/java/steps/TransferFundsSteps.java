package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page_objects.DashboardPage;

public class TransferFundsSteps {

    DashboardPage dashboardPage;

    @When("click on transfer funds")
    public void transferFunds(){
        dashboardPage.clickOnTransferFunds();
    }

    @When("enter transfer details")
    public void enterDetails(){
        dashboardPage.enterName("name");
        dashboardPage.enterPhoneNumber("99999999");
        dashboardPage.enterAmount(5000);
        dashboardPage.chooseCountryIndia();
    }

    @When("make payment")
    public void clickAndTransferMoney(){
        dashboardPage.transferMoney();
    }

}
