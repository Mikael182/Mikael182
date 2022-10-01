package hotelPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelRegister {
    private WebDriver driver;

    public HotelRegister(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(id = "email_create")
    private WebElement isRequired;
    @FindBy(className = "icon-user")
    private WebElement iconUser;

    public void signIn(String email){
        isRequired.sendKeys(email);
        iconUser.submit();

    }
}
