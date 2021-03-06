package Dropdown;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

    public static void main (String [] args){
        System.setProperty("webdriver.chrome.driver","src\\main\\resources\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String url = "https://demoqa.com/select-menu";
        driver.get(url);

        //Declare the object of UI menu

        Select oldStyleMenu =  new Select(driver.findElement(By.id("oldSelectMenu")));

        oldStyleMenu.selectByIndex(1); //By index = Blue -- The list it's a array
        oldStyleMenu.selectByValue("6"); //By value =  White
        oldStyleMenu.selectByVisibleText("Aqua"); //By visible text = Aqua

    }
}
