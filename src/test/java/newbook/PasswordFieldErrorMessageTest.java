package newbook;

import org.junit.Assert;
import org.junit.Test;

import java.util.logging.Logger;

public class PasswordFieldErrorMessageTest extends BaseTest {

    private static Logger log = Logger.getLogger(PasswordFieldErrorMessageTest.class.getName());

    @Test
    public void testPasswordFieldErrorMessage() {

        homePage = new HomePage(driver);

        homePage.clickLogInButton();

        clientSingInPage = new ClientSingInPage(driver);

        clientSingInPage.clickSingUpButton();

        clientSingUpPage = new ClientSingUpPage(driver);

        clientSingUpPage.inputFirstNameField(clientIncorrect.getFirstName());

        clientSingUpPage.inputLastNameField(clientIncorrect.getLastName());

        clientSingUpPage.inputEmailField(clientIncorrect.getEmail());

        clientSingUpPage.inputPasswordField(clientIncorrect.getPassword());

        clientSingUpPage.inputPasswordConfirmField(clientIncorrect.getPassword());

        clientSingUpPage.inputPhoneNumberField(clientIncorrect.getPhoneNumber());

        Assert.assertEquals("Invalid password format\n", clientSingUpPage.passwordErrorMessage());

        Assert.assertEquals("From 8 to 25 characters", clientSingUpPage.charactersMessage());

        Assert.assertEquals("At least one capital letter", clientSingUpPage.capitalLetterMessage());

        Assert.assertEquals("At least one lowercase letter", clientSingUpPage.lowercaseLetter());

        Assert.assertEquals("At least one special character such as an exclamation mark", clientSingUpPage.markMessage());

        Assert.assertEquals("Passwords match", clientSingUpPage.matchMessage());











    }

}
