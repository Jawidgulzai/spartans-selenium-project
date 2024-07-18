package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity1 {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://tek-retail-ui.azurewebsites.net/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        boolean signInBtnIsEnabled = driver.findElement(By.cssSelector("#signinLink")).isEnabled();
        if (signInBtnIsEnabled){
            System.out.println("Sign in button is enabled");
        }else {
            System.out.println("Sign in button is enabled");
        }

        WebElement signInLink = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#signinLink")));
        signInLink.click();





        driver.quit();

    }
}
