package newbook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class ClientSingUpPage extends BasePage {
    public ClientSingUpPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "[name=\"first_name\"]")
    private WebElement firstNameField;

    public void inputFirstNameField(String firstName) {
        wait.until(ExpectedConditions.elementToBeClickable(firstNameField));
        firstNameField.sendKeys(firstName);
    }



}
