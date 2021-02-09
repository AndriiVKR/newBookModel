package newbook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class SignUpPage extends BasePage {
    public SignUpPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".SignupForm__submitButton--1m1C2.Button__button---rQSB.Button__themePrimary--E5ESP.Button__" +
            "sizeMedium--uLCYD.Button__fontSmall--1EPi5.Button__withTranslate--1qGAH")
    private WebElement nextButton;

    @FindBy(css = ".Input__input--_88SI.Input__themeNewbook--1IRjd.Input__fontRegular--2SStp")
    private List <WebElement> inputSignUpFields;

    public void nextButtonClick() {
        wait.until(ExpectedConditions.elementToBeClickable(nextButton));
        nextButton.click();
    }

    @FindBy(css = ".FormErrorText__error---nzyq")
    private List <WebElement> errorMessageFields;

    public String errorFirstNameField() {
        wait.until(ExpectedConditions.visibilityOfAllElements(errorMessageFields.get(0)));
        return errorMessageFields.get(0).getText();
    }
    public String errorLastNameField() {
        wait.until(ExpectedConditions.visibilityOfAllElements(errorMessageFields.get(1)));
        return errorMessageFields.get(1).getText();
    }
    public String errorEmailField() {
        wait.until(ExpectedConditions.visibilityOfAllElements(errorMessageFields.get(2)));
        return errorMessageFields.get(2).getText();
    }
    public String errorPasswordField() {
        wait.until(ExpectedConditions.visibilityOfAllElements(errorMessageFields.get(3)));
        return errorMessageFields.get(3).getText();
    }
    public String errorMobileField() {
        wait.until(ExpectedConditions.visibilityOfAllElements(errorMessageFields.get(5)));
        return errorMessageFields.get(5).getText();
    }

    public void firstNameField(String firstName) {
       wait.until(ExpectedConditions.elementToBeClickable(inputSignUpFields.get(0)));
       inputSignUpFields.get(0).sendKeys(firstName);
    }




}
