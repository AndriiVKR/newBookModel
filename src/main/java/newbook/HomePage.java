package newbook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".Navbar__signUp--12ZDV")
    private WebElement signUpButton;

    public SignUpPage clickSignUpButton() {
        wait.until(ExpectedConditions.elementToBeClickable(signUpButton));
        signUpButton.click();
        return new SignUpPage(driver);
    }






}
