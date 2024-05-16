package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrameWithId {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user1\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();          //Upcasting
        driver.get("https://demoqa.com/frames");
        driver.manage().window().maximize();

        //By using id
        driver.switchTo().frame("frame1");
        WebElement element = driver.findElement(By.xpath("//h1[text()='This is a sample page']"));
        System.out.println(element.getText());
        driver.close();

    }
}
