package Test;

import hotelPages.*;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class UserRegisterTest {

    private static WebDriver driver;

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/Drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.get("https://hotel-testlab.coderslab.pl");
    }

    @After
    public void cleanUp() {
       driver.quit();
}
    @Test
    public void userRegistration() {
        MainPage mainPage = new MainPage(driver);
        mainPage.signInButton();


        HotelRegister hotelRegister = new HotelRegister(driver);
        hotelRegister.signIn("michal" + System.currentTimeMillis() + "@com.pl");

        HotelUser hotelUser = new HotelUser(driver);
        hotelUser.signInData("Michał", "Malolepszy", "Pass" + System.currentTimeMillis());

        Assert.assertEquals("Your account has been created.", hotelUser.messageOK());
    }
        @Test
                public void logInUserCreated(){
            MainPage mainPage = new MainPage(driver);
            mainPage.signInButton();

            LogInUser logInUser = new LogInUser(driver);
            logInUser.signIn("Michal01@com.pl","Michal01");

            HotelSearch hotelSearch = new HotelSearch(driver);
            hotelSearch.Search("London","14-10-2022","14-11-2022");

          Assert.assertEquals("Search Rooms",hotelSearch.searchRoomsTxt());
        }
        @Test
              public void bookNowText(){

            BookNow bookNow = new BookNow(driver);
            bookNow.Search("London","14-10-2022","14-11-2022");
            Assert.assertTrue(bookNow.getCartLayerText().contains("Room successfully added to your cart"));

           // Assert.assertEquals("Room successfully added to your cart",bookNow.getCartLayerText());
        }
    }
