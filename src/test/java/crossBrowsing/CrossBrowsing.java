package crossBrowsing;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class CrossBrowsing {
    public static void main(String[] args) {

//        ChromeDriver chromeDriver = new ChromeDriver();
//        SafariDriver safariDriver = new SafariDriver();
//        FirefoxDriver firefoxDriver = new FirefoxDriver();

        EdgeDriver edgeDriver = new EdgeDriver();
        edgeDriver.get("https://google.com");
        edgeDriver.manage().window().maximize();
        String title = edgeDriver.getTitle();
        System.out.println(title);
        edgeDriver.quit();


    }
}
