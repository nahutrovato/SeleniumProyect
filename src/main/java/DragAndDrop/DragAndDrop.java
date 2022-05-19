package DragAndDrop;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

    public static void main (String [] args) {
        System.setProperty("webdriver.chrome.driver","src\\main\\resources\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String url = "https://demoqa.com/droppable";
        driver.get(url);

        //Instantiate the actions class
        Actions action = new Actions(driver);

        //Define the from and to
        WebElement from = driver.findElement(By.cssSelector("#draggable"));
        WebElement to = driver.findElement(By.id("droppable"));

        //Drag and drop
        action.dragAndDrop(from, to).build().perform();




    }
}
