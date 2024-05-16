package ActionsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class ClickAndHold {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user1\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();          //Upcasting
        driver.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");
        driver.manage().window().maximize();
        WebElement elementA = driver.findElement(By.xpath("//li[text()='A']"));
        Actions actions = new Actions(driver);
        actions.clickAndHold(elementA);
        actions.pause(Duration.ofSeconds(5));
        actions.release();
        actions.build();
        actions.perform();
        Thread.sleep(3000);
        driver.close();
    }
}
