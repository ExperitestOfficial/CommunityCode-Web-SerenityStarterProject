package page_objects;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.NamedUrl;
import net.thucydides.core.annotations.NamedUrls;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://demo-bank.ct.digital.ai")
@NamedUrls({
        @NamedUrl(name = "default url", url = "https://demo-bank.ct.digital.ai"),
        @NamedUrl(name = "url with login suffix", url = "https://demo-bank.ct.digital.ai/login")
})
public class HomePage extends PageObject {

    @FindBy(xpath = "//*[@data-auto='username']//input")
    private WebElementFacade usernameField;

    @FindBy(xpath = "//*[@data-auto='password']//input")
    private WebElementFacade passwordField;

    @FindBy(xpath = "//*[@data-auto='login']")
    private WebElementFacade loginButton;

    public void enterUserName(String userName) {
        typeInto(usernameField, userName);
    }

    public void enterPassword(String password) {
        typeInto(passwordField, password);
    }

    public void performLogin() {
        clickOn(loginButton);
    }

}
