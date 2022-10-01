package hotelPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelUser {
    private WebDriver driver;
    public HotelUser(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//input[@id='customer_firstname']")
    private WebElement firstname;
    @FindBy(xpath = "//input[@id='customer_lastname']")
    private WebElement lastname;
    @FindBy(id = "passwd")
    private WebElement password;
    @FindBy(name = "submitAccount")
    private WebElement submitAccount;

    public void signInData(String firstName, String lastName, String passWord) {
        firstname.sendKeys(firstName);
        lastname.sendKeys(lastName);
        //driver.findElement(By.xpath("//input[@id='email']"));
        password.sendKeys(passWord);
        submitAccount.click();
    }
    public String messageOK (){
        WebElement userText = driver.findElement(By.cssSelector("p.alert"));
        return userText.getText();
    }
}
