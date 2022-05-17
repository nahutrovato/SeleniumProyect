package Locators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class FindElements {

    public static void main(String [] args) {
        String url = "https://www.saucedemo.com/";

        System.setProperty("webdriver.chrome.driver","src\\main\\resources\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get(url);

    }
}
