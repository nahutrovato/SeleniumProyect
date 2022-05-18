package Dropdown;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class multipleSelect {

    public static void main (String [] args){
        System.setProperty("webdriver.chrome.driver","src\\main\\resources\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String url = "https://demoqa.com/select-menu";
        driver.get(url);

        //Declare the object of UI menu
        Select  multipleSelect =  new Select(driver.findElement(By.id("cars")));

        multipleSelect.selectByValue("audi"); //By value =  Audi
        multipleSelect.selectByVisibleText("Volvo");//By text = Volvo
        multipleSelect.selectByIndex(2);//By index = Opel



    }
}
