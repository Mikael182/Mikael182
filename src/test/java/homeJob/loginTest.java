package homeJob;

import Test.loginPage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;


public class loginTest {
    private static WebDriver driver;

    @Before
        public void setup(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://mystore-testlab.coderslab.pl/index.php?controller=authentication");
    }
    @After
            public void cleanUp() {
        driver.quit();
    }

    @Test
    public void shouldLoginWithProperCredentials () {
    loginPage loginPage = new loginPage(driver);
    loginPage.loginAs("michal.dobrzycki@coderslab.pl","CodersLab");

    Assert.assertEquals("Automated Tester",loginPage.getLogedUserName());
    }
}
