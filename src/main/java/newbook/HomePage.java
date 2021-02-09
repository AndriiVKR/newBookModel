package newbook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".Navbar__signUp--12ZDV")
    private WebElement signUpButton;

    @FindBy(css = "a")
    private List <WebElement> topPageButtons;


    public void clickLogInButton() {
        wait.until(ExpectedConditions.elementToBeClickable(topPageButtons.get(5)));
        topPageButtons.get(5).click();
    }

    public SignUpPage clickSignUpButton() {
        wait.until(ExpectedConditions.elementToBeClickable(signUpButton));
        signUpButton.click();
        return new SignUpPage(driver);
    }

    public void clickForClientsButton() {
        wait.until(ExpectedConditions.elementToBeClickable(topPageButtons.get(0)));
        topPageButtons.get(0).click();
    }

}
