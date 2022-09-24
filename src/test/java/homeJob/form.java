package homeJob;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import javax.management.relation.Role;
import java.time.Duration;

public class form {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/main/resources/Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        driver.manage().window().maximize();
        driver.get("https://katalon-test.s3.amazonaws.com/demo-aut/dist/html/form.html");
        WebElement firstName = driver.findElement(By.name("firstName"));
        firstName.clear();
        firstName.sendKeys("Karol");
        WebElement lastName = driver.findElement(By.name("lastName"));
        lastName.clear();
        lastName.sendKeys("Kowalski");
        WebElement gender = driver.findElement(By.xpath("/html/body/div[1]/div/form/div[3]/div/div/label[1]/input"));
        gender.click();
        WebElement dateOfBirth = driver.findElement(By.id("dob"));
        dateOfBirth.clear();
        dateOfBirth.sendKeys("05/22/2010");
        WebElement address = driver.findElement(By.id("address"));
        address.clear();
        address.sendKeys("Prosta 51");
        WebElement email = driver.findElement(By.id("email"));
        email.clear();
        email.sendKeys("karol.kowalski@mailinator.com");
        WebElement pass = driver.findElement(By.id("password"));
        pass.clear();
        pass.sendKeys("Pass123");
        WebElement company = driver.findElement(By.id("company"));
        company.clear();
        company.sendKeys("Coders Lab");
        WebElement role = driver.findElement(By.xpath("//*[@id='role']"));
        Select select = new Select(role);
        select.selectByVisibleText("QA");
        WebElement checkbox = driver.findElement(By.xpath("/html/body/div[1]/div/form/div[11]/div/div[2]/label/input"));
        checkbox.click();
        WebElement comment = driver.findElement(By.id("comment"));
        comment.clear();
        comment.sendKeys("To jest mój pierwszy automat testowy");

       // driver.quit();

    }
}
