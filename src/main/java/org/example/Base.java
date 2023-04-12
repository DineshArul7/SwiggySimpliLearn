package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

/**
 * Hello world!
 *
 */
public class Base
{
   static WebDriver driver;
   static Logger logger;

    public void initializeDriver(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://www.swiggy.com/");
    }

    public void tearDownDriver(){
        driver.quit();;
    }



    public void initializeLogger(String testName){
        logger= LogManager.getLogger(getClass().getName());
    }
}
