package Feb_06_24SeleniumBasics;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.List;

public class CssSelectorWithId {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user1\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();          //Upcasting
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().window().maximize();

        WebElement element = driver.findElement(By.cssSelector("input#login1"));
       // WebElement element = driver.findElement(By.cssSelector("input[id='login1']"));
        element.sendKeys("Hey Wassup");
        Thread.sleep(2000);
        driver.close();
    }
}
