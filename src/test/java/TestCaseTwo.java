import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TestCaseTwo {

   @Test
    public void testcase2(){

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


       // Get current date
       LocalDate today = LocalDate.now();

       // Set Check-in date (7 days from today)
       String checkInDate = today.plusDays(7).format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));

       // Set Check-out date (5 days from today)
       String checkOutDate = today.plusDays(5).format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));

       // Clear the fields and send the new values
       driver.findElement(By.id("datepick_in")).clear();
       driver.findElement(By.id("datepick_in")).sendKeys(checkInDate);

       driver.findElement(By.id("datepick_out")).clear();
       driver.findElement(By.id("datepick_out")).sendKeys(checkOutDate);

       new Select(driver.findElement(By.id("adult_room"))).selectByValue("2");
       new Select(driver.findElement(By.id("child_room"))).selectByValue("1");


       driver.findElement(By.id("Submit")).click();


    }
}
