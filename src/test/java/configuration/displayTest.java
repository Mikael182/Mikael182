package configuration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class displayTest {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://hotel-testlab.coderslab.pl/en/");
        driver.findElement(By.className("user_login")).click();
        driver.findElement(By.className("is_required")).sendKeys("test1@com.pl");
        driver.findElement(By.className("icon-user")).submit();

        WebElement firstname = driver.findElement(By.xpath("//input[@id='customer_firstname']"));
        if(firstname.isDisplayed()){
            firstname.sendKeys("Michał");
        }else
            System.out.println("Nie ma firstname");
        WebElement lastName = driver.findElement(By.xpath("//input[@id='customer_lastname']"));
        if (lastName.isDisplayed()){
            lastName.sendKeys("Marian");
        }else
            System.out.println("Nie ma lastname");
        WebElement password = driver.findElement(By.xpath("//input[@id='passwd']"));
        if (password.isDisplayed()){
            password.sendKeys("Pass01");
        }else
            System.out.println("Nie ma password");
        driver.findElement(By.xpath("//button[@id='submitAccount']")).submit();
        driver.quit();
    }
}