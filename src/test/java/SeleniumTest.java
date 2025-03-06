import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class SeleniumTest {

    @Test
    public void Negative(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://adactinhotelapp.com/");
        driver.findElement(By.id("username")).sendKeys("");
        driver.findElement(By.id("password")).sendKeys("");
        driver.findElement(By.id("login")).click();
        driver.quit();

    }

    @Test
    public void Positive(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://adactinhotelapp.com/");
        driver.findElement(By.id("username")).sendKeys("Omphe1995");
        driver.findElement(By.id("password")).sendKeys("27IS4Y");
        driver.findElement(By.id("login")).click();


        //driver.findElement(By.id("location")).click();
        //driver.findElement(By.id("hotels")).click();
        //driver.quit();


        WebElement locationDropdown = driver.findElement(By.id("location"));
        // Create a Select object
        Select selectLocation = new Select(locationDropdown);
        // Select "Hotel Creek" by its value attribute
        selectLocation.selectByValue("London");

        WebElement hotelDropdown = driver.findElement(By.id("hotels"));
        // Create a Select object
        Select selectHotel = new Select(hotelDropdown);
        // Select "Hotel Creek" by its value attribute
        selectHotel.selectByValue("Hotel Creek");

        WebElement hotelRoomType = driver.findElement(By.id("room_type"));
        // Create a Select object
        Select selectRoomType = new Select(hotelRoomType);
        // Select "Hotel Creek" by its value attribute
        selectRoomType.selectByValue("Double");

        WebElement hotelNumberOfRooms = driver.findElement(By.id("room_nos"));
        // Create a Select object
        Select selectNumberOfRooms = new Select(hotelNumberOfRooms);
        // Select "Hotel Creek" by its value attribute
        selectNumberOfRooms.selectByValue("1");

        WebElement hotelAdults = driver.findElement(By.id("adult_room"));
        // Create a Select object
        Select selectAdults = new Select(hotelAdults);
        // Select "Hotel Creek" by its value attribute
        selectAdults.selectByValue("2");


        WebElement hotelChildren = driver.findElement(By.id("child_room"));
        // Create a Select object
        Select selectChildren = new Select(hotelChildren);
        // Select "Hotel Creek" by its value attribute
        selectChildren.selectByValue("1");

        driver.findElement(By.id("Submit")).click();
        driver.findElement(By.id("radiobutton_0")).click();
        driver.findElement(By.id("continue")).click();

        driver.findElement(By.id("first_name")).sendKeys("Malebo");
        driver.findElement(By.id("last_name")).sendKeys("Phosa");
        driver.findElement(By.id("address")).sendKeys("Ivory");
        driver.findElement(By.id("cc_num")).sendKeys("1234567890987654");


        WebElement hotelCardType = driver.findElement(By.id("cc_type"));
        // Create a Select object
        Select selectCardType = new Select(hotelCardType);
        // Select "Hotel Creek" by its value attribute
        selectCardType.selectByValue("VISA");

        WebElement hotelMonth = driver.findElement(By.id("cc_exp_month"));
        // Create a Select object
        Select selectMonth = new Select(hotelMonth);
        // Select "Hotel Creek" by its value attribute
        selectMonth.selectByValue("4");

        WebElement hotelYear = driver.findElement(By.id("cc_exp_year"));
        // Create a Select object
        Select selectYear = new Select(hotelYear);
        // Select "Hotel Creek" by its value attribute
        selectYear.selectByValue("2025");

        driver.findElement(By.id("cc_cvv")).sendKeys("1234");

        driver.findElement(By.id("book_now")).click();

        // Explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        // Wait until the element is clickable
        WebElement itenaryElement = wait.until(ExpectedConditions.elementToBeClickable(By.id("my_itinerary")));
        itenaryElement.click();

        driver.findElement(By.id("btn_id_1295532")).click();

        // Switch to the alert
        Alert alert = driver.switchTo().alert();

        // Click the OK button
        alert.accept();


    }

}