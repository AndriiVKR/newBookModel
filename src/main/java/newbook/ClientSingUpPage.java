package newbook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.lang.management.RuntimeMXBean;
import java.util.List;

public class ClientSingUpPage extends BasePage {
    public ClientSingUpPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "[name=\"first_name\"]")
    private WebElement firstNameField;

    @FindBy(css = "[name=\"last_name\"]")
    private WebElement lastNameField;

    @FindBy(css = "[name=\"email\"]")
    private WebElement emailField;

    @FindBy(css = "[name=\"password\"]")
    private WebElement passwordField;

    @FindBy(css = "[name=\"password_confirm\"]")
    private WebElement passwordConfirmField;

    @FindBy(css = "[name=\"phone_number\"]")
    private WebElement phoneNumberField;

    @FindBy(css = ".FormErrorText__error---nzyq")
    private List<WebElement> errorMessages;

    @FindBy(css = ".PasswordValidation__itemText--2Le6z")
    private List<WebElement> confirmPasswordErrorMessages;

    public void inputFirstNameField(String firstName) {
        wait.until(ExpectedConditions.elementToBeClickable(firstNameField));
        firstNameField.sendKeys(firstName);
    }

    public void inputLastNameField(String lastName) {
        wait.until(ExpectedConditions.elementToBeClickable(lastNameField));
        lastNameField.sendKeys(lastName);
    }

    public void inputEmailField(String email) {
        wait.until(ExpectedConditions.elementToBeClickable(emailField));
        emailField.sendKeys(email);
    }

    public void inputPasswordField(String password) {
        wait.until(ExpectedConditions.elementToBeClickable(passwordField));
        passwordField.sendKeys(password);
    }

    public void inputPasswordConfirmField(String password) {
        wait.until(ExpectedConditions.elementToBeClickable(passwordConfirmField));
        passwordConfirmField.sendKeys(password);
    }

    public void inputPhoneNumberField(String phoneNumber) {
        wait.until(ExpectedConditions.elementToBeClickable(phoneNumberField));
        phoneNumberField.sendKeys(phoneNumber);
    }

    public String passwordErrorMessage() {
        wait.until(ExpectedConditions.elementToBeClickable(errorMessages.get(3)));
        return errorMessages.get(3).getText();
    }

    public String charactersMessage() {
        wait.until(ExpectedConditions.elementToBeClickable(confirmPasswordErrorMessages.get(0)));
        return confirmPasswordErrorMessages.get(0).getText();
    }

    public String numberMessage() {
        wait.until(ExpectedConditions.elementToBeClickable(confirmPasswordErrorMessages.get(1)));
        return confirmPasswordErrorMessages.get(1).getText();
    }

    public String capitalLetterMessage() {
        wait.until(ExpectedConditions.elementToBeClickable(confirmPasswordErrorMessages.get(2)));
        return confirmPasswordErrorMessages.get(2).getText();
    }

    public String lowercaseLetter() {
        wait.until(ExpectedConditions.elementToBeClickable(confirmPasswordErrorMessages.get(3)));
        return confirmPasswordErrorMessages.get(3).getText();
    }

    public String markMessage () {
        wait.until(ExpectedConditions.elementToBeClickable(confirmPasswordErrorMessages.get(4)));
        return confirmPasswordErrorMessages.get(4).getText();
    }

    public String matchMessage() {
        wait.until(ExpectedConditions.elementToBeClickable(confirmPasswordErrorMessages.get(5)));
        return confirmPasswordErrorMessages.get(5).getText();
    }




}
