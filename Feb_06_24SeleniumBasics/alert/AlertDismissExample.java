package Feb_06_24SeleniumBasics.alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDismissExample {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user1\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();          //Upcasting
        driver.get("https://www.letskodeit.com/practice");
        driver.manage().window().maximize();
        //driver.findElement(By.id("alertbtn")).click();
        driver.findElement(By.id("confirmbtn")).click();

        Alert alert = driver.switchTo().alert();
        alert.dismiss();
        Thread.sleep(3000);
        driver.close();
    }

}
