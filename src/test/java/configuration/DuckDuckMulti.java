package configuration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuckDuckMulti {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.get("https://duckduckgo.com/");
        WebElement searchInput = driver.findElement(By.name("q"));
        searchInput.clear();
        searchInput.sendKeys("Barcelona");
        searchInput.submit();

        driver.quit();
    }
}
