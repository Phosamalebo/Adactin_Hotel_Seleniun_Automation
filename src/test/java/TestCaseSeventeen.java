import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCaseSeventeen {

    @Test
    public void testcase20(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //Navigate to the website
        driver.get("https://adactinhotelapp.com/");

        // Login
        driver.findElement(By.id("username")).sendKeys("Omphe1995");
        driver.findElement(By.id("password")).sendKeys("27IS4Y");
        driver.findElement(By.id("login")).click();

        // Booked Itenary
        driver.findElement(By.linkText("Booked Itinerary")).click();

        //Type in the Order ID
        driver.findElement(By.id("order_id_text")).sendKeys("0XW2KUUA7X");
        driver.findElement(By.id("search_hotel_id")).click();

        driver.findElement(By.cssSelector("input[name='ids[]'][value='1246811']")).click();

        //Cancel order
        driver.findElement(By.cssSelector("input[name='cancelall'][value='Cancel Selected']")).click();

        // Switch to the alert
        Alert alert = driver.switchTo().alert();

        // Click the OK button
        alert.accept();

    }
}
