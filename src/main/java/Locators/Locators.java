package Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Locators {

    public static void main(String [] args) {
        System.setProperty("webdriver.chrome.driver","src\\main\\resources\\Driver\\chromedriver.exe");

        //Initialize the webdriver
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/");

        //Credentials
        String username = "standard_user";
        String password = "secret_sauce";

        //Locators by ID
        WebElement inputUserName = driver.findElement(By.id("user-name"));
        WebElement inputPassword = driver.findElement(By.id("password"));
        WebElement loginBtn = driver.findElement(By.id("login-button"));

        //Login
        inputUserName.sendKeys(username);
        inputPassword.sendKeys(password);
        loginBtn.click();

        //Into the page
        WebElement title = driver.findElement(By.className("title"));



    }
}
