package Tests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class FirstTest {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\trova\\OneDrive\\Escritorio\\QA Automation\\Proyectos Selenium\\FirstTest\\FirstTests\\src\\main\\resources\\Driver\\chromedriver.exe");

        //Instanciar chrome driver
        WebDriver driver = new ChromeDriver();
        //Entrar a Google
        driver.get("https://www.google.com/");

        driver.manage().window().maximize();
        driver.close();
    }
}
