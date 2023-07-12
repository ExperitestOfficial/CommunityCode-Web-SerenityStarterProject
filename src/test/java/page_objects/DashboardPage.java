package page_objects;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.NamedUrl;
import org.openqa.selenium.support.FindBy;

@NamedUrl(name = "dashboard page", url = "https://demo-bank.ct.digital.ai/dashboard")
public class DashboardPage extends PageObject {

    @FindBy(xpath = "//*[@class='transfer-button']")
    private WebElementFacade openTransferFundsPopUp;

    @FindBy(xpath = "//input[@name='NAME']")
    private WebElementFacade nameField;

    @FindBy(xpath = "//input[@name='PHONE']")
    private WebElementFacade phoneField;

    @FindBy(xpath = "//input[@name='AMOUNT']")
    private WebElementFacade amountField;

    @FindBy(xpath = "//*[@id='country-arrow']")
    private WebElementFacade countryListArrow;

    @FindBy(xpath = "//*[text()='India']")
    private WebElementFacade itemIndia;

    @FindBy(xpath = "//*[@data-auto='transfer-button']")
    private WebElementFacade transferButton;

    public void clickOnTransferFunds(){
        clickOn(openTransferFundsPopUp);
    }

    public void enterName(String name){
        typeInto(nameField,name);
    }

    public void enterPhoneNumber(String phoneNumber){
        typeInto(phoneField,phoneNumber);
    }

    public void enterAmount(int amount){
        typeInto(amountField,String.valueOf(amount));
    }

    public void chooseCountryIndia(){
        clickOn(countryListArrow);
        clickOn(itemIndia);
    }

    public void transferMoney(){
        clickOn(transferButton);
    }

}
