package crossBrowsing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CrossBrowsingHandling {
    public static void main(String[] args) {

        String browserType = "edge";
        WebDriver driver;

        if (browserType.equals("chrome")){
            driver = new ChromeDriver();
        } else if (browserType.equals("firefox")) {
            driver = new FirefoxDriver();
        } else if (browserType.equals("edge")) {
            driver = new EdgeDriver();
        }else {
            throw new RuntimeException("Wrong driver");
        }
        driver.get("https://google.com");
        driver.manage().window().maximize();
        String title = driver.getTitle();
        System.out.println(title);
        driver.quit();
    }
}
