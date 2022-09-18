package configuration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hotelName {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://hotel-testlab.coderslab.pl/en/");

        driver.findElement(By.name("hotel_location")).sendKeys("Warsaw");
        driver.findElement(By.name("search_room_submit"));
        driver.findElement(By.name("newsletter-input")).sendKeys("test@test.com");
        driver.findElement(By.name("submitNewsletter")).submit();
        //
    }
}
