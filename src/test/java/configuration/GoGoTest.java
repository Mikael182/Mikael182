package configuration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoGoTest {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/main/resources/Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();//stworzenie sterownika przeglądarki
        driver.manage().window().maximize();//maksymalizacja okna
        driver.get("https://duckduckgo.com/");//otwarcie okna przeglądarki
        WebElement searchboxInput = driver.findElement(By.id("searchbox_input"));//znajdż element na stronie po id
        //xpath //input[@id = 'as
        searchboxInput.clear();
        searchboxInput.sendKeys("Coderslab");
        searchboxInput.submit();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
    }
}
