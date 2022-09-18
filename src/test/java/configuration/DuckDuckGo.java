package configuration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuckDuckGo {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://coderslab.pl/pl");
        driver.get("https://mystore-testlab.coderslab.pl/index.php");
        driver.navigate().back();
        driver.navigate().forward();
        driver.get("https://hotel-testlab.coderslab.pl/en/");
        driver.navigate().back();
        driver.quit();
    }
}
