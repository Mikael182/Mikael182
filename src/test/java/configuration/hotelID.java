package configuration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class hotelID {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://hotel-testlab.coderslab.pl/en/");

        driver.findElement(By.id("hotel_location")).sendKeys("Warsaw");
        driver.findElement(By.id("search_room_submit"));
        driver.findElement(By.id("newsletter-input")).sendKeys("test@test.com");



        /*
        WebElement searchLocation = driver.findElement(By.id("hotel_location"));
        searchLocation.clear();
        searchLocation.sendKeys("Warsaw");

        WebElement searchMail = driver.findElement(By.id("newsletter-input"));
        searchMail.clear();
        searchMail.sendKeys("michal.test@com.pl");
        */
        driver.quit();
    }
}
