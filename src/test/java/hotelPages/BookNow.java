package hotelPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BookNow {
    private WebDriver driver;

    public BookNow (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "hotel_location")
    private WebElement hotelLocation;
    @FindBy(id = "hotel_cat_name")
    private WebElement hotelCat;
    @FindBy (className = "hotel_name")
    private WebElement hotelPremium;
    @FindBy(id = "check_in_time")
    private WebElement checkIn;
    @FindBy(id = "check_out_time")
    private WebElement checkOut;
    @FindBy(id = "search_room_submit")
    private WebElement submit;
    @FindBy (xpath = "//span[contains(text(),'Book Now')]")
    private WebElement buttonBook;

    public void Search(String location, String checkin, String checkout) {
        hotelLocation.sendKeys(location);
        hotelCat.click();
        hotelPremium.click();
        // Select select = new Select(hotelPremium);
        //select.selectByVisibleText("The Hotel Prime");
        checkIn.sendKeys(checkin);
        checkOut.sendKeys(checkout);
        submit.click();
        buttonBook.click();
    }
    public String getCartLayerText() {
        WebElement cart = driver.findElement(By.id("layer_cart"));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(cart));
        return cart.getText();
    }
}
