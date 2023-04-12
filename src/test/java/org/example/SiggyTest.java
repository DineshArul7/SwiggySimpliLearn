package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class SiggyTest extends Base
{
Common common=new Common();
    @Test
    public void findstoreswithLocation(){
        Logger logger1= LogManager.getLogger(getClass().getName());
        logger1.info("Deekay");
        logger1.error("Devil");
        logger1.debug("Muthu");
       // common.searchbyLocation("Mettukuppam");
        // common.verifyTitle("Order food online from India's best food delivery service. Order from restaurants near you");
    }

    @Test
    public void findproducts(){
        common.findelementbyxpath("//*[text()='Search']").click();
        common.findelementbyxpath("//input[@type='text']").sendKeys("biriyani");
        common.findelementbyxpath("//button[@data-testid='autosuggest-item']").click();
    }

}
