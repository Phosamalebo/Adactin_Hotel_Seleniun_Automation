import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TestCaseNine {

    @Test
    public void testcase9(){

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //Navigate to the website
        driver.get("https://adactinhotelapp.com/");

        // Login
        driver.findElement(By.id("username")).sendKeys("Omphe1995");
        driver.findElement(By.id("password")).sendKeys("27IS4Y");
        driver.findElement(By.id("login")).click();


        // Fill in the form
        //Location
        WebElement locationDropdown = driver.findElement(By.id("location"));
        Select selectLocation = new Select(locationDropdown);
        selectLocation.selectByValue("Sydney");

        //Hotels
        WebElement hotelDropdown = driver.findElement(By.id("hotels"));
        Select selectHotel = new Select(hotelDropdown);
        selectHotel.selectByValue("Hotel Creek");

        //Room Type
        WebElement hotelRoomType = driver.findElement(By.id("room_type"));
        Select selectRoomType = new Select(hotelRoomType);
        selectRoomType.selectByValue("Standard");

        // Number of Rooms
        WebElement hotelNumberOfRooms = driver.findElement(By.id("room_nos"));
        Select selectNumberOfRooms = new Select(hotelNumberOfRooms);
        selectNumberOfRooms.selectByValue("1");

        //Adults per Room
        WebElement hotelAdults = driver.findElement(By.id("adult_room"));
        Select selectAdults = new Select(hotelAdults);
        selectAdults.selectByValue("1");

        // Children per Room
        WebElement hotelChildren = driver.findElement(By.id("child_room"));
        Select selectChildren = new Select(hotelChildren);
        selectChildren.selectByValue("0");


        // Generate dynamic dates
        LocalDate today = LocalDate.now();
        LocalDate tomorrow = today.plusDays(1);
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        String checkInDate = today.format(dateFormat);
        String checkOutDate = tomorrow.format(dateFormat);

        // Locate, clear, and set Check In Date
        driver.findElement(By.id("datepick_in")).clear();
        driver.findElement(By.id("datepick_in")).sendKeys(checkInDate);

        // Locate, clear, and set Check Out Date
        driver.findElement(By.id("datepick_out")).clear();
        driver.findElement(By.id("datepick_out")).sendKeys(checkOutDate);

        driver.findElement(By.id("Submit")).click();
        driver.findElement(By.id("radiobutton_0")).click();
        driver.findElement(By.id("continue")).click();

        // Enter details to book
        driver.findElement(By.id("first_name")).sendKeys("Malebo");
        driver.findElement(By.id("last_name")).sendKeys("Phosa");
        driver.findElement(By.id("address")).sendKeys("Ivory");
        driver.findElement(By.id("cc_num")).sendKeys("1234567890987654");


        WebElement hotelCardType = driver.findElement(By.id("cc_type"));
        Select selectCardType = new Select(hotelCardType);
        selectCardType.selectByValue("VISA");

        WebElement hotelMonth = driver.findElement(By.id("cc_exp_month"));
        Select selectMonth = new Select(hotelMonth);
        selectMonth.selectByValue("4");

        WebElement hotelYear = driver.findElement(By.id("cc_exp_year"));
        Select selectYear = new Select(hotelYear);
        selectYear.selectByValue("2025");

        driver.findElement(By.id("cc_cvv")).sendKeys("1234");

        driver.findElement(By.id("book_now")).click();

        // Explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        //Logout
        // Wait until the element is clickable
        WebElement logoutElement = wait.until(ExpectedConditions.elementToBeClickable(By.id("logout")));
        logoutElement.click();


    }

}
