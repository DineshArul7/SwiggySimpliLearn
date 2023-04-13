package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.ITest;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class SiggyTest extends Base
{
Common common=new Common();


    public void findstoreswithLocation(){
        logger.info("Deekay");
        logger.error("Devil");
        logger.debug("Muthu");
        common.searchbyLocation("Mettukuppam");
        common.verifyTitle("Order food online from India's best food delivery service. Order from restaurants near you");
    }


    public void findproducts(){
        common.searchbyLocation("Mettukuppam");
        common.searchForProducts("Biriyani");
        common.verifyTitle("Order food online from India's best food delivery service. Order from restaurants near you");
    }
    @Test
    public void addProductToCartTest(){
        common.searchbyLocation("Mettukuppam");
        common.searchForProducts("Biriyani");
        common.verifyTitle("Order food online from India's best food delivery service. Order from restaurants near you");
        common.addProductToCart();
    }

}
