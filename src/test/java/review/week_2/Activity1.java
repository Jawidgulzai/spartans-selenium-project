package review.week_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class Activity1 {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://tek-retail-ui.azurewebsites.net/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));

        driver.findElement(By.linkText("Sign in")).click();
        driver.findElement(By.id("email")).sendKeys("jawid_g66@gmail.com");
        driver.findElement(By.id("password")).sendKeys("Jawid123$");
        driver.findElement(By.id("loginBtn")).click();
        driver.findElement(By.id("accountLink")).click();
        driver.findElement(By.id("personalPhoneInput")).sendKeys("9169229222");
        driver.findElement(By.id("personalUpdateBtn")).click();
        boolean popUpMessage = driver.findElement(By.xpath("#vjq7dnc > div.Toastify__toast-body > div:nth-child(2)")).isDisplayed();
        System.out.println(popUpMessage);




        //driver.quit();
    }
}
