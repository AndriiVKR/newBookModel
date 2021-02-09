package newbook;

import org.junit.Test;

import java.util.logging.Logger;

public class ApplyTest extends BaseTest {

    public static Logger log = Logger.getLogger(ApplyTest.class.getName());

    @Test
    public void testApply() {

        log.info("Starting ApplyTest ...");

        homePage = new HomePage(driver);
        log.info("HomePage is open");

        homePage.clickLogInButton();

        ClientSingInPage clientSingInPage = new ClientSingInPage(driver);
        clientSingInPage.clickSingUpButton();

        ClientSingUpPage clientSingUpPage = new ClientSingUpPage(driver);
        clientSingUpPage.inputFirstNameField("Name");










    }
}
