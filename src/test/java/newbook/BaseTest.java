package newbook;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.logging.Logger;

public class BaseTest {

    protected  static WebDriver driver;
    public static Logger log = Logger.getLogger(BaseTest.class.getName());
    protected HomePage homePage;
    protected SignUpPage signUpPage;


    @BeforeClass
    public static void testBase() {
//        log
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\andri\\Desktop\\chromedriver.exe");

        driver = new ChromeDriver();

        driver.get("https://newbookmodels.com/");

        String actualTitle = driver.getTitle();

        String expectTitle = "Newbook";

        Assert.assertEquals(expectTitle, actualTitle);


    }
//        @AfterClass
//        public static void teerDown() {
//            driver.quit();
//        }

}
