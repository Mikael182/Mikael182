package configuration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class getAttribure {

        public static void main(String[] args) {
            System.setProperty("webdriver.chrome.driver", "src/main/resources/Drivers/chromedriver");
            WebDriver driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.manage().window().maximize();
            driver.get("https://pl.wikipedia.org/");
            String atrybut = driver.findElement(By.id("main-page-content")).getAttribute("class");
            System.out.println(atrybut);
            driver.quit();
        }
    }

