package homeJob;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class signIn {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/main/resources/Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://mystore-testlab.coderslab.pl/index.php");
        driver.findElement(By.cssSelector("span.hidden-sm-down")).click();
        driver.findElement(By.cssSelector("div.no-account"));
        driver.navigate().back();
        driver.navigate().back();
        driver.quit();
    }
}
