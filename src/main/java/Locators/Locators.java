package Locators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Locators {

    public static void main(String [] args) {
        System.setProperty("webdriver.chrome.driver","src\\main\\resources\\Driver\\chromedriver.exe");

        //Initialize the webdriver
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/");



    }
}
