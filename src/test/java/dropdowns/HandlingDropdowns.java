package dropdowns;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class HandlingDropdowns {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://tek-retail-ui.azurewebsites.net/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));

    }
}
