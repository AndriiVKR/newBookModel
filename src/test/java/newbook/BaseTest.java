package newbook;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    protected  static WebDriver driver;


    @BeforeClass
    public static void testBase() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\andri\\Desktop\\chromedriver.exe");

        driver = new ChromeDriver();

        driver.get("https://newbookmodels.com/");

        String actualTitle = driver.getTitle();

        String expectTitle = "Newbook";

        Assert.assertEquals(expectTitle, actualTitle);


    }
        @AfterClass
        public static void teerDown() {
            driver.quit();
        }

}
