package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.util.TimeUtils;

import java.sql.Time;
import java.time.Duration;

/**
 * Hello world!
 *
 */
public class Base
{
   static WebDriver driver;

    public void initializeDriver(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://www.swiggy.com/");
    }

    public WebElement findelementbyxpath(String xpath){
      return   driver.findElement(By.xpath(xpath));
    }
}
