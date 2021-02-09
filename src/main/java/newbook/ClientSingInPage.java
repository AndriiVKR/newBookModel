package newbook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ClientSingInPage extends BasePage {
    public ClientSingInPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".SignInForm__signUpLink--10JAH")
    private WebElement singUpButton;

    public void clickSingUpButton() {
        wait.until(ExpectedConditions.elementToBeClickable(singUpButton));
        singUpButton.click();
    }

}
