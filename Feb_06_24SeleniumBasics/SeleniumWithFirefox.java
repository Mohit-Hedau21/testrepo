package Feb_06_24SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumWithFirefox {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver gecko.driver", " C:\\Users\\user1\\Downloads\\geckodriver-v0.34.0-win32\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("Https://www.Amazon.in");
        driver.get("Https://www.Instagram.com");
        Thread.sleep(1000);
        driver.close();


    }
}
