package Feb_06_24SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SeleniumWithEdgeBrowser {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edgedriver.driver", "C:\\Users\\user1\\Downloads\\edgedriver_win32 ");
        WebDriver driver = new EdgeDriver();
        driver.get("https://balajifoods.com");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.manage().window().minimize();
        driver.manage().window().maximize();
        //Thread.sleep(1000);
        driver.close();

    }
}
