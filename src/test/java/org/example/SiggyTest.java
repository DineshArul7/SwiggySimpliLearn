package org.example;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class SiggyTest extends Base
{


    @Test
    public void findstoreswithLocation(){
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Mettukuppam");
        driver.findElement(By.xpath("//button[2]")).click();
    }

    @Test
    public void findproducts(){
        findelementbyxpath("//*[text()='Search']").click();
        findelementbyxpath("//input[@type='text']").sendKeys("biriyani");
        findelementbyxpath("//button[@data-testid='autosuggest-item']").click();
        //Deekay
        //Devil
    }

}
