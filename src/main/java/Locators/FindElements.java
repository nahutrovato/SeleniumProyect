package Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;


public class FindElements {

    public static void main(String [] args) {
        String url = "https://www.saucedemo.com/";

        System.setProperty("webdriver.chrome.driver","src\\main\\resources\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get(url);

        //Credentials
        String username = "standard_user";
        String password = "secret_sauce";
        WebElement loginBtn = driver.findElement(By.id("login-button"));

        List<String> credentials = new ArrayList<>();
        credentials.add(username);
        credentials.add(password);

        List<WebElement> inputs = driver.findElements(By.tagName("input"));
        System.out.println("Cantidad de elementos de tipo input: " +inputs.size());

        for (int i=0 ; i<inputs.size(); i++) {
            if(i == 2) {
                loginBtn.click();
            }
            inputs.get(i).sendKeys(credentials.get(i));


        }

    }
}
