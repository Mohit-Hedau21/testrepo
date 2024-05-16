package windowhandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NeedOfWindowHandling {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user1\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();          //Upcasting
        driver.get("https://letskodeit.com/practice");
        driver.manage().window().maximize();
        driver.findElement(By.id("openwindow")).click();
        System.out.println(driver.getTitle());
        driver.close();

    }
}
