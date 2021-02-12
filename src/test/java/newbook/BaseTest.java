package newbook;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    protected static WebDriver driver;
    protected static HomePage homePage;
    protected static ClientSingUpPage clientSingUpPage;
    protected static SignUpPage signUpPage;
    protected static ClientSingInPage clientSingInPage;
    protected static Client clientCorrect;
    protected static Client clientIncorrect;




    @BeforeClass
    public static void setUp() {

        System.setProperty("webdriver.chrome.driver", "D:\\test\\java\\chromedriver1.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://newbookmodels.com/");
        String actualTitle = driver.getTitle();
        String expectedTitle = "Newbook";
        Assert.assertEquals(expectedTitle, actualTitle);
        clientCorrect = new Client("Ivan", "Ivanov", "test.16av@gmail.com",
                "Password16", "123 333 3333");

        clientIncorrect = new Client("First", "Last", "email@email.com",
                "password","1111111111");


    }

//    @AfterClass
//    public static void tearDown() {
//        driver.quit();
//    }




}

