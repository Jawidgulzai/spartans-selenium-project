package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class Activity2 {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/selenium/dropdown");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

        WebElement element = driver.findElement(By.id("languageSelect"));
        Select webSideLanguageSelect = new Select(element);
       // webSideLanguageSelect.selectByValue("Italian");

        List<WebElement> options = webSideLanguageSelect.getOptions();
        int size = options.size();
        webSideLanguageSelect.selectByIndex(size -1);

    }
}
