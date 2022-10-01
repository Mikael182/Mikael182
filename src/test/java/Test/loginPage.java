package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
    private WebDriver driver;
    public loginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(name = "email")
   private WebElement loginInput;
    @FindBy(name = "password")
    private WebElement passwordInput;
    @FindBy(id = "submit-login")
    private WebElement signInButton;
    @FindBy(xpath = "//a[@class='account']")
    private WebElement userName;

    public void loginAs(String email,String password){
        loginInput.clear();
        loginInput.sendKeys(email);
        passwordInput.clear();
        passwordInput.sendKeys(password);
        signInButton.click();
         // WebElement userName = driver.findElement(By.xpath("//a[@class='account']"));
        // System.out.println(userName.getText());
    }
    public String getLogedUserName(){
        return userName.getText();
    }
}
