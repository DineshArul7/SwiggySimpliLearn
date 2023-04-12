package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Common extends Base{

    public WebElement findelementbyxpath(String xpath){
        return   driver.findElement(By.xpath(xpath));
    }

    public void searchbyLocation(String location){
        findelementbyxpath("//input[@type='text']").sendKeys(location);
        findelementbyxpath("//button[2]").click();
    }

    public void verifyTitle(String expectedTitle){
        String actualTitle=driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle);
        logger.info("Validated the Title -" + actualTitle);

    }
}
