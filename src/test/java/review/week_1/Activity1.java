package review.week_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity1 {
    public static void main(String[] args) throws InterruptedException {

        /*
        In the Retail app, click on sign in then click on Create new Account,
        then fill up the form and sign up. Expectation is to Create a new Account.
        Once an account is created, make sure profile picture is displayed. (isDisplayed)
        And print result of isDisplayed method.
        Push to your repository
         */

        WebDriver driver = new ChromeDriver();
        Thread.sleep(3000);
        driver.get("https://tek-retail-ui.azurewebsites.net/");
        driver.manage().window().maximize();

        By signInLocator = By.linkText("Sign in");
        WebElement signInElement = driver.findElement(signInLocator);
        signInElement.click();

        By createNewAccountLocator = By.linkText("Create New Account");
        WebElement createNewAccountElement = driver.findElement(createNewAccountLocator);
        createNewAccountElement.click();

        By inputNameLocator = By.id("nameInput");
        WebElement inputNameElement = driver.findElement(inputNameLocator);
        inputNameElement.sendKeys("Jawid");

        String emailPrefix = "jawid_spartans";
        int number = (int) (Math.random() * 100);
        String randomEmail = emailPrefix + number + "@gmail.com";
        inputNameElement.sendKeys(randomEmail);

        By inputEmailLocator = By.id("emailInput");
        WebElement inputEmailElement = driver.findElement(inputEmailLocator);
        inputEmailElement.sendKeys(randomEmail);

        By inputPasswordLocator = By.id("passwordInput");
        WebElement inputPasswordElement = driver.findElement(inputPasswordLocator);
        inputPasswordElement.sendKeys("Jawid4321@$$");

        By confirmPasswordInputLocator = By.id("confirmPasswordInput");
        WebElement confirmPasswordInputElement = driver.findElement(confirmPasswordInputLocator);
        confirmPasswordInputElement.sendKeys("Jawid4321@$$");

        By signupBtnLocator = By.id("signupBtn");
        WebElement signupBtnElement = driver.findElement(signupBtnLocator);
        signupBtnElement.click();

        Thread.sleep(3000);
        By profileImageLocator = By.id("profileImage");
        WebElement profileImageElement = driver.findElement(profileImageLocator);
        boolean profile = profileImageElement.isDisplayed();
        System.out.println(profile);

//        Thread.sleep(3000);
//        By profileImageLocator1 = By.id("profileImage");
//        WebElement profileImageElement1 = driver.findElement(profileImageLocator1);
//        boolean isProfileImageElementIsDisplayed = profileImageElement1.isDisplayed();
//
//
//
//        boolean profilePicture = driver.findElement(By.id("profileImage")).isDisplayed();
//        if (profilePicture) System.out.println("Test Passed...");
//        else System.out.println("Test Failed...");
//
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        WebElement profileImage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("profileImage")));
//        profileImage.isDisplayed();
//        if(profileImage.isDisplayed()){
//            System.out.println("pic is present");
//        }else { System.out.println("pic is not presnt ");
//        }

        driver.quit();

    }
}
