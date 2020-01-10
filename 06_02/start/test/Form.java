import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.junit.Assert.assertEquals;

public class Form {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Damjan\\Desktop\\QALearning\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/form");

        FormPage formpage = new FormPage();

        submitForm(driver);

        waitForAlertBanner(driver);

        assertEquals("The form was successfully submitted!", getAlertBannerTexty(driver));

        driver.quit();
    }



    public static void waitForAlertBanner(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions
                .visibilityOfElementLocated(By.className("alert")));
    }

    public static String getAlertBannerTexty(WebDriver driver){
        return driver.findElement(By.className("alert")).getText();
    }
}
