package configuration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class hotelCSS {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://hotel-testlab.coderslab.pl/en/");
        driver.findElement(By.className("user_login")).click();
        driver.findElement(By.id("email")).sendKeys("test@com.pl");
        driver.findElement(By.id("passwd")).sendKeys("Test01");
        driver.findElement(By.id("SubmitLogin")).click();

        driver.findElement(By.cssSelector("i.icon-building"));
        driver.findElement(By.cssSelector("i.icon-user"));
        driver.quit();
    }
}