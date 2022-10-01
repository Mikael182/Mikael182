package hotelPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HotelSearch {
    private WebDriver driver;

    public HotelSearch(WebDriver driver) {
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

    public void Search(String location, String checkin, String checkout) {
        hotelLocation.sendKeys(location);
        hotelCat.click();
        hotelPremium.click();
       // Select select = new Select(hotelPremium);
        //select.selectByVisibleText("The Hotel Prime");
        checkIn.sendKeys(checkin);
        checkOut.sendKeys(checkout);
        submit.click();
    }

    public String searchRoomsTxt() {
        WebElement searchRoom = driver.findElement(By.xpath("//div[@class='filter_header']/div/p"));
        return searchRoom.getText();
    }
}
