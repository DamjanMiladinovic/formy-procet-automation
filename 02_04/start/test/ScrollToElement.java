import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.FindElement;

import javax.swing.*;

public class ScrollToElement {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Damjan\\Desktop\\QALearning\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/scroll");

        WebElement name = driver.findElement(By.id("name"));
        Actions actions = new Actions(driver);
        actions.moveToElement(name);
        name.sendKeys("Damjan");

        WebElement date = driver.findElement(By.id("date"));
        date.sendKeys("01/01/2020");

        driver.quit();
    }
}
