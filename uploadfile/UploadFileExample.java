package uploadfile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFileExample {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user1\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();          //Upcasting
        driver.get("https://the-internet.herokuapp.com/upload");
        driver.manage().window().maximize();
        WebElement fileupload = driver.findElement(By.id("file-upload"));
        fileupload.sendKeys("C:\\Users\\user1\\Documents\\gray.jpg");
        Thread.sleep(2000);
        driver.findElement(By.id("file-submit")).click();
        Thread.sleep(3000);
        WebElement fileUploadedMessage = driver.findElement(By.xpath("//h3[text()='File Uploaded!']"));
        if(fileupload.isDisplayed()) {
            System.out.println("File Uploaded Succesfully");
        }
        else {
            System.out.println("File Upload Failed");
        }
            driver.close();
    }
}
