package Feb_06_24SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasicOfWebDriver {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions chromeOptions = new ChromeOptions();
       //chromeOptions.setBinary("C:\\Users\\user1\\Downloads\\chrome-win64.zip\\chrome-win64\\chrome.exe");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user1\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver(chromeOptions);          //Upcasting
       // driver = new EdgeDriver();
      //  driver = new FirefoxDriver();
        driver.get("https://www.facebook.com/");

        /*String title = driver.getTitle();
        System.out.println(title);

        String url = driver.getCurrentUrl();
        System.out.println(url);

        String pageSource = driver.getPageSource();*/
        Thread.sleep(5000);
        driver.close();

    }
}
