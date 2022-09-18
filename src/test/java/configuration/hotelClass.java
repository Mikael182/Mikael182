package configuration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hotelClass {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://hotel-testlab.coderslab.pl/en/");

        driver.findElement(By.className("user_login")).click();
        driver.findElement(By.className("is_required")).sendKeys("test@com.pl");
        driver.findElement(By.className("icon-user")).submit();
        driver.quit();
    }
}
