package hotelPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInUser {
        private WebDriver driver;

        public LogInUser(WebDriver driver) {
            this.driver = driver;
            PageFactory.initElements(driver, this);
        }
        @FindBy(id = "email")
        private WebElement isRequired;
        @FindBy(id = "passwd")
        private WebElement password;
        @FindBy (id = "SubmitLogin")
        private WebElement loginButton;

        public void signIn(String email,String passWord){
            isRequired.sendKeys(email);
            password.sendKeys(passWord);
            loginButton.click();
            driver.navigate().to("https://hotel-testlab.coderslab.pl");
        }
    }
