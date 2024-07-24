package tables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class TableActivity {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://dev.insurance.tekschool-students.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Login"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username"))).sendKeys("supervisor");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password"))).sendKeys("tek_supervisor");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Sign In']"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Plans"))).click();

        List<WebElement> priceElements = driver.findElements(By.xpath("//table[@class='price-table']//td"));
        for (WebElement element : priceElements) {
            System.out.println(element.getText());
        }
        driver.quit();
    }
}
