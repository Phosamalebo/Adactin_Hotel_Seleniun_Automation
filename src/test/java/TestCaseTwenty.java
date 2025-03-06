import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCaseTwenty {

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

        // Search hotel
        driver.findElement(By.linkText("Search Hotel")).click();

        // Booked Itenary
        driver.findElement(By.linkText("Booked Itinerary")).click();

        // Change password
        driver.findElement(By.linkText("Change Password")).click();

    }
}
