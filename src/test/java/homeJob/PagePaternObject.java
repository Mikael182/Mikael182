package homeJob;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class PagePaternObject {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/main/resources/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://mystore-testlab.coderslab.pl/index.php?controller=authentication");

        WebElement loginInput = driver.findElement(By.name("email"));
        loginInput.clear();
        loginInput.sendKeys("michal.dobrzycki@coderslab.pl");

        WebElement passwordInput = driver.findElement(By.name("password"));
        passwordInput.clear();
        passwordInput.sendKeys("CodersLab");

        WebElement signInButton = driver.findElement(By.id("submit-login"));
        signInButton.click();

        WebElement userName = driver.findElement(By.xpath("//a[@class='account']"));
        // System.out.println(userName.getText());
        driver.quit();
    }
}
