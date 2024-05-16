package Cookies;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class DeleteCookies {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user1\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();          //Upcasting
        driver.get("https://www.infosys.com");
        driver.manage().window().maximize();

        Cookie cookie = new Cookie("Company", "AMG SPICES");
        driver.manage().getCookies();
        Set<Cookie> allCookies2 = driver.manage().getCookies();


        System.out.println("Before Deleting Cookies");
        for (Cookie c : allCookies2) {
            System.out.println(c);
        }
        System.out.println("*************************");
        System.out.println("After Deleting Cookies");
        driver.manage().deleteCookie(cookie);
        System.out.println(driver.manage().getCookieNamed("Company"));
        driver.close();
    }
}
