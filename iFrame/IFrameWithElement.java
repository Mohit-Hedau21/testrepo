package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrameWithElement {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user1\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();          //Upcasting
        driver.get("https://demoqa.com/frames");
        driver.manage().window().maximize();

        //By using WebElement
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='frame1']")));
        WebElement element = driver.findElement(By.xpath("//h1[text='This is a sample page']"));
        System.out.println(element.getText());

        driver.switchTo().parentFrame();
        WebElement element2 = driver.findElement(By.xpath("//h1[text()='Frames']"));
        System.out.println(element2.getText());
        driver.close();
    }
}
