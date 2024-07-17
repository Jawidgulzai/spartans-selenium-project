package locators.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class xpath {
    public static void main(String[] args) {

        // go to this website https://tek-retail-ui.azurewebsites.net and find me the xpath for Smart Home

        WebDriver driver = new ChromeDriver();
        driver.get("https://tek-retail-ui.azurewebsites.net/");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        By locator = By.xpath(" /html/body/div/div[1]/div[1]/div[3]/div/div[2]/div[1]/div[2]/h1");
        String text = driver.findElement(locator).getText();
        System.out.println(text);

    }
}