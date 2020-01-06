package newbook;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

import java.util.logging.Logger;

public class SignUpTest extends BaseTest {

    private static Logger log = Logger.getLogger(SignUpTest.class.getName());

    @Test
    public void testSignUp() {

        log.info("Starting test SignUp....");

       homePage = new HomePage(driver);
       log.info("HomePage is opened");

       signUpPage = homePage.clickSignUpButton();
       log.info("User Clicked on the SignUpButton on HomePage, and go to next page");

//       driver.switchTo().frame(driver.findElement(By.cssSelector(".SignupForm__right--3n_f3")));

       signUpPage.nextButtonClick();
       log.info("User clicked Next button, for appear error messages");

       String error1 = signUpPage.errorFirstNameField();
       Assert.assertEquals("Required", error1);
       log.info("Compare error message for FirstName field");

    }


}
