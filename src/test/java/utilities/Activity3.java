package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class Activity3 {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://tek-retail-ui.azurewebsites.net/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

        driver.findElement(By.xpath("//p[text()='Accessories']")).click();
        driver.findElement(By.xpath("((//img[@class='image'])[3]")).submit();

        WebElement element = driver.findElement(By.className("product__select"));
        Select keyboardElement = new Select(element);
        keyboardElement.selectByValue("5");

    }
}
